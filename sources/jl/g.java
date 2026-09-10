package jl;

import com.google.android.gms.internal.measurement.nf;
import java.util.Map;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.v;
import qk.w;
import wk.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w[] f43977g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final om.i f43978f;

    static {
        e0 e0Var = d0.f44761a;
        f43977g = new w[]{e0Var.g(new v(e0Var.b(g.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fl.d dVar, nf c4) {
        super(c4, dVar, l.f53349m);
        n.f(c4, "c");
        om.l lVar = (om.l) ((ll.a) c4.f23782b).f45485a;
        lVar.getClass();
        this.f43978f = new om.i(lVar, f.f43976e);
    }

    @Override // jl.b, al.c
    public final Map d() {
        return (Map) j1.f.w(this.f43978f, f43977g[0]);
    }
}
