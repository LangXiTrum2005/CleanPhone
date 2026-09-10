package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xd0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f21838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f21839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f21840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kx1 f21841e;

    public /* synthetic */ xd0(fx1 fx1Var, fx1 fx1Var2, fx1 fx1Var3, Object obj, int i10) {
        this.f21837a = i10;
        this.f21838b = fx1Var;
        this.f21839c = fx1Var2;
        this.f21840d = fx1Var3;
        this.f21841e = (kx1) obj;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f21837a) {
            case 0:
                yh yhVar = (yh) this.f21838b.zzb();
                Executor executor = (Executor) this.f21839c.zzb();
                Context context = (Context) this.f21840d.zzb();
                return new f70(executor, new z60(context, yhVar), (p9.a) this.f21841e.zzb());
            default:
                dx1 dx1VarB = fx1.b(this.f21838b);
                a71 a71Var = (a71) this.f21839c.zzb();
                return new m61(dx1VarB, a71Var, ((h21) this.f21841e.zzb()).W().A());
        }
    }
}
