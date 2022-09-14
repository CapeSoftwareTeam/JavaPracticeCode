import { Component, ViewChild } from '@angular/core';
import { bufferToggle } from 'rxjs';
import { HomeComponent } from './home/home.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'First-Project';
  name:string ="Welcome to CAPE"
  show:boolean=false;
  nameFromChild: any = '';
  @ViewChild(HomeComponent)childRef!: HomeComponent ;
  toggleButton(a: any){
    this.childRef.name = "edhxueicheiljcoejcilejcklec"
    this.nameFromChild = a;
  } 
}


