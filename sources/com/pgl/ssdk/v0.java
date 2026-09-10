package com.pgl.ssdk;

/* JADX INFO: loaded from: classes2.dex */
public class v0 {
    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
