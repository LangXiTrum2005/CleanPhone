package androidx.sqlite.driver;

import android.database.Cursor;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "Companion", "TransactionSQLiteStatement", "JournalModeSetStatement", "RowSQLiteStatement", "OtherSQLiteStatement", "Landroidx/sqlite/driver/SupportSQLiteStatement$JournalModeSetStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement$OtherSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement$RowSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement$TransactionSQLiteStatement;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SupportSQLiteStatement implements SQLiteStatement {
    public final SupportSQLiteDatabase X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f8383Y;
    public boolean Z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$Companion;", "", "TransactionOperation", "SpecialOperation", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$SpecialOperation;", "", "JournalModeOperation", "Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$SpecialOperation$JournalModeOperation;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class SpecialOperation {

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$SpecialOperation$JournalModeOperation;", "Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$SpecialOperation;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class JournalModeOperation extends SpecialOperation {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final JournalModeOperation f8384a = new JournalModeOperation();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$TransactionOperation;", "", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TransactionOperation {
            public static final TransactionOperation X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public static final TransactionOperation f8385Y;
            public static final TransactionOperation Z;
            public static final TransactionOperation e0;
            public static final TransactionOperation f0;
            public static final /* synthetic */ TransactionOperation[] g0;
            public static final /* synthetic */ EnumEntries h0;

            static {
                TransactionOperation transactionOperation = new TransactionOperation("END", 0);
                X = transactionOperation;
                TransactionOperation transactionOperation2 = new TransactionOperation("ROLLBACK", 1);
                f8385Y = transactionOperation2;
                TransactionOperation transactionOperation3 = new TransactionOperation("BEGIN_EXCLUSIVE", 2);
                Z = transactionOperation3;
                TransactionOperation transactionOperation4 = new TransactionOperation("BEGIN_IMMEDIATE", 3);
                e0 = transactionOperation4;
                TransactionOperation transactionOperation5 = new TransactionOperation("BEGIN_DEFERRED", 4);
                f0 = transactionOperation5;
                TransactionOperation[] transactionOperationArr = {transactionOperation, transactionOperation2, transactionOperation3, transactionOperation4, transactionOperation5};
                g0 = transactionOperationArr;
                h0 = EnumEntriesKt.a(transactionOperationArr);
            }

            public static TransactionOperation valueOf(String str) {
                return (TransactionOperation) Enum.valueOf(TransactionOperation.class, str);
            }

            public static TransactionOperation[] values() {
                return (TransactionOperation[]) g0.clone();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$JournalModeSetStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JournalModeSetStatement extends SupportSQLiteStatement implements SQLiteStatement {
        public final SupportSQLiteStatement e0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JournalModeSetStatement(SupportSQLiteDatabase db, String sql, SupportSQLiteStatement supportSQLiteStatement) {
            super(db, sql);
            Intrinsics.f(db, "db");
            Intrinsics.f(sql, "sql");
            this.e0 = supportSQLiteStatement;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean P0() {
            RowSQLiteStatement rowSQLiteStatement = (RowSQLiteStatement) this.e0;
            boolean zP0 = rowSQLiteStatement.P0();
            boolean zR = StringsKt.r(rowSQLiteStatement.y0(0), "wal", true);
            SupportSQLiteDatabase supportSQLiteDatabase = this.X;
            if (zR) {
                supportSQLiteDatabase.M();
                return zP0;
            }
            supportSQLiteDatabase.B();
            return zP0;
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws Exception {
            this.e0.close();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final int getColumnCount() {
            return this.e0.getColumnCount();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String getColumnName(int i2) {
            return this.e0.getColumnName(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final List getColumnNames() {
            return this.e0.getColumnNames();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final double getDouble(int i2) {
            return this.e0.getDouble(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final float getFloat(int i2) {
            return (float) ((RowSQLiteStatement) this.e0).getDouble(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final int getInt(int i2) {
            return this.e0.getInt(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final long getLong(int i2) {
            return this.e0.getLong(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean isNull(int i2) {
            return this.e0.isNull(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean l0() {
            return this.e0.l0();
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public final void reset() {
            this.e0.reset();
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public final void w() {
            this.e0.w();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String y0(int i2) {
            return this.e0.y0(i2);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$OtherSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OtherSQLiteStatement extends SupportSQLiteStatement {
        public final androidx.sqlite.db.SupportSQLiteStatement e0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherSQLiteStatement(SupportSQLiteDatabase db, String sql) {
            super(db, sql);
            Intrinsics.f(db, "db");
            Intrinsics.f(sql, "sql");
            this.e0 = db.f0(sql);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean P0() {
            d();
            this.e0.execute();
            return false;
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws IOException {
            this.e0.close();
            this.Z = true;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final int getColumnCount() {
            d();
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String getColumnName(int i2) {
            d();
            SQLite.b(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final double getDouble(int i2) {
            d();
            SQLite.b(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final long getLong(int i2) {
            d();
            SQLite.b(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean isNull(int i2) {
            d();
            SQLite.b(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public final void w() {
            d();
            this.e0.w();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String y0(int i2) {
            d();
            SQLite.b(21, "no row");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$RowSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "Companion", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RowSQLiteStatement extends SupportSQLiteStatement {
        public int[] e0;
        public long[] f0;
        public double[] g0;
        public String[] h0;
        public byte[][] i0;
        public Cursor j0;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$RowSQLiteStatement$Companion;", "", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RowSQLiteStatement(SupportSQLiteDatabase db, String sql) {
            super(db, sql);
            Intrinsics.f(db, "db");
            Intrinsics.f(sql, "sql");
            this.e0 = new int[0];
            this.f0 = new long[0];
            this.g0 = new double[0];
            this.h0 = new String[0];
            this.i0 = new byte[0][];
        }

        public static void i(Cursor cursor, int i2) {
            if (i2 < 0 || i2 >= cursor.getColumnCount()) {
                SQLite.b(25, "column index out of range");
                throw null;
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean P0() {
            d();
            h();
            Cursor cursor = this.j0;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (!this.Z) {
                w();
                reset();
            }
            this.Z = true;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final int getColumnCount() {
            d();
            h();
            Cursor cursor = this.j0;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String getColumnName(int i2) {
            d();
            h();
            Cursor cursor = this.j0;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            i(cursor, i2);
            String columnName = cursor.getColumnName(i2);
            Intrinsics.e(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final double getDouble(int i2) {
            d();
            Cursor cursorK = k();
            i(cursorK, i2);
            return cursorK.getDouble(i2);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final long getLong(int i2) {
            d();
            Cursor cursorK = k();
            i(cursorK, i2);
            return cursorK.getLong(i2);
        }

        public final void h() {
            if (this.j0 == null) {
                this.j0 = this.X.V(new SupportSQLiteQuery() { // from class: androidx.sqlite.driver.SupportSQLiteStatement$RowSQLiteStatement$ensureCursor$1
                    @Override // androidx.sqlite.db.SupportSQLiteQuery
                    /* JADX INFO: renamed from: d */
                    public final String getX() {
                        return this.X.f8383Y;
                    }

                    @Override // androidx.sqlite.db.SupportSQLiteQuery
                    public final void h(SupportSQLiteProgram supportSQLiteProgram) {
                        SupportSQLiteStatement.RowSQLiteStatement rowSQLiteStatement = this.X;
                        int length = rowSQLiteStatement.e0.length;
                        for (int i2 = 1; i2 < length; i2++) {
                            int i3 = rowSQLiteStatement.e0[i2];
                            if (i3 == 1) {
                                supportSQLiteProgram.k0(i2, rowSQLiteStatement.f0[i2]);
                            } else if (i3 == 2) {
                                supportSQLiteProgram.c(i2, rowSQLiteStatement.g0[i2]);
                            } else if (i3 == 3) {
                                String str = rowSQLiteStatement.h0[i2];
                                Intrinsics.c(str);
                                supportSQLiteProgram.d0(i2, str);
                            } else if (i3 == 4) {
                                byte[] bArr = rowSQLiteStatement.i0[i2];
                                Intrinsics.c(bArr);
                                supportSQLiteProgram.r0(i2, bArr);
                            } else if (i3 == 5) {
                                supportSQLiteProgram.B0(i2);
                            }
                        }
                    }
                });
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean isNull(int i2) {
            d();
            Cursor cursorK = k();
            i(cursorK, i2);
            return cursorK.isNull(i2);
        }

        public final Cursor k() {
            Cursor cursor = this.j0;
            if (cursor != null) {
                return cursor;
            }
            SQLite.b(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public final void reset() {
            d();
            Cursor cursor = this.j0;
            if (cursor != null) {
                cursor.close();
            }
            this.j0 = null;
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public final void w() {
            d();
            this.e0 = new int[0];
            this.f0 = new long[0];
            this.g0 = new double[0];
            this.h0 = new String[0];
            this.i0 = new byte[0][];
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String y0(int i2) {
            d();
            Cursor cursorK = k();
            i(cursorK, i2);
            String string = cursorK.getString(i2);
            Intrinsics.e(string, "getString(...)");
            return string;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$TransactionSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TransactionSQLiteStatement extends SupportSQLiteStatement {
        public final Companion.TransactionOperation e0;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Companion.TransactionOperation.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Companion.TransactionOperation transactionOperation = Companion.TransactionOperation.X;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    Companion.TransactionOperation transactionOperation2 = Companion.TransactionOperation.X;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    Companion.TransactionOperation transactionOperation3 = Companion.TransactionOperation.X;
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    Companion.TransactionOperation transactionOperation4 = Companion.TransactionOperation.X;
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionSQLiteStatement(SupportSQLiteDatabase db, String sql, Companion.TransactionOperation transactionOperation) {
            super(db, sql);
            Intrinsics.f(db, "db");
            Intrinsics.f(sql, "sql");
            this.e0 = transactionOperation;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean P0() {
            int iOrdinal = this.e0.ordinal();
            SupportSQLiteDatabase supportSQLiteDatabase = this.X;
            if (iOrdinal == 0) {
                supportSQLiteDatabase.N();
                supportSQLiteDatabase.R();
                return false;
            }
            if (iOrdinal == 1) {
                supportSQLiteDatabase.R();
                return false;
            }
            if (iOrdinal == 2) {
                supportSQLiteDatabase.x();
                return false;
            }
            if (iOrdinal == 3) {
                supportSQLiteDatabase.O();
                return false;
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            supportSQLiteDatabase.h0();
            return false;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.Z = true;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final int getColumnCount() {
            d();
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String getColumnName(int i2) {
            d();
            SQLite.b(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final double getDouble(int i2) {
            d();
            SQLite.b(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final long getLong(int i2) {
            d();
            SQLite.b(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean isNull(int i2) {
            d();
            SQLite.b(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String y0(int i2) {
            d();
            SQLite.b(21, "no row");
            throw null;
        }
    }

    public SupportSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        this.X = supportSQLiteDatabase;
        this.f8383Y = str;
    }

    public final void d() {
        if (this.Z) {
            SQLite.b(21, "statement is closed");
            throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        d();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void w() {
        d();
    }
}
