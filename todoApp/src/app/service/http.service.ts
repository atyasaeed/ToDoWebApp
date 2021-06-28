import { environment } from './../../environments/environment';
import { Todo } from './../model/todo';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HttpService {


  constructor(private http: HttpClient) { }



  public fetchAll() {
    // this.http.get(`${environment.url}/todo/findAll`)._subscribe(response => {
    //   this.todos = response;
    // })
    return this.http.get(`${environment.url}/todo/findAll`);
  }

}
