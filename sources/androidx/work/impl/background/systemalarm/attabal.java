package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.apical;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.Map;
import ocellation.arytenoidectomy;

/* JADX INFO: compiled from: CommandHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal implements overassessment.saneness {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final String f14082polloi = apical.beachfront("CommandHandler");

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Context f14084kowloon;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Map<String, overassessment.saneness> f14083arytenoidectomy = new HashMap();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final Object f14085monoploid = new Object();

    public attabal(Context context) {
        this.f14084kowloon = context;
    }

    public static Intent attabal(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent beachfront(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent dern(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    public static boolean impassible(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public static Intent marial(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent saneness(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public final void apical(Intent intent, int i, wireman wiremanVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        apical apicalVarDern = apical.dern();
        String str = f14082polloi;
        apicalVarDern.attabal(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseKowloon = wiremanVar.competently().kowloon();
        workDatabaseKowloon.dern();
        try {
            arytenoidectomy arytenoidectomyVarCompetently = workDatabaseKowloon.stratoscope().competently(string);
            if (arytenoidectomyVarCompetently == null) {
                apical.dern().impromptu(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (arytenoidectomyVarCompetently.f34011saneness.isFinished()) {
                apical.dern().impromptu(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jAttabal = arytenoidectomyVarCompetently.attabal();
            if (arytenoidectomyVarCompetently.saneness()) {
                apical.dern().attabal(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jAttabal)), new Throwable[0]);
                pedagogism.attabal.dern(this.f14084kowloon, wiremanVar.competently(), string, jAttabal);
                wiremanVar.apical(new wireman.saneness(wiremanVar, attabal(this.f14084kowloon), i));
            } else {
                apical.dern().attabal(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jAttabal)), new Throwable[0]);
                pedagogism.attabal.dern(this.f14084kowloon, wiremanVar.competently(), string, jAttabal);
            }
            workDatabaseKowloon.polloi();
        } finally {
            workDatabaseKowloon.competently();
        }
    }

    public final void competently(Intent intent, int i, wireman wiremanVar) {
        apical.dern().attabal(f14082polloi, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new saneness(this.f14084kowloon, i, wiremanVar).attabal();
    }

    public final void cutely(Intent intent, int i, wireman wiremanVar) {
        apical.dern().attabal(f14082polloi, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        wiremanVar.competently().molybdenite();
    }

    public final void formularize(Intent intent, wireman wiremanVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        apical.dern().attabal(f14082polloi, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        wiremanVar.competently().rotuma(string);
        pedagogism.attabal.attabal(this.f14084kowloon, wiremanVar.competently(), string);
        wiremanVar.wireman(string, false);
    }

    public final void impromptu(Intent intent, int i, wireman wiremanVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f14085monoploid) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                apical apicalVarDern = apical.dern();
                String str = f14082polloi;
                apicalVarDern.attabal(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (this.f14083arytenoidectomy.containsKey(string)) {
                    apical.dern().attabal(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                } else {
                    dern dernVar = new dern(this.f14084kowloon, i, string, wiremanVar);
                    this.f14083arytenoidectomy.put(string, dernVar);
                    dernVar.beachfront();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void kowloon(Intent intent, int i, wireman wiremanVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            competently(intent, i, wiremanVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            cutely(intent, i, wiremanVar);
            return;
        }
        if (!impassible(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            apical.dern().saneness(f14082polloi, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            apical(intent, i, wiremanVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            impromptu(intent, i, wiremanVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            formularize(intent, wiremanVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            taiyuan(intent, i);
        } else {
            apical.dern().impromptu(f14082polloi, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }

    public final void taiyuan(Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        apical.dern().attabal(f14082polloi, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        wireman(string, z);
    }

    public boolean triweekly() {
        boolean z;
        synchronized (this.f14085monoploid) {
            z = !this.f14083arytenoidectomy.isEmpty();
        }
        return z;
    }

    @Override // overassessment.saneness
    public void wireman(String str, boolean z) {
        synchronized (this.f14085monoploid) {
            try {
                overassessment.saneness sanenessVarRemove = this.f14083arytenoidectomy.remove(str);
                if (sanenessVarRemove != null) {
                    sanenessVarRemove.wireman(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
