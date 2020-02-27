/**
 * @author zac
 * @description: to test the inter class
 * @data 2020 2020/2/26 21:11
 */
public class InterClass {

    private class Inter{
        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        private String str;


    }

    public InterClass(){
        new Inter();
    }

}
