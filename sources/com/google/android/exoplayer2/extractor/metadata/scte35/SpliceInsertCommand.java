package com.google.android.exoplayer2.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.C1103Vh;
import com.facebook.ads.redexgen.core.C1104Vi;
import com.facebook.ads.redexgen.core.C1576fq;
import com.facebook.ads.redexgen.core.C1590g4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"1gMfdHoLkKNhoCqhKe6qLfiJGSezJg8B", "zm2SBnMS5XNjZWSMsupBhea4HrWKdVyh", "faixS", "WVnIPxdl1TSIJGfqykPYzP6CfEVxBQdv", "xhcz4JkMNye8fJUllYlgDZiPzZjPPz0A", "Ic16CYMI8HSWlFRdvoHz5Qnkj4K9zu22", "", "tI1rP6AVkVHBDDKgUCtZIqVKSC49N82u"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C1103Vh();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<C1104Vi> A07;
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
    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C1104Vi> list, boolean z5, long j4, int i, int i2, int i3) {
        this.A06 = j;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z5;
        this.A03 = j4;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(C1104Vi.A00(parcel));
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

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C1103Vh c1103Vh) {
        this(parcel);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    public static SpliceInsertCommand A00(C1576fq c1576fq, long j, C1590g4 c1590g4) {
        long jA0Q = c1576fq.A0Q();
        boolean z = (c1576fq.A0I() & 128) != 0;
        boolean z2 = false;
        boolean outOfNetworkIndicator = false;
        boolean z3 = false;
        long jA00 = C.TIME_UNSET;
        List listEmptyList = Collections.emptyList();
        int iA0M = 0;
        int iA0I = 0;
        int iA0I2 = 0;
        boolean z4 = false;
        long jA0Q2 = C.TIME_UNSET;
        if (!z) {
            int iA0I3 = c1576fq.A0I();
            int i = iA0I3 & 128;
            String[] strArr = A0D;
            if (strArr[5].charAt(6) != strArr[1].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[5] = "RRkPRxMt4p5wsBMtKMPH3o3saASndoXF";
            strArr2[1] = "wqwEWmMivAv4AjDjsShLqU6lhNJcPI2x";
            if (i != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            outOfNetworkIndicator = (iA0I3 & 64) != 0;
            boolean autoReturn = (iA0I3 & 32) != 0;
            int i2 = iA0I3 & 16;
            if (A0D[7].charAt(17) == 'C') {
                String[] strArr3 = A0D;
                strArr3[5] = "zqCweJMpwqTXp5wnQTYDdiwzAZUpoZyw";
                strArr3[1] = "AppPoIMQNza5SHcyszjW0ywtoEO4XkFV";
                if (i2 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else if (i2 != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (outOfNetworkIndicator && !z3) {
                jA00 = TimeSignalCommand.A00(c1576fq, j);
            }
            if (!outOfNetworkIndicator) {
                int componentCount = c1576fq.A0I();
                listEmptyList = new ArrayList(componentCount);
                for (int i3 = 0; i3 < componentCount; i3++) {
                    int componentTag = c1576fq.A0I();
                    long jA01 = C.TIME_UNSET;
                    if (!z3) {
                        jA01 = TimeSignalCommand.A00(c1576fq, j);
                    }
                    listEmptyList.add(new C1104Vi(componentTag, jA01, c1590g4.A06(jA01), null));
                }
            }
            if (autoReturn) {
                long jA0I = c1576fq.A0I();
                z4 = (jA0I & 128) != 0;
                jA0Q2 = (1000 * (((jA0I & 1) << 32) | c1576fq.A0Q())) / 90;
            }
            iA0M = c1576fq.A0M();
            iA0I = c1576fq.A0I();
            iA0I2 = c1576fq.A0I();
        }
        return new SpliceInsertCommand(jA0Q, z, z2, outOfNetworkIndicator, z3, jA00, c1590g4.A06(jA00), listEmptyList, z4, jA0Q2, iA0M, iA0I, iA0I2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.A07.get(i2).A01(parcel);
            String[] strArr = A0D;
            if (strArr[0].charAt(26) == strArr[3].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[0] = "acdZtyKQWwFOkb0LeuSSK6oVpigTtFwS";
            strArr2[3] = "oW2YHXdWM7oaa9PVsYpqNd9hNaJbSWC6";
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        if (A0D[4].charAt(28) != 'P') {
            throw new RuntimeException();
        }
        A0D[7] = "buqtg1B9heztt2PcICLF7S0iD4uzSUde";
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
