import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculatorService {

  constructor() {
    console.log('CalculatorService is instantiated..');
   }

  addTwoNumbersService(x:number, y: number): number {
      console.log('addTwoNumbersService is invoked..');
      return x+y;
  }
  
  subtractTwoNumbersService(x:number, y: number): number {
    console.log('subtractTwoNumbersService is invoked..');
    return x-y;
  }


  multiplyTwoNumbersService(x:number, y: number): number {
      console.log('multiplyTwoNumbersService is invoked..');
      return x*y;
  }

  
  divideTwoNumbersService(x:number, y: number): number {
    console.log('divideTwoNumbersService is invoked..');
    return x/y;
  }
  
}
