import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
    selector: 'app-professional-register',
    templateUrl: './professional-register.component.html',
    styleUrls: ['./professional-register.component.css']
})
export class ProfessionalRegisterComponent {

    selectedCity: string = 'Manizales';

    hospitalsByCity: any = {
        Manizales: [
            'Hospital Central',
            'Clínica San Marcel',
            'Sede UAM'
        ],

        Bogotá: [
            'Hospital Universitario',
            'Clínica del Norte'
        ],

        Medellín: [
            'Hospital San Vicente',
            'Clínica Las Américas'
        ]
    };

    constructor(private router: Router) {}

    registrar(): void {

        alert('Registro profesional completado.');

        this.router.navigate(['/login']);
    }

    cancelar(): void {

        this.router.navigate(['/login']);
    }
}