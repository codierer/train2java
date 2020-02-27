package com.privates;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/27 17:30
 */
public class PrivatesObject {

        private String str="private str";

        public PrivatesObject(){
            System.out.println(str);
        }

        private PrivatesObject(String str){
            System.out.println(str);
        }


}
