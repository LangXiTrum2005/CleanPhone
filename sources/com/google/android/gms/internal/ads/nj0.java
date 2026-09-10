package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nj0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o40 f17843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u40 f17844c;

    public /* synthetic */ nj0(o40 o40Var, u40 u40Var, int i10) {
        this.f17842a = i10;
        this.f17843b = o40Var;
        this.f17844c = u40Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f17842a) {
            case 0:
                return new oj0(this.f17843b.a(), this.f17844c.a());
            default:
                Context contextA = this.f17843b.a();
                VersionInfoParcel versionInfoParcelA = this.f17844c.a();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new bk0(contextA, versionInfoParcelA, k00Var);
        }
    }
}
