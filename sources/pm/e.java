package pm;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f48423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f48424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qm.b f48425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sm.d f48426h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ArrayList arrayList, m0 m0Var, qm.b bVar, sm.d dVar) {
        super(1);
        this.f48423e = arrayList;
        this.f48424f = m0Var;
        this.f48425g = bVar;
        this.f48426h = dVar;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        k0 runForkingPoint = (k0) obj;
        kotlin.jvm.internal.n.f(runForkingPoint, "$this$runForkingPoint");
        for (sm.d dVar : this.f48423e) {
            d dVar2 = new d(this.f48424f, this.f48425g, dVar, this.f48426h);
            if (!runForkingPoint.f48448a) {
                runForkingPoint.f48448a = ((Boolean) dVar2.invoke()).booleanValue();
            }
        }
        return wj.r.f53297a;
    }
}
