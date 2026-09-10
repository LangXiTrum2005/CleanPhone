package e5;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39096c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f39097d;

    public i(Context context, int i10, int i11) {
        super(i10, i11);
        this.f39097d = context;
    }

    @Override // h4.a
    public final void a(l4.b bVar) {
        switch (this.f39096c) {
            case 0:
                if (this.f42208b >= 10) {
                    ((SQLiteDatabase) bVar.f45023b).execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f39097d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) bVar.f45023b;
                Context context = this.f39097d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    bVar.d();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                        sharedPreferences.edit().clear().apply();
                        bVar.s();
                        bVar.o();
                    } catch (Throwable th2) {
                        bVar.o();
                        throw th2;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.d();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.s();
                        return;
                    } finally {
                        bVar.o();
                    }
                }
                return;
        }
    }

    public i(Context context) {
        super(9, 10);
        this.f39097d = context;
    }
}
