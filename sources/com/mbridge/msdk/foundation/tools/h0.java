package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f34127a;

    public static synchronized ConnectivityManager a() {
        try {
            if (f34127a == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                f34127a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
            }
        } catch (Exception e10) {
            q0.b("NetManager", e10.getMessage());
        }
        return f34127a;
    }
}
