package com.google.android.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.VN;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CommentFrame extends Id3Frame {
    public static byte[] A03;
    public static final Parcelable.Creator<CommentFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{101, 105, 45, 44, 58, 42, 59, 32, 57, 61, 32, 38, 39, 116, 44, 54, 122, 119, 120, 113, 99, 119, 113, 115, 43, 113, 125, 127, 127};
    }

    static {
        A01();
        CREATOR = new VN();
    }

    public CommentFrame(Parcel parcel) {
        super(A00(25, 4, 70));
        this.A01 = (String) AbstractC1600gE.A0f(parcel.readString());
        this.A00 = (String) AbstractC1600gE.A0f(parcel.readString());
        this.A02 = (String) AbstractC1600gE.A0f(parcel.readString());
    }

    public CommentFrame(String str, String str2, String str3) {
        super(A00(25, 4, 70));
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (AbstractC1600gE.A1E(this.A00, commentFrame.A00) && AbstractC1600gE.A1E(this.A01, commentFrame.A01) && AbstractC1600gE.A1E(this.A02, commentFrame.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 17 * 31;
        int result = this.A01 != null ? this.A01.hashCode() : 0;
        return ((((i + result) * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + (this.A02 != null ? this.A02.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(14, 11, 98) + this.A01 + A00(0, 14, 61) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
