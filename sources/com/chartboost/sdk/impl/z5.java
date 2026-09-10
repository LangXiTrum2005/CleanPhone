package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f6 f15703b;

    public z5(Context context, f6 displayMeasurement) {
        Intrinsics.f(context, "context");
        Intrinsics.f(displayMeasurement, "displayMeasurement");
        this.f15702a = context;
        this.f15703b = displayMeasurement;
    }

    public final int a() {
        Integer numB = a6.b(this.f15702a);
        Intrinsics.e(numB, "getOpenRTBDeviceType(...)");
        return numB.intValue();
    }

    public final String b() {
        String strD = a6.d(this.f15702a);
        Intrinsics.e(strD, "getType(...)");
        return strD;
    }

    public final boolean c() {
        return qd.c(this.f15702a, this.f15703b);
    }
}
