package com.umeng.umcrash.customlog;

import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.umeng.analytics.pro.bc;
import com.umeng.umcrash.UMCrashUtils;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class UAPMCustomLogManager {
    private static final int MAX_CACHE_SIZE = 100;
    private static final int MAX_MSG_LENGTH = 2048;
    private static final int MAX_TAG_LENGTH = 64;
    private static final String TAG = "UAPMCustomLogManager";
    private static final JSONArray jsonObjects = new JSONArray();
    private static int sCacheSize = 100;

    private static void addCustomLogs(String str, String str2, int i) {
        synchronized (UAPMCustomLogManager.class) {
            try {
                if (str.length() > 64) {
                    str = UMCrashUtils.splitByByte(str, 64);
                }
                if (str2.length() > 2048) {
                    str2 = UMCrashUtils.splitByByte(str2, 2048);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tag", str);
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str2);
                jSONObject.put("l", i);
                jSONObject.put(bc.aO, System.currentTimeMillis());
                jSONObject.put("pid", Process.myPid());
                jSONObject.put(ScarConstants.TOKEN_ID_KEY, Process.myTid());
                JSONArray jSONArray = jsonObjects;
                if (jSONArray.length() >= sCacheSize) {
                    jSONArray.remove(0);
                    jSONArray.put(jSONObject);
                } else {
                    jSONArray.put(jSONObject);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static boolean checkParams(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
    }

    public static void d(String str, String str2) {
        if (checkParams(str, str2)) {
            addCustomLogs(str, str2, 1);
        }
    }

    public static void e(String str, String str2) {
        if (checkParams(str, str2)) {
            addCustomLogs(str, str2, 4);
        }
    }

    public static String getCustomLogs() {
        String string;
        synchronized (UAPMCustomLogManager.class) {
            try {
                try {
                    string = jsonObjects.toString();
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

    public static void i(String str, String str2) {
        if (checkParams(str, str2)) {
            addCustomLogs(str, str2, 2);
        }
    }

    public static void setCache(int i) {
        sCacheSize = Math.min(i, 100);
    }

    public static void v(String str, String str2) {
        if (checkParams(str, str2)) {
            addCustomLogs(str, str2, 0);
        }
    }

    public static void w(String str, String str2) {
        if (checkParams(str, str2)) {
            addCustomLogs(str, str2, 3);
        }
    }
}
