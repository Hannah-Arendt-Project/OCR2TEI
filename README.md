# OCR2TEI

This tool converts Finereader extended XML documents into a basic TEI file for further editing. It maps some basic format declartion and uncertain characters into the TEI structure. 

# Usage

Download the release from the release tab, open the command line and execute 
`java -jar ocr2tei.jar` with the following options

```
Usage: Finereader XML to basic TEI converter [command] [command options]
  Commands:
    file      Process a single XML File
      Usage: file [options]
        Options:
          -f, --foreign
            Add foreign elements to output
            Default: false
          -h, --help
            print this message
        * -i, --input
            The source XML OCR File from ABBYY
          -lb, --linebreak
            Add line breaks to p elements
            Default: true
        * -o, --output
            The path and filename to the generated TEI output file

    dir      Process recursively a whole directory
      Usage: dir [options]
        Options:
        * -d, --dir
            The start path of the directory for processing the files
          -f, --foreign
            Add foreign elements to output
            Default: false
          -h, --help
            print this message
          -lb, --nolinebreak
            Add line break to p elements
            Default: true
          -p, --pattern
            The regex pattern for matching the OCR xml files
            Default: ocr_(.*).xml
          -s, --specific
            Do very project specific directory scanning (outside of this 
            project do NOT set this option to true)
            Default: false
```

Example for processing a single file 
`java -jar ocr2tei.jar file -i input.xml -o output.xml`

Example for processing a whole directory 
`java -jar ocr2tei.jar dir -i -d /path/to/directory -p "(.*).xml"`

Note that the pattern uses a [Java regular expression](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html), a simple *.xml will NOT work.

The linebreak element just controls the output of the XML p blocks. Semantically they are the same.

**No line break**

```
<p>This is the first line. This is the second line</p>
```

**no line breaks**

```
<p>This is the first line. 
This is the second line</p>
```

## Sample input files

The vendor provides a zip file with some [samples](https://abbyy.technology/_media/en:features:ocr:abbyy_xml_sample_collection.zip). Extract it and use any of the *DemoImage1_ABBYY_Char** files. The Basic file is not supported (see next headline). If you want to process the directory, use the option -p `"DemoImage1_ABBYY(.*).xml"` as pattern.

# Supported formats

This tool works only if the ocr xml has been generated with the character by character generation, so not with the basic format.

Currently only text elements get processed, image and table elements are ignored. The following text attributes are transfered to TEI:

* italic -> `<hi rend="italic"> italic></hi>`
* bold  -> `<hi rend="bold">bold></hi>`
* underline  -> `<hi rend="underline">underline></hi>`
* strikethrough  -> `<hi rend="strikethrough">strikethrough></hi>`
* super `<hi rend="super">super</hi>`
* unclear characters -> `<unclear cert="unknown" reason="illegible">l</unclear>`
* document language -> `<TEI lang="en">`
* other languages as foreign element if -f parameter has been set -> `<foreign lang="lat">...</foreign>`


# Building

Just call `mvn` to build it.

# Extending and Structure

This tool uses JAXB to read and write the XML files. A newer input XSD can be added by using

`xjc -d ocr2tei/src/main/java -p de.sub.goettingen.arendt.input.generated  FineReader10-schema-v1.xml`

The output does not contain the whole TEI schema. Instead a simple outputTemplate.xml has been created (see resources folder), an XSD has been generated from the XML and the JAXB classes have been created with

`xjc -d ocr2tei/src/main/java -p de.sub.goettingen.arendt.output.generated  outputTemplate.xsd`

Afterwards you have to adapt the classes under de.sub.goettingen.arendt.ocrmapping for the changed structure.

# New for v1.1

 * Support for XPath expression before processing
 * extracting of main document language
 * each TEI document gets an ID
 * support for foreign element if specified via command line option
 * improved whitespace handling. The OCR output is missing some whitespaces, this version tries the best to fix the whitespaces 

# Further information

The documentation of the Finereader XML File can be found [here](https://abbyy.technology/en:features:ocr:xml), a examplanation of the schema is located [here](https://ocrsdk.com/documentation/specifications/xml-scheme-recognized-document/).

# License

Apache 2.0.

# Credits

<a href="http://www.sub.uni-goettingen.de"><img src="https://raw.githubusercontent.com/Hannah-Arendt-Project/TextGridHttpServerPlugin/master/gh-imgs/sub-logo.jpg" width="300"/></a>
