package talweg;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: IdGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final WorkDatabase f38611attabal;

    public dern(WorkDatabase workDatabase) {
        this.f38611attabal = workDatabase;
    }

    public static void attabal(Context context, iconoclasm.saneness sanenessVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            sanenessVar.beachfront();
            try {
                sanenessVar.cord("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                sanenessVar.cord("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                sanenessVar.preprohormone();
            } finally {
                sanenessVar.oilcan();
            }
        }
    }

    public final int dern(String str) {
        this.f38611attabal.dern();
        try {
            Long lSaneness = this.f38611attabal.rotuma().saneness(str);
            int i = 0;
            int iIntValue = lSaneness != null ? lSaneness.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i = iIntValue + 1;
            }
            marial(str, i);
            this.f38611attabal.polloi();
            return iIntValue;
        } finally {
            this.f38611attabal.competently();
        }
    }

    public final void marial(String str, int i) {
        this.f38611attabal.rotuma().attabal(new ocellation.wireman(str, i));
    }

    public int saneness() {
        int iDern;
        synchronized (dern.class) {
            iDern = dern("next_alarm_manager_id");
        }
        return iDern;
    }

    public int wireman(int i, int i2) {
        synchronized (dern.class) {
            int iDern = dern("next_job_scheduler_id");
            if (iDern < i || iDern > i2) {
                marial("next_job_scheduler_id", i + 1);
            } else {
                i = iDern;
            }
        }
        return i;
    }
}
