package fm;

import cl.x0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.n;
import qk.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b extends j implements jk.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f41015b = new b(1);

    @Override // kotlin.jvm.internal.d, qk.c
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // kotlin.jvm.internal.d
    public final f getOwner() {
        return d0.f44761a.b(x0.class);
    }

    @Override // kotlin.jvm.internal.d
    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        x0 p10 = (x0) obj;
        n.f(p10, "p0");
        return Boolean.valueOf(p10.K0());
    }
}
