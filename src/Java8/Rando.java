package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class Rando {
    private List<String> list;
    public List<String> getList(){
        return list;
    }
    public void setList(List<String> list){
        this.list = list;
    }
    public void printList(){
        System.out.println(getList());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","3","4","5");
        Rando rando = new Rando();
        rando.setList(new ArrayList<>(list));
        rando.getList().forEach(String::new);
    }
}
