package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p60 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f18541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t80 f18542c;

    public /* synthetic */ p60(t80 t80Var, kx1 kx1Var, int i10) {
        this.f18540a = i10;
        this.f18542c = t80Var;
        this.f18541b = kx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f18540a) {
            case 0:
                return new o60(this.f18542c.a(), ((v40) this.f18541b).zzb());
            case 1:
                return new o90(this.f18542c.a());
            case 2:
                return new sc0(this.f18542c.a(), (mx0) this.f18541b.zzb());
            default:
                return new oc0((Context) this.f18541b.zzb(), new HashSet(), this.f18542c.a());
        }
    }

    public /* synthetic */ p60(fx1 fx1Var, t80 t80Var, int i10) {
        this.f18540a = i10;
        this.f18541b = fx1Var;
        this.f18542c = t80Var;
    }
}
