package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.ci0;
import com.google.android.gms.internal.ads.ln;
import com.ironsource.mediationsdk.metadata.a;
import p9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzj f11489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ci0 f11490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f11494f;

    public zzk(zzj zzjVar, boolean z10, int i10, @Nullable Boolean bool, ci0 ci0Var) {
        this.f11489a = zzjVar;
        this.f11491c = z10;
        this.f11492d = i10;
        this.f11494f = bool;
        this.f11490b = ci0Var;
        ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        this.f11493e = System.currentTimeMillis();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", a.f29610g);
        ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f11493e));
        int i10 = this.f11492d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i10));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f11494f));
        boolean z10 = this.f11491c;
        zzv.zze(this.f11490b, null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z10 ? "0" : "1"));
        ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        this.f11489a.a(z10, new zzl(null, str, ((Long) ln.f17069h.o()).longValue() + System.currentTimeMillis(), i10));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", a.f29610g);
        ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f11493e));
        int i10 = this.f11492d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i10));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f11494f));
        boolean z10 = this.f11491c;
        zzv.zze(this.f11490b, null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z10 ? "0" : "1"));
        ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        this.f11489a.a(z10, new zzl(queryInfo, "", ((Long) ln.f17069h.o()).longValue() + System.currentTimeMillis(), i10));
    }
}
