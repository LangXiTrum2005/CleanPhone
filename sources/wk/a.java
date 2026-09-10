package wk;

import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f53300e = new a(0);

    @Override // jk.a
    public final Object invoke() {
        ServiceLoader implementations = ServiceLoader.load(c.class, c.class.getClassLoader());
        kotlin.jvm.internal.n.e(implementations, "implementations");
        c cVar = (c) xj.n.p0(implementations);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
