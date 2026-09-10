package fl;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.j implements jk.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f40999b = new l(1);

    @Override // kotlin.jvm.internal.d, qk.c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.d
    public final qk.f getOwner() {
        return kotlin.jvm.internal.d0.f44761a.b(t.class);
    }

    @Override // kotlin.jvm.internal.d
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        Field p10 = (Field) obj;
        kotlin.jvm.internal.n.f(p10, "p0");
        return new t(p10);
    }
}
