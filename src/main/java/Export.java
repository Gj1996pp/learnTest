import java.text.SimpleDateFormat;
import java.util.Date;


public class Export {
    public static void main(String[] args) {
        String sl = " private String category;\n" +
                "\n" +
                "    private String sublicenseType;\n" +
                "\n" +
                "    private String cl;\n" +
                "\n" +
                "    private String riskA;\n" +
                "\n" +
                "    private String lu;\n" +
                "\n" +
                "    private String ld;\n" +
                "\n" +
                "    private String priority;\n" +
                "\n" +
                "    private String loanT;\n" +
                "\n" +
                "    private String number;\n" +
                "\n" +
                "    private String ifDzydk;\n" +
                "\n" +
                "    private String ifCredit;\n" +
                "\n" +
                "    private String ifBnaro;\n" +
                "\n" +
                "    //失效时间\n" +
                "    private String otime;\n" +
                "\n" +
                "    //借款金额\n" +
                "    private String lm;\n" +
                "\n" +
                "    //每期应还款金额\n" +
                "    private String pm;\n" +
                "\n" +
                "    //本期应还款金额\n" +
                "    private String rp;\n" +
                "\n" +
                "    //借新还旧标签失效时间\n" +
                "    private String bt;\n" +
                "\n" +
                "    //dzydk_time抵质押贷失效时间\n" +
                "    private String dTime;";
//        test02(sl);
//        String ss = "dayDiff";
//        String className = "usuryTypeBeanTestor";
//        test(className,ss);
//        test(className,"effectCountKeys");
//        test(className,"effectMonthKeys");
        test("usuryFilterDataImplTestor","TreeMap");
//        test("ss");
//        test(className,"ss");
        test("","");
    }

    /**
     * 实体变量
     * @param sl sl
     **/
    public static void test02(String className, String sl){
        String[] split = sl.split(";");
        for (String s : split) {
            int i = s.lastIndexOf(" ");
            String substring = s.substring(i+1, s.length());
//            String s1 = captureName(substring);
//            System.out.println(s1);
            test(className,substring);
        }

    }

    public static void test(String className,String methord1){
        String methord = captureName(methord1);
//        System.out.println("@Test(description = \"覆盖set"+methord+"、get"+methord+"方法\")\n" +
//                "    public void testSet"+methord+"001(){\n" +
//                "        String input = \""+methord+"\";\n" +
//                "        totalLoanStrDtoTester.set"+methord+"(input);\n" +
//                "        String result = totalLoanStrDtoTester.get"+methord+"();\n" +
//                "        Assert.assertEquals(result,input);\n" +
//                "    }");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String format = simpleDateFormat.format(new Date());
        String description = " /**\n" +
                "     * 作者：jie.gao1\n" +
                "     * 时间："+format+"\n" +
                "     * 测试对象：simpleClassName,testSet"+methord+"001\n" +
                "     * 用例说明：覆盖set"+methord+"、get"+methord+"方法\n" +
                "     * 测试类型：覆盖测试\n" +
                "     **/\n" +
                "    @Test(description = \"覆盖set"+methord+"、get"+methord+"方法\")\n" +
                "    public void testSet"+methord+"001(){\n" +
                "        String input = \""+methord+"\";\n" +
                "        "+className+".set"+methord+"(input);\n" +
                "        String result = "+className+".get"+methord+"();\n" +
                "        Assert.assertEquals(result,input);\n" +
                "    }";
        System.out.println(description);


    }



    //首字母转大写
    private static String captureName(String str) {
        // 进行字母的ascii编码前移，效率要高于截取字符串进行转换的操作
        char[] cs=str.toCharArray();
        cs[0]-=32;
        return String.valueOf(cs);
    }

    //首字母转小写
    public static String toLowerCaseFirstOne(String s){
        if(Character.isLowerCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    }


    //首字母转大写
    public static String toUpperCaseFirstOne(String s){
        if(Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }

}
