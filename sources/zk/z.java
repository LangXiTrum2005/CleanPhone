package zk;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends cl.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f55010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f55011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pm.k f55012i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(om.l lVar, f container, yl.f fVar, boolean z10, int i10) {
        super(lVar, container, fVar, j0.C9);
        kotlin.jvm.internal.n.f(container, "container");
        this.f55010g = z10;
        pk.c cVarO = com.bumptech.glide.d.O(0, i10);
        ArrayList arrayList = new ArrayList(xj.p.W(cVarO, 10));
        pk.b it = cVarO.iterator();
        while (it.f48398c) {
            int iNextInt = it.nextInt();
            arrayList.add(cl.v0.M0(this, 1, yl.f.e(RequestConfiguration.MAX_AD_CONTENT_RATING_T + iNextInt), iNextInt, lVar));
        }
        this.f55011h = arrayList;
        this.f55012i = new pm.k(this, u.c(this), qk.i0.k0(fm.e.j(this).d().e()), lVar);
    }

    @Override // zk.e
    public final n0 O() {
        return null;
    }

    @Override // zk.v
    public final boolean S() {
        return false;
    }

    @Override // zk.e
    public final boolean W() {
        return false;
    }

    @Override // zk.e
    public final boolean Y() {
        return false;
    }

    @Override // zk.e
    public final boolean e0() {
        return false;
    }

    @Override // zk.v
    public final boolean f0() {
        return false;
    }

    @Override // zk.e
    public final /* bridge */ /* synthetic */ im.n g0() {
        return im.m.f43190b;
    }

    @Override // al.a
    public final al.j getAnnotations() {
        return al.i.f3645a;
    }

    @Override // zk.e, zk.m, zk.v
    public final il.o getVisibility() {
        il.o PUBLIC = n.f54978e;
        kotlin.jvm.internal.n.e(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // zk.e, zk.h
    public final List i() {
        return this.f55011h;
    }

    @Override // cl.m, zk.v
    public final boolean isExternal() {
        return false;
    }

    @Override // zk.e
    public final boolean isInline() {
        return false;
    }

    @Override // zk.e, zk.v
    public final int j() {
        return 1;
    }

    @Override // zk.e
    public final int l0() {
        return 1;
    }

    @Override // zk.g
    public final pm.n0 n() {
        return this.f55012i;
    }

    @Override // cl.d0
    public final im.n o(qm.f fVar) {
        return im.m.f43190b;
    }

    @Override // zk.e
    public final Collection p() {
        return xj.x.f53868a;
    }

    @Override // zk.e
    public final Collection r() {
        return xj.v.f53866a;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // zk.h
    public final boolean u() {
        return this.f55010g;
    }

    @Override // zk.e
    public final boolean x0() {
        return false;
    }

    @Override // zk.e
    public final cl.l y() {
        return null;
    }
}
