/*============================================================
File: App.java
Data: 25-11-22_22
-------------------------------------------------------------
Graduando: ELIAS DE JESUS MIRANDA 
DOCENTE: JULIO CESAR ALVES  
Disciplina: Práticas de Programação Orientada a Objetos 
TURMA: 10B_GA-C104 
-------------------------------------------------------------*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public  class App{
    static private Scanner entrada;
    public static void main (String [] args){
        ClasseA  principal = new ClasseA();
        entrada = new Scanner(System.in);

        System.out.println("Digite o Numero");
        int umNome = entrada.nextInt();
        principal.setNome(umNome); 
    }
}

