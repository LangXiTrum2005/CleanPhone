package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z00 f20987d;

    public /* synthetic */ v00(z00 z00Var, int i10, int i11, int i12) {
        this.f20984a = i12;
        this.f20985b = i10;
        this.f20986c = i11;
        this.f20987d = z00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20984a) {
            case 0:
                d10 d10Var = ((w00) this.f20987d).f21350q;
                if (d10Var != null) {
                    d10Var.j(this.f20985b, this.f20986c);
                }
                break;
            default:
                d10 d10Var2 = ((q10) this.f20987d).f18861g;
                if (d10Var2 != null) {
                    d10Var2.j(this.f20985b, this.f20986c);
                }
                break;
        }
    }
}
