package main;

//import java.util.ArrayDeque;
//import java.util.Deque;
import java.util.ListIterator;
import java.util.Stack;

public class PilasAsesoria1 {

    public static void main(String[] args) {
        //Deque<Emociones> stack = new ArrayDeque<>(); 
        
        Stack<Emociones> pila = new Stack<>();

        Stack<Emociones> Triste = new Stack<>();
        Stack<Emociones> Nervioso = new Stack<>();
        Stack<Emociones> Molesto = new Stack<>();
        Stack<Emociones> Serio = new Stack<>();
        Stack<Emociones> Avergonzado = new Stack<>();

        
        pila.push(new Emociones("Ariel", 21, "Triste", "Estudiante"));
        pila.push(new Emociones("America", 22, "Nervioso", "Estudiante"));
        pila.push(new Emociones("Brayan", 19, "Molesto", "Estudiante"));
        pila.push(new Emociones("Aldair", 19, "Serio", "Estudiante"));
        pila.push(new Emociones("Cristopher", 23, "Avergonzado", "Estudiante"));
        pila.push(new Emociones("Cristopher", 23, "Avergonzado", "Estudiante"));

        pila.push(new Emociones("Israel", 35, "Triste", "Profesor"));
        pila.push(new Emociones("Miguel", 25, "Nervioso", "Obrero"));
        pila.push(new Emociones("Joel", 36, "Molesto", "Medico"));
        pila.push(new Emociones("Marcos", 45, "Serio", "Chef"));
        pila.push(new Emociones("Cristian", 18, "Avergonzado", "Dj"));

        pila.push(new Emociones("Juan", 45, "Triste", "Profesor"));
        pila.push(new Emociones("Fernanda", 26, "Nervioso", "Obrero"));
        pila.push(new Emociones("Juan", 20, "Molesto", "Obrero"));
        pila.push(new Emociones("Brandpn", 20, "Serio", "Obrero"));
        pila.push(new Emociones("Arturo", 60, "Avergonzado", "Medico"));

        System.out.println("Todos los pacientes");
        System.out.println(pila);
        System.out.println("Total de pacientes :" + pila.size() + "\n");

        Emociones AuxBuscar = new Emociones("Fernanda", 26, "Nervioso", "Obrero");
        
        System.out.println(pila.search(AuxBuscar));
        
        
        while (!pila.empty()) {
            if (pila.peek().getEstadoAnimo() == "Triste") {
                Triste.push(pila.peek());
            } else if (pila.peek().getEstadoAnimo() == "Nervioso") {
                Nervioso.push(pila.peek());
            } else if (pila.peek().getEstadoAnimo() == "Molesto") {
                Molesto.push(pila.peek());
            } else if (pila.peek().getEstadoAnimo() == "Serio") {
                Serio.push(pila.peek());
            } else if (pila.peek().getEstadoAnimo() == "Avergonzado") {
                Avergonzado.push(pila.peek());
            }
            pila.pop();
        }

//        if (pila.empty()) {
//            System.out.println();
//            System.out.println("La pila original esta vacia");
//        } else {
//            System.out.println();
//            System.out.println("La pila no esta vacia");
//        }
        System.out.println();
        System.out.println("Pacientes tristes : ");
        System.out.println(Triste);
        System.out.println("Numero de pacientes: " + Triste.size() + "\n");

        System.out.println("Pacientes nervisos: ");
        System.out.println(Nervioso);
        System.out.println("Numero de pacientes: " + Nervioso.size() + "\n");

        System.out.println("Pacientes molestos: ");
        System.out.println(Molesto);
        System.out.println("Numero de pacientes: " + Molesto.size() + "\n");

        System.out.println("Pacientes serios: ");
        System.out.println(Serio);
        System.out.println("Numero de pacientes: " + Nervioso.size() + "\n");

        System.out.println("Pacientes avergonzado: ");
        System.out.println(Avergonzado);
        System.out.println("Numero de pacientes: " + Avergonzado.size() + "\n");

        while (!Triste.empty() && !Nervioso.empty() && !Molesto.empty() && !Serio.empty() && !Avergonzado.empty()) {
            if (Triste.peek().getEstadoAnimo() == "Triste" && Nervioso.peek().getEstadoAnimo() == "Nervioso" && Molesto.peek().getEstadoAnimo() == "Molesto" && Serio.peek().getEstadoAnimo() == "Serio" && Avergonzado.peek().getEstadoAnimo() == "Avergonzado") {
                pila.push(Triste.peek());
                pila.push(Nervioso.peek());
                pila.push(Molesto.peek());
                pila.push(Serio.peek());
                pila.push(Avergonzado.peek());
            }
            Triste.pop();
            Nervioso.pop();
            Molesto.pop();
            Serio.pop();
            Avergonzado.pop();
        }

        System.out.println(pila);
        
//        //esto talvez no este bien pero busca
//       Emociones auxEmociones = new Emociones("ariel", 27, "Nervioso", "Obrero"); 
//       if(auxEmociones.getNombre().equals("ariel")){
//           System.out.println(auxEmociones.toString());
//       }
//       
       //bucar mayores de 20 años
       while(!pila.isEmpty()){
      Emociones pro = pila.pop();
       int ab = pro.getEdad();
       if (ab>=20){
        System.out.println(pro);
        }
       }
      
    }
}
