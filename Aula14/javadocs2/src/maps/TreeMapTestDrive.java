package maps;

/**
 * TreeMapTestDrive
 */
import java.util.Map;
import java.util.TreeMap;

import models.Item;

/**
 * HashMapTestDrive
 */
public class TreeMapTestDrive {
    public static void main(String[] args) {
        Map<String, Item> itemMap = new TreeMap<>();

        //Insere elementos no mapa
        itemMap.put("Item1", new Item("Maca", 1));
        itemMap.put("Item2", new Item("Pera", 2));
        itemMap.put("Item3", new Item("Maca", 1));
        itemMap.put("Item1", new Item("Banana", 3));

        //Passa por todos os elementos
        itemMap.forEach( (chave, valor) -> System.out.println("CHave:" + chave + "\tValor:"+valor));

        System.out.println(itemMap);

        //ManipulaçÃO dos valores dentro do Map
        Item item = itemMap.get("Item2");
        System.out.println(item);
        item = itemMap.get("Goku");
        System.out.println(item);
        item = itemMap.getOrDefault("item10", new Item("Vegeta", 7999));
        System.out.println(item);
        System.out.println(itemMap);
    }

    


    
}