package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p0 extends kotlin.jvm.internal.j implements jk.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p0 f51039b = new p0(2);

    @Override // kotlin.jvm.internal.d, qk.c
    public final String getName() {
        return "loadProperty";
    }

    @Override // kotlin.jvm.internal.d
    public final qk.f getOwner() {
        return kotlin.jvm.internal.d0.f44761a.b(lm.r.class);
    }

    @Override // kotlin.jvm.internal.d
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        lm.r p10 = (lm.r) obj;
        tl.g0 p11 = (tl.g0) obj2;
        kotlin.jvm.internal.n.f(p10, "p0");
        kotlin.jvm.internal.n.f(p11, "p1");
        return p10.f(p11);
    }
}
