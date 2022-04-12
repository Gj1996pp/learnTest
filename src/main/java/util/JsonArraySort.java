package util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.deserializer.ParseProcess;



public class JsonArraySort {

    public static void main(String[] args) {
        String jsonArrStr = "[ { \"ID\": \"2016-05-25\", \"Name\": \"Fargo Chan\" },{ \"ID\": \"2016-05-23\", \"Name\": \"Aaron Luke\" },{ \"ID\": \"2016-05-26\", \"Name\": \"Dilip Singh\" }]";
        System.out.println("排序前："+jsonArrStr);
        String jsonArraySort = jsonArraySort(jsonArrStr);
        System.out.println("排序后："+jsonArraySort);
    }

    /**
     * 按照JSONArray中的对象的某个字段进行排序(采用fastJson)
     *
     * @param jsonArrStr
     *            json数组字符串
     *
     */
    public static String jsonArraySort(String jsonArrStr) {
        JSONArray jsonArr = JSON.parseArray(jsonArrStr);
        JSONArray sortedJsonArray = new JSONArray();
        List<JSONObject> jsonValues = new ArrayList<JSONObject>();
        for (int i = 0; i < jsonArr.size(); i++) {
            jsonValues.add(jsonArr.getJSONObject(i));
        }
        Collections.sort(jsonValues, new Comparator<JSONObject>() {
            // You can change "Name" with "ID" if you want to sort by ID
            private static final String KEY_NAME = "ID";

            @Override
            public int compare(JSONObject a, JSONObject b) {
                String valA = new String();
                String valB = new String();
                try {
                    // 这里是a、b需要处理的业务，需要根据你的规则进行修改。
                    String aStr = a.getString(KEY_NAME);
                    valA = aStr.replaceAll("-", "");
                    String bStr = b.getString(KEY_NAME);
                    valB = bStr.replaceAll("-", "");
                } catch (JSONException e) {
                    // do something
                }
                return -valA.compareTo(valB);
                // if you want to change the sort order, simply use the following:
                // return -valA.compareTo(valB);
            }
        });
        for (int i = 0; i < jsonArr.size(); i++) {
            sortedJsonArray.add(jsonValues.get(i));
        }
        return sortedJsonArray.toString();
    }




}
