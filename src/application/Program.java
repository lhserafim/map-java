package application;

import entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String args[]) {
        Map<String, String> cookies = new TreeMap<>();
        // Sempre inserir chave , valor
        cookies.put("username","Luiz Henrique Serafim");
        cookies.put("email","lhserafim@gmail.com");
        cookies.put("phone","11974880000");

        cookies.remove("email");
        cookies.put("phone","43328060"); // ele sobrescreve o phone. Pois só permite 1 entrada do mesmo tipo
        System.out.println("Contains: " + cookies.containsKey("username"));

        System.out.println("ALL COOKIES");
        // Para percorrer pelo MAP
        for (String key : cookies.keySet()) { // necessário usra o keyset
            System.out.println(key + ": " + cookies.get(key));
        }

        Map<Product, Double> stock = new HashMap<>();
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);
        Product ps = new Product("Tv", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
        
    }
}
