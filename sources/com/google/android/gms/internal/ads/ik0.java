package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ik0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15772a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f15773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z90 f15774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f15775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f15776e;

    public ik0(fx1 fx1Var, z90 z90Var, o40 o40Var, fx1 fx1Var2) {
        this.f15773b = fx1Var;
        this.f15774c = z90Var;
        this.f15775d = o40Var;
        this.f15776e = fx1Var2;
    }

    public cq0 a() {
        return new cq0((xq0) this.f15773b.zzb(), this.f15774c.a(), ((o40) this.f15775d).a(), (f00) this.f15776e.zzb());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0058  */
    /* JADX WARN: Code duplicated, block: B:12:0x007b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0086  */
    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        ListenableFuture listenableFutureB;
        switch (this.f15772a) {
            case 0:
                final qf qfVar = (qf) this.f15773b.zzb();
                final Context contextA = ((o40) this.f15775d).a();
                ou0 ou0VarA = this.f15774c.a();
                long jLongValue = ((Long) this.f15776e.zzb()).longValue();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                int iIntValue = ((Integer) zzba.zzc().a(am.F3)).intValue();
                if (iIntValue != -1) {
                    if (Integer.toString(iIntValue).equals(zzv.zzb(zzv.zzc(ou0VarA.f18363d)))) {
                        ((p9.b) zzt.zzk()).getClass();
                        if (System.currentTimeMillis() - jLongValue < ((Integer) zzba.zzc().a(am.H3)).intValue()) {
                            final int i10 = 1;
                            listenableFutureB = k00Var.b(new Callable() { // from class: com.google.android.gms.internal.ads.gk0
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    switch (i10) {
                                        case 0:
                                            return qfVar.f19044b.zzl(contextA);
                                        default:
                                            return qfVar.f19044b.zzk(contextA);
                                    }
                                }
                            });
                        } else {
                            final int i11 = 0;
                            listenableFutureB = k00Var.b(new Callable() { // from class: com.google.android.gms.internal.ads.gk0
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    switch (i11) {
                                        case 0:
                                            return qfVar.f19044b.zzl(contextA);
                                        default:
                                            return qfVar.f19044b.zzk(contextA);
                                    }
                                }
                            });
                        }
                    } else {
                        final int i12 = 0;
                        listenableFutureB = k00Var.b(new Callable() { // from class: com.google.android.gms.internal.ads.gk0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i12) {
                                    case 0:
                                        return qfVar.f19044b.zzl(contextA);
                                    default:
                                        return qfVar.f19044b.zzk(contextA);
                                }
                            }
                        });
                    }
                } else {
                    ((p9.b) zzt.zzk()).getClass();
                    if (System.currentTimeMillis() - jLongValue < ((Integer) zzba.zzc().a(am.H3)).intValue()) {
                        final int i13 = 1;
                        listenableFutureB = k00Var.b(new Callable() { // from class: com.google.android.gms.internal.ads.gk0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i13) {
                                    case 0:
                                        return qfVar.f19044b.zzl(contextA);
                                    default:
                                        return qfVar.f19044b.zzk(contextA);
                                }
                            }
                        });
                    } else {
                        final int i14 = 0;
                        listenableFutureB = k00Var.b(new Callable() { // from class: com.google.android.gms.internal.ads.gk0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i14) {
                                    case 0:
                                        return qfVar.f19044b.zzl(contextA);
                                    default:
                                        return qfVar.f19044b.zzk(contextA);
                                }
                            }
                        });
                    }
                }
                ic1.h(listenableFutureB);
                return listenableFutureB;
            default:
                return a();
        }
    }

    public ik0(kx1 kx1Var, kx1 kx1Var2, z90 z90Var, kx1 kx1Var3) {
        this.f15773b = kx1Var;
        this.f15775d = kx1Var2;
        this.f15774c = z90Var;
        this.f15776e = kx1Var3;
    }
}
