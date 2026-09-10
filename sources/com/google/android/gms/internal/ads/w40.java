package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w40 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o40 f21406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f21407b;

    public w40(o40 o40Var, fx1 fx1Var) {
        this.f21406a = o40Var;
        this.f21407b = fx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a8 zzb() {
        Context contextA = this.f21406a.a();
        kw0 kw0Var = (kw0) this.f21407b.zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        dt dtVarA = zzt.zzr().a(contextA, VersionInfoParcel.forPackage(), kw0Var);
        jq jqVar = x10.f21684j;
        dtVarA.getClass();
        return new a8(contextA, zzt.zzr().a(contextA, VersionInfoParcel.forPackage(), kw0Var).a("google.afma.sdkConstants.getSdkConstants", jqVar, jqVar), VersionInfoParcel.forPackage(), k00Var);
    }
}
