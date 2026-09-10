package ae;

import eb.d0;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f3546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3547c;

    public v(int i10, Method method) {
        this.f3546b = method;
        this.f3547c = i10;
    }

    @Override // ae.y
    public final Object a(Class cls) {
        String strQ0 = d0.Q0(cls);
        if (strQ0 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strQ0));
        }
        return this.f3546b.invoke(null, cls, Integer.valueOf(this.f3547c));
    }
}
