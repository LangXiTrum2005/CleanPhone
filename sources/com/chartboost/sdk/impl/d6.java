package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes3.dex */
public final class d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d6 f13685a = new d6();

    public final float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public final int a(int i2, Context context) {
        Intrinsics.f(context, "context");
        float fA = a(context);
        if (fA == 0.0f) {
            return 0;
        }
        return MathKt.b(i2 / fA);
    }
}
