package earstone;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: GhostViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan {
    public static marial attabal(View view, ViewGroup viewGroup, Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? competently.saneness(view, viewGroup, matrix) : impromptu.saneness(view, viewGroup, matrix);
    }

    public static void saneness(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            competently.beachfront(view);
        } else {
            impromptu.beachfront(view);
        }
    }
}
