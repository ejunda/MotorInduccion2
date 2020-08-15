/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorinduccion2;

/**
 *
 * @author Erick Unda
 */
class Parametro_Falla
{
    float CalcularPeso(float masa,float gravedad){
        return masa*gravedad;
    }
    double CalcularPeso(double masa,double gravedad){
        return masa*gravedad;
    }

     float CalcularTipo_falla(float num,float cant){
        return num*cant;
    }
    double CalcularTipo_falla(double num,double cant){
        return num*cant;
    }
    float CalcularNum_rotor(float hilos,float distancia){
        return hilos*distancia;
    }
    double CalcularNum_rotor(double hilos,double distancia){
        return hilos*distancia;
    }

    float CalcularTiempo_falla(float dias_falla){
        return dias_falla;
    }
    double CalcularTiempo_falla(double dias_falla){
        return dias_falla;
    }
}
public class MotorInduccion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Parametro_Falla Objeto1= new  Parametro_Falla();
       Parametro_Falla Objeto2= new  Parametro_Falla();
       Parametro_Falla Objeto3= new  Parametro_Falla();
       Parametro_Falla Objeto4= new  Parametro_Falla();
       Parametro_Falla Objeto5= new  Parametro_Falla();
       Parametro_Falla Objeto6= new  Parametro_Falla();
       Parametro_Falla Objeto7= new  Parametro_Falla();
       Parametro_Falla Objeto8= new  Parametro_Falla();

        System.out.println("____________________________________________________________");
        System.out.println("---------[UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE]---------");
        System.out.println("ASIGNATURA: PROGRAMACION");
        System.out.println("DOCENTE: ING. LUIS ALBERTO GUERRA CRUZ");
        System.out.println("NRC: 7450");
        System.out.println("ERICK UNDA");


        float resultado1;
        Objeto1.CalcularPeso(60.5, 7.8);
        resultado1=(float) Objeto1.CalcularPeso(60.5, 7.8);
        System.out.println("El  peso tiene un valor de : " +resultado1+"\t Newton");
        double resultado2;
        Objeto1.CalcularPeso(60.5, 7.8);
        resultado2=Objeto2.CalcularPeso(60.5, 7.8);
        System.out.println("El peso tiene un valor de : " +resultado2+"\t Newton");

        float resultado3;
        Objeto3.CalcularTipo_falla(2.3, 244.9);
        resultado3=(float) Objeto3.CalcularTipo_falla(2.3, 244.9);
        System.out.println("El tipo de falla  tiene un valor de numérico de: " +resultado3+ "\tcodido de falla");
        double resultado4;
        Objeto4.CalcularTipo_falla(2.3, 2454.9);
        resultado4=Objeto4.CalcularTipo_falla(0.3, 2454.9);
        System.out.println("El tipo de falla  tiene un valor de numérico de: " +resultado4+ "\tcódigo de falla");

        float resultado5;
        Objeto5.CalcularNum_rotor(10.5, 50.1);
        resultado5=(float) Objeto5.CalcularNum_rotor(10.5, 50.1);
        System.out.println("los hilos del rotor tienen un valor de : " +resultado5+"\t longuitud del alambre de cobre");
        double resultado6;
        Objeto6.CalcularNum_rotor(10.5, 50.1);
        resultado6=Objeto6.CalcularNum_rotor(10.5, 50.1);
        System.out.println("los hilos del rotor tienen  un valor de : " +resultado6+"\t longuitud del alambre de cobre");

        float resultado7;
        Objeto7.CalcularTiempo_falla((float) 5);
        resultado7= Objeto7.CalcularTiempo_falla((float) 5);
        System.out.println("El tiempo de falla tiene un valor de : " +resultado7+ "\tHoras");
        double resultado8;
        Objeto8.CalcularTiempo_falla(5);
        resultado8= Objeto8.CalcularTiempo_falla(5);
         System.out.println("El el tiempo de falla tiene un valor de : " +resultado8+ "\tHoras");
    }

}
