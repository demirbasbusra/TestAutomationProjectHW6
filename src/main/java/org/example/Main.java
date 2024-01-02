package org.example;

import java.util.HashSet;
import java.util.Set;

import static org.example.UniqueCharactersFinder.findUniqueCharacters;

public class Main {
    public static void main(String[] args) {

        /*
        Bir dizi metni dolaşan bir algoritma oluşturun; her metin, tüm karakterlerin tekrar edilebilirliğini kontrol eder,
        ardından gerekli iki kelime bulunduğunda işlemi sonlandırır ve bu kelimelerin karakterlerinden benzersiz bir karakter kümesi döndürür.
         */
        String[] texts = {
                "TWhat is Lorem Ipsum?\n" +
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                        " when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                        "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                        "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages," +
                        " and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        };

        String[] targetWords = {"lorem", "Ipsum"};

        Set<Character> result = findUniqueCharacters(texts, targetWords);

        if (!result.isEmpty()) {
            System.out.println("Unique characters: " + result);
        } else {
            System.out.println("Target words not found.");
        }

    }
}