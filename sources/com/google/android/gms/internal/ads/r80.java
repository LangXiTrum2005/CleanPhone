package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r80 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o8 f19462b;

    public /* synthetic */ r80(o8 o8Var, int i10) {
        this.f19461a = i10;
        this.f19462b = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19461a) {
            case 0:
                this.f19462b.zza(new ck0(3));
                break;
            default:
                ((hp0) ((vu0) ((v90) this.f19462b.f18185f).f21138d).f21275c).zzg();
                break;
        }
    }
}
