package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1108Vm {
    public static String[] A0B = {"vqbiLoEhKys4aieq", "vX97iLQeaWcX1", "ItjShmGM6oyUC4uSf0mbO", "L3I4aeE5PLS", "FhMurB0WqmmBDxTj", "X", "VuFt7BNgawbHotzEa1ukcM", "QXR6byGu9hJJuZOC5o0Nv9NtX0Y2AOHa"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C1107Vl> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1108Vm A02(C1576fq c1576fq) {
        long jA0Q = c1576fq.A0Q();
        boolean z = (c1576fq.A0I() & 128) != 0;
        boolean z2 = false;
        boolean z3 = false;
        long jA0Q2 = C.TIME_UNSET;
        ArrayList arrayList = new ArrayList();
        int iA0M = 0;
        int iA0I = 0;
        int iA0I2 = 0;
        boolean z4 = false;
        long j = C.TIME_UNSET;
        if (!z) {
            int iA0I3 = c1576fq.A0I();
            z2 = (iA0I3 & 128) != 0;
            z3 = (iA0I3 & 64) != 0;
            boolean z5 = (iA0I3 & 32) != 0;
            if (z3) {
                jA0Q2 = c1576fq.A0Q();
            }
            if (!z3) {
                int iA0I4 = c1576fq.A0I();
                arrayList = new ArrayList(iA0I4);
                for (int i = 0; i < iA0I4; i++) {
                    arrayList.add(new C1107Vl(c1576fq.A0I(), c1576fq.A0Q(), null));
                }
            }
            if (z5) {
                long jA0I = c1576fq.A0I();
                z4 = (128 & jA0I) != 0;
                long jA0Q3 = ((1 & jA0I) << 32) | c1576fq.A0Q();
                if (A0B[7].charAt(30) == 'E') {
                    throw new RuntimeException();
                }
                A0B[3] = "tdltZI3J";
                j = (1000 * jA0Q3) / 90;
            }
            iA0M = c1576fq.A0M();
            iA0I = c1576fq.A0I();
            iA0I2 = c1576fq.A0I();
        }
        return new C1108Vm(jA0Q, z, z2, z3, arrayList, jA0Q2, z4, j, iA0M, iA0I, iA0I2);
    }

    public C1108Vm(long j, boolean z, boolean z2, boolean z3, List<C1107Vl> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.A04 = j;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j2;
        this.A07 = z4;
        this.A03 = j3;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public C1108Vm(Parcel parcel) {
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(C1107Vl.A00(parcel));
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static C1108Vm A00(Parcel parcel) {
        return new C1108Vm(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
