package mx.uv.facing.iinf.poo;

public class Main {
    
    public static void main (String [] args) {
        Stack<Student> students = new Stack<> (3);
        students.push (new Student ("Leia", "Organa"));
        students.push (new Student ("Han", "Solo"));
        students.push (new Student ("Ben", "Solo"));
        
        System.out.println (students.pop ());
        System.out.println (students.pop ());
        
        Stack<Integer> enteros = new Stack<> (3);
        enteros.push (7);
        enteros.push (10);
        enteros.push (24);
        
        System.out.println (enteros.pop ());
        System.out.println (enteros.pop ());
    }
    
}

class Student {
    private String name;
    private String lastName;    
    
    public Student () {}
    
    public Student (String n, String l) {
        name = n;
        lastName = l;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
        // String.format ("nombre: %s apellidos: %s, %d", this.name, this.lastName, this.edad);
    }   
    
    
    
}