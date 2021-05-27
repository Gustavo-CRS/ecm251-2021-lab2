package linked_list_test_drive;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import models.Conta;
import models.Pessoas;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<Pessoas> pessoas = new LinkedList<>();
        pessoas.add(new Pessoas("Midoria", "999"));
        pessoas.add(new Pessoas("Levi", "170"));
        pessoas.add(0, new Pessoas("Eren", "370"));
        System.out.println("Pessoas: ");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        LinkedList<Conta> contas = new LinkedList<>();
        contas.addAll(Arrays.asList(new Conta(30), new Conta(20), new Conta(730)));
        System.out.println("Passa pela lista de contas: ");
        contas.forEach(conta -> System.out.println(conta));
        System.out.println("Passando pelos elementos com iterator: ");
        Iterator<Conta> iterator= contas.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }
    }

}
