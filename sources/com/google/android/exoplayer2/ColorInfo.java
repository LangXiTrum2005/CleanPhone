package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.badlogic.gdx.Input;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.InterfaceC0903Na;
import com.facebook.ads.redexgen.core.InterfaceC0904Nb;
import com.facebook.ads.redexgen.core.O6;
import com.facebook.ads.redexgen.core.O7;
import com.google.android.exoplayer2.ColorInfo;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ColorInfo implements InterfaceC0904Nb, Parcelable {
    public static byte[] A05;
    public static String[] A06 = {"VH1M5209n3wU0mjtLUJ0tkZQjOdtlDkS", "nN7Kzo81wGsq62OzfjCA5JKaEZUe1PSm", "yVi9BagBRiAD1TU63xLbDFHOONIqqHva", "3vim3VpKYxCO2TvyRp1ZEXiMUEFBX6Aa", "m9oMSZQJDW1mj4UdRrkT6YkZkmntgqaO", "Dsb6GRxX1Sb8zh", "r81RDD7viwz8tmWw", "FMl1h4zb5L4ONmuq9uBsGEFcEBdJgQs0"};
    public static final Parcelable.Creator<ColorInfo> A07;
    public static final InterfaceC0903Na<ColorInfo> A08;
    public static final ColorInfo A09;
    public static final ColorInfo A0A;
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 46);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A05 = new byte[]{75, 37, 41, 68, 82, 52, 54, 52, 54, 123, 109, cw.m, 9, 8, 77, 91, 56, 63, 54, 68, 104, 107, 104, 117, 78, 105, 97, 104, 47, 55, 4, 29, 29, 81, 3, cw.n, 31, 22, 20, 116, 82, 94, 94, 82, 19, 1, 29, 1, 80, 84, 95, 116, 81, 85, 81, 76, 93, 92, 24, 74, 89, 86, 95, 93, 113, 84, 83, 88, 92, 79, 112, 103, 113, 3, 112, 110, 115, 119, 102, 3, 18, 20, 19, 110, 66, 69, 35, 33, 41, 37, 49, 65, 64, 104, 83, 89, 88, 91, 84, 83, 88, 89, 29, 94, 82, 81, 82, 79, 29, 79, 92, 83, 90, 88, 123, 64, 74, 75, 72, 71, 64, 75, 74, cw.l, 77, 65, 66, 65, 92, cw.l, 93, 94, 79, 77, 75, 17, 42, 32, 33, 34, 45, 42, 33, 32, 100, 39, 43, 40, 43, 54, 100, 48, 54, 37, 42, 55, 34, 33, 54, 85, 110, 115, 101, 116, 32, 99, 111, 108, 111, 114, 32, 114, 97, 110, 103, 101, 66, 121, 100, 114, 99, 55, 116, 120, 123, 120, 101, 55, 100, 103, 118, 116, 114, 29, 38, 59, 45, 60, 104, 43, 39, 36, 39, 58, 104, 60, 58, 41, 38, 59, 46, 45, 58, 40, 9, 28, 25};
    }

    static {
        A08();
        A09 = new ColorInfo(1, 2, 3, null);
        A0A = new O7().A01(1).A00(1).A02(2).A03();
        A07 = new O6();
        A08 = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.Zj
            @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
            public final InterfaceC0904Nb A6V(Bundle bundle) {
                return ColorInfo.A02(bundle);
            }
        };
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = bArr;
    }

    public ColorInfo(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        boolean hasHdrStaticInfo = AbstractC1600gE.A1C(parcel);
        this.A04 = hasHdrStaticInfo ? parcel.createByteArray() : null;
    }

    @Pure
    public static int A00(int i) {
        switch (i) {
            case 1:
                if (A06[0].charAt(19) == 'P') {
                    throw new RuntimeException();
                }
                A06[5] = "pQbF7wbFJX0o1kBW5QkC2NIN";
                return 1;
            case 2:
            case 3:
            case 8:
            default:
                return -1;
            case 4:
            case 5:
            case 6:
            case 7:
                return 2;
            case 9:
                return 6;
        }
    }

    @Pure
    public static int A01(int i) {
        switch (i) {
            case 1:
            case 6:
            case 7:
                return 3;
            case 4:
                return 10;
            case 13:
                return 2;
            case 16:
                return 6;
            case 18:
                return 7;
            default:
                return -1;
        }
    }

    public static /* synthetic */ ColorInfo A02(Bundle bundle) {
        return new ColorInfo(bundle.getInt(A06(0), -1), bundle.getInt(A06(1), -1), bundle.getInt(A06(2), -1), bundle.getByteArray(A06(3)));
    }

    public static String A03(int i) {
        switch (i) {
            case -1:
                return A07(Input.Keys.NUMPAD_COMMA, 17, 46);
            case 0:
            default:
                return A07(93, 21, 19);
            case 1:
                return A07(29, 10, 95);
            case 2:
                return A07(51, 13, 22);
        }
    }

    public static String A04(int i) {
        switch (i) {
            case -1:
                return A07(176, 17, 57);
            case 0:
            case 3:
            case 4:
            case 5:
            default:
                return A07(114, 21, 0);
            case 1:
                return A07(14, 5, 33);
            case 2:
                if (A06[7].charAt(13) == 'J') {
                    throw new RuntimeException();
                }
                A06[6] = "wImQ";
                return A07(9, 5, 23);
            case 6:
                return A07(3, 6, 40);
        }
    }

    public static String A05(int i) {
        switch (i) {
            case -1:
                return A07(Input.Keys.F23, 20, 102);
            case 0:
            case 4:
            case 5:
            case 8:
            case 9:
            default:
                return A07(135, 24, 106);
            case 1:
                return A07(64, 6, 19);
            case 2:
                return A07(EnumC4719u30.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 4, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE);
            case 3:
                return A07(70, 14, 13);
            case 6:
                return A07(84, 9, 63);
            case 7:
                return A07(48, 3, 54);
            case 10:
                if (A06[6].length() == 9) {
                    throw new RuntimeException();
                }
                A06[5] = "pSSUNAFziCLw9AZH8ACrqXI0tZdxdBnb";
                return A07(39, 9, 29);
        }
    }

    public static String A06(int i) {
        return Integer.toString(i, 36);
    }

    public static boolean A09(ColorInfo colorInfo) {
        return colorInfo != null && (colorInfo.A03 == 7 || colorInfo.A03 == 6);
    }

    public final O7 A0A() {
        return new O7(this, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        if (this.A02 == colorInfo.A02 && this.A01 == colorInfo.A01 && this.A03 == colorInfo.A03 && Arrays.equals(this.A04, colorInfo.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A02;
            int result2 = ((((17 * 31) + result) * 31) + this.A01) * 31;
            int result3 = this.A03;
            this.A00 = ((result2 + result3) * 31) + Arrays.hashCode(this.A04);
        }
        int result4 = this.A00;
        return result4;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(A07(19, 10, 41)).append(A04(this.A02));
        String strA07 = A07(1, 2, 39);
        return sbAppend.append(strA07).append(A03(this.A01)).append(strA07).append(A05(this.A03)).append(strA07).append(this.A04 != null).append(A07(0, 1, 76)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        AbstractC1600gE.A0w(parcel, this.A04 != null);
        if (this.A04 != null) {
            parcel.writeByteArray(this.A04);
        }
    }
}
