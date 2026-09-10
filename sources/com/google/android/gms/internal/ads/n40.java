package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n40 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o40 f17639b;

    public /* synthetic */ n40(o40 o40Var, int i10) {
        this.f17638a = i10;
        this.f17639b = o40Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f17638a) {
            case 0:
                ApplicationInfo applicationInfo = this.f17639b.a().getApplicationInfo();
                ic1.h(applicationInfo);
                return applicationInfo;
            case 1:
                Context contextA = this.f17639b.a();
                if (((Boolean) zzba.zzc().a(am.f12121dd)).booleanValue()) {
                    return zzf.zzf(contextA);
                }
                return null;
            case 2:
                return new vz0(this.f17639b.a(), zzt.zzs().zza());
            case 3:
                return vu0.h(this.f17639b.a());
            case 4:
                return new bj0(this.f17639b.a());
            case 5:
                return new yj0(this.f17639b.a());
            case 6:
                return new zj0(this.f17639b.a());
            case 7:
                Context contextA2 = this.f17639b.a();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new ul0(contextA2, k00Var);
            case 8:
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                return new hq0(k00Var2, this.f17639b.a(), 2);
            case 9:
                Context contextA3 = this.f17639b.a();
                k00 k00Var3 = l00.f16608a;
                ic1.h(k00Var3);
                return new hq0(contextA3, k00Var3, 6);
            default:
                return new ms0(this.f17639b.a());
        }
    }
}
