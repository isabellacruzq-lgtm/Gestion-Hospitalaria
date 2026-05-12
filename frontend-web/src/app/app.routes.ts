import { Routes } from '@angular/router';
import { Splash } from './modules/auth/pages/splash/splash';
import { Login } from './modules/auth/pages/login/login';
import { Register } from './modules/auth/pages/register/register';
import { DashboardPaciente } from './modules/dashboard/pages/dashboard-paciente/dashboard-paciente';
import { DashboardAdmin } from './modules/dashboard/pages/dashboard-admin/dashboard-admin';
import { DashboardDoctor } from './modules/dashboard/pages/dashboard-doctor/dashboard-doctor';

export const routes: Routes = [
  { path: '', component: Splash },
  { path: 'login', component: Login },
  { path: 'register', component: Register },
  { path: 'paciente/dashboard', component: DashboardPaciente },
  { path: 'admin/dashboard', component: DashboardAdmin },
  { path: 'doctor/dashboard', component: DashboardDoctor },
  { path: '**', redirectTo: '' }
];