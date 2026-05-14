import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
    selector: 'app-login-screen',
    templateUrl: './login-screen.component.html',
    styleUrls: ['./login-screen.component.css']
})
export class LoginScreenComponent {

    email: string = '';
    password: string = '';

    constructor(private router: Router) {}

    login(): void {

        console.log('LOGIN:', {
            email: this.email,
            password: this.password
        });

        // Redirección futura
        this.router.navigate(['/dashboard']);
    }

    register(): void {
        this.router.navigate(['/register']);
    }

    resetPassword(): void {
        this.router.navigate(['/recover-password']);
    }
}