package cl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0 f6496f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i10) {
        super(0);
        this.f6495e = i10;
        this.f6496f = f0Var;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f6495e) {
            case 0:
                f0 f0Var = this.f6496f;
                n5.f fVar = f0Var.f6502g;
                if (fVar == null) {
                    StringBuilder sb2 = new StringBuilder("Dependencies of module ");
                    String str = f0Var.getName().f54514a;
                    kotlin.jvm.internal.n.e(str, "name.toString()");
                    sb2.append(str);
                    sb2.append(" were not set before querying module content");
                    throw new AssertionError(sb2.toString());
                }
                List list = (List) fVar.f46523b;
                f0Var.I0();
                list.contains(f0Var);
                List list2 = list;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((f0) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(xj.p.W(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    zk.d0 d0Var = ((f0) it2.next()).f6503h;
                    kotlin.jvm.internal.n.c(d0Var);
                    arrayList.add(d0Var);
                }
                return new o("CompositeProvider@ModuleDescriptor for " + f0Var.getName(), arrayList);
            case 1:
                return ((b0) this.f6496f.F(wk.m.f53370h)).f6483g;
            default:
                return new yk.h(this.f6496f);
        }
    }
}
