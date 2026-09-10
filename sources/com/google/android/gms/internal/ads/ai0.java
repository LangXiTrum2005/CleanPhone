package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ai0 implements zv0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wh0 f12039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p9.a f12040c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12038a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f12041d = new HashMap();

    public ai0(wh0 wh0Var, Set set, p9.a aVar) {
        this.f12039b = wh0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zh0 zh0Var = (zh0) it.next();
            HashMap map = this.f12041d;
            zh0Var.getClass();
            map.put(vv0.RENDERER, zh0Var);
        }
        this.f12040c = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void O(vv0 vv0Var, String str) {
        ((p9.b) this.f12040c).getClass();
        this.f12038a.put(vv0Var, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final void a(vv0 vv0Var, boolean z10) {
        zh0 zh0Var = (zh0) this.f12041d.get(vv0Var);
        if (zh0Var == null) {
            return;
        }
        String str = true != z10 ? "f." : "s.";
        vv0 vv0Var2 = zh0Var.f22620b;
        HashMap map = this.f12038a;
        if (map.containsKey(vv0Var2)) {
            ((p9.b) this.f12040c).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(vv0Var2)).longValue();
            this.f12039b.f21514a.put("label.".concat(zh0Var.f22619a), defpackage.e.s(new StringBuilder(String.valueOf(jElapsedRealtime).length() + 2), str, jElapsedRealtime));
        }
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void b(vv0 vv0Var, String str) {
        HashMap map = this.f12038a;
        if (map.containsKey(vv0Var)) {
            ((p9.b) this.f12040c).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(vv0Var)).longValue();
            this.f12039b.f21514a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f12041d.containsKey(vv0Var)) {
            a(vv0Var, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void e(vv0 vv0Var, String str, Throwable th2) {
        HashMap map = this.f12038a;
        if (map.containsKey(vv0Var)) {
            ((p9.b) this.f12040c).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(vv0Var)).longValue();
            this.f12039b.f21514a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f12041d.containsKey(vv0Var)) {
            a(vv0Var, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void v(String str) {
    }
}
