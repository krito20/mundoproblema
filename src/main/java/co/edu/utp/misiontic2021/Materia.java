package co.edu.utp.misiontic2021;

import java.util.ArrayList;

public class Materia{

    public String nombre;
    private double promedioAjustado;
    private ArrayList<Nota>notasQuizes = new ArrayList<Nota>();
    public Nota PeorNota;
    String codigoEstudianteCursando;

    //constructores
    Materia(String pNombre, int n1, int n2, int n3, int n4, int n5){
        this.nombre = pNombre;
        this.notasQuizes.add(new Nota(n1));
        this.notasQuizes.add(new Nota(n2));
        this.notasQuizes.add(new Nota(n3));
        this.notasQuizes.add(new Nota(n4));
        this.notasQuizes.add(new Nota(n5));
    }

}