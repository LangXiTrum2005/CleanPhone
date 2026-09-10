package androidx.work.impl.model;

import androidx.room.EntityInsertionAdapter;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Data;
import androidx.work.impl.WorkDatabase_Impl;

/* JADX INFO: loaded from: classes.dex */
public final class WorkProgressDao_Impl implements WorkProgressDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f8773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter f8774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedSQLiteStatement f8775c;
    public final SharedSQLiteStatement d;

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkProgressDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 extends EntityInsertionAdapter<WorkProgress> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) throws Throwable {
            WorkProgress workProgress = (WorkProgress) obj;
            String str = workProgress.f8771a;
            if (str == null) {
                supportSQLiteStatement.B0(1);
            } else {
                supportSQLiteStatement.d0(1, str);
            }
            byte[] bArrC = Data.c(workProgress.f8772b);
            if (bArrC == null) {
                supportSQLiteStatement.B0(2);
            } else {
                supportSQLiteStatement.r0(2, bArrC);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkProgressDao_Impl$2, reason: invalid class name */
    class AnonymousClass2 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkProgressDao_Impl$3, reason: invalid class name */
    class AnonymousClass3 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public WorkProgressDao_Impl(WorkDatabase_Impl workDatabase_Impl) {
        this.f8773a = workDatabase_Impl;
        this.f8774b = new AnonymousClass1(workDatabase_Impl);
        this.f8775c = new AnonymousClass2(workDatabase_Impl);
        this.d = new AnonymousClass3(workDatabase_Impl);
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f8773a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.f8775c;
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

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void b() {
        WorkDatabase_Impl workDatabase_Impl = this.f8773a;
        workDatabase_Impl.b();
        SharedSQLiteStatement sharedSQLiteStatement = this.d;
        SupportSQLiteStatement supportSQLiteStatementA = sharedSQLiteStatement.a();
        workDatabase_Impl.c();
        try {
            supportSQLiteStatementA.E();
            workDatabase_Impl.l();
        } finally {
            workDatabase_Impl.f();
            sharedSQLiteStatement.c(supportSQLiteStatementA);
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public final void c(WorkProgress workProgress) {
        WorkDatabase_Impl workDatabase_Impl = this.f8773a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f8774b.e(workProgress);
            workDatabase_Impl.l();
        } finally {
            workDatabase_Impl.f();
        }
    }
}
