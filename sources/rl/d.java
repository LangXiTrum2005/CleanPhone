package rl;

import java.util.Set;
import qk.i0;
import tl.c0;
import zk.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f49621b = i0.k0(sl.a.CLASS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f49622c = xj.k.E0(new sl.a[]{sl.a.FILE_FACADE, sl.a.MULTIFILE_CLASS_PART});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xl.f f49623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xl.f f49624e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lm.i f49625a;

    static {
        new xl.f(new int[]{1, 1, 2}, false);
        f49623d = new xl.f(new int[]{1, 1, 11}, false);
        f49624e = new xl.f(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    public final nm.p a(b0 b0Var, el.b kotlinClass) {
        wj.f fVarH;
        kotlin.jvm.internal.n.f(kotlinClass, "kotlinClass");
        eo.g gVar = kotlinClass.f40113b;
        String[] strArr = (String[]) gVar.f40199e;
        if (strArr == null) {
            strArr = (String[]) gVar.f40200f;
        }
        if (strArr != null) {
            if (!f49622c.contains((sl.a) gVar.f40197c)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            xl.f fVar = (xl.f) gVar.f40198d;
            String[] strArr2 = (String[]) gVar.f40201g;
            if (strArr2 != null) {
                try {
                    try {
                        fVarH = xl.h.h(strArr, strArr2);
                    } catch (zl.q e10) {
                        throw new IllegalStateException("Could not read data from " + kotlinClass.a(), e10);
                    }
                } catch (Throwable th2) {
                    c().f45539c.getClass();
                    kotlin.jvm.internal.n.f(c().f45539c, "<this>");
                    if (fVar.b(xl.f.f53902g)) {
                        throw th2;
                    }
                    fVarH = null;
                }
                if (fVarH != null) {
                    xl.g gVar2 = (xl.g) fVarH.f53283a;
                    c0 c0Var = (c0) fVarH.f53284b;
                    d(kotlinClass);
                    e(kotlinClass);
                    f fVar2 = new f(kotlinClass, c0Var, gVar2, b(kotlinClass));
                    return new nm.p(b0Var, c0Var, gVar2, fVar, fVar2, c(), "scope for " + fVar2 + " in " + b0Var, c.f49620e);
                }
            }
        }
        return null;
    }

    public final int b(el.b bVar) {
        c().f45539c.getClass();
        int i10 = bVar.f40113b.f40196b;
        if ((i10 & 64) == 0 || (i10 & 32) != 0) {
            return ((i10 & 16) == 0 || (i10 & 32) != 0) ? 1 : 3;
        }
        return 2;
    }

    public final lm.i c() {
        lm.i iVar = this.f49625a;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.n.l("components");
        throw null;
    }

    public final lm.m d(el.b bVar) {
        c().f45539c.getClass();
        xl.f fVar = (xl.f) bVar.f40113b.f40198d;
        kotlin.jvm.internal.n.f(c().f45539c, "<this>");
        xl.f fVar2 = xl.f.f53902g;
        if (fVar.b(fVar2)) {
            return null;
        }
        xl.f fVar3 = (xl.f) bVar.f40113b.f40198d;
        kotlin.jvm.internal.n.f(c().f45539c, "<this>");
        kotlin.jvm.internal.n.f(c().f45539c, "<this>");
        boolean z10 = fVar3.f53904f;
        fVar2.getClass();
        xl.f fVar4 = z10 ? fVar2 : xl.f.f53903h;
        int i10 = fVar4.f52623b;
        int i11 = fVar2.f52623b;
        return new lm.m(fVar3, fVar2, fVar2, (i10 <= i11 && (i10 < i11 || fVar4.f52624c <= fVar2.f52624c)) ? fVar2 : fVar4, bVar.a(), fl.c.a(bVar.f40112a));
    }

    public final boolean e(el.b bVar) {
        c().f45539c.getClass();
        c().f45539c.getClass();
        eo.g gVar = bVar.f40113b;
        return (gVar.f40196b & 2) != 0 && ((xl.f) gVar.f40198d).equals(f49623d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public final lm.d f(el.b bVar) {
        wj.f fVarF;
        eo.g gVar = bVar.f40113b;
        String[] strArr = (String[]) gVar.f40199e;
        if (strArr == null) {
            strArr = (String[]) gVar.f40200f;
        }
        if (strArr != null) {
            if (!f49621b.contains((sl.a) gVar.f40197c)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            xl.f fVar = (xl.f) gVar.f40198d;
            String[] strArr2 = (String[]) gVar.f40201g;
            try {
                if (strArr2 != null) {
                    try {
                        fVarF = xl.h.f(strArr, strArr2);
                        if (fVarF != null) {
                            xl.g gVar2 = (xl.g) fVarF.f53283a;
                            tl.j jVar = (tl.j) fVarF.f53284b;
                            d(bVar);
                            e(bVar);
                            return new lm.d(gVar2, jVar, fVar, new n(bVar, b(bVar)));
                        }
                    } catch (zl.q e10) {
                        throw new IllegalStateException("Could not read data from " + bVar.a(), e10);
                    }
                }
            } catch (Throwable th2) {
                c().f45539c.getClass();
                kotlin.jvm.internal.n.f(c().f45539c, "<this>");
                if (fVar.b(xl.f.f53902g)) {
                    throw th2;
                }
                fVarF = null;
            }
        }
        return null;
    }
}
