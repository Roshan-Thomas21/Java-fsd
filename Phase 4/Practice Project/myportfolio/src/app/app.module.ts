import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { SigninComponent } from './homepage/signin/signin.component';
import { SignupComponent } from './homepage/signup/signup.component';
import { AboutUsComponent } from './homepage/about-us/about-us.component';
import { HomepageComponent } from './homepage/homepage.component';
import { ContactusComponent } from './homepage/contactus/contactus.component';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    SigninComponent,
    SignupComponent,
    AboutUsComponent,
    HomepageComponent,
    ContactusComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule // Add the AppRoutingModule here
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
