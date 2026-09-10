package com.google.android.gms.internal.play_billing;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l4 extends i4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m4 f24406h;

    public l4(m4 m4Var) {
        this.f24406h = m4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.i4
    public final String a() {
        j4 j4Var = (j4) this.f24406h.f24426a.get();
        return j4Var == null ? "Completer object has been garbage collected, future will fail soon" : defpackage.e.o("tag=[", String.valueOf(j4Var.f24384a), X3.j.f27836e);
    }
}
