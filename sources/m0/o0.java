package m0;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    public static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean b(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean c(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void d(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }
}
