package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2369hq extends RF {
    public static byte[] A06;
    public static String[] A07 = {"ZeVLivVBnS1aoVlC2PGSN001bhNNVWpd", "UVHNMhASFprendMTBixyPal4p5ABOqh9", "McvoL7vwBcNsRrFgWF8", "NjfWBR2llDufPeBAgLyuBDteRTJCHxSb", "wixo9thO", "Otknv8q9MbYFm1QayK0knTm3Lm4p4QUP", "Dtck5bq60bDmwFSuqNFF3ANsa4oCLChk", "09JoBoJUIjBPlvD9emsVrlLKVUsGd7rc"};
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final int A03(View view, int i2) {
        R2 r2A08 = A08();
        if (r2A08 == null || !r2A08.A23()) {
            return 0;
        }
        R3 r3 = (R3) view.getLayoutParams();
        return A0N(r2A08.A0q(view) - r3.topMargin, r2A08.A0l(view) + r3.bottomMargin, r2A08.A0i(), r2A08.A0Z() - r2A08.A0f(), i2);
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 123);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A06 = new byte[]{45, 8, 15, 4, 0, 19, 50, 12, 14, 14, 21, 9, 50, 2, 19, 14, 13, 13, 4, 19, 124, 74, 80, 5, 86, 77, 74, 80, 73, 65, 5, 74, 83, 64, 87, 87, 76, 65, 64, 5, 70, 74, 72, 85, 80, 81, 64, 118, 70, 87, 74, 73, 73, 115, 64, 70, 81, 74, 87, 99, 74, 87, 117, 74, 86, 76, 81, 76, 74, 75, 5, 82, 77, 64, 75, 5, 81, 77, 64, 5, 105, 68, 92, 74, 80, 81, 104, 68, 75, 68, 66, 64, 87, 5, 65, 74, 64, 86, 5, 75, 74, 81, 5, 76, 72, 85, 73, 64, 72, 64, 75, 81, 5, 117, 104, 103, 118, 38, 118, 116, 99, 96, 99, 116, 99, 104, 101, 99, 38, 117, 110, 105, 115, 106, 98, 38, 100, 99, 38, 105, 104, 99, 38, 105, 96, 38, 114, 110, 99, 38, 101, 105, 104, 117, 114, 103, 104, 114, 117, 38, 98, 99, 96, 111, 104, 99, 98, 38, 111, 104, 38, 85, 107, 105, 105, 114, 110, 85, 101, 116, 105, 106, 106, 99, 116, 42, 38, 117, 114, 103, 116, 114, 111, 104, 97, 38, 113, 111, 114, 110, 38, 85, 72, 71, 86, 89};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public int A0O(View view, int i2) {
        R2 r2A08 = A08();
        if (r2A08 == null || !r2A08.A22()) {
            return 0;
        }
        R3 r3 = (R3) view.getLayoutParams();
        return A0N(r2A08.A0m(view) - r3.leftMargin, r2A08.A0p(view) + r3.rightMargin, r2A08.A0g(), r2A08.A0j() - r2A08.A0h(), i2);
    }

    static {
        A06();
    }

    public C2369hq(Context context) {
        this.A03 = A0J(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        if (this.A02 == null || this.A02.y == 0.0f) {
            return 0;
        }
        return this.A02.y > 0.0f ? 1 : -1;
    }

    private int A01(int i2, int i3) {
        int before = i2 - i3;
        if (i2 * before <= 0) {
            return 0;
        }
        return before;
    }

    private final void A07(RD rd) {
        PointF pointFA0P = A0P(A07());
        if (pointFA0P == null || (pointFA0P.x == 0.0f && pointFA0P.y == 0.0f)) {
            rd.A03(A07());
            A09();
            return;
        }
        A0B(pointFA0P);
        this.A02 = pointFA0P;
        this.A00 = (int) (pointFA0P.x * 10000.0f);
        this.A01 = (int) (pointFA0P.y * 10000.0f);
        int iA0L = A0L(10000);
        int i2 = (int) (this.A00 * 1.2f);
        int i3 = (int) (this.A01 * 1.2f);
        int time = A07[2].length();
        if (time != 19) {
            throw new RuntimeException();
        }
        A07[1] = "hx3pIt9eJlYI2ywoto5TCaec45lSGfjK";
        int time2 = (int) (iA0L * 1.2f);
        rd.A04(i2, i3, time2, this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final void A0G() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final void A0H(int i2, int i3, RH rh, RD rd) {
        if (A06() == 0) {
            A09();
            if (A07[2].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[7] = "mtmNmOzcoe2a0U4cnzAn20gs4sdBvWQ8";
            strArr[3] = "eV2w3A07ZjFunHiJvnAZuuNmUx5etHx7";
            return;
        }
        this.A00 = A01(this.A00, i2);
        this.A01 = A01(this.A01, i3);
        if (A07[4].length() != 8) {
            if (this.A00 != 0) {
                return;
            }
        } else {
            String[] strArr2 = A07;
            strArr2[7] = "DcFC9yFlUF16xNqjYqSfoPj4l29Ulhpi";
            strArr2[3] = "h8WgdOPxw0F7hfvsQm1LsAkbSgkBaMel";
            if (this.A00 != 0) {
                return;
            }
        }
        if (this.A01 == 0) {
            A07(rd);
        }
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public void A0I(View view, RH rh, RD rd) {
        int iA0O = A0O(view, A0K());
        int dx = A00();
        int iA03 = A03(view, dx);
        int dy = iA0O * iA0O;
        int dx2 = iA03 * iA03;
        int time = A0M((int) Math.sqrt(dy + dx2));
        if (time > 0) {
            int distance = -iA0O;
            int dy2 = -iA03;
            rd.A04(distance, dy2, time, this.A04);
        }
    }

    public float A0J(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0K() {
        if (this.A02 == null || this.A02.x == 0.0f) {
            return 0;
        }
        return this.A02.x > 0.0f ? 1 : -1;
    }

    public int A0L(int i2) {
        return (int) Math.ceil(Math.abs(i2) * this.A03);
    }

    public final int A0M(int i2) {
        return (int) Math.ceil(((double) A0L(i2)) / 0.3356d);
    }

    public final int A0N(int i2, int i3, int i4, int i5, int i6) {
        switch (i6) {
            case -1:
                return i4 - i2;
            case 0:
                int i7 = i4 - i2;
                if (i7 > 0) {
                    return i7;
                }
                int i8 = i5 - i3;
                if (i8 < 0) {
                    return i8;
                }
                return 0;
            case 1:
                return i5 - i3;
            default:
                throw new IllegalArgumentException(A04(113, 93, 125));
        }
    }

    public PointF A0P(int i2) {
        Object objA08 = A08();
        if (objA08 instanceof RE) {
            return ((RE) objA08).A56(i2);
        }
        Log.w(A04(0, 20, 26), A04(20, 93, 94) + RE.class.getCanonicalName());
        return null;
    }
}
