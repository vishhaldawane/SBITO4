package com.example.demo.pdf;
import com.itextpdf.text.BaseColor;
import java.awt.Point;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.example.demo.layer2.Flight;
import com.example.demo.layer4.FlightService;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class FlightPDFView  extends AbstractITextPdfView  {

	@Autowired
	FlightService flightService;
	
	@Override
	protected void buildPdfDocument(
			Map<String, 
			Object> model, 
			Document doc, 
			PdfWriter writer,
			HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		
		System.out.println("buildPdfDocument(..) invoked...");
		
		List<Flight> allFlights =  flightService.findAllFlightsService();
		
		 doc.add(new Paragraph("Flight Details"));
         
	        PdfPTable table = new PdfPTable(5);
	        table.setWidthPercentage(100.0f);
	        table.setWidths(new float[] {3.0f, 2.0f, 2.0f, 2.0f, 1.0f});
	        table.setSpacingBefore(10);
	         
	        // define font for table header row
	        Font font = FontFactory.getFont(FontFactory.HELVETICA);
	        font.setColor(BaseColor.WHITE);
	         
	        // define table header cell
	        PdfPCell cell = new PdfPCell();
	        cell.setBackgroundColor(BaseColor.BLUE);
	        cell.setPadding(5);
	         
	        // write table header
	        cell.setPhrase(new Phrase("Flight Number", font));
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("Airline", font));
	        table.addCell(cell);
	 
	        cell.setPhrase(new Phrase("Source", font));
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("Destination", font));
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("Departure", font));
	        table.addCell(cell);
	        
	        //cell.setPhrase(new Phrase("Arrival", font));
	       // table.addCell(cell);
	         
	        // write table row data
	        for (Flight flight: allFlights) {
	            table.addCell(flight.getFlightNumber()+"");
	            table.addCell(flight.getAirline());
	            table.addCell(flight.getSourceCity());
	            table.addCell(flight.getTargetCity());
	            table.addCell(flight.getFlightDepartureTime()+"");
	          //  table.addCell(flight.getFlightArrivalTime()+"");
	        }
	         
	        doc.add(table);
	}

	

}
