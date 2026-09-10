package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n5 implements t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14534a;

    public n5(Context context) {
        Intrinsics.f(context, "context");
        this.f14534a = context.getResources().getDisplayMetrics().density;
    }

    @Override // com.chartboost.sdk.impl.t5
    public int a(double d) {
        return (int) (d * ((double) this.f14534a));
    }

    @Override // com.chartboost.sdk.impl.t5
    public int a(int i2) {
        return (int) (i2 * this.f14534a);
    }
}
