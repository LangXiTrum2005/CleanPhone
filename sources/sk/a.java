package sk;

import jk.c;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.n;
import lm.r;
import qk.f;
import tl.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a extends j implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50256b = new a(2);

    @Override // kotlin.jvm.internal.d, qk.c
    public final String getName() {
        return "loadFunction";
    }

    @Override // kotlin.jvm.internal.d
    public final f getOwner() {
        return d0.f44761a.b(r.class);
    }

    @Override // kotlin.jvm.internal.d
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        r p10 = (r) obj;
        y p11 = (y) obj2;
        n.f(p10, "p0");
        n.f(p11, "p1");
        return p10.e(p11);
    }
}
