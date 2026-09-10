package androidx.core.net;

import android.net.ConnectivityManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectivityManagerCompat {

    public static class Api24Impl {
        public static int a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RestrictBackgroundStatus {
    }
}
