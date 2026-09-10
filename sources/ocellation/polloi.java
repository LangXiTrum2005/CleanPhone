package ocellation;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: compiled from: WorkSpecDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class polloi implements monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RoomDatabase f34052attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final sulfarsenide.competently f34053beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final sulfarsenide.competently f34054competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final sulfarsenide.competently f34055cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final sulfarsenide.competently f34056dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final sulfarsenide.competently f34057impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final sulfarsenide.competently f34058marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final sulfarsenide.attabal<arytenoidectomy> f34059saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final sulfarsenide.competently f34060taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final sulfarsenide.competently f34061wireman;

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class attabal extends sulfarsenide.attabal<arytenoidectomy> {
        public attabal(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.attabal
        /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
        public void competently(iconoclasm.beachfront beachfrontVar, arytenoidectomy arytenoidectomyVar) throws Throwable {
            String str = arytenoidectomyVar.f33999attabal;
            if (str == null) {
                beachfrontVar.lotta(1);
            } else {
                beachfrontVar.peridotite(1, str);
            }
            beachfrontVar.permissivist(2, dovishness.cutely(arytenoidectomyVar.f34011saneness));
            String str2 = arytenoidectomyVar.f34003dern;
            if (str2 == null) {
                beachfrontVar.lotta(3);
            } else {
                beachfrontVar.peridotite(3, str2);
            }
            String str3 = arytenoidectomyVar.f34014wireman;
            if (str3 == null) {
                beachfrontVar.lotta(4);
            } else {
                beachfrontVar.peridotite(4, str3);
            }
            byte[] bArrImpassible = androidx.work.wireman.impassible(arytenoidectomyVar.f34008marial);
            if (bArrImpassible == null) {
                beachfrontVar.lotta(5);
            } else {
                beachfrontVar.premeiotic(5, bArrImpassible);
            }
            byte[] bArrImpassible2 = androidx.work.wireman.impassible(arytenoidectomyVar.f34000beachfront);
            if (bArrImpassible2 == null) {
                beachfrontVar.lotta(6);
            } else {
                beachfrontVar.premeiotic(6, bArrImpassible2);
            }
            beachfrontVar.permissivist(7, arytenoidectomyVar.f34001competently);
            beachfrontVar.permissivist(8, arytenoidectomyVar.f34006impromptu);
            beachfrontVar.permissivist(9, arytenoidectomyVar.f34012taiyuan);
            beachfrontVar.permissivist(10, arytenoidectomyVar.f33997apical);
            beachfrontVar.permissivist(11, dovishness.attabal(arytenoidectomyVar.f34004formularize));
            beachfrontVar.permissivist(12, arytenoidectomyVar.f34005impassible);
            beachfrontVar.permissivist(13, arytenoidectomyVar.f34013triweekly);
            beachfrontVar.permissivist(14, arytenoidectomyVar.f34007kowloon);
            beachfrontVar.permissivist(15, arytenoidectomyVar.f33998arytenoidectomy);
            beachfrontVar.permissivist(16, arytenoidectomyVar.f34009monoploid ? 1L : 0L);
            beachfrontVar.permissivist(17, dovishness.taiyuan(arytenoidectomyVar.f34010polloi));
            androidx.work.saneness sanenessVar = arytenoidectomyVar.f34002cutely;
            if (sanenessVar == null) {
                beachfrontVar.lotta(18);
                beachfrontVar.lotta(19);
                beachfrontVar.lotta(20);
                beachfrontVar.lotta(21);
                beachfrontVar.lotta(22);
                beachfrontVar.lotta(23);
                beachfrontVar.lotta(24);
                beachfrontVar.lotta(25);
                return;
            }
            beachfrontVar.permissivist(18, dovishness.impromptu(sanenessVar.saneness()));
            beachfrontVar.permissivist(19, sanenessVar.competently() ? 1L : 0L);
            beachfrontVar.permissivist(20, sanenessVar.impromptu() ? 1L : 0L);
            beachfrontVar.permissivist(21, sanenessVar.beachfront() ? 1L : 0L);
            beachfrontVar.permissivist(22, sanenessVar.taiyuan() ? 1L : 0L);
            beachfrontVar.permissivist(23, sanenessVar.dern());
            beachfrontVar.permissivist(24, sanenessVar.wireman());
            byte[] bArrDern = dovishness.dern(sanenessVar.attabal());
            if (bArrDern == null) {
                beachfrontVar.lotta(25);
            } else {
                beachfrontVar.premeiotic(25, bArrDern);
            }
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class beachfront extends sulfarsenide.competently {
        public beachfront(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class competently extends sulfarsenide.competently {
        public competently(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class dern extends sulfarsenide.competently {
        public dern(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class impromptu extends sulfarsenide.competently {
        public impromptu(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class marial extends sulfarsenide.competently {
        public marial(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class saneness extends sulfarsenide.competently {
        public saneness(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class taiyuan extends sulfarsenide.competently {
        public taiyuan(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    public class wireman extends sulfarsenide.competently {
        public wireman(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // sulfarsenide.competently
        public String wireman() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    public polloi(RoomDatabase roomDatabase) {
        this.f34052attabal = roomDatabase;
        this.f34059saneness = new attabal(roomDatabase);
        this.f34056dern = new saneness(roomDatabase);
        this.f34061wireman = new dern(roomDatabase);
        this.f34058marial = new wireman(roomDatabase);
        this.f34053beachfront = new marial(roomDatabase);
        this.f34054competently = new beachfront(roomDatabase);
        this.f34057impromptu = new competently(roomDatabase);
        this.f34060taiyuan = new impromptu(roomDatabase);
        this.f34055cutely = new taiyuan(roomDatabase);
    }

    @Override // ocellation.monoploid
    public void adultoid(String str, long j) {
        this.f34052attabal.saneness();
        iconoclasm.beachfront beachfrontVarAttabal = this.f34058marial.attabal();
        beachfrontVarAttabal.permissivist(1, j);
        if (str == null) {
            beachfrontVarAttabal.lotta(2);
        } else {
            beachfrontVarAttabal.peridotite(2, str);
        }
        this.f34052attabal.dern();
        try {
            beachfrontVarAttabal.triweekly();
            this.f34052attabal.polloi();
        } finally {
            this.f34052attabal.competently();
            this.f34058marial.beachfront(beachfrontVarAttabal);
        }
    }

    @Override // ocellation.monoploid
    public int apical() {
        this.f34052attabal.saneness();
        iconoclasm.beachfront beachfrontVarAttabal = this.f34060taiyuan.attabal();
        this.f34052attabal.dern();
        try {
            int iTriweekly = beachfrontVarAttabal.triweekly();
            this.f34052attabal.polloi();
            return iTriweekly;
        } finally {
            this.f34052attabal.competently();
            this.f34060taiyuan.beachfront(beachfrontVarAttabal);
        }
    }

    @Override // ocellation.monoploid
    public List<arytenoidectomy> arytenoidectomy() throws Throwable {
        sulfarsenide.wireman wiremanVar;
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f34052attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34052attabal, wiremanVarDern, false, null);
        try {
            int iSaneness = dispope.saneness.saneness(cursorSaneness, "required_network_type");
            int iSaneness2 = dispope.saneness.saneness(cursorSaneness, "requires_charging");
            int iSaneness3 = dispope.saneness.saneness(cursorSaneness, "requires_device_idle");
            int iSaneness4 = dispope.saneness.saneness(cursorSaneness, "requires_battery_not_low");
            int iSaneness5 = dispope.saneness.saneness(cursorSaneness, "requires_storage_not_low");
            int iSaneness6 = dispope.saneness.saneness(cursorSaneness, "trigger_content_update_delay");
            int iSaneness7 = dispope.saneness.saneness(cursorSaneness, "trigger_max_content_delay");
            int iSaneness8 = dispope.saneness.saneness(cursorSaneness, "content_uri_triggers");
            int iSaneness9 = dispope.saneness.saneness(cursorSaneness, "id");
            int iSaneness10 = dispope.saneness.saneness(cursorSaneness, "state");
            int iSaneness11 = dispope.saneness.saneness(cursorSaneness, "worker_class_name");
            int iSaneness12 = dispope.saneness.saneness(cursorSaneness, "input_merger_class_name");
            int iSaneness13 = dispope.saneness.saneness(cursorSaneness, "input");
            int iSaneness14 = dispope.saneness.saneness(cursorSaneness, AgentOptions.OUTPUT);
            wiremanVar = wiremanVarDern;
            try {
                int iSaneness15 = dispope.saneness.saneness(cursorSaneness, "initial_delay");
                int iSaneness16 = dispope.saneness.saneness(cursorSaneness, "interval_duration");
                int iSaneness17 = dispope.saneness.saneness(cursorSaneness, "flex_duration");
                int iSaneness18 = dispope.saneness.saneness(cursorSaneness, "run_attempt_count");
                int iSaneness19 = dispope.saneness.saneness(cursorSaneness, "backoff_policy");
                int iSaneness20 = dispope.saneness.saneness(cursorSaneness, "backoff_delay_duration");
                int iSaneness21 = dispope.saneness.saneness(cursorSaneness, "period_start_time");
                int iSaneness22 = dispope.saneness.saneness(cursorSaneness, "minimum_retention_duration");
                int iSaneness23 = dispope.saneness.saneness(cursorSaneness, "schedule_requested_at");
                int iSaneness24 = dispope.saneness.saneness(cursorSaneness, "run_in_foreground");
                int iSaneness25 = dispope.saneness.saneness(cursorSaneness, "out_of_quota_policy");
                int i = iSaneness14;
                ArrayList arrayList = new ArrayList(cursorSaneness.getCount());
                while (cursorSaneness.moveToNext()) {
                    String string = cursorSaneness.getString(iSaneness9);
                    int i2 = iSaneness9;
                    String string2 = cursorSaneness.getString(iSaneness11);
                    int i3 = iSaneness11;
                    androidx.work.saneness sanenessVar = new androidx.work.saneness();
                    int i4 = iSaneness;
                    sanenessVar.apical(dovishness.marial(cursorSaneness.getInt(iSaneness)));
                    sanenessVar.impassible(cursorSaneness.getInt(iSaneness2) != 0);
                    sanenessVar.triweekly(cursorSaneness.getInt(iSaneness3) != 0);
                    sanenessVar.formularize(cursorSaneness.getInt(iSaneness4) != 0);
                    sanenessVar.kowloon(cursorSaneness.getInt(iSaneness5) != 0);
                    int i5 = iSaneness2;
                    int i6 = iSaneness3;
                    sanenessVar.arytenoidectomy(cursorSaneness.getLong(iSaneness6));
                    sanenessVar.monoploid(cursorSaneness.getLong(iSaneness7));
                    sanenessVar.cutely(dovishness.saneness(cursorSaneness.getBlob(iSaneness8)));
                    arytenoidectomy arytenoidectomyVar = new arytenoidectomy(string, string2);
                    arytenoidectomyVar.f34011saneness = dovishness.competently(cursorSaneness.getInt(iSaneness10));
                    arytenoidectomyVar.f34014wireman = cursorSaneness.getString(iSaneness12);
                    arytenoidectomyVar.f34008marial = androidx.work.wireman.competently(cursorSaneness.getBlob(iSaneness13));
                    int i7 = i;
                    arytenoidectomyVar.f34000beachfront = androidx.work.wireman.competently(cursorSaneness.getBlob(i7));
                    i = i7;
                    int i8 = iSaneness15;
                    arytenoidectomyVar.f34001competently = cursorSaneness.getLong(i8);
                    int i9 = iSaneness13;
                    int i10 = iSaneness16;
                    arytenoidectomyVar.f34006impromptu = cursorSaneness.getLong(i10);
                    int i11 = iSaneness4;
                    int i12 = iSaneness17;
                    arytenoidectomyVar.f34012taiyuan = cursorSaneness.getLong(i12);
                    int i13 = iSaneness18;
                    arytenoidectomyVar.f33997apical = cursorSaneness.getInt(i13);
                    int i14 = iSaneness19;
                    arytenoidectomyVar.f34004formularize = dovishness.wireman(cursorSaneness.getInt(i14));
                    iSaneness17 = i12;
                    int i15 = iSaneness20;
                    arytenoidectomyVar.f34005impassible = cursorSaneness.getLong(i15);
                    int i16 = iSaneness21;
                    arytenoidectomyVar.f34013triweekly = cursorSaneness.getLong(i16);
                    iSaneness21 = i16;
                    int i17 = iSaneness22;
                    arytenoidectomyVar.f34007kowloon = cursorSaneness.getLong(i17);
                    int i18 = iSaneness23;
                    arytenoidectomyVar.f33998arytenoidectomy = cursorSaneness.getLong(i18);
                    int i19 = iSaneness24;
                    arytenoidectomyVar.f34009monoploid = cursorSaneness.getInt(i19) != 0;
                    int i20 = iSaneness25;
                    arytenoidectomyVar.f34010polloi = dovishness.beachfront(cursorSaneness.getInt(i20));
                    arytenoidectomyVar.f34002cutely = sanenessVar;
                    arrayList.add(arytenoidectomyVar);
                    iSaneness20 = i15;
                    iSaneness4 = i11;
                    iSaneness19 = i14;
                    iSaneness25 = i20;
                    iSaneness2 = i5;
                    iSaneness13 = i9;
                    iSaneness15 = i8;
                    iSaneness16 = i10;
                    iSaneness18 = i13;
                    iSaneness23 = i18;
                    iSaneness9 = i2;
                    iSaneness11 = i3;
                    iSaneness = i4;
                    iSaneness24 = i19;
                    iSaneness22 = i17;
                    iSaneness3 = i6;
                }
                cursorSaneness.close();
                wiremanVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorSaneness.close();
                wiremanVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            wiremanVar = wiremanVarDern;
        }
    }

    @Override // ocellation.monoploid
    public void attabal(String str) {
        this.f34052attabal.saneness();
        iconoclasm.beachfront beachfrontVarAttabal = this.f34056dern.attabal();
        if (str == null) {
            beachfrontVarAttabal.lotta(1);
        } else {
            beachfrontVarAttabal.peridotite(1, str);
        }
        this.f34052attabal.dern();
        try {
            beachfrontVarAttabal.triweekly();
            this.f34052attabal.polloi();
        } finally {
            this.f34052attabal.competently();
            this.f34056dern.beachfront(beachfrontVarAttabal);
        }
    }

    @Override // ocellation.monoploid
    public WorkInfo.State beachfront(String str) {
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            wiremanVarDern.lotta(1);
        } else {
            wiremanVarDern.peridotite(1, str);
        }
        this.f34052attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34052attabal, wiremanVarDern, false, null);
        try {
            return cursorSaneness.moveToFirst() ? dovishness.competently(cursorSaneness.getInt(0)) : null;
        } finally {
            cursorSaneness.close();
            wiremanVarDern.release();
        }
    }

    @Override // ocellation.monoploid
    public arytenoidectomy competently(String str) throws Throwable {
        sulfarsenide.wireman wiremanVar;
        arytenoidectomy arytenoidectomyVar;
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            wiremanVarDern.lotta(1);
        } else {
            wiremanVarDern.peridotite(1, str);
        }
        this.f34052attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34052attabal, wiremanVarDern, false, null);
        try {
            int iSaneness = dispope.saneness.saneness(cursorSaneness, "required_network_type");
            int iSaneness2 = dispope.saneness.saneness(cursorSaneness, "requires_charging");
            int iSaneness3 = dispope.saneness.saneness(cursorSaneness, "requires_device_idle");
            int iSaneness4 = dispope.saneness.saneness(cursorSaneness, "requires_battery_not_low");
            int iSaneness5 = dispope.saneness.saneness(cursorSaneness, "requires_storage_not_low");
            int iSaneness6 = dispope.saneness.saneness(cursorSaneness, "trigger_content_update_delay");
            int iSaneness7 = dispope.saneness.saneness(cursorSaneness, "trigger_max_content_delay");
            int iSaneness8 = dispope.saneness.saneness(cursorSaneness, "content_uri_triggers");
            int iSaneness9 = dispope.saneness.saneness(cursorSaneness, "id");
            int iSaneness10 = dispope.saneness.saneness(cursorSaneness, "state");
            int iSaneness11 = dispope.saneness.saneness(cursorSaneness, "worker_class_name");
            int iSaneness12 = dispope.saneness.saneness(cursorSaneness, "input_merger_class_name");
            int iSaneness13 = dispope.saneness.saneness(cursorSaneness, "input");
            int iSaneness14 = dispope.saneness.saneness(cursorSaneness, AgentOptions.OUTPUT);
            wiremanVar = wiremanVarDern;
            try {
                int iSaneness15 = dispope.saneness.saneness(cursorSaneness, "initial_delay");
                int iSaneness16 = dispope.saneness.saneness(cursorSaneness, "interval_duration");
                int iSaneness17 = dispope.saneness.saneness(cursorSaneness, "flex_duration");
                int iSaneness18 = dispope.saneness.saneness(cursorSaneness, "run_attempt_count");
                int iSaneness19 = dispope.saneness.saneness(cursorSaneness, "backoff_policy");
                int iSaneness20 = dispope.saneness.saneness(cursorSaneness, "backoff_delay_duration");
                int iSaneness21 = dispope.saneness.saneness(cursorSaneness, "period_start_time");
                int iSaneness22 = dispope.saneness.saneness(cursorSaneness, "minimum_retention_duration");
                int iSaneness23 = dispope.saneness.saneness(cursorSaneness, "schedule_requested_at");
                int iSaneness24 = dispope.saneness.saneness(cursorSaneness, "run_in_foreground");
                int iSaneness25 = dispope.saneness.saneness(cursorSaneness, "out_of_quota_policy");
                if (cursorSaneness.moveToFirst()) {
                    String string = cursorSaneness.getString(iSaneness9);
                    String string2 = cursorSaneness.getString(iSaneness11);
                    androidx.work.saneness sanenessVar = new androidx.work.saneness();
                    sanenessVar.apical(dovishness.marial(cursorSaneness.getInt(iSaneness)));
                    sanenessVar.impassible(cursorSaneness.getInt(iSaneness2) != 0);
                    sanenessVar.triweekly(cursorSaneness.getInt(iSaneness3) != 0);
                    sanenessVar.formularize(cursorSaneness.getInt(iSaneness4) != 0);
                    sanenessVar.kowloon(cursorSaneness.getInt(iSaneness5) != 0);
                    sanenessVar.arytenoidectomy(cursorSaneness.getLong(iSaneness6));
                    sanenessVar.monoploid(cursorSaneness.getLong(iSaneness7));
                    sanenessVar.cutely(dovishness.saneness(cursorSaneness.getBlob(iSaneness8)));
                    arytenoidectomy arytenoidectomyVar2 = new arytenoidectomy(string, string2);
                    arytenoidectomyVar2.f34011saneness = dovishness.competently(cursorSaneness.getInt(iSaneness10));
                    arytenoidectomyVar2.f34014wireman = cursorSaneness.getString(iSaneness12);
                    arytenoidectomyVar2.f34008marial = androidx.work.wireman.competently(cursorSaneness.getBlob(iSaneness13));
                    arytenoidectomyVar2.f34000beachfront = androidx.work.wireman.competently(cursorSaneness.getBlob(iSaneness14));
                    arytenoidectomyVar2.f34001competently = cursorSaneness.getLong(iSaneness15);
                    arytenoidectomyVar2.f34006impromptu = cursorSaneness.getLong(iSaneness16);
                    arytenoidectomyVar2.f34012taiyuan = cursorSaneness.getLong(iSaneness17);
                    arytenoidectomyVar2.f33997apical = cursorSaneness.getInt(iSaneness18);
                    arytenoidectomyVar2.f34004formularize = dovishness.wireman(cursorSaneness.getInt(iSaneness19));
                    arytenoidectomyVar2.f34005impassible = cursorSaneness.getLong(iSaneness20);
                    arytenoidectomyVar2.f34013triweekly = cursorSaneness.getLong(iSaneness21);
                    arytenoidectomyVar2.f34007kowloon = cursorSaneness.getLong(iSaneness22);
                    arytenoidectomyVar2.f33998arytenoidectomy = cursorSaneness.getLong(iSaneness23);
                    arytenoidectomyVar2.f34009monoploid = cursorSaneness.getInt(iSaneness24) != 0;
                    arytenoidectomyVar2.f34010polloi = dovishness.beachfront(cursorSaneness.getInt(iSaneness25));
                    arytenoidectomyVar2.f34002cutely = sanenessVar;
                    arytenoidectomyVar = arytenoidectomyVar2;
                } else {
                    arytenoidectomyVar = null;
                }
                cursorSaneness.close();
                wiremanVar.release();
                return arytenoidectomyVar;
            } catch (Throwable th) {
                th = th;
                cursorSaneness.close();
                wiremanVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            wiremanVar = wiremanVarDern;
        }
    }

    @Override // ocellation.monoploid
    public List<arytenoidectomy> cutely(int i) throws Throwable {
        sulfarsenide.wireman wiremanVar;
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        wiremanVarDern.permissivist(1, i);
        this.f34052attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34052attabal, wiremanVarDern, false, null);
        try {
            int iSaneness = dispope.saneness.saneness(cursorSaneness, "required_network_type");
            int iSaneness2 = dispope.saneness.saneness(cursorSaneness, "requires_charging");
            int iSaneness3 = dispope.saneness.saneness(cursorSaneness, "requires_device_idle");
            int iSaneness4 = dispope.saneness.saneness(cursorSaneness, "requires_battery_not_low");
            int iSaneness5 = dispope.saneness.saneness(cursorSaneness, "requires_storage_not_low");
            int iSaneness6 = dispope.saneness.saneness(cursorSaneness, "trigger_content_update_delay");
            int iSaneness7 = dispope.saneness.saneness(cursorSaneness, "trigger_max_content_delay");
            int iSaneness8 = dispope.saneness.saneness(cursorSaneness, "content_uri_triggers");
            int iSaneness9 = dispope.saneness.saneness(cursorSaneness, "id");
            int iSaneness10 = dispope.saneness.saneness(cursorSaneness, "state");
            int iSaneness11 = dispope.saneness.saneness(cursorSaneness, "worker_class_name");
            int iSaneness12 = dispope.saneness.saneness(cursorSaneness, "input_merger_class_name");
            int iSaneness13 = dispope.saneness.saneness(cursorSaneness, "input");
            int iSaneness14 = dispope.saneness.saneness(cursorSaneness, AgentOptions.OUTPUT);
            wiremanVar = wiremanVarDern;
            try {
                int iSaneness15 = dispope.saneness.saneness(cursorSaneness, "initial_delay");
                int iSaneness16 = dispope.saneness.saneness(cursorSaneness, "interval_duration");
                int iSaneness17 = dispope.saneness.saneness(cursorSaneness, "flex_duration");
                int iSaneness18 = dispope.saneness.saneness(cursorSaneness, "run_attempt_count");
                int iSaneness19 = dispope.saneness.saneness(cursorSaneness, "backoff_policy");
                int iSaneness20 = dispope.saneness.saneness(cursorSaneness, "backoff_delay_duration");
                int iSaneness21 = dispope.saneness.saneness(cursorSaneness, "period_start_time");
                int iSaneness22 = dispope.saneness.saneness(cursorSaneness, "minimum_retention_duration");
                int iSaneness23 = dispope.saneness.saneness(cursorSaneness, "schedule_requested_at");
                int iSaneness24 = dispope.saneness.saneness(cursorSaneness, "run_in_foreground");
                int iSaneness25 = dispope.saneness.saneness(cursorSaneness, "out_of_quota_policy");
                int i2 = iSaneness14;
                ArrayList arrayList = new ArrayList(cursorSaneness.getCount());
                while (cursorSaneness.moveToNext()) {
                    String string = cursorSaneness.getString(iSaneness9);
                    int i3 = iSaneness9;
                    String string2 = cursorSaneness.getString(iSaneness11);
                    int i4 = iSaneness11;
                    androidx.work.saneness sanenessVar = new androidx.work.saneness();
                    int i5 = iSaneness;
                    sanenessVar.apical(dovishness.marial(cursorSaneness.getInt(iSaneness)));
                    sanenessVar.impassible(cursorSaneness.getInt(iSaneness2) != 0);
                    sanenessVar.triweekly(cursorSaneness.getInt(iSaneness3) != 0);
                    sanenessVar.formularize(cursorSaneness.getInt(iSaneness4) != 0);
                    sanenessVar.kowloon(cursorSaneness.getInt(iSaneness5) != 0);
                    int i6 = iSaneness2;
                    int i7 = iSaneness3;
                    sanenessVar.arytenoidectomy(cursorSaneness.getLong(iSaneness6));
                    sanenessVar.monoploid(cursorSaneness.getLong(iSaneness7));
                    sanenessVar.cutely(dovishness.saneness(cursorSaneness.getBlob(iSaneness8)));
                    arytenoidectomy arytenoidectomyVar = new arytenoidectomy(string, string2);
                    arytenoidectomyVar.f34011saneness = dovishness.competently(cursorSaneness.getInt(iSaneness10));
                    arytenoidectomyVar.f34014wireman = cursorSaneness.getString(iSaneness12);
                    arytenoidectomyVar.f34008marial = androidx.work.wireman.competently(cursorSaneness.getBlob(iSaneness13));
                    int i8 = i2;
                    arytenoidectomyVar.f34000beachfront = androidx.work.wireman.competently(cursorSaneness.getBlob(i8));
                    i2 = i8;
                    int i9 = iSaneness15;
                    arytenoidectomyVar.f34001competently = cursorSaneness.getLong(i9);
                    int i10 = iSaneness12;
                    int i11 = iSaneness16;
                    arytenoidectomyVar.f34006impromptu = cursorSaneness.getLong(i11);
                    int i12 = iSaneness4;
                    int i13 = iSaneness17;
                    arytenoidectomyVar.f34012taiyuan = cursorSaneness.getLong(i13);
                    int i14 = iSaneness18;
                    arytenoidectomyVar.f33997apical = cursorSaneness.getInt(i14);
                    int i15 = iSaneness19;
                    arytenoidectomyVar.f34004formularize = dovishness.wireman(cursorSaneness.getInt(i15));
                    iSaneness17 = i13;
                    int i16 = iSaneness20;
                    arytenoidectomyVar.f34005impassible = cursorSaneness.getLong(i16);
                    int i17 = iSaneness21;
                    arytenoidectomyVar.f34013triweekly = cursorSaneness.getLong(i17);
                    iSaneness21 = i17;
                    int i18 = iSaneness22;
                    arytenoidectomyVar.f34007kowloon = cursorSaneness.getLong(i18);
                    int i19 = iSaneness23;
                    arytenoidectomyVar.f33998arytenoidectomy = cursorSaneness.getLong(i19);
                    int i20 = iSaneness24;
                    arytenoidectomyVar.f34009monoploid = cursorSaneness.getInt(i20) != 0;
                    int i21 = iSaneness25;
                    arytenoidectomyVar.f34010polloi = dovishness.beachfront(cursorSaneness.getInt(i21));
                    arytenoidectomyVar.f34002cutely = sanenessVar;
                    arrayList.add(arytenoidectomyVar);
                    iSaneness20 = i16;
                    iSaneness4 = i12;
                    iSaneness19 = i15;
                    iSaneness25 = i21;
                    iSaneness2 = i6;
                    iSaneness12 = i10;
                    iSaneness15 = i9;
                    iSaneness16 = i11;
                    iSaneness18 = i14;
                    iSaneness23 = i19;
                    iSaneness9 = i3;
                    iSaneness11 = i4;
                    iSaneness = i5;
                    iSaneness24 = i20;
                    iSaneness22 = i18;
                    iSaneness3 = i7;
                }
                cursorSaneness.close();
                wiremanVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorSaneness.close();
                wiremanVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            wiremanVar = wiremanVarDern;
        }
    }

    @Override // ocellation.monoploid
    public List<arytenoidectomy> dern(long j) throws Throwable {
        sulfarsenide.wireman wiremanVar;
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        wiremanVarDern.permissivist(1, j);
        this.f34052attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34052attabal, wiremanVarDern, false, null);
        try {
            int iSaneness = dispope.saneness.saneness(cursorSaneness, "required_network_type");
            int iSaneness2 = dispope.saneness.saneness(cursorSaneness, "requires_charging");
            int iSaneness3 = dispope.saneness.saneness(cursorSaneness, "requires_device_idle");
            int iSaneness4 = dispope.saneness.saneness(cursorSaneness, "requires_battery_not_low");
            int iSaneness5 = dispope.saneness.saneness(cursorSaneness, "requires_storage_not_low");
            int iSaneness6 = dispope.saneness.saneness(cursorSaneness, "trigger_content_update_delay");
            int iSaneness7 = dispope.saneness.saneness(cursorSaneness, "trigger_max_content_delay");
            int iSaneness8 = dispope.saneness.saneness(cursorSaneness, "content_uri_triggers");
            int iSaneness9 = dispope.saneness.saneness(cursorSaneness, "id");
            int iSaneness10 = dispope.saneness.saneness(cursorSaneness, "state");
            int iSaneness11 = dispope.saneness.saneness(cursorSaneness, "worker_class_name");
            int iSaneness12 = dispope.saneness.saneness(cursorSaneness, "input_merger_class_name");
            int iSaneness13 = dispope.saneness.saneness(cursorSaneness, "input");
            int iSaneness14 = dispope.saneness.saneness(cursorSaneness, AgentOptions.OUTPUT);
            wiremanVar = wiremanVarDern;
            try {
                int iSaneness15 = dispope.saneness.saneness(cursorSaneness, "initial_delay");
                int iSaneness16 = dispope.saneness.saneness(cursorSaneness, "interval_duration");
                int iSaneness17 = dispope.saneness.saneness(cursorSaneness, "flex_duration");
                int iSaneness18 = dispope.saneness.saneness(cursorSaneness, "run_attempt_count");
                int iSaneness19 = dispope.saneness.saneness(cursorSaneness, "backoff_policy");
                int iSaneness20 = dispope.saneness.saneness(cursorSaneness, "backoff_delay_duration");
                int iSaneness21 = dispope.saneness.saneness(cursorSaneness, "period_start_time");
                int iSaneness22 = dispope.saneness.saneness(cursorSaneness, "minimum_retention_duration");
                int iSaneness23 = dispope.saneness.saneness(cursorSaneness, "schedule_requested_at");
                int iSaneness24 = dispope.saneness.saneness(cursorSaneness, "run_in_foreground");
                int iSaneness25 = dispope.saneness.saneness(cursorSaneness, "out_of_quota_policy");
                int i = iSaneness14;
                ArrayList arrayList = new ArrayList(cursorSaneness.getCount());
                while (cursorSaneness.moveToNext()) {
                    String string = cursorSaneness.getString(iSaneness9);
                    int i2 = iSaneness9;
                    String string2 = cursorSaneness.getString(iSaneness11);
                    int i3 = iSaneness11;
                    androidx.work.saneness sanenessVar = new androidx.work.saneness();
                    int i4 = iSaneness;
                    sanenessVar.apical(dovishness.marial(cursorSaneness.getInt(iSaneness)));
                    sanenessVar.impassible(cursorSaneness.getInt(iSaneness2) != 0);
                    sanenessVar.triweekly(cursorSaneness.getInt(iSaneness3) != 0);
                    sanenessVar.formularize(cursorSaneness.getInt(iSaneness4) != 0);
                    sanenessVar.kowloon(cursorSaneness.getInt(iSaneness5) != 0);
                    int i5 = iSaneness2;
                    int i6 = iSaneness3;
                    sanenessVar.arytenoidectomy(cursorSaneness.getLong(iSaneness6));
                    sanenessVar.monoploid(cursorSaneness.getLong(iSaneness7));
                    sanenessVar.cutely(dovishness.saneness(cursorSaneness.getBlob(iSaneness8)));
                    arytenoidectomy arytenoidectomyVar = new arytenoidectomy(string, string2);
                    arytenoidectomyVar.f34011saneness = dovishness.competently(cursorSaneness.getInt(iSaneness10));
                    arytenoidectomyVar.f34014wireman = cursorSaneness.getString(iSaneness12);
                    arytenoidectomyVar.f34008marial = androidx.work.wireman.competently(cursorSaneness.getBlob(iSaneness13));
                    int i7 = i;
                    arytenoidectomyVar.f34000beachfront = androidx.work.wireman.competently(cursorSaneness.getBlob(i7));
                    int i8 = iSaneness15;
                    i = i7;
                    arytenoidectomyVar.f34001competently = cursorSaneness.getLong(i8);
                    int i9 = iSaneness12;
                    int i10 = iSaneness16;
                    arytenoidectomyVar.f34006impromptu = cursorSaneness.getLong(i10);
                    int i11 = iSaneness4;
                    int i12 = iSaneness17;
                    arytenoidectomyVar.f34012taiyuan = cursorSaneness.getLong(i12);
                    int i13 = iSaneness18;
                    arytenoidectomyVar.f33997apical = cursorSaneness.getInt(i13);
                    int i14 = iSaneness19;
                    arytenoidectomyVar.f34004formularize = dovishness.wireman(cursorSaneness.getInt(i14));
                    iSaneness17 = i12;
                    int i15 = iSaneness20;
                    arytenoidectomyVar.f34005impassible = cursorSaneness.getLong(i15);
                    int i16 = iSaneness21;
                    arytenoidectomyVar.f34013triweekly = cursorSaneness.getLong(i16);
                    iSaneness21 = i16;
                    int i17 = iSaneness22;
                    arytenoidectomyVar.f34007kowloon = cursorSaneness.getLong(i17);
                    int i18 = iSaneness23;
                    arytenoidectomyVar.f33998arytenoidectomy = cursorSaneness.getLong(i18);
                    int i19 = iSaneness24;
                    arytenoidectomyVar.f34009monoploid = cursorSaneness.getInt(i19) != 0;
                    int i20 = iSaneness25;
                    arytenoidectomyVar.f34010polloi = dovishness.beachfront(cursorSaneness.getInt(i20));
                    arytenoidectomyVar.f34002cutely = sanenessVar;
                    arrayList.add(arytenoidectomyVar);
                    iSaneness20 = i15;
                    iSaneness4 = i11;
                    iSaneness19 = i14;
                    iSaneness2 = i5;
                    iSaneness25 = i20;
                    iSaneness12 = i9;
                    iSaneness15 = i8;
                    iSaneness16 = i10;
                    iSaneness18 = i13;
                    iSaneness23 = i18;
                    iSaneness9 = i2;
                    iSaneness11 = i3;
                    iSaneness = i4;
                    iSaneness24 = i19;
                    iSaneness22 = i17;
                    iSaneness3 = i6;
                }
                cursorSaneness.close();
                wiremanVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorSaneness.close();
                wiremanVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            wiremanVar = wiremanVarDern;
        }
    }

    @Override // ocellation.monoploid
    public int formularize(String str, long j) {
        this.f34052attabal.saneness();
        iconoclasm.beachfront beachfrontVarAttabal = this.f34057impromptu.attabal();
        beachfrontVarAttabal.permissivist(1, j);
        if (str == null) {
            beachfrontVarAttabal.lotta(2);
        } else {
            beachfrontVarAttabal.peridotite(2, str);
        }
        this.f34052attabal.dern();
        try {
            int iTriweekly = beachfrontVarAttabal.triweekly();
            this.f34052attabal.polloi();
            return iTriweekly;
        } finally {
            this.f34052attabal.competently();
            this.f34057impromptu.beachfront(beachfrontVarAttabal);
        }
    }

    @Override // ocellation.monoploid
    public int graveside(String str) {
        this.f34052attabal.saneness();
        iconoclasm.beachfront beachfrontVarAttabal = this.f34053beachfront.attabal();
        if (str == null) {
            beachfrontVarAttabal.lotta(1);
        } else {
            beachfrontVarAttabal.peridotite(1, str);
        }
        this.f34052attabal.dern();
        try {
            int iTriweekly = beachfrontVarAttabal.triweekly();
            this.f34052attabal.polloi();
            return iTriweekly;
        } finally {
            this.f34052attabal.competently();
            this.f34053beachfront.beachfront(beachfrontVarAttabal);
        }
    }

    @Override // ocellation.monoploid
    public List<arytenoidectomy.saneness> impassible(String str) {
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            wiremanVarDern.lotta(1);
        } else {
            wiremanVarDern.peridotite(1, str);
        }
        this.f34052attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34052attabal, wiremanVarDern, false, null);
        try {
            int iSaneness = dispope.saneness.saneness(cursorSaneness, "id");
            int iSaneness2 = dispope.saneness.saneness(cursorSaneness, "state");
            ArrayList arrayList = new ArrayList(cursorSaneness.getCount());
            while (cursorSaneness.moveToNext()) {
                arytenoidectomy.saneness sanenessVar = new arytenoidectomy.saneness();
                sanenessVar.f34021attabal = cursorSaneness.getString(iSaneness);
                sanenessVar.f34022saneness = dovishness.competently(cursorSaneness.getInt(iSaneness2));
                arrayList.add(sanenessVar);
            }
            cursorSaneness.close();
            wiremanVarDern.release();
            return arrayList;
        } catch (Throwable th) {
            cursorSaneness.close();
            wiremanVarDern.release();
            throw th;
        }
    }

    @Override // ocellation.monoploid
    public List<String> impromptu(String str) {
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            wiremanVarDern.lotta(1);
        } else {
            wiremanVarDern.peridotite(1, str);
        }
        this.f34052attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34052attabal, wiremanVarDern, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorSaneness.getCount());
            while (cursorSaneness.moveToNext()) {
                arrayList.add(cursorSaneness.getString(0));
            }
            cursorSaneness.close();
            wiremanVarDern.release();
            return arrayList;
        } catch (Throwable th) {
            cursorSaneness.close();
            wiremanVarDern.release();
            throw th;
        }
    }

    @Override // ocellation.monoploid
    public void kowloon(String str, androidx.work.wireman wiremanVar) throws Throwable {
        this.f34052attabal.saneness();
        iconoclasm.beachfront beachfrontVarAttabal = this.f34061wireman.attabal();
        byte[] bArrImpassible = androidx.work.wireman.impassible(wiremanVar);
        if (bArrImpassible == null) {
            beachfrontVarAttabal.lotta(1);
        } else {
            beachfrontVarAttabal.premeiotic(1, bArrImpassible);
        }
        if (str == null) {
            beachfrontVarAttabal.lotta(2);
        } else {
            beachfrontVarAttabal.peridotite(2, str);
        }
        this.f34052attabal.dern();
        try {
            beachfrontVarAttabal.triweekly();
            this.f34052attabal.polloi();
        } finally {
            this.f34052attabal.competently();
            this.f34061wireman.beachfront(beachfrontVarAttabal);
        }
    }

    @Override // ocellation.monoploid
    public List<String> marial(String str) {
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            wiremanVarDern.lotta(1);
        } else {
            wiremanVarDern.peridotite(1, str);
        }
        this.f34052attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34052attabal, wiremanVarDern, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorSaneness.getCount());
            while (cursorSaneness.moveToNext()) {
                arrayList.add(cursorSaneness.getString(0));
            }
            cursorSaneness.close();
            wiremanVarDern.release();
            return arrayList;
        } catch (Throwable th) {
            cursorSaneness.close();
            wiremanVarDern.release();
            throw th;
        }
    }

    @Override // ocellation.monoploid
    public int molybdenite(String str) {
        this.f34052attabal.saneness();
        iconoclasm.beachfront beachfrontVarAttabal = this.f34054competently.attabal();
        if (str == null) {
            beachfrontVarAttabal.lotta(1);
        } else {
            beachfrontVarAttabal.peridotite(1, str);
        }
        this.f34052attabal.dern();
        try {
            int iTriweekly = beachfrontVarAttabal.triweekly();
            this.f34052attabal.polloi();
            return iTriweekly;
        } finally {
            this.f34052attabal.competently();
            this.f34054competently.beachfront(beachfrontVarAttabal);
        }
    }

    @Override // ocellation.monoploid
    public void monoploid(arytenoidectomy arytenoidectomyVar) {
        this.f34052attabal.saneness();
        this.f34052attabal.dern();
        try {
            this.f34059saneness.impromptu(arytenoidectomyVar);
            this.f34052attabal.polloi();
        } finally {
            this.f34052attabal.competently();
        }
    }

    @Override // ocellation.monoploid
    public boolean polloi() {
        boolean z = false;
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f34052attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34052attabal, wiremanVarDern, false, null);
        try {
            if (cursorSaneness.moveToFirst() && cursorSaneness.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            cursorSaneness.close();
            wiremanVarDern.release();
        }
    }

    @Override // ocellation.monoploid
    public int saneness(WorkInfo.State state, String... strArr) {
        this.f34052attabal.saneness();
        StringBuilder sbSaneness = dispope.marial.saneness();
        sbSaneness.append("UPDATE workspec SET state=");
        sbSaneness.append("?");
        sbSaneness.append(" WHERE id IN (");
        dispope.marial.attabal(sbSaneness, strArr.length);
        sbSaneness.append(")");
        iconoclasm.beachfront beachfrontVarWireman = this.f34052attabal.wireman(sbSaneness.toString());
        beachfrontVarWireman.permissivist(1, dovishness.cutely(state));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                beachfrontVarWireman.lotta(i);
            } else {
                beachfrontVarWireman.peridotite(i, str);
            }
            i++;
        }
        this.f34052attabal.dern();
        try {
            int iTriweekly = beachfrontVarWireman.triweekly();
            this.f34052attabal.polloi();
            return iTriweekly;
        } finally {
            this.f34052attabal.competently();
        }
    }

    @Override // ocellation.monoploid
    public List<androidx.work.wireman> taiyuan(String str) {
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            wiremanVarDern.lotta(1);
        } else {
            wiremanVarDern.peridotite(1, str);
        }
        this.f34052attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34052attabal, wiremanVarDern, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorSaneness.getCount());
            while (cursorSaneness.moveToNext()) {
                arrayList.add(androidx.work.wireman.competently(cursorSaneness.getBlob(0)));
            }
            cursorSaneness.close();
            wiremanVarDern.release();
            return arrayList;
        } catch (Throwable th) {
            cursorSaneness.close();
            wiremanVarDern.release();
            throw th;
        }
    }

    @Override // ocellation.monoploid
    public List<arytenoidectomy> triweekly(int i) throws Throwable {
        sulfarsenide.wireman wiremanVar;
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        wiremanVarDern.permissivist(1, i);
        this.f34052attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34052attabal, wiremanVarDern, false, null);
        try {
            int iSaneness = dispope.saneness.saneness(cursorSaneness, "required_network_type");
            int iSaneness2 = dispope.saneness.saneness(cursorSaneness, "requires_charging");
            int iSaneness3 = dispope.saneness.saneness(cursorSaneness, "requires_device_idle");
            int iSaneness4 = dispope.saneness.saneness(cursorSaneness, "requires_battery_not_low");
            int iSaneness5 = dispope.saneness.saneness(cursorSaneness, "requires_storage_not_low");
            int iSaneness6 = dispope.saneness.saneness(cursorSaneness, "trigger_content_update_delay");
            int iSaneness7 = dispope.saneness.saneness(cursorSaneness, "trigger_max_content_delay");
            int iSaneness8 = dispope.saneness.saneness(cursorSaneness, "content_uri_triggers");
            int iSaneness9 = dispope.saneness.saneness(cursorSaneness, "id");
            int iSaneness10 = dispope.saneness.saneness(cursorSaneness, "state");
            int iSaneness11 = dispope.saneness.saneness(cursorSaneness, "worker_class_name");
            int iSaneness12 = dispope.saneness.saneness(cursorSaneness, "input_merger_class_name");
            int iSaneness13 = dispope.saneness.saneness(cursorSaneness, "input");
            int iSaneness14 = dispope.saneness.saneness(cursorSaneness, AgentOptions.OUTPUT);
            wiremanVar = wiremanVarDern;
            try {
                int iSaneness15 = dispope.saneness.saneness(cursorSaneness, "initial_delay");
                int iSaneness16 = dispope.saneness.saneness(cursorSaneness, "interval_duration");
                int iSaneness17 = dispope.saneness.saneness(cursorSaneness, "flex_duration");
                int iSaneness18 = dispope.saneness.saneness(cursorSaneness, "run_attempt_count");
                int iSaneness19 = dispope.saneness.saneness(cursorSaneness, "backoff_policy");
                int iSaneness20 = dispope.saneness.saneness(cursorSaneness, "backoff_delay_duration");
                int iSaneness21 = dispope.saneness.saneness(cursorSaneness, "period_start_time");
                int iSaneness22 = dispope.saneness.saneness(cursorSaneness, "minimum_retention_duration");
                int iSaneness23 = dispope.saneness.saneness(cursorSaneness, "schedule_requested_at");
                int iSaneness24 = dispope.saneness.saneness(cursorSaneness, "run_in_foreground");
                int iSaneness25 = dispope.saneness.saneness(cursorSaneness, "out_of_quota_policy");
                int i2 = iSaneness14;
                ArrayList arrayList = new ArrayList(cursorSaneness.getCount());
                while (cursorSaneness.moveToNext()) {
                    String string = cursorSaneness.getString(iSaneness9);
                    int i3 = iSaneness9;
                    String string2 = cursorSaneness.getString(iSaneness11);
                    int i4 = iSaneness11;
                    androidx.work.saneness sanenessVar = new androidx.work.saneness();
                    int i5 = iSaneness;
                    sanenessVar.apical(dovishness.marial(cursorSaneness.getInt(iSaneness)));
                    sanenessVar.impassible(cursorSaneness.getInt(iSaneness2) != 0);
                    sanenessVar.triweekly(cursorSaneness.getInt(iSaneness3) != 0);
                    sanenessVar.formularize(cursorSaneness.getInt(iSaneness4) != 0);
                    sanenessVar.kowloon(cursorSaneness.getInt(iSaneness5) != 0);
                    int i6 = iSaneness2;
                    int i7 = iSaneness3;
                    sanenessVar.arytenoidectomy(cursorSaneness.getLong(iSaneness6));
                    sanenessVar.monoploid(cursorSaneness.getLong(iSaneness7));
                    sanenessVar.cutely(dovishness.saneness(cursorSaneness.getBlob(iSaneness8)));
                    arytenoidectomy arytenoidectomyVar = new arytenoidectomy(string, string2);
                    arytenoidectomyVar.f34011saneness = dovishness.competently(cursorSaneness.getInt(iSaneness10));
                    arytenoidectomyVar.f34014wireman = cursorSaneness.getString(iSaneness12);
                    arytenoidectomyVar.f34008marial = androidx.work.wireman.competently(cursorSaneness.getBlob(iSaneness13));
                    int i8 = i2;
                    arytenoidectomyVar.f34000beachfront = androidx.work.wireman.competently(cursorSaneness.getBlob(i8));
                    i2 = i8;
                    int i9 = iSaneness15;
                    arytenoidectomyVar.f34001competently = cursorSaneness.getLong(i9);
                    int i10 = iSaneness12;
                    int i11 = iSaneness16;
                    arytenoidectomyVar.f34006impromptu = cursorSaneness.getLong(i11);
                    int i12 = iSaneness4;
                    int i13 = iSaneness17;
                    arytenoidectomyVar.f34012taiyuan = cursorSaneness.getLong(i13);
                    int i14 = iSaneness18;
                    arytenoidectomyVar.f33997apical = cursorSaneness.getInt(i14);
                    int i15 = iSaneness19;
                    arytenoidectomyVar.f34004formularize = dovishness.wireman(cursorSaneness.getInt(i15));
                    iSaneness17 = i13;
                    int i16 = iSaneness20;
                    arytenoidectomyVar.f34005impassible = cursorSaneness.getLong(i16);
                    int i17 = iSaneness21;
                    arytenoidectomyVar.f34013triweekly = cursorSaneness.getLong(i17);
                    iSaneness21 = i17;
                    int i18 = iSaneness22;
                    arytenoidectomyVar.f34007kowloon = cursorSaneness.getLong(i18);
                    int i19 = iSaneness23;
                    arytenoidectomyVar.f33998arytenoidectomy = cursorSaneness.getLong(i19);
                    int i20 = iSaneness24;
                    arytenoidectomyVar.f34009monoploid = cursorSaneness.getInt(i20) != 0;
                    int i21 = iSaneness25;
                    arytenoidectomyVar.f34010polloi = dovishness.beachfront(cursorSaneness.getInt(i21));
                    arytenoidectomyVar.f34002cutely = sanenessVar;
                    arrayList.add(arytenoidectomyVar);
                    iSaneness20 = i16;
                    iSaneness4 = i12;
                    iSaneness19 = i15;
                    iSaneness25 = i21;
                    iSaneness2 = i6;
                    iSaneness12 = i10;
                    iSaneness15 = i9;
                    iSaneness16 = i11;
                    iSaneness18 = i14;
                    iSaneness23 = i19;
                    iSaneness9 = i3;
                    iSaneness11 = i4;
                    iSaneness = i5;
                    iSaneness24 = i20;
                    iSaneness22 = i18;
                    iSaneness3 = i7;
                }
                cursorSaneness.close();
                wiremanVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorSaneness.close();
                wiremanVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            wiremanVar = wiremanVarDern;
        }
    }

    @Override // ocellation.monoploid
    public List<arytenoidectomy> wireman() throws Throwable {
        sulfarsenide.wireman wiremanVar;
        sulfarsenide.wireman wiremanVarDern = sulfarsenide.wireman.dern("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f34052attabal.saneness();
        Cursor cursorSaneness = dispope.dern.saneness(this.f34052attabal, wiremanVarDern, false, null);
        try {
            int iSaneness = dispope.saneness.saneness(cursorSaneness, "required_network_type");
            int iSaneness2 = dispope.saneness.saneness(cursorSaneness, "requires_charging");
            int iSaneness3 = dispope.saneness.saneness(cursorSaneness, "requires_device_idle");
            int iSaneness4 = dispope.saneness.saneness(cursorSaneness, "requires_battery_not_low");
            int iSaneness5 = dispope.saneness.saneness(cursorSaneness, "requires_storage_not_low");
            int iSaneness6 = dispope.saneness.saneness(cursorSaneness, "trigger_content_update_delay");
            int iSaneness7 = dispope.saneness.saneness(cursorSaneness, "trigger_max_content_delay");
            int iSaneness8 = dispope.saneness.saneness(cursorSaneness, "content_uri_triggers");
            int iSaneness9 = dispope.saneness.saneness(cursorSaneness, "id");
            int iSaneness10 = dispope.saneness.saneness(cursorSaneness, "state");
            int iSaneness11 = dispope.saneness.saneness(cursorSaneness, "worker_class_name");
            int iSaneness12 = dispope.saneness.saneness(cursorSaneness, "input_merger_class_name");
            int iSaneness13 = dispope.saneness.saneness(cursorSaneness, "input");
            int iSaneness14 = dispope.saneness.saneness(cursorSaneness, AgentOptions.OUTPUT);
            wiremanVar = wiremanVarDern;
            try {
                int iSaneness15 = dispope.saneness.saneness(cursorSaneness, "initial_delay");
                int iSaneness16 = dispope.saneness.saneness(cursorSaneness, "interval_duration");
                int iSaneness17 = dispope.saneness.saneness(cursorSaneness, "flex_duration");
                int iSaneness18 = dispope.saneness.saneness(cursorSaneness, "run_attempt_count");
                int iSaneness19 = dispope.saneness.saneness(cursorSaneness, "backoff_policy");
                int iSaneness20 = dispope.saneness.saneness(cursorSaneness, "backoff_delay_duration");
                int iSaneness21 = dispope.saneness.saneness(cursorSaneness, "period_start_time");
                int iSaneness22 = dispope.saneness.saneness(cursorSaneness, "minimum_retention_duration");
                int iSaneness23 = dispope.saneness.saneness(cursorSaneness, "schedule_requested_at");
                int iSaneness24 = dispope.saneness.saneness(cursorSaneness, "run_in_foreground");
                int iSaneness25 = dispope.saneness.saneness(cursorSaneness, "out_of_quota_policy");
                int i = iSaneness14;
                ArrayList arrayList = new ArrayList(cursorSaneness.getCount());
                while (cursorSaneness.moveToNext()) {
                    String string = cursorSaneness.getString(iSaneness9);
                    int i2 = iSaneness9;
                    String string2 = cursorSaneness.getString(iSaneness11);
                    int i3 = iSaneness11;
                    androidx.work.saneness sanenessVar = new androidx.work.saneness();
                    int i4 = iSaneness;
                    sanenessVar.apical(dovishness.marial(cursorSaneness.getInt(iSaneness)));
                    sanenessVar.impassible(cursorSaneness.getInt(iSaneness2) != 0);
                    sanenessVar.triweekly(cursorSaneness.getInt(iSaneness3) != 0);
                    sanenessVar.formularize(cursorSaneness.getInt(iSaneness4) != 0);
                    sanenessVar.kowloon(cursorSaneness.getInt(iSaneness5) != 0);
                    int i5 = iSaneness2;
                    int i6 = iSaneness3;
                    sanenessVar.arytenoidectomy(cursorSaneness.getLong(iSaneness6));
                    sanenessVar.monoploid(cursorSaneness.getLong(iSaneness7));
                    sanenessVar.cutely(dovishness.saneness(cursorSaneness.getBlob(iSaneness8)));
                    arytenoidectomy arytenoidectomyVar = new arytenoidectomy(string, string2);
                    arytenoidectomyVar.f34011saneness = dovishness.competently(cursorSaneness.getInt(iSaneness10));
                    arytenoidectomyVar.f34014wireman = cursorSaneness.getString(iSaneness12);
                    arytenoidectomyVar.f34008marial = androidx.work.wireman.competently(cursorSaneness.getBlob(iSaneness13));
                    int i7 = i;
                    arytenoidectomyVar.f34000beachfront = androidx.work.wireman.competently(cursorSaneness.getBlob(i7));
                    i = i7;
                    int i8 = iSaneness15;
                    arytenoidectomyVar.f34001competently = cursorSaneness.getLong(i8);
                    int i9 = iSaneness13;
                    int i10 = iSaneness16;
                    arytenoidectomyVar.f34006impromptu = cursorSaneness.getLong(i10);
                    int i11 = iSaneness4;
                    int i12 = iSaneness17;
                    arytenoidectomyVar.f34012taiyuan = cursorSaneness.getLong(i12);
                    int i13 = iSaneness18;
                    arytenoidectomyVar.f33997apical = cursorSaneness.getInt(i13);
                    int i14 = iSaneness19;
                    arytenoidectomyVar.f34004formularize = dovishness.wireman(cursorSaneness.getInt(i14));
                    iSaneness17 = i12;
                    int i15 = iSaneness20;
                    arytenoidectomyVar.f34005impassible = cursorSaneness.getLong(i15);
                    int i16 = iSaneness21;
                    arytenoidectomyVar.f34013triweekly = cursorSaneness.getLong(i16);
                    iSaneness21 = i16;
                    int i17 = iSaneness22;
                    arytenoidectomyVar.f34007kowloon = cursorSaneness.getLong(i17);
                    int i18 = iSaneness23;
                    arytenoidectomyVar.f33998arytenoidectomy = cursorSaneness.getLong(i18);
                    int i19 = iSaneness24;
                    arytenoidectomyVar.f34009monoploid = cursorSaneness.getInt(i19) != 0;
                    int i20 = iSaneness25;
                    arytenoidectomyVar.f34010polloi = dovishness.beachfront(cursorSaneness.getInt(i20));
                    arytenoidectomyVar.f34002cutely = sanenessVar;
                    arrayList.add(arytenoidectomyVar);
                    iSaneness20 = i15;
                    iSaneness4 = i11;
                    iSaneness19 = i14;
                    iSaneness25 = i20;
                    iSaneness2 = i5;
                    iSaneness13 = i9;
                    iSaneness15 = i8;
                    iSaneness16 = i10;
                    iSaneness18 = i13;
                    iSaneness23 = i18;
                    iSaneness9 = i2;
                    iSaneness11 = i3;
                    iSaneness = i4;
                    iSaneness24 = i19;
                    iSaneness22 = i17;
                    iSaneness3 = i6;
                }
                cursorSaneness.close();
                wiremanVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorSaneness.close();
                wiremanVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            wiremanVar = wiremanVarDern;
        }
    }
}
