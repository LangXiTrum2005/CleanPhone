package com.smartdigimkt.c5;

import com.smartdigimkt.sdk.api.business.express.IExpressAdManager;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile IExpressAdManager f34297a;

    public static void a(IExpressAdManager iExpressAdManager) {
        f34297a = iExpressAdManager;
    }

    public static boolean b() {
        try {
            return f34297a != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static IExpressAdManager a() {
        return f34297a;
    }
}
