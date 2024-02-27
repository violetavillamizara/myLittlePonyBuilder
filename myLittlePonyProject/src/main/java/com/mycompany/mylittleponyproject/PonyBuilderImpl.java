/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mylittleponyproject;

/**
 *
 * @author user
 */
public class PonyBuilderImpl implements PonyBuilder{
    
    private Pony pony = new Pony();

    @Override
    public PonyBuilder nombre(String nombre) {
        pony.setNombre(nombre);
        return this;
    }

    @Override
    public PonyBuilder color(String color) {
        pony.setColor(color);
        return this;
    }

    @Override
    public PonyBuilder alas(boolean alas) {
        pony.setAlas(alas);
        return this;
    }

    @Override
    public PonyBuilder poder(String poder) {
        pony.setPoder(poder);
        return this;
    }

    @Override
    public Pony build() {
        return pony;
    }
   
}
