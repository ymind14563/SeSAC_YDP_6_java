package _07_generic._generic_prac;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }
}


public class GenericPracEx {
    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        Pair<Integer, String> pair2 = new Pair<>(2, "Two");

        System.out.println(pair1);
        System.out.println(pair2);

    }
}
