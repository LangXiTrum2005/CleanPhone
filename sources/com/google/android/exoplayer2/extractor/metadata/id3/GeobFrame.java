package com.google.android.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.VO;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GeobFrame extends Id3Frame {
    public static byte[] A04;
    public static String[] A05 = {"nal", "pgICyaP6g4DXykD8soKhFlzDpEr4wuUt", "NHuK0hXhwccQVDzorTXycvVZOTPTQWGQ", "g9IOF0tO6DEYykdsfZPmjGs5vSUxyREZ", "odXjVegTK5kC0r9lY8T6jh7FLfK8ARR1", "wCLYvRmgNHEkJ", "wFSs1HCSl", "DXWGYh79y1odiOiIXoXN5r5PUdmFDAUb"};
    public static final Parcelable.Creator<GeobFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 123);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-6, -18, 50, 51, 65, 49, 64, 55, 62, 66, 55, 61, 60, 11, -2, -14, 56, 59, 62, 55, 64, 51, 63, 55, cw.m, -20, -46, 31, 27, 31, 23, 6, 43, 34, 23, -17, 39, 37, 47, 34};
        if (A05[6].length() != 9) {
            throw new RuntimeException();
        }
        A05[5] = "IVUU6rldbGyHt";
        A04 = bArr;
    }

    static {
        A01();
        CREATOR = new VO();
    }

    public GeobFrame(Parcel parcel) {
        super(A00(36, 4, 101));
        this.A02 = (String) AbstractC1600gE.A0f(parcel.readString());
        this.A01 = (String) AbstractC1600gE.A0f(parcel.readString());
        this.A00 = (String) AbstractC1600gE.A0f(parcel.readString());
        this.A03 = (byte[]) AbstractC1600gE.A0f(parcel.createByteArray());
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(A00(36, 4, 101));
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (AbstractC1600gE.A1E(this.A02, geobFrame.A02)) {
            String str = this.A01;
            String[] strArr = A05;
            if (strArr[7].charAt(2) == strArr[4].charAt(2)) {
                throw new RuntimeException();
            }
            A05[0] = "INW";
            if (AbstractC1600gE.A1E(str, geobFrame.A01) && AbstractC1600gE.A1E(this.A00, geobFrame.A00) && Arrays.equals(this.A03, geobFrame.A03)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17 * 31;
        int result = this.A02 != null ? this.A02.hashCode() : 0;
        int result2 = (i + result) * 31;
        int result3 = this.A01 != null ? this.A01.hashCode() : 0;
        return ((((result2 + result3) * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + Arrays.hashCode(this.A03);
    }

    @Override // com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(25, 11, 55) + this.A02 + A00(14, 11, 87) + this.A01 + A00(0, 14, 83) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
