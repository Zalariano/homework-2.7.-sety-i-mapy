import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        vyvodimNechetnye(nums);
        vyvodimChetnye(nums);
        List<String> words = new ArrayList<>(List.of("Katia", "i", "Roma", "guliali", "u", "doma", "Katia", "Roma"));
        vyvodimSlova(words);
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        vyvodimDubli(strings);
    }

    public static void vyvodimNechetnye(List<Integer> nums) {
        List<Integer> vyvod = new ArrayList<>();
        for (Integer i : nums) {
            if (i % 2 != 0) {
                vyvod.add(i);
            }
        }
        System.out.println(vyvod);
    }

    public static void vyvodimChetnye(List<Integer> nums) {
        List<Integer> chetnye = new ArrayList<>();
        for (Integer i : nums) {
            if (i % 2 == 0) {
                chetnye.add(i);
            }
        }
        Set<Integer> result = new TreeSet<>(chetnye);
        System.out.println(result);
    }

    public static void vyvodimSlova(List<String> words) {
        Set<String> uniqWords = new HashSet<>(words);
        System.out.println(uniqWords);
    }

    public static void vyvodimDubli(List<String> strings) {
        Map<String, Integer> dubli = new HashMap<>();
        for (String slovo : strings) {
            if (!dubli.containsKey(slovo)) {
                dubli.put(slovo, 1);
            } else {
                dubli.put(slovo, dubli.get(slovo) + 1);
            }
        }
        for (Map.Entry<String,Integer> e :dubli.entrySet()) {
            if (e.getValue() > 1){
                System.out.println(e);
            }
        }
    }
}