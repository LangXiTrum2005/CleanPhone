package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ScrollbarHelper {
    public static int a(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z2) {
        if (layoutManager.getChildCount() == 0 || state.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1;
        }
        return Math.min(orientationHelper.n(), orientationHelper.d(view2) - orientationHelper.g(view));
    }

    public static int b(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z2, boolean z3) {
        if (layoutManager.getChildCount() == 0 || state.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z3 ? Math.max(0, (state.b() - Math.max(layoutManager.getPosition(view), layoutManager.getPosition(view2))) - 1) : Math.max(0, Math.min(layoutManager.getPosition(view), layoutManager.getPosition(view2)));
        if (z2) {
            return Math.round((iMax * (Math.abs(orientationHelper.d(view2) - orientationHelper.g(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1))) + (orientationHelper.m() - orientationHelper.g(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z2) {
        if (layoutManager.getChildCount() == 0 || state.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return state.b();
        }
        return (int) (((orientationHelper.d(view2) - orientationHelper.g(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1)) * state.b());
    }
}
