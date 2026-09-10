package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x3 implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f21719b;

    public x3(int i10) {
        this.f21718a = i10;
        switch (i10) {
            case 1:
                this.f21719b = new c3(35152, 2, "image/png");
                break;
            default:
                this.f21719b = new c3(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) {
        switch (this.f21718a) {
            case 0:
                break;
        }
        return this.f21719b.d(n2Var);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        switch (this.f21718a) {
            case 0:
                this.f21719b.e(j10, j11);
                break;
            default:
                this.f21719b.e(j10, j11);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) {
        switch (this.f21718a) {
            case 0:
                break;
        }
        return this.f21719b.f(n2Var, q2Var);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        switch (this.f21718a) {
            case 0:
                this.f21719b.g(o2Var);
                break;
            default:
                this.f21719b.g(o2Var);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
        int i10 = this.f21718a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
