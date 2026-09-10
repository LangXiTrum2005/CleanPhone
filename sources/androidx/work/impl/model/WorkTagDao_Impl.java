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
public final class WorkTagDao_Impl implements WorkTagDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f8795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f8796b;

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkTagDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<WorkTag> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            WorkTag workTag = (WorkTag) obj;
            String str = workTag.f8793a;
            if (str == null) {
                supportSQLiteStatement.B0(1);
            } else {
                supportSQLiteStatement.d0(1, str);
            }
            String str2 = workTag.f8794b;
            if (str2 == null) {
                supportSQLiteStatement.B0(2);
            } else {
                supportSQLiteStatement.d0(2, str2);
            }
        }
    }

    public WorkTagDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f8795a = workDatabase_Impl;
        this.f8796b = new AnonymousClass1(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public final ArrayList a(String str) throws IOException {
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            roomSQLiteQueryA.B0(1);
        } else {
            roomSQLiteQueryA.d0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f8795a;
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

    @Override // androidx.work.impl.model.WorkTagDao
    public final void b(WorkTag workTag) {
        WorkDatabase_Impl workDatabase_Impl = this.f8795a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f8796b.e(workTag);
            workDatabase_Impl.l();
        } finally {
            workDatabase_Impl.f();
        }
    }
}
