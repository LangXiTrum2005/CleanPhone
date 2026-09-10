package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1685Sb {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{61, 53, 56, 79, 64, 74, 92, 65, 71, 74, 71, 74, AbstractJsonLexerKt.TC_INVALID, 115, 114, 104, 121, 114, 104, 38, 51, 51, AbstractJsonLexerKt.TC_INVALID, 115, 113, 50, 122, 125, AbstractJsonLexerKt.TC_INVALID, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, 120, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, 120, 76, 110, 115, 106, 117, 120, 121, 110, 18, 23, 19, 23, 10, 33, 10, 12, 31, 29, 21, 23, 16, 25};
    }

    public static C1684Sa A00(ContentResolver contentResolver) {
        String strA01 = A01(72, 14, 113);
        String strA02 = A01(3, 9, 33);
        String strA03 = A01(0, 3, 83);
        Cursor c2 = null;
        try {
            c2 = contentResolver.query(XB.A00(A01(12, 60, 19)), new String[]{strA03, strA02, strA01}, null, null, null);
            if (c2 == null || !c2.moveToFirst()) {
                return new C1684Sa(null, null, false);
            }
            String string = c2.getString(c2.getColumnIndex(strA03));
            String attributionId = c2.getString(c2.getColumnIndex(strA02));
            return new C1684Sa(string, attributionId, Boolean.valueOf(c2.getString(c2.getColumnIndex(strA01))).booleanValue());
        } finally {
            if (c2 != null) {
                c2.close();
            }
        }
    }
}
