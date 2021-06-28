import { HttpService } from './../service/http.service';
import { Component, OnInit } from '@angular/core';
import { Todo } from '../model/todo';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {

  constructor(private httpService: HttpService) { }
  todos: Todo[] = [];
  ngOnInit(): void {
    this.httpService.fetchAll().subscribe(response => {
      this.todos = response as [];
    })

  }
}


