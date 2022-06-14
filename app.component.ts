import { Component } from '@angular/core';
import { Employee } from './Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html', //View
  styleUrls: ['./app.component.css'] // style
})
export class AppComponent { //model + Logic
  employeeNumber: number = 7839;
  empName: string ='King';
  job: string ='President';
  managerCode : number =1234;
  hireDate: Date =new Date('Tue Jan 16 2023 10:30');
  basicSalary : number=5000;
  commission : number=500;
  deptNumber:number=10;


  title = 'Vishhal';

//  Employee   empObj = new Employee();

  empObj: Employee  = new Employee();

  constructor() {
    console.log('AppComponent constructor..');
    this.empObj.employeeNumber=7654;
    this.empObj.empName='Martin';
    this.empObj.job='Salesman';
    this.empObj.managerCode=7839;
    this.empObj.hireDate=new Date('Mon Feb 16 2024 11:30:00');
    this.empObj.basicSalary=3500;
    this.empObj.commission=450;
    this.empObj.deptNumber=30;
  }
}
