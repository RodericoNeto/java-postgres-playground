package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.example.model.Cidadao;

public class AppIdades {
    public static void main(String[] args) {
        System.out.println("uobaaa");

        var cidadao01 = new Cidadao();
        cidadao01.setDataNascimento(LocalDate.of(1992, 04, 1));
        System.out.println(cidadao01.idade());
    }
}
