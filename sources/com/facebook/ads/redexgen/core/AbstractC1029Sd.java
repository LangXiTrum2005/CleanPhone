package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1029Sd {
    public static byte[] A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(SQLiteDatabase sQLiteDatabase, int i, String str) throws C1026Sa {
        try {
            if (!AbstractC1600gE.A19(sQLiteDatabase, A01(Input.Keys.NUMPAD_COMMA, 17, 77))) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query(A01(Input.Keys.NUMPAD_COMMA, 17, 77), new String[]{A01(244, 7, 101)}, A01(Input.Keys.F13, 32, 116), A05(i, str), null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return -1;
                }
                cursorQuery.moveToNext();
                int i2 = cursorQuery.getInt(0);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return i2;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
            throw new C1026Sa(e);
        } catch (SQLException e) {
            throw new C1026Sa(e);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{98, 115, 100, 96, 117, 100, 1, 117, 96, 99, 109, 100, 1, 104, 103, 1, 111, 110, 117, 1, 100, 121, 104, 114, 117, 114, 1, 100, 89, 78, 113, 77, 64, 88, 68, 83, 119, 68, 83, 82, 72, 78, 79, 82, 1, 9, 71, 68, 64, 85, 84, 83, 68, 1, 104, 111, 117, 100, 102, 100, 115, 1, 111, 110, 117, 1, 111, 116, 109, 109, cw.k, 72, 79, 82, 85, 64, 79, 66, 68, 126, 84, 72, 69, 1, 117, 100, 121, 117, 1, 111, 110, 117, 1, 111, 116, 109, 109, cw.k, 87, 68, 83, 82, 72, 78, 79, 1, 104, 111, 117, 100, 102, 100, 115, 1, 111, 110, 117, 1, 111, 116, 109, 109, cw.k, 113, 115, 104, 108, 96, 115, 120, 1, 106, 100, 120, 1, 9, 71, 68, 64, 85, 84, 83, 68, cw.k, 1, 72, 79, 82, 85, 64, 79, 66, 68, 126, 84, 72, 69, 8, 8, 45, cw.n, 7, 56, 4, 9, 17, cw.k, 26, 62, cw.k, 26, 27, 1, 7, 6, 27, cw.m, 12, 8, 29, 28, 27, 12, 55, 52, 48, 37, 36, 35, 52, 113, 108, 113, 110, 113, cw.n, 31, 21, 113, 56, 63, 34, 37, 48, 63, 50, 52, cw.l, 36, 56, 53, 113, 108, 113, 110, 12, 4, 4, 12, 69, cw.l, 19, 4, 69, cw.m, 10, 31, 10, 9, 10, 24, cw.l, 44, 43, 54, 49, 36, 43, 38, 32, 26, 48, 44, 33, 54, 37, 50, 51, 41, 47, 46};
    }

    static {
        A02();
        PS.A03(A01(EnumC4719u30.AD_RESPONSE_EMPTY_VALUE, 17, 78));
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, int i, String str) throws C1026Sa {
        String strA01 = A01(Input.Keys.NUMPAD_COMMA, 17, 77);
        try {
            if (!AbstractC1600gE.A19(sQLiteDatabase, strA01)) {
                return;
            }
            sQLiteDatabase.delete(strA01, A01(Input.Keys.F13, 32, 116), A05(i, str));
        } catch (SQLException e) {
            throw new C1026Sa(e);
        }
    }

    public static void A04(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) throws C1026Sa {
        try {
            sQLiteDatabase.execSQL(A01(0, Input.Keys.NUMPAD_COMMA, 4));
            ContentValues contentValues = new ContentValues();
            contentValues.put(A01(176, 7, 76), Integer.valueOf(i));
            contentValues.put(A01(232, 12, 96), str);
            contentValues.put(A01(244, 7, 101), Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow(A01(Input.Keys.NUMPAD_COMMA, 17, 77), null, contentValues);
        } catch (SQLException e) {
            throw new C1026Sa(e);
        }
    }

    public static String[] A05(int i, String str) {
        return new String[]{Integer.toString(i), str};
    }
}
