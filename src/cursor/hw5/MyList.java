package cursor.hw5;

import java.util.ArrayList;
import java.util.List;

public class MyList <T extends Number> {
    List<T> tList;
    public MyList(){
        tList = new ArrayList<>();
    }
    public void add(T param){
        tList.add(param);
    }

    public T theLargest() {
        if (tList.size() < 1) {
            return null;
        }
        T theLargestParam = tList.get(0);
        for (T param : tList) {
            if (theLargestParam.doubleValue() < param.doubleValue()) {
                theLargestParam = param;
            }
        } return theLargestParam;
    }
    public T smallest(){
        if(tList.size() < 1){
            return null;
        }
        T smallestParam = tList.get(0);
        for (T param : tList){
            if (smallestParam.doubleValue() > param.doubleValue()){
                smallestParam = param;
            }
        } return smallestParam;
    }
}
