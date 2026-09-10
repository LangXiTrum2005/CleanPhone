package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: PopupWindowCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class apical {

    /* JADX INFO: compiled from: PopupWindowCompat.java */
    public static class attabal {
        public static void attabal(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        public static void saneness(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    public static void attabal(PopupWindow popupWindow, boolean z) {
        attabal.attabal(popupWindow, z);
    }

    @Deprecated
    public static void dern(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }

    public static void saneness(PopupWindow popupWindow, int i) {
        attabal.saneness(popupWindow, i);
    }
}
