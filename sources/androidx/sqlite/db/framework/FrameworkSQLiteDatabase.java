package androidx.sqlite.db.framework;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import androidx.room.e;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Api30Impl", "Companion", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String[] f8372Y = new String[0];
    public static final Object Z;
    public static final Object e0;
    public final SQLiteDatabase X;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Api30Impl;", "", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Api30Impl {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Companion;", "", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f43248Y;
        Z = LazyKt.a(lazyThreadSafetyMode, new e(1));
        e0 = LazyKt.a(lazyThreadSafetyMode, new e(2));
    }

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        this.X = sQLiteDatabase;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final List A() {
        return this.X.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void B() {
        this.X.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void C(String sql) {
        Intrinsics.f(sql, "sql");
        this.X.execSQL(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean D() {
        return this.X.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean K0() {
        return this.X.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long L() {
        return this.X.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean M() {
        return this.X.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void N() {
        this.X.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void O() {
        this.X.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean Q() {
        return this.X.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void R() {
        this.X.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor V(SupportSQLiteQuery supportSQLiteQuery) {
        final a aVar = new a(supportSQLiteQuery);
        Cursor cursorRawQueryWithFactory = this.X.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                String[] strArr = FrameworkSQLiteDatabase.f8372Y;
                return (Cursor) aVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, supportSQLiteQuery.getX(), f8372Y, null);
        Intrinsics.e(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement f0(String sql) {
        Intrinsics.f(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.X.compileStatement(sql);
        Intrinsics.e(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new FrameworkSQLiteStatement(sQLiteStatementCompileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int getVersion() {
        return this.X.getVersion();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void h0() throws IllegalAccessException, InvocationTargetException {
        ?? r0 = e0;
        if (((Method) r0.getX()) != null) {
            ?? r1 = Z;
            if (((Method) r1.getX()) != null) {
                Method method = (Method) r0.getX();
                Intrinsics.c(method);
                Method method2 = (Method) r1.getX();
                Intrinsics.c(method2);
                Object objInvoke = method2.invoke(this.X, new Object[0]);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        x();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean i0() {
        return this.X.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.X.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void m0(Object[] objArr) {
        this.X.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long p0() {
        return this.X.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final String u() {
        return this.X.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean v() {
        return this.X.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean v0() {
        return this.X.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void x() {
        this.X.beginTransaction();
    }
}
