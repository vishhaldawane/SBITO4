import { Component, OnInit } from '@angular/core';
import { FlightService } from '../flight.service';
import { Flight } from './Flight';

@Component({
  selector: 'app-flight',
  templateUrl: './flight.component.html',
  styleUrls: ['./flight.component.css']
})
export class FlightComponent implements OnInit {

  flightObject: Flight = new Flight();
  flightArray: Flight[] =[];

  constructor(private flightService:FlightService) { }
  msg:any;
  ngOnInit(): void {
    this.findAllFlights(); //invoke this as soon as this component is loaded
  }
  
  findFlight() {
    this.flightService.loadFlightObjectFromSpring(this.flightObject.flightNumber).subscribe
    (
      {
        next: (data: any) =>  {
          this.flightObject = data;
          console.log(data);
          this.msg="";
        },
        complete: () => {},
        error: (error) => { 
          //console.log(error);
          this.msg = error.error.message;
          console.log(error.error.message);
        }
      }
   );
  }


  findAllFlights() {
    this.flightService.loadAllFlightsFromSpring().subscribe
    (
      {
        next: (data: any[]) =>  {
          this.flightArray = data;
          console.log(data);
          this.msg="";
        },
        complete: () => {},
        error: (error) => { 
          //console.log(error);
          this.msg = error.error.message;
          console.log(error.error.message);
        }
      }
   );
  }

  updateFlight(flight:Flight) {
    this.flightService.updateFlightFromSpring(flight).subscribe
    (
      {
        next: (data: any) =>  {
         // this.flightObject = data;
          console.log(data);
          this.msg="";
        },
        complete: () => {},
        error: (error) => { 
          //console.log(error);
        //  this.msg = error.error.message;
          console.log(error.error.message);
        }
      }
   );
  }
}
