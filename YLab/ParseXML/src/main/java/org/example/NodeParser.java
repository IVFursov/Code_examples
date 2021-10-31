package org.example;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class NodeParser extends DefaultHandler {
    private String name, child, lastElementName;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            // Тут будет логика реакции на начало элемента
            if (qName.equals("is-file=true")) {
                String name = attributes.getValue("name");
                child.add(new Child(name));
            }
    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String information = new String(ch, start, length);

        information = information.replace("\n", "").trim();

        if (!information.isEmpty()) {
            if (lastElementName.equals("name"))
                name = information;
        }
    }
    }
