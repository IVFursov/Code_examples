package org.example;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class SaxParser {
    private static ArrayList<Child> child = new ArrayList<>();

         public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        NodeParser handler = new NodeParser();
        parser.parse(new File("ParseXML/test-files.xml"), handler);

        for (Child child : children)
            System.out.println(String.format("Файл: %s", child.getName()));
         }
}
