import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Flight } from './flight/Flight';

@Injectable({
  providedIn: 'root'
})
export class FlightService {

  BASEURL="http://localhost:8080/flight/";

  constructor(private myHttp: HttpClient) { }

  loadFlightObjectFromSpring(flno: number) : Observable<Flight>
  {
    return this.myHttp.get<Flight>(this.BASEURL+"getFlight/"+flno);
  }

  
  loadAllFlightsFromSpring() : Observable<Flight[]>
  {
    return this.myHttp.get<Flight[]>(this.BASEURL+"getFlights");
  }

  updateFlightFromSpring(flightObj:Flight) : Observable<Flight>
  {
    return this.myHttp.put<Flight>(this.BASEURL+"updateFlight",flightObj);
  }

  deleteFlightFromSpring(flightNumber:number) : Observable<Flight>
  {
    return this.myHttp.delete<Flight>(this.BASEURL+"deleteFlight/"+flightNumber);
  }

  addFlightObjectToSpring(flightObject: Flight) : Observable<Flight>
  {
    return this.myHttp.post<Flight>(this.BASEURL+"addFlight/",flightObject);
  }
}
