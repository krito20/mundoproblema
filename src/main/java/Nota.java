package co.edu.utp.misiontic2021;
public class Nota {
    //Atributos
    //constante
    public static final int APROBADO_ESCALA100 = 60;
    public static final double APROBADO_ESCALA5 = 3.00;
    public String conceptoEvaluado;
    private int escala100;
    private double escala5;
    private String cualificativo;

    //1. Constructores
    Nota(){
        this.conceptoEvaluado = "Concepto sin asignar";
        this.escala100 = 0;
        this.escala5 = 0;
        this.cualificativo = "Sin calificar";
    }
    Nota(int nEscala100){
        this.conceptoEvaluado = "Concepto sin asignar";
        this.escala100 = nEscala100;
        this.escala5 = (double)nEscala100/20;
        if(nEscala100 >= Nota.APROBADO_ESCALA100){
            this.cualificativo = "Aprobado";
        }else{
            this.cualificativo = "Reprobado"
        }
        this.cualificativo = "Sin calificar";
    }
    Nota(double nEscala5){
        this.conceptoEvaluado = "Concepto sin asignar";
        this.escala100 = (int)(nEscala5+20);
        this.escala5 = nEscala5;
        if(nEscala5 >= Nota.APROBADO_ESCALA5){
            this.cualificativo = "Aprobado";
        }else{
            this.cualificativo = "Reprobado"
        }
        this.cualificativo = "Sin calificar";
    }
    
}