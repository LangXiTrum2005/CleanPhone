package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn.d f21365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uo0 f21366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ln.c f21367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ln.c f21368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ln.c f21369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b11 f21371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s0.i f21373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kh0 f21374j;

    public w11(s0.i adQualityDataStore, wv0 wv0Var, kh0 dataPinger, tt0 tt0Var) {
        kotlin.jvm.internal.n.f(adQualityDataStore, "adQualityDataStore");
        kotlin.jvm.internal.n.f(dataPinger, "dataPinger");
        this.f21374j = dataPinger;
        this.f21365a = cn.d0.b(new cn.z0((ExecutorService) wv0Var.f21612b));
        this.f21366b = new uo0(10);
        this.f21367c = new ln.c();
        this.f21368d = new ln.c();
        this.f21369e = new ln.c();
        this.f21373i = adQualityDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.google.android.gms.internal.ads.w11, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static final Object d(w11 w11Var, ck.c cVar) {
        t11 t11Var;
        ln.a aVar;
        f11 f11Var;
        b11 b11Var;
        c11 c11Var;
        zs1 zs1VarL;
        Long l;
        boolean z10;
        boolean z11;
        w11Var.getClass();
        if (cVar instanceof t11) {
            t11Var = (t11) cVar;
            int i10 = t11Var.f20113i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                t11Var.f20113i = i10 - Integer.MIN_VALUE;
            } else {
                t11Var = new t11(w11Var, cVar);
            }
        } else {
            t11Var = new t11(w11Var, cVar);
        }
        Object objM = t11Var.f20111g;
        ?? r3 = t11Var.f20113i;
        wj.r rVar = wj.r.f53297a;
        bk.a aVar2 = bk.a.f5708a;
        try {
            if (r3 == 0) {
                t9.e.z(objM);
                ln.c cVar2 = w11Var.f21369e;
                t11Var.f20110f = cVar2;
                t11Var.f20113i = 1;
                if (cVar2.e(t11Var) != aVar2) {
                    aVar = cVar2;
                }
                return aVar2;
            }
            if (r3 == 1) {
                ln.a aVar3 = t11Var.f20110f;
                t9.e.z(objM);
                aVar = aVar3;
            } else {
                if (r3 != 2) {
                    if (r3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(objM);
                    return rVar;
                }
                ln.a aVar4 = t11Var.f20110f;
                t9.e.z(objM);
                r3 = aVar4;
            }
            f11Var = (f11) objM;
            ((ln.c) r3).g(null);
            if (f11Var != null && f11Var.z() != 0) {
                for (Map.Entry entry : f11Var.A().entrySet()) {
                    b11Var = (b11) ((c11) entry.getValue()).r();
                    Object value = entry.getValue();
                    kotlin.jvm.internal.n.e(value, "<get-value>(...)");
                    c11Var = (c11) value;
                    zs1VarL = c11Var.L();
                    if (zs1VarL != null) {
                        l = (Long) xj.n.x0(zs1VarL);
                    } else {
                        l = null;
                    }
                    z10 = false;
                    if (c11Var.M() > c11Var.N() || c11Var.F()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (l != null) {
                        if (c11Var.J() - l.longValue() > 5000) {
                            z10 = true;
                        }
                    }
                    if (z11 || z10) {
                        b11Var.b();
                        ((c11) b11Var.f19193b).V(true);
                    }
                    w11Var.f21374j.a((c11) b11Var.e());
                }
                t11Var.f20110f = null;
                t11Var.f20113i = 3;
                if (w11Var.a(t11Var) == aVar2) {
                    return aVar2;
                }
            }
            return rVar;
            fn.e data = w11Var.f21373i.getData();
            t11Var.f20110f = aVar;
            t11Var.f20113i = 2;
            objM = fn.g.m(data, t11Var);
            r3 = aVar;
            if (objM != aVar2) {
                f11Var = (f11) objM;
                ((ln.c) r3).g(null);
                if (f11Var != null) {
                    while (r1.hasNext()) {
                        b11Var = (b11) ((c11) entry.getValue()).r();
                        Object value2 = entry.getValue();
                        kotlin.jvm.internal.n.e(value2, "<get-value>(...)");
                        c11Var = (c11) value2;
                        zs1VarL = c11Var.L();
                        if (zs1VarL != null) {
                            l = (Long) xj.n.x0(zs1VarL);
                        } else {
                            l = null;
                        }
                        z10 = false;
                        if (c11Var.M() > c11Var.N()) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (l != null) {
                            if (c11Var.J() - l.longValue() > 5000) {
                                z10 = true;
                            }
                        }
                        if (z11) {
                            b11Var.b();
                            ((c11) b11Var.f19193b).V(true);
                        } else {
                            b11Var.b();
                            ((c11) b11Var.f19193b).V(true);
                        }
                        w11Var.f21374j.a((c11) b11Var.e());
                    }
                    t11Var.f20110f = null;
                    t11Var.f20113i = 3;
                    if (w11Var.a(t11Var) == aVar2) {
                    }
                }
                return rVar;
            }
            return aVar2;
        } catch (Throwable th2) {
            ((ln.c) r3).g(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(w11 w11Var, String str, ck.c cVar) {
        q11 q11Var;
        long jCurrentTimeMillis;
        String str2;
        ln.c cVar2;
        w11Var.getClass();
        if (cVar instanceof q11) {
            q11Var = (q11) cVar;
            int i10 = q11Var.f18878j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                q11Var.f18878j = i10 - Integer.MIN_VALUE;
            } else {
                q11Var = new q11(w11Var, cVar);
            }
        } else {
            q11Var = new q11(w11Var, cVar);
        }
        Object obj = q11Var.f18876h;
        int i11 = q11Var.f18878j;
        if (i11 == 0) {
            t9.e.z(obj);
            ln.c cVar3 = w11Var.f21367c;
            jCurrentTimeMillis = System.currentTimeMillis();
            q11Var.f18879k = str;
            q11Var.f18874f = cVar3;
            q11Var.f18875g = jCurrentTimeMillis;
            q11Var.f18878j = 1;
            Object objE = cVar3.e(q11Var);
            bk.a aVar = bk.a.f5708a;
            if (objE == aVar) {
                return aVar;
            }
            str2 = str;
            cVar2 = cVar3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = q11Var.f18875g;
            cVar2 = q11Var.f18874f;
            str2 = q11Var.f18879k;
            t9.e.z(obj);
        }
        try {
            boolean z10 = w11Var.f21370f;
            wj.r rVar = wj.r.f53297a;
            if (z10) {
                return rVar;
            }
            w11Var.f21370f = true;
            b11 b11Var = (b11) c11.Q().r();
            w11Var.f21371g = b11Var;
            b11Var.b();
            ((c11) b11Var.f19193b).R(str2);
            b11Var.b();
            ((c11) b11Var.f19193b).X(jCurrentTimeMillis);
            return rVar;
        } finally {
            cVar2.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0083 A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #0 {all -> 0x00aa, blocks: (B:31:0x007f, B:33:0x0083, B:40:0x00a4, B:41:0x00a9), top: B:49:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #0 {all -> 0x00aa, blocks: (B:31:0x007f, B:33:0x0083, B:40:0x00a4, B:41:0x00a9), top: B:49:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(w11 w11Var, ck.c cVar) {
        o11 o11Var;
        ln.c cVar2;
        ln.c cVar3;
        long j10;
        b11 b11Var;
        w11Var.getClass();
        if (cVar instanceof o11) {
            o11Var = (o11) cVar;
            int i10 = o11Var.f18088j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                o11Var.f18088j = i10 - Integer.MIN_VALUE;
            } else {
                o11Var = new o11(w11Var, cVar);
            }
        } else {
            o11Var = new o11(w11Var, cVar);
        }
        Object obj = o11Var.f18086h;
        int i11 = o11Var.f18088j;
        wj.r rVar = wj.r.f53297a;
        Object obj2 = bk.a.f5708a;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                cVar2 = w11Var.f21368d;
                o11Var.f18084f = cVar2;
                o11Var.f18088j = 1;
                if (cVar2.e(o11Var) != obj2) {
                }
                return obj2;
            }
            if (i11 == 1) {
                cVar2 = o11Var.f18084f;
                t9.e.z(obj);
            } else {
                if (i11 == 2) {
                    j10 = o11Var.f18085g;
                    cVar3 = o11Var.f18084f;
                    t9.e.z(obj);
                    try {
                        b11Var = w11Var.f21371g;
                        if (b11Var != null) {
                            kotlin.jvm.internal.n.l("adQualityDataBuilder");
                            throw null;
                        }
                        b11Var.b();
                        ((c11) b11Var.f19193b).a0(j10);
                        cVar3.g(null);
                        o11Var.f18084f = null;
                        o11Var.f18088j = 3;
                        if (w11Var.b(j10, o11Var) != obj2) {
                        }
                        return obj2;
                    } catch (Throwable th2) {
                        cVar3.g(null);
                        throw th2;
                    }
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return rVar;
                }
                t9.e.z(obj);
            }
            o11Var.f18088j = 4;
            if (w11Var.c(o11Var) != obj2) {
                return rVar;
            }
            return obj2;
            if (w11Var.f21372h) {
                cVar2.g(null);
                return rVar;
            }
            w11Var.f21372h = true;
            cVar2.g(null);
            cVar3 = w11Var.f21367c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            o11Var.f18084f = cVar3;
            o11Var.f18085g = jCurrentTimeMillis;
            o11Var.f18088j = 2;
            if (cVar3.e(o11Var) != obj2) {
                j10 = jCurrentTimeMillis;
                b11Var = w11Var.f21371g;
                if (b11Var != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                b11Var.b();
                ((c11) b11Var.f19193b).a0(j10);
                cVar3.g(null);
                o11Var.f18084f = null;
                o11Var.f18088j = 3;
                if (w11Var.b(j10, o11Var) != obj2) {
                    o11Var.f18088j = 4;
                    if (w11Var.c(o11Var) != obj2) {
                        return rVar;
                    }
                }
            }
            return obj2;
        } catch (Throwable th3) {
            cVar2.g(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[Catch: all -> 0x00d9, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[Catch: all -> 0x00d9, TRY_ENTER, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0089 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f6 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x011a A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x012e A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0132 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013a A[Catch: all -> 0x00d9, TRY_LEAVE, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[Catch: all -> 0x00d9, TRY_ENTER, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x014c A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0150 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:27:0x0073, B:30:0x0079, B:33:0x0085, B:35:0x0089, B:37:0x00ad, B:39:0x00bd, B:41:0x00c1, B:42:0x00d5, B:43:0x00d8, B:46:0x00dc, B:47:0x00df, B:48:0x00e0, B:49:0x00e3, B:50:0x00e4, B:52:0x00e8, B:54:0x00f2, B:56:0x00f6, B:58:0x011a, B:59:0x012e, B:60:0x0131, B:61:0x0132, B:62:0x0135, B:63:0x0136, B:65:0x013a, B:68:0x0148, B:69:0x014b, B:70:0x014c, B:71:0x014f, B:72:0x0150, B:73:0x0153), top: B:82:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object g(w11 w11Var, ck.c cVar) {
        v11 v11Var;
        ln.c cVar2;
        ln.c cVar3;
        long j10;
        b11 b11Var;
        b11 b11Var2;
        b11 b11Var3;
        b11 b11Var4;
        long jLongValue;
        b11 b11Var5;
        b11 b11Var6;
        long jLongValue2;
        b11 b11Var7;
        b11 b11Var8;
        w11Var.getClass();
        if (cVar instanceof v11) {
            v11Var = (v11) cVar;
            int i10 = v11Var.f21001j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                v11Var.f21001j = i10 - Integer.MIN_VALUE;
            } else {
                v11Var = new v11(w11Var, cVar);
            }
        } else {
            v11Var = new v11(w11Var, cVar);
        }
        Object obj = v11Var.f20999h;
        int i11 = v11Var.f21001j;
        wj.r rVar = wj.r.f53297a;
        bk.a aVar = bk.a.f5708a;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                cVar2 = w11Var.f21368d;
                v11Var.f20997f = cVar2;
                v11Var.f21001j = 1;
                if (cVar2.e(v11Var) != aVar) {
                }
                return aVar;
            }
            if (i11 == 1) {
                cVar2 = v11Var.f20997f;
                t9.e.z(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = v11Var.f20998g;
                cVar3 = v11Var.f20997f;
                t9.e.z(obj);
            }
            try {
                b11Var = w11Var.f21371g;
                if (b11Var != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                if (((c11) b11Var.f19193b).P() > 0) {
                    b11Var6 = w11Var.f21371g;
                    if (b11Var6 != null) {
                        kotlin.jvm.internal.n.l("adQualityDataBuilder");
                        throw null;
                    }
                    List listUnmodifiableList = Collections.unmodifiableList(((c11) b11Var6.f19193b).O());
                    kotlin.jvm.internal.n.e(listUnmodifiableList, "getAdClickTimestampsMsList(...)");
                    Object objW0 = xj.n.w0(listUnmodifiableList);
                    kotlin.jvm.internal.n.e(objW0, "last(...)");
                    jLongValue2 = j10 - ((Number) objW0).longValue();
                    b11Var7 = w11Var.f21371g;
                    if (b11Var7 != null) {
                        kotlin.jvm.internal.n.l("adQualityDataBuilder");
                        throw null;
                    }
                    b11Var7.b();
                    ((c11) b11Var7.f19193b).B();
                    if (jLongValue2 < 5000) {
                        b11Var8 = w11Var.f21371g;
                        if (b11Var8 != null) {
                            kotlin.jvm.internal.n.l("adQualityDataBuilder");
                            throw null;
                        }
                        int iE = ((c11) b11Var8.f19193b).E() + 1;
                        b11Var8.b();
                        ((c11) b11Var8.f19193b).T(iE);
                    }
                }
                b11Var2 = w11Var.f21371g;
                if (b11Var2 != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                if (((c11) b11Var2.f19193b).M() > 0) {
                    b11Var4 = w11Var.f21371g;
                    if (b11Var4 != null) {
                        kotlin.jvm.internal.n.l("adQualityDataBuilder");
                        throw null;
                    }
                    List listUnmodifiableList2 = Collections.unmodifiableList(((c11) b11Var4.f19193b).L());
                    kotlin.jvm.internal.n.e(listUnmodifiableList2, "getAppBackgroundTimestampsMsList(...)");
                    Object objW1 = xj.n.w0(listUnmodifiableList2);
                    kotlin.jvm.internal.n.e(objW1, "last(...)");
                    jLongValue = j10 - ((Number) objW1).longValue();
                    b11Var5 = w11Var.f21371g;
                    if (b11Var5 != null) {
                        kotlin.jvm.internal.n.l("adQualityDataBuilder");
                        throw null;
                    }
                    long jH = ((c11) b11Var5.f19193b).H() + jLongValue;
                    b11Var5.b();
                    ((c11) b11Var5.f19193b).W(jH);
                }
                b11Var3 = w11Var.f21371g;
                if (b11Var3 != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                b11Var3.b();
                ((c11) b11Var3.f19193b).z(j10);
                cVar3.g(null);
                return rVar;
            } catch (Throwable th2) {
                cVar3.g(null);
                throw th2;
            }
            if (!w11Var.f21372h) {
                cVar2.g(null);
                return rVar;
            }
            w11Var.f21372h = false;
            cVar2.g(null);
            ln.c cVar4 = w11Var.f21367c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            v11Var.f20997f = cVar4;
            v11Var.f20998g = jCurrentTimeMillis;
            v11Var.f21001j = 2;
            if (cVar4.e(v11Var) != aVar) {
                cVar3 = cVar4;
                j10 = jCurrentTimeMillis;
                b11Var = w11Var.f21371g;
                if (b11Var != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                if (((c11) b11Var.f19193b).P() > 0) {
                    b11Var6 = w11Var.f21371g;
                    if (b11Var6 != null) {
                        kotlin.jvm.internal.n.l("adQualityDataBuilder");
                        throw null;
                    }
                    List listUnmodifiableList3 = Collections.unmodifiableList(((c11) b11Var6.f19193b).O());
                    kotlin.jvm.internal.n.e(listUnmodifiableList3, "getAdClickTimestampsMsList(...)");
                    Object objW2 = xj.n.w0(listUnmodifiableList3);
                    kotlin.jvm.internal.n.e(objW2, "last(...)");
                    jLongValue2 = j10 - ((Number) objW2).longValue();
                    b11Var7 = w11Var.f21371g;
                    if (b11Var7 != null) {
                        kotlin.jvm.internal.n.l("adQualityDataBuilder");
                        throw null;
                    }
                    b11Var7.b();
                    ((c11) b11Var7.f19193b).B();
                    if (jLongValue2 < 5000) {
                        b11Var8 = w11Var.f21371g;
                        if (b11Var8 != null) {
                            kotlin.jvm.internal.n.l("adQualityDataBuilder");
                            throw null;
                        }
                        int iE2 = ((c11) b11Var8.f19193b).E() + 1;
                        b11Var8.b();
                        ((c11) b11Var8.f19193b).T(iE2);
                    }
                }
                b11Var2 = w11Var.f21371g;
                if (b11Var2 != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                if (((c11) b11Var2.f19193b).M() > 0) {
                    b11Var4 = w11Var.f21371g;
                    if (b11Var4 != null) {
                        kotlin.jvm.internal.n.l("adQualityDataBuilder");
                        throw null;
                    }
                    List listUnmodifiableList4 = Collections.unmodifiableList(((c11) b11Var4.f19193b).L());
                    kotlin.jvm.internal.n.e(listUnmodifiableList4, "getAppBackgroundTimestampsMsList(...)");
                    Object objW3 = xj.n.w0(listUnmodifiableList4);
                    kotlin.jvm.internal.n.e(objW3, "last(...)");
                    jLongValue = j10 - ((Number) objW3).longValue();
                    b11Var5 = w11Var.f21371g;
                    if (b11Var5 != null) {
                        kotlin.jvm.internal.n.l("adQualityDataBuilder");
                        throw null;
                    }
                    long jH2 = ((c11) b11Var5.f19193b).H() + jLongValue;
                    b11Var5.b();
                    ((c11) b11Var5.f19193b).W(jH2);
                }
                b11Var3 = w11Var.f21371g;
                if (b11Var3 != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                b11Var3.b();
                ((c11) b11Var3.f19193b).z(j10);
                cVar3.g(null);
                return rVar;
            }
            return aVar;
        } catch (Throwable th3) {
            cVar2.g(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008f A[Catch: all -> 0x00f5, TRY_ENTER, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009d A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2 A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7 A[Catch: all -> 0x00f5, TRY_ENTER, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0103 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:54:0x00f7, B:55:0x00fa, B:56:0x00fb, B:57:0x00fe, B:58:0x00ff, B:59:0x0102, B:60:0x0103, B:61:0x0106), top: B:68:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object h(w11 w11Var, ck.c cVar) {
        s11 s11Var;
        Object obj;
        long j10;
        Object obj2;
        b11 b11Var;
        long jI;
        b11 b11Var2;
        b11 b11Var3;
        b11 b11Var4;
        c11 c11Var;
        c11 c11Var2;
        String strC;
        ln.c cVar2 = w11Var.f21367c;
        if (cVar instanceof s11) {
            s11Var = (s11) cVar;
            int i10 = s11Var.f19763j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                s11Var.f19763j = i10 - Integer.MIN_VALUE;
            } else {
                s11Var = new s11(w11Var, cVar);
            }
        } else {
            s11Var = new s11(w11Var, cVar);
        }
        Object obj3 = s11Var.f19761h;
        int i11 = s11Var.f19763j;
        wj.r rVar = wj.r.f53297a;
        Object obj4 = bk.a.f5708a;
        try {
            if (i11 == 0) {
                t9.e.z(obj3);
                s11Var.f19759f = cVar2;
                s11Var.f19763j = 1;
                if (cVar2.e(s11Var) != obj4) {
                    obj = cVar2;
                }
                return obj4;
            }
            if (i11 == 1) {
                ln.a aVar = (ln.a) s11Var.f19759f;
                t9.e.z(obj3);
                obj = aVar;
            } else {
                if (i11 == 2) {
                    j10 = s11Var.f19760g;
                    ln.a aVar2 = (ln.a) s11Var.f19759f;
                    t9.e.z(obj3);
                    obj2 = aVar2;
                    try {
                        b11Var = w11Var.f21371g;
                        if (b11Var != null) {
                            kotlin.jvm.internal.n.l("adQualityDataBuilder");
                            throw null;
                        }
                        jI = j10 - ((c11) b11Var.f19193b).I();
                        b11Var2 = w11Var.f21371g;
                        if (b11Var2 != null) {
                            kotlin.jvm.internal.n.l("adQualityDataBuilder");
                            throw null;
                        }
                        long jH = jI - ((c11) b11Var2.f19193b).H();
                        b11Var.b();
                        ((c11) b11Var.f19193b).S(jH);
                        b11Var3 = w11Var.f21371g;
                        if (b11Var3 != null) {
                            kotlin.jvm.internal.n.l("adQualityDataBuilder");
                            throw null;
                        }
                        b11Var3.b();
                        ((c11) b11Var3.f19193b).Z(j10);
                        b11Var4 = w11Var.f21371g;
                        if (b11Var4 != null) {
                            kotlin.jvm.internal.n.l("adQualityDataBuilder");
                            throw null;
                        }
                        c11Var = (c11) b11Var4.e();
                        ((ln.c) obj2).g(null);
                        s11Var.f19759f = c11Var;
                        s11Var.f19763j = 3;
                        if (w11Var.c(s11Var) != obj4) {
                            c11Var2 = c11Var;
                        }
                        return obj4;
                    } catch (Throwable th2) {
                        ((ln.c) obj2).g(null);
                        throw th2;
                    }
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj3);
                    return rVar;
                }
                c11Var2 = (c11) s11Var.f19759f;
                t9.e.z(obj3);
            }
            if (w11Var.f21374j.a(c11Var2)) {
                strC = c11Var2.C();
                kotlin.jvm.internal.n.e(strC, "getGwsQueryId(...)");
                s11Var.f19759f = null;
                s11Var.f19763j = 4;
                if (w11Var.k(strC, s11Var) == obj4) {
                    return obj4;
                }
            }
            return rVar;
            if (!w11Var.f21370f) {
                ((ln.c) obj).g(null);
                return rVar;
            }
            w11Var.f21370f = false;
            ((ln.c) obj).g(null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            s11Var.f19759f = cVar2;
            s11Var.f19760g = jCurrentTimeMillis;
            s11Var.f19763j = 2;
            if (cVar2.e(s11Var) != obj4) {
                j10 = jCurrentTimeMillis;
                obj2 = cVar2;
                b11Var = w11Var.f21371g;
                if (b11Var != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                jI = j10 - ((c11) b11Var.f19193b).I();
                b11Var2 = w11Var.f21371g;
                if (b11Var2 != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                long jH2 = jI - ((c11) b11Var2.f19193b).H();
                b11Var.b();
                ((c11) b11Var.f19193b).S(jH2);
                b11Var3 = w11Var.f21371g;
                if (b11Var3 != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                b11Var3.b();
                ((c11) b11Var3.f19193b).Z(j10);
                b11Var4 = w11Var.f21371g;
                if (b11Var4 != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                c11Var = (c11) b11Var4.e();
                ((ln.c) obj2).g(null);
                s11Var.f19759f = c11Var;
                s11Var.f19763j = 3;
                if (w11Var.c(s11Var) != obj4) {
                    c11Var2 = c11Var;
                    if (w11Var.f21374j.a(c11Var2)) {
                        strC = c11Var2.C();
                        kotlin.jvm.internal.n.e(strC, "getGwsQueryId(...)");
                        s11Var.f19759f = null;
                        s11Var.f19763j = 4;
                        if (w11Var.k(strC, s11Var) == obj4) {
                        }
                    }
                    return rVar;
                }
            }
            return obj4;
        } catch (Throwable th3) {
            ((ln.c) obj).g(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008f A[Catch: all -> 0x0103, TRY_ENTER, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009d A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0 A[Catch: all -> 0x0103, TRY_LEAVE, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x0105 A[Catch: all -> 0x0103, TRY_ENTER, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0109 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x010d A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0111 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0115 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:33:0x0089, B:36:0x008f, B:38:0x009d, B:40:0x00b4, B:42:0x00c2, B:44:0x00d0, B:56:0x0105, B:57:0x0108, B:58:0x0109, B:59:0x010c, B:60:0x010d, B:61:0x0110, B:62:0x0111, B:63:0x0114, B:64:0x0115, B:65:0x0118), top: B:72:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object i(w11 w11Var, ck.c cVar) {
        u11 u11Var;
        Object obj;
        long j10;
        Object obj2;
        b11 b11Var;
        long jI;
        b11 b11Var2;
        b11 b11Var3;
        b11 b11Var4;
        b11 b11Var5;
        c11 c11Var;
        c11 c11Var2;
        String strC;
        ln.c cVar2 = w11Var.f21367c;
        if (cVar instanceof u11) {
            u11Var = (u11) cVar;
            int i10 = u11Var.f20570j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                u11Var.f20570j = i10 - Integer.MIN_VALUE;
            } else {
                u11Var = new u11(w11Var, cVar);
            }
        } else {
            u11Var = new u11(w11Var, cVar);
        }
        Object obj3 = u11Var.f20568h;
        int i11 = u11Var.f20570j;
        wj.r rVar = wj.r.f53297a;
        Object obj4 = bk.a.f5708a;
        try {
            if (i11 == 0) {
                t9.e.z(obj3);
                u11Var.f20566f = cVar2;
                u11Var.f20570j = 1;
                if (cVar2.e(u11Var) != obj4) {
                    obj = cVar2;
                }
                return obj4;
            }
            if (i11 == 1) {
                ln.a aVar = (ln.a) u11Var.f20566f;
                t9.e.z(obj3);
                obj = aVar;
            } else {
                if (i11 == 2) {
                    j10 = u11Var.f20567g;
                    ln.a aVar2 = (ln.a) u11Var.f20566f;
                    t9.e.z(obj3);
                    obj2 = aVar2;
                    try {
                        b11Var = w11Var.f21371g;
                        if (b11Var != null) {
                            kotlin.jvm.internal.n.l("adQualityDataBuilder");
                            throw null;
                        }
                        jI = j10 - ((c11) b11Var.f19193b).I();
                        b11Var2 = w11Var.f21371g;
                        if (b11Var2 != null) {
                            kotlin.jvm.internal.n.l("adQualityDataBuilder");
                            throw null;
                        }
                        long jH = jI - ((c11) b11Var2.f19193b).H();
                        b11Var.b();
                        ((c11) b11Var.f19193b).S(jH);
                        b11Var3 = w11Var.f21371g;
                        if (b11Var3 != null) {
                            kotlin.jvm.internal.n.l("adQualityDataBuilder");
                            throw null;
                        }
                        b11Var3.b();
                        ((c11) b11Var3.f19193b).Y(j10);
                        b11Var4 = w11Var.f21371g;
                        if (b11Var4 != null) {
                            kotlin.jvm.internal.n.l("adQualityDataBuilder");
                            throw null;
                        }
                        b11Var4.b();
                        ((c11) b11Var4.f19193b).U();
                        b11Var5 = w11Var.f21371g;
                        if (b11Var5 != null) {
                            kotlin.jvm.internal.n.l("adQualityDataBuilder");
                            throw null;
                        }
                        c11Var = (c11) b11Var5.e();
                        ((ln.c) obj2).g(null);
                        u11Var.f20566f = c11Var;
                        u11Var.f20570j = 3;
                        if (w11Var.c(u11Var) != obj4) {
                            c11Var2 = c11Var;
                        }
                        return obj4;
                    } catch (Throwable th2) {
                        ((ln.c) obj2).g(null);
                        throw th2;
                    }
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj3);
                    return rVar;
                }
                c11Var2 = (c11) u11Var.f20566f;
                t9.e.z(obj3);
            }
            if (w11Var.f21374j.a(c11Var2)) {
                strC = c11Var2.C();
                kotlin.jvm.internal.n.e(strC, "getGwsQueryId(...)");
                u11Var.f20566f = null;
                u11Var.f20570j = 4;
                if (w11Var.k(strC, u11Var) == obj4) {
                    return obj4;
                }
            }
            return rVar;
            if (!w11Var.f21370f) {
                ((ln.c) obj).g(null);
                return rVar;
            }
            w11Var.f21370f = false;
            ((ln.c) obj).g(null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            u11Var.f20566f = cVar2;
            u11Var.f20567g = jCurrentTimeMillis;
            u11Var.f20570j = 2;
            if (cVar2.e(u11Var) != obj4) {
                j10 = jCurrentTimeMillis;
                obj2 = cVar2;
                b11Var = w11Var.f21371g;
                if (b11Var != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                jI = j10 - ((c11) b11Var.f19193b).I();
                b11Var2 = w11Var.f21371g;
                if (b11Var2 != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                long jH2 = jI - ((c11) b11Var2.f19193b).H();
                b11Var.b();
                ((c11) b11Var.f19193b).S(jH2);
                b11Var3 = w11Var.f21371g;
                if (b11Var3 != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                b11Var3.b();
                ((c11) b11Var3.f19193b).Y(j10);
                b11Var4 = w11Var.f21371g;
                if (b11Var4 != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                b11Var4.b();
                ((c11) b11Var4.f19193b).U();
                b11Var5 = w11Var.f21371g;
                if (b11Var5 != null) {
                    kotlin.jvm.internal.n.l("adQualityDataBuilder");
                    throw null;
                }
                c11Var = (c11) b11Var5.e();
                ((ln.c) obj2).g(null);
                u11Var.f20566f = c11Var;
                u11Var.f20570j = 3;
                if (w11Var.c(u11Var) != obj4) {
                    c11Var2 = c11Var;
                    if (w11Var.f21374j.a(c11Var2)) {
                        strC = c11Var2.C();
                        kotlin.jvm.internal.n.e(strC, "getGwsQueryId(...)");
                        u11Var.f20566f = null;
                        u11Var.f20570j = 4;
                        if (w11Var.k(strC, u11Var) == obj4) {
                        }
                    }
                    return rVar;
                }
            }
            return obj4;
        } catch (Throwable th3) {
            ((ln.c) obj).g(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object j(w11 w11Var, ck.c cVar) {
        r11 r11Var;
        ln.c cVar2;
        long j10;
        w11Var.getClass();
        if (cVar instanceof r11) {
            r11Var = (r11) cVar;
            int i10 = r11Var.f19276j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                r11Var.f19276j = i10 - Integer.MIN_VALUE;
            } else {
                r11Var = new r11(w11Var, cVar);
            }
        } else {
            r11Var = new r11(w11Var, cVar);
        }
        Object obj = r11Var.f19274h;
        int i11 = r11Var.f19276j;
        if (i11 == 0) {
            t9.e.z(obj);
            ln.c cVar3 = w11Var.f21367c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            r11Var.f19273g = cVar3;
            r11Var.f19272f = jCurrentTimeMillis;
            r11Var.f19276j = 1;
            Object objE = cVar3.e(r11Var);
            bk.a aVar = bk.a.f5708a;
            if (objE == aVar) {
                return aVar;
            }
            cVar2 = cVar3;
            j10 = jCurrentTimeMillis;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = r11Var.f19272f;
            cVar2 = r11Var.f19273g;
            t9.e.z(obj);
        }
        try {
            b11 b11Var = w11Var.f21371g;
            if (b11Var == null) {
                kotlin.jvm.internal.n.l("adQualityDataBuilder");
                throw null;
            }
            b11Var.b();
            ((c11) b11Var.f19193b).A(j10);
            cVar2.g(null);
            return wj.r.f53297a;
        } catch (Throwable th2) {
            cVar2.g(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ck.c cVar) throws Throwable {
        k11 k11Var;
        ln.c cVar2;
        ln.a aVar;
        Throwable th2;
        ln.a aVar2;
        if (cVar instanceof k11) {
            k11Var = (k11) cVar;
            int i10 = k11Var.f16266i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                k11Var.f16266i = i10 - Integer.MIN_VALUE;
            } else {
                k11Var = new k11(this, cVar);
            }
        } else {
            k11Var = new k11(this, cVar);
        }
        Object obj = k11Var.f16264g;
        int i11 = k11Var.f16266i;
        int i12 = 2;
        ak.f fVar = null;
        bk.a aVar3 = bk.a.f5708a;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                cVar2 = this.f21369e;
                k11Var.f16263f = cVar2;
                k11Var.f16266i = 1;
                if (cVar2.e(k11Var) != aVar3) {
                }
                aVar = cVar2;
                return aVar3;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = k11Var.f16263f;
                try {
                    t9.e.z(obj);
                    aVar2 = aVar2;
                    ((ln.c) aVar2).g(null);
                    return wj.r.f53297a;
                } catch (Throwable th3) {
                    th2 = th3;
                    ((ln.c) aVar2).g(null);
                    throw th2;
                }
            }
            ln.a aVar4 = k11Var.f16263f;
            t9.e.z(obj);
            aVar = aVar4;
            aVar = cVar2;
            s0.i iVar = this.f21373i;
            l11 l11Var = new l11(i12, fVar, 0);
            k11Var.f16263f = aVar;
            k11Var.f16266i = 2;
            Object objA = iVar.a(l11Var, k11Var);
            if (objA != aVar3) {
                ln.a aVar5 = aVar;
                obj = objA;
                aVar2 = aVar5;
                ((ln.c) aVar2).g(null);
                return wj.r.f53297a;
            }
            aVar = cVar2;
            return aVar3;
        } catch (Throwable th4) {
            ln.a aVar6 = aVar;
            th2 = th4;
            aVar2 = aVar6;
            ((ln.c) aVar2).g(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j10, ck.c cVar) {
        j11 j11Var;
        ln.c cVar2;
        if (cVar instanceof j11) {
            j11Var = (j11) cVar;
            int i10 = j11Var.f15913j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j11Var.f15913j = i10 - Integer.MIN_VALUE;
            } else {
                j11Var = new j11(this, cVar);
            }
        } else {
            j11Var = new j11(this, cVar);
        }
        Object obj = j11Var.f15911h;
        int i11 = j11Var.f15913j;
        if (i11 == 0) {
            t9.e.z(obj);
            ln.c cVar3 = this.f21367c;
            j11Var.f15910g = cVar3;
            j11Var.f15909f = j10;
            j11Var.f15913j = 1;
            Object objE = cVar3.e(j11Var);
            bk.a aVar = bk.a.f5708a;
            if (objE == aVar) {
                return aVar;
            }
            cVar2 = cVar3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = j11Var.f15909f;
            cVar2 = j11Var.f15910g;
            t9.e.z(obj);
        }
        try {
            b11 b11Var = this.f21371g;
            if (b11Var == null) {
                kotlin.jvm.internal.n.l("adQualityDataBuilder");
                throw null;
            }
            long jI = j10 - ((c11) b11Var.f19193b).I();
            b11 b11Var2 = this.f21371g;
            if (b11Var2 == null) {
                kotlin.jvm.internal.n.l("adQualityDataBuilder");
                throw null;
            }
            long jH = jI - ((c11) b11Var2.f19193b).H();
            b11Var.b();
            ((c11) b11Var.f19193b).S(jH);
            cVar2.g(null);
            return wj.r.f53297a;
        } catch (Throwable th2) {
            cVar2.g(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ck.c cVar) throws Throwable {
        p11 p11Var;
        ln.c cVar2;
        ln.a aVar;
        ln.c cVar3;
        c11 c11Var;
        Throwable th2;
        ln.a aVar2;
        if (cVar instanceof p11) {
            p11Var = (p11) cVar;
            int i10 = p11Var.f18436j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                p11Var.f18436j = i10 - Integer.MIN_VALUE;
            } else {
                p11Var = new p11(this, cVar);
            }
        } else {
            p11Var = new p11(this, cVar);
        }
        Object objA = p11Var.f18434h;
        int i11 = p11Var.f18436j;
        ak.f fVar = null;
        bk.a aVar3 = bk.a.f5708a;
        try {
            if (i11 == 0) {
                t9.e.z(objA);
                cVar2 = this.f21367c;
                p11Var.f18432f = cVar2;
                p11Var.f18436j = 1;
                if (cVar2.e(p11Var) != aVar3) {
                }
                aVar = cVar2;
                return aVar3;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (ln.a) p11Var.f18432f;
                    try {
                        t9.e.z(objA);
                        ((ln.c) aVar2).g(null);
                        return wj.r.f53297a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        ((ln.c) aVar2).g(null);
                        throw th2;
                    }
                }
                cVar3 = p11Var.f18433g;
                c11Var = (c11) p11Var.f18432f;
                t9.e.z(objA);
                try {
                    s0.i iVar = this.f21373i;
                    androidx.lifecycle.p pVar = new androidx.lifecycle.p(c11Var, fVar, 3);
                    p11Var.f18432f = cVar3;
                    p11Var.f18433g = null;
                    p11Var.f18436j = 3;
                    objA = iVar.a(pVar, p11Var);
                    if (objA != aVar3) {
                        aVar2 = cVar3;
                        ((ln.c) aVar2).g(null);
                        return wj.r.f53297a;
                    }
                    aVar = cVar2;
                    return aVar3;
                } catch (Throwable th4) {
                    th2 = th4;
                    aVar2 = cVar3;
                    ((ln.c) aVar2).g(null);
                    throw th2;
                }
            }
            ln.a aVar4 = (ln.a) p11Var.f18432f;
            t9.e.z(objA);
            aVar = aVar4;
            aVar = cVar2;
            b11 b11Var = this.f21371g;
            if (b11Var == null) {
                kotlin.jvm.internal.n.l("adQualityDataBuilder");
                throw null;
            }
            c11 c11Var2 = (c11) b11Var.e();
            ((ln.c) aVar).g(null);
            p11Var.f18432f = c11Var2;
            cVar3 = this.f21369e;
            p11Var.f18433g = cVar3;
            p11Var.f18436j = 2;
            if (cVar3.e(p11Var) != aVar3) {
                c11Var = c11Var2;
                s0.i iVar2 = this.f21373i;
                androidx.lifecycle.p pVar2 = new androidx.lifecycle.p(c11Var, fVar, 3);
                p11Var.f18432f = cVar3;
                p11Var.f18433g = null;
                p11Var.f18436j = 3;
                objA = iVar2.a(pVar2, p11Var);
                if (objA != aVar3) {
                    aVar2 = cVar3;
                    ((ln.c) aVar2).g(null);
                    return wj.r.f53297a;
                }
            }
            aVar = cVar2;
            return aVar3;
        } catch (Throwable th5) {
            ((ln.c) aVar).g(null);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, ck.c cVar) throws Throwable {
        i11 i11Var;
        String str2;
        ln.c cVar2;
        Throwable th2;
        ln.a aVar;
        if (cVar instanceof i11) {
            i11Var = (i11) cVar;
            int i10 = i11Var.f15498j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i11Var.f15498j = i10 - Integer.MIN_VALUE;
            } else {
                i11Var = new i11(this, cVar);
            }
        } else {
            i11Var = new i11(this, cVar);
        }
        Object objA = i11Var.f15496h;
        int i11 = i11Var.f15498j;
        ak.f fVar = null;
        bk.a aVar2 = bk.a.f5708a;
        try {
            if (i11 == 0) {
                t9.e.z(objA);
                i11Var.f15494f = str;
                ln.c cVar3 = this.f21369e;
                i11Var.f15495g = cVar3;
                i11Var.f15498j = 1;
                if (cVar3.e(i11Var) != aVar2) {
                    str2 = str;
                    cVar2 = cVar3;
                }
                return aVar2;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (ln.a) i11Var.f15494f;
                try {
                    t9.e.z(objA);
                    ((ln.c) aVar).g(null);
                    return wj.r.f53297a;
                } catch (Throwable th3) {
                    th2 = th3;
                    ((ln.c) aVar).g(null);
                    throw th2;
                }
            }
            cVar2 = i11Var.f15495g;
            str2 = (String) i11Var.f15494f;
            t9.e.z(objA);
            s0.i iVar = this.f21373i;
            androidx.lifecycle.p pVar = new androidx.lifecycle.p(str2, fVar, 2);
            i11Var.f15494f = cVar2;
            i11Var.f15495g = null;
            i11Var.f15498j = 2;
            objA = iVar.a(pVar, i11Var);
            if (objA != aVar2) {
                aVar = cVar2;
                ((ln.c) aVar).g(null);
                return wj.r.f53297a;
            }
            return aVar2;
        } catch (Throwable th4) {
            ln.c cVar4 = cVar2;
            th2 = th4;
            aVar = cVar4;
            ((ln.c) aVar).g(null);
            throw th2;
        }
    }
}
