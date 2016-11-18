package org.home.project;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
public class TestBean implements Processor {
	public void process(Exchange exchange) throws Exception {
		PDFTextStripper pdfStripper = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		File file = new File("/home/rjakubco/Downloads/pdf/273200630_20161031_10_MCZB.pdf");
		try {
			PDFParser parser = new PDFParser(new FileInputStream(file));
			parser.parse();
			cosDoc = parser.getDocument();
			pdfStripper = new PDFTextStripper();
			pdDoc = new PDDocument(cosDoc);
			exchange.getOut().setBody(pdDoc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
