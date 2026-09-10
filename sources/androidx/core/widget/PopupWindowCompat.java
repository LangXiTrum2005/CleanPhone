package androidx.core.widget;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class PopupWindowCompat {

    public static class Api23Impl {
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        public static void c(PopupWindow popupWindow, boolean z2) {
            popupWindow.setOverlapAnchor(z2);
        }

        public static void d(PopupWindow popupWindow, int i2) {
            popupWindow.setWindowLayoutType(i2);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z2) {
        Api23Impl.c(popupWindow, z2);
    }

    public static void b(PopupWindow popupWindow, int i2) {
        Api23Impl.d(popupWindow, i2);
    }
}
