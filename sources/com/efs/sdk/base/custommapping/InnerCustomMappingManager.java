package com.efs.sdk.base.custommapping;

import android.text.TextUtils;
import com.umeng.umcrash.custommapping.UAPMCustomMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class InnerCustomMappingManager {
    private static final int MAX_SIZE = 10;
    private static final int MAX_VALUE_LENGTH = 100;
    private static final String TAG = "CustomMappingManager";
    private static final JSONObject sCustomMappingObj = new JSONObject();
    private static final List<String> STRING_PARAMS_LIST = new ArrayList(Arrays.asList(UAPMCustomMapping.STRING_PARAM_1, UAPMCustomMapping.STRING_PARAM_2, UAPMCustomMapping.STRING_PARAM_3, UAPMCustomMapping.STRING_PARAM_4, UAPMCustomMapping.STRING_PARAM_5, UAPMCustomMapping.STRING_PARAM_6, UAPMCustomMapping.STRING_PARAM_7, UAPMCustomMapping.STRING_PARAM_8, UAPMCustomMapping.STRING_PARAM_9, UAPMCustomMapping.STRING_PARAM_10));

    public static String getCustomMappingJsonStr() {
        String string;
        synchronized (InnerCustomMappingManager.class) {
            try {
                try {
                    string = sCustomMappingObj.toString();
                } catch (Throwable th) {
                    th.printStackTrace();
                    return "";
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    public static String getStringParam(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || !STRING_PARAMS_LIST.contains(str)) {
            return null;
        }
        synchronized (InnerCustomMappingManager.class) {
            try {
                try {
                    str2 = (String) sCustomMappingObj.opt(str);
                } catch (Throwable th) {
                    th.printStackTrace();
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    public static boolean putStringParam(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !STRING_PARAMS_LIST.contains(str) || str2.length() > 100) {
            return false;
        }
        synchronized (InnerCustomMappingManager.class) {
            try {
                try {
                    sCustomMappingObj.put(str, str2);
                } catch (Throwable th) {
                    th.printStackTrace();
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
