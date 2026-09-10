package lm;

import kotlin.jvm.internal.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z extends kotlin.jvm.internal.j implements jk.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f45601b = new z(1);

    @Override // kotlin.jvm.internal.d, qk.c
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // kotlin.jvm.internal.d
    public final qk.f getOwner() {
        return d0.f44761a.b(yl.b.class);
    }

    @Override // kotlin.jvm.internal.d
    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        yl.b p10 = (yl.b) obj;
        kotlin.jvm.internal.n.f(p10, "p0");
        return p10.f();
    }
}
