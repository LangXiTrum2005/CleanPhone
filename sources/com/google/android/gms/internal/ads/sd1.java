package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sd1 extends id1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public rd1 f19937p;

    @Override // com.google.android.gms.internal.ads.uc1
    public final void j() {
        rd1 rd1Var = this.f19937p;
        if (rd1Var != null) {
            rd1Var.k();
        }
    }

    @Override // com.google.android.gms.internal.ads.id1
    public final void r(int i10) {
        this.l = null;
        if (i10 == 1) {
            this.f19937p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.id1
    public final void x() {
        rd1 rd1Var = this.f19937p;
        if (rd1Var != null) {
            try {
                rd1Var.f19563c.execute(rd1Var);
            } catch (RejectedExecutionException e10) {
                rd1Var.f19564d.d(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.id1
    public final void w(int i10, Object obj) {
    }
}
