package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class PendingIntentCompat {

    public static class Api23Impl {
        public static void a(PendingIntent pendingIntent, Context context, int i2, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String str, Bundle bundle) throws PendingIntent.CanceledException {
            pendingIntent.send(context, i2, intent, onFinished, handler, str, bundle);
        }
    }

    public static class Api26Impl {
        public static PendingIntent a(Context context, int i2, Intent intent, int i3) {
            return PendingIntent.getForegroundService(context, i2, intent, i3);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static class GatedCallback implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }
}
