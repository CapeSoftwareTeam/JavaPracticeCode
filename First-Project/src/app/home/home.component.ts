import { Component, OnInit,OnChanges,OnDestroy,Input, Output, EventEmitter } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})


export class HomeComponent implements OnInit {
  @Input()
  name:any;
  show: any=true;
  title:any;
  @Output() fromChild = new EventEmitter();
  
  constructor(
    private activerouter:ActivatedRoute
    
  ) { 
    this.title = this.activerouter.snapshot.paramMap.get('Email');
  }

  ngOnInit(): void {
    console.log("Hi,,,,");
    console.log(this.name);
  }
  
  toggleButton1(){
    this.fromChild.emit("hi how r u from child")
  }
  

}
