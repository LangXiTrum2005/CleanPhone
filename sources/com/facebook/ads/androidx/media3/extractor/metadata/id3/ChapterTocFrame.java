package com.facebook.ads.androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.C5C;
import com.facebook.ads.redexgen.core.IB;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static byte[] A05;
    public static String[] A06 = {"41NC5", "0J", "e5KnEwX30al5HhEfsapKBEHe3tkNzIRg", "hjAEStB30D9jY", "8lRM69KUqjxin5EqodPaG36", "AeGUWh3YVhB7McaTEUzGpI1", "ViWv54Lb", "YmmztsHdSeGoBz"};
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR;
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final String[] A03;
    public final Id3Frame[] A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-19, -2, -7, -19};
    }

    static {
        A01();
        CREATOR = new IB();
    }

    public ChapterTocFrame(Parcel parcel) {
        super(A00(0, 4, 110));
        this.A00 = (String) C5C.A0f(parcel.readString());
        this.A02 = parcel.readByte() != 0;
        this.A01 = parcel.readByte() != 0;
        this.A03 = (String[]) C5C.A0f(parcel.createStringArray());
        int i2 = parcel.readInt();
        this.A04 = new Id3Frame[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.A04[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z2, boolean z3, String[] strArr, Id3Frame[] id3FrameArr) {
        super(A00(0, 4, 110));
        this.A00 = str;
        this.A02 = z2;
        this.A01 = z3;
        this.A03 = strArr;
        this.A04 = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            if (A06[1].length() == 8) {
                throw new RuntimeException();
            }
            A06[2] = "Y5qiRripW3638QaK8HmAYdCRHbvBTlaE";
            if (cls == obj.getClass()) {
                ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
                String[] strArr = A06;
                if (strArr[7].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[7] = "3ADh3DGYZ0lZXq";
                strArr2[3] = "8CiyD2GMUXgUE";
                if (this.A02 == chapterTocFrame.A02 && this.A01 == chapterTocFrame.A01 && C5C.A1E(this.A00, chapterTocFrame.A00) && Arrays.equals(this.A03, chapterTocFrame.A03) && Arrays.equals(this.A04, chapterTocFrame.A04)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((17 * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A00 != null ? this.A00.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
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
