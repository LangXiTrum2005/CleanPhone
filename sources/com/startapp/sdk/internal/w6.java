package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AdCallbacksConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w6 {
    public static void a(String str, boolean z2, String str2, String str3) {
        AdCallbacksConfig adCallbacksConfigA;
        try {
            AnalyticsConfig analyticsConfigH = MetaData.E().h();
            if (analyticsConfigH != null && (adCallbacksConfigA = analyticsConfigH.a()) != null) {
                if ((adCallbacksConfigA.a() || z2) && adCallbacksConfigA.a(str)) {
                    g9 g9Var = new g9(h9.d);
                    g9Var.d = "adCallback";
                    g9Var.f41004i = str;
                    g9Var.g = str2;
                    g9Var.f41002e = str3;
                    g9Var.a();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
