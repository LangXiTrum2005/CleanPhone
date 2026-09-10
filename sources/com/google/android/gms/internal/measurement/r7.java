package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r7 extends y7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f23923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c8 f23924f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(c8 c8Var, long j10) {
        super(c8Var, true);
        this.f23923e = j10;
        Objects.requireNonNull(c8Var);
        this.f23924f = c8Var;
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final void a() {
        y6 y6Var = this.f23924f.f23358f;
        k9.c0.h(y6Var);
        y6Var.setSessionTimeoutDuration(this.f23923e);
    }
}
