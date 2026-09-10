package nm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.v;
import qk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends im.o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w[] f46850f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f46851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f46852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final om.i f46853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final om.h f46854e;

    static {
        e0 e0Var = d0.f44761a;
        f46850f = new w[]{e0Var.g(new v(e0Var.b(o.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), e0Var.g(new v(e0Var.b(o.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public o(com.google.android.gms.internal.consent_sdk.d c4, List functionList, List propertyList, List typeAliasList, jk.a aVar) {
        kotlin.jvm.internal.n.f(c4, "c");
        kotlin.jvm.internal.n.f(functionList, "functionList");
        kotlin.jvm.internal.n.f(propertyList, "propertyList");
        kotlin.jvm.internal.n.f(typeAliasList, "typeAliasList");
        this.f46851b = c4;
        lm.i iVar = (lm.i) c4.f22981a;
        iVar.f45539c.getClass();
        this.f46852c = new m(this, functionList, propertyList, typeAliasList);
        om.l lVar = iVar.f45537a;
        n nVar = new n(aVar, 0);
        lVar.getClass();
        this.f46853d = new om.i(lVar, nVar);
        al.l lVar2 = new al.l(this, 16);
        lVar.getClass();
        this.f46854e = new om.h(lVar, lVar2);
    }

    @Override // im.o, im.n
    public Collection a(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        m mVar = this.f46852c;
        mVar.getClass();
        kotlin.jvm.internal.n.f(name, "name");
        return !((Set) j1.f.w(mVar.f46845g, m.f46838j[0])).contains(name) ? xj.v.f53866a : (Collection) mVar.f46842d.invoke(name);
    }

    @Override // im.o, im.n
    public final Set b() {
        return (Set) j1.f.w(this.f46852c.f46845g, m.f46838j[0]);
    }

    @Override // im.o, im.p
    public zk.g c(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        if (q(name)) {
            return ((lm.i) this.f46851b.f22981a).b(l(name));
        }
        m mVar = this.f46852c;
        if (!mVar.f46841c.keySet().contains(name)) {
            return null;
        }
        mVar.getClass();
        return (s) mVar.f46844f.invoke(name);
    }

    @Override // im.o, im.n
    public final Set e() {
        w p10 = f46850f[1];
        om.h hVar = this.f46854e;
        kotlin.jvm.internal.n.f(hVar, "<this>");
        kotlin.jvm.internal.n.f(p10, "p");
        return (Set) hVar.invoke();
    }

    @Override // im.o, im.n
    public Collection f(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        m mVar = this.f46852c;
        mVar.getClass();
        kotlin.jvm.internal.n.f(name, "name");
        return !((Set) j1.f.w(mVar.f46846h, m.f46838j[1])).contains(name) ? xj.v.f53866a : (Collection) mVar.f46843e.invoke(name);
    }

    @Override // im.o, im.n
    public final Set g() {
        return (Set) j1.f.w(this.f46852c.f46846h, m.f46838j[1]);
    }

    public abstract void h(ArrayList arrayList, jk.b bVar);

    public final Collection i(im.f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        ArrayList arrayList = new ArrayList(0);
        if (kindFilter.a(im.f.f43161f)) {
            h(arrayList, bVar);
        }
        m mVar = this.f46852c;
        mVar.getClass();
        om.i iVar = mVar.f46845g;
        om.i iVar2 = mVar.f46846h;
        boolean zA = kindFilter.a(im.f.f43165j);
        xj.v vVar = xj.v.f53866a;
        bm.h hVar = bm.h.f5729b;
        if (zA) {
            Set<yl.f> set = (Set) j1.f.w(iVar2, m.f46838j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (yl.f name : set) {
                if (((Boolean) bVar.invoke(name)).booleanValue()) {
                    kotlin.jvm.internal.n.f(name, "name");
                    arrayList2.addAll(!((Set) j1.f.w(iVar2, m.f46838j[1])).contains(name) ? vVar : (Collection) mVar.f46843e.invoke(name));
                }
            }
            xj.s.Z(hVar, arrayList2);
            arrayList.addAll(arrayList2);
        }
        if (kindFilter.a(im.f.f43164i)) {
            Set<yl.f> set2 = (Set) j1.f.w(iVar, m.f46838j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (yl.f name2 : set2) {
                if (((Boolean) bVar.invoke(name2)).booleanValue()) {
                    kotlin.jvm.internal.n.f(name2, "name");
                    arrayList3.addAll(!((Set) j1.f.w(iVar, m.f46838j[0])).contains(name2) ? vVar : (Collection) mVar.f46842d.invoke(name2));
                }
            }
            xj.s.Z(hVar, arrayList3);
            arrayList.addAll(arrayList3);
        }
        if (kindFilter.a(im.f.l)) {
            for (yl.f fVar : m()) {
                if (((Boolean) bVar.invoke(fVar)).booleanValue()) {
                    ym.l.a(arrayList, ((lm.i) this.f46851b.f22981a).b(l(fVar)));
                }
            }
        }
        if (kindFilter.a(im.f.f43162g)) {
            for (yl.f name3 : mVar.f46841c.keySet()) {
                if (((Boolean) bVar.invoke(name3)).booleanValue()) {
                    mVar.getClass();
                    kotlin.jvm.internal.n.f(name3, "name");
                    ym.l.a(arrayList, (s) mVar.f46844f.invoke(name3));
                }
            }
        }
        return ym.l.d(arrayList);
    }

    public void j(ArrayList arrayList, yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
    }

    public void k(ArrayList arrayList, yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
    }

    public abstract yl.b l(yl.f fVar);

    public final Set m() {
        return (Set) j1.f.w(this.f46853d, f46850f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        return m().contains(name);
    }

    public boolean r(r rVar) {
        return true;
    }
}
