package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tp0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe1 f20455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f20458e;

    public tp0(Context context, fe1 fe1Var, ou0 ou0Var, VersionInfoParcel versionInfoParcel) {
        this.f20454a = 5;
        this.f20456c = context;
        this.f20455b = fe1Var;
        this.f20457d = ou0Var;
        this.f20458e = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        fq0 fq0Var;
        switch (this.f20454a) {
            case 0:
                am.a((Context) this.f20456c);
                return ((k00) this.f20455b).b(new sf(this, 7));
            case 1:
                gq0 gq0Var = (gq0) this.f20458e;
                ul ulVar = am.f12289od;
                if (((Boolean) zzba.zzc().a(ulVar)).booleanValue() && (fq0Var = gq0Var.f14931b) != null) {
                    return zw1.d(fq0Var);
                }
                if (pi1.l((String) zzba.zzc().a(am.f12175h2)) || (!((Boolean) zzba.zzc().a(ulVar)).booleanValue() && (gq0Var.f14930a.get() || !((yi0) this.f20457d).f22262b))) {
                    return zw1.d(new fq0(0, new Bundle()));
                }
                gq0Var.f14930a.set(true);
                return ((k00) this.f20455b).b(new sf(this, 9));
            case 2:
                return ((k00) this.f20455b).b(new sf(this, 15));
            case 3:
                return ((k00) this.f20455b).b(new sf(this, 19));
            case 4:
                return ((k00) this.f20455b).b(new sf(this, 21));
            case 5:
                return ((k00) this.f20455b).b(new sf(this, 23));
            case 6:
                return ((k00) this.f20455b).b(new sf(this, 25));
            default:
                return ((k00) this.f20455b).b(new sf(this, 28));
        }
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        switch (this.f20454a) {
            case 0:
                return 3;
            case 1:
                return 1;
            case 2:
                return 17;
            case 3:
                return 22;
            case 4:
                return 26;
            case 5:
                return 53;
            case 6:
                return 35;
            default:
                return 38;
        }
    }

    public tp0(fe1 fe1Var, ViewGroup viewGroup, Context context, Set set) {
        this.f20454a = 3;
        this.f20455b = fe1Var;
        this.f20457d = set;
        this.f20458e = viewGroup;
        this.f20456c = context;
    }

    public tp0(fe1 fe1Var, ou0 ou0Var, PackageInfo packageInfo, zzj zzjVar) {
        this.f20454a = 4;
        this.f20455b = fe1Var;
        this.f20457d = ou0Var;
        this.f20456c = packageInfo;
        this.f20458e = zzjVar;
    }

    public /* synthetic */ tp0(fe1 fe1Var, Object obj, Object obj2, Object obj3, int i10) {
        this.f20454a = i10;
        this.f20455b = fe1Var;
        this.f20456c = obj;
        this.f20457d = obj2;
        this.f20458e = obj3;
    }
}
