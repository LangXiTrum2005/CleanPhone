package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class en0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f14027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f14028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hx1 f14029d;

    public /* synthetic */ en0(fx1 fx1Var, hx1 hx1Var, kx1 kx1Var, int i10) {
        this.f14026a = i10;
        this.f14027b = fx1Var;
        this.f14029d = hx1Var;
        this.f14028c = kx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f14026a) {
            case 0:
                return new zm0((Context) this.f14027b.zzb(), (y70) this.f14029d.f15424a, (Executor) this.f14028c.zzb(), 1);
            case 1:
                Context context = (Context) this.f14027b.zzb();
                VersionInfoParcel versionInfoParcelA = ((u40) this.f14028c).a();
                ed0 ed0Var = (ed0) this.f14029d.f15424a;
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new gn0(context, versionInfoParcelA, ed0Var, k00Var);
            case 2:
                return new zm0((Context) this.f14027b.zzb(), (pd0) this.f14029d.f15424a, (Executor) this.f14028c.zzb(), 2);
            case 3:
                return new gn0((Context) this.f14027b.zzb(), (pd0) this.f14029d.f15424a, ((u40) this.f14028c).a());
            case 4:
                return new ho0((Context) this.f14027b.zzb(), (Executor) this.f14028c.zzb(), (xg0) this.f14029d.f15424a, 0);
            default:
                return new ho0((Context) this.f14027b.zzb(), (Executor) this.f14028c.zzb(), (xg0) this.f14029d.f15424a, 1);
        }
    }

    public /* synthetic */ en0(fx1 fx1Var, kx1 kx1Var, hx1 hx1Var, int i10) {
        this.f14026a = i10;
        this.f14027b = fx1Var;
        this.f14028c = kx1Var;
        this.f14029d = hx1Var;
    }
}
