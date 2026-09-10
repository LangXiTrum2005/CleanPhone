package m0;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    public static r1 a(View view, r1 r1Var, Rect rect) {
        WindowInsets windowInsetsF = r1Var.f();
        if (windowInsetsF != null) {
            return r1.g(view, view.computeSystemWindowInsets(windowInsetsF, rect));
        }
        rect.setEmpty();
        return r1Var;
    }

    public static void b(View view, v vVar) {
        k0 k0Var = vVar != null ? new k0(view, vVar) : null;
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (k0Var != null) {
            view.setOnApplyWindowInsetsListener(k0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
