package com.facebook.ads.androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.StreamKey;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static byte[] A04;
    public static String[] A05 = {"dWL5NZus448HlVN1g2vI4u5EATU39hAo", "Ig00thAwydWR5sbVXvrRGjlFjIN2O8J7", "jkNUubNrA3kuMGxf9Z6EfVeaas9OM69U", "EYKJogzwz3XUzBJ6M5pIp4", "kAMXbaxHTcvtkNk6pT6NuIpsMq0wtAm5", "DETMEqXpM2RL9RfuWccguPA2eDkJCyIw", "l4lmv0vVbQT1UVlO08Ifu3RnFv4eezi8", "GuIdMvOGKOFBnnXM1bTmuQpg4J0thJGn"};
    public static final Parcelable.Creator<StreamKey> CREATOR;
    public final int A00;
    public final int A01;
    public final int A02;

    @Deprecated
    public final int A03;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{102};
    }

    static {
        A02();
        CREATOR = new Parcelable.Creator<StreamKey>() { // from class: com.facebook.ads.redexgen.X.3f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final StreamKey createFromParcel(Parcel parcel) {
                return new StreamKey(parcel);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final StreamKey[] newArray(int i2) {
                return new StreamKey[i2];
            }
        };
    }

    public StreamKey(int i2, int i3, int i4) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = i4;
        this.A03 = i4;
    }

    public StreamKey(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = this.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(StreamKey streamKey) {
        int i2 = this.A01 - streamKey.A01;
        if (i2 == 0) {
            int i3 = this.A00;
            int result = streamKey.A00;
            int i4 = i3 - result;
            if (A05[3].length() == 16) {
                throw new RuntimeException();
            }
            A05[4] = "BMcfT7wTTEuICUupPfiGugxRU9d1aBTy";
            if (i4 == 0) {
                int i5 = this.A02;
                int result2 = streamKey.A02;
                return i5 - result2;
            }
            return i4;
        }
        return i2;
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
        StreamKey streamKey = (StreamKey) obj;
        return this.A01 == streamKey.A01 && this.A00 == streamKey.A00 && this.A02 == streamKey.A02;
    }

    public final int hashCode() {
        int result = this.A01;
        int i2 = result * 31;
        int result2 = this.A00;
        return ((i2 + result2) * 31) + this.A02;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(this.A01);
        String strA01 = A01(0, 1, 6);
        return sbAppend.append(strA01).append(this.A00).append(strA01).append(this.A02).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
    }
}
