package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.metadata.id3.MlltFrame;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05849s implements InterfaceC1064Tn {
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Pair<Long, Long> A00(long j, long[] jArr, long[] jArr2) {
        int iA0L = AbstractC1600gE.A0L(jArr, j, true, true);
        long j2 = jArr[iA0L];
        long j3 = jArr2[iA0L];
        int i = iA0L + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr2[i] - j3) * (j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)))) + j3));
    }

    public C05849s(long[] jArr, long[] jArr2, long j) {
        this.A01 = jArr;
        this.A02 = jArr2;
        this.A00 = j == C.TIME_UNSET ? AbstractC1600gE.A0O(jArr2[jArr2.length - 1]) : j;
    }

    public static C05849s A01(long j, MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.A03.length;
        int referenceCount = length + 1;
        long[] jArr = new long[referenceCount];
        int referenceCount2 = length + 1;
        long[] jArr2 = new long[referenceCount2];
        jArr[0] = j;
        jArr2[0] = 0;
        long j3 = 0;
        for (int i = 1; i <= length; i++) {
            int referenceCount3 = i - 1;
            j += (long) (mlltFrame.A00 + mlltFrame.A03[referenceCount3]);
            int referenceCount4 = i - 1;
            j3 += (long) (mlltFrame.A01 + mlltFrame.A04[referenceCount4]);
            jArr[i] = j;
            jArr2[i] = j3;
        }
        return new C05849s(jArr, jArr2, j2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1064Tn
    public final long A7Z() {
        return -1L;
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final long A7j() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final C1082Ui A8r(long j) {
        Pair<Long, Long> pairA00 = A00(AbstractC1600gE.A0P(AbstractC1600gE.A0T(j, 0L, this.A00)), this.A02, this.A01);
        return new C1082Ui(new C1083Uk(AbstractC1600gE.A0O(((Long) pairA00.first).longValue()), ((Long) pairA00.second).longValue()));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1064Tn
    public final long A97(long j) {
        Pair<Long, Long> positionAndTimeMs = A00(j, this.A01, this.A02);
        return AbstractC1600gE.A0O(((Long) positionAndTimeMs.second).longValue());
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final boolean AAY() {
        return true;
    }
}
