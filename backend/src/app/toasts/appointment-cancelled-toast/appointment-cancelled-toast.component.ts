import { Component, Input } from '@angular/core';

@Component({
    selector: 'app-appointment-cancelled-toast',
    templateUrl: './appointment-cancelled-toast.component.html',
    styleUrls: ['./appointment-cancelled-toast.component.css']
})
export class AppointmentCancelledToastComponent {

    @Input() isVisible: boolean = true;

    @Input() title: string =
        'SISTEMA DE CITAS: ANULACIÓN';

    @Input() message: string =
        'LA CITA HA SIDO REMOVIDA DEL REGISTRO';

    @Input() buttonHome: string =
        'VOLVER AL DASHBOARD';

    @Input() buttonNew: string =
        'REAGENDAR TURNO';

    closeToast(): void {
        this.isVisible = false;
    }

    goDashboard(): void {
        console.log('Ir al dashboard');
        this.isVisible = false;
    }

    newAppointment(): void {
        console.log('Reagendar cita');
        this.isVisible = false;
    }

}