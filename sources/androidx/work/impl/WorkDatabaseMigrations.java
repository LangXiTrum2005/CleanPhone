package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public class WorkDatabaseMigrations {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Migration f8671a = new AnonymousClass1(1, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Migration f8672b = new AnonymousClass2(3, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Migration f8673c = new AnonymousClass3(4, 5);
    public static final Migration d = new AnonymousClass4(6, 7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Migration f8674e = new AnonymousClass5(7, 8);
    public static final Migration f = new AnonymousClass6(8, 9);
    public static final Migration g = new AnonymousClass7(11, 12);

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabaseMigrations$1, reason: invalid class name */
    public class AnonymousClass1 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.C("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.C("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            supportSQLiteDatabase.C("DROP TABLE IF EXISTS alarmInfo");
            supportSQLiteDatabase.C("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabaseMigrations$2, reason: invalid class name */
    public class AnonymousClass2 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.C("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabaseMigrations$3, reason: invalid class name */
    public class AnonymousClass3 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.C("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            supportSQLiteDatabase.C("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabaseMigrations$4, reason: invalid class name */
    public class AnonymousClass4 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.C("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabaseMigrations$5, reason: invalid class name */
    public class AnonymousClass5 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabaseMigrations$6, reason: invalid class name */
    public class AnonymousClass6 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.C("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabaseMigrations$7, reason: invalid class name */
    public class AnonymousClass7 extends Migration {
        @Override // androidx.room.migration.Migration
        public final void a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.C("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class RescheduleMigration extends Migration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f8675c;

        public RescheduleMigration(Context context, int i2, int i3) {
            super(i2, i3);
            this.f8675c = context;
        }

        @Override // androidx.room.migration.Migration
        public final void a(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (this.f8315b >= 10) {
                supportSQLiteDatabase.m0(new Object[]{"reschedule_needed", 1});
            } else {
                this.f8675c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    public static class WorkMigration9To10 extends Migration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f8676c;

        public WorkMigration9To10(Context context) {
            super(9, 10);
            this.f8676c = context;
        }

        @Override // androidx.room.migration.Migration
        public final void a(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            Context context = this.f8676c;
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                supportSQLiteDatabase.x();
                try {
                    supportSQLiteDatabase.m0(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                    supportSQLiteDatabase.m0(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                    sharedPreferences.edit().clear().apply();
                    supportSQLiteDatabase.N();
                    supportSQLiteDatabase.R();
                } catch (Throwable th) {
                    supportSQLiteDatabase.R();
                    throw th;
                }
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                supportSQLiteDatabase.x();
                try {
                    supportSQLiteDatabase.m0(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                    supportSQLiteDatabase.m0(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                    sharedPreferences2.edit().clear().apply();
                    supportSQLiteDatabase.N();
                } finally {
                    supportSQLiteDatabase.R();
                }
            }
        }
    }
}
