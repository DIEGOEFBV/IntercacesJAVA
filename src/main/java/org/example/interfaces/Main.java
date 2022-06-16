package org.example.interfaces;

public class Main {
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(2);
        Circulo circulo = new Circulo(4);

        cuadrado.dibujar();
        System.out.println("área del cuadrado: "+cuadrado.calcularArea()+"\n");

        circulo.dibujar();
        System.out.println("área del circulo: "+circulo.calcularArea());
        circulo.rotar();

    }
}