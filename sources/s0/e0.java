package s0;

import cn.y1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f49782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f49783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cn.a0 f49784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fn.q0 f49785d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f49787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y1 f49788g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k5.g f49790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wj.j f49791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wj.j f49792k;
    public final zc.u l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ln.c f49786e = new ln.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qj.x f49789h = new qj.x(3);

    public e0(i0 i0Var, List list, c cVar, cn.a0 a0Var) {
        this.f49782a = i0Var;
        this.f49783b = cVar;
        this.f49784c = a0Var;
        ak.f fVar = null;
        this.f49785d = new fn.q0(new b4.b(this, fVar, 11));
        k5.g gVar = new k5.g();
        gVar.f44328d = this;
        gVar.f44325a = new ln.c();
        gVar.f44326b = cn.d0.a();
        gVar.f44327c = xj.n.N0(list);
        this.f49790i = gVar;
        this.f49791j = r9.b.u(new o(this, 1));
        this.f49792k = r9.b.u(new o(this, 0));
        this.l = new zc.u(a0Var, new al.f(this, 26), new b4.c(this, fVar, 10));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(e0 e0Var, ck.c cVar) {
        s sVar;
        ln.c cVar2;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i10 = sVar.f49899j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.f49899j = i10 - Integer.MIN_VALUE;
            } else {
                sVar = new s(e0Var, cVar);
            }
        } else {
            sVar = new s(e0Var, cVar);
        }
        Object obj = sVar.f49897h;
        int i11 = sVar.f49899j;
        if (i11 == 0) {
            t9.e.z(obj);
            cVar2 = e0Var.f49786e;
            sVar.f49895f = e0Var;
            sVar.f49896g = cVar2;
            sVar.f49899j = 1;
            Object objE = cVar2.e(sVar);
            bk.a aVar = bk.a.f5708a;
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ln.c cVar3 = sVar.f49896g;
            e0 e0Var2 = sVar.f49895f;
            t9.e.z(obj);
            cVar2 = cVar3;
            e0Var = e0Var2;
        }
        try {
            int i12 = e0Var.f49787f - 1;
            e0Var.f49787f = i12;
            if (i12 == 0) {
                y1 y1Var = e0Var.f49788g;
                if (y1Var != null) {
                    y1Var.a(null);
                }
                e0Var.f49788g = null;
            }
            return wj.r.f53297a;
        } finally {
            cVar2.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ck.i, jk.c] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ck.i, jk.c] */
    /* JADX WARN: Type inference failed for: r9v0, types: [s0.e0] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [s0.e0] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(s0.e0 r9, s0.q0 r10, ck.c r11) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.e0.c(s0.e0, s0.q0, ck.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(e0 e0Var, ck.c cVar) {
        u uVar;
        ln.c cVar2;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i10 = uVar.f49914j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uVar.f49914j = i10 - Integer.MIN_VALUE;
            } else {
                uVar = new u(e0Var, cVar);
            }
        } else {
            uVar = new u(e0Var, cVar);
        }
        Object obj = uVar.f49912h;
        int i11 = uVar.f49914j;
        if (i11 == 0) {
            t9.e.z(obj);
            cVar2 = e0Var.f49786e;
            uVar.f49910f = e0Var;
            uVar.f49911g = cVar2;
            uVar.f49914j = 1;
            Object objE = cVar2.e(uVar);
            bk.a aVar = bk.a.f5708a;
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ln.c cVar3 = uVar.f49911g;
            e0 e0Var2 = uVar.f49910f;
            t9.e.z(obj);
            cVar2 = cVar3;
            e0Var = e0Var2;
        }
        ak.f fVar = null;
        try {
            int i12 = e0Var.f49787f + 1;
            e0Var.f49787f = i12;
            if (i12 == 1) {
                e0Var.f49788g = cn.d0.w(e0Var.f49784c, null, new p(e0Var, fVar, 1), 3);
            }
            return wj.r.f53297a;
        } finally {
            cVar2.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(e0 e0Var, boolean z10, ak.f fVar) {
        x xVar;
        e0 e0Var2;
        f1 f1Var;
        e0 e0Var3;
        wj.f fVar2;
        f1 f1Var2;
        if (fVar instanceof x) {
            xVar = (x) fVar;
            int i10 = xVar.f49948k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f49948k = i10 - Integer.MIN_VALUE;
            } else {
                xVar = new x(e0Var, fVar);
            }
        } else {
            xVar = new x(e0Var, fVar);
        }
        Object objD = xVar.f49946i;
        int i11 = xVar.f49948k;
        bk.a aVar = bk.a.f5708a;
        if (i11 == 0) {
            t9.e.z(objD);
            f1 f1VarU = e0Var.f49789h.u();
            if (f1VarU instanceof g1) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            p0 p0VarG = e0Var.g();
            xVar.f49943f = e0Var;
            xVar.f49944g = f1VarU;
            xVar.f49945h = z10;
            xVar.f49948k = 1;
            Object objA = p0VarG.a(xVar);
            if (objA != aVar) {
                e0Var2 = e0Var;
                f1Var = f1VarU;
                objD = objA;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                e0Var3 = xVar.f49943f;
                t9.e.z(objD);
                fVar2 = (wj.f) objD;
                f1Var2 = (f1) fVar2.f53283a;
                if (((Boolean) fVar2.f53284b).booleanValue()) {
                    e0Var3.f49789h.y(f1Var2);
                }
                return f1Var2;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e0Var3 = xVar.f49943f;
            t9.e.z(objD);
            fVar2 = (wj.f) objD;
            f1Var2 = (f1) fVar2.f53283a;
            if (((Boolean) fVar2.f53284b).booleanValue()) {
                e0Var3.f49789h.y(f1Var2);
            }
            return f1Var2;
        }
        z10 = xVar.f49945h;
        f1Var = xVar.f49944g;
        e0Var2 = xVar.f49943f;
        t9.e.z(objD);
        int iIntValue = ((Number) objD).intValue();
        boolean z11 = f1Var instanceof d;
        int i12 = z11 ? f1Var.f49805a : -1;
        if (z11 && iIntValue == i12) {
            return f1Var;
        }
        ak.f fVar3 = null;
        if (z10) {
            p0 p0VarG2 = e0Var2.g();
            y yVar = new y(e0Var2, null);
            xVar.f49943f = e0Var2;
            xVar.f49944g = null;
            xVar.f49948k = 2;
            objD = p0VarG2.c(yVar, xVar);
            if (objD != aVar) {
                e0Var3 = e0Var2;
                fVar2 = (wj.f) objD;
                f1Var2 = (f1) fVar2.f53283a;
                if (((Boolean) fVar2.f53284b).booleanValue()) {
                    e0Var3.f49789h.y(f1Var2);
                }
                return f1Var2;
            }
        } else {
            p0 p0VarG3 = e0Var2.g();
            z zVar = new z(e0Var2, i12, fVar3, 0);
            xVar.f49943f = e0Var2;
            xVar.f49944g = null;
            xVar.f49948k = 3;
            objD = p0VarG3.d(zVar, xVar);
            if (objD != aVar) {
                e0Var3 = e0Var2;
                fVar2 = (wj.f) objD;
                f1Var2 = (f1) fVar2.f53283a;
                if (((Boolean) fVar2.f53284b).booleanValue()) {
                    e0Var3.f49789h.y(f1Var2);
                }
                return f1Var2;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009f A[Catch: b -> 0x005f, TryCatch #2 {b -> 0x005f, blocks: (B:19:0x005a, B:54:0x00ff, B:24:0x0068, B:51:0x00e0, B:32:0x0085, B:40:0x009f, B:42:0x00a5, B:36:0x008e, B:48:0x00cd), top: B:81:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c A[Catch: all -> 0x0169, TryCatch #1 {all -> 0x0169, blocks: (B:61:0x012a, B:63:0x013c, B:64:0x0144), top: B:80:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0144 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #1 {all -> 0x0169, blocks: (B:61:0x012a, B:63:0x013c, B:64:0x0144), top: B:80:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:70:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(e0 e0Var, boolean z10, ck.c cVar) {
        a0 a0Var;
        kotlin.jvm.internal.c0 c0Var;
        b bVar;
        e0 e0Var2;
        boolean z11;
        kotlin.jvm.internal.c0 c0Var2;
        kotlin.jvm.internal.a0 a0Var2;
        b bVar2;
        b0 b0Var;
        Object objC;
        kotlin.jvm.internal.a0 a0Var3;
        kotlin.jvm.internal.c0 c0Var3;
        int iHashCode;
        Object objA;
        e0 e0Var3;
        int i10;
        Object obj;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i11 = a0Var.f49751n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a0Var.f49751n = i11 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(e0Var, cVar);
            }
        } else {
            a0Var = new a0(e0Var, cVar);
        }
        Object objA2 = a0Var.l;
        int i12 = a0Var.f49751n;
        ak.f fVar = null;
        Object dVar = bk.a.f5708a;
        try {
            switch (i12) {
                case 0:
                    t9.e.z(objA2);
                    if (z10) {
                        a0Var.f49744f = e0Var;
                        a0Var.f49748j = z10;
                        a0Var.f49751n = 1;
                        objA2 = e0Var.i(a0Var);
                        if (objA2 != dVar) {
                            if (objA2 != null) {
                                iHashCode = objA2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            p0 p0VarG = e0Var.g();
                            a0Var.f49744f = e0Var;
                            a0Var.f49745g = objA2;
                            a0Var.f49748j = z10;
                            a0Var.f49749k = iHashCode;
                            a0Var.f49751n = 2;
                            objA = p0VarG.a(a0Var);
                            if (objA != dVar) {
                                e0Var3 = e0Var;
                                i10 = iHashCode;
                                obj = objA2;
                                objA2 = objA;
                                return new d(i10, ((Number) objA2).intValue(), obj);
                            }
                        }
                    } else {
                        p0 p0VarG2 = e0Var.g();
                        a0Var.f49744f = e0Var;
                        a0Var.f49748j = z10;
                        a0Var.f49751n = 3;
                        objA2 = p0VarG2.a(a0Var);
                        if (objA2 != dVar) {
                            int iIntValue = ((Number) objA2).intValue();
                            p0 p0VarG3 = e0Var.g();
                            z zVar = new z(e0Var, iIntValue, fVar, 1);
                            a0Var.f49744f = e0Var;
                            a0Var.f49748j = z10;
                            a0Var.f49751n = 4;
                            objA2 = p0VarG3.d(zVar, a0Var);
                            if (objA2 == dVar) {
                            }
                            return (d) objA2;
                        }
                    }
                    return dVar;
                case 1:
                    z10 = a0Var.f49748j;
                    e0Var = (e0) a0Var.f49744f;
                    t9.e.z(objA2);
                    if (objA2 != null) {
                        iHashCode = objA2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    p0 p0VarG4 = e0Var.g();
                    a0Var.f49744f = e0Var;
                    a0Var.f49745g = objA2;
                    a0Var.f49748j = z10;
                    a0Var.f49749k = iHashCode;
                    a0Var.f49751n = 2;
                    objA = p0VarG4.a(a0Var);
                    if (objA != dVar) {
                        e0Var3 = e0Var;
                        i10 = iHashCode;
                        obj = objA2;
                        objA2 = objA;
                        return new d(i10, ((Number) objA2).intValue(), obj);
                    }
                    return dVar;
                case 2:
                    i10 = a0Var.f49749k;
                    z10 = a0Var.f49748j;
                    obj = a0Var.f49745g;
                    e0Var3 = (e0) a0Var.f49744f;
                    try {
                        t9.e.z(objA2);
                        return new d(i10, ((Number) objA2).intValue(), obj);
                    } catch (b e10) {
                        e = e10;
                        e0Var = e0Var3;
                        c0Var = new kotlin.jvm.internal.c0();
                        c cVar2 = e0Var.f49783b;
                        a0Var.f49744f = e0Var;
                        a0Var.f49745g = e;
                        a0Var.f49746h = c0Var;
                        a0Var.f49747i = c0Var;
                        a0Var.f49748j = z10;
                        a0Var.f49751n = 5;
                        Object objF = cVar2.f(e);
                        if (objF != dVar) {
                            bVar = e;
                            objA2 = objF;
                            e0Var2 = e0Var;
                            z11 = z10;
                            c0Var2 = c0Var;
                            c0Var2.f44760a = objA2;
                            a0Var2 = new kotlin.jvm.internal.a0();
                            try {
                                b0Var = new b0(c0Var, e0Var2, a0Var2, (ak.f) null);
                                a0Var.f49744f = bVar;
                                a0Var.f49745g = c0Var;
                                a0Var.f49746h = a0Var2;
                                a0Var.f49747i = null;
                                a0Var.f49751n = 6;
                                if (z11) {
                                    e0Var2.getClass();
                                    objC = b0Var.invoke(a0Var);
                                } else {
                                    objC = e0Var2.g().c(new g(b0Var, fVar, 1), a0Var);
                                }
                                if (objC != dVar) {
                                    a0Var3 = a0Var2;
                                    c0Var3 = c0Var;
                                    Object obj2 = c0Var3.f44760a;
                                    dVar = new d(obj2 != null ? obj2.hashCode() : 0, a0Var3.f44754a, obj2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bVar2 = bVar;
                                qk.i0.c(bVar2, th);
                                throw bVar2;
                            }
                        }
                        return dVar;
                    }
                case 3:
                    z10 = a0Var.f49748j;
                    e0Var = (e0) a0Var.f49744f;
                    t9.e.z(objA2);
                    int iIntValue2 = ((Number) objA2).intValue();
                    p0 p0VarG5 = e0Var.g();
                    z zVar2 = new z(e0Var, iIntValue2, fVar, 1);
                    a0Var.f49744f = e0Var;
                    a0Var.f49748j = z10;
                    a0Var.f49751n = 4;
                    objA2 = p0VarG5.d(zVar2, a0Var);
                    if (objA2 == dVar) {
                        return dVar;
                    }
                    return (d) objA2;
                case 4:
                    boolean z12 = a0Var.f49748j;
                    t9.e.z(objA2);
                    return (d) objA2;
                case 5:
                    z11 = a0Var.f49748j;
                    c0Var2 = a0Var.f49747i;
                    c0Var = (kotlin.jvm.internal.c0) a0Var.f49746h;
                    bVar = (b) a0Var.f49745g;
                    e0Var2 = (e0) a0Var.f49744f;
                    t9.e.z(objA2);
                    c0Var2.f44760a = objA2;
                    a0Var2 = new kotlin.jvm.internal.a0();
                    b0Var = new b0(c0Var, e0Var2, a0Var2, (ak.f) null);
                    a0Var.f49744f = bVar;
                    a0Var.f49745g = c0Var;
                    a0Var.f49746h = a0Var2;
                    a0Var.f49747i = null;
                    a0Var.f49751n = 6;
                    if (z11) {
                        e0Var2.getClass();
                        objC = b0Var.invoke(a0Var);
                    } else {
                        objC = e0Var2.g().c(new g(b0Var, fVar, 1), a0Var);
                    }
                    if (objC != dVar) {
                        a0Var3 = a0Var2;
                        c0Var3 = c0Var;
                        Object obj3 = c0Var3.f44760a;
                        dVar = new d(obj3 != null ? obj3.hashCode() : 0, a0Var3.f44754a, obj3);
                    }
                    return dVar;
                case 6:
                    a0Var3 = (kotlin.jvm.internal.a0) a0Var.f49746h;
                    c0Var3 = (kotlin.jvm.internal.c0) a0Var.f49745g;
                    bVar2 = (b) a0Var.f49744f;
                    try {
                        t9.e.z(objA2);
                        Object obj4 = c0Var3.f44760a;
                        dVar = new d(obj4 != null ? obj4.hashCode() : 0, a0Var3.f44754a, obj4);
                        return dVar;
                    } catch (Throwable th3) {
                        th = th3;
                        qk.i0.c(bVar2, th);
                        throw bVar2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (b e11) {
            e = e11;
        }
    }

    @Override // s0.i
    public final Object a(jk.c cVar, ak.f fVar) {
        i1 i1Var = (i1) fVar.getContext().get(j.f49828a);
        if (i1Var != null) {
            i1Var.b(this);
        }
        return cn.d0.J(new i1(i1Var, this), new b4.b(this, cVar, (ak.f) null), fVar);
    }

    public final p0 g() {
        return (p0) this.f49792k.getValue();
    }

    @Override // s0.i
    public final fn.e getData() {
        return this.f49785d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r1.v(r0) == r4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(ck.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof s0.w
            if (r0 == 0) goto L13
            r0 = r7
            s0.w r0 = (s0.w) r0
            int r1 = r0.f49933j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49933j = r1
            goto L18
        L13:
            s0.w r0 = new s0.w
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f49931h
            int r1 = r0.f49933j
            r2 = 2
            r3 = 1
            bk.a r4 = bk.a.f5708a
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            int r6 = r0.f49930g
            s0.e0 r0 = r0.f49929f
            t9.e.z(r7)     // Catch: java.lang.Throwable -> L2e
            goto L65
        L2e:
            r7 = move-exception
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            s0.e0 r6 = r0.f49929f
            t9.e.z(r7)
            goto L50
        L3e:
            t9.e.z(r7)
            s0.p0 r7 = r6.g()
            r0.f49929f = r6
            r0.f49933j = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r4) goto L50
            goto L64
        L50:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            k5.g r1 = r6.f49790i     // Catch: java.lang.Throwable -> L68
            r0.f49929f = r6     // Catch: java.lang.Throwable -> L68
            r0.f49930g = r7     // Catch: java.lang.Throwable -> L68
            r0.f49933j = r2     // Catch: java.lang.Throwable -> L68
            java.lang.Object r6 = r1.v(r0)     // Catch: java.lang.Throwable -> L68
            if (r6 != r4) goto L65
        L64:
            return r4
        L65:
            wj.r r6 = wj.r.f53297a
            return r6
        L68:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L6d:
            qj.x r0 = r0.f49789h
            s0.y0 r1 = new s0.y0
            r1.<init>(r7, r6)
            r0.y(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.e0.h(ck.c):java.lang.Object");
    }

    public final Object i(ck.c cVar) {
        return ((l0) this.f49791j.getValue()).a(new q(3, (ak.f) null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Object obj, boolean z10, ck.c cVar) {
        c0 c0Var;
        kotlin.jvm.internal.a0 a0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i10 = c0Var.f49763i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0Var.f49763i = i10 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object obj2 = c0Var.f49761g;
        int i11 = c0Var.f49763i;
        if (i11 == 0) {
            t9.e.z(obj2);
            kotlin.jvm.internal.a0 a0Var2 = new kotlin.jvm.internal.a0();
            l0 l0Var = (l0) this.f49791j.getValue();
            d0 d0Var = new d0(a0Var2, this, obj, z10, null);
            c0Var.f49760f = a0Var2;
            c0Var.f49763i = 1;
            Object objB = l0Var.b(d0Var, c0Var);
            bk.a aVar = bk.a.f5708a;
            if (objB == aVar) {
                return aVar;
            }
            a0Var = a0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = c0Var.f49760f;
            t9.e.z(obj2);
        }
        return new Integer(a0Var.f44754a);
    }
}
