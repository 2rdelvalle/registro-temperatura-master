
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Empleados } from '../models/empleados';

@Injectable({
  providedIn: 'root'
})
export class EmpleadoService {

  public url = 'http://localhost:8080/api';

  constructor(private http: HttpClient) { }

  addRegistro(empleado: Empleados){
    return this.http.post<Empleados>(this.url, empleado);
  }

  getEmpleado(){
    return this.http.get<Empleados[]>(this.url);
  }
}
