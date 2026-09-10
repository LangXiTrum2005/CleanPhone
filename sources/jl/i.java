package jl;

import com.google.android.gms.internal.measurement.nf;
import java.util.Map;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.v;
import om.o;
import qk.w;
import wk.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w[] f43982g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final om.i f43983f;

    static {
        e0 e0Var = d0.f44761a;
        f43982g = new w[]{e0Var.g(new v(e0Var.b(i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fl.d annotation, nf c4) {
        super(c4, annotation, l.f53359w);
        n.f(annotation, "annotation");
        n.f(c4, "c");
        o oVar = ((ll.a) c4.f23782b).f45485a;
        al.l lVar = new al.l(this, 11);
        om.l lVar2 = (om.l) oVar;
        lVar2.getClass();
        this.f43983f = new om.i(lVar2, lVar);
    }

    @Override // jl.b, al.c
    public final Map d() {
        return (Map) j1.f.w(this.f43983f, f43982g[0]);
    }
}
