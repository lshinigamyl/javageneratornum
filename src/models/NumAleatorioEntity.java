/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aravello
 */
public class NumAleatorioEntity {
    
    private long longitud;
    List<NumAleatorio> obj;

    public NumAleatorioEntity() {
        obj= new ArrayList<>();
    }
    public void añadirNumAleatorio(){
        obj.add(new NumAleatorio(generar()));
    }
    
    public long glimite(){
        long num=1;
        for (int i = 0; i < this.getLongitud() ; i++) {
            num=num*10;
        }
        return num;
    }
    public long gminimo(){
        long num=1;
        for (int i = 1; i < this.getLongitud() ; i++) {
            num=num*10;
        }
        return num;
    }
    public long generar(){
        long num= (long) (Math.random()*(gminimo()-glimite()+1)+glimite());
        return num;
    }

    public long getLongitud() {
        return longitud;
    }

    public void setLongitud(long longitud) {
        this.longitud = longitud;
    }
    
    
}
