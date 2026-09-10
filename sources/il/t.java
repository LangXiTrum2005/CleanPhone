package il;

import ea.f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.j implements jk.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f43109b = new t(1);

    @Override // kotlin.jvm.internal.d, qk.c
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // kotlin.jvm.internal.d
    public final qk.f getOwner() {
        return kotlin.jvm.internal.d0.f44761a.c(r.class, "compiler.common.jvm");
    }

    @Override // kotlin.jvm.internal.d
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        yl.c p10 = (yl.c) obj;
        kotlin.jvm.internal.n.f(p10, "p0");
        yl.c cVar = r.f43101a;
        b0.n9.getClass();
        f2 configuredReportLevels = a0.f43041b;
        wj.c cVar2 = new wj.c(1, 7, 20);
        kotlin.jvm.internal.n.f(configuredReportLevels, "configuredReportLevels");
        c0 c0Var = (c0) ((om.j) configuredReportLevels.f39410c).invoke(p10);
        if (c0Var != null) {
            return c0Var;
        }
        f2 f2Var = r.f43103c;
        f2Var.getClass();
        s sVar = (s) ((om.j) f2Var.f39410c).invoke(p10);
        if (sVar == null) {
            return c0.IGNORE;
        }
        wj.c cVar3 = sVar.f43107b;
        return (cVar3 == null || cVar3.f53279d - cVar2.f53279d > 0) ? sVar.f43106a : sVar.f43108c;
    }
}
