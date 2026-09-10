package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xp0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe1 f21955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ou0 f21956c;

    public /* synthetic */ xp0(fe1 fe1Var, ou0 ou0Var, int i10) {
        this.f21954a = i10;
        this.f21955b = fe1Var;
        this.f21956c = ou0Var;
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        switch (this.f21954a) {
            case 0:
                return ((k00) this.f21955b).b(new sf(this, 8));
            default:
                return ((k00) this.f21955b).b(new sf(this, 18));
        }
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        switch (this.f21954a) {
            case 0:
                return 5;
            default:
                return 21;
        }
    }
}
