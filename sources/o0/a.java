package o0;

import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(NestedScrollView nestedScrollView, float f10) {
        try {
            nestedScrollView.setFrameContentVelocity(f10);
        } catch (LinkageError unused) {
        }
    }

    public static void b(EditorInfo editorInfo) {
        editorInfo.setStylusHandwritingEnabled(true);
    }
}
