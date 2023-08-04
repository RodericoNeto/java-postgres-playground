package com.example.model;

import java.time.LocalDate;

public class Cidadao {
    private LocalDate dataNascimento;


    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public int idade(){
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    
}
