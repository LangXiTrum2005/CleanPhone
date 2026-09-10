package com.p004ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class dw {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<String, String> f1815 = new HashMap();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2051(String str) {
        String str2 = f1815.get(str);
        if (str2 != null) {
            return str2;
        }
        f1815.put(str, str);
        return str;
    }
}
