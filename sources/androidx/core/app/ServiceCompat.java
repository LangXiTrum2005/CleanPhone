package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class ServiceCompat {

    public static class Api24Impl {
        public static void a(Service service, int i2) {
            service.stopForeground(i2);
        }
    }

    public static class Api29Impl {
        public static void a(Service service, int i2, Notification notification, int i3) {
            if (i3 == 0 || i3 == -1) {
                service.startForeground(i2, notification, i3);
            } else {
                service.startForeground(i2, notification, i3 & 255);
            }
        }
    }

    public static class Api34Impl {
        public static void a(Service service, int i2, Notification notification, int i3) {
            if (i3 == 0 || i3 == -1) {
                service.startForeground(i2, notification, i3);
            } else {
                service.startForeground(i2, notification, i3 & 1073745919);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StopForegroundFlags {
    }
}
