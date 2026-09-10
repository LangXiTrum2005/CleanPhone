package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ProxyNotificationInitializer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class creditor {
    public static /* synthetic */ void attabal(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        try {
            if (!saneness(context)) {
                context.getPackageName();
                return;
            }
            hydrovane.marial(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    public static boolean beachfront(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public static void dern(Context context) {
        if (hydrovane.dern(context)) {
            return;
        }
        marial(new androidx.privacysandbox.ads.adservices.measurement.cutely(), context, beachfront(context));
    }

    public static Task<Void> marial(Executor executor, final Context context, final boolean z) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.privatdozent
            @Override // java.lang.Runnable
            public final void run() {
                creditor.attabal(context, z, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public static boolean saneness(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    public static boolean wireman(Context context) {
        if (!PlatformVersion.isAtLeastQ()) {
            Log.isLoggable("FirebaseMessaging", 3);
            return false;
        }
        if (!saneness(context)) {
            context.getPackageName();
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        Log.isLoggable("FirebaseMessaging", 3);
        return true;
    }
}
