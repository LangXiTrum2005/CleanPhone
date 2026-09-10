package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yv0 f19911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f19912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f19913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f19915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PackageInfo f19916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dx1 f19917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f19918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final hz f19919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzg f19920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ou0 f19921k;
    public final xb0 l;

    public s90(yv0 yv0Var, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, dx1 dx1Var, zzj zzjVar, String str2, hz hzVar, ou0 ou0Var, xb0 xb0Var) {
        this.f19911a = yv0Var;
        this.f19912b = versionInfoParcel;
        this.f19913c = applicationInfo;
        this.f19914d = str;
        this.f19915e = arrayList;
        this.f19916f = packageInfo;
        this.f19917g = dx1Var;
        this.f19918h = str2;
        this.f19919i = hzVar;
        this.f19920j = zzjVar;
        this.f19921k = ou0Var;
        this.l = xb0Var;
    }

    public final uv0 a(Bundle bundle) {
        this.l.zza();
        yv0 yv0Var = this.f19911a;
        Objects.requireNonNull(yv0Var);
        sd1 sd1VarB = this.f19919i.b(bundle, new Bundle());
        return new v90(yv0Var, vv0.SIGNALS, null, yv0.f22377d, Collections.EMPTY_LIST, sd1VarB).m();
    }

    public final uv0 b() {
        Bundle bundle = new Bundle();
        if (((Boolean) zzba.zzc().a(am.S2)).booleanValue()) {
            Bundle bundle2 = this.f19921k.f18378t;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        uv0 uv0VarA = a(bundle);
        ListenableFuture[] listenableFutureArr = {uv0VarA, (ListenableFuture) this.f19917g.zzb()};
        yv0 yv0Var = this.f19911a;
        yv0Var.getClass();
        List listAsList = Arrays.asList(listenableFutureArr);
        r90 r90Var = new r90(this, uv0VarA, bundle, 0);
        aa1 aa1Var = ca1.f13122b;
        listAsList.getClass();
        ca1 ca1VarY = ca1.y(listAsList);
        rl rlVar = rl.f19607e;
        k00 k00Var = l00.f16615h;
        sd1 sd1Var = new sd1(ca1VarY, true, false);
        sd1Var.f19937p = new rd1(sd1Var, rlVar, k00Var);
        sd1Var.v();
        fe1 fe1Var = yv0Var.f22378a;
        sd1 sd1Var2 = new sd1(ca1VarY, true, false);
        sd1Var2.f19937p = new rd1(sd1Var2, r90Var, fe1Var);
        sd1Var2.v();
        return new v90(yv0Var, vv0.REQUEST_PARCEL, null, sd1Var, listAsList, sd1Var2).m();
    }
}
