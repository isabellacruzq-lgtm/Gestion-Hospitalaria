import { Component, Input } from '@angular/core';

@Component({
    selector: 'app-cancel-appointment-toast',
    templateUrl: './cancel-appointment-toast.component.html',
    styleUrls: ['./cancel-appointment-toast.component.css']
})
export class CancelAppointmentToastComponent {

    @Input() isVisible: boolean = true;

    @Input() title: string =
        'CONTROL DE CITAS MÉDICAS';

    @Input() message: string =
        '¿CONFIRMA LA ANULACIÓN DEL TURNO?';

    @Input() buttonConfirm: string =
        'CONFIRMAR CANCELACIÓN';

    @Input() buttonBack: string =
        'MANTENER CITA';

    closeToast(): void {
        this.isVisible = false;
    }

    confirmCancel(): void {
        console.log('Cita cancelada');
        this.isVisible = false;
    }

}