/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Familia
 */
public class Originator 
{
    private Pregunta preg;
    private Materia mate;
    private Examen exam;

    public void setPreg(Pregunta preg) {
        this.preg = preg;
    }

    public void setMate(Materia mate) {
        this.mate = mate;
    }

    public void setExam(Examen exam) {
        this.exam = exam;
    }
    
    public Memento saveToMementoExamen() 
    { 
       return new Memento(exam); 
    }
    
    public Memento saveToMementoPregunta() 
    { 
       return new Memento(preg); 
    }
    
    public Memento saveToMementoMateria() 
    { 
       return new Memento(mate); 
    }
    
    public void restoreFromMementoExamen(Memento m) 
    {
       exam = m.getExamenAnterior(); 
    }
    
    public void restoreFromMementoPregunta(Memento m) 
    {
       preg = m.getPregAnterior(); 
    }
    
    public void restoreFromMementoMateria (Memento m) 
    {
       mate = m.getMateriaAnterior(); 
    }
}
