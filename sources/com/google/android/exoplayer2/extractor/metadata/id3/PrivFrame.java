package com.google.android.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.VT;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PrivFrame extends Id3Frame {
    public static byte[] A02;
    public static String[] A03 = {"DFe72tbBQhSJGllGojxYNAFJlCGx0Deg", "ppDIObujNPTzO79yeKKFGmymYGZ3Ht1z", "IfBTbjeESpya7qxrraZ", "wqym8mX8cH7YOEqcES8aZzSUjxE70z1o", "X8LDQMWb0goqmsOp8qemgdkpzp7BpsfE", "PNC6EMDUptaNM4hT3KNafoaAY6B54VPx", "YAWmCw48dyaLIZC7Gdl1Y8LbSqwm3aQb", "q2Vd4Lwr34XgehsGm7YRy7r67Mz3saKm"};
    public static final Parcelable.Creator<PrivFrame> CREATOR;
    public final String A00;
    public final byte[] A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-35, -61, 18, 26, 17, 8, 21, -32, -33, -31, -40, -27};
    }

    static {
        A01();
        CREATOR = new VT();
    }

    public PrivFrame(Parcel parcel) {
        super(A00(8, 4, 44));
        this.A00 = (String) AbstractC1600gE.A0f(parcel.readString());
        this.A01 = (byte[]) AbstractC1600gE.A0f(parcel.createByteArray());
    }

    public PrivFrame(String str, byte[] bArr) {
        super(A00(8, 4, 44));
        this.A00 = str;
        this.A01 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String[] strArr = A03;
        if (strArr[5].charAt(19) != strArr[3].charAt(19)) {
            throw new RuntimeException();
        }
        A03[4] = "JeawcksAQa4ynAsWuVOX1JtAVeeiU1J9";
        PrivFrame privFrame = (PrivFrame) obj;
        return AbstractC1600gE.A1E(this.A00, privFrame.A00) && Arrays.equals(this.A01, privFrame.A01);
    }

    public final int hashCode() {
        int result;
        int i = 17 * 31;
        if (this.A00 != null) {
            String str = this.A00;
            if (A03[4].charAt(2) == 's') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "doxGGfjLSyWPl3QgbX8rsTAn0Ut0hsEo";
            strArr[1] = "jV4jG42zpinEPWGl4x8bjXZWSaGIOVWh";
            result = str.hashCode();
        } else {
            result = 0;
        }
        return ((i + result) * 31) + Arrays.hashCode(this.A01);
    }

    @Override // com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(0, 8, 64) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A01);
    }
}
