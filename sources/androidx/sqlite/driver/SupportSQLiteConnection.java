package androidx.sqlite.driver;

import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.p004ironsource.d9;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteConnection;", "Landroidx/sqlite/SQLiteConnection;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SupportSQLiteConnection implements SQLiteConnection {
    public final SupportSQLiteDatabase X;

    public SupportSQLiteConnection(SupportSQLiteDatabase db) {
        Intrinsics.f(db, "db");
        this.X = db;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00d3  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.sqlite.SQLiteConnection
    public final SQLiteStatement R0(String sql) {
        String strSubstring;
        SupportSQLiteStatement.Companion.TransactionOperation transactionOperation;
        int i2;
        Intrinsics.f(sql, "sql");
        SupportSQLiteDatabase supportSQLiteDatabase = this.X;
        SupportSQLiteStatement.Companion.SpecialOperation.JournalModeOperation journalModeOperation = null;
        if (!supportSQLiteDatabase.isOpen()) {
            SQLite.b(21, "connection is closed");
            throw null;
        }
        String upperCase = StringsKt.a0(sql).toString().toUpperCase(Locale.ROOT);
        Intrinsics.e(upperCase, "toUpperCase(...)");
        int length = upperCase.length() - 2;
        int i3 = -1;
        if (length >= 0) {
            int iU = 0;
            loop0: while (iU < length) {
                char cCharAt = upperCase.charAt(iU);
                if (Intrinsics.h(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iU2 = iU + 1;
                            if (upperCase.charAt(iU2) == '*') {
                                do {
                                    iU2 = StringsKt.u(upperCase, '*', iU2 + 1, 4);
                                    if (iU2 < 0) {
                                        break loop0;
                                    }
                                    i2 = iU2 + 1;
                                    if (i2 >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i2) != '/');
                                iU = iU2 + 2;
                            }
                        }
                        i3 = iU;
                        break;
                    }
                    if (upperCase.charAt(iU + 1) != '-') {
                        i3 = iU;
                        break;
                    }
                    iU = StringsKt.u(upperCase, '\n', iU + 2, 4);
                    if (iU < 0) {
                        break;
                    }
                }
                iU++;
            }
        }
        if (i3 < 0 || i3 > upperCase.length()) {
            strSubstring = null;
        } else {
            strSubstring = upperCase.substring(i3, Math.min(i3 + 3, upperCase.length()));
            Intrinsics.e(strSubstring, "substring(...)");
        }
        if (strSubstring == null) {
            return new SupportSQLiteStatement.OtherSQLiteStatement(supportSQLiteDatabase, sql);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    transactionOperation = null;
                } else if (!StringsKt.l(upperCase, "EXCLUSIVE", false)) {
                    transactionOperation = !StringsKt.l(upperCase, "IMMEDIATE", false) ? SupportSQLiteStatement.Companion.TransactionOperation.f0 : SupportSQLiteStatement.Companion.TransactionOperation.e0;
                } else {
                    transactionOperation = SupportSQLiteStatement.Companion.TransactionOperation.Z;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    transactionOperation = null;
                } else {
                    transactionOperation = SupportSQLiteStatement.Companion.TransactionOperation.X;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    transactionOperation = null;
                } else {
                    transactionOperation = SupportSQLiteStatement.Companion.TransactionOperation.X;
                }
                break;
            case 81327:
                transactionOperation = (!strSubstring.equals("ROL") || StringsKt.l(upperCase, " TO ", false)) ? null : SupportSQLiteStatement.Companion.TransactionOperation.f8385Y;
                break;
            default:
                transactionOperation = null;
                break;
        }
        if (transactionOperation != null) {
            return new SupportSQLiteStatement.TransactionSQLiteStatement(supportSQLiteDatabase, sql, transactionOperation);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            Intrinsics.e(lowerCase, "toLowerCase(...)");
            if (StringsKt.l(StringsKt.P(lowerCase, "journal_mode", ""), d9.i.f24747b, false)) {
                journalModeOperation = SupportSQLiteStatement.Companion.SpecialOperation.JournalModeOperation.f8384a;
            }
        }
        if (journalModeOperation != null) {
            return new SupportSQLiteStatement.JournalModeSetStatement(supportSQLiteDatabase, sql, new SupportSQLiteStatement.RowSQLiteStatement(supportSQLiteDatabase, sql));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new SupportSQLiteStatement.OtherSQLiteStatement(supportSQLiteDatabase, sql) : new SupportSQLiteStatement.RowSQLiteStatement(supportSQLiteDatabase, sql);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.close();
    }

    @Override // androidx.sqlite.SQLiteConnection
    public final boolean v() {
        return this.X.v();
    }
}
