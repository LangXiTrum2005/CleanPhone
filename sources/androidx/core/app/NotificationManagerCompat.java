package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.service.notification.StatusBarNotification;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static String d;
    public static final Object f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f4226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f4223c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashSet f4224e = new HashSet();

    public static class Api23Impl {
        public static List<StatusBarNotification> a(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    public static class Api24Impl {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    public static class Api26Impl {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        public static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        public static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        public static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    public static class Api28Impl {
        public static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    public static class Api30Impl {
        public static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    public static class Api34Impl {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    public static class CancelTask implements Task {
        @Override // androidx.core.app.NotificationManagerCompat.Task
        public final void a(INotificationSideChannel iNotificationSideChannel) {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InterruptionFilter {
    }

    public static class NotificationWithIdAndTag {
    }

    public static class NotifyTask implements Task {
        @Override // androidx.core.app.NotificationManagerCompat.Task
        public final void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(null, 0, null, null);
        }

        public final String toString() {
            return "NotifyTask[packageName:null, id:0, tag:null]";
        }
    }

    public static class ServiceConnectedEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f4227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IBinder f4228b;

        public ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.f4227a = componentName;
            this.f4228b = iBinder;
        }
    }

    public static class SideChannelManager implements Handler.Callback, ServiceConnection {
        public HashSet X;

        public static class ListenerRecord {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ComponentName f4229a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public INotificationSideChannel f4231c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f4230b = false;
            public final ArrayDeque d = new ArrayDeque();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f4232e = 0;

            public ListenerRecord(ComponentName componentName) {
                this.f4229a = componentName;
            }
        }

        public final void a(ListenerRecord listenerRecord) {
            ArrayDeque arrayDeque;
            boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
            ComponentName componentName = listenerRecord.f4229a;
            if (zIsLoggable) {
                Log.d("NotifManCompat", "Processing component " + componentName + ", " + listenerRecord.d.size() + " queued tasks");
            }
            if (listenerRecord.d.isEmpty()) {
                return;
            }
            if (!listenerRecord.f4230b) {
                new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                throw null;
            }
            if (listenerRecord.f4231c == null) {
                b(listenerRecord);
                return;
            }
            while (true) {
                arrayDeque = listenerRecord.d;
                Task task = (Task) arrayDeque.peek();
                if (task == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + task);
                    }
                    task.a(listenerRecord.f4231c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e2) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e2);
                }
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            b(listenerRecord);
        }

        public final void b(ListenerRecord listenerRecord) {
            ComponentName componentName = listenerRecord.f4229a;
            throw null;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                Object obj = NotificationManagerCompat.f4223c;
                throw null;
            }
            if (i2 == 1) {
                ComponentName componentName = ((ServiceConnectedEvent) message.obj).f4227a;
                throw null;
            }
            if (i2 == 2) {
                throw null;
            }
            if (i2 != 3) {
                return false;
            }
            throw null;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            new ServiceConnectedEvent(componentName, iBinder);
            throw null;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            throw null;
        }
    }

    public interface Task {
        void a(INotificationSideChannel iNotificationSideChannel);
    }

    public NotificationManagerCompat(Context context) {
        this.f4225a = context;
        this.f4226b = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public boolean areNotificationsEnabled() {
        return Api24Impl.a(this.f4226b);
    }
}
