package androidx.core.content.pm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutManagerCompat {

    /* JADX INFO: renamed from: androidx.core.content.pm.ShortcutManagerCompat$1, reason: invalid class name */
    class AnonymousClass1 extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            throw null;
        }
    }

    public static class Api25Impl {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShortcutMatchFlags {
    }
}
