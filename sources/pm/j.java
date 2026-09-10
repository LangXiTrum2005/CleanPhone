package pm;

import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ qk.w[] f48441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d5.o f48442b;

    static {
        kotlin.jvm.internal.e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        f48441a = new qk.w[]{e0Var.g(new kotlin.jvm.internal.v(e0Var.c(j.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        s1 s1Var = j0.f48443b;
        qk.d dVarB = e0Var.b(i.class);
        s1Var.getClass();
        f48442b = new d5.o(s1Var.n(dVarB), 19, dVarB);
    }

    public static final al.j a(j0 j0Var) {
        al.j jVar;
        kotlin.jvm.internal.n.f(j0Var, "<this>");
        i iVar = (i) f48442b.getValue(j0Var, f48441a[0]);
        return (iVar == null || (jVar = iVar.f48438a) == null) ? al.i.f3645a : jVar;
    }
}
