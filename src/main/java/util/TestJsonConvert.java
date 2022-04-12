package util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;

import java.util.TreeMap;

public class TestJsonConvert {
//    private static Object T;
//    private static final Object T = "";

    public static JSONArray convertToJsonArray(String jsonData){

        Object object= JSONObject.parse(jsonData);
        if(null!=object&&object instanceof JSONArray){
            return JSONArray.parseArray(jsonData);
        }else {
//            log.error("无效的JSON数组格式:{}",jsonData);
            return null;
        }
    }

    public static <T> T getBean(Class<T> CLZZ){
        return null;
//         return <T> T;
    }

    public static void main(String[] args) {
        String json = "{\"meal\":\"SpecialList_c\",\"linkman_cell\":\"[\\\"15901110000\\\", \\\"15901110000\\\", \\\"15901110000\\\"]\",\"sl_user_date\":\"2021-12-24\",\"user_date\":\"2021-10-23\",\"mealStr\":\"SpecialList_c#V2.0#820\",\"linkman_cell_array\":[\"15901110000\",\"15901110000\",\"15901110000\"],\"id\":\"ClQAAAUFAQlcAwFUCwNΒ9WVQpU\",\"cell\":[\"UgpdΒ1BAJaVFMFVFQ\"],\"ifDeactivated\":0,\"_inner_customerId\":\"\"}";
        JSONArray jsonArray = convertToJsonArray(json);
        System.out.println(jsonArray);
        TreeMap<Integer,String> stringTreeMap = new TreeMap<>();
        stringTreeMap.put(1,"测试01");
        stringTreeMap.put(1,"测试02");
        System.out.println(stringTreeMap);

    }
}
