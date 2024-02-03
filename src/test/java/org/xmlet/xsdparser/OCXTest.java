package org.xmlet.xsdparser;

import org.junit.Test;
import org.xmlet.xsdparser.core.XsdParser;
import org.xmlet.xsdparser.xsdelements.enums.FormEnum;
import org.xmlet.xsdparser.xsdelements.exceptions.ParsingException;

import java.io.File;


public class OCXTest {


    @Test()
    public void testParseOCX(){

        // ensure the OCX Schema is parserd without null pointer exception

        File xsdFileIn = new File("src/test/resources/issue_50/OCX_Schema.xsd");

        XsdParser parser = new XsdParser(xsdFileIn.getAbsolutePath());

    }
}
