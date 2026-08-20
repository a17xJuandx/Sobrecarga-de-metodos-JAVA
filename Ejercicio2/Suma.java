/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author a17x_
 */
public class Suma {
    
    public int Sumar(int num1,int num2){
        return num1+num2;
    }
    public int Sumar(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public double Sumar(double num1,double num2){
        return num1+num2;
    }
    public double Sumar(double num1,double num2,double num3){
        double a = Math.round((num1+num2+num3)*100);
        a = a /100;
        return a;
    }
}
