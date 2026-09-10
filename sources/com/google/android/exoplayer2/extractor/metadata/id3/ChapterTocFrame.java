package com.google.android.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.VM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static byte[] A05;
    public static String[] A06 = {"s66Mul4RatCR8WjzArp5mGbIA4NHgNPm", "", "ExzOZBwKbvLDiJSNjXAmu1pXR8NqrMSY", "zU5KkNULb26Ax66XN1ebaihzwqwv7iMS", "AmtLMqWIzW9JmW0p9nfcp6Uk83awao68", "H4LNpFLimgWCZ2855WxLzQv0BFUvsq4T", "", "wxnGnBd7x379otnUaOxDUVqjqUKdfNSk"};
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR;
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final String[] A03;
    public final Id3Frame[] A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-59, -42, -47, -59};
    }

    static {
        A01();
        CREATOR = new VM();
    }

    public ChapterTocFrame(Parcel parcel) {
        super(A00(0, 4, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE));
        this.A00 = (String) AbstractC1600gE.A0f(parcel.readString());
        this.A02 = parcel.readByte() != 0;
        this.A01 = parcel.readByte() != 0;
        this.A03 = (String[]) AbstractC1600gE.A0f(parcel.createStringArray());
        int i = parcel.readInt();
        this.A04 = new Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.A04[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super(A00(0, 4, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE));
        this.A00 = str;
        this.A02 = z;
        this.A01 = z2;
        this.A03 = strArr;
        this.A04 = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        if (this.A02 == chapterTocFrame.A02 && this.A01 == chapterTocFrame.A01 && AbstractC1600gE.A1E(this.A00, chapterTocFrame.A00) && Arrays.equals(this.A03, chapterTocFrame.A03) && Arrays.equals(this.A04, chapterTocFrame.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i = ((((17 * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31;
        if (this.A00 != null) {
            String str = this.A00;
            String[] strArr = A06;
            if (strArr[0].charAt(3) == strArr[4].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[6] = "";
            strArr2[1] = "";
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        return i + iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.A03);
        parcel.writeInt(this.A04.length);
        for (Id3Frame id3Frame : this.A04) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
