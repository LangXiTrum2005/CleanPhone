package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1590g4 {
    public long A00;
    public long A01;
    public long A02;
    public final ThreadLocal<Long> A03 = new ThreadLocal<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized long A06(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.A01 != C.TIME_UNSET) {
            long jA01 = A01(this.A01);
            long j2 = (4294967296L + jA01) / 8589934592L;
            long j3 = ((j2 - 1) * 8589934592L) + j;
            long j4 = (8589934592L * j2) + j;
            if (Math.abs(j3 - jA01) >= Math.abs(j4 - jA01)) {
                j3 = j4;
            }
            j = j3;
        }
        return A05(A00(j));
    }

    public C1590g4(long j) {
        A07(j);
    }

    public static long A00(long j) {
        return (1000000 * j) / 90000;
    }

    public static long A01(long j) {
        return (90000 * j) / 1000000;
    }

    public final synchronized long A02() {
        long j;
        if (this.A00 != Long.MAX_VALUE && this.A00 != 9223372036854775806L) {
            j = this.A00;
        } else {
            j = C.TIME_UNSET;
        }
        return j;
    }

    public final synchronized long A03() {
        long jA02;
        if (this.A01 != C.TIME_UNSET) {
            jA02 = this.A01 + this.A02;
        } else {
            jA02 = A02();
        }
        return jA02;
    }

    public final synchronized long A04() {
        return this.A02;
    }

    public final synchronized long A05(long j) {
        long desiredSampleTimestampUs;
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        if (this.A02 == C.TIME_UNSET) {
            if (this.A00 == 9223372036854775806L) {
                desiredSampleTimestampUs = ((Long) AbstractC1517es.A01(this.A03.get())).longValue();
            } else {
                desiredSampleTimestampUs = this.A00;
            }
            this.A02 = desiredSampleTimestampUs - j;
            notifyAll();
        }
        this.A01 = j;
        return this.A02 + j;
    }

    public final synchronized void A07(long j) {
        this.A00 = j;
        this.A02 = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.A01 = C.TIME_UNSET;
    }
}
