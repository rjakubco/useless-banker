package org.home.project.parsers;

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
 * Will not used right now... too much work...
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
public class PdfParser implements Processor{

	public String parsePdf(String filePath) throws IOException {
		PDFTextStripper pdfStripper = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		File file = new File(filePath);

		PDFParser parser = new PDFParser(new FileInputStream(file));
		parser.parse();
		cosDoc = parser.getDocument();
		pdfStripper = new PDFTextStripper();
		pdDoc = new PDDocument(cosDoc);
		String parsedText = pdfStripper.getText(pdDoc);
		return parsedText;
	}

	public void process(Exchange exchange) throws Exception {
		exchange.getOut().setBody(parsePdf(exchange.getIn().getBody(String.class)));
	}
}
