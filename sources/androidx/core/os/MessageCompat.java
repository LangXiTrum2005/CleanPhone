package androidx.core.os;

import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class MessageCompat {

    public static class Api22Impl {
        public static boolean a(Message message) {
            return message.isAsynchronous();
        }

        public static void b(Message message, boolean z2) {
            message.setAsynchronous(z2);
        }
    }
}
