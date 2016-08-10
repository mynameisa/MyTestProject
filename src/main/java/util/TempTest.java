package util;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Administrator on 2016/6/24.
 */
public class TempTest {
    public static void main(String[] args) {
        Integer a=1;
        Map<String,Object> map = new HashMap<>();
        map.put("a",1);
        if("1".equals(map.get("a").toString())){
            System.out.println("abc");
        }
    }
}
