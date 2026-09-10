package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h8 f14885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f14886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14887c;

    public q8(h8 googleAdvertisingId, f1 amazonAdvertisingId, String manufacturer) {
        Intrinsics.f(googleAdvertisingId, "googleAdvertisingId");
        Intrinsics.f(amazonAdvertisingId, "amazonAdvertisingId");
        Intrinsics.f(manufacturer, "manufacturer");
        this.f14885a = googleAdvertisingId;
        this.f14886b = amazonAdvertisingId;
        this.f14887c = manufacturer;
    }

    public final d1 a() {
        try {
            return b() ? this.f14886b.b() : this.f14885a.b();
        } catch (Exception e2) {
            za.b("getAdvertisingId error", e2);
            return new d1(kh.TRACKING_UNKNOWN, "");
        }
    }

    public final boolean b() {
        return "Amazon".equalsIgnoreCase(this.f14887c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q8(h8 h8Var, f1 f1Var, String MANUFACTURER, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.e(MANUFACTURER, "MANUFACTURER");
        }
        this(h8Var, f1Var, MANUFACTURER);
    }

    public final String a(Context context, boolean z2) {
        Intrinsics.f(context, "context");
        String strA = a6.a(context, z2);
        Intrinsics.e(strA, "getUniqueId(...)");
        return strA;
    }
}
