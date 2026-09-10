package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0953Pc {
    public static String[] A09 = {"oH4mHz2pmoMiEmc", "FNnwe5pJ48jBDdyzrfy", "6B3Y16y0oyhN5n9w", "0LPEPW7cAqu8cdAaUOAifWzDrdWvA4ed", "b6drlksjVl1B6bfFfedPuk9JlcDFBzJg", "ZVWY1Q73NT7HgNsMpy9iivry", "uYXuyOCWh1KLssimYtHGEnprWxDEnyld", "Kp5WLk0jwa2GMs2962k8TW1mcd7PBbuS"};
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final R5 A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Must be removed when ExoPlayerImpl V1 is deprecated")
    public C0953Pc(R5 r5, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.A04 = r5;
        this.A03 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A00 = j4;
        this.A07 = z;
        this.A05 = z2;
        this.A06 = false;
        this.A08 = false;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Disable Assertions for now as the ones related to isFollowedByTransitionToSameStream & isLastInTimelineWindow are not applicable toExoPlayerImpl v1")
    public C0953Pc(R5 r5, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = r5;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = j3;
        this.A00 = j4;
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A05 = z4;
    }

    public final C0953Pc A00(long j) {
        if (j == this.A03) {
            return this;
        }
        return new C0953Pc(this.A04, j, this.A02, this.A01, this.A00, this.A06, this.A07, this.A08, this.A05);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A09;
        if (strArr[6].charAt(15) != strArr[4].charAt(15)) {
            String[] strArr2 = A09;
            strArr2[3] = "5qDW46fdkntaa2I2c4parXmNNddUkaHF";
            strArr2[7] = "1ybQXEasfJacqOGwnHGNPOc7Idy6z8MR";
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0953Pc c0953Pc = (C0953Pc) obj;
            if (this.A03 == c0953Pc.A03) {
                long j = this.A02;
                long j2 = c0953Pc.A02;
                String[] strArr3 = A09;
                if (strArr3[6].charAt(15) == strArr3[4].charAt(15)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A09;
                strArr4[6] = "IMgb9po9jresJudIxLpuePSWQs5iSLwI";
                strArr4[4] = "1mRX5mnTGstlct0VA6vX9qQm2d1X403J";
                if (j == j2 && this.A01 == c0953Pc.A01 && this.A00 == c0953Pc.A00) {
                    boolean z = this.A06;
                    String[] strArr5 = A09;
                    if (strArr5[3].charAt(25) == strArr5[7].charAt(25)) {
                        String[] strArr6 = A09;
                        strArr6[3] = "KFji7aL2L9bN6bYws6YHIKeewdZbRutM";
                        strArr6[7] = "5jbbfSHUiwRjxklt5tp9byAywdKGdbz8";
                        if (z == c0953Pc.A06 && this.A07 == c0953Pc.A07 && this.A08 == c0953Pc.A08 && this.A05 == c0953Pc.A05 && AbstractC1600gE.A1E(this.A04, c0953Pc.A04)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new RuntimeException();
    }

    public final int hashCode() {
        return (((((((((((((((((17 * 31) + this.A04.hashCode()) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + ((int) this.A01)) * 31) + ((int) this.A00)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0);
    }
}
