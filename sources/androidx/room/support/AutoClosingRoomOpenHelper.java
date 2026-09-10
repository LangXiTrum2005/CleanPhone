package androidx.room.support;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import androidx.room.DelegatingOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "AutoClosingSupportSQLiteDatabase", "KeepAliveCursor", "AutoClosingSupportSQLiteStatement", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {
        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final List A() {
            AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1 = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1.X;
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void B() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void C(String sql) {
            Intrinsics.f(sql, "sql");
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean D() {
            AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1 = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1.X;
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean K0() {
            AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1 = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1.X;
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final long L() {
            AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1 = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1.X;
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean M() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void N() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void O() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean Q() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void R() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final Cursor V(SupportSQLiteQuery supportSQLiteQuery) {
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
            AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1 = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1.X;
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean i0() {
            AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1 = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1.X;
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean isOpen() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void m0(Object[] objArr) {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final long p0() {
            AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1 = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1.X;
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final String u() {
            AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1 = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1.X;
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean v() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final boolean v0() {
            AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1 autoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1 = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1.X;
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public final void x() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "Companion", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AutoClosingSupportSQLiteStatement implements SupportSQLiteStatement {
        public int[] X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public long[] f8322Y;
        public double[] Z;
        public String[] e0;
        public byte[][] f0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$Companion;", "", "", "COLUMN_TYPE_LONG", "I", "COLUMN_TYPE_DOUBLE", "COLUMN_TYPE_STRING", "COLUMN_TYPE_BLOB", "COLUMN_TYPE_NULL", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void B0(int i2) {
            a(5, i2);
            this.X[i2] = 5;
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final int E() {
            throw null;
        }

        public final void a(int i2, int i3) {
            int i4 = i3 + 1;
            int[] iArr = this.X;
            if (iArr.length < i4) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
                Intrinsics.e(iArrCopyOf, "copyOf(...)");
                this.X = iArrCopyOf;
            }
            if (i2 == 1) {
                long[] jArr = this.f8322Y;
                if (jArr.length < i4) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i4);
                    Intrinsics.e(jArrCopyOf, "copyOf(...)");
                    this.f8322Y = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i2 == 2) {
                double[] dArr = this.Z;
                if (dArr.length < i4) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i4);
                    Intrinsics.e(dArrCopyOf, "copyOf(...)");
                    this.Z = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i2 == 3) {
                String[] strArr = this.e0;
                if (strArr.length < i4) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i4);
                    Intrinsics.e(objArrCopyOf, "copyOf(...)");
                    this.e0 = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (i2 != 4) {
                return;
            }
            byte[][] bArr = this.f0;
            if (bArr.length < i4) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i4);
                Intrinsics.e(objArrCopyOf2, "copyOf(...)");
                this.f0 = (byte[][]) objArrCopyOf2;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final long b0() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void c(int i2, double d) {
            a(2, i2);
            this.X[i2] = 2;
            this.Z[i2] = d;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            w();
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void d0(int i2, String value) {
            Intrinsics.f(value, "value");
            a(3, i2);
            this.X[i2] = 3;
            this.e0[i2] = value;
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public final void execute() {
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void k0(int i2, long j) {
            a(1, i2);
            this.X[i2] = 1;
            this.f8322Y[i2] = j;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void r0(int i2, byte[] bArr) {
            a(4, i2);
            this.X[i2] = 4;
            this.f0[i2] = bArr;
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public final void w() {
            this.X = new int[0];
            this.f8322Y = new long[0];
            this.Z = new double[0];
            this.e0 = new String[0];
            this.f0 = new byte[0][];
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper$KeepAliveCursor;", "Landroid/database/Cursor;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class KeepAliveCursor implements Cursor {
        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // android.database.Cursor
        public final void copyStringToBuffer(int i2, CharArrayBuffer charArrayBuffer) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void deactivate() {
            throw null;
        }

        @Override // android.database.Cursor
        public final byte[] getBlob(int i2) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getColumnCount() {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getColumnIndex(String str) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getColumnIndexOrThrow(String str) {
            throw null;
        }

        @Override // android.database.Cursor
        public final String getColumnName(int i2) {
            throw null;
        }

        @Override // android.database.Cursor
        public final String[] getColumnNames() {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getCount() {
            throw null;
        }

        @Override // android.database.Cursor
        public final double getDouble(int i2) {
            throw null;
        }

        @Override // android.database.Cursor
        public final Bundle getExtras() {
            throw null;
        }

        @Override // android.database.Cursor
        public final float getFloat(int i2) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getInt(int i2) {
            throw null;
        }

        @Override // android.database.Cursor
        public final long getLong(int i2) {
            throw null;
        }

        @Override // android.database.Cursor
        public final Uri getNotificationUri() {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getPosition() {
            throw null;
        }

        @Override // android.database.Cursor
        public final short getShort(int i2) {
            throw null;
        }

        @Override // android.database.Cursor
        public final String getString(int i2) {
            throw null;
        }

        @Override // android.database.Cursor
        public final int getType(int i2) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean getWantsAllOnMoveCalls() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isAfterLast() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isBeforeFirst() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isClosed() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isFirst() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isLast() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean isNull(int i2) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean move(int i2) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToFirst() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToLast() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToNext() {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToPosition(int i2) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean moveToPrevious() {
            throw null;
        }

        @Override // android.database.Cursor
        public final void registerContentObserver(ContentObserver contentObserver) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            throw null;
        }

        @Override // android.database.Cursor
        public final boolean requery() {
            throw null;
        }

        @Override // android.database.Cursor
        public final Bundle respond(Bundle bundle) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void setExtras(Bundle bundle) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void unregisterContentObserver(ContentObserver contentObserver) {
            throw null;
        }

        @Override // android.database.Cursor
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: getDatabaseName */
    public final String getF8373Y() {
        throw null;
    }

    @Override // androidx.room.DelegatingOpenHelper
    public final SupportSQLiteOpenHelper getDelegate() {
        return null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        throw null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        throw null;
    }
}
