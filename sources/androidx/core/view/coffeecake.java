package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* JADX INFO: compiled from: ViewGroupCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class coffeecake {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final WindowInsets f9292attabal = hardpan.f9308saneness.rotuma();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static boolean f9293saneness = false;

    /* JADX INFO: compiled from: ViewGroupCompat.java */
    public static class attabal {
        public static boolean attabal(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    public static /* synthetic */ WindowInsets attabal(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
        windowInsetsArr[0] = onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets) : view.onApplyWindowInsets(windowInsets);
        return f9292attabal;
    }

    public static boolean dern(ViewGroup viewGroup) {
        return attabal.attabal(viewGroup);
    }

    public static WindowInsets saneness(View view, WindowInsets windowInsets) {
        Object tag = view.getTag(wostteth.marial.tag_on_apply_window_listener);
        Object tag2 = view.getTag(wostteth.marial.tag_window_insets_animation_callback);
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = tag instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag : tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        final WindowInsets[] windowInsetsArr = new WindowInsets[1];
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.itchy
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets2) {
                return coffeecake.attabal(windowInsetsArr, onApplyWindowInsetsListener, view2, windowInsets2);
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(wostteth.marial.tag_compat_insets_dispatch);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets2 = windowInsetsArr[0];
        if (windowInsets2 != null && !windowInsets2.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                saneness(viewGroup.getChildAt(i), windowInsetsArr[0]);
            }
        }
        return windowInsetsArr[0];
    }
}
