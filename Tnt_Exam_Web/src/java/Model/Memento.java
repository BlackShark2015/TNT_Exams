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
class Memento 
{
    private Pregunta pregAnterior;
    private Materia materiaAnterior;
    private Examen examenAnterior;

    public Memento(Pregunta pregAnterior) {
        this.pregAnterior = pregAnterior;
    }

    public Memento(Materia materiaAnterior) {
        this.materiaAnterior = materiaAnterior;
    }

    public Memento(Examen examenAnterior) {
        this.examenAnterior = examenAnterior;
    }

    
    public Pregunta getPregAnterior() {
        return pregAnterior;
    }

    public void setPregAnterior(Pregunta pregAnterior) {
        this.pregAnterior = pregAnterior;
    }

    public Materia getMateriaAnterior() {
        return materiaAnterior;
    }

    public void setMateriaAnterior(Materia materiaAnterior) {
        this.materiaAnterior = materiaAnterior;
    }

    public Examen getExamenAnterior() {
        return examenAnterior;
    }

    public void setExamenAnterior(Examen examenAnterior) {
        this.examenAnterior = examenAnterior;
    }
    
    public Memento saveToMementoExamen() 
    { 
       return new Memento(examenAnterior); 
    }
    
    public Memento saveToMementoMateria() 
    { 
       return new Memento(materiaAnterior); 
    }
    public Memento saveToMementoPregunta() 
    { 
       return new Memento(pregAnterior); 
    }
    
}
