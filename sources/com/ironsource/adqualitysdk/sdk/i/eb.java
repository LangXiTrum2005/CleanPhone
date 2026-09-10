package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class eb {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Map<String, String> f1883 = new HashMap();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m2127(String str) {
        String str2 = f1883.get(str);
        if (str2 != null) {
            return str2;
        }
        f1883.put(str, str);
        return str;
    }
}
