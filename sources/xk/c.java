package xk;

import al.i;
import cl.v0;
import il.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.n;
import om.l;
import wj.r;
import wk.m;
import xj.p;
import xj.v;
import zk.b0;
import zk.j;
import zk.j0;
import zk.n0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends cl.c {
    public static final yl.b l = new yl.b(m.f53373k, yl.f.e("Function"));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final yl.b f53877m = new yl.b(m.f53370h, yl.f.e("KFunction"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f53878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f53879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f53880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f53881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f53882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f53883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f53884k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, mm.c containingDeclaration, e eVar, int i10) {
        super(lVar, eVar.a(i10));
        n.f(containingDeclaration, "containingDeclaration");
        this.f53878e = lVar;
        this.f53879f = containingDeclaration;
        this.f53880g = eVar;
        this.f53881h = i10;
        this.f53882i = new b(this);
        this.f53883j = new f(lVar, this);
        ArrayList arrayList = new ArrayList();
        pk.c cVar = new pk.c(1, i10, 1);
        ArrayList arrayList2 = new ArrayList(p.W(cVar, 10));
        pk.b it = cVar.iterator();
        while (it.f48398c) {
            arrayList.add(v0.M0(this, 2, yl.f.e("P" + it.nextInt()), arrayList.size(), this.f53878e));
            arrayList2.add(r.f53297a);
        }
        arrayList.add(v0.M0(this, 3, yl.f.e("R"), arrayList.size(), this.f53878e));
        this.f53884k = xj.n.N0(arrayList);
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

    @Override // zk.k
    public final j0 c() {
        return j0.C9;
    }

    @Override // zk.j
    public final j e() {
        return this.f53879f;
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
        return i.f3645a;
    }

    @Override // zk.e, zk.m, zk.v
    public final o getVisibility() {
        o PUBLIC = zk.n.f54978e;
        n.e(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // zk.e, zk.h
    public final List i() {
        return this.f53884k;
    }

    @Override // zk.v
    public final boolean isExternal() {
        return false;
    }

    @Override // zk.e
    public final boolean isInline() {
        return false;
    }

    @Override // zk.e, zk.v
    public final int j() {
        return 4;
    }

    @Override // zk.e
    public final int l0() {
        return 2;
    }

    @Override // zk.g
    public final pm.n0 n() {
        return this.f53882i;
    }

    @Override // cl.d0
    public final im.n o(qm.f fVar) {
        return this.f53883j;
    }

    @Override // zk.e
    public final /* bridge */ /* synthetic */ Collection p() {
        return v.f53866a;
    }

    @Override // zk.e
    public final /* bridge */ /* synthetic */ Collection r() {
        return v.f53866a;
    }

    public final String toString() {
        String strB = getName().b();
        n.e(strB, "name.asString()");
        return strB;
    }

    @Override // zk.h
    public final boolean u() {
        return false;
    }

    @Override // zk.e
    public final boolean x0() {
        return false;
    }

    @Override // zk.e
    public final /* bridge */ /* synthetic */ cl.l y() {
        return null;
    }
}
