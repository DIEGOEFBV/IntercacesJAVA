package org.example.interfaces;

public class Circulo implements Figura, Dibujable, Rotable {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double resultado;
        double pi = 3.14;
        return resultado = pi * radio * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un Circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Hola!! Rotando muy fácil, soy un circulo :D");
    }
}
