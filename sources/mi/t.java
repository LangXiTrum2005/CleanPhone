package mi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.Window;
import android.view.WindowInsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t {
    public static void a(Context context, io.flutter.embedding.engine.renderer.g gVar) {
        Window window;
        Activity activityV = com.bumptech.glide.d.v(context);
        WindowInsets rootWindowInsets = null;
        if (activityV != null && (window = activityV.getWindow()) != null) {
            rootWindowInsets = window.getDecorView().getRootWindowInsets();
        }
        List boundingRects = rootWindowInsets == null ? Collections.EMPTY_LIST : rootWindowInsets.getBoundingRects(WindowInsets.Type.captionBar());
        int iMax = gVar.f43233h;
        Iterator it = boundingRects.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((Rect) it.next()).bottom);
        }
        gVar.f43233h = iMax;
    }
}
