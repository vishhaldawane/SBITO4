import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CurrencyConverterService {

  constructor() { }
  convert(src: string, trg: string, amtToConvert: number) : number {

    console.log('CurrencyConverter : convert....');
    return amtToConvert * 77; //assuming conversion of INR to USD
  }
}
