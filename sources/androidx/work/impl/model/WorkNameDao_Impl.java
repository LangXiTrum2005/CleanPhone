package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class WorkNameDao_Impl implements WorkNameDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f8769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f8770b;

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkNameDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<WorkName> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            WorkName workName = (WorkName) obj;
            workName.getClass();
            supportSQLiteStatement.B0(1);
            String str = workName.f8768a;
            if (str == null) {
                supportSQLiteStatement.B0(2);
            } else {
                supportSQLiteStatement.d0(2, str);
            }
        }
    }

    public WorkNameDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f8769a = workDatabase_Impl;
        this.f8770b = new AnonymousClass1(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public final void a(WorkName workName) {
        WorkDatabase_Impl workDatabase_Impl = this.f8769a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f8770b.e(workName);
            workDatabase_Impl.l();
        } finally {
            workDatabase_Impl.f();
        }
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public final ArrayList b(String str) throws IOException {
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
        if (str == null) {
            roomSQLiteQueryA.B0(1);
        } else {
            roomSQLiteQueryA.d0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f8769a;
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
}
