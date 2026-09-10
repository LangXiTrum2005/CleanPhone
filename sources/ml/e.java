package ml;

import com.google.android.gms.internal.measurement.nf;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f46174f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i10) {
        super(0);
        this.f46173e = i10;
        this.f46174f = fVar;
    }

    @Override // jk.a
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        switch (this.f46173e) {
            case 0:
                f fVar = this.f46174f;
                ArrayList<pl.a> arrayListB = fVar.f46180b.b();
                ArrayList arrayList = new ArrayList();
                for (pl.a aVar : arrayListB) {
                    yl.f fVar2 = ((fl.e) aVar).f40990a;
                    if (fVar2 == null) {
                        fVar2 = il.y.f43121b;
                    }
                    dm.g gVarA = fVar.a(aVar);
                    wj.f fVar3 = gVarA != null ? new wj.f(fVar2, gVarA) : null;
                    if (fVar3 != null) {
                        arrayList.add(fVar3);
                    }
                }
                return xj.b0.W(arrayList);
            case 1:
                return fl.c.a(d0.c.p(d0.c.l(this.f46174f.f46180b.f40988a))).b();
            default:
                f fVar4 = this.f46174f;
                yl.c cVarE = fVar4.e();
                fl.d dVar = fVar4.f46180b;
                nf nfVar = fVar4.f46179a;
                if (cVarE == null) {
                    return rm.i.c(rm.h.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, dVar.toString());
                }
                ll.a aVar2 = (ll.a) nfVar.f23782b;
                ll.a aVar3 = (ll.a) nfVar.f23782b;
                zk.e eVarB = yk.e.b(cVarE, aVar2.f45498o.d());
                if (eVarB == null) {
                    fl.n nVar = new fl.n(d0.c.p(d0.c.l(dVar.f40988a)));
                    am.e eVar = aVar3.f45495k;
                    eVar.getClass();
                    am.e eVar2 = (am.e) eVar.f3698b;
                    if (eVar2 == null) {
                        kotlin.jvm.internal.n.l("resolver");
                        throw null;
                    }
                    eVarB = eVar2.B(nVar);
                    if (eVarB == null) {
                        eVarB = zk.u.f(aVar3.f45498o, yl.b.j(cVarE), aVar3.f45488d.c().l);
                    }
                }
                return eVarB.g();
        }
    }
}
