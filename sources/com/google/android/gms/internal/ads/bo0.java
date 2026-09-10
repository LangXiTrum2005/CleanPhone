package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9.a f12827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vu0 f12828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mx0 f12829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f12830d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12831e = ((Boolean) zzba.zzc().a(am.T7)).booleanValue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sm0 f12832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12835i;

    public bo0(p9.a aVar, vu0 vu0Var, sm0 sm0Var, mx0 mx0Var) {
        this.f12827a = aVar;
        this.f12828b = vu0Var;
        this.f12832f = sm0Var;
        this.f12829c = mx0Var;
    }

    public final synchronized void a(List list) {
        ((p9.b) this.f12827a).getClass();
        this.f12835i = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            du0 du0Var = (du0) it.next();
            String str = du0Var.f13715w;
            if (!TextUtils.isEmpty(str)) {
                this.f12830d.put(du0Var, new ao0(str, du0Var.f13686f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void b(ju0 ju0Var, du0 du0Var, ListenableFuture listenableFuture, lx0 lx0Var) {
        fu0 fu0Var = (fu0) ju0Var.f16196b.f20920d;
        ((p9.b) this.f12827a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = du0Var.f13715w;
        if (str != null) {
            this.f12830d.put(du0Var, new ao0(str, du0Var.f13686f0, 9, 0L, null));
            zn0 zn0Var = new zn0(this, jElapsedRealtime, fu0Var, du0Var, str, lx0Var, ju0Var);
            listenableFuture.addListener(new zd1(0, listenableFuture, zn0Var), l00.f16615h);
        }
    }

    public final synchronized void c(du0 du0Var) {
        ao0 ao0Var = (ao0) this.f12830d.get(du0Var);
        if (ao0Var == null || this.f12833g) {
            return;
        }
        ao0Var.f12472c = 8;
    }

    public final synchronized String d() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f12830d.entrySet().iterator();
            while (it.hasNext()) {
                ao0 ao0Var = (ao0) ((Map.Entry) it.next()).getValue();
                if (ao0Var.f12472c != Integer.MAX_VALUE) {
                    arrayList.add(ao0Var.toString());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return TextUtils.join("_", arrayList);
    }
}
