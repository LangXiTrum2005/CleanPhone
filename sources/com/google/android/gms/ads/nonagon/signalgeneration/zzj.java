package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ci0;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.ln;
import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11484a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11485b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f11486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ci0 f11487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f11488e;

    public zzj(Context context, ci0 ci0Var, k00 k00Var) {
        this.f11486c = context;
        this.f11487d = ci0Var;
        this.f11488e = k00Var;
    }

    public final synchronized void a(final boolean z10, zzl zzlVar) {
        try {
            HashMap map = this.f11484a;
            Boolean boolValueOf = Boolean.valueOf(z10);
            zzl zzlVar2 = (zzl) map.get(boolValueOf);
            if (zzlVar2 == null || zzlVar2.zzc() || zzlVar2.zza() == null || zzlVar.zza() != null) {
                map.put(boolValueOf, zzlVar);
            }
            long jLongValue = (zzlVar.zza() != null ? (Long) ln.f17067f.o() : (Long) ln.f17068g.o()).longValue();
            final boolean z11 = zzlVar.zza() == null;
            l00.f16611d.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    this.f11473a.c(z10, z11);
                }
            }, jLongValue, TimeUnit.SECONDS);
            HashMap map2 = this.f11485b;
            List list = (List) map2.get(boolValueOf);
            map2.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    d(zzlVar, (Pair) it.next(), false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b(final boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        HashMap map = this.f11485b;
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.f11488e.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                this.f11476a.c(z10, false);
            }
        });
    }

    public final synchronized void c(boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z10);
                HashMap map = this.f11484a;
                Boolean boolValueOf = Boolean.valueOf(z10);
                zzl zzlVar = (zzl) map.get(boolValueOf);
                int iZzd = 0;
                if (z11 && zzlVar != null) {
                    try {
                        iZzd = zzlVar.zzd() + 1;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                zzl zzlVar2 = (zzl) map.get(boolValueOf);
                final zzk zzkVar = new zzk(this, z10, iZzd, zzlVar2 == null ? null : Boolean.valueOf(zzlVar2.zze()), this.f11487d);
                final AdRequest adRequestBuild = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Jc)).booleanValue()) {
                    this.f11488e.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            QueryInfo.generate(this.f11478a.f11486c, AdFormat.BANNER, adRequestBuild, zzkVar);
                            return Boolean.TRUE;
                        }
                    });
                } else {
                    QueryInfo.generate(this.f11486c, AdFormat.BANNER, adRequestBuild, zzkVar);
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void d(zzl zzlVar, Pair pair, boolean z10) {
        zzlVar.zzf();
        QueryInfo queryInfoZza = zzlVar.zza();
        if (queryInfoZza != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(queryInfoZza);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzlVar.zzb());
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", a.f29610g);
        ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        zzv.zze(this.f11487d, null, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z10)), new Pair("sgpc_rs", Boolean.toString(zzlVar.zza() != null)));
    }

    public final synchronized void zza() {
        b(true);
        b(false);
    }

    public final synchronized void zzb(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(System.currentTimeMillis()));
        l00.f16613f.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Object obj2 = obj;
                boolean z10 = obj2 instanceof WebView;
                zzj zzjVar = this.f11481a;
                boolean zAcceptThirdPartyCookies = false;
                if (z10) {
                    CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzt.zzf().zza(zzjVar.f11486c);
                    if (cookieManagerZza != null) {
                        zAcceptThirdPartyCookies = cookieManagerZza.acceptThirdPartyCookies((WebView) obj2);
                    }
                }
                HashMap map = zzjVar.f11484a;
                Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
                zzl zzlVar = (zzl) map.get(boolValueOf);
                Pair pair2 = pair;
                if (zzlVar != null && !zzlVar.zzc()) {
                    zzjVar.d(zzlVar, pair2, true);
                    return;
                }
                HashMap map2 = zzjVar.f11485b;
                List arrayList = (List) map2.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map2.put(boolValueOf, arrayList);
                }
                arrayList.add(pair2);
            }
        });
    }
}
