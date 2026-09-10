package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2987db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f23526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C3259ub f23527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SignalsConfig f23528c;
    public static int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Lazy f23529e;

    static {
        LinkedHashMap linkedHashMap = O2.f23027a;
        f23528c = (SignalsConfig) AbstractC3174p5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null);
        f23529e = LazyKt.b(C2970cb.f23494a);
    }

    public static boolean a(Context context) {
        boolean zO;
        short s;
        Intrinsics.f(context, "context");
        if (!L3.G()) {
            return false;
        }
        if (!((Boolean) f23529e.getX()).booleanValue()) {
            AbstractC3100kb.a(new C3036gb((short) 2230));
            return false;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.e(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            zO = CollectionsKt.o(f23528c.getPurchases().getVersionList(), string);
            if (!zO) {
                AbstractC3100kb.a(new C3068ib(string));
            }
        } catch (Exception unused) {
            zO = false;
        }
        if (!zO) {
            return false;
        }
        int i2 = d;
        if (i2 != 1 && i2 != 2) {
            return true;
        }
        if (i2 != 1) {
            s = i2 != 2 ? (short) 0 : (short) 2232;
        } else {
            s = 2231;
        }
        AbstractC3100kb.a(new C3036gb(s));
        return false;
    }
}
