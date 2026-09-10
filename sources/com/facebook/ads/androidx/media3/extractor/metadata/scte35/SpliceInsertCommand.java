package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AnonymousClass53;
import com.facebook.ads.redexgen.core.C11074v;
import com.facebook.ads.redexgen.core.IW;
import com.facebook.ads.redexgen.core.IX;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"2fVUWVW5Hj7LHoGITBtqA0sUitS4PTb4", "Q8qvKmypWvqXriKcaeBTncTBfq8seygK", "PB3TBbluvnbAoPy", "V5r7AKyrTxu4nkwu31wVya7iCL5S2t7X", "ptiIvLXZk7optwegrSJTcSLpf9JtKnje", "Im1w1jT", "8VlbtMqcAJkMoCkUmgZltZaiEM6o3", "PsL5EDhhHapqBInAVo5dkvRq7GvOLwYr"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new IW();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<IX> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public SpliceInsertCommand(long j, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, List<IX> list, boolean z6, long j4, int i2, int i3, int i4) {
        this.A06 = j;
        this.A0B = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A0C = z5;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z6;
        this.A03 = j4;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(IX.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        int componentSpliceListSize = parcel.readByte();
        this.A08 = componentSpliceListSize == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListSize2 = parcel.readInt();
        this.A02 = componentSpliceListSize2;
        int componentSpliceListSize3 = parcel.readInt();
        this.A00 = componentSpliceListSize3;
        int componentSpliceListSize4 = parcel.readInt();
        this.A01 = componentSpliceListSize4;
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, IW iw) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(C11074v c11074v, long j, AnonymousClass53 anonymousClass53) {
        long jA0Q = c11074v.A0Q();
        boolean z2 = (c11074v.A0I() & 128) != 0;
        boolean z3 = false;
        boolean outOfNetworkIndicator = false;
        boolean z4 = false;
        long jA00 = -9223372036854775807L;
        List listEmptyList = Collections.emptyList();
        if (A0D[6].length() == 19) {
            throw new RuntimeException();
        }
        A0D[4] = "mssbEGkdhdKHHgY1hMK2RaJspuJCG0bt";
        int iA0M = 0;
        int iA0I = 0;
        int iA0I2 = 0;
        boolean z5 = false;
        long jA0Q2 = -9223372036854775807L;
        if (!z2) {
            int iA0I3 = c11074v.A0I();
            z3 = (iA0I3 & 128) != 0;
            outOfNetworkIndicator = (iA0I3 & 64) != 0;
            boolean autoReturn = (iA0I3 & 32) != 0;
            z4 = (iA0I3 & 16) != 0;
            if (outOfNetworkIndicator && !z4) {
                jA00 = TimeSignalCommand.A00(c11074v, j);
            }
            if (!outOfNetworkIndicator) {
                int componentCount = c11074v.A0I();
                listEmptyList = new ArrayList(componentCount);
                for (int i2 = 0; i2 < componentCount; i2++) {
                    int componentTag = c11074v.A0I();
                    long jA01 = -9223372036854775807L;
                    if (!z4) {
                        jA01 = TimeSignalCommand.A00(c11074v, j);
                    }
                    listEmptyList.add(new IX(componentTag, jA01, anonymousClass53.A06(jA01), null));
                }
            }
            if (autoReturn) {
                long jA0I = c11074v.A0I();
                z5 = (jA0I & 128) != 0;
                jA0Q2 = (1000 * (((jA0I & 1) << 32) | c11074v.A0Q())) / 90;
            }
            iA0M = c11074v.A0M();
            iA0I = c11074v.A0I();
            iA0I2 = c11074v.A0I();
        }
        return new SpliceInsertCommand(jA0Q, z2, z3, outOfNetworkIndicator, z4, jA00, anonymousClass53.A06(jA00), listEmptyList, z5, jA0Q2, iA0M, iA0I, iA0I2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.A07.get(i3).A01(parcel);
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "b82jUGYrdOItwNOnrxCotui81UmrwpK";
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
