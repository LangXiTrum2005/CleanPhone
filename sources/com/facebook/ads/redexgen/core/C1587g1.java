package com.facebook.ads.redexgen.core;

import android.view.Surface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1587g1 {
    public static byte[] A04;
    public static String[] A05 = {"tr7UgaBn8MfRlKzFEjPU3cNGLZ28Oxiq", "SSiyVSGJ6hQz242BOUbEdl2xF6daqtbs", "Zh6iZEy8WdNhuL5Fi6okY8bxBH7M1p5A", "Bu5RBUrmJn3X5vat6T5LSTZ5xCkJS78W", "IX6GbAQqWxeqGvRucmLoCmVNWfBshNgH", "scOk0EAj9R2FtWTpCZcRhRn7Mm1BFu2t", "J6pVImi3Vg0NVLjNOUXcRVDOu3Wp6S4P", "s0kW93upWpbEg7TlEvUSQw6A81QRyAYc"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final Surface A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[4].charAt(1) != 'X') {
                throw new RuntimeException();
            }
            A05[5] = "tHM7w1oJgLWGsVk4CcA3tD8cYmbx0PcV";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 62);
            i4++;
        }
    }

    public static void A01() {
        A04 = new byte[]{-1, 2, -7, -11, -2, 4, -15, 4, -7, -1, -2, -44, -11, -9, 2, -11, -11, 3, -80, -3, 5, 3, 4, -80, -14, -11, -80, -64, -68, -80, -55, -64, -68, -80, -63, -56, -64, -68, -80, -1, 2, -80, -62, -57, -64};
    }

    static {
        A01();
    }

    public C1587g1(Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }

    public C1587g1(Surface surface, int i, int i2, int i3) {
        AbstractC1517es.A09(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, A00(0, 45, 82));
        this.A03 = surface;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1587g1)) {
            return false;
        }
        C1587g1 c1587g1 = (C1587g1) obj;
        if (this.A02 == c1587g1.A02 && this.A00 == c1587g1.A00) {
            int i = this.A01;
            String[] strArr = A05;
            if (strArr[1].charAt(16) != strArr[6].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[7] = "KZzFtzdl5LUqpanMxhG2tbtm8pjK1JUf";
            strArr2[0] = "Y4mNCgtKissDz6OypWHyXxrA8mIT784H";
            if (i == c1587g1.A01 && this.A03.equals(c1587g1.A03)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A03.hashCode();
        int i = result * 31;
        int result2 = this.A02;
        int result3 = (((i + result2) * 31) + this.A00) * 31;
        int result4 = this.A01;
        return result3 + result4;
    }
}
