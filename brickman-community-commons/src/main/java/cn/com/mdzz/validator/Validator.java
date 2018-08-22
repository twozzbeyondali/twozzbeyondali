package cn.com.mdzz.validator;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class Validator {

    private static final String MOBILE_REGEX = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";

    public static boolean isMobile(String mobile) {

        if (StringUtils.isEmpty(mobile)) {
            return false;
        }

        if (mobile.length() != 11) {
            return false;
        }

        return Pattern.matches(MOBILE_REGEX,mobile);

    }

}
