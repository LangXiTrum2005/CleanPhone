package cl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends im.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk.w f6590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yl.c f6591c;

    public r0(zk.w moduleDescriptor, yl.c fqName) {
        kotlin.jvm.internal.n.f(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.n.f(fqName, "fqName");
        this.f6590b = moduleDescriptor;
        this.f6591c = fqName;
    }

    @Override // im.o, im.p
    public final Collection d(im.f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        if (kindFilter.a(im.f.f43163h)) {
            yl.c cVar = this.f6591c;
            if (!cVar.d() || !kindFilter.f43174a.contains(im.c.f43155a)) {
                zk.w wVar = this.f6590b;
                Collection collectionH = wVar.h(cVar, bVar);
                ArrayList arrayList = new ArrayList(collectionH.size());
                Iterator it = collectionH.iterator();
                while (it.hasNext()) {
                    yl.f fVarF = ((yl.c) it.next()).f();
                    kotlin.jvm.internal.n.e(fVarF, "subFqName.shortName()");
                    if (((Boolean) bVar.invoke(fVarF)).booleanValue()) {
                        b0 b0Var = null;
                        if (!fVarF.f54515b) {
                            b0 b0Var2 = (b0) wVar.F(cVar.c(fVarF));
                            if (!((Boolean) j1.f.w(b0Var2.f6482f, b0.f6478h[1])).booleanValue()) {
                                b0Var = b0Var2;
                            }
                        }
                        ym.l.a(arrayList, b0Var);
                    }
                }
                return arrayList;
            }
        }
        return xj.v.f53866a;
    }

    @Override // im.o, im.n
    public final Set e() {
        return xj.x.f53868a;
    }

    public final String toString() {
        return "subpackages of " + this.f6591c + " from " + this.f6590b;
    }
}
