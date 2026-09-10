package androidx.work.impl.model;

import android.database.Cursor;
import android.os.Build;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.ContentUriTriggers;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f8787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f8788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedSQLiteStatement f8789c;
    public final SharedSQLiteStatement d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SharedSQLiteStatement f8790e;
    public final SharedSQLiteStatement f;
    public final SharedSQLiteStatement g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SharedSQLiteStatement f8791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SharedSQLiteStatement f8792i;

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<WorkSpec> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) throws Throwable {
            int i2;
            int i3;
            Throwable th;
            WorkSpec workSpec = (WorkSpec) obj;
            String str = workSpec.f8776a;
            int i4 = 1;
            if (str == null) {
                supportSQLiteStatement.B0(1);
            } else {
                supportSQLiteStatement.d0(1, str);
            }
            supportSQLiteStatement.k0(2, WorkTypeConverters.f(workSpec.f8777b));
            String str2 = workSpec.f8778c;
            if (str2 == null) {
                supportSQLiteStatement.B0(3);
            } else {
                supportSQLiteStatement.d0(3, str2);
            }
            String str3 = workSpec.d;
            if (str3 == null) {
                supportSQLiteStatement.B0(4);
            } else {
                supportSQLiteStatement.d0(4, str3);
            }
            byte[] bArrC = Data.c(workSpec.f8779e);
            if (bArrC == null) {
                supportSQLiteStatement.B0(5);
            } else {
                supportSQLiteStatement.r0(5, bArrC);
            }
            byte[] bArrC2 = Data.c(workSpec.f);
            if (bArrC2 == null) {
                supportSQLiteStatement.B0(6);
            } else {
                supportSQLiteStatement.r0(6, bArrC2);
            }
            supportSQLiteStatement.k0(7, workSpec.g);
            supportSQLiteStatement.k0(8, workSpec.f8780h);
            supportSQLiteStatement.k0(9, workSpec.f8781i);
            supportSQLiteStatement.k0(10, workSpec.k);
            BackoffPolicy backoffPolicy = workSpec.f8782l;
            int iOrdinal = backoffPolicy.ordinal();
            if (iOrdinal == 0) {
                i2 = 0;
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
                }
                i2 = 1;
            }
            supportSQLiteStatement.k0(11, i2);
            supportSQLiteStatement.k0(12, workSpec.m);
            supportSQLiteStatement.k0(13, workSpec.f8783n);
            supportSQLiteStatement.k0(14, workSpec.o);
            supportSQLiteStatement.k0(15, workSpec.f8784p);
            supportSQLiteStatement.k0(16, workSpec.q ? 1L : 0L);
            OutOfQuotaPolicy outOfQuotaPolicy = workSpec.r;
            int iOrdinal2 = outOfQuotaPolicy.ordinal();
            if (iOrdinal2 == 0) {
                i3 = 0;
            } else {
                if (iOrdinal2 != 1) {
                    throw new IllegalArgumentException("Could not convert " + outOfQuotaPolicy + " to int");
                }
                i3 = 1;
            }
            supportSQLiteStatement.k0(17, i3);
            Constraints constraints = workSpec.j;
            if (constraints == null) {
                supportSQLiteStatement.B0(18);
                supportSQLiteStatement.B0(19);
                supportSQLiteStatement.B0(20);
                supportSQLiteStatement.B0(21);
                supportSQLiteStatement.B0(22);
                supportSQLiteStatement.B0(23);
                supportSQLiteStatement.B0(24);
                supportSQLiteStatement.B0(25);
                return;
            }
            NetworkType networkType = constraints.f8606a;
            int iOrdinal3 = networkType.ordinal();
            if (iOrdinal3 == 0) {
                i4 = 0;
            } else if (iOrdinal3 != 1) {
                if (iOrdinal3 == 2) {
                    i4 = 2;
                } else if (iOrdinal3 == 3) {
                    i4 = 3;
                } else if (iOrdinal3 == 4) {
                    i4 = 4;
                } else {
                    if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.g0) {
                        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                    }
                    i4 = 5;
                }
            }
            supportSQLiteStatement.k0(18, i4);
            supportSQLiteStatement.k0(19, constraints.f8607b ? 1L : 0L);
            supportSQLiteStatement.k0(20, constraints.f8608c ? 1L : 0L);
            supportSQLiteStatement.k0(21, constraints.d ? 1L : 0L);
            supportSQLiteStatement.k0(22, constraints.f8609e ? 1L : 0L);
            supportSQLiteStatement.k0(23, constraints.f);
            supportSQLiteStatement.k0(24, constraints.g);
            ContentUriTriggers contentUriTriggers = constraints.f8610h;
            byte[] byteArray = null;
            objectOutputStream = null;
            ObjectOutputStream objectOutputStream = null;
            if (contentUriTriggers.f8613a.size() != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        try {
                            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                            HashSet<ContentUriTriggers.Trigger> hashSet = contentUriTriggers.f8613a;
                            try {
                                objectOutputStream2.writeInt(hashSet.size());
                                for (ContentUriTriggers.Trigger trigger : hashSet) {
                                    objectOutputStream2.writeUTF(trigger.f8614a.toString());
                                    objectOutputStream2.writeBoolean(trigger.f8615b);
                                }
                                try {
                                    objectOutputStream2.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                                byteArrayOutputStream.close();
                            } catch (IOException e3) {
                                e = e3;
                                objectOutputStream = objectOutputStream2;
                                e.printStackTrace();
                                if (objectOutputStream != null) {
                                    try {
                                        objectOutputStream.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                byteArrayOutputStream.close();
                            } catch (Throwable th2) {
                                th = th2;
                                objectOutputStream = objectOutputStream2;
                                if (objectOutputStream != null) {
                                    try {
                                        objectOutputStream.close();
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                    }
                                }
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (IOException e6) {
                                    e6.printStackTrace();
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (IOException e7) {
                        e = e7;
                    }
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
                byteArray = byteArrayOutputStream.toByteArray();
            }
            if (byteArray == null) {
                supportSQLiteStatement.B0(25);
            } else {
                supportSQLiteStatement.r0(25, byteArray);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$10, reason: invalid class name */
    class AnonymousClass10 implements Callable<List<String>> {
        @Override // java.util.concurrent.Callable
        public final List<String> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$11, reason: invalid class name */
    class AnonymousClass11 implements Callable<List<WorkSpec.WorkInfoPojo>> {
        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$12, reason: invalid class name */
    class AnonymousClass12 implements Callable<List<WorkSpec.WorkInfoPojo>> {
        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$13, reason: invalid class name */
    class AnonymousClass13 implements Callable<List<WorkSpec.WorkInfoPojo>> {
        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$14, reason: invalid class name */
    class AnonymousClass14 implements Callable<Long> {
        @Override // java.util.concurrent.Callable
        public final Long call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$2, reason: invalid class name */
    class AnonymousClass2 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$3, reason: invalid class name */
    class AnonymousClass3 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$4, reason: invalid class name */
    class AnonymousClass4 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$5, reason: invalid class name */
    class AnonymousClass5 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$6, reason: invalid class name */
    class AnonymousClass6 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$7, reason: invalid class name */
    class AnonymousClass7 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$8, reason: invalid class name */
    class AnonymousClass8 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDao_Impl$9, reason: invalid class name */
    class AnonymousClass9 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public WorkSpecDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f8787a = workDatabase_Impl;
        this.f8788b = new AnonymousClass1(workDatabase_Impl);
        this.f8789c = new AnonymousClass2(workDatabase_Impl);
        this.d = new AnonymousClass3(workDatabase_Impl);
        this.f8790e = new AnonymousClass4(workDatabase_Impl);
        this.f = new AnonymousClass5(workDatabase_Impl);
        this.g = new AnonymousClass6(workDatabase_Impl);
        this.f8791h = new AnonymousClass7(workDatabase_Impl);
        this.f8792i = new AnonymousClass8(workDatabase_Impl);
        new AnonymousClass9(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.f8789c;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        if (str == null) {
            supportSQLiteStatementA.B0(1);
        } else {
            supportSQLiteStatementA.d0(1, str);
        }
        workDatabase_Impl.c();
        try {
            supportSQLiteStatementA.E();
            workDatabase_Impl.l();
        } finally {
            workDatabase_Impl.f();
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int b(WorkInfo.State state, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append("?");
            if (i2 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sql = sb.toString();
        Intrinsics.f(sql, "sql");
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        SupportSQLiteStatement supportSQLiteStatementF0 = workDatabase_Impl.h().getWritableDatabase().f0(sql);
        supportSQLiteStatementF0.k0(1, WorkTypeConverters.f(state));
        int i3 = 2;
        for (String str : strArr) {
            if (str == null) {
                supportSQLiteStatementF0.B0(i3);
            } else {
                supportSQLiteStatementF0.d0(i3, str);
            }
            i3++;
        }
        workDatabase_Impl.c();
        try {
            int iE = supportSQLiteStatementF0.E();
            workDatabase_Impl.l();
            return iE;
        } finally {
            workDatabase_Impl.f();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int c(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.f8791h;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        supportSQLiteStatementA.k0(1, j);
        if (str == null) {
            supportSQLiteStatementA.B0(2);
        } else {
            supportSQLiteStatementA.d0(2, str);
        }
        workDatabase_Impl.c();
        try {
            int iE = supportSQLiteStatementA.E();
            workDatabase_Impl.l();
            return iE;
        } finally {
            workDatabase_Impl.f();
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList d(long j) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        roomSQLiteQueryA.k0(1, j);
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            int iA = CursorUtil.a(cursorC, "required_network_type");
            int iA2 = CursorUtil.a(cursorC, "requires_charging");
            int iA3 = CursorUtil.a(cursorC, "requires_device_idle");
            int iA4 = CursorUtil.a(cursorC, "requires_battery_not_low");
            int iA5 = CursorUtil.a(cursorC, "requires_storage_not_low");
            int iA6 = CursorUtil.a(cursorC, "trigger_content_update_delay");
            int iA7 = CursorUtil.a(cursorC, "trigger_max_content_delay");
            int iA8 = CursorUtil.a(cursorC, "content_uri_triggers");
            int iA9 = CursorUtil.a(cursorC, "id");
            int iA10 = CursorUtil.a(cursorC, "state");
            int iA11 = CursorUtil.a(cursorC, "worker_class_name");
            int iA12 = CursorUtil.a(cursorC, "input_merger_class_name");
            int iA13 = CursorUtil.a(cursorC, "input");
            roomSQLiteQuery = roomSQLiteQueryA;
            try {
                int iA14 = CursorUtil.a(cursorC, "output");
                int iA15 = CursorUtil.a(cursorC, "initial_delay");
                int iA16 = CursorUtil.a(cursorC, "interval_duration");
                int iA17 = CursorUtil.a(cursorC, "flex_duration");
                int iA18 = CursorUtil.a(cursorC, "run_attempt_count");
                int iA19 = CursorUtil.a(cursorC, "backoff_policy");
                int iA20 = CursorUtil.a(cursorC, "backoff_delay_duration");
                int iA21 = CursorUtil.a(cursorC, "period_start_time");
                int iA22 = CursorUtil.a(cursorC, "minimum_retention_duration");
                int iA23 = CursorUtil.a(cursorC, "schedule_requested_at");
                int iA24 = CursorUtil.a(cursorC, "run_in_foreground");
                int iA25 = CursorUtil.a(cursorC, "out_of_quota_policy");
                int i2 = iA14;
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    String string = cursorC.getString(iA9);
                    int i3 = iA9;
                    String string2 = cursorC.getString(iA11);
                    int i4 = iA11;
                    Constraints constraints = new Constraints();
                    int i5 = iA;
                    constraints.f8606a = WorkTypeConverters.c(cursorC.getInt(iA));
                    constraints.f8607b = cursorC.getInt(iA2) != 0;
                    constraints.f8608c = cursorC.getInt(iA3) != 0;
                    constraints.d = cursorC.getInt(iA4) != 0;
                    constraints.f8609e = cursorC.getInt(iA5) != 0;
                    int i6 = iA2;
                    int i7 = iA3;
                    constraints.f = cursorC.getLong(iA6);
                    constraints.g = cursorC.getLong(iA7);
                    constraints.f8610h = WorkTypeConverters.a(cursorC.getBlob(iA8));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.f8777b = WorkTypeConverters.e(cursorC.getInt(iA10));
                    workSpec.d = cursorC.getString(iA12);
                    workSpec.f8779e = Data.a(cursorC.getBlob(iA13));
                    int i8 = i2;
                    workSpec.f = Data.a(cursorC.getBlob(i8));
                    int i9 = iA15;
                    int i10 = iA12;
                    workSpec.g = cursorC.getLong(i9);
                    i2 = i8;
                    int i11 = iA16;
                    workSpec.f8780h = cursorC.getLong(i11);
                    int i12 = iA4;
                    int i13 = iA17;
                    workSpec.f8781i = cursorC.getLong(i13);
                    int i14 = iA18;
                    workSpec.k = cursorC.getInt(i14);
                    int i15 = iA19;
                    workSpec.f8782l = WorkTypeConverters.b(cursorC.getInt(i15));
                    iA17 = i13;
                    int i16 = iA20;
                    workSpec.m = cursorC.getLong(i16);
                    int i17 = iA21;
                    workSpec.f8783n = cursorC.getLong(i17);
                    iA21 = i17;
                    int i18 = iA22;
                    workSpec.o = cursorC.getLong(i18);
                    int i19 = iA23;
                    workSpec.f8784p = cursorC.getLong(i19);
                    int i20 = iA24;
                    workSpec.q = cursorC.getInt(i20) != 0;
                    int i21 = iA25;
                    workSpec.r = WorkTypeConverters.d(cursorC.getInt(i21));
                    workSpec.j = constraints;
                    arrayList.add(workSpec);
                    iA20 = i16;
                    iA4 = i12;
                    iA19 = i15;
                    iA25 = i21;
                    iA2 = i6;
                    iA23 = i19;
                    iA9 = i3;
                    iA11 = i4;
                    iA = i5;
                    iA24 = i20;
                    iA12 = i10;
                    iA15 = i9;
                    iA16 = i11;
                    iA18 = i14;
                    iA22 = i18;
                    iA3 = i7;
                }
                cursorC.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryA;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void e(WorkSpec workSpec) {
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f8788b.e(workSpec);
            workDatabase_Impl.l();
        } finally {
            workDatabase_Impl.f();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void f(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.f8790e;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        supportSQLiteStatementA.k0(1, j);
        if (str == null) {
            supportSQLiteStatementA.B0(2);
        } else {
            supportSQLiteStatementA.d0(2, str);
        }
        workDatabase_Impl.c();
        try {
            supportSQLiteStatementA.E();
            workDatabase_Impl.l();
        } finally {
            workDatabase_Impl.f();
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList g() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            int iA = CursorUtil.a(cursorC, "required_network_type");
            int iA2 = CursorUtil.a(cursorC, "requires_charging");
            int iA3 = CursorUtil.a(cursorC, "requires_device_idle");
            int iA4 = CursorUtil.a(cursorC, "requires_battery_not_low");
            int iA5 = CursorUtil.a(cursorC, "requires_storage_not_low");
            int iA6 = CursorUtil.a(cursorC, "trigger_content_update_delay");
            int iA7 = CursorUtil.a(cursorC, "trigger_max_content_delay");
            int iA8 = CursorUtil.a(cursorC, "content_uri_triggers");
            int iA9 = CursorUtil.a(cursorC, "id");
            int iA10 = CursorUtil.a(cursorC, "state");
            int iA11 = CursorUtil.a(cursorC, "worker_class_name");
            int iA12 = CursorUtil.a(cursorC, "input_merger_class_name");
            int iA13 = CursorUtil.a(cursorC, "input");
            roomSQLiteQuery = roomSQLiteQueryA;
            try {
                int iA14 = CursorUtil.a(cursorC, "output");
                int iA15 = CursorUtil.a(cursorC, "initial_delay");
                int iA16 = CursorUtil.a(cursorC, "interval_duration");
                int iA17 = CursorUtil.a(cursorC, "flex_duration");
                int iA18 = CursorUtil.a(cursorC, "run_attempt_count");
                int iA19 = CursorUtil.a(cursorC, "backoff_policy");
                int iA20 = CursorUtil.a(cursorC, "backoff_delay_duration");
                int iA21 = CursorUtil.a(cursorC, "period_start_time");
                int iA22 = CursorUtil.a(cursorC, "minimum_retention_duration");
                int iA23 = CursorUtil.a(cursorC, "schedule_requested_at");
                int iA24 = CursorUtil.a(cursorC, "run_in_foreground");
                int iA25 = CursorUtil.a(cursorC, "out_of_quota_policy");
                int i2 = iA14;
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    String string = cursorC.getString(iA9);
                    int i3 = iA9;
                    String string2 = cursorC.getString(iA11);
                    int i4 = iA11;
                    Constraints constraints = new Constraints();
                    int i5 = iA;
                    constraints.f8606a = WorkTypeConverters.c(cursorC.getInt(iA));
                    constraints.f8607b = cursorC.getInt(iA2) != 0;
                    constraints.f8608c = cursorC.getInt(iA3) != 0;
                    constraints.d = cursorC.getInt(iA4) != 0;
                    constraints.f8609e = cursorC.getInt(iA5) != 0;
                    int i6 = iA2;
                    int i7 = iA3;
                    constraints.f = cursorC.getLong(iA6);
                    constraints.g = cursorC.getLong(iA7);
                    constraints.f8610h = WorkTypeConverters.a(cursorC.getBlob(iA8));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.f8777b = WorkTypeConverters.e(cursorC.getInt(iA10));
                    workSpec.d = cursorC.getString(iA12);
                    workSpec.f8779e = Data.a(cursorC.getBlob(iA13));
                    int i8 = i2;
                    workSpec.f = Data.a(cursorC.getBlob(i8));
                    int i9 = iA13;
                    int i10 = iA15;
                    workSpec.g = cursorC.getLong(i10);
                    i2 = i8;
                    int i11 = iA16;
                    workSpec.f8780h = cursorC.getLong(i11);
                    int i12 = iA4;
                    int i13 = iA17;
                    workSpec.f8781i = cursorC.getLong(i13);
                    int i14 = iA18;
                    workSpec.k = cursorC.getInt(i14);
                    int i15 = iA19;
                    workSpec.f8782l = WorkTypeConverters.b(cursorC.getInt(i15));
                    iA17 = i13;
                    int i16 = iA20;
                    workSpec.m = cursorC.getLong(i16);
                    int i17 = iA21;
                    workSpec.f8783n = cursorC.getLong(i17);
                    iA21 = i17;
                    int i18 = iA22;
                    workSpec.o = cursorC.getLong(i18);
                    int i19 = iA23;
                    workSpec.f8784p = cursorC.getLong(i19);
                    int i20 = iA24;
                    workSpec.q = cursorC.getInt(i20) != 0;
                    int i21 = iA25;
                    workSpec.r = WorkTypeConverters.d(cursorC.getInt(i21));
                    workSpec.j = constraints;
                    arrayList.add(workSpec);
                    iA20 = i16;
                    iA4 = i12;
                    iA19 = i15;
                    iA25 = i21;
                    iA2 = i6;
                    iA15 = i10;
                    iA16 = i11;
                    iA18 = i14;
                    iA23 = i19;
                    iA11 = i4;
                    iA = i5;
                    iA24 = i20;
                    iA22 = i18;
                    iA13 = i9;
                    iA9 = i3;
                    iA3 = i7;
                }
                cursorC.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryA;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final WorkInfo.State h(String str) throws IOException {
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            roomSQLiteQueryA.B0(1);
        } else {
            roomSQLiteQueryA.d0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            return cursorC.moveToFirst() ? WorkTypeConverters.e(cursorC.getInt(0)) : null;
        } finally {
            cursorC.close();
            roomSQLiteQueryA.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final WorkSpec i(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        WorkSpec workSpec;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            roomSQLiteQueryA.B0(1);
        } else {
            roomSQLiteQueryA.d0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            int iA = CursorUtil.a(cursorC, "required_network_type");
            int iA2 = CursorUtil.a(cursorC, "requires_charging");
            int iA3 = CursorUtil.a(cursorC, "requires_device_idle");
            int iA4 = CursorUtil.a(cursorC, "requires_battery_not_low");
            int iA5 = CursorUtil.a(cursorC, "requires_storage_not_low");
            int iA6 = CursorUtil.a(cursorC, "trigger_content_update_delay");
            int iA7 = CursorUtil.a(cursorC, "trigger_max_content_delay");
            int iA8 = CursorUtil.a(cursorC, "content_uri_triggers");
            int iA9 = CursorUtil.a(cursorC, "id");
            int iA10 = CursorUtil.a(cursorC, "state");
            int iA11 = CursorUtil.a(cursorC, "worker_class_name");
            int iA12 = CursorUtil.a(cursorC, "input_merger_class_name");
            int iA13 = CursorUtil.a(cursorC, "input");
            roomSQLiteQuery = roomSQLiteQueryA;
            try {
                int iA14 = CursorUtil.a(cursorC, "output");
                int iA15 = CursorUtil.a(cursorC, "initial_delay");
                int iA16 = CursorUtil.a(cursorC, "interval_duration");
                int iA17 = CursorUtil.a(cursorC, "flex_duration");
                int iA18 = CursorUtil.a(cursorC, "run_attempt_count");
                int iA19 = CursorUtil.a(cursorC, "backoff_policy");
                int iA20 = CursorUtil.a(cursorC, "backoff_delay_duration");
                int iA21 = CursorUtil.a(cursorC, "period_start_time");
                int iA22 = CursorUtil.a(cursorC, "minimum_retention_duration");
                int iA23 = CursorUtil.a(cursorC, "schedule_requested_at");
                int iA24 = CursorUtil.a(cursorC, "run_in_foreground");
                int iA25 = CursorUtil.a(cursorC, "out_of_quota_policy");
                if (cursorC.moveToFirst()) {
                    String string = cursorC.getString(iA9);
                    String string2 = cursorC.getString(iA11);
                    Constraints constraints = new Constraints();
                    constraints.f8606a = WorkTypeConverters.c(cursorC.getInt(iA));
                    constraints.f8607b = cursorC.getInt(iA2) != 0;
                    constraints.f8608c = cursorC.getInt(iA3) != 0;
                    constraints.d = cursorC.getInt(iA4) != 0;
                    constraints.f8609e = cursorC.getInt(iA5) != 0;
                    constraints.f = cursorC.getLong(iA6);
                    constraints.g = cursorC.getLong(iA7);
                    constraints.f8610h = WorkTypeConverters.a(cursorC.getBlob(iA8));
                    workSpec = new WorkSpec(string, string2);
                    workSpec.f8777b = WorkTypeConverters.e(cursorC.getInt(iA10));
                    workSpec.d = cursorC.getString(iA12);
                    workSpec.f8779e = Data.a(cursorC.getBlob(iA13));
                    workSpec.f = Data.a(cursorC.getBlob(iA14));
                    workSpec.g = cursorC.getLong(iA15);
                    workSpec.f8780h = cursorC.getLong(iA16);
                    workSpec.f8781i = cursorC.getLong(iA17);
                    workSpec.k = cursorC.getInt(iA18);
                    workSpec.f8782l = WorkTypeConverters.b(cursorC.getInt(iA19));
                    workSpec.m = cursorC.getLong(iA20);
                    workSpec.f8783n = cursorC.getLong(iA21);
                    workSpec.o = cursorC.getLong(iA22);
                    workSpec.f8784p = cursorC.getLong(iA23);
                    workSpec.q = cursorC.getInt(iA24) != 0;
                    workSpec.r = WorkTypeConverters.d(cursorC.getInt(iA25));
                    workSpec.j = constraints;
                } else {
                    workSpec = null;
                }
                cursorC.close();
                roomSQLiteQuery.release();
                return workSpec;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryA;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList j(String str) throws IOException {
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        if (str == null) {
            roomSQLiteQueryA.B0(1);
        } else {
            roomSQLiteQueryA.d0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                arrayList.add(Data.a(cursorC.getBlob(0)));
            }
            cursorC.close();
            roomSQLiteQueryA.release();
            return arrayList;
        } catch (Throwable th) {
            cursorC.close();
            roomSQLiteQueryA.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int k() {
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.f8792i;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        workDatabase_Impl.c();
        try {
            int iE = supportSQLiteStatementA.E();
            workDatabase_Impl.l();
            return iE;
        } finally {
            workDatabase_Impl.f();
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList l() throws IOException {
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        roomSQLiteQueryA.B0(1);
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                arrayList.add(cursorC.getString(0));
            }
            cursorC.close();
            roomSQLiteQueryA.release();
            return arrayList;
        } catch (Throwable th) {
            cursorC.close();
            roomSQLiteQueryA.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList m() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        roomSQLiteQueryA.k0(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            int iA = CursorUtil.a(cursorC, "required_network_type");
            int iA2 = CursorUtil.a(cursorC, "requires_charging");
            int iA3 = CursorUtil.a(cursorC, "requires_device_idle");
            int iA4 = CursorUtil.a(cursorC, "requires_battery_not_low");
            int iA5 = CursorUtil.a(cursorC, "requires_storage_not_low");
            int iA6 = CursorUtil.a(cursorC, "trigger_content_update_delay");
            int iA7 = CursorUtil.a(cursorC, "trigger_max_content_delay");
            int iA8 = CursorUtil.a(cursorC, "content_uri_triggers");
            int iA9 = CursorUtil.a(cursorC, "id");
            int iA10 = CursorUtil.a(cursorC, "state");
            int iA11 = CursorUtil.a(cursorC, "worker_class_name");
            int iA12 = CursorUtil.a(cursorC, "input_merger_class_name");
            int iA13 = CursorUtil.a(cursorC, "input");
            roomSQLiteQuery = roomSQLiteQueryA;
            try {
                int iA14 = CursorUtil.a(cursorC, "output");
                int iA15 = CursorUtil.a(cursorC, "initial_delay");
                int iA16 = CursorUtil.a(cursorC, "interval_duration");
                int iA17 = CursorUtil.a(cursorC, "flex_duration");
                int iA18 = CursorUtil.a(cursorC, "run_attempt_count");
                int iA19 = CursorUtil.a(cursorC, "backoff_policy");
                int iA20 = CursorUtil.a(cursorC, "backoff_delay_duration");
                int iA21 = CursorUtil.a(cursorC, "period_start_time");
                int iA22 = CursorUtil.a(cursorC, "minimum_retention_duration");
                int iA23 = CursorUtil.a(cursorC, "schedule_requested_at");
                int iA24 = CursorUtil.a(cursorC, "run_in_foreground");
                int iA25 = CursorUtil.a(cursorC, "out_of_quota_policy");
                int i2 = iA14;
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    String string = cursorC.getString(iA9);
                    int i3 = iA9;
                    String string2 = cursorC.getString(iA11);
                    int i4 = iA11;
                    Constraints constraints = new Constraints();
                    int i5 = iA;
                    constraints.f8606a = WorkTypeConverters.c(cursorC.getInt(iA));
                    constraints.f8607b = cursorC.getInt(iA2) != 0;
                    constraints.f8608c = cursorC.getInt(iA3) != 0;
                    constraints.d = cursorC.getInt(iA4) != 0;
                    constraints.f8609e = cursorC.getInt(iA5) != 0;
                    int i6 = iA2;
                    int i7 = iA3;
                    constraints.f = cursorC.getLong(iA6);
                    constraints.g = cursorC.getLong(iA7);
                    constraints.f8610h = WorkTypeConverters.a(cursorC.getBlob(iA8));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.f8777b = WorkTypeConverters.e(cursorC.getInt(iA10));
                    workSpec.d = cursorC.getString(iA12);
                    workSpec.f8779e = Data.a(cursorC.getBlob(iA13));
                    int i8 = i2;
                    workSpec.f = Data.a(cursorC.getBlob(i8));
                    int i9 = iA12;
                    int i10 = iA15;
                    workSpec.g = cursorC.getLong(i10);
                    i2 = i8;
                    int i11 = iA16;
                    workSpec.f8780h = cursorC.getLong(i11);
                    int i12 = iA4;
                    int i13 = iA17;
                    workSpec.f8781i = cursorC.getLong(i13);
                    int i14 = iA18;
                    workSpec.k = cursorC.getInt(i14);
                    int i15 = iA19;
                    workSpec.f8782l = WorkTypeConverters.b(cursorC.getInt(i15));
                    iA17 = i13;
                    int i16 = iA20;
                    workSpec.m = cursorC.getLong(i16);
                    int i17 = iA21;
                    workSpec.f8783n = cursorC.getLong(i17);
                    iA21 = i17;
                    int i18 = iA22;
                    workSpec.o = cursorC.getLong(i18);
                    int i19 = iA23;
                    workSpec.f8784p = cursorC.getLong(i19);
                    int i20 = iA24;
                    workSpec.q = cursorC.getInt(i20) != 0;
                    int i21 = iA25;
                    workSpec.r = WorkTypeConverters.d(cursorC.getInt(i21));
                    workSpec.j = constraints;
                    arrayList.add(workSpec);
                    iA20 = i16;
                    iA4 = i12;
                    iA19 = i15;
                    iA25 = i21;
                    iA2 = i6;
                    iA15 = i10;
                    iA16 = i11;
                    iA18 = i14;
                    iA23 = i19;
                    iA11 = i4;
                    iA = i5;
                    iA24 = i20;
                    iA22 = i18;
                    iA12 = i9;
                    iA9 = i3;
                    iA3 = i7;
                }
                cursorC.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryA;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList n() throws IOException {
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        roomSQLiteQueryA.d0(1, "offline_ping_sender_work");
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                arrayList.add(cursorC.getString(0));
            }
            cursorC.close();
            roomSQLiteQueryA.release();
            return arrayList;
        } catch (Throwable th) {
            cursorC.close();
            roomSQLiteQueryA.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList o(int i2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        roomSQLiteQueryA.k0(1, i2);
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            int iA = CursorUtil.a(cursorC, "required_network_type");
            int iA2 = CursorUtil.a(cursorC, "requires_charging");
            int iA3 = CursorUtil.a(cursorC, "requires_device_idle");
            int iA4 = CursorUtil.a(cursorC, "requires_battery_not_low");
            int iA5 = CursorUtil.a(cursorC, "requires_storage_not_low");
            int iA6 = CursorUtil.a(cursorC, "trigger_content_update_delay");
            int iA7 = CursorUtil.a(cursorC, "trigger_max_content_delay");
            int iA8 = CursorUtil.a(cursorC, "content_uri_triggers");
            int iA9 = CursorUtil.a(cursorC, "id");
            int iA10 = CursorUtil.a(cursorC, "state");
            int iA11 = CursorUtil.a(cursorC, "worker_class_name");
            int iA12 = CursorUtil.a(cursorC, "input_merger_class_name");
            int iA13 = CursorUtil.a(cursorC, "input");
            roomSQLiteQuery = roomSQLiteQueryA;
            try {
                int iA14 = CursorUtil.a(cursorC, "output");
                int iA15 = CursorUtil.a(cursorC, "initial_delay");
                int iA16 = CursorUtil.a(cursorC, "interval_duration");
                int iA17 = CursorUtil.a(cursorC, "flex_duration");
                int iA18 = CursorUtil.a(cursorC, "run_attempt_count");
                int iA19 = CursorUtil.a(cursorC, "backoff_policy");
                int iA20 = CursorUtil.a(cursorC, "backoff_delay_duration");
                int iA21 = CursorUtil.a(cursorC, "period_start_time");
                int iA22 = CursorUtil.a(cursorC, "minimum_retention_duration");
                int iA23 = CursorUtil.a(cursorC, "schedule_requested_at");
                int iA24 = CursorUtil.a(cursorC, "run_in_foreground");
                int iA25 = CursorUtil.a(cursorC, "out_of_quota_policy");
                int i3 = iA14;
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    String string = cursorC.getString(iA9);
                    int i4 = iA9;
                    String string2 = cursorC.getString(iA11);
                    int i5 = iA11;
                    Constraints constraints = new Constraints();
                    int i6 = iA;
                    constraints.f8606a = WorkTypeConverters.c(cursorC.getInt(iA));
                    constraints.f8607b = cursorC.getInt(iA2) != 0;
                    constraints.f8608c = cursorC.getInt(iA3) != 0;
                    constraints.d = cursorC.getInt(iA4) != 0;
                    constraints.f8609e = cursorC.getInt(iA5) != 0;
                    int i7 = iA2;
                    int i8 = iA3;
                    constraints.f = cursorC.getLong(iA6);
                    constraints.g = cursorC.getLong(iA7);
                    constraints.f8610h = WorkTypeConverters.a(cursorC.getBlob(iA8));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.f8777b = WorkTypeConverters.e(cursorC.getInt(iA10));
                    workSpec.d = cursorC.getString(iA12);
                    workSpec.f8779e = Data.a(cursorC.getBlob(iA13));
                    int i9 = i3;
                    workSpec.f = Data.a(cursorC.getBlob(i9));
                    int i10 = iA12;
                    int i11 = iA15;
                    workSpec.g = cursorC.getLong(i11);
                    i3 = i9;
                    int i12 = iA16;
                    workSpec.f8780h = cursorC.getLong(i12);
                    int i13 = iA4;
                    int i14 = iA17;
                    workSpec.f8781i = cursorC.getLong(i14);
                    int i15 = iA18;
                    workSpec.k = cursorC.getInt(i15);
                    int i16 = iA19;
                    workSpec.f8782l = WorkTypeConverters.b(cursorC.getInt(i16));
                    iA17 = i14;
                    int i17 = iA20;
                    workSpec.m = cursorC.getLong(i17);
                    int i18 = iA21;
                    workSpec.f8783n = cursorC.getLong(i18);
                    iA21 = i18;
                    int i19 = iA22;
                    workSpec.o = cursorC.getLong(i19);
                    int i20 = iA23;
                    workSpec.f8784p = cursorC.getLong(i20);
                    int i21 = iA24;
                    workSpec.q = cursorC.getInt(i21) != 0;
                    int i22 = iA25;
                    workSpec.r = WorkTypeConverters.d(cursorC.getInt(i22));
                    workSpec.j = constraints;
                    arrayList.add(workSpec);
                    iA20 = i17;
                    iA4 = i13;
                    iA19 = i16;
                    iA25 = i22;
                    iA2 = i7;
                    iA15 = i11;
                    iA16 = i12;
                    iA18 = i15;
                    iA23 = i20;
                    iA11 = i5;
                    iA = i6;
                    iA24 = i21;
                    iA22 = i19;
                    iA12 = i10;
                    iA9 = i4;
                    iA3 = i8;
                }
                cursorC.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryA;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList p() throws IOException {
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        roomSQLiteQueryA.B0(1);
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            int iA = CursorUtil.a(cursorC, "id");
            int iA2 = CursorUtil.a(cursorC, "state");
            ArrayList arrayList = new ArrayList(cursorC.getCount());
            while (cursorC.moveToNext()) {
                WorkSpec.IdAndState idAndState = new WorkSpec.IdAndState();
                idAndState.f8785a = cursorC.getString(iA);
                idAndState.f8786b = WorkTypeConverters.e(cursorC.getInt(iA2));
                arrayList.add(idAndState);
            }
            cursorC.close();
            roomSQLiteQueryA.release();
            return arrayList;
        } catch (Throwable th) {
            cursorC.close();
            roomSQLiteQueryA.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void q(String str, Data data) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.d;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        byte[] bArrC = Data.c(data);
        if (bArrC == null) {
            supportSQLiteStatementA.B0(1);
        } else {
            supportSQLiteStatementA.r0(1, bArrC);
        }
        if (str == null) {
            supportSQLiteStatementA.B0(2);
        } else {
            supportSQLiteStatementA.d0(2, str);
        }
        workDatabase_Impl.c();
        try {
            supportSQLiteStatementA.E();
            workDatabase_Impl.l();
        } finally {
            workDatabase_Impl.f();
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final ArrayList r() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            int iA = CursorUtil.a(cursorC, "required_network_type");
            int iA2 = CursorUtil.a(cursorC, "requires_charging");
            int iA3 = CursorUtil.a(cursorC, "requires_device_idle");
            int iA4 = CursorUtil.a(cursorC, "requires_battery_not_low");
            int iA5 = CursorUtil.a(cursorC, "requires_storage_not_low");
            int iA6 = CursorUtil.a(cursorC, "trigger_content_update_delay");
            int iA7 = CursorUtil.a(cursorC, "trigger_max_content_delay");
            int iA8 = CursorUtil.a(cursorC, "content_uri_triggers");
            int iA9 = CursorUtil.a(cursorC, "id");
            int iA10 = CursorUtil.a(cursorC, "state");
            int iA11 = CursorUtil.a(cursorC, "worker_class_name");
            int iA12 = CursorUtil.a(cursorC, "input_merger_class_name");
            int iA13 = CursorUtil.a(cursorC, "input");
            roomSQLiteQuery = roomSQLiteQueryA;
            try {
                int iA14 = CursorUtil.a(cursorC, "output");
                int iA15 = CursorUtil.a(cursorC, "initial_delay");
                int iA16 = CursorUtil.a(cursorC, "interval_duration");
                int iA17 = CursorUtil.a(cursorC, "flex_duration");
                int iA18 = CursorUtil.a(cursorC, "run_attempt_count");
                int iA19 = CursorUtil.a(cursorC, "backoff_policy");
                int iA20 = CursorUtil.a(cursorC, "backoff_delay_duration");
                int iA21 = CursorUtil.a(cursorC, "period_start_time");
                int iA22 = CursorUtil.a(cursorC, "minimum_retention_duration");
                int iA23 = CursorUtil.a(cursorC, "schedule_requested_at");
                int iA24 = CursorUtil.a(cursorC, "run_in_foreground");
                int iA25 = CursorUtil.a(cursorC, "out_of_quota_policy");
                int i2 = iA14;
                ArrayList arrayList = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    String string = cursorC.getString(iA9);
                    int i3 = iA9;
                    String string2 = cursorC.getString(iA11);
                    int i4 = iA11;
                    Constraints constraints = new Constraints();
                    int i5 = iA;
                    constraints.f8606a = WorkTypeConverters.c(cursorC.getInt(iA));
                    constraints.f8607b = cursorC.getInt(iA2) != 0;
                    constraints.f8608c = cursorC.getInt(iA3) != 0;
                    constraints.d = cursorC.getInt(iA4) != 0;
                    constraints.f8609e = cursorC.getInt(iA5) != 0;
                    int i6 = iA2;
                    int i7 = iA3;
                    constraints.f = cursorC.getLong(iA6);
                    constraints.g = cursorC.getLong(iA7);
                    constraints.f8610h = WorkTypeConverters.a(cursorC.getBlob(iA8));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.f8777b = WorkTypeConverters.e(cursorC.getInt(iA10));
                    workSpec.d = cursorC.getString(iA12);
                    workSpec.f8779e = Data.a(cursorC.getBlob(iA13));
                    int i8 = i2;
                    workSpec.f = Data.a(cursorC.getBlob(i8));
                    int i9 = iA13;
                    int i10 = iA15;
                    workSpec.g = cursorC.getLong(i10);
                    i2 = i8;
                    int i11 = iA16;
                    workSpec.f8780h = cursorC.getLong(i11);
                    int i12 = iA4;
                    int i13 = iA17;
                    workSpec.f8781i = cursorC.getLong(i13);
                    int i14 = iA18;
                    workSpec.k = cursorC.getInt(i14);
                    int i15 = iA19;
                    workSpec.f8782l = WorkTypeConverters.b(cursorC.getInt(i15));
                    iA17 = i13;
                    int i16 = iA20;
                    workSpec.m = cursorC.getLong(i16);
                    int i17 = iA21;
                    workSpec.f8783n = cursorC.getLong(i17);
                    iA21 = i17;
                    int i18 = iA22;
                    workSpec.o = cursorC.getLong(i18);
                    int i19 = iA23;
                    workSpec.f8784p = cursorC.getLong(i19);
                    int i20 = iA24;
                    workSpec.q = cursorC.getInt(i20) != 0;
                    int i21 = iA25;
                    workSpec.r = WorkTypeConverters.d(cursorC.getInt(i21));
                    workSpec.j = constraints;
                    arrayList.add(workSpec);
                    iA20 = i16;
                    iA4 = i12;
                    iA19 = i15;
                    iA25 = i21;
                    iA2 = i6;
                    iA15 = i10;
                    iA16 = i11;
                    iA18 = i14;
                    iA23 = i19;
                    iA11 = i4;
                    iA = i5;
                    iA24 = i20;
                    iA22 = i18;
                    iA13 = i9;
                    iA9 = i3;
                    iA3 = i7;
                }
                cursorC.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorC.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryA;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final boolean s() throws IOException {
        boolean z2 = false;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            if (cursorC.moveToFirst() && cursorC.getInt(0) != 0) {
                z2 = true;
            }
            return z2;
        } finally {
            cursorC.close();
            roomSQLiteQueryA.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int t(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.g;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        if (str == null) {
            supportSQLiteStatementA.B0(1);
        } else {
            supportSQLiteStatementA.d0(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iE = supportSQLiteStatementA.E();
            workDatabase_Impl.l();
            return iE;
        } finally {
            workDatabase_Impl.f();
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int u(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f8787a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.f;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        if (str == null) {
            supportSQLiteStatementA.B0(1);
        } else {
            supportSQLiteStatementA.d0(1, str);
        }
        workDatabase_Impl.c();
        try {
            int iE = supportSQLiteStatementA.E();
            workDatabase_Impl.l();
            return iE;
        } finally {
            workDatabase_Impl.f();
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }
}
