package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDao_Impl implements PreferenceDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f8761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f8762b;

    /* JADX INFO: renamed from: androidx.work.impl.model.PreferenceDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<Preference> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
            Preference preference = (Preference) obj;
            String str = preference.f8759a;
            if (str == null) {
                supportSQLiteStatement.B0(1);
            } else {
                supportSQLiteStatement.d0(1, str);
            }
            Long l2 = preference.f8760b;
            if (l2 == null) {
                supportSQLiteStatement.B0(2);
            } else {
                supportSQLiteStatement.k0(2, l2.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.PreferenceDao_Impl$2, reason: invalid class name */
    class AnonymousClass2 implements Callable<Long> {
        @Override // java.util.concurrent.Callable
        public final Long call() {
            throw null;
        }

        public final void finalize() {
            throw null;
        }
    }

    public PreferenceDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f8761a = workDatabase_Impl;
        this.f8762b = new AnonymousClass1(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public final void a(Preference preference) {
        WorkDatabase_Impl workDatabase_Impl = this.f8761a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f8762b.e(preference);
            workDatabase_Impl.l();
        } finally {
            workDatabase_Impl.f();
        }
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public final Long b(String str) throws IOException {
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.a(1, "SELECT long_value FROM Preference where `key`=?");
        roomSQLiteQueryA.d0(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f8761a;
        workDatabase_Impl.b();
        Cursor cursorC = DBUtil.c(workDatabase_Impl, roomSQLiteQueryA, false);
        try {
            Long lValueOf = null;
            if (cursorC.moveToFirst() && !cursorC.isNull(0)) {
                lValueOf = Long.valueOf(cursorC.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorC.close();
            roomSQLiteQueryA.release();
        }
    }
}
