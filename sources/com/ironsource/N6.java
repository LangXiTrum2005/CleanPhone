package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class N6 {
    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 0), "UTF-8");
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    public static String b(String str) {
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
