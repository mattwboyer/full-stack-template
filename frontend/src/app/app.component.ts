import { Component } from '@angular/core';

import {UsersService} from './users.service';

@Component({  
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'full-stack-template';

  constructor(private user:UsersService) {
    this.user.getData().subscribe(u => console.warn(u));
  }
}
