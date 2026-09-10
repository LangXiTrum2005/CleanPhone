package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f90 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14342a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o40 f14343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u40 f14344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fx1 f14345d;

    public f90(o40 o40Var, u40 u40Var, fx1 fx1Var) {
        this.f14343b = o40Var;
        this.f14344c = u40Var;
        this.f14345d = fx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f14342a) {
            case 0:
                Context contextA = this.f14343b.a();
                kw0 kw0Var = (kw0) this.f14345d.zzb();
                VersionInfoParcel versionInfoParcelA = this.f14344c.a();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new e90(contextA, kw0Var, versionInfoParcelA, k00Var);
            default:
                dt dtVarB = new at().b(this.f14343b.a(), this.f14344c.a(), (kw0) this.f14345d.zzb());
                ic1.h(dtVarB);
                return dtVarB;
        }
    }

    public f90(o40 o40Var, fx1 fx1Var, u40 u40Var) {
        this.f14343b = o40Var;
        this.f14345d = fx1Var;
        this.f14344c = u40Var;
    }
}
