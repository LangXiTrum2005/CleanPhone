package am;

import cl.h0;
import java.util.ArrayList;
import xj.d0;
import zk.b0;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f3692b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f3693c = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f3694d = new b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3695a;

    public /* synthetic */ b(int i10) {
        this.f3695a = i10;
    }

    public static String b(zk.g gVar) {
        String strG;
        yl.f name = gVar.getName();
        kotlin.jvm.internal.n.e(name, "descriptor.name");
        String strF = d0.c.F(name);
        if (!(gVar instanceof m0)) {
            zk.j jVarE = gVar.e();
            kotlin.jvm.internal.n.e(jVarE, "descriptor.containingDeclaration");
            if (jVarE instanceof zk.e) {
                strG = b((zk.g) jVarE);
            } else if (jVarE instanceof b0) {
                yl.e eVarI = ((h0) ((b0) jVarE)).f6518e.i();
                kotlin.jvm.internal.n.e(eVarI, "descriptor.fqName.toUnsafe()");
                strG = d0.c.G(eVarI.e());
            } else {
                strG = null;
            }
            if (strG != null && !strG.equals("")) {
                return strG + '.' + strF;
            }
        }
        return strF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zk.g, zk.j] */
    /* JADX WARN: Type inference failed for: r1v5, types: [zk.j] */
    /* JADX WARN: Type inference failed for: r1v6, types: [zk.j] */
    @Override // am.c
    public final String a(zk.g gVar, h hVar) {
        switch (this.f3695a) {
            case 0:
                if (gVar instanceof m0) {
                    yl.f name = ((m0) gVar).getName();
                    kotlin.jvm.internal.n.e(name, "classifier.name");
                    return hVar.O(name, false);
                }
                yl.e eVarG = bm.e.g(gVar);
                kotlin.jvm.internal.n.e(eVarG, "getFqName(classifier)");
                return hVar.o(d0.c.G(eVarG.e()));
            case 1:
                if (gVar instanceof m0) {
                    yl.f name2 = ((m0) gVar).getName();
                    kotlin.jvm.internal.n.e(name2, "classifier.name");
                    return hVar.O(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(gVar.getName());
                    gVar = gVar.e();
                } while (gVar instanceof zk.e);
                return d0.c.G(new d0(arrayList));
            default:
                return b(gVar);
        }
    }
}
