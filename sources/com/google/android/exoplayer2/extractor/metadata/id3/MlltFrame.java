package com.google.android.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.VS;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MlltFrame extends Id3Frame {
    public static byte[] A05;
    public static String[] A06 = {"Hhl5inxkvQuz7ek8JuLrW24yOH12VNxs", "CHrwR1Svzvdb8Vg1KpjucNQpBYA9NI45", "VwDz5wHo7cpPdQWbvxxukgCGViswxP6", "npaFUko7HEA8HHptKjZiEuvlBgoJWyRW", "R3zrCsZDMbvPt0NJ16On502hT2T", "thaXGCMYpNkQybXtCh2tbuSHjooMz8Bk", "LQmU0COiG4q4363l51MjFeGL1jDFL8DU", "LBlz4ypxMjvoqINQaHUoTnwCLcQJHpic"};
    public static final Parcelable.Creator<MlltFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;
    public final int[] A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[6].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "4hrLMGcgHLWgzu4WMaPGPLZD96WTkRVE";
            strArr2[5] = "ihrL4dCkvpMNOe7jyk5scgIORFIqL7D0";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 48);
            i4++;
        }
    }

    public static void A01() {
        A05 = new byte[]{-72, -73, -73, -65};
    }

    static {
        A01();
        CREATOR = new VS();
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(A00(0, 4, 59));
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = iArr;
        this.A04 = iArr2;
    }

    public MlltFrame(Parcel parcel) {
        super(A00(0, 4, 59));
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = (int[]) AbstractC1600gE.A0f(parcel.createIntArray());
        this.A04 = (int[]) AbstractC1600gE.A0f(parcel.createIntArray());
    }

    @Override // com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame, android.os.Parcelable
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
        MlltFrame mlltFrame = (MlltFrame) obj;
        if (this.A02 == mlltFrame.A02 && this.A00 == mlltFrame.A00 && this.A01 == mlltFrame.A01 && Arrays.equals(this.A03, mlltFrame.A03) && Arrays.equals(this.A04, mlltFrame.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result3 = this.A01;
        int result4 = (((result2 + result3) * 31) + Arrays.hashCode(this.A03)) * 31;
        int result5 = Arrays.hashCode(this.A04);
        return result4 + result5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeIntArray(this.A03);
        parcel.writeIntArray(this.A04);
    }
}
