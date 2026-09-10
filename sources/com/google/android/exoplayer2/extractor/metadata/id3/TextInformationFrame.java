package com.google.android.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC1517es;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections;
import com.facebook.ads.redexgen.core.VU;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TextInformationFrame extends Id3Frame {
    public static byte[] A03;
    public static String[] A04 = {"eYdP6wMXKjNHffddsoBNLzbpcb1ryWIP", "VFvJyhJIAU6kHuPkzlszUSMPaMBiI", "eNTf4aoR5hwMucgUObpVjkVt3ursadB8", "VZXjGPAWHZipwaOI4DFiNrUQ1InPcgxU", "vB3xD6HUS8zk0gfl4cWzh6sLebtx627L", "kky35eVW6L3DxbetmiwiZkzqPVLM4zff", "14OBReQQH7pDPylSoxCCQ1", "T7"};
    public static final Parcelable.Creator<TextInformationFrame> CREATOR;
    public final String A00;

    @Deprecated
    public final String A01;

    @MetaExoPlayerCustomization("Replaces ImmutableList with MetaExoPlayerCustomizedCollections")
    public final List<String> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[2].charAt(26) != 'r') {
                throw new RuntimeException();
            }
            A04[5] = "RAXe7MX5PLIAVEW0a56SEhjuUo0UaVe5";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 13);
            if (A04[0].charAt(1) == 'W') {
                throw new RuntimeException();
            }
            A04[0] = "mRI4kzSBsvqA1ydRmzrWu8OtYPE3oTVW";
            bArrCopyOfRange[i4] = b;
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{-116, 114, -74, -73, -59, -75, -60, -69, -62, -58, -69, -63, -64, -113, 115, 89, -81, -102, -91, -82, -98, -84, 118};
    }

    static {
        A01();
        CREATOR = new VU();
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.copyOf with MetaExoPlayerCustomizedCollections")
    public TextInformationFrame(Parcel parcel) {
        this((String) AbstractC1517es.A01(parcel.readString()), parcel.readString(), MetaExoPlayerCustomizedCollections.A02((String[]) AbstractC1517es.A01(parcel.createStringArray())));
    }

    public /* synthetic */ TextInformationFrame(Parcel parcel, VU vu) {
        this(parcel);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.copyOf with MetaExoPlayerCustomizedCollections")
    public TextInformationFrame(String str, String str2, List<String> values) {
        super(str);
        AbstractC1517es.A07(!values.isEmpty());
        this.A00 = str2;
        this.A02 = MetaExoPlayerCustomizedCollections.A02((String[]) values.toArray(new String[0]));
        this.A01 = this.A02.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (AbstractC1600gE.A1E(super.A00, ((Id3Frame) textInformationFrame).A00) && AbstractC1600gE.A1E(this.A00, textInformationFrame.A00) && this.A02.equals(textInformationFrame.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        int result2 = ((((17 * 31) + result) * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31;
        int result3 = this.A02.hashCode();
        return result2 + result3;
    }

    @Override // com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(0, 14, 69) + this.A00 + A00(14, 9, 44) + this.A02;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeStringArray((String[]) this.A02.toArray(new String[0]));
    }
}
