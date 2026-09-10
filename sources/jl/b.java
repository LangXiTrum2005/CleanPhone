package jl;

import cl.t0;
import com.google.android.gms.internal.measurement.nf;
import java.util.Map;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.v;
import om.l;
import om.o;
import pm.c0;
import pm.y;
import qk.w;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements al.c, kl.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w[] f43964e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl.c f43965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f43966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final om.i f43967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pl.a f43968d;

    static {
        e0 e0Var = d0.f44761a;
        f43964e = new w[]{e0Var.g(new v(e0Var.b(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public b(nf c4, fl.d dVar, yl.c fqName) {
        n.f(c4, "c");
        ll.a aVar = (ll.a) c4.f23782b;
        n.f(fqName, "fqName");
        this.f43965a = fqName;
        this.f43966b = dVar != null ? aVar.f45494j.c(dVar) : j0.C9;
        o oVar = aVar.f45485a;
        t0 t0Var = new t0(1, c4, this);
        l lVar = (l) oVar;
        lVar.getClass();
        this.f43967c = new om.i(lVar, t0Var);
        this.f43968d = dVar != null ? (pl.a) xj.n.p0(dVar.b()) : null;
    }

    @Override // al.c
    public final j0 c() {
        return this.f43966b;
    }

    @Override // al.c
    public Map d() {
        return xj.w.f53867a;
    }

    @Override // al.c
    public final yl.c e() {
        return this.f43965a;
    }

    @Override // al.c
    public final y getType() {
        return (c0) j1.f.w(this.f43967c, f43964e[0]);
    }
}
