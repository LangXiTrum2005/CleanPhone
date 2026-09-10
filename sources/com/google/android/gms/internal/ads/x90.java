package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x90 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w90 f21797b;

    public /* synthetic */ x90(w90 w90Var, int i10) {
        this.f21796a = i10;
        this.f21797b = w90Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f21796a) {
            case 0:
                return this.f21797b.f21464c;
            case 1:
                return this.f21797b.f21465d;
            default:
                return this.f21797b.a();
        }
    }
}
