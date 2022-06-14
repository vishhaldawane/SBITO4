import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-simple-interest-calculator',
  templateUrl: './simple-interest-calculator.component.html',
  styleUrls: ['./simple-interest-calculator.component.css']
})
export class SimpleInterestCalculatorComponent implements OnInit {

  principal: number=50000;
  numberOfYears: number=10;
  rateOfInterest:number=7.8;
  simpleInterest:number=(this.principal * this.numberOfYears * this.rateOfInterest)/100;
  

  constructor() { }

  ngOnInit(): void {
  }
  calculateSI() {
    console.log('calculating simple interest....');
    console.log('P : ',this.principal);
    console.log('N : ',this.numberOfYears);
    console.log('R : ',this.rateOfInterest);
    this.simpleInterest=(this.principal * this.numberOfYears * this.rateOfInterest)/100;
    console.log('SI : ',this.simpleInterest);
  }
}
