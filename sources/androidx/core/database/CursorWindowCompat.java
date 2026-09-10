package androidx.core.database;

import android.database.CursorWindow;

/* JADX INFO: loaded from: classes.dex */
public final class CursorWindowCompat {

    public static class Api28Impl {
        public static CursorWindow a(String str, long j) {
            return new CursorWindow(str, j);
        }
    }
}
