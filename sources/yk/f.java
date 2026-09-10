package yk;

import cl.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import zk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends o implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f54461f = new f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f54462e = 0;

    public /* synthetic */ f(int i10) {
        super(i10);
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        boolean z10 = false;
        switch (this.f54462e) {
            case 0:
                w module = (w) obj;
                kotlin.jvm.internal.n.f(module, "module");
                List list = (List) j1.f.w(((b0) module.F(g.f54465f)).f6481e, b0.f6478h[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof mm.c) {
                        arrayList.add(obj2);
                    }
                }
                return (mm.c) xj.n.o0(arrayList);
            default:
                zk.c cVar = (zk.c) obj;
                if (cVar.getKind() == 1) {
                    zk.j jVarE = cVar.e();
                    kotlin.jvm.internal.n.d(jVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String str = d.f54447a;
                    if (d.f54456j.containsKey(bm.e.g((zk.e) jVarE))) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }

    public f(l lVar) {
        super(1);
    }
}
