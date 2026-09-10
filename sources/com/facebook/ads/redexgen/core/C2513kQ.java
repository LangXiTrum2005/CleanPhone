package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2513kQ implements InterfaceC1540Mh {
    public static byte[] A04;
    public static final String[] A05;
    public String A00;
    public String A01;
    public final SparseArray<C1539Mg> A02 = new SparseArray<>();
    public final C5O A03;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{55, 43, 106, 103, 35, 74, 77, 87, 70, 68, 70, 81, 35, 83, 81, 74, 78, 66, 81, 90, 35, 72, 70, 90, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 104, 102, 122, 35, 87, 70, 91, 87, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 110, 102, 119, 98, 103, 98, 119, 98, 35, 65, 79, 76, 65, 35, 77, 76, 87, 35, 77, 86, 79, 79, 42, 46, 63, 40, 44, 57, 40, 77, 57, 44, 47, 33, 40, 77, 6, 16, 13, 18, 98, 22, 3, 0, 14, 7, 98, 11, 4, 98, 7, 26, 11, 17, 22, 17, 98, 41, 20, 3, 60, 0, 13, 21, 9, 30, 47, 13, 15, 4, 9, 37, 2, 8, 9, 20, 88, 85, 18, 31, 91, 70, 91, 68, 79, 65, 93, 109, 101, 116, 97, 100, 97, 116, 97};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1540Mh
    public final void AAs(HashMap<String, C1539Mg> map, SparseArray<String> sparseArray) throws IOException {
        AbstractC10843y.A08(this.A02.size() == 0);
        try {
            if (C5Q.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC10843y.A01(this.A00)) != 1) {
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
                    C1539Mg c1539Mg = new C1539Mg(cursorA00.getInt(0), (String) AbstractC10843y.A01(cursorA00.getString(1)), C1541Mi.A02(new DataInputStream(new ByteArrayInputStream(cursorA00.getBlob(2)))));
                    map.put(c1539Mg.A02, c1539Mg);
                    sparseArray.put(c1539Mg.A01, c1539Mg.A02);
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
        } catch (SQLiteException e2) {
            map.clear();
            sparseArray.clear();
            throw new C5N(e2);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1540Mh
    public final void AKJ(HashMap<String, C1539Mg> map) throws IOException {
        if (this.A02.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i2 = 0; i2 < this.A02.size(); i2++) {
                try {
                    C1539Mg c1539MgValueAt = this.A02.valueAt(i2);
                    if (c1539MgValueAt == null) {
                        A05(writableDatabase, this.A02.keyAt(i2));
                    } else {
                        A06(writableDatabase, c1539MgValueAt);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.A02.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e2) {
            throw new C5N(e2);
        }
    }

    static {
        A03();
        A05 = new String[]{A01(128, 2, 48), A01(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 3, 37), A01(139, 8, 1)};
    }

    public C2513kQ(C5O c5o) {
        this.A03 = c5o;
    }

    private Cursor A00() {
        return this.A03.getReadableDatabase().query((String) AbstractC10843y.A01(this.A01), A05, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(109, 19, 109) + str;
    }

    private void A04(SQLiteDatabase sQLiteDatabase) throws C5N {
        C5Q.A04(sQLiteDatabase, 1, (String) AbstractC10843y.A01(this.A00), 1);
        A07(sQLiteDatabase, (String) AbstractC10843y.A01(this.A01));
        sQLiteDatabase.execSQL(A01(75, 13, 108) + this.A01 + A01(0, 1, 22) + A01(1, 74, 2));
    }

    private void A05(SQLiteDatabase sQLiteDatabase, int i2) {
        sQLiteDatabase.delete((String) AbstractC10843y.A01(this.A01), A01(130, 6, 122), new String[]{Integer.toString(i2)});
    }

    private void A06(SQLiteDatabase sQLiteDatabase, C1539Mg c1539Mg) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1541Mi.A08(c1539Mg.A03(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(A01(128, 2, 48), Integer.valueOf(c1539Mg.A01));
        contentValues.put(A01(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 3, 37), c1539Mg.A02);
        contentValues.put(A01(139, 8, 1), byteArray);
        sQLiteDatabase.replaceOrThrow((String) AbstractC10843y.A01(this.A01), null, contentValues);
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
        } catch (SQLException e2) {
            throw new C5N(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540Mh
    public final void A5p() throws C5N {
        A08(this.A03, (String) AbstractC10843y.A01(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540Mh
    public final boolean A6S() throws C5N {
        try {
            return C5Q.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC10843y.A01(this.A00)) != -1;
        } catch (SQLException e2) {
            throw new C5N(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540Mh
    public final void AAF(long j) {
        this.A00 = Long.toHexString(j);
        this.A01 = A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540Mh
    public final void AFd(C1539Mg c1539Mg, boolean z2) {
        if (z2) {
            this.A02.delete(c1539Mg.A01);
        } else {
            this.A02.put(c1539Mg.A01, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540Mh
    public final void AGK(C1539Mg c1539Mg) {
        this.A02.put(c1539Mg.A01, c1539Mg);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540Mh
    public final void AKI(HashMap<String, C1539Mg> map) throws IOException {
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                A04(writableDatabase);
                Iterator<C1539Mg> it = map.values().iterator();
                while (it.hasNext()) {
                    A06(writableDatabase, it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.A02.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new C5N(e2);
        }
    }
}
