package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
class ConcurrencyHelpers {

    public static class Handler28Impl {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }
}
