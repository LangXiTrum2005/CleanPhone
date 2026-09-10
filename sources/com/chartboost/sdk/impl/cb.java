package com.chartboost.sdk.impl;

import android.content.Context;
import com.iab.omid.library.chartboost.adsession.Partner;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final id f13589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f13590c;
    public Long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f13591e;
    public Integer f;
    public Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f13592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f13593i;
    public String j;

    public cb(Context androidContext, id openMeasurementManager, p2 identity) {
        Intrinsics.f(androidContext, "androidContext");
        Intrinsics.f(openMeasurementManager, "openMeasurementManager");
        Intrinsics.f(identity, "identity");
        this.f13588a = androidContext;
        this.f13589b = openMeasurementManager;
        this.f13590c = identity;
    }

    public final bb a() {
        int iIntValue;
        Long l2 = this.d;
        long jLongValue = l2 != null ? l2.longValue() : System.currentTimeMillis();
        Integer num = this.f13591e;
        int iIntValue2 = num != null ? num.intValue() : Random.f43340Y.e(100000000);
        String packageName = this.f13593i;
        if (packageName == null) {
            packageName = this.f13588a.getPackageName();
        }
        String str = packageName;
        String strD = this.j;
        if (strD == null) {
            Partner partnerC = this.f13589b.c();
            strD = partnerC != null ? android.support.v4.media.a.D(partnerC.getName(), "/", partnerC.getVersion()) : null;
            if (strD == null) {
                strD = "unknown";
            }
        }
        String str2 = strD;
        Integer num2 = this.f13592h;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = this.f13590c.h().f() == kh.TRACKING_LIMITED ? 1 : 0;
        }
        Integer num3 = this.f;
        Integer num4 = this.g;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Intrinsics.c(str);
        return new bb(jLongValue, iIntValue2, num3, num4, numValueOf, str, str2);
    }

    public final void b(Integer num) {
        this.g = num;
    }

    public final void a(Integer num) {
        this.f = num;
    }
}
