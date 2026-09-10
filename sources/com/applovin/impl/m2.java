package com.applovin.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f8394a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.l lVar) {
        if (f8394a) {
            return;
        }
        lVar.E().a(f2.f7836a1, "no_ads_loaded");
    }

    public static void b(com.applovin.impl.sdk.l lVar) {
        Long l = (Long) lVar.a(t3.f9784t8);
        if (l.longValue() <= 0) {
            return;
        }
        lVar.s0().a(new u6(lVar, true, "submitIntegrationErrorReport", new p9(0, lVar)), f6.b.OTHER, TimeUnit.SECONDS.toMillis(l.longValue()));
    }

    public static void a() {
        f8394a = true;
    }
}
