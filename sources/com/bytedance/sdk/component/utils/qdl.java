package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qdl {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.qdl$qdl, reason: collision with other inner class name */
    public static class C0094qdl {
        static final Random qdl = qdl.lnr();
    }

    public static String lnr(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String strQdl = qdl(str.substring(1, 33), 32);
        String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strQdl == null) ? str : com.bytedance.sdk.component.mml.qdl.ud(str.substring(49), strSubstring, strQdl);
    }

    public static JSONObject qdl(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : qdl(jSONObject.toString());
    }

    public static String ud(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strQdl = qdl();
        String strQdl2 = qdl(strQdl, 32);
        String strUd = ud();
        return a.o("3", strQdl, strUd, (strQdl2 == null || strUd == null) ? null : com.bytedance.sdk.component.mml.qdl.qdl(str, strUd, strQdl2));
    }

    public static JSONObject qdl(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String strUd = ud(str);
                    if (!TextUtils.isEmpty(strUd)) {
                        jSONObject.put(PglCryptUtils.KEY_MESSAGE, strUd);
                        jSONObject.put("cypher", 3);
                        return jSONObject;
                    }
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                    return jSONObject;
                } catch (Throwable unused) {
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                    return jSONObject;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return jSONObject;
    }

    public static Random lnr() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static String qdl() {
        String strQdl = qdl(16);
        if (strQdl == null || strQdl.length() != 32) {
            return null;
        }
        return strQdl;
    }

    public static String ud() {
        String strQdl = qdl(8);
        if (strQdl == null || strQdl.length() != 16) {
            return null;
        }
        return strQdl;
    }

    public static String qdl(String str, int i2) {
        if (str == null || str.length() != i2) {
            return null;
        }
        int i3 = i2 / 2;
        return str.substring(i3, i2) + str.substring(0, i3);
    }

    public static String qdl(int i2) {
        try {
            byte[] bArr = new byte[i2];
            C0094qdl.qdl.nextBytes(bArr);
            return mzz.qdl(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
