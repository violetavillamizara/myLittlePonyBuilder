/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mylittleponyproject;

/**
 *
 * @author user
 */
public class MyLittlePonyProject {

    public static void main(String[] args) {
        PonyBuilder builder = new PonyBuilderImpl();
        Pony pony = builder.nombre("Tamara")
                .color("amarillo")
                .alas(true)
                .poder("comer escarcha")
                .build();
        System.out.println("Hello Pony!" + pony.getNombre());
    }
}
