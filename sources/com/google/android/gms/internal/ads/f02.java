package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f02 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Random f14148h = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h02 f14152d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14154f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ih f14149a = new ih();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ug f14150b = new ug();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f14151c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ci f14153e = ci.f13168a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14155g = -1;

    public final synchronized String a(ci ciVar, r32 r32Var) {
        return e(ciVar.o(r32Var.f19359a, this.f14150b).f20772c, r32Var).f13794a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0058, B:32:0x0062, B:35:0x0069, B:37:0x006f, B:39:0x0082, B:40:0x0096, B:42:0x009a, B:43:0x009c, B:45:0x00a6, B:47:0x00aa, B:53:0x00b8), top: B:56:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0058, B:32:0x0062, B:35:0x0069, B:37:0x006f, B:39:0x0082, B:40:0x0096, B:42:0x009a, B:43:0x009c, B:45:0x00a6, B:47:0x00aa, B:53:0x00b8), top: B:56:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0058, B:32:0x0062, B:35:0x0069, B:37:0x006f, B:39:0x0082, B:40:0x0096, B:42:0x009a, B:43:0x009c, B:45:0x00a6, B:47:0x00aa, B:53:0x00b8), top: B:56:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0062 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0058, B:32:0x0062, B:35:0x0069, B:37:0x006f, B:39:0x0082, B:40:0x0096, B:42:0x009a, B:43:0x009c, B:45:0x00a6, B:47:0x00aa, B:53:0x00b8), top: B:56:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0058, B:32:0x0062, B:35:0x0069, B:37:0x006f, B:39:0x0082, B:40:0x0096, B:42:0x009a, B:43:0x009c, B:45:0x00a6, B:47:0x00aa, B:53:0x00b8), top: B:56:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0082 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0058, B:32:0x0062, B:35:0x0069, B:37:0x006f, B:39:0x0082, B:40:0x0096, B:42:0x009a, B:43:0x009c, B:45:0x00a6, B:47:0x00aa, B:53:0x00b8), top: B:56:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009a A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0058, B:32:0x0062, B:35:0x0069, B:37:0x006f, B:39:0x0082, B:40:0x0096, B:42:0x009a, B:43:0x009c, B:45:0x00a6, B:47:0x00aa, B:53:0x00b8), top: B:56:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0058, B:32:0x0062, B:35:0x0069, B:37:0x006f, B:39:0x0082, B:40:0x0096, B:42:0x009a, B:43:0x009c, B:45:0x00a6, B:47:0x00aa, B:53:0x00b8), top: B:56:0x0007 }] */
    public final synchronized void b(zz1 zz1Var) {
        int i10;
        e02 e02VarE;
        Object obj;
        int i11;
        e02 e02VarE2;
        e02 e02Var;
        long j10;
        long jS = uu0.s(0L);
        synchronized (this) {
            try {
                if (this.f14152d == null) {
                    throw null;
                }
                ci ciVar = zz1Var.f22776b;
                if (!ciVar.g()) {
                    r32 r32Var = zz1Var.f22778d;
                    if (r32Var != null) {
                        long j11 = r32Var.f19362d;
                        if (j11 == -1) {
                            e02Var = (e02) this.f14151c.get(this.f14154f);
                            if (e02Var != null || e02Var.f13796c != -1 || e02Var.f13795b == zz1Var.f22777c) {
                                i10 = zz1Var.f22777c;
                                e02VarE = e(i10, r32Var);
                                if (this.f14154f == null) {
                                    this.f14154f = e02VarE.f13794a;
                                }
                                if (r32Var != null && r32Var.b()) {
                                    obj = r32Var.f19359a;
                                    long j12 = r32Var.f19362d;
                                    i11 = r32Var.f19360b;
                                    e02VarE2 = e(i10, new r32(obj, j12, i11));
                                    if (!e02VarE2.f13798e) {
                                        e02VarE2.f13798e = true;
                                        ug ugVar = this.f14150b;
                                        ciVar.o(obj, ugVar);
                                        ugVar.f20775f.a(i11).getClass();
                                        Math.max(0L, jS + jS);
                                    }
                                }
                                if (!e02VarE.f13798e) {
                                    e02VarE.f13798e = true;
                                }
                                if (e02VarE.f13794a.equals(this.f14154f) && !e02VarE.f13799f) {
                                    e02VarE.f13799f = true;
                                    this.f14152d.r(zz1Var, e02VarE.f13794a);
                                }
                            }
                        } else {
                            e02 e02Var2 = (e02) this.f14151c.get(this.f14154f);
                            if (e02Var2 != null) {
                                j10 = e02Var2.f13796c;
                                if (j10 == -1) {
                                    j10 = this.f14155g + 1;
                                }
                            } else {
                                j10 = this.f14155g + 1;
                            }
                            if (j11 >= j10) {
                                e02Var = (e02) this.f14151c.get(this.f14154f);
                                if (e02Var != null) {
                                    i10 = zz1Var.f22777c;
                                    e02VarE = e(i10, r32Var);
                                    if (this.f14154f == null) {
                                        this.f14154f = e02VarE.f13794a;
                                    }
                                    if (r32Var != null) {
                                        obj = r32Var.f19359a;
                                        long j13 = r32Var.f19362d;
                                        i11 = r32Var.f19360b;
                                        e02VarE2 = e(i10, new r32(obj, j13, i11));
                                        if (!e02VarE2.f13798e) {
                                            e02VarE2.f13798e = true;
                                            ug ugVar2 = this.f14150b;
                                            ciVar.o(obj, ugVar2);
                                            ugVar2.f20775f.a(i11).getClass();
                                            Math.max(0L, jS + jS);
                                        }
                                    }
                                    if (!e02VarE.f13798e) {
                                        e02VarE.f13798e = true;
                                    }
                                    if (e02VarE.f13794a.equals(this.f14154f)) {
                                        e02VarE.f13799f = true;
                                        this.f14152d.r(zz1Var, e02VarE.f13794a);
                                    }
                                } else {
                                    i10 = zz1Var.f22777c;
                                    e02VarE = e(i10, r32Var);
                                    if (this.f14154f == null) {
                                        this.f14154f = e02VarE.f13794a;
                                    }
                                    if (r32Var != null) {
                                        obj = r32Var.f19359a;
                                        long j14 = r32Var.f19362d;
                                        i11 = r32Var.f19360b;
                                        e02VarE2 = e(i10, new r32(obj, j14, i11));
                                        if (!e02VarE2.f13798e) {
                                            e02VarE2.f13798e = true;
                                            ug ugVar3 = this.f14150b;
                                            ciVar.o(obj, ugVar3);
                                            ugVar3.f20775f.a(i11).getClass();
                                            Math.max(0L, jS + jS);
                                        }
                                    }
                                    if (!e02VarE.f13798e) {
                                        e02VarE.f13798e = true;
                                    }
                                    if (e02VarE.f13794a.equals(this.f14154f)) {
                                        e02VarE.f13799f = true;
                                        this.f14152d.r(zz1Var, e02VarE.f13794a);
                                    }
                                }
                            }
                        }
                    } else {
                        i10 = zz1Var.f22777c;
                        e02VarE = e(i10, r32Var);
                        if (this.f14154f == null) {
                            this.f14154f = e02VarE.f13794a;
                        }
                        if (r32Var != null) {
                            obj = r32Var.f19359a;
                            long j15 = r32Var.f19362d;
                            i11 = r32Var.f19360b;
                            e02VarE2 = e(i10, new r32(obj, j15, i11));
                            if (!e02VarE2.f13798e) {
                                e02VarE2.f13798e = true;
                                ug ugVar4 = this.f14150b;
                                ciVar.o(obj, ugVar4);
                                ugVar4.f20775f.a(i11).getClass();
                                Math.max(0L, jS + jS);
                            }
                        }
                        if (!e02VarE.f13798e) {
                            e02VarE.f13798e = true;
                        }
                        if (e02VarE.f13794a.equals(this.f14154f)) {
                            e02VarE.f13799f = true;
                            this.f14152d.r(zz1Var, e02VarE.f13794a);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(zz1 zz1Var) {
        r32 r32Var;
        boolean zG = zz1Var.f22776b.g();
        HashMap map = this.f14151c;
        if (zG) {
            String str = this.f14154f;
            if (str != null) {
                e02 e02Var = (e02) map.get(str);
                e02Var.getClass();
                d(e02Var);
                return;
            }
            return;
        }
        e02 e02Var2 = (e02) map.get(this.f14154f);
        int i10 = zz1Var.f22777c;
        r32 r32Var2 = zz1Var.f22778d;
        this.f14154f = e(i10, r32Var2).f13794a;
        b(zz1Var);
        if (r32Var2 != null) {
            long j10 = r32Var2.f19362d;
            if (r32Var2.b()) {
                if (e02Var2 != null && e02Var2.f13796c == j10 && (r32Var = e02Var2.f13797d) != null) {
                    if (r32Var.f19360b == r32Var2.f19360b) {
                        if (r32Var.f19361c == r32Var2.f19361c) {
                            return;
                        }
                    }
                }
                e(i10, new r32(r32Var2.f19359a, j10));
            }
        }
    }

    public final void d(e02 e02Var) {
        long j10 = e02Var.f13796c;
        if (j10 != -1 && e02Var.f13798e) {
            this.f14155g = j10;
        }
        this.f14154f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final e02 e(int i10, r32 r32Var) {
        long j10;
        long j11;
        long j12;
        HashMap map = this.f14151c;
        long j13 = Long.MAX_VALUE;
        e02 e02Var = null;
        for (e02 e02Var2 : map.values()) {
            long j14 = e02Var2.f13796c;
            r32 r32Var2 = e02Var2.f13797d;
            if (j14 == -1 && i10 == e02Var2.f13795b && r32Var != null) {
                f02 f02Var = e02Var2.f13800g;
                long j15 = r32Var.f19362d;
                j10 = -1;
                e02 e02Var3 = (e02) f02Var.f14151c.get(f02Var.f14154f);
                if (e02Var3 != null) {
                    j12 = e02Var3.f13796c;
                    if (j12 == -1) {
                        j12 = 1 + f02Var.f14155g;
                    }
                } else {
                    j12 = 1 + f02Var.f14155g;
                }
                if (j15 >= j12) {
                    e02Var2.f13796c = j15;
                }
            } else {
                j10 = -1;
            }
            if (r32Var != null) {
                long j16 = r32Var.f19362d;
                if (j16 != j10) {
                    if (r32Var2 == null) {
                        if (!r32Var.b() && j16 == e02Var2.f13796c) {
                            j11 = e02Var2.f13796c;
                            if (j11 != j10 || j11 < j13) {
                                e02Var = e02Var2;
                                j13 = j11;
                            } else if (j11 == j13) {
                                String str = uu0.f20901a;
                                if (e02Var.f13797d != null && r32Var2 != null) {
                                    e02Var = e02Var2;
                                }
                            }
                        }
                    } else if (j16 == r32Var2.f19362d && r32Var.f19360b == r32Var2.f19360b && r32Var.f19361c == r32Var2.f19361c) {
                        j11 = e02Var2.f13796c;
                        if (j11 != j10) {
                        }
                        e02Var = e02Var2;
                        j13 = j11;
                    }
                }
            }
            if (i10 == e02Var2.f13795b) {
                j11 = e02Var2.f13796c;
                if (j11 != j10) {
                }
                e02Var = e02Var2;
                j13 = j11;
            }
        }
        if (e02Var != null) {
            return e02Var;
        }
        byte[] bArr = new byte[12];
        f14148h.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 10);
        e02 e02Var4 = new e02(this, strEncodeToString, i10, r32Var);
        map.put(strEncodeToString, e02Var4);
        return e02Var4;
    }
}
