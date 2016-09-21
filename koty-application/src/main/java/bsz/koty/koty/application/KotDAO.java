/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsz.koty.koty.application;

import java.util.ArrayList;
import java.util.List;

import bsz.koty.koty.domain.Kot;

public class KotDAO {
    static List <Kot> listaKotow = new ArrayList<>();
    public static void dodajKota(Kot kot){
        listaKotow.add(kot);
    }
   public static void drukujKoty(){
       for(Kot kot:listaKotow) System.out.println(kot.przedstawSie());
   }
}
