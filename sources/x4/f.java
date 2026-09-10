package x4;

import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f53622e = new f(0);

    @Override // jk.a
    public final Object invoke() {
        WindowLayoutComponent windowLayoutComponentA;
        try {
            ClassLoader loader = h.class.getClassLoader();
            e eVar = loader != null ? new e(loader, new el.c(loader)) : null;
            if (eVar == null || (windowLayoutComponentA = eVar.a()) == null) {
                return null;
            }
            n.e(loader, "loader");
            el.c cVar = new el.c(loader);
            int iA = u4.e.a();
            if (iA >= 2) {
                return new z4.d(windowLayoutComponentA);
            }
            return iA == 1 ? new z4.c(windowLayoutComponentA, cVar) : new z4.a();
        } catch (Throwable unused) {
            g gVar = g.f53623a;
            return null;
        }
    }
}
