import { Component, OnInit } from '@angular/core';
import { CalculatorService } from 'src/app/calculator.service';
import { CurrencyConverterService } from 'src/app/currency-converter.service';

@Component({
  selector: 'app-add-payee',
  templateUrl: './add-payee.component.html',
  styleUrls: ['./add-payee.component.css']
})
export class AddPayeeComponent implements OnInit {

  

  constructor(private calcServ: CalculatorService, private currConvServ: CurrencyConverterService) {
    
    console.log('AddPayeeComponent constructor invoked...');
  }

  a!:number;
  b!:number;

  sum!:number;

  sourceCountry:string='INR';
  targetCountry:string='USD';
  amountToConvert:number=5000;

  convertedAmount !: number;

  convertIt() { //wrapper / fake / dummy function called via HTML controls

    this.convertedAmount = this.currConvServ.convert(this.sourceCountry,this.targetCountry,this.amountToConvert); //actual Service's function

  }
  ngOnInit(): void {
    console.log('AddPayeeComponent ngOnInit() invoked...');
    
  }

  makeSumOfTwo() {
    this.sum = this.calcServ.addTwoNumbersService(this.a,this.b);
  }

}
