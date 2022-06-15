import { Component, OnInit } from '@angular/core';
import { CalculatorService } from 'src/app/calculator.service';

@Component({
  selector: 'app-add-payee',
  templateUrl: './add-payee.component.html',
  styleUrls: ['./add-payee.component.css']
})
export class AddPayeeComponent implements OnInit {

  calcServ: CalculatorService = new CalculatorService();

  constructor() {
    
    console.log('AddPayeeComponent constructor invoked...');
  }

  a!:number;
  b!:number;

  sum!:number;

  ngOnInit(): void {
    console.log('AddPayeeComponent ngOnInit() invoked...');
    
  }

  makeSumOfTwo() {
    this.sum = this.calcServ.addTwoNumbersService(this.a,this.b);
  }

}
