package com.p004ironsource;

import android.util.Base64;
import com.p004ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes5.dex */
public class me {
    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 0), "UTF-8");
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return "";
        }
    }

    public static String b(String str) {
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
