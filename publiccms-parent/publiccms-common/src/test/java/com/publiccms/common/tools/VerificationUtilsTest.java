package com.publiccms.common.tools;

/**
 * Created by heshen on 2018/12/4.
 */

class VerificationUtilsTest {


    public static void main(String[] args){
        String str = VerificationUtils.md5Encode("admin");
        System.out.println(str);
        // 21232f297a57a5a743894a0e4a801fc3
        // 21232f297a57a5a743894a0e4a801fc3
    }
}