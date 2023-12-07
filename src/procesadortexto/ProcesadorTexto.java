/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package procesadortexto;

import java.util.ArrayList;

/**
 *
 * @author Ernesto
 */
public class ProcesadorTexto {
        private String texto;
        private ArrayList<ProcesadorTexto> listaTexto = new ArrayList();
    public ProcesadorTexto(String texto, ArrayList<ProcesadorTexto> listaTexto) {
        this.texto = texto;
        this.listaTexto = listaTexto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ArrayList<ProcesadorTexto> getListaTexto() {
        return listaTexto;
    }

    public void setListaTexto(ArrayList<ProcesadorTexto> listaTexto) {
        this.listaTexto = listaTexto;
    }
    public void addTexto(ProcesadorTexto t){
      listaTexto.add(t);  
    }
    public void imprimirTexto(ProcesadorTexto t){
        System.out.println(t.listaTexto);
    }
}
