import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { DataTableModule } from 'primeng/primeng';

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ItemCadastroComponent } from './item-cadastro/item-cadastro.component';
import { ItemService } from './item/item.service';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ItemCadastroComponent
  ],
  imports: [
    BrowserModule,

    DataTableModule
  ],
  providers: [
    ItemService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
