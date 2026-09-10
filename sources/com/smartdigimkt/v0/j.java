package com.smartdigimkt.v0;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38986a = "NetManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConnectivityManager f38987b;

    private j() {
    }

    public static synchronized ConnectivityManager a() {
        try {
            if (f38987b == null && com.smartdigimkt.m6.b.p().k() != null) {
                f38987b = (ConnectivityManager) com.smartdigimkt.m6.b.p().k().getSystemService("connectivity");
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
        return f38987b;
    }
}
