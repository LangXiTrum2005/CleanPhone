package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aw {
    private static String ik;
    private static boolean ka;
    private static String lr;
    private static String ri;

    private static void di(Context context) {
        if (ka(context) == null) {
            return;
        }
        String strLr = ik.ri().lr("abcd", (String) null);
        if (TextUtils.isEmpty(strLr)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strLr);
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            if (iOptInt == 3) {
                String strIk = com.bytedance.sdk.component.utils.ri.ik(strOptString);
                if (TextUtils.isEmpty(strIk)) {
                    return;
                }
                ri = new JSONObject(strIk).optString("abcd");
                ri();
            }
        } catch (Throwable unused) {
        }
    }

    private static void fi(Context context) {
        if (ka || ka(context) == null) {
            return;
        }
        lr = String.valueOf(Build.TIME);
        ik = ik.ri().lr("uuid", (String) null);
        ka = true;
    }

    private static Context ka(Context context) {
        return context == null ? nr.ri() : context;
    }

    public static String lr(Context context) {
        if (lr == null && !ka) {
            synchronized (aw.class) {
                try {
                    if (!ka) {
                        fi(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lr;
    }

    public static String ri(Context context) {
        if (!TextUtils.isEmpty(ri)) {
            return ri;
        }
        di(context);
        return ri;
    }

    public static String ik(Context context) {
        if (TextUtils.isEmpty(ik) && !ka) {
            synchronized (aw.class) {
                try {
                    if (!ka) {
                        fi(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ik;
    }

    public static void ri(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(ri)) {
                ri = str;
            }
            ri();
        }
        if (TextUtils.isEmpty(ri)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.sf.ik.lr(ri);
        co.ri(ri);
    }

    public static String lr() {
        try {
            Locale locale = LocaleList.getDefault().get(0);
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String string = locale.toString();
            if (locale.toString().length() >= 5) {
                string = string.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(string)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void ri() {
        if (TextUtils.isEmpty(ri)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.dzy.ik((Runnable) new com.bytedance.sdk.component.mj.lr.ik("update_did") { // from class: com.bytedance.sdk.openadsdk.core.aw.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time", SystemClock.elapsedRealtime());
                    jSONObject.put("abcd", aw.ri);
                    ik.ri().ri("abcd", com.bytedance.sdk.component.utils.ri.ri(jSONObject).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }
}
