package pedagogism;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.apical;
import androidx.work.impl.WorkDatabase;
import ocellation.competently;
import ocellation.impromptu;
import overassessment.taiyuan;
import talweg.dern;

/* JADX INFO: compiled from: Alarms.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String f35140attabal = apical.beachfront("Alarms");

    public static void attabal(Context context, taiyuan taiyuanVar, String str) {
        impromptu impromptuVarPreprohormone = taiyuanVar.kowloon().preprohormone();
        competently competentlyVarSaneness = impromptuVarPreprohormone.saneness(str);
        if (competentlyVarSaneness != null) {
            saneness(context, str, competentlyVarSaneness.f34029saneness);
            apical.dern().attabal(f35140attabal, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            impromptuVarPreprohormone.wireman(str);
        }
    }

    public static void dern(Context context, taiyuan taiyuanVar, String str, long j) {
        WorkDatabase workDatabaseKowloon = taiyuanVar.kowloon();
        impromptu impromptuVarPreprohormone = workDatabaseKowloon.preprohormone();
        competently competentlyVarSaneness = impromptuVarPreprohormone.saneness(str);
        if (competentlyVarSaneness != null) {
            saneness(context, str, competentlyVarSaneness.f34029saneness);
            wireman(context, str, competentlyVarSaneness.f34029saneness, j);
        } else {
            int iSaneness = new dern(workDatabaseKowloon).saneness();
            impromptuVarPreprohormone.attabal(new competently(str, iSaneness));
            wireman(context, str, iSaneness, j);
        }
    }

    public static void saneness(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.attabal.saneness(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        apical.dern().attabal(f35140attabal, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void wireman(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.attabal.saneness(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
