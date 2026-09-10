package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.ri$ri, reason: collision with other inner class name */
    public static class C0217ri {
        static final Random ri = ri.ik();
    }

    public static String ik(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String strRi = ri(str.substring(1, 33), 32);
        String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strRi == null) ? str : com.bytedance.sdk.component.ka.ri.lr(str.substring(49), strSubstring, strRi);
    }

    public static String lr(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strRi = ri();
        String strRi2 = ri(strRi, 32);
        String strLr = lr();
        return 3 + strRi + strLr + ((strRi2 == null || strLr == null) ? null : com.bytedance.sdk.component.ka.ri.ri(str, strLr, strRi2));
    }

    public static JSONObject ri(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : ri(jSONObject.toString());
    }

    public static JSONObject ri(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String strLr = lr(str);
                    if (!TextUtils.isEmpty(strLr)) {
                        jSONObject.put(PglCryptUtils.KEY_MESSAGE, strLr);
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

    public static Random ik() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static String lr() {
        String strRi = ri(8);
        if (strRi == null || strRi.length() != 16) {
            return null;
        }
        return strRi;
    }

    public static String ri() {
        String strRi = ri(16);
        if (strRi == null || strRi.length() != 32) {
            return null;
        }
        return strRi;
    }

    public static String ri(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i) + str.substring(0, i2);
    }

    public static String ri(int i) {
        try {
            byte[] bArr = new byte[i];
            C0217ri.ri.nextBytes(bArr);
            return fi.ri(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
