package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a70 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f11919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx1 f11920c;

    public /* synthetic */ a70(fx1 fx1Var, kx1 kx1Var, int i10) {
        this.f11918a = i10;
        this.f11920c = fx1Var;
        this.f11919b = kx1Var;
    }

    public ko0 a() {
        return new ko0((vo0) this.f11920c.zzb(), (nh0) this.f11919b.zzb());
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f11918a) {
            case 0:
                return new z60(((o40) this.f11919b).a(), (yh) this.f11920c.zzb());
            case 1:
                return new y80((p9.a) this.f11919b.zzb(), (b00) this.f11920c.zzb());
            case 2:
                return new zzb((Context) this.f11919b.zzb(), (bz) this.f11920c.zzb(), null);
            case 3:
                return new nc0((nb0) this.f11920c.zzb(), (Executor) this.f11919b.zzb());
            case 4:
                return new nc0((nb0) this.f11920c.zzb(), (Executor) this.f11919b.zzb());
            case 5:
                return new nc0((nb0) this.f11920c.zzb(), (Executor) this.f11919b.zzb());
            case 6:
                return new nc0((nb0) this.f11920c.zzb(), (Executor) this.f11919b.zzb());
            case 7:
                return new nc0((nb0) this.f11920c.zzb(), (Executor) this.f11919b.zzb());
            case 8:
                return new nc0((nb0) this.f11920c.zzb(), (Executor) this.f11919b.zzb());
            case 9:
                return new nc0((nb0) this.f11920c.zzb(), (Executor) this.f11919b.zzb());
            case 10:
                return new nc0((nb0) this.f11920c.zzb(), (Executor) this.f11919b.zzb());
            case 11:
                return a();
            case 12:
                ListenableFuture listenableFuture = (ListenableFuture) this.f11920c.zzb();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new zp0(listenableFuture, k00Var, (ScheduledExecutorService) this.f11919b.zzb(), 0);
            default:
                return x10.n((Context) this.f11919b.zzb(), (qz0) this.f11920c.zzb());
        }
    }

    public /* synthetic */ a70(kx1 kx1Var, fx1 fx1Var, int i10) {
        this.f11918a = i10;
        this.f11919b = kx1Var;
        this.f11920c = fx1Var;
    }
}
