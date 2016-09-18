package util;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.*;

public final class TestUtil {
//        private static Properties prop = new Properties();
//    static {
//        InputStream in = Object.class.getResourceAsStream("/conf.properties");
//        try {
//            prop.load(in);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static String getConfig(String key){
//        return prop.getProperty(key);
//    }
//
//    private static final String NULL = "null";
//    @SuppressWarnings("unchecked")
//    public static String makeSignInParams(Map<String,Object> params, String signKey){
//        List<String> signSrc = new ArrayList<>();// 声明一个list，保存所有请求参数值
//        if (params.size() > 0 && params != null) {
//            for (Map.Entry<String, Object> entry : params.entrySet()) {
//                Object o = entry.getValue();
//                if(o == null){
//                    signSrc.add(NULL);
//                }else if (o instanceof Collection) {// 如果是集合或数组类型，把集合中的每个元素填充到list
//                    for (Object c : (Collection<?>) o) {
//                        signSrc.add(c.toString());
//                    }
//                } else if (o.getClass().isArray()) {
//                    for (int i = 0, l = Array.getLength(o); i < l; i++) {
//                        signSrc.add(Array.get(o, i).toString());
//                    }
//                } else if (o instanceof Map){
//                    for(Map.Entry<String,Object> e:((Map<String,Object>)o).entrySet()){
//                        signSrc.add(e.getKey()+e.getValue());
//                    }
//                } else {
//                    signSrc.add(o.toString());// 如果参数值不是集合或数组直接填充到list
//                }
//            }
//            signSrc.add(signKey);
//            Collections.sort(signSrc);// 把list按字符序排序
//            StringBuilder signContent = new StringBuilder();
//            for (int i = 0, l = signSrc.size(); i < l; i++) {// 把所有请求参数构造成一个字符串
//                signContent.append(signSrc.get(i));
//            }
//            String signStr=signContent.toString();
////            String sign=MessageDigestUtil.sha1Base64(signStr);// 计算请求参数的SHA-1
//            params.put("sign", sign);
//            return sign;
//        }
//        return null;
//    }
}


