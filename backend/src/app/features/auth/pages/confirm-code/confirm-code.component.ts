import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
    selector: 'app-confirm-code',
    templateUrl: './confirm-code.component.html',
    styleUrls: ['./confirm-code.component.css']
})
export class ConfirmCodeComponent {

    codigo: string = '';

    constructor(private router: Router) {}

    reenviarCodigo(): void {
        alert('Código reenviado correctamente.');
    }

    validarCodigo(): void {

        // Simulación simple de validación
        if (this.codigo.length === 6) {

            alert('Código validado correctamente.');

            // Redirigir al dashboard
            this.router.navigate(['/dashboard']);

        } else {
            alert('El código debe tener 6 dígitos.');
        }
    }
}