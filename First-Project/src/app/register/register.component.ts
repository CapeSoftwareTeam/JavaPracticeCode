import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

   name:string ="Enter your Name";
   placeholder:string="Enter your last Name"

   disabled:boolean=false;
   
   mailHolder:string="Enter your mail"
   passwordHolder:string ="type your password"

  RegisterForm =new FormGroup({
     firstName:new FormControl('',Validators.required),
     lastName:new FormControl('',Validators.required),
     mailId:new FormControl('',Validators.required),
     password:new FormControl('',Validators.required),
     ConfirmPassword:new FormControl('',Validators.required)
  })
  constructor() { }

  ngOnInit(): void {
  }

  // FormValidate(){
  //   if(this.RegisterForm.controls.firstName==''){
     
  //   }
  //   else{
  //     alert("Name must filled!");
  //   }
  // }
}
