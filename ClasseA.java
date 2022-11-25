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
}
