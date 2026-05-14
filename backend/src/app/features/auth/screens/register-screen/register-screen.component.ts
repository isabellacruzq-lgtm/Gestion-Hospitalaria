import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
    selector: 'app-register-screen',
    templateUrl: './register-screen.component.html',
    styleUrls: ['./register-screen.component.css']
})
export class RegisterScreenComponent {

    constructor(private router: Router) {}

    register(): void {

        console.log('Usuario registrado');

        // Redirección futura
        this.router.navigate(['/login']);
    }

    goToLogin(): void {
        this.router.navigate(['/login']);
    }

}