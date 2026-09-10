package g5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import d5.o;
import e5.l;
import g9.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f41518a = o.i("Alarms");

    public static void a(Context context, int i10, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i10, b.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        o.g().e(f41518a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i10 + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, l lVar, String str, long j10) {
        int iIntValue;
        WorkDatabase workDatabase = lVar.f39111c;
        k kVarK = workDatabase.k();
        m5.d dVarW = kVarK.w(str);
        if (dVarW != null) {
            a(context, dVarW.f45875b, str);
            int i10 = dVarW.f45875b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            PendingIntent service = PendingIntent.getService(context, i10, b.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j10, service);
                return;
            }
            return;
        }
        synchronized (n5.f.class) {
            workDatabase.c();
            try {
                Long lN = workDatabase.j().n("next_alarm_manager_id");
                iIntValue = lN != null ? lN.intValue() : 0;
                workDatabase.j().r(new m5.c("next_alarm_manager_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        }
        kVarK.y(new m5.d(str, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, b.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j10, service2);
        }
    }
}
