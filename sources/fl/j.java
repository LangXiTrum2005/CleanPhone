package fl;

import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.j implements jk.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f40997b = new j(1);

    @Override // kotlin.jvm.internal.d, qk.c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.d
    public final qk.f getOwner() {
        return kotlin.jvm.internal.d0.f44761a.b(q.class);
    }

    @Override // kotlin.jvm.internal.d
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        Constructor p10 = (Constructor) obj;
        kotlin.jvm.internal.n.f(p10, "p0");
        return new q(p10);
    }
}
