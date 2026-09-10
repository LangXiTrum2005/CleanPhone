package t4;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import oa.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k0 f50480f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(k0 k0Var, int i10) {
        super(0);
        this.f50479e = i10;
        this.f50480f = k0Var;
    }

    @Override // jk.a
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        switch (this.f50479e) {
            case 0:
                Class<?> clsLoadClass = ((ClassLoader) this.f50480f.f47269b).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                n.e(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return clsLoadClass;
            default:
                k0 k0Var = this.f50480f;
                Class<?> clsLoadClass2 = ((ClassLoader) k0Var.f47269b).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                n.e(clsLoadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method getWindowExtensionsMethod = clsLoadClass2.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass3 = ((ClassLoader) k0Var.f47269b).loadClass("androidx.window.extensions.WindowExtensions");
                n.e(clsLoadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                n.e(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(getWindowExtensionsMethod.getReturnType().equals(clsLoadClass3) && Modifier.isPublic(getWindowExtensionsMethod.getModifiers()));
        }
    }
}
