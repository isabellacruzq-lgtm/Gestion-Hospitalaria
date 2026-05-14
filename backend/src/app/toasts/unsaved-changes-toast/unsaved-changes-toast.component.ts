import { Component } from '@angular/core';

@Component({
    selector: 'app-unsaved-changes-toast',
    templateUrl: './unsaved-changes-toast.component.html',
    styleUrls: ['./unsaved-changes-toast.component.css']
})
export class UnsavedChangesToastComponent {

    visible = true;

    closeToast(): void {
        this.visible = false;
    }

    discardChanges(): void {
        console.log('Cambios descartados');
        this.visible = false;
    }

    stayOnEditor(): void {
        console.log('Usuario continúa editando');
        this.visible = false;
    }

}