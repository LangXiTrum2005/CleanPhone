package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.applovin.shadow.okio.Utf8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.jacoco.core.data.ExecutionDataWriter;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2344kQ implements InterfaceC1371Mh {
    public static byte[] A04;
    public static final String[] A05;
    public String A00;
    public String A01;
    public final SparseArray<C1370Mg> A02 = new SparseArray<>();
    public final C5O A03;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{55, 43, 106, 103, 35, 74, 77, 87, 70, 68, 70, 81, 35, 83, 81, 74, 78, 66, 81, 90, 35, 72, 70, 90, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 104, 102, 122, 35, 87, 70, 91, 87, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 110, 102, 119, 98, 103, 98, 119, 98, 35, 65, 79, 76, 65, 35, 77, 76, 87, 35, 77, 86, 79, 79, 42, 46, Utf8.REPLACEMENT_BYTE, 40, 44, 57, 40, 77, 57, 44, 47, 33, 40, 77, 6, ExecutionDataWriter.BLOCK_SESSIONINFO, 13, 18, 98, 22, 3, 0, 14, 7, 98, 11, 4, 98, 7, 26, 11, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 22, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 98, 41, 20, 3, 60, 0, 13, 21, 9, 30, 47, 13, 15, 4, 9, 37, 2, 8, 9, 20, 88, 85, 18, 31, 91, 70, 91, 68, 79, 65, 93, 109, 101, 116, 97, 100, 97, 116, 97};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void AAs(HashMap<String, C1370Mg> map, SparseArray<String> sparseArray) throws IOException {
        AbstractC09153y.A08(this.A02.size() == 0);
        try {
            if (C5Q.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC09153y.A01(this.A00)) != 1) {
                SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    A04(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            Cursor cursorA00 = A00();
            while (cursorA00.moveToNext()) {
                try {
                    C1370Mg c1370Mg = new C1370Mg(cursorA00.getInt(0), (String) AbstractC09153y.A01(cursorA00.getString(1)), C1372Mi.A02(new DataInputStream(new ByteArrayInputStream(cursorA00.getBlob(2)))));
                    map.put(c1370Mg.A02, c1370Mg);
                    sparseArray.put(c1370Mg.A01, c1370Mg.A02);
                } catch (Throwable th2) {
                    if (cursorA00 != null) {
                        try {
                            cursorA00.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            if (cursorA00 != null) {
                cursorA00.close();
            }
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new C5N(e);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void AKJ(HashMap<String, C1370Mg> map) throws IOException {
        if (this.A02.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < this.A02.size(); i++) {
                try {
                    C1370Mg c1370MgValueAt = this.A02.valueAt(i);
                    if (c1370MgValueAt == null) {
                        A05(writableDatabase, this.A02.keyAt(i));
                    } else {
                        A06(writableDatabase, c1370MgValueAt);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.A02.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    static {
        A03();
        A05 = new String[]{A01(128, 2, 48), A01(136, 3, 37), A01(Opcodes.F2I, 8, 1)};
    }

    public C2344kQ(C5O c5o) {
        this.A03 = c5o;
    }

    private Cursor A00() {
        return this.A03.getReadableDatabase().query((String) AbstractC09153y.A01(this.A01), A05, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(109, 19, 109) + str;
    }

    private void A04(SQLiteDatabase sQLiteDatabase) throws C5N {
        C5Q.A04(sQLiteDatabase, 1, (String) AbstractC09153y.A01(this.A00), 1);
        A07(sQLiteDatabase, (String) AbstractC09153y.A01(this.A01));
        sQLiteDatabase.execSQL(A01(75, 13, 108) + this.A01 + A01(0, 1, 22) + A01(1, 74, 2));
    }

    private void A05(SQLiteDatabase sQLiteDatabase, int i) {
        sQLiteDatabase.delete((String) AbstractC09153y.A01(this.A01), A01(130, 6, 122), new String[]{Integer.toString(i)});
    }

    private void A06(SQLiteDatabase sQLiteDatabase, C1370Mg c1370Mg) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1372Mi.A08(c1370Mg.A03(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(A01(128, 2, 48), Integer.valueOf(c1370Mg.A01));
        contentValues.put(A01(136, 3, 37), c1370Mg.A02);
        contentValues.put(A01(Opcodes.F2I, 8, 1), byteArray);
        sQLiteDatabase.replaceOrThrow((String) AbstractC09153y.A01(this.A01), null, contentValues);
    }

    public static void A07(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(A01(88, 21, 67) + str);
    }

    public static void A08(C5O c5o, String str) throws C5N {
        try {
            String strA02 = A02(str);
            SQLiteDatabase writableDatabase = c5o.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                C5Q.A03(writableDatabase, 1, str);
                A07(writableDatabase, strA02);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void A5p() throws C5N {
        A08(this.A03, (String) AbstractC09153y.A01(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final boolean A6S() throws C5N {
        try {
            return C5Q.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC09153y.A01(this.A00)) != -1;
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void AAF(long j) {
        this.A00 = Long.toHexString(j);
        this.A01 = A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void AFd(C1370Mg c1370Mg, boolean z) {
        if (z) {
            this.A02.delete(c1370Mg.A01);
        } else {
            this.A02.put(c1370Mg.A01, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void AGK(C1370Mg c1370Mg) {
        this.A02.put(c1370Mg.A01, c1370Mg);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1371Mh
    public final void AKI(HashMap<String, C1370Mg> map) throws IOException {
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                A04(writableDatabase);
                Iterator<C1370Mg> it = map.values().iterator();
                while (it.hasNext()) {
                    A06(writableDatabase, it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.A02.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C5N(e);
        }
    }
}
