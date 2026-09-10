package com.google.android.exoplayer2.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC0974Px;
import com.facebook.ads.redexgen.core.AbstractC1517es;
import com.facebook.ads.redexgen.core.VH;
import com.facebook.ads.redexgen.core.ZM;
import com.google.android.exoplayer2.Metadata;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IcyInfo implements Metadata.Entry {
    public static byte[] A03;
    public static String[] A04 = {"Zng8oGJmVE4Mf4", "Qb38moAIi05XWO4LIwoWINBS7KSoc6AH", "EZdTlSgs2DBmrr6hoJDclxewvVeIM4WM", "IUq8t7X57byDvT80MlkG0U", "PLYYouVTir3unf", "QL5otPsOS2ctCQzUpWfMdpn7ovvEXYGX", "S9X3oW4lbCFVgCi5xR4NZ8i0XKELf0", "TeMWYaZNtnHTX4uB45AGqCMTUKNO528u"};
    public static final Parcelable.Creator<IcyInfo> CREATOR;
    public final String A00;
    public final String A01;
    public final byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{71, 77, 87, 52, 46, 122, 103, 122, 98, 107, 51, 44, 43, 125, 44, 34, 46, 123, 124, 98, 51, 44, 43, 125, 44, 34, 46, 124, 111, 121, 67, 107, 122, 111, 106, 111, 122, 111, 32, 98, 107, 96, 105, 122, 102, 51, 44, 43, 125, 44};
    }

    @Override // com.google.android.exoplayer2.Metadata.Entry
    public final /* synthetic */ byte[] A9Q() {
        return AbstractC0974Px.A01(this);
    }

    @Override // com.google.android.exoplayer2.Metadata.Entry
    public final /* synthetic */ ZM A9R() {
        return AbstractC0974Px.A00(this);
    }

    static {
        A01();
        CREATOR = new VH();
    }

    public IcyInfo(Parcel parcel) {
        this.A02 = (byte[]) AbstractC1517es.A01(parcel.createByteArray());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.A02 = bArr;
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Class<?> cls = getClass();
        Class<?> cls2 = obj.getClass();
        String[] strArr = A04;
        if (strArr[5].charAt(9) == strArr[2].charAt(9)) {
            throw new RuntimeException();
        }
        A04[3] = "ScW6PQeXjrvrzPKjYurzgtnSap";
        if (cls != cls2) {
            return false;
        }
        return Arrays.equals(this.A02, ((IcyInfo) obj).A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A02);
    }

    public final String toString() {
        return String.format(A00(0, 50, 17), this.A00, this.A01, Integer.valueOf(this.A02.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
