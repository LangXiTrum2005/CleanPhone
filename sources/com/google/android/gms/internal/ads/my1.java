package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class my1 implements li0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nz1 f17591b;

    public /* synthetic */ my1(nz1 nz1Var, int i10) {
        this.f17590a = 2;
        this.f17591b = nz1Var;
    }

    @Override // com.google.android.gms.internal.ads.li0
    /* JADX INFO: renamed from: zza */
    public final /* synthetic */ void mo161zza(Object obj) {
        int i10 = this.f17590a;
        nz1 nz1Var = this.f17591b;
        oe oeVar = (oe) obj;
        switch (i10) {
            case 0:
                int i11 = ry1.f19707e0;
                boolean z10 = nz1Var.f18044g;
                oeVar.zzf();
                break;
            case 1:
                int i12 = ry1.f19707e0;
                int i13 = nz1Var.f18050n;
                oeVar.zzk();
                break;
            default:
                int i14 = ry1.f19707e0;
                ci ciVar = nz1Var.f18038a;
                oeVar.zzb();
                break;
        }
    }

    public /* synthetic */ my1(nz1 nz1Var, int i10, byte b10) {
        this.f17590a = i10;
        this.f17591b = nz1Var;
    }
}
