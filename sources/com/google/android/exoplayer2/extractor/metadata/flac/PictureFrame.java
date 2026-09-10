package com.google.android.exoplayer2.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC0974Px;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.AbstractC1686hd;
import com.facebook.ads.redexgen.core.C1576fq;
import com.facebook.ads.redexgen.core.VD;
import com.facebook.ads.redexgen.core.ZM;
import com.google.android.exoplayer2.Metadata;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PictureFrame implements Metadata.Entry {
    public static byte[] A08;
    public static final Parcelable.Creator<PictureFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static PictureFrame A00(C1576fq c1576fq) {
        int iA0C = c1576fq.A0C();
        String strA0X = c1576fq.A0X(c1576fq.A0C(), AbstractC1686hd.A02);
        String strA0W = c1576fq.A0W(c1576fq.A0C());
        int iA0C2 = c1576fq.A0C();
        int iA0C3 = c1576fq.A0C();
        int iA0C4 = c1576fq.A0C();
        int iA0C5 = c1576fq.A0C();
        int iA0C6 = c1576fq.A0C();
        byte[] bArr = new byte[iA0C6];
        c1576fq.A0k(bArr, 0, iA0C6);
        return new PictureFrame(iA0C, strA0X, strA0W, iA0C2, iA0C3, iA0C4, iA0C5, bArr);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{50, 62, 122, 123, 109, 125, 108, 119, 110, 106, 119, 113, 112, 35, 122, 67, 73, 94, 95, 88, 79, cw.n, 10, 71, 67, 71, 79, 126, 83, 90, 79, 23};
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
        A02();
        CREATOR = new VD();
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.A03 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A07 = bArr;
    }

    public PictureFrame(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A06 = (String) AbstractC1600gE.A0f(parcel.readString());
        this.A05 = (String) AbstractC1600gE.A0f(parcel.readString());
        this.A04 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = (byte[]) AbstractC1600gE.A0f(parcel.createByteArray());
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
        PictureFrame pictureFrame = (PictureFrame) obj;
        if (this.A03 == pictureFrame.A03 && this.A06.equals(pictureFrame.A06) && this.A05.equals(pictureFrame.A05) && this.A04 == pictureFrame.A04 && this.A02 == pictureFrame.A02 && this.A01 == pictureFrame.A01 && this.A00 == pictureFrame.A00 && Arrays.equals(this.A07, pictureFrame.A07)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A03;
        int result2 = ((((17 * 31) + result) * 31) + this.A06.hashCode()) * 31;
        int result3 = this.A05.hashCode();
        int result4 = (((result2 + result3) * 31) + this.A04) * 31;
        int result5 = this.A02;
        int result6 = (((result4 + result5) * 31) + this.A01) * 31;
        int result7 = this.A00;
        return ((result6 + result7) * 31) + Arrays.hashCode(this.A07);
    }

    public final String toString() {
        return A01(14, 18, 17) + this.A06 + A01(0, 14, 37) + this.A05;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A07);
    }
}
