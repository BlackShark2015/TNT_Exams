/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Familia
 */
public class Caretaker 
{   
       private ArrayList<Pregunta> estadoPregunta = new ArrayList<Pregunta>();
       private ArrayList<Materia> estadoMateria = new ArrayList<Materia>();
       private ArrayList<Examen> estadoExamen = new ArrayList<Examen>();
       
       public void addMementoPregunta (Memento memoria)
       {
           estadoPregunta.add(memoria.getPregAnterior());
       }
       public void addMementoMateria(Memento memoria)
       {
           estadoMateria.add(memoria.getMateriaAnterior());
       }
       public void addMementoExamen(Memento memoria)
       {
           estadoExamen.add(memoria.getExamenAnterior());
       }
       
       public Pregunta getMementoPregunta(int index)
       {
           return estadoPregunta.get(index);
       }
       public Materia getMementoMateria(int index)
       {
           return estadoMateria.get(index);
       }
       public Examen getMementoExamen(int index)
       {
           return estadoExamen.get(index);
       }
}
