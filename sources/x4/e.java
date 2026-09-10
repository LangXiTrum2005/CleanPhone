package x4;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import oa.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f53619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final el.c f53620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f53621c;

    public e(ClassLoader classLoader, el.c cVar) {
        this.f53619a = classLoader;
        this.f53620b = cVar;
        this.f53621c = new k0(classLoader, 14);
    }

    public final WindowLayoutComponent a() {
        k0 k0Var = this.f53621c;
        k0Var.getClass();
        boolean zB = false;
        try {
            new t4.a(k0Var, 0).invoke();
            if (x7.a.P("WindowExtensionsProvider#getWindowExtensions is not valid", new t4.a(k0Var, 1)) && x7.a.P("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && x7.a.P("FoldingFeature class is not valid", new d(this, 0))) {
                int iA = u4.e.a();
                if (iA == 1) {
                    zB = b();
                } else if (2 <= iA && iA <= Integer.MAX_VALUE && b()) {
                    if (x7.a.P("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        zB = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zB) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return x7.a.P("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
