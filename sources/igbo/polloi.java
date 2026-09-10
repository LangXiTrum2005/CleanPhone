package igbo;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: NotificationManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f28381attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final NotificationManager f28382saneness;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Object f28378dern = new Object();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static Set<String> f28380wireman = new HashSet();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Object f28379marial = new Object();

    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    public static class attabal {
        public static boolean attabal(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    public polloi(Context context) {
        this.f28381attabal = context;
        this.f28382saneness = (NotificationManager) context.getSystemService("notification");
    }

    public static polloi saneness(Context context) {
        return new polloi(context);
    }

    public boolean attabal() {
        return attabal.attabal(this.f28382saneness);
    }
}
