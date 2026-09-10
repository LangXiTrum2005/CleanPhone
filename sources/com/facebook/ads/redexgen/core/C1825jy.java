package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1825jy extends C8I {
    public static byte[] A00;
    public static String[] A01 = {"v5MZzRzrTL11f6lKUt2ZQD1OVIavmnrt", "OQAuAlzJEKPfh7ZgcR4xCXzzkMNpdJq1", "ORBVlGZaT9NsACLTU7PLH6nx7c52uYSI", "kFePfToViPIZQeUiwoBs", "eRXXWt8NkKb0AEFThzS2KgPgrvMEJJml", "Br8mzprdPK1S49BanGBC", "SoemqsWiEpTnAycOeZvswJMc9fMJVUnI", "UAbmRevtk8pEhuOi2MMFgEMoVQVmS6xB"};
    public static final C8C A02;
    public static final C8C A03;
    public static final C8C[] A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;
    public static final String A08;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{122, 103, 122, 40, 43, 118, 119, 126, 119, 102, 119, 18, 116, 96, 125, 127, 18, 70, 93, 89, 87, 92, 65, 18, 101, 122, 119, 96, 119, 18, 124, 125, 102, 18, 119, 106, 123, 97, 102, 97, 18, 26, 97, 119, 126, 119, 113, 102, 18, 3, 18, 116, 96, 125, 127, 18, 87, 68, 87, 92, 70, 65, 18, 101, 122, 119, 96, 119, 18, 70, 93, 89, 87, 92, 65, 28, 27, 38, 61, 59, 46, 42, 55, 49, 48, 126, 41, 54, 59, 48, 126, 42, 44, 39, 55, 48, 57, 126, 42, 49, 126, 58, 59, 50, 59, 42, 59, 126, 61, 54, 55, 50, 58, 50, 59, 45, 45, 126, 42, 49, 53, 59, 48, 45, 112, 124, 91, 67, 84, 89, 92, 81, 21, 65, 90, 94, 80, 91, 27, 20, 5, 24, 20, 36, 53, 40, 36, 80, 32, 34, 57, 61, 49, 34, 41, 80, 59, 53, 41, 66, 81, 66, 73, 83, 84, 5, 30, 26, 20, 31, 125, 102, 98, 108, 103, 86, 96, 109, 67, 88, 92, 82, 89, 68};
    }

    static {
        A04();
        A03 = new C8C(0, A00(170, 8, 107), A00(Input.Keys.NUM_LOCK, 16, 18));
        A02 = new C8C(1, A00(165, 5, 19), A00(Input.Keys.F9, 4, 34));
        A04 = new C8C[]{A03, A02};
        A08 = C1825jy.class.getSimpleName();
        C8C[] c8cArr = A04;
        String strA00 = A00(178, 6, 85);
        A06 = C8I.A02(strA00, c8cArr);
        A07 = C8I.A03(strA00, A04, A02);
        A05 = A00(5, 71, 80) + A03.A01 + A00(0, 3, 56) + A00(Input.Keys.NUMPAD_COMMA, 6, 69) + A00(4, 1, 103) + C1826jz.A09.A01 + A00(3, 1, 99);
    }

    public C1825jy(C8E c8e) {
        super(c8e);
    }

    @Override // com.facebook.ads.redexgen.core.C8I
    public final String A06() {
        return A00(178, 6, 85);
    }

    @Override // com.facebook.ads.redexgen.core.C8I
    public final C8C[] A0A() {
        return A04;
    }

    public final Cursor A0B() {
        return A05().rawQuery(A06, null);
    }

    public final String A0C(String str) throws SQLiteException, IllegalArgumentException {
        if (!TextUtils.isEmpty(str)) {
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = A05().rawQuery(A07, new String[]{str});
                String string = cursorRawQuery.moveToNext() ? cursorRawQuery.getString(A03.A00) : null;
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
                String string2 = UUID.randomUUID().toString();
                ContentValues contentValues = new ContentValues(2);
                contentValues.put(A03.A01, string2);
                contentValues.put(A02.A01, str);
                A05().insertOrThrow(A00(178, 6, 85), null, contentValues);
                return string2;
            } finally {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        }
        throw new IllegalArgumentException(A00(EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE, 14, 87));
    }

    public final void A0D(C1827k0 c1827k0) {
        try {
            A05().execSQL(A05);
        } catch (SQLException e) {
            C8A c8aA05 = c1827k0.A05();
            if (A01[0].charAt(14) != 'l') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "zGpOEoeFk9mKuFaHfebiepQHWPBtYRlV";
            strArr[4] = "gQOnf7kUk2P1iMeHKJrfxPX4gK9wMRl8";
            if (c8aA05.AAD()) {
                Log.e(A08, A00(76, 49, 60), e);
            }
        }
    }
}
