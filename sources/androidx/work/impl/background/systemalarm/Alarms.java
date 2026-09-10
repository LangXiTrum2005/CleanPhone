package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.utils.IdGenerator;

/* JADX INFO: loaded from: classes.dex */
class Alarms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8703a = Logger.e("Alarms");

    public static void a(int i2, Context context, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i2, CommandHandler.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        Logger.c().a(f8703a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i2 + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkManagerImpl workManagerImpl, String str, long j) {
        int iA;
        WorkDatabase workDatabase = workManagerImpl.f8686c;
        SystemIdInfoDao systemIdInfoDaoP = workDatabase.p();
        SystemIdInfo systemIdInfoA = systemIdInfoDaoP.a(str);
        if (systemIdInfoA != null) {
            a(systemIdInfoA.f8764b, context, str);
            int i2 = systemIdInfoA.f8764b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            PendingIntent service = PendingIntent.getService(context, i2, CommandHandler.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        IdGenerator idGenerator = new IdGenerator(workDatabase);
        synchronized (IdGenerator.class) {
            iA = idGenerator.a("next_alarm_manager_id");
        }
        systemIdInfoDaoP.c(new SystemIdInfo(str, iA));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service2 = PendingIntent.getService(context, iA, CommandHandler.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
