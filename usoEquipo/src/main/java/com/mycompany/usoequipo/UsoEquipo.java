/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usoequipo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class UsoEquipo {

    public static void main(String[] args) {
        Equipo x =new Equipo();
     List<Equipo>misEquipos = new  ArrayList();
            byte opc=1 ;
            while  (opc<4){
        opc =Byte.parseByte((JOptionPane.showInputDialog("1.Agregue Datos \n2.Imprimir\n 3. equipos con mas campeonato\n4.salir")));
        switch (opc ){
            case 1 : String nom=JOptionPane.showInputDialog("Digite el nombre del Equipo");
             int fund = Integer.parseInt(JOptionPane.showInputDialog("Digite el año que lo fundaron"));
             String direc= JOptionPane.showInputDialog("Digite la Direccion");
             String color = JOptionPane.showInputDialog("Digite el color del Equipo");
             byte campeonatos= Byte.parseByte(JOptionPane.showInputDialog("Digite cuantos campeonatos tiene ganado el equipo"));
             x.agregaEquipo(misEquipos, nom, fund, direc, color, campeonatos);
                
             break;
            case 2 : x.imprimeEquipo(misEquipos);
            case 3 :if(misEquipos.isEmpty())
                    System.out.println("No hay datos de equipos");
                   else
                x.mayorCampeonato(misEquipos);
              
        }
        }
    }     
                    
                   
    }

