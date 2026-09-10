package androidx.core.app;

import android.app.Dialog;

/* JADX INFO: loaded from: classes.dex */
public class DialogCompat {

    public static class Api28Impl {
        public static <T> T a(Dialog dialog, int i2) {
            return (T) dialog.requireViewById(i2);
        }
    }
}
