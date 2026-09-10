package com.umeng.umcrash.custominfo;

import android.text.TextUtils;
import com.efs.sdk.memleaksdk.MemLeakManager;
import com.umeng.crash.UCrash;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class UAPMCustomInfo {
    private static final String TAG = "UAPMCustomInfo";
    private static Map<String, String> sCustomInfo = new ConcurrentHashMap();

    public static void addCustomInfo(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (sCustomInfo.containsKey(str) || sCustomInfo.size() < 10) {
            sCustomInfo.put(str, str2);
        }
        JSONObject jSONObject = new JSONObject(sCustomInfo);
        UCrash.addHeader("um_custom_info", jSONObject.toString());
        MemLeakManager.setUMCustomInfo(jSONObject.toString());
    }
}
