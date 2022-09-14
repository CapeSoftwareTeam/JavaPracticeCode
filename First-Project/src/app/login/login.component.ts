import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


  mailHolder:string="Enter your email"
  name:string="Enter User Name"
  passwordHolder:string="Enter your password"

     login = new FormGroup({
      Email: new FormControl('',Validators.required),
      UserName: new FormControl('',Validators.required),
      Password: new FormControl('',Validators.required)

     })
  constructor(
    private Activerouter:ActivatedRoute,
    private router:Router

  ) { }

  home(){
    this.router.navigate(['/home',{Email:this.login.controls.Email.value}]);
  }

  forgetPassword(){
    this.router.navigate(['/forgetPassword']);
  }
  
  ngOnInit(): void {
  }
  

}
