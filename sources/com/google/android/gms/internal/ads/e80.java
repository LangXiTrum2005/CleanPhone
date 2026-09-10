package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e80 implements ta0, ai, sb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final du0 f13875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ma0 f13876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ya0 f13877c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final eb0 f13880f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f13878d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f13879e = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f13881g = new AtomicBoolean();

    public e80(du0 du0Var, ma0 ma0Var, ya0 ya0Var, eb0 eb0Var) {
        this.f13875a = du0Var;
        this.f13876b = ma0Var;
        this.f13877c = ya0Var;
        this.f13880f = eb0Var;
    }

    public final void a() {
        if (this.f13878d.compareAndSet(false, true)) {
            this.f13876b.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final void v(zh zhVar) {
        int i10 = this.f13875a.f13683e;
        if (i10 == 1) {
            if (zhVar.f22617j) {
                a();
            }
        } else if (i10 == 4 && zhVar.f22617j && this.f13881g.compareAndSet(false, true)) {
            this.f13880f.zza();
        }
        if (zhVar.f22617j && this.f13879e.compareAndSet(false, true)) {
            ya0 ya0Var = this.f13877c;
            synchronized (ya0Var) {
                ya0Var.S0(xa0.f21808b);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void z() {
        if (this.f13875a.f13683e == 4) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final synchronized void zzg() {
        int i10 = this.f13875a.f13683e;
        if (i10 == 1 || i10 == 4) {
            return;
        }
        a();
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final void C() {
    }
}
