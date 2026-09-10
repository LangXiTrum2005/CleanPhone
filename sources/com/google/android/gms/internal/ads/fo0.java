package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fo0 implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yv0 f14480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ga0 f14481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lx0 f14482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f14483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f14484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f14485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o80 f14486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bo0 f14487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sm0 f14488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f14489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jw0 f14490k;
    public final k80 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wh0 f14491m;

    public fo0(Context context, yv0 yv0Var, bo0 bo0Var, ga0 ga0Var, lx0 lx0Var, mx0 mx0Var, o80 o80Var, k00 k00Var, ScheduledExecutorService scheduledExecutorService, sm0 sm0Var, jw0 jw0Var, k80 k80Var, wh0 wh0Var) {
        this.f14489j = context;
        this.f14480a = yv0Var;
        this.f14487h = bo0Var;
        this.f14481b = ga0Var;
        this.f14482c = lx0Var;
        this.f14483d = mx0Var;
        this.f14486g = o80Var;
        this.f14484e = k00Var;
        this.f14485f = scheduledExecutorService;
        this.f14488i = sm0Var;
        this.f14490k = jw0Var;
        this.l = k80Var;
        this.f14491m = wh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    public static String a(ju0 ju0Var) {
        String strK = "No fill.";
        String str = true != ((Boolean) zzba.zzc().a(am.H6)).booleanValue() ? "No ad config." : "No fill.";
        fu0 fu0Var = (fu0) ju0Var.f16196b.f20920d;
        int i10 = fu0Var.f14550f;
        if (i10 == 0) {
            strK = str;
        } else if (i10 < 200 || i10 >= 300) {
            strK = (i10 < 300 || i10 >= 400) ? l1.d.k(new StringBuilder(String.valueOf(i10).length() + 35), "Received error HTTP response code: ", i10) : "No location header to follow redirect or too many redirects.";
        } else {
            if (((Boolean) zzba.zzc().a(am.G6)).booleanValue()) {
                strK = str;
            }
        }
        tf1 tf1Var = fu0Var.f14554j;
        return tf1Var != null ? tf1Var.f20372b : strK;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final ListenableFuture zza(Object obj) {
        ListenableFuture listenableFutureM;
        int i10;
        Bundle bundle;
        fo0 fo0Var = this;
        ju0 ju0Var = (ju0) obj;
        if (((Boolean) zzba.zzc().a(am.S2)).booleanValue() && (bundle = (Bundle) ju0Var.f16196b.f20918b) != null) {
            wh0 wh0Var = fo0Var.f14491m;
            synchronized (wh0Var) {
                wh0Var.f21518e.putAll(bundle);
            }
        }
        if (((Boolean) zzba.zzc().a(am.T2)).booleanValue()) {
            com.applovin.impl.ca.s((p9.b) zzt.zzk(), fo0Var.f14491m, "rendering-start");
        }
        String strA = a(ju0Var);
        sm0 sm0Var = fo0Var.f14488i;
        uw uwVar = ju0Var.f16196b;
        fu0 fu0Var = (fu0) uwVar.f20920d;
        sm0Var.f20003d = fu0Var;
        if (((Boolean) zzba.zzc().a(am.I9)).booleanValue() && (i10 = fu0Var.f14550f) != 0 && (i10 < 200 || i10 >= 300)) {
            return zw1.l(new eo0(3, strA));
        }
        String str = fu0Var.f14560q;
        if (!((Boolean) zzba.zzc().a(am.E4)).booleanValue() || TextUtils.isEmpty(str)) {
            for (du0 du0Var : (List) uwVar.f20919c) {
                sm0Var.b(du0Var, sm0Var.f20000a.size());
                Iterator it = du0Var.f13675a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        sm0Var.c(du0Var, 0L, pi1.C(1, null, null), false);
                        break;
                    }
                    nm0 nm0VarA = fo0Var.f14486g.a(du0Var.f13677b, (String) it.next());
                    if (nm0VarA != null && nm0VarA.b(ju0Var, du0Var)) {
                        break;
                    }
                }
            }
        } else {
            List list = (List) uwVar.f20919c;
            synchronized (sm0Var) {
                Map map = sm0Var.f20001b;
                if (map.containsKey(str)) {
                    zzv zzvVar = (zzv) map.get(str);
                    List list2 = sm0Var.f20000a;
                    int iIndexOf = list2.indexOf(zzvVar);
                    try {
                        list2.remove(iIndexOf);
                    } catch (IndexOutOfBoundsException e10) {
                        zzt.zzh().d("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e10);
                    }
                    sm0Var.f20001b.remove(str);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        sm0Var.b((du0) it2.next(), iIndexOf);
                        iIndexOf++;
                    }
                }
            }
        }
        ga0 ga0Var = fo0Var.f14481b;
        q60 q60Var = new q60(ju0Var, fo0Var.f14483d, fo0Var.f14482c);
        Executor executor = fo0Var.f14484e;
        ga0Var.P0(q60Var, executor);
        if (fu0Var.f14561r > 1) {
            k80 k80Var = fo0Var.l;
            synchronized (k80Var) {
                try {
                    if (!((AtomicBoolean) k80Var.f16373j).getAndSet(true)) {
                        List list3 = (List) ju0Var.f16196b.f20919c;
                        if (list3.isEmpty()) {
                            ((le1) k80Var.f16372i).d(new eo0(3, a(ju0Var)));
                        } else {
                            k80Var.f16364a = ju0Var;
                            bo0 bo0Var = (bo0) k80Var.f16370g;
                            k80Var.f16374k = new un0(ju0Var, bo0Var, (le1) k80Var.f16372i);
                            bo0Var.a(list3);
                            for (du0 du0VarA = ((un0) k80Var.f16374k).a(); du0VarA != null; du0VarA = ((un0) k80Var.f16374k).a()) {
                                k80Var.a(du0VarA);
                            }
                        }
                    }
                    listenableFutureM = (le1) k80Var.f16372i;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            String strA2 = a(ju0Var);
            yv0 yv0Var = fo0Var.f14480a;
            vv0 vv0Var = vv0.RENDER_CONFIG_INIT;
            Objects.requireNonNull(yv0Var);
            listenableFutureM = new v90(yv0Var, vv0Var, null, yv0.f22377d, Collections.EMPTY_LIST, zw1.l(new eo0(3, strA2))).m();
            bo0 bo0Var2 = fo0Var.f14487h;
            synchronized (bo0Var2) {
                ((p9.b) bo0Var2.f12827a).getClass();
                bo0Var2.f12835i = SystemClock.elapsedRealtime();
            }
            int i11 = 0;
            for (du0 du0Var2 : (List) uwVar.f20919c) {
                for (String str2 : du0Var2.f13675a) {
                    nm0 nm0VarA2 = fo0Var.f14486g.a(du0Var2.f13677b, str2);
                    if (nm0VarA2 != null && nm0VarA2.b(ju0Var, du0Var2)) {
                        v90 v90VarA = yv0Var.a(listenableFutureM, vv0.RENDER_CONFIG_WATERFALL);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(str2).length());
                        sb2.append("render-config-");
                        sb2.append(i11);
                        sb2.append("-");
                        sb2.append(str2);
                        String string = sb2.toString();
                        ListenableFuture listenableFuture = (ListenableFuture) v90VarA.f21137c;
                        List list4 = (List) v90VarA.f21138d;
                        ListenableFuture listenableFuture2 = (ListenableFuture) v90VarA.f21139e;
                        yv0 yv0Var2 = (yv0) v90VarA.f21140f;
                        Object obj2 = v90VarA.f21135a;
                        Objects.requireNonNull(yv0Var2);
                        listenableFutureM = new v90(yv0Var2, obj2, string, listenableFuture, list4, zw1.u(listenableFuture2, Throwable.class, new ft(fo0Var, du0Var2, ju0Var, nm0VarA2, 4), yv0Var2.f22378a)).m();
                        break;
                    }
                    fo0Var = this;
                }
                i11++;
                fo0Var = this;
            }
            listenableFutureM.addListener(new x60(bo0Var2, 19), executor);
        }
        return listenableFutureM;
    }
}
