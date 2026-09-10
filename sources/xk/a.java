package xk;

import an.h;
import an.p;
import cl.b0;
import cl.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import om.l;
import xj.x;
import zk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements bl.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f53874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f53875b;

    public a(l lVar, f0 module) {
        n.f(module, "module");
        this.f53874a = lVar;
        this.f53875b = module;
    }

    @Override // bl.c
    public final Collection a(yl.c packageFqName) {
        n.f(packageFqName, "packageFqName");
        return x.f53868a;
    }

    @Override // bl.c
    public final zk.e b(yl.b classId) {
        n.f(classId, "classId");
        if (classId.f54503c || !classId.f54502b.e().d()) {
            return null;
        }
        String strB = classId.h().b();
        if (!h.q0(strB, "Function", false)) {
            return null;
        }
        yl.c cVarG = classId.g();
        n.e(cVarG, "classId.packageFqName");
        e.f53887c.getClass();
        d dVarI = un.a.i(strB, cVarG);
        if (dVarI == null) {
            return null;
        }
        e eVar = dVarI.f53885a;
        int i10 = dVarI.f53886b;
        List list = (List) j1.f.w(((b0) this.f53875b.F(cVarG)).f6481e, b0.f6478h[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof mm.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (xj.n.q0(arrayList2) != null) {
            throw new ClassCastException();
        }
        return new c(this.f53874a, (mm.c) xj.n.o0(arrayList), eVar, i10);
    }

    @Override // bl.c
    public final boolean c(yl.c packageFqName, yl.f name) {
        n.f(packageFqName, "packageFqName");
        n.f(name, "name");
        String strB = name.b();
        n.e(strB, "name.asString()");
        if (p.p0(strB, "Function", false) || p.p0(strB, "KFunction", false) || p.p0(strB, "SuspendFunction", false) || p.p0(strB, "KSuspendFunction", false)) {
            e.f53887c.getClass();
            if (un.a.i(strB, packageFqName) != null) {
                return true;
            }
        }
        return false;
    }
}
