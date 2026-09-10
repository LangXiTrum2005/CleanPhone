package fn;

import cn.s1;
import cn.y1;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hn.u f41070a = new hn.u("NO_VALUE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hn.u f41071b = new hn.u("NONE", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hn.u f41072c = new hn.u("PENDING", 0);

    public static final u0 a(int i10, int i11, en.a aVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(l1.d.e(i10, "replay cannot be negative, but was ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(l1.d.e(i11, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i10 <= 0 && i11 <= 0 && aVar != en.a.f40122a) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i12 = i11 + i10;
        if (i12 < 0) {
            i12 = Integer.MAX_VALUE;
        }
        return new u0(i10, i12, aVar);
    }

    public static final a1 c(Object obj) {
        if (obj == null) {
            obj = gn.b.f41982b;
        }
        return new a1(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void d(f fVar, Object obj, Object obj2, ck.c cVar) {
        v vVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i10 = vVar.f41175h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f41175h = i10 - Integer.MIN_VALUE;
            } else {
                vVar = new v(cVar);
            }
        } else {
            vVar = new v(cVar);
        }
        Object obj3 = vVar.f41174g;
        int i11 = vVar.f41175h;
        if (i11 == 0) {
            t9.e.z(obj3);
            vVar.f41173f = obj2;
            vVar.f41175h = 1;
            if (fVar.emit(obj, vVar) == bk.a.f5708a) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = vVar.f41173f;
            t9.e.z(obj3);
        }
        throw new gn.a(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(g1 g1Var, jk.d dVar, Throwable th2, ck.c cVar) throws IllegalAccessException, InvocationTargetException {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f41088h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f41088h = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(cVar);
            }
        } else {
            iVar = new i(cVar);
        }
        Object obj = iVar.f41087g;
        int i11 = iVar.f41088h;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                iVar.f41086f = th2;
                iVar.f41088h = 1;
                Object objInvoke = dVar.invoke(g1Var, th2, iVar);
                Object obj2 = bk.a.f5708a;
                if (objInvoke == obj2) {
                    return obj2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = iVar.f41086f;
                t9.e.z(obj);
            }
            return wj.r.f53297a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                qk.i0.c(th3, th2);
            }
            throw th3;
        }
    }

    public static final void f(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }

    public static final o0 g(u0 u0Var) {
        return new o0(u0Var, null);
    }

    public static e h(e eVar, int i10) {
        en.a aVar;
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(l1.d.e(i10, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i10 == -1) {
            i10 = 0;
            aVar = en.a.f40123b;
        } else {
            aVar = en.a.f40122a;
        }
        return eVar instanceof gn.l ? gn.l.c((gn.l) eVar, null, i10, aVar, 1) : new d(i10, ak.l.f3620a, aVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable i(e eVar, f fVar, ck.c cVar) throws Throwable {
        n nVar;
        kotlin.jvm.internal.c0 c0Var;
        cn.f1 f1Var;
        CancellationException cancellationExceptionH;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i10 = nVar.f41128h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f41128h = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(cVar);
            }
        } else {
            nVar = new n(cVar);
        }
        Object obj = nVar.f41127g;
        int i11 = nVar.f41128h;
        if (i11 == 0) {
            t9.e.z(obj);
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            try {
                f pVar = new p(0, fVar, c0Var2);
                nVar.f41126f = c0Var2;
                nVar.f41128h = 1;
                Object objCollect = eVar.collect(pVar, nVar);
                bk.a aVar = bk.a.f5708a;
                if (objCollect == aVar) {
                    return aVar;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                c0Var = c0Var2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = nVar.f41126f;
            try {
                t9.e.z(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Throwable th4 = (Throwable) c0Var.f44760a;
        if ((th4 != null && th4.equals(th)) || ((f1Var = (cn.f1) nVar.getContext().get(cn.e1.f6705a)) != null && f1Var.isCancelled() && (cancellationExceptionH = f1Var.h()) != null && cancellationExceptionH.equals(th))) {
            throw th;
        }
        if (th4 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            qk.i0.c(th4, th);
            throw th4;
        }
        qk.i0.c(th, th4);
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0097 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r1.emit(r11, r0) == r5) goto L37;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0094 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(fn.f r8, en.q r9, boolean r10, ck.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.g.j(fn.f, en.q, boolean, ck.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object k(e eVar, ak.f fVar) {
        d0 d0Var;
        kotlin.jvm.internal.c0 c0Var;
        gn.a e10;
        b0 b0Var;
        hn.u uVar = gn.b.f41982b;
        if (fVar instanceof d0) {
            d0Var = (d0) fVar;
            int i10 = d0Var.f41054i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d0Var.f41054i = i10 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(fVar);
            }
        } else {
            d0Var = new d0(fVar);
        }
        Object obj = d0Var.f41053h;
        int i11 = d0Var.f41054i;
        if (i11 == 0) {
            t9.e.z(obj);
            c0Var = new kotlin.jvm.internal.c0();
            c0Var.f44760a = uVar;
            b0 b0Var2 = new b0(c0Var, 0);
            try {
                d0Var.f41051f = c0Var;
                d0Var.f41052g = b0Var2;
                d0Var.f41054i = 1;
                Object objCollect = eVar.collect(b0Var2, d0Var);
                Object obj2 = bk.a.f5708a;
                if (objCollect == obj2) {
                    return obj2;
                }
            } catch (gn.a e11) {
                e10 = e11;
                b0Var = b0Var2;
                if (e10.f41980a == b0Var) {
                    throw e10;
                }
                cn.d0.m(d0Var.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var = d0Var.f41052g;
            c0Var = d0Var.f41051f;
            try {
                t9.e.z(obj);
            } catch (gn.a e12) {
                e10 = e12;
                if (e10.f41980a == b0Var) {
                    throw e10;
                }
                cn.d0.m(d0Var.getContext());
            }
        }
        Object obj3 = c0Var.f44760a;
        if (obj3 != uVar) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object l(e eVar, jk.c cVar, ck.c cVar2) {
        e0 e0Var;
        kotlin.jvm.internal.c0 c0Var;
        gn.a e10;
        p pVar;
        hn.u uVar = gn.b.f41982b;
        if (cVar2 instanceof e0) {
            e0Var = (e0) cVar2;
            int i10 = e0Var.f41060i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                e0Var.f41060i = i10 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(cVar2);
            }
        } else {
            e0Var = new e0(cVar2);
        }
        Object obj = e0Var.f41059h;
        int i11 = e0Var.f41060i;
        if (i11 == 0) {
            t9.e.z(obj);
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            c0Var2.f44760a = uVar;
            p pVar2 = new p(4, cVar, c0Var2);
            try {
                e0Var.f41057f = c0Var2;
                e0Var.f41058g = pVar2;
                e0Var.f41060i = 1;
                Object objCollect = eVar.collect(pVar2, e0Var);
                Object obj2 = bk.a.f5708a;
                if (objCollect == obj2) {
                    return obj2;
                }
                c0Var = c0Var2;
            } catch (gn.a e11) {
                c0Var = c0Var2;
                e10 = e11;
                pVar = pVar2;
                if (e10.f41980a == pVar) {
                    throw e10;
                }
                cn.d0.m(e0Var.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = e0Var.f41058g;
            c0Var = e0Var.f41057f;
            try {
                t9.e.z(obj);
            } catch (gn.a e12) {
                e10 = e12;
                if (e10.f41980a == pVar) {
                    throw e10;
                }
                cn.d0.m(e0Var.getContext());
            }
        }
        Object obj3 = c0Var.f44760a;
        if (obj3 != uVar) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(e eVar, ck.c cVar) {
        f0 f0Var;
        kotlin.jvm.internal.c0 c0Var;
        gn.a e10;
        b0 b0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i10 = f0Var.f41067i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f0Var.f41067i = i10 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(cVar);
            }
        } else {
            f0Var = new f0(cVar);
        }
        Object obj = f0Var.f41066h;
        int i11 = f0Var.f41067i;
        if (i11 == 0) {
            t9.e.z(obj);
            c0Var = new kotlin.jvm.internal.c0();
            b0 b0Var2 = new b0(c0Var, 1);
            try {
                f0Var.f41064f = c0Var;
                f0Var.f41065g = b0Var2;
                f0Var.f41067i = 1;
                Object objCollect = eVar.collect(b0Var2, f0Var);
                Object obj2 = bk.a.f5708a;
                if (objCollect == obj2) {
                    return obj2;
                }
            } catch (gn.a e11) {
                e10 = e11;
                b0Var = b0Var2;
                if (e10.f41980a == b0Var) {
                    throw e10;
                }
                cn.d0.m(f0Var.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var = f0Var.f41065g;
            c0Var = f0Var.f41064f;
            try {
                t9.e.z(obj);
            } catch (gn.a e12) {
                e10 = e12;
                if (e10.f41980a == b0Var) {
                    throw e10;
                }
                cn.d0.m(f0Var.getContext());
            }
        }
        return c0Var.f44760a;
    }

    public static final e n(r0 r0Var, ak.k kVar, int i10, en.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == en.a.f40122a) ? r0Var : new d(i10, kVar, aVar, r0Var);
    }

    public static final y1 o(e eVar, cn.a0 a0Var) {
        return cn.d0.w(a0Var, null, new b4.a(eVar, null, 6), 3);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    public static final o0 p(e eVar, cn.a0 a0Var, int i10) {
        h9.k kVar;
        e eVar2;
        en.i.f40166g9.getClass();
        int i11 = en.h.f40165b;
        if (i10 >= i11) {
            i11 = i10;
        }
        int i12 = i11 - i10;
        boolean z10 = eVar instanceof d;
        en.a aVar = en.a.f40122a;
        if (z10) {
            d dVar = (d) eVar;
            en.a aVar2 = dVar.f41048c;
            switch (dVar.f41049d) {
                case 1:
                    eVar2 = (e) dVar.f41050e;
                    break;
                default:
                    eVar2 = null;
                    break;
            }
            if (eVar2 != null) {
                int i13 = dVar.f41047b;
                if (i13 != -3 && i13 != -2 && i13 != 0) {
                    i12 = i13;
                } else if (aVar2 == aVar) {
                    if (i13 == 0) {
                        i12 = 0;
                    }
                } else if (i10 == 0) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                kVar = new h9.k(i12, dVar.f41046a, aVar2, eVar2);
            } else {
                kVar = new h9.k(i12, ak.l.f3620a, aVar, eVar);
            }
        } else {
            kVar = new h9.k(i12, ak.l.f3620a, aVar, eVar);
        }
        u0 u0VarA = a(i10, kVar.f42286a, (en.a) kVar.f42288c);
        ak.k kVar2 = (ak.k) kVar.f42289d;
        e eVar3 = (e) kVar.f42287b;
        Object obj = w0.f41182a;
        cn.b0 b0Var = obj.equals(obj) ? cn.b0.f6673a : cn.b0.f6676d;
        jk.c cVar = new b4.c(eVar3, u0VarA, (ak.f) null, 3);
        ak.k kVarX = cn.d0.x(a0Var, kVar2);
        y1 s1Var = b0Var == cn.b0.f6674b ? new s1(kVarX, cVar) : new y1(kVarX, true);
        s1Var.d0(b0Var, s1Var, cVar);
        return new o0(u0VarA, s1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object q(e eVar, ck.c cVar) {
        g0 g0Var;
        kotlin.jvm.internal.c0 c0Var;
        hn.u uVar = gn.b.f41982b;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i10 = g0Var.f41075h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g0Var.f41075h = i10 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(cVar);
            }
        } else {
            g0Var = new g0(cVar);
        }
        Object obj = g0Var.f41074g;
        int i11 = g0Var.f41075h;
        if (i11 == 0) {
            t9.e.z(obj);
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            c0Var2.f44760a = uVar;
            f b0Var = new b0(c0Var2, 2);
            g0Var.f41073f = c0Var2;
            g0Var.f41075h = 1;
            Object objCollect = eVar.collect(b0Var, g0Var);
            Object obj2 = bk.a.f5708a;
            if (objCollect == obj2) {
                return obj2;
            }
            c0Var = c0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = g0Var.f41073f;
            t9.e.z(obj);
        }
        Object obj3 = c0Var.f44760a;
        if (obj3 != uVar) {
            return obj3;
        }
        throw new NoSuchElementException("Flow is empty");
    }
}
