package ql;

import cl.z;
import pm.a1;
import pm.y;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f49160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f49161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f49162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f49163i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f49164e;

    static {
        int i10 = 1;
        f49160f = new m(i10, 0);
        f49161g = new m(i10, 1);
        f49162h = new m(i10, 2);
        f49163i = new m(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10, int i11) {
        super(i10);
        this.f49164e = i11;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f49164e) {
            case 0:
                zk.g gVarE = ((a1) obj).P().e();
                if (gVarE == null) {
                    return Boolean.FALSE;
                }
                yl.f name = gVarE.getName();
                yl.c cVar = yk.d.f54452f;
                return Boolean.valueOf(kotlin.jvm.internal.n.a(name, cVar.f()) && kotlin.jvm.internal.n.a(fm.e.c(gVarE), cVar));
            case 1:
                zk.c it = (zk.c) obj;
                kotlin.jvm.internal.n.f(it, "it");
                z zVarJ = it.J();
                kotlin.jvm.internal.n.c(zVarJ);
                return zVarJ.getType();
            case 2:
                zk.c it2 = (zk.c) obj;
                kotlin.jvm.internal.n.f(it2, "it");
                y returnType = it2.getReturnType();
                kotlin.jvm.internal.n.c(returnType);
                return returnType;
            case 3:
                a1 it3 = (a1) obj;
                kotlin.jvm.internal.n.f(it3, "it");
                return Boolean.valueOf(it3 instanceof nl.f);
            default:
                n function = (n) obj;
                kotlin.jvm.internal.n.f(function, "$this$function");
                String strConcat = "java/util/".concat("Spliterator");
                d dVar = k.f49155b;
                function.c(strConcat, dVar, dVar);
                return r.f53297a;
        }
    }
}
