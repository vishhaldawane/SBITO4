import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Flight } from './flight/Flight';

@Injectable({
  providedIn: 'root'
})
export class FlightService {

  BASEURL="http://localhost:8080/flight/getFlight/";

  constructor(private myHttp: HttpClient) { }

  loadFlightObjectFromSpring(flno: number) : Observable<Flight>
  {
    return this.myHttp.get<Flight>(this.BASEURL+flno);
  }
}
