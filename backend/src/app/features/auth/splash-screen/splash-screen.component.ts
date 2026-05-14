import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { SplashScreenComponent } from './screens/splash-screen/splash-screen.component';
import { LoginScreenComponent } from './screens/login-screen/login-screen.component';

const routes: Routes = [

    {
        path: '',
        component: SplashScreenComponent
    },

    {
        path: 'login',
        component: LoginScreenComponent
    }

];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }