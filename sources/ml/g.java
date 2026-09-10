package ml;

import java.util.ArrayList;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f46187f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i10) {
        super(0);
        this.f46186e = i10;
        this.f46187f = jVar;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f46186e) {
            case 0:
                return zk.u.c(this.f46187f);
            case 1:
                j jVar = this.f46187f;
                fl.n nVar = jVar.f46193h;
                ArrayList<fl.b0> typeParameters = nVar.getTypeParameters();
                ArrayList arrayList = new ArrayList(xj.p.W(typeParameters, 10));
                for (fl.b0 b0Var : typeParameters) {
                    m0 m0VarC = ((ll.e) jVar.f46195j.f23783c).c(b0Var);
                    if (m0VarC == null) {
                        throw new AssertionError("Parameter " + b0Var + " surely belongs to class " + nVar + ", so it must be resolved");
                    }
                    arrayList.add(m0VarC);
                }
                return arrayList;
            default:
                j jVar2 = this.f46187f;
                if (fm.e.f(jVar2) == null) {
                    return null;
                }
                ((ll.a) jVar2.f46192g.f23782b).f45506w.getClass();
                return null;
        }
    }
}
