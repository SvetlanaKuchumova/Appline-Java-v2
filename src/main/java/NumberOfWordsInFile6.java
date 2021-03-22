import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class NumberOfWordsInFile6 {
    public static void main(String[] args) throws IOException {

        String file = "src/input/words.txt";
        FileReader fr = new FileReader(file);

        int readByte;
        String word = "";
        TreeMap<String, Integer> treeMap = new TreeMap();

        readByte = fr.read();
        while (readByte != -1) { // пока не конец файла
            if (readByte != 32) { // 32 это разделитль слов - ' '
                word = word + (char) readByte;
            }
            else if (!treeMap.containsKey(word)) { // такого значения еще не было
                treeMap.put(word, 1);
                word = "";
            } else {
                int count = treeMap.get(word);
                treeMap.put(word, ++count);
                word = "";
            }
            readByte = fr.read();
        }
        if (!treeMap.containsKey(word)) { // такого значения еще не было
            treeMap.put(word, 1);
        } else {
            int count = treeMap.get(word);
            treeMap.put(word, ++count);
        }

        System.out.println("Статистика по всем словам:");
        //System.out.println(treeMap);

        for(Map.Entry<String,Integer> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value + " шт");
        }

        System.out.println("\nСамое часто встречаемое слово:");

        // поиск самого часто встречаемого слова
        Map.Entry<String, Integer> maxEntry = null;
        for(Map.Entry<String, Integer> entry : treeMap.entrySet()){
            if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
                maxEntry = entry;
        }

        System.out.println(maxEntry.getKey() +", кол-во раз = " + maxEntry.getValue());

        fr.close();
    }
}