package com.ironsource;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z4 f28089a = new Z4();

    private Z4() {
    }

    private final int a(Context context, int i10) {
        return a.a.H(i10 / context.getResources().getDisplayMetrics().density);
    }

    public final int b(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    public final int a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }
}
