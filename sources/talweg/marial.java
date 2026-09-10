package talweg;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: PreferenceUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final WorkDatabase f38648attabal;

    public marial(WorkDatabase workDatabase) {
        this.f38648attabal = workDatabase;
    }

    public static void saneness(Context context, iconoclasm.saneness sanenessVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            sanenessVar.beachfront();
            try {
                sanenessVar.cord("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                sanenessVar.cord("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                sanenessVar.preprohormone();
            } finally {
                sanenessVar.oilcan();
            }
        }
    }

    public boolean attabal() {
        Long lSaneness = this.f38648attabal.rotuma().saneness("reschedule_needed");
        return lSaneness != null && lSaneness.longValue() == 1;
    }

    public void dern(boolean z) {
        this.f38648attabal.rotuma().attabal(new ocellation.wireman("reschedule_needed", z));
    }
}
