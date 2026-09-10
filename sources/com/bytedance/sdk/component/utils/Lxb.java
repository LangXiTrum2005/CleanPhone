package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0068Lxb {
        static final Random Lxb = Lxb.lk();
    }

    public static String LD(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strLxb = Lxb();
        String strLxb2 = Lxb(strLxb, 32);
        String strLD = LD();
        return AbstractC5044xl.m(ExifInterface.GPS_MEASUREMENT_3D, strLxb, strLD, (strLxb2 == null || strLD == null) ? null : com.bytedance.sdk.component.ZU.Lxb.Lxb(str, strLD, strLxb2));
    }

    public static JSONObject Lxb(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : Lxb(jSONObject.toString());
    }

    public static String lk(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String strLxb = Lxb(str.substring(1, 33), 32);
        String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strLxb == null) ? str : com.bytedance.sdk.component.ZU.Lxb.LD(str.substring(49), strSubstring, strLxb);
    }

    public static JSONObject Lxb(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            try {
                String strLD = LD(str);
                if (!TextUtils.isEmpty(strLD)) {
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, strLD);
                    jSONObject.put("cypher", 3);
                } else {
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                }
            } catch (Throwable unused) {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                jSONObject.put("cypher", 0);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return jSONObject;
    }

    public static Random lk() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static String LD() {
        String strLxb = Lxb(8);
        if (strLxb == null || strLxb.length() != 16) {
            return null;
        }
        return strLxb;
    }

    public static String Lxb() {
        String strLxb = Lxb(16);
        if (strLxb == null || strLxb.length() != 32) {
            return null;
        }
        return strLxb;
    }

    public static String Lxb(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i) + str.substring(0, i2);
    }

    public static String Lxb(int i) {
        try {
            byte[] bArr = new byte[i];
            C0068Lxb.Lxb.nextBytes(bArr);
            return JXs.Lxb(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
