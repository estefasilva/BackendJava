package ApuntesJava;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeListas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<List<String>> usuarios = new ArrayList<>();
        ArrayList<String> usuario1 = new ArrayList<>();
        ArrayList<String> usuario2 = new ArrayList<>();
        ArrayList<String> usuario3 = new ArrayList<>();

        usuario3.add("nombre");
        usuario3.add("edad");
        usuario3.add("correo");
        for (int i=0; i<3; i++){
            System.out.println("ingrese un dato");
            String dato= sc.nextLine();
            usuario3.add(dato);
        }
        for ( int i = 0; i < 3 ; i ++){
            List<String> nuevaLista = new ArrayList<>();
            nuevaLista.add(("Nombre" + (i + 1)));
            nuevaLista.add(("Edad" + (i + 1)));
            nuevaLista.add(("Correo" + (i + 1)));
            usuarios.add(nuevaLista);

        }
    }
}
