package com.google.android.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.VJ;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ApicFrame extends Id3Frame {
    public static byte[] A04;
    public static final Parcelable.Creator<ApicFrame> CREATOR;
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 3);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{95, 83, 23, 22, 0, cw.n, 1, 26, 3, 7, 26, 28, 29, 78, 69, 95, 18, 22, 18, 26, 43, 6, cw.m, 26, 66, 68, 85, 76, 70};
    }

    static {
        A01();
        CREATOR = new VJ();
    }

    public ApicFrame(Parcel parcel) {
        super(A00(25, 4, 6));
        this.A02 = (String) AbstractC1600gE.A0f(parcel.readString());
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = (byte[]) AbstractC1600gE.A0f(parcel.createByteArray());
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super(A00(25, 4, 6));
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.A00 == apicFrame.A00 && AbstractC1600gE.A1E(this.A02, apicFrame.A02) && AbstractC1600gE.A1E(this.A01, apicFrame.A01) && Arrays.equals(this.A03, apicFrame.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int result2 = ((17 * 31) + result) * 31;
        int result3 = this.A02 != null ? this.A02.hashCode() : 0;
        return ((((result2 + result3) * 31) + (this.A01 != null ? this.A01.hashCode() : 0)) * 31) + Arrays.hashCode(this.A03);
    }

    @Override // com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(14, 11, 124) + this.A02 + A00(0, 14, 112) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
