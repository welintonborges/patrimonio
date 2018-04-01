import { Component, OnInit } from '@angular/core';

import { ItemService } from './../item/item.service';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-item-cadastro',
  templateUrl: './item-cadastro.component.html',
  styleUrls: ['./item-cadastro.component.css']
})
export class ItemCadastroComponent implements OnInit {

  itens = [
  //  {etiqueta:'AA1234', descricao: 'Notebook', dataAquisicao: new Date()},
  //  {etiqueta:'BB9876', descricao: 'Mouse', dataAquisicao: new Date()}
    

  ];
  constructor(private itemService: ItemService) { }

  ngOnInit() {
   this.consultar();
  }

  
  consultar() {

    this.itemService.listar()
     .subscribe(dados => this.itens = dados);
  }

  adicionar(frm: FormControl){
    console.log(frm.value);

    this.itemService.adicionar(frm.value).subscribe(() =>{
     frm.reset();
      this.consultar();
    })
  }
}
