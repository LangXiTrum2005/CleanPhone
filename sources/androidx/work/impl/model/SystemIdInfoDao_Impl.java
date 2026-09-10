package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class SystemIdInfoDao_Impl implements SystemIdInfoDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f8765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f8766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedSQLiteStatement f8767c;

    /* JADX INFO: renamed from: androidx.work.impl.model.SystemIdInfoDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<SystemIdInfo> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
            String str = systemIdInfo.f8763a;
            if (str == null) {
                supportSQLiteStatement.B0(1);
            } else {
                supportSQLiteStatement.d0(1, str);
            }
            supportSQLiteStatement.k0(2, systemIdInfo.f8764b);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.SystemIdInfoDao_Impl$2, reason: invalid class name */
    class AnonymousClass2 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public SystemIdInfoDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f8765a = workDatabase_Impl;
        this.f8766b = new AnonymousClass1(workDatabase_Impl);
        this.f8767c = new AnonymousClass2(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final SystemIdInfo a(String str) throws IOException {
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            roomSQLiteQueryA.B0(1);
        } else {
            roomSQLiteQueryA.d0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f8765a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            return cursorC.moveToFirst() ? new SystemIdInfo(cursorC.getString(CursorUtil.a(cursorC, "work_spec_id")), cursorC.getInt(CursorUtil.a(cursorC, "system_id"))) : null;
        } finally {
            cursorC.close();
            roomSQLiteQueryA.release();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final ArrayList b() throws IOException {
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = this.f8765a;
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

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final void c(SystemIdInfo systemIdInfo) {
        WorkDatabase_Impl workDatabase_Impl = this.f8765a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f8766b.e(systemIdInfo);
            workDatabase_Impl.l();
        } finally {
            workDatabase_Impl.f();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public final void d(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f8765a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.f8767c;
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
}
