package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
public final class AlarmManagerCompat {

    public static class Api21Impl {
        public static AlarmManager.AlarmClockInfo a(long j, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j, pendingIntent);
        }

        public static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    public static class Api23Impl {
        public static void a(AlarmManager alarmManager, int i2, long j, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i2, j, pendingIntent);
        }

        public static void b(AlarmManager alarmManager, int i2, long j, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i2, j, pendingIntent);
        }
    }

    public static class Api31Impl {
        public static boolean a(AlarmManager alarmManager) {
            return alarmManager.canScheduleExactAlarms();
        }
    }
}
