package z4;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.n;
import m0.r1;
import x4.i;
import x4.j;
import x4.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static x4.c a(j jVar, FoldingFeature foldingFeature) {
        x4.b bVar;
        x4.b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = x4.b.f53610g;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = x4.b.f53611h;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = x4.b.f53608e;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = x4.b.f53609f;
        }
        Rect bounds = foldingFeature.getBounds();
        n.e(bounds, "oemFeature.bounds");
        int i10 = bounds.left;
        int i11 = bounds.top;
        int i12 = bounds.right;
        int i13 = bounds.bottom;
        if (i10 > i12) {
            throw new IllegalArgumentException(defpackage.e.g(i10, i12, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i11 > i13) {
            throw new IllegalArgumentException(defpackage.e.g(i11, i13, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
        Rect rectA = jVar.f53628a.a();
        int i14 = i13 - i11;
        if (i14 == 0 && i12 - i10 == 0) {
            return null;
        }
        int i15 = i12 - i10;
        if (i15 != rectA.width() && i14 != rectA.height()) {
            return null;
        }
        if (i15 < rectA.width() && i14 < rectA.height()) {
            return null;
        }
        if (i15 == rectA.width() && i14 == rectA.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        n.e(bounds2, "oemFeature.bounds");
        return new x4.c(new u4.b(bounds2), bVar, bVar2);
    }

    public static i b(Context context, WindowLayoutInfo info) {
        n.f(info, "info");
        int i10 = l.f53631b;
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        r1 r1VarG = r1.g(null, windowManager.getCurrentWindowMetrics().getWindowInsets());
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        n.e(bounds, "wm.currentWindowMetrics.bounds");
        return c(new j(bounds, r1VarG), info);
    }

    public static i c(j jVar, WindowLayoutInfo info) {
        x4.c cVarA;
        n.f(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        n.e(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                n.e(feature, "feature");
                cVarA = a(jVar, feature);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new i(arrayList);
    }
}
