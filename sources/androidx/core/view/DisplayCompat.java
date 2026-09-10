package androidx.core.view;

import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayCompat {

    public static class Api23Impl {
    }

    public static final class ModeCompat {

        public static class Api23Impl {
            public static int a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            public static int b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }
    }
}
