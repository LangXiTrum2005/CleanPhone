package m0;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.ironsource.X3;
import com.storage.androidcleaner.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f45746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f45747b = new g0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f45748c = new i0();

    public static w0 a(View view) {
        if (f45746a == null) {
            f45746a = new WeakHashMap();
        }
        w0 w0Var = (w0) f45746a.get(view);
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0(view);
        f45746a.put(view, w0Var2);
        return w0Var2;
    }

    public static r1 b(View view, r1 r1Var) {
        WindowInsets windowInsetsF = r1Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = q0.a(view, windowInsetsF);
            if (!windowInsetsA.equals(windowInsetsF)) {
                return r1.g(view, windowInsetsA);
            }
        }
        return r1Var;
    }

    public static String[] c(p.v vVar) {
        return Build.VERSION.SDK_INT >= 31 ? r0.a(vVar) : (String[]) vVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static r1 d(View view, r1 r1Var) {
        WindowInsets windowInsetsF = r1Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsF);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsF)) {
                return r1.g(view, windowInsetsOnApplyWindowInsets);
            }
        }
        return r1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g e(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + X3.j.f27834d + view.getId() + X3.j.f27836e);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return r0.b(view, gVar);
        }
        p0.g gVar2 = (p0.g) view.getTag(R.id.tag_on_receive_content_listener);
        w wVar = f45747b;
        if (gVar2 == null) {
            if (view instanceof w) {
                wVar = (w) view;
            }
            return wVar.a(gVar);
        }
        g gVarA = p0.g.a(view, gVar);
        if (gVarA == null) {
            return null;
        }
        if (view instanceof w) {
            wVar = (w) view;
        }
        return wVar.a(gVarA);
    }

    public static void f(View view, b bVar) {
        if (bVar == null && (p0.a(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f45680b);
    }

    public static void g(View view, CharSequence charSequence) {
        new h0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).h(view, charSequence);
        i0 i0Var = f45748c;
        if (charSequence == null) {
            i0Var.f45715a.remove(view);
            view.removeOnAttachStateChangeListener(i0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(i0Var);
        } else {
            i0Var.f45715a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(i0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(i0Var);
            }
        }
    }
}
