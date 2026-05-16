import { Component } from '@angular/core';

@Component({
  selector: 'app-dashboard-doctor',
  templateUrl: './dashboard-doctor.html',
  styleUrls: ['./dashboard-doctor.css']
})
export class DashboardDoctor {

  pacientes: number = 25;
  citas: number = 10;

  constructor() {
    console.log('Dashboard del personal médico cargado');
  }

}