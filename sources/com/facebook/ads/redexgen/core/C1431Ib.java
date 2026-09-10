package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1431Ib {
    public static String[] A0B = {"nEg82cXZVYZFfZdDmhKyBuPXw98CjCqr", "lWWNRS3KueXb9Tbf73wyUq3w1CVt7zYo", "9i1TifP67Pthfk8s9WN", "2Mfz8aUpVuODbM0LRRY7IzxNE33rrKDp", "lWmgQQDKaNBy8Pu2POQEfpeN2vAsVVBR", "WAUg7lL5KFyy4cAmNpLa1cxU0cT6TIeS", "jMg6XDLnbUHNrmDX3ZR", "RwGxvdCbKX59SF6mGNLLwZG43nCYkk8W"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C1430Ia> A06;
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
    public static C1431Ib A02(C11074v c11074v) {
        long jA0Q = c11074v.A0Q();
        boolean z2 = (c11074v.A0I() & 128) != 0;
        boolean z3 = false;
        boolean z4 = false;
        long jA0Q2 = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        int iA0M = 0;
        int iA0I = 0;
        int iA0I2 = 0;
        boolean z5 = false;
        long jA0Q3 = -9223372036854775807L;
        if (!z2) {
            int iA0I3 = c11074v.A0I();
            z3 = (iA0I3 & 128) != 0;
            z4 = (iA0I3 & 64) != 0;
            if (A0B[3].charAt(19) != '7') {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[0] = "nLO0WJRxYuU9qthfzcYyP1P8ccIGaxOi";
            strArr[1] = "OIpoqKTSq2Ia2FsBUXzy5KxMNemzaoxr";
            boolean z6 = (iA0I3 & 32) != 0;
            jA0Q2 = z4 ? c11074v.A0Q() : -9223372036854775807L;
            if (!z4) {
                int iA0I4 = c11074v.A0I();
                arrayList = new ArrayList(iA0I4);
                for (int i2 = 0; i2 < iA0I4; i2++) {
                    arrayList.add(new C1430Ia(c11074v.A0I(), c11074v.A0Q(), null));
                }
                if (A0B[3].charAt(19) == '7') {
                    A0B[4] = "ZIJV8CxCO5lc3X0ct1XMotdLhBio9GzL";
                }
            }
            if (z6) {
                long jA0I = c11074v.A0I();
                z5 = (128 & jA0I) != 0;
                jA0Q3 = (1000 * (((1 & jA0I) << 32) | c11074v.A0Q())) / 90;
            }
            iA0M = c11074v.A0M();
            iA0I = c11074v.A0I();
            iA0I2 = c11074v.A0I();
        }
        return new C1431Ib(jA0Q, z2, z3, z4, arrayList, jA0Q2, z5, jA0Q3, iA0M, iA0I, iA0I2);
    }

    public C1431Ib(long j, boolean z2, boolean z3, boolean z4, List<C1430Ia> list, long j2, boolean z5, long j3, int i2, int i3, int i4) {
        this.A04 = j;
        this.A0A = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j2;
        this.A07 = z5;
        this.A03 = j3;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public C1431Ib(Parcel parcel) {
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(C1430Ia.A00(parcel));
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

    public static C1431Ib A00(Parcel parcel) {
        return new C1431Ib(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.A06.get(i2).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
