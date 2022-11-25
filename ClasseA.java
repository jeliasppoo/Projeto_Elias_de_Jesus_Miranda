/*============================================================
File: ClasseA.java
Data: 25-11-22_22
-------------------------------------------------------------
Graduando: ELIAS DE JESUS MIRANDA 
ANTONIO MARIA PEREIRA DE RESENDE - DOCENTE - DCC 
Disciplina:Engenharia de Software 
TURMA: GCC188-2022/2-V1-10A-G010 
-------------------------------------------------------------*/

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

class ClasseA {
    private int ahUm;
    private int ahDois;
    private String ceUm; 
    private int ceDois;

    public ClasseA(){
        ahUm = 10;        
        ahDois = 20;
    }
    
    public int getAhUm(){
       return ahUm; 
    }

    public int getAhDois(){
       return ahDois; 
    }

    public void setNome(int novoAhUm){
        this.ahUm = novoAhUm;
    }

    public void setMatricula(int novoAhDois){
        this.ahDois = novoAhDois;
    }

    public void ma3(){
        System.out.println("##Instruções da função não definida no manula de projetos##");
        // Função que não foi especificado pelo Professor(PO), Tipo da função e as operaçõs que espara para esta função;
    }

    public void metodoMcUm(){
        System.out.println("metodoMcUM");
    }

    public void metodoMcDos(){
        System.out.println("metodoMcDois");
    }
}
