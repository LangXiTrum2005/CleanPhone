package androidx.work.impl;

import android.content.Context;

/* JADX INFO: compiled from: WorkDatabaseMigrations.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static aristocrat.attabal f14063attabal = new C0111attabal(1, 2);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static aristocrat.attabal f14068saneness = new saneness(3, 4);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static aristocrat.attabal f14066dern = new dern(4, 5);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static aristocrat.attabal f14069wireman = new wireman(6, 7);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static aristocrat.attabal f14067marial = new marial(7, 8);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static aristocrat.attabal f14064beachfront = new beachfront(8, 9);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static aristocrat.attabal f14065competently = new competently(11, 12);

    /* JADX INFO: renamed from: androidx.work.impl.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public class C0111attabal extends aristocrat.attabal {
        public C0111attabal(int i, int i2) {
            super(i, i2);
        }

        @Override // aristocrat.attabal
        public void attabal(iconoclasm.saneness sanenessVar) {
            sanenessVar.impassible("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sanenessVar.impassible("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            sanenessVar.impassible("DROP TABLE IF EXISTS alarmInfo");
            sanenessVar.impassible("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public class beachfront extends aristocrat.attabal {
        public beachfront(int i, int i2) {
            super(i, i2);
        }

        @Override // aristocrat.attabal
        public void attabal(iconoclasm.saneness sanenessVar) {
            sanenessVar.impassible("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public class competently extends aristocrat.attabal {
        public competently(int i, int i2) {
            super(i, i2);
        }

        @Override // aristocrat.attabal
        public void attabal(iconoclasm.saneness sanenessVar) {
            sanenessVar.impassible("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public class dern extends aristocrat.attabal {
        public dern(int i, int i2) {
            super(i, i2);
        }

        @Override // aristocrat.attabal
        public void attabal(iconoclasm.saneness sanenessVar) {
            sanenessVar.impassible("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            sanenessVar.impassible("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public static class impromptu extends aristocrat.attabal {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Context f14070dern;

        public impromptu(Context context, int i, int i2) {
            super(i, i2);
            this.f14070dern = context;
        }

        @Override // aristocrat.attabal
        public void attabal(iconoclasm.saneness sanenessVar) {
            if (this.f14346saneness >= 10) {
                sanenessVar.cord("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f14070dern.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public class marial extends aristocrat.attabal {
        public marial(int i, int i2) {
            super(i, i2);
        }

        @Override // aristocrat.attabal
        public void attabal(iconoclasm.saneness sanenessVar) {
            sanenessVar.impassible("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public class saneness extends aristocrat.attabal {
        public saneness(int i, int i2) {
            super(i, i2);
        }

        @Override // aristocrat.attabal
        public void attabal(iconoclasm.saneness sanenessVar) {
            sanenessVar.impassible("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public static class taiyuan extends aristocrat.attabal {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Context f14071dern;

        public taiyuan(Context context) {
            super(9, 10);
            this.f14071dern = context;
        }

        @Override // aristocrat.attabal
        public void attabal(iconoclasm.saneness sanenessVar) {
            sanenessVar.impassible("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            talweg.marial.saneness(this.f14071dern, sanenessVar);
            talweg.dern.attabal(this.f14071dern, sanenessVar);
        }
    }

    /* JADX INFO: compiled from: WorkDatabaseMigrations.java */
    public class wireman extends aristocrat.attabal {
        public wireman(int i, int i2) {
            super(i, i2);
        }

        @Override // aristocrat.attabal
        public void attabal(iconoclasm.saneness sanenessVar) {
            sanenessVar.impassible("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }
}
