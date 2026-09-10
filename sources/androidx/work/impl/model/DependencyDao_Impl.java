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
public final class DependencyDao_Impl implements DependencyDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f8757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f8758b;

    /* JADX INFO: renamed from: androidx.work.impl.model.DependencyDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<Dependency> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            Dependency dependency = (Dependency) obj;
            String str = dependency.f8755a;
            if (str == null) {
                supportSQLiteStatement.B0(1);
            } else {
                supportSQLiteStatement.d0(1, str);
            }
            String str2 = dependency.f8756b;
            if (str2 == null) {
                supportSQLiteStatement.B0(2);
            } else {
                supportSQLiteStatement.d0(2, str2);
            }
        }
    }

    public DependencyDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f8757a = workDatabase_Impl;
        this.f8758b = new AnonymousClass1(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final void a(Dependency dependency) {
        WorkDatabase_Impl workDatabase_Impl = this.f8757a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f8758b.e(dependency);
            workDatabase_Impl.l();
        } finally {
            workDatabase_Impl.f();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public final ArrayList b(String str) throws IOException {
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            roomSQLiteQueryA.B0(1);
        } else {
            roomSQLiteQueryA.d0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f8757a;
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

    @Override // androidx.work.impl.model.DependencyDao
    public final boolean c(String str) throws IOException {
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            roomSQLiteQueryA.B0(1);
        } else {
            roomSQLiteQueryA.d0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f8757a;
        workDatabase_Impl.b();
        boolean z2 = false;
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            if (cursorC.moveToFirst()) {
                z2 = cursorC.getInt(0) != 0;
            }
            return z2;
        } finally {
            cursorC.close();
            roomSQLiteQueryA.release();
        }
    }
}
