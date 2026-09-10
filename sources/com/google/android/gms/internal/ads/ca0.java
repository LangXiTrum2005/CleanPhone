package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ca0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lx1 f13121b;

    public /* synthetic */ ca0(lx1 lx1Var, int i10) {
        this.f13120a = i10;
        this.f13121b = lx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f13120a) {
            case 0:
                return new ba0(this.f13121b.zzb());
            case 1:
                return new ja0(this.f13121b.zzb());
            case 2:
                ma0 ma0Var = new ma0(this.f13121b.zzb());
                ma0Var.f17366c = false;
                return ma0Var;
            case 3:
                return new pa0(this.f13121b.zzb());
            case 4:
                return new qa0(this.f13121b.zzb());
            case 5:
                return new sa0(this.f13121b.zzb());
            case 6:
                return new ua0(this.f13121b.zzb());
            case 7:
                return new wa0(this.f13121b.zzb());
            case 8:
                return new ya0(this.f13121b.zzb());
            case 9:
                return new bb0(this.f13121b.zzb());
            case 10:
                eb0 eb0Var = new eb0(this.f13121b.zzb());
                eb0Var.f13921c = false;
                return eb0Var;
            case 11:
                return new lb0(this.f13121b.zzb());
            case 12:
                return new ob0(this.f13121b.zzb());
            case 13:
                return new qb0(this.f13121b.zzb());
            case 14:
                return new tb0(this.f13121b.zzb());
            case 15:
                return new vb0(this.f13121b.zzb());
            case 16:
                return new xb0(this.f13121b.zzb());
            case 17:
                return new fc0(this.f13121b.zzb());
            case 18:
                return new kc0(this.f13121b.zzb());
            case 19:
                return new lc0(this.f13121b.zzb());
            case 20:
                return new pc0(this.f13121b.zzb());
            case 21:
                return new rc0(this.f13121b.zzb());
            case 22:
                return new uc0(this.f13121b.zzb());
            case 23:
                return new wc0(this.f13121b.zzb());
            default:
                return new xv0(this.f13121b.zzb());
        }
    }
}
