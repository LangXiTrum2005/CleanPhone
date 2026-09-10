package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xe0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21847a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f21848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vd0 f21849c;

    public xe0(vd0 vd0Var, fx1 fx1Var) {
        this.f21849c = vd0Var;
        this.f21848b = fx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f21847a) {
            case 0:
                ng0 ng0Var = (ng0) this.f21849c.f21153b.f20920d;
                ic1.h(ng0Var);
                return new we0(ng0Var, (p9.a) this.f21848b.zzb());
            default:
                eh0 eh0Var = (eh0) this.f21848b.zzb();
                ng0 ng0Var2 = (ng0) this.f21849c.f21153b.f20920d;
                ic1.h(ng0Var2);
                return new cf0(eh0Var, ng0Var2);
        }
    }

    public xe0(fx1 fx1Var, vd0 vd0Var) {
        this.f21848b = fx1Var;
        this.f21849c = vd0Var;
    }
}
