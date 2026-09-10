package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c90 implements yb0, ta0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9.a f13109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d90 f13110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ou0 f13111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13112d;

    public c90(p9.a aVar, d90 d90Var, ou0 ou0Var, String str) {
        this.f13109a = aVar;
        this.f13110b = d90Var;
        this.f13111c = ou0Var;
        this.f13112d = str;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final void zza() {
        ((p9.b) this.f13109a).getClass();
        this.f13110b.f13469c.put(this.f13112d, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void zzg() {
        ((p9.b) this.f13109a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.f13111c.f18366g;
        d90 d90Var = this.f13110b;
        ConcurrentHashMap concurrentHashMap = d90Var.f13469c;
        String str2 = this.f13112d;
        Long l = (Long) concurrentHashMap.get(str2);
        if (l == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        d90Var.f13470d.put(str, Long.valueOf(jElapsedRealtime - l.longValue()));
    }
}
