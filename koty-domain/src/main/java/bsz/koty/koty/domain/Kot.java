/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsz.koty.koty.domain;

/**
 *
 * @author dom
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author dom
 */

public class Kot {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
    private String imie;
    private Date data;
    private Double waga;
    private String imieOpiekuna;
    public String przedstawSie(){
        return "Kot "+imie+", właściciel "+imieOpiekuna+", waga "+waga+
                ", urodzony "+sdf.format(data);
    }    
    public void setData(String data) {
        try{
            this.data = sdf.parse(data);
        } catch (ParseException e){
            System.out.println("Błędna data");
        }      
    }

    public String getData() {
        return sdf.format(data);
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void setWaga(Double waga) {
        this.waga = waga;
    }

    public Double getWaga() {
        return waga;
    }
    
    
}
