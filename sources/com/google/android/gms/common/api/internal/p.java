package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f11747a;

    public p(e eVar) {
        this.f11747a = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        e eVar = this.f11747a;
        eVar.f11705n.sendMessage(eVar.f11705n.obtainMessage(1, boolValueOf));
    }
}
