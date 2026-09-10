package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q7 extends y7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c8 f23892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(c8 c8Var) {
        super(c8Var, true);
        Objects.requireNonNull(c8Var);
        this.f23892e = c8Var;
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final void a() {
        c8 c8Var = this.f23892e;
        if (c8Var.f23359g >= 170) {
            y6 y6Var = c8Var.f23358f;
            k9.c0.h(y6Var);
            y6Var.resetAnalyticsDataWithElapsedTime(this.f24171a, this.f24172b);
        } else {
            y6 y6Var2 = c8Var.f23358f;
            k9.c0.h(y6Var2);
            y6Var2.resetAnalyticsData(this.f24171a);
        }
    }
}
