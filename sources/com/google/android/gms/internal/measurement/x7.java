package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x7 extends y7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f24141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c8 f24142f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(c8 c8Var, boolean z10) {
        super(c8Var, true);
        this.f24141e = z10;
        this.f24142f = c8Var;
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final void a() {
        y6 y6Var = this.f24142f.f23358f;
        k9.c0.h(y6Var);
        y6Var.setDataCollectionEnabled(this.f24141e);
    }
}
