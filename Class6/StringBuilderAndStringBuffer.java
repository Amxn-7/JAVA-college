public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        //Speed test by str
        String str = "";
        long startingString = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            str+="abc";
        }
        long endString = System.currentTimeMillis();
        System.out.println("Time taken by string: "+(endString-startingString)+"ms");

        //speed test with string builder
        StringBuilder sb = new StringBuilder("");
        long StartstringBulder = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            sb = sb.append("abc");
        }
        long endStringBuilder = System.currentTimeMillis();
        System.out.println("Time taken by stringBuilder: "+(endStringBuilder-StartstringBulder)+"ms");

        //speed test with string buffer
        StringBuffer st3 = new StringBuffer("");
        long startstringBuffer = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            st3 = st3.append("abc");
        }
        long endstringBuffer = System.currentTimeMillis();
        System.out.println("Time taken by string buffer: "+(endstringBuffer-startstringBuffer)+"ms");
    }
}