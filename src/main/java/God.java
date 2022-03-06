import java.util.*;

public class God {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"kk");
        hm.put(2,"II");
        Integer inferredInteger = returnType(1);
        String inferredString = returnType("String");
        System.out.println(inferredInteger);
        consumeListOfWildcardType(new ArrayList<Integer>());
        consumeListOfWildcardType(new ArrayList<String>());



    }

    public void abc(List<Integer> x, int y){}
    public int abc(List<Long> x){
        return 0;
    }

    public static <K> K returnType(K argument) {
        return argument;
    }

    public static <T> void consumeListOfWildcardType(List<T> list){
        T o = list.get(1);
    }


}



