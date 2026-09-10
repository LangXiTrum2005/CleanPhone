package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.smartdigimkt.d2.a;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class fs {
    private static String lnr;
    private static boolean mml;
    private static String qdl;
    private static String ud;

    private static Context mml(Context context) {
        return context == null ? yt.qdl() : context;
    }

    private static void mo(Context context) {
        if (mml(context) == null) {
            return;
        }
        String strUd = lnr.qdl().ud("abcd", (String) null);
        if (TextUtils.isEmpty(strUd)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strUd);
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            if (iOptInt == 3) {
                String strLnr = com.bytedance.sdk.component.utils.qdl.lnr(strOptString);
                if (TextUtils.isEmpty(strLnr)) {
                    return;
                }
                qdl = new JSONObject(strLnr).optString("abcd");
                qdl();
            }
        } catch (Throwable unused) {
        }
    }

    private static void mzz(Context context) {
        if (mml || mml(context) == null) {
            return;
        }
        ud = String.valueOf(Build.TIME);
        lnr = lnr.qdl().ud("uuid", (String) null);
        mml = true;
    }

    public static String qdl(Context context) {
        if (!TextUtils.isEmpty(qdl)) {
            return qdl;
        }
        mo(context);
        return qdl;
    }

    public static String ud(Context context) {
        if (ud == null && !mml) {
            synchronized (fs.class) {
                try {
                    if (!mml) {
                        mzz(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ud;
    }

    public static String lnr(Context context) {
        if (TextUtils.isEmpty(lnr) && !mml) {
            synchronized (fs.class) {
                try {
                    if (!mml) {
                        mzz(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lnr;
    }

    public static void qdl(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(qdl)) {
                qdl = str;
            }
            qdl();
        }
        if (TextUtils.isEmpty(qdl)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.to.lnr.ud(qdl);
        rq.qdl(qdl);
    }

    public static String ud() {
        try {
            Locale locale = LocaleList.getDefault().get(0);
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !a.S.equals(language)) {
                return language;
            }
            String string = locale.toString();
            if (locale.toString().length() >= 5) {
                string = string.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(string)) {
                return a.S;
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void qdl() {
        if (TextUtils.isEmpty(qdl)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.fco.ud(new com.bytedance.sdk.component.jpc.jpc("update_did") { // from class: com.bytedance.sdk.openadsdk.core.fs.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time", SystemClock.elapsedRealtime());
                    jSONObject.put("abcd", fs.qdl);
                    lnr.qdl().qdl("abcd", com.bytedance.sdk.component.utils.qdl.qdl(jSONObject).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }
}
