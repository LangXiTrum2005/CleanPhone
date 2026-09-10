package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sh0 implements zv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19971a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f19973c;

    public sh0(pj pjVar, Map map) {
        this.f19972b = map;
        this.f19973c = pjVar;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003a */
    @Override // com.google.android.gms.internal.ads.zv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(com.google.android.gms.internal.ads.vv0 r3, java.lang.String r4) {
        /*
            r2 = this;
            int r4 = r2.f19971a
            switch(r4) {
                case 0: goto L7b;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.ul r4 = com.google.android.gms.internal.ads.am.f12269n7
            com.google.android.gms.internal.ads.yl r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r0.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L18
            goto L74
        L18:
            com.google.android.gms.internal.ads.vv0 r4 = com.google.android.gms.internal.ads.vv0.RENDERER
            if (r4 != r3) goto L3d
            java.lang.Object r2 = r2.f19972b
            r4 = r2
            com.google.android.gms.internal.ads.pl0 r4 = (com.google.android.gms.internal.ads.pl0) r4
            p9.a r2 = com.google.android.gms.ads.internal.zzt.zzk()
            p9.b r2 = (p9.b) r2
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            monitor-enter(r4)
            java.lang.Object r0 = r4.f18714i     // Catch: java.lang.Throwable -> L3a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3a
            r4.f18709d = r2     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r4)
            goto L74
        L37:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r2     // Catch: java.lang.Throwable -> L3a
        L3a:
            r2 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            throw r2
        L3d:
            com.google.android.gms.internal.ads.vv0 r4 = com.google.android.gms.internal.ads.vv0.PRELOADED_LOADER
            if (r4 == r3) goto L45
            com.google.android.gms.internal.ads.vv0 r4 = com.google.android.gms.internal.ads.vv0.SERVER_TRANSACTION
            if (r4 != r3) goto L74
        L45:
            java.lang.Object r3 = r2.f19972b
            r4 = r3
            com.google.android.gms.internal.ads.pl0 r4 = (com.google.android.gms.internal.ads.pl0) r4
            p9.a r3 = com.google.android.gms.ads.internal.zzt.zzk()
            p9.b r3 = (p9.b) r3
            r3.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            monitor-enter(r4)
            java.lang.Object r3 = r4.f18711f     // Catch: java.lang.Throwable -> L78
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L78
            r4.f18706a = r0     // Catch: java.lang.Throwable -> L75
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L75
            monitor-exit(r4)
            java.lang.Object r2 = r2.f19973c
            com.google.android.gms.internal.ads.ql0 r2 = (com.google.android.gms.internal.ads.ql0) r2
            long r3 = r4.a()
            androidx.recyclerview.widget.c r0 = new androidx.recyclerview.widget.c
            r1 = 5
            r0.<init>(r2, r3, r1)
            java.lang.Object r2 = r2.f18848b
            com.google.android.gms.internal.ads.lj1 r2 = (com.google.android.gms.internal.ads.lj1) r2
            r2.i(r0)
        L74:
            return
        L75:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L75
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r2 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            throw r2
        L7b:
            java.lang.Object r4 = r2.f19972b
            java.util.Map r4 = (java.util.Map) r4
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L94
            java.lang.Object r2 = r2.f19973c
            com.google.android.gms.internal.ads.pj r2 = (com.google.android.gms.internal.ads.pj) r2
            java.lang.Object r3 = r4.get(r3)
            com.google.android.gms.internal.ads.rh0 r3 = (com.google.android.gms.internal.ads.rh0) r3
            int r3 = r3.f19591a
            r2.b(r3)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sh0.O(com.google.android.gms.internal.ads.vv0, java.lang.String):void");
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void b(vv0 vv0Var, String str) {
        switch (this.f19971a) {
            case 0:
                Map map = (Map) this.f19972b;
                if (map.containsKey(vv0Var)) {
                    ((pj) this.f19973c).b(((rh0) map.get(vv0Var)).f19592b);
                    return;
                }
                return;
            default:
                if (((Boolean) zzba.zzc().a(am.f12269n7)).booleanValue() && vv0.RENDERER == vv0Var) {
                    pl0 pl0Var = (pl0) this.f19972b;
                    if (pl0Var.b() != 0) {
                        ((p9.b) zzt.zzk()).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - pl0Var.b();
                        synchronized (pl0Var) {
                            try {
                                synchronized (pl0Var.f18715j) {
                                    try {
                                        pl0Var.f18710e = jElapsedRealtime;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void e(vv0 vv0Var, String str, Throwable th2) {
        switch (this.f19971a) {
            case 0:
                Map map = (Map) this.f19972b;
                if (map.containsKey(vv0Var)) {
                    ((pj) this.f19973c).b(((rh0) map.get(vv0Var)).f19593c);
                    return;
                }
                return;
            default:
                if (((Boolean) zzba.zzc().a(am.f12269n7)).booleanValue() && vv0.RENDERER == vv0Var) {
                    pl0 pl0Var = (pl0) this.f19972b;
                    if (pl0Var.b() != 0) {
                        ((p9.b) zzt.zzk()).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - pl0Var.b();
                        synchronized (pl0Var) {
                            try {
                                synchronized (pl0Var.f18715j) {
                                    try {
                                        pl0Var.f18710e = jElapsedRealtime;
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zv0
    public final void v(String str) {
        int i10 = this.f19971a;
    }

    public sh0(pl0 pl0Var, ql0 ql0Var) {
        this.f19972b = pl0Var;
        this.f19973c = ql0Var;
    }

    private final void a(String str) {
    }

    private final void c(String str) {
    }
}
