package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zc0 implements zzr, zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jh0 f22577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fu0 f22578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f22579c = new AtomicBoolean(false);

    public zc0(jh0 jh0Var, fu0 fu0Var) {
        this.f22577a = jh0Var;
        this.f22578b = fu0Var;
    }

    public final void a() {
        if (this.f22579c.getAndSet(true)) {
            return;
        }
        jh0 jh0Var = this.f22577a;
        if (jh0Var.f16096b.getAndSet(false)) {
            w11 w11Var = jh0Var.f16095a;
            w11Var.getClass();
            v71.h(w11Var.f21365a, w11Var.f21366b, new m11(w11Var, null, 2));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        jh0 jh0Var = this.f22577a;
        if (jh0Var.f16096b.get()) {
            w11 w11Var = jh0Var.f16095a;
            w11Var.getClass();
            v71.h(w11Var.f21365a, w11Var.f21366b, new m11(w11Var, null, 1));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
        a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i10) {
        a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        String gwsQueryId = this.f22578b.f14546b;
        boolean zL = pi1.l(gwsQueryId);
        jh0 jh0Var = this.f22577a;
        if (zL) {
            jh0Var.getClass();
            return;
        }
        if (!jh0Var.f16097c.get() || jh0Var.f16096b.getAndSet(true)) {
            return;
        }
        w11 w11Var = jh0Var.f16095a;
        w11Var.getClass();
        kotlin.jvm.internal.n.f(gwsQueryId, "gwsQueryId");
        v71.h(w11Var.f21365a, w11Var.f21366b, new b4.c(w11Var, gwsQueryId, (ak.f) null, 1));
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
