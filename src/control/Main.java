package control;

import model.Animal;
import model.Cao;
import model.Gato;

import java.util.ArrayList;

public class Main {
  public static void main(String [] args) {
    ArrayList<Animal> animais = new ArrayList<>();
    animais.add(new Gato());
    animais.add(new Cao());

    for (int i = 0; i < animais.size(); i++) {
      animais.get(i).fazBarulho();
    }
  }
}
