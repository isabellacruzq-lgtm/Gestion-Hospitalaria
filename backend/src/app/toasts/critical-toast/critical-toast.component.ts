import { Component } from '@angular/core';

@Component({
    selector: 'app-critical-toast',
    templateUrl: './critical-toast.component.html',
    styleUrls: ['./critical-toast.component.css']
})
export class CriticalToastComponent {

    visible = true;

    closeToast(): void {
        this.visible = false;
    }

    confirmAction(): void {
        console.log('Registro eliminado');
        this.visible = false;
    }

    cancelAction(): void {
        console.log('Operación cancelada');
        this.visible = false;
    }

}