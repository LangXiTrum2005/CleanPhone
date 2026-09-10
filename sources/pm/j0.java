package pm;

import java.util.Iterator;
import java.util.List;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends vm.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1 f48443b = new s1(13);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f48444c = new j0(xj.v.f53866a);

    public j0(List list) {
        this.f52661a = vm.k.f52679a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            iVar.getClass();
            int iN = f48443b.n(kotlin.jvm.internal.d0.f44761a.b(i.class));
            int iB = this.f52661a.b();
            if (iB != 0) {
                if (iB == 1) {
                    vm.a aVar = this.f52661a;
                    kotlin.jvm.internal.n.d(aVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    vm.p pVar = (vm.p) aVar;
                    int i10 = pVar.f52690b;
                    if (i10 == iN) {
                        this.f52661a = new vm.p(iN, iVar);
                    } else {
                        vm.c cVar = new vm.c();
                        cVar.f52659a = new Object[20];
                        cVar.f52660b = 0;
                        this.f52661a = cVar;
                        cVar.h(i10, pVar.f52689a);
                    }
                }
                this.f52661a.h(iN, iVar);
            } else {
                this.f52661a = new vm.p(iN, iVar);
            }
        }
    }
}
