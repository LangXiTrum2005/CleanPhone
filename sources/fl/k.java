package fl;

import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.j implements jk.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f40998b = new k(1);

    @Override // kotlin.jvm.internal.d, qk.c
    public final String getName() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.internal.d
    public final qk.f getOwner() {
        return kotlin.jvm.internal.d0.f44761a.b(Member.class);
    }

    @Override // kotlin.jvm.internal.d
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        Member p10 = (Member) obj;
        kotlin.jvm.internal.n.f(p10, "p0");
        return Boolean.valueOf(p10.isSynthetic());
    }
}
