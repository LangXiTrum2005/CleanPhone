package m0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static r1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        r1 r1VarG = r1.g(null, rootWindowInsets);
        o1 o1Var = r1VarG.f45740a;
        o1Var.s(r1VarG);
        View rootView = view.getRootView();
        o1Var.d(rootView);
        o1Var.k(rootView);
        o1Var.l();
        return r1VarG;
    }
}
