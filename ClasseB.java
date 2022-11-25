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

class ClasseB {
    private String beUm;
    private String beDois;

    public ClasseB(){
        beUm = "Elias de Jesus Miranda";     
        beDois = "201621164";     
    }

    public String getNome(){
       return beUm; 
    }

    public String getMatricula(){
       return beDois; 
    }

    public void setNome(String novoBeUm){
        this.beUm = novoBeUm;
    }

    public void setMatricula(String novoBeDois){
        this.beDois = novoBeDois;
    }
    
    public void metodoBTres(){
        System.out.println("MC3()");
    }
}
