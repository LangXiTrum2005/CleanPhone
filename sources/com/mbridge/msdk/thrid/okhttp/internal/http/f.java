package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.ironsource.C0375hc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static boolean a(String str) {
        return (str.equals(C0375hc.f28788a) || str.equals("HEAD")) ? false : true;
    }

    public static boolean b(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean c(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean d(String str) {
        return str.equals(C0375hc.f28789b) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
