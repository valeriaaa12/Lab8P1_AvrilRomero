/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap8p1_avrilromero;

/**
 *
 * @author rodge
 */
public class Libro {
    private String titulo;
    private String escritor;
    private String year;
    
    public Libro(){

    }
    public Libro(String tituloN,String escritorN,String yearN){
        this.titulo=tituloN;
        this.escritor=escritorN;
        this.year=yearN;
    }
    public void setTitulo(String tituloN){
        this.titulo=tituloN;
    }
    public String getTitulo(){
        return titulo;
    }
     public void setEscritor(String escritorN){
        this.escritor=escritorN;
    }
    public String getEscritor(){
        return escritor;
    }
    public void setYear(String yearN){
        this.year=yearN;
    }
    public String getYear(){
        return year;
    }
    
}
