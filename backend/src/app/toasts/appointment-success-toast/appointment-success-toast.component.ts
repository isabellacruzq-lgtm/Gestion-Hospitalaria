import { Component, Input } from '@angular/core';

@Component({
    selector: 'app-appointment-success-toast',
    templateUrl: './appointment-success-toast.component.html',
    styleUrls: ['./appointment-success-toast.component.css']
})
export class AppointmentSuccessToastComponent {

    @Input() isVisible: boolean = true;

    @Input() title: string =
        'SISTEMA DE ASIGNACIÓN GLOBAL';

    @Input() message: string =
        'CITA AGENDADA CORRECTAMENTE EN EL CALENDARIO';

    @Input() buttonHome: string =
        'VOLVER AL DASHBOARD';

    @Input() buttonView: string =
        'REVISAR DETALLES';

    goHome(): void {
        this.isVisible = false;

        // navegación
        // this.router.navigate(['/dashboard']);
    }

    viewAppointment(): void {
        this.isVisible = false;

        // navegación
        // this.router.navigate(['/appointments/details']);
    }
}