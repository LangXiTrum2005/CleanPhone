package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Arrays;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1516Sb {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{61, 53, 56, 79, RemoteControlWriter.BLOCK_CMDDUMP, 74, 92, 65, 71, 74, 71, 74, 127, 115, 114, 104, 121, 114, 104, 38, 51, 51, 127, 115, 113, 50, 122, 125, 127, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, 120, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, 120, 76, 110, 115, 106, 117, 120, 121, 110, 18, 23, 19, 23, 10, 33, 10, 12, 31, 29, 21, 23, ExecutionDataWriter.BLOCK_SESSIONINFO, 25};
    }

    public static C1515Sa A00(ContentResolver contentResolver) {
        String strA01 = A01(72, 14, 113);
        String strA02 = A01(3, 9, 33);
        String strA03 = A01(0, 3, 83);
        Cursor c = null;
        try {
            c = contentResolver.query(XB.A00(A01(12, 60, 19)), new String[]{strA03, strA02, strA01}, null, null, null);
            if (c == null || !c.moveToFirst()) {
                return new C1515Sa(null, null, false);
            }
            String string = c.getString(c.getColumnIndex(strA03));
            String attributionId = c.getString(c.getColumnIndex(strA02));
            return new C1515Sa(string, attributionId, Boolean.valueOf(c.getString(c.getColumnIndex(strA01))).booleanValue());
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }
}
