package ml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f46220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i10) {
        super(0);
        this.f46219e = i10;
        this.f46220f = pVar;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f46219e) {
            case 0:
                Collection collectionB = this.f46220f.f46222o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionB) {
                    if (((fl.t) obj).f41007a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iO = xj.b0.O(xj.p.W(arrayList, 10));
                if (iO < 16) {
                    iO = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((fl.t) obj2).c(), obj2);
                }
                return linkedHashMap;
            case 1:
                Class<?>[] declaredClasses = this.f46220f.f46222o.f41001a.getDeclaredClasses();
                kotlin.jvm.internal.n.e(declaredClasses, "klass.declaredClasses");
                return xj.n.R0(zm.l.W(zm.l.V(new zm.f(xj.k.b0(declaredClasses), false, fl.b.f40976h), fl.b.f40977i)));
            default:
                p pVar = this.f46220f;
                return xj.g0.v0(pVar.g(), pVar.b());
        }
    }
}
