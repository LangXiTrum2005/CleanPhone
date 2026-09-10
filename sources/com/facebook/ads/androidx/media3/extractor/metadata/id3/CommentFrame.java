package com.facebook.ads.androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.C5C;
import com.facebook.ads.redexgen.core.IC;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class CommentFrame extends Id3Frame {
    public static byte[] A03;
    public static String[] A04 = {"lcHoQBLcydmodpKSuuTfVhmWnBTqqDxi", "Q6ySwaeCbW", "0gwbdNONhOvOAOabPr9LUJJKC3jEx6p1", "vRUzWaQScIPg2uT65SDlCKygcyQn4Yob", "VOQ4aCm2p7", "9j7lQtJAUgQouBt5ljKUOIOdkpsRl0vx", "IKjDUHGa1QiAVQiQ1LqmhfjF0bbcN", "vkCReD4Ts3DoySefkZGUW8MmoqJep"};
    public static final Parcelable.Creator<CommentFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{2, 14, 74, 75, 93, 77, 92, 71, 94, 90, 71, 65, 64, 19, 118, 108, 32, 45, 34, 43, 57, 45, 43, 41, 113, 65, 77, 79, 79};
    }

    static {
        A01();
        CREATOR = new IC();
    }

    public CommentFrame(Parcel parcel) {
        super(A00(25, 4, 118));
        this.A01 = (String) C5C.A0f(parcel.readString());
        this.A00 = (String) C5C.A0f(parcel.readString());
        this.A02 = (String) C5C.A0f(parcel.readString());
    }

    public CommentFrame(String str, String str2, String str3) {
        super(A00(25, 4, 118));
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
        if (C5C.A1E(this.A00, commentFrame.A00) && C5C.A1E(this.A01, commentFrame.A01) && C5C.A1E(this.A02, commentFrame.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = 17 * 31;
        int result = this.A01 != null ? this.A01.hashCode() : 0;
        int result2 = (i2 + result) * 31;
        int result3 = this.A00 != null ? this.A00.hashCode() : 0;
        int iHashCode = ((result2 + result3) * 31) + (this.A02 != null ? this.A02.hashCode() : 0);
        if (A04[0].charAt(2) != 'H') {
            throw new RuntimeException();
        }
        A04[3] = "gNUxfOqYKG5nsbfyDVsDXmmk6QvI6eqO";
        return iHashCode;
    }

    @Override // com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(14, 11, 56) + this.A01 + A00(0, 14, 90) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
