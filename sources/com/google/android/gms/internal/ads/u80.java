package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u80 implements zzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qa0 f20694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f20695b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f20696c = new AtomicBoolean(false);

    public u80(qa0 qa0Var) {
        this.f20694a = qa0Var;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
        AtomicBoolean atomicBoolean = this.f20696c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f20694a.S0(jq.f16144o);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i10) {
        this.f20695b.set(true);
        AtomicBoolean atomicBoolean = this.f20696c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f20694a.S0(jq.f16144o);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        this.f20694a.S0(jq.l);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }
}
