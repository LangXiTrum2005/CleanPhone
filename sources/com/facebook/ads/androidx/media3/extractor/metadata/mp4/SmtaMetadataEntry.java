package com.facebook.ads.androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.core.AbstractC1245At;
import com.facebook.ads.redexgen.core.C2860qI;
import com.facebook.ads.redexgen.core.C3E;
import com.facebook.ads.redexgen.core.IS;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static byte[] A02;
    public static String[] A03 = {"YowUIYllSx7M6YCZVsXGshOnSOoLtc3h", "cbQDhaoj6BnnjM86BUfLE0DUXcchhogH", "2jGri3G66okxwB6aTtVFlcwUPMWoSDUh", "oqqvnpR2rXjWIfcGmkwLVz", "HP58ZBS", "5FsZYBr", "C83yH5O3JL7Th6ZwVIEMqTmMQGSsrvlo", "iqmiLlFC0cAnJcgIyeYDmB"};
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR;
    public final float A00;
    public final int A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{46, 34, 113, 116, 97, 86, 103, 111, 114, 109, 112, 99, 110, 78, 99, 123, 103, 112, 65, 109, 119, 108, 118, 63, 67, 93, 68, 81, 10, 16, 83, 81, 64, 68, 69, 66, 85, 118, 66, 81, 93, 85, 98, 81, 68, 85, 13};
        String[] strArr = A03;
        if (strArr[2].charAt(28) == strArr[1].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[2] = "UBLtj7Rjkge8uoQlelG8V5Ug9TCga9yn";
        strArr2[1] = "9YC8uwkWuRyKlQdVdfZWzcDmlZgaZ9BR";
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9a() {
        return C3E.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ C2860qI A9b() {
        return C3E.A00(this);
    }

    static {
        A01();
        CREATOR = new IS();
    }

    public SmtaMetadataEntry(float f, int i2) {
        this.A00 = f;
        this.A01 = i2;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, IS is) {
        this(parcel);
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
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        if (this.A00 == smtaMetadataEntry.A00) {
            int i2 = this.A01;
            int i3 = smtaMetadataEntry.A01;
            String[] strArr = A03;
            if (strArr[2].charAt(28) == strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "brpfHyQIMc9PLpoKo97tct";
            strArr2[3] = "b67853lh3a5iLFx744cZ7n";
            if (i2 == i3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = AbstractC1245At.A00(this.A00);
        return (((17 * 31) + result) * 31) + this.A01;
    }

    public final String toString() {
        return A00(24, 23, 55) + this.A00 + A00(0, 24, 5) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }
}
