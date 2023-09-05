package ApuntesJava;

import java.util.ArrayList;
import java.util.List;

public class ListaDeListas {
    public static void main(String[] args) {

      List<List<String>> usuarios = new ArrayList<>();
      ArrayList<String> usuario1 = new ArrayList<>();
      ArrayList<String> usuario2 = new ArrayList<>();

      usuario1.add("Maria");
      usuario1.add("12");
      usuario1.add("maria@mail.com");

      usuario2.add("Pepito");
      usuario2.add("15");
      usuario2.add("pepito@mail.com");
      for (int i = 0; i< usuario1.size(); i ++){
        System.out.println(usuario1.get(1));
      }
        for (int i = 0; i< usuario2.size(); i ++) {
            System.out.println(usuario2.get(1));
        }
        //podemos hacer busquedas dentro de los arrays
        System.out.println(usuario1.indexOf("12"));
        int resp = usuario1.lastIndexOf("maria@mail.com");
        if (resp!= 1) {
            System.out.println("usuario encontrado");
            System.out.println("la posicion es :" + usuario1.indexOf("maria@mail.com"));
        } else{
            System.out.println("usuario no encontrado");
        }
//vamos a adicionar los arraylist a la lista de listas
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        int positionList = usuarios.indexOf(usuario2);
        System.out.println(positionList);
        for(List<String> usuario: usuarios){
            for (String dato: usuario){
                System.out.println(dato + "");
            }
            System.out.println();
        }

        }
    }


