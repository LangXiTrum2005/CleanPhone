package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class sLN {
    private static String LD;
    private static String Lxb;
    private static boolean ZU;
    private static String lk;

    @RequiresPermission(anyOf = {"android.permission.ACCESS_WIFI_STATE"})
    @SuppressLint({"HardwareIds"})
    private static void JXs(Context context) {
        Context contextZU;
        if (ZU || (contextZU = ZU(context)) == null) {
            return;
        }
        LD = String.valueOf(Build.TIME);
        lk = lk.Lxb(contextZU).LD("uuid", (String) null);
        ZU = true;
    }

    public static String LD(Context context) {
        if (LD == null && !ZU) {
            synchronized (sLN.class) {
                try {
                    if (!ZU) {
                        JXs(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return LD;
    }

    public static String Lxb(Context context) {
        if (!TextUtils.isEmpty(Lxb)) {
            return Lxb;
        }
        lc(context);
        return Lxb;
    }

    private static Context ZU(Context context) {
        return context == null ? kqm.Lxb() : context;
    }

    private static void lc(Context context) {
        Context contextZU = ZU(context);
        if (contextZU == null) {
            return;
        }
        String strLD = lk.Lxb(contextZU).LD("abcd", (String) null);
        if (TextUtils.isEmpty(strLD)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strLD);
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            if (iOptInt == 3) {
                String strLk = com.bytedance.sdk.component.utils.Lxb.lk(strOptString);
                if (TextUtils.isEmpty(strLk)) {
                    return;
                }
                Lxb = new JSONObject(strLk).optString("abcd");
                Lxb();
            }
        } catch (Throwable unused) {
        }
    }

    public static String lk(Context context) {
        if (TextUtils.isEmpty(lk) && !ZU) {
            synchronized (sLN.class) {
                try {
                    if (!ZU) {
                        JXs(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lk;
    }

    public static void Lxb(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(Lxb)) {
                Lxb = str;
            }
            Lxb();
        }
        if (TextUtils.isEmpty(Lxb)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.QAg.lk.LD(Lxb);
        JVA.Lxb(Lxb);
    }

    public static String LD() {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
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

    public static void Lxb() {
        if (TextUtils.isEmpty(Lxb)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.hg.LD(new com.bytedance.sdk.component.OY.OY("update_did") { // from class: com.bytedance.sdk.openadsdk.core.sLN.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time", SystemClock.elapsedRealtime());
                    jSONObject.put("abcd", sLN.Lxb);
                    lk.Lxb(kqm.Lxb()).Lxb("abcd", com.bytedance.sdk.component.utils.Lxb.Lxb(jSONObject).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }
}
