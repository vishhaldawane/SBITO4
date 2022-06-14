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

  empObj1: Employee  = new Employee();
  empObj2: Employee  = new Employee();
  empObj3: Employee  = new Employee();

  empStaff: Employee[] = 
  [
    { 
      "employeeNumber" : 1234,
      "empName" : "Smith",
      "job" : "Manager",
      "managerCode":7839,
      "hireDate": new Date("Sun Feb 23 2025 11:30:00"),
      "basicSalary" : 5300,
      "commission" : 450,
      "deptNumber" : 10
    },
    { 
      "employeeNumber" : 3234,
      "empName" : "Peter",
      "job" : "Clerk",
      "managerCode":7839,
      "hireDate": new Date("Sun Feb 20 2026 11:30:00"),
      "basicSalary" : 3300,
      "commission" : 340,
      "deptNumber" : 20
    },
    { 
      "employeeNumber" : 7655,
      "empName" : "Adam",
      "job" : "Salesman",
      "managerCode":7654,
      "hireDate": new Date("Sun Feb 20 2027 11:30:00"),
      "basicSalary" : 3300,
      "commission" : 350,
      "deptNumber" : 30
    },
    { 
      "employeeNumber" : 5634,
      "empName" : "Peter",
      "job" : "Analyst",
      "managerCode":7539,
      "hireDate": new Date("Sun Mar 23 2024 11:30:00"),
      "basicSalary" : 3300,
      "commission" : 550,
      "deptNumber" : 30
    },
    { 
      "employeeNumber" : 6634,
      "empName" : "Allen",
      "job" : "Clerk",
      "managerCode":7435,
      "hireDate": new Date("Sun Apr 23 2025 11:30:00"),
      "basicSalary" : 3300,
      "commission" : 450,
      "deptNumber" : 20
    },


  ];

  constructor() {
    console.log('AppComponent constructor..');
    this.empObj1.employeeNumber=7654;
    this.empObj1.empName='Martin';
    this.empObj1.job='Salesman';
    this.empObj1.managerCode=7839;
    this.empObj1.hireDate=new Date('Mon Feb 16 2024 11:30:00');
    this.empObj1.basicSalary=3500;
    this.empObj1.commission=450;
    this.empObj1.deptNumber=30;

    this.empObj2.employeeNumber=7654;
    this.empObj2.empName='Ford';
    this.empObj2.job='Analyst';
    this.empObj2.managerCode=7839;
    this.empObj2.hireDate=new Date('Mon Feb 23 2025 11:30:00');
    this.empObj2.basicSalary=4500;
    this.empObj2.commission=550;
    this.empObj2.deptNumber=20;

    this.empObj3.employeeNumber=7899;
    this.empObj3.empName='Clark';
    this.empObj3.job='Manager';
    this.empObj3.managerCode=7839;
    this.empObj3.hireDate=new Date('Mon Feb 25 2025 11:30:00');
    this.empObj3.basicSalary=3900;
    this.empObj3.commission=350;
    this.empObj3.deptNumber=40;
  }
}
