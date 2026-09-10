package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class SN {
    public static byte[] A07;
    public static String[] A08 = {"AnF1hfDBxlCdLbiDFLPUuTr8rEIYbsCs", "DcTEZsyKQaFycdRSUI2qHgy2Whp5epDQ", "oumPRRvCFD06iOY6OIziseOiJT3r0Y1F", "T68w1lZpg2aHhxWtuqshCv95QbfqOWN4", "NXTzrqYb1pzocIC4FPaomVlkuxRd4v50", "22ngLnp9x9FhYwfhJQ2wIkSm", "Bx3CPZoq94eNKBlojUhsqxvx", "nU7JTpeEhpBFqPr5yRkbJ9HjbOYUZCS7"};
    public final Handler A00;
    public final SM A01;
    public final C1706Sx A02;
    public final String A03;
    public final String A04;
    public final JSONObject A05;
    public final boolean A06;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{14, 32, 32, 18, 33, 32, -85, -82, -79, -86, -37, -33, -45, -39, -41, -61, -74, -79, -78, -68};
    }

    static {
        A07();
    }

    public SN(C1706Sx c1706Sx, JSONObject jSONObject, String str, String str2, boolean z2, SM sm) {
        this.A02 = c1706Sx;
        this.A05 = jSONObject;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z2 && A0A(this.A05);
        this.A01 = sm;
        this.A00 = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z2, SL sl) {
        String strA03 = A03(6, 4, 8);
        String strA04 = A03(15, 5, 16);
        String strA05 = A03(10, 5, 53);
        if (z2) {
            if (strA05.equals(sl.A02)) {
                this.A02.A0d(new C1704Sv(sl.A03, -1, -1, this.A04, this.A03));
                return;
            } else if (strA04.equals(sl.A02)) {
                this.A02.A0a(new C1702St(sl.A03, this.A04, this.A03));
                return;
            } else {
                if (!strA03.equals(sl.A02)) {
                    return;
                }
                this.A02.A0Z(new C1702St(sl.A03, this.A04, this.A03));
                return;
            }
        }
        boolean zEquals = strA05.equals(sl.A02);
        String[] strArr = A08;
        if (strArr[0].charAt(19) == strArr[7].charAt(19)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "flwbx6LrQCqeci7k9ke6latQGKdtr0Wf";
        strArr2[4] = "KvRVuDaSTwPscix8AFjTqHYTdR1zRqiC";
        if (zEquals) {
            this.A02.A0c(new C1704Sv(sl.A03, -1, -1, this.A04, this.A03));
        } else if (strA04.equals(sl.A02)) {
            this.A02.A0b(new C1702St(sl.A03, this.A04, this.A03));
        } else {
            if (!strA03.equals(sl.A02)) {
                return;
            }
            this.A02.A0Y(new C1702St(sl.A03, this.A04, this.A03));
        }
    }

    public static boolean A0A(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.has(A03(0, 6, 112));
    }

    public final void A0B() {
        if (!this.A06) {
            this.A01.ACy();
        }
        YG.A06.execute(new C2318h0(this));
    }
}
