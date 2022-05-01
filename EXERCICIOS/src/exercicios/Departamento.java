/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.ArrayList;

/**
 *
 * @author ELIANE
 */
public class Departamento {
    private int Codigo;
    private String Nome;
    ArrayList<funcionario> ListaFunc;

    public Departamento() {
        ListaFunc = new ArrayList();
    }
    

    public Departamento(int Codigo, String Nome) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        ListaFunc = new ArrayList();
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<funcionario> getListaFunc() {
        return ListaFunc;
    }

    public void setListaFunc(ArrayList<funcionario> ListaFunc) {
        this.ListaFunc = ListaFunc;
    }
    
    
    
    
            
    
}
