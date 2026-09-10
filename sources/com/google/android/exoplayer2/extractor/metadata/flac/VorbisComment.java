package com.google.android.exoplayer2.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC0974Px;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.VE;
import com.facebook.ads.redexgen.core.ZM;
import com.google.android.exoplayer2.Metadata;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static byte[] A02;
    public static String[] A03 = {"XFctrZXAKm4uljMLzO3PcBwOKv3K", "SCfwFn9Wo43Yq0xL", "Lrpyp3pIgc173FDkg4Ec3aelVuIulEy6", "YD8LDBMqvetzfMlKPXcHhnSpmSwM0pmr", "hOOP887", "ka5CmYy68Xf037hcGT3mhVIpFnxPhgNM", "jjn5Gs3ODIOX4m", "6Il7TUtSx33jq7Q"};
    public static final Parcelable.Creator<VorbisComment> CREATOR;
    public final String A00;
    public final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 27);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{63, 52, 33, 88, 66};
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
        CREATOR = new VE();
    }

    public VorbisComment(Parcel parcel) {
        this.A00 = (String) AbstractC1600gE.A0f(parcel.readString());
        this.A01 = (String) AbstractC1600gE.A0f(parcel.readString());
    }

    public VorbisComment(String str, String str2) {
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
        if (obj != null) {
            Class<?> cls = getClass();
            if (A03[1].length() == 3) {
                throw new RuntimeException();
            }
            A03[6] = "zw438AIvZeGpRtYZdJqtjVdL5jaFTNlQ";
            if (cls == obj.getClass()) {
                VorbisComment vorbisComment = (VorbisComment) obj;
                return this.A00.equals(vorbisComment.A00) && this.A01.equals(vorbisComment.A01);
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00.hashCode();
        return (((17 * 31) + result) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        return A00(1, 4, 121) + this.A00 + A00(0, 1, 25) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
