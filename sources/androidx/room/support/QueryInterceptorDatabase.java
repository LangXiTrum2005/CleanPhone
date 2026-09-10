package androidx.room.support;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/support/QueryInterceptorDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {
    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final List A() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void B() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void C(String sql) {
        Intrinsics.f(sql, "sql");
        new QueryInterceptorDatabase$execSQL$1(this, sql, null);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean D() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean K0() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long L() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean M() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void N() {
        new QueryInterceptorDatabase$setTransactionSuccessful$1(this, null);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void O() {
        new QueryInterceptorDatabase$beginTransactionNonExclusive$1(this, null);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean Q() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void R() {
        new QueryInterceptorDatabase$endTransaction$1(this, null);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor V(SupportSQLiteQuery supportSQLiteQuery) {
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        supportSQLiteQuery.h(queryInterceptorProgram);
        new QueryInterceptorDatabase$query$3(this, supportSQLiteQuery, queryInterceptorProgram, null);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement f0(String sql) {
        Intrinsics.f(sql, "sql");
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int getVersion() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void h0() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean i0() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void m0(Object[] objArr) {
        new QueryInterceptorDatabase$execSQL$2(this, ArraysKt.M(objArr), null);
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long p0() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final String u() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean v() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean v0() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void x() {
        new QueryInterceptorDatabase$beginTransaction$1(this, null);
        throw null;
    }
}
