package com.example.demo.pdf;

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
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

@Component
public class FlightPDFView  extends AbstractPdfView {

	@Autowired
	FlightService flightService;
	
	@Override
	protected void buildPdfDocument(
			Map<String, 
			Object> model, 
			Document document, 
			PdfWriter writer,
			HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		
		System.out.println("buildPdfDocument(..) invoked...");
		
		
		
		Table table = new Table(2);
		
		table.addCell("FLNO");
		table.addCell("AIRLINE");
		/*table.addCell("SOURCE");
		table.addCell("TARGET");
		table.addCell("DEPARTURE");
		table.addCell("ARRIVAL");
		*/
		
		List<Flight> allFlights =  flightService.findAllFlightsService();
		
		Map<Integer,String> map = new HashMap();
		
		
		for (Flight flight : allFlights) {
			map.put(Integer.valueOf(flight.getFlightNumber()), flight.getAirline());
		}
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			table.addCell(entry.getKey()+"");
			table.addCell(entry.getValue());
        }
		document.add(table);
	}

	

}
