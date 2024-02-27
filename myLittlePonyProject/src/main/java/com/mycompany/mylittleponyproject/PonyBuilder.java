/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mylittleponyproject;

/**
 *
 * @author user
 */
public interface PonyBuilder {
    PonyBuilder nombre(String nombre);
    PonyBuilder color(String color);
    PonyBuilder alas(boolean alas);
    PonyBuilder poder(String poder);
    
    Pony build();
}
