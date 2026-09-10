package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzt;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cb0 extends mu1 implements na0, za0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final du0 f13123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f13124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ju0 f13125e;

    public cb0(Set set, du0 du0Var, ju0 ju0Var) {
        super(set);
        this.f13124d = new AtomicBoolean();
        this.f13123c = du0Var;
        this.f13125e = ju0Var;
    }

    public final void X0() {
        zzt zztVar;
        if (((Boolean) zzba.zzc().a(am.f12118d9)).booleanValue() && (zztVar = this.f13123c.f13684e0) != null && zztVar.zza == 3 && this.f13124d.compareAndSet(false, true)) {
            S0(new b21(zztVar, 16));
        }
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void k() {
        int i10 = this.f13123c.f13677b;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            X0();
        }
    }

    @Override // com.google.android.gms.internal.ads.mu1, com.google.android.gms.internal.ads.za0
    public final void zzl() {
        if (this.f13123c.f13677b == 1) {
            X0();
        }
    }
}
