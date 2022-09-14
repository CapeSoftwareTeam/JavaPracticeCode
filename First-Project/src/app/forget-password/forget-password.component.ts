import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-forget-password',
  templateUrl: './forget-password.component.html',
  styleUrls: ['./forget-password.component.css']
})
export class ForgetPasswordComponent implements OnInit {

    forgetPassword = new FormGroup({
    Email:new FormControl('',Validators.required),
    Password:new FormControl('',Validators.required),
    ConfirmPassword:new FormControl('',Validators.required)
    })


  constructor(
    private router:Router,
    private Activerouter:ActivatedRoute
  ) { }

  gotohome(){
    this.router.navigate(['/login']);
  }

  ngOnInit(): void {
  }

}
