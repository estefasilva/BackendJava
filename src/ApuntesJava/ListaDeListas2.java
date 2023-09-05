package ApuntesJava;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeListas2 {
    public static void main(String[] args) {

        List<List<String>> usuarios = new ArrayList<>();
        ArrayList<String> nuevousuario1 = new ArrayList<>();
        ArrayList<String> nuevousuario2 = new ArrayList<>();
        ArrayList<String> nuevousuario3 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        nuevousuario1.add("nombre");
        nuevousuario2.add("edad");
        nuevousuario3.add("correo");
        for(int i = 0; i< nuevousuario1.size(); i ++) {
            System.out.println(nuevousuario1.get(1));
        }








    }
}
