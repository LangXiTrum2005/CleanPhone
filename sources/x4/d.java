package x4;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f53617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f53618f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i10) {
        super(0);
        this.f53617e = i10;
        this.f53618f = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x0167  */
    @Override // jk.a
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean z10;
        Class clsC;
        boolean z11;
        boolean z12;
        switch (this.f53617e) {
            case 0:
                Class<?> clsLoadClass = this.f53618f.f53619a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                n.e(clsLoadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method getBoundsMethod = clsLoadClass.getMethod("getBounds", null);
                Method getTypeMethod = clsLoadClass.getMethod("getType", null);
                Method getStateMethod = clsLoadClass.getMethod("getState", null);
                n.e(getBoundsMethod, "getBoundsMethod");
                e0 e0Var = d0.f44761a;
                if (x7.a.q(getBoundsMethod, e0Var.b(Rect.class)) && Modifier.isPublic(getBoundsMethod.getModifiers())) {
                    n.e(getTypeMethod, "getTypeMethod");
                    Class cls = Integer.TYPE;
                    if (x7.a.q(getTypeMethod, e0Var.b(cls)) && Modifier.isPublic(getTypeMethod.getModifiers())) {
                        n.e(getStateMethod, "getStateMethod");
                        if (x7.a.q(getStateMethod, e0Var.b(cls)) && Modifier.isPublic(getStateMethod.getModifiers())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                e eVar = this.f53618f;
                try {
                    clsC = eVar.f53620b.c();
                    break;
                } catch (ClassNotFoundException unused) {
                    clsC = null;
                }
                if (clsC == null) {
                    return Boolean.FALSE;
                }
                Class<?> clsLoadClass2 = eVar.f53619a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                n.e(clsLoadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod = clsLoadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, clsC);
                Method removeListenerMethod = clsLoadClass2.getMethod("removeWindowLayoutInfoListener", clsC);
                n.e(addListenerMethod, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod.getModifiers())) {
                    n.e(removeListenerMethod, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod.getModifiers())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 2:
                Class<?> clsLoadClass3 = this.f53618f.f53619a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                n.e(clsLoadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod2 = clsLoadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method removeListenerMethod2 = clsLoadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                n.e(addListenerMethod2, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod2.getModifiers())) {
                    n.e(removeListenerMethod2, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod2.getModifiers())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            default:
                e eVar2 = this.f53618f;
                Class<?> clsLoadClass4 = ((ClassLoader) eVar2.f53621c.f47269b).loadClass("androidx.window.extensions.WindowExtensions");
                n.e(clsLoadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method getWindowLayoutComponentMethod = clsLoadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> clsLoadClass5 = eVar2.f53619a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                n.e(clsLoadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                n.e(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(getWindowLayoutComponentMethod.getModifiers()) && getWindowLayoutComponentMethod.getReturnType().equals(clsLoadClass5));
        }
    }
}
