package m0;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i10) {
        view.setImportantForAutofill(i10);
    }
}
