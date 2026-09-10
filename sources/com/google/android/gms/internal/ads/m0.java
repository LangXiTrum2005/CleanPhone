package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lj1 f17182b;

    public /* synthetic */ m0(lj1 lj1Var, int i10) {
        this.f17181a = i10;
        this.f17182b = lj1Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f17181a) {
            case 0:
                ((n0) this.f17182b.f17037c).f17602h.zzb();
                break;
            case 1:
                ((n0) this.f17182b.f17037c).f17602h.zzc();
                break;
            default:
                ((n0) this.f17182b.f17037c).f17602h.getClass();
                break;
        }
    }

    public /* synthetic */ m0(lj1 lj1Var, lt ltVar) {
        this.f17181a = 2;
        this.f17182b = lj1Var;
    }
}
