/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usoequipo;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Equipo {
     private String nomEquipo;
    private int anhoFundacion;
    private String direccion;
    private String colorCamiseta;
    private byte campGanados;

    public Equipo(String nomEquipo, int anhoFundacion, String direccion, String colorCamiseta, byte campGanados) {
        this.nomEquipo = nomEquipo;
        this.anhoFundacion = anhoFundacion;
        this.direccion = direccion;
        this.colorCamiseta = colorCamiseta;
        this.campGanados = campGanados;
    }

    public String getNomEquipo() {
        return nomEquipo;
    }

    public void setNomEquipo(String nomEquipo) {
        this.nomEquipo = nomEquipo;
    }

    public int getAnhoFundacion() {
        return anhoFundacion;
    }

    public void setAnhoFundacion(int anhoFundacion) {
        this.anhoFundacion = anhoFundacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getColorCamiseta() {
        return colorCamiseta;
    }

    public void setColorCamiseta(String colorCamiseta) {
        this.colorCamiseta = colorCamiseta;
    }

    public byte getCampGanados() {
        return campGanados;
    }

    public void setCampGanados(byte campGanados) {
        this.campGanados = campGanados;
    }
    
     public Equipo(){
        
    }
 public void  agregaEquipo(List<Equipo>equipoFutbol, String nomEquipo,int anhoFundacion, String direccion , String colorCamiseta,byte campGanados){
     equipoFutbol.add(new Equipo(nomEquipo, anhoFundacion, direccion , colorCamiseta, campGanados));
 }
  public void imprimeEquipo(List<Equipo>equipoFutbol){
      for (int i=0; i <equipoFutbol.size(); i++){
          System.out.println("nombre equipo " + equipoFutbol.get(i).getNomEquipo());
          System.out.println("año fundacion " + equipoFutbol.get(i).getAnhoFundacion());
          System.out.println("Direccion " + equipoFutbol.get(i).getDireccion());
          System.out.println("color camiseta " + equipoFutbol.get(i).getColorCamiseta());
          System.out.println("campamentos ganados" + equipoFutbol.get(i).getCampGanados());
      }
}
   public void mayorCampeonato(List<Equipo>equipoFutbol){
      int mayor=0 , ind = 0;
       
      for (int i=0; i <equipoFutbol.size(); i++){
          if (equipoFutbol.get(i).getCampGanados()>mayor){
              mayor=equipoFutbol.get(i).getCampGanados();
              ind=i;
          }
          System.out.println("nombre equipo " + equipoFutbol.get(ind).getNomEquipo());
          System.out.println("año fundacion " + equipoFutbol.get(ind).getAnhoFundacion());
          System.out.println("Direccion " + equipoFutbol.get(ind).getDireccion());
          System.out.println("color camiseta " + equipoFutbol.get(ind).getColorCamiseta());
          System.out.println("campamentos ganados" + equipoFutbol.get(ind).getCampGanados());
      }
   }
   public void imprimirEquipoEspecific (List<Equipo>equipoFutbol ){
       
    String opcion= JOptionPane.showInputDialog("Digite el a cual equpo quiere que muestre la informacion");
    int indice=0;
       
      for (int i=0; i <equipoFutbol.size(); i++){
         
          }
          System.out.println("nombre equipo " + equipoFutbol.get(indice).getNomEquipo());
          System.out.println("año fundacion " + equipoFutbol.get(indice).getAnhoFundacion());
          System.out.println("Direccion " + equipoFutbol.get(indice).getDireccion());
          System.out.println("color camiseta " + equipoFutbol.get(indice).getColorCamiseta());
          System.out.println("campamentos ganados" + equipoFutbol.get(indice).getCampGanados());
      }
   }

 
