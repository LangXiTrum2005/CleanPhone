package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2386l8 implements H1 {
    public static String[] A04 = {"sdKdmhexVnrlWGhX9TH5KtuHBxlX2", "B98Zkm438dg3YkwTFsWcwjYsIqopE2cW", "q7DFl2FydsE0DWNk8QJk98tFdBPGU17r", "uw89PlDwsU5CTp5ALy1o", "HmpI", "x0Unc4LQNUVImDERNKiE", "Klo4tVDdc3zNBBgsT3eAMryjwXw3w", "mmy2vPNb8zCZX"};
    public final int A00;
    public final int A01;
    public final C09384v A02 = new C09384v();
    public final AnonymousClass53 A03;

    public C2386l8(int i, AnonymousClass53 anonymousClass53, int i2) {
        this.A00 = i;
        this.A03 = anonymousClass53;
        this.A01 = i2;
    }

    private C1234Gz A00(C09384v c09384v, long j, long j2) {
        int iA00;
        int iA01;
        int iA0A = c09384v.A0A();
        long j3 = -1;
        long j4 = -1;
        long lastPcrTimeUsInRange = C.TIME_UNSET;
        while (c09384v.A07() >= 188 && (iA01 = (iA00 = LI.A00(c09384v.A0l(), c09384v.A09(), iA0A)) + Opcodes.NEWARRAY) <= iA0A) {
            long jA01 = LI.A01(c09384v, iA00, this.A00);
            if (jA01 != C.TIME_UNSET) {
                long jA06 = this.A03.A06(jA01);
                if (jA06 > j) {
                    String[] strArr = A04;
                    if (strArr[1].charAt(12) == strArr[2].charAt(12)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[3] = "aExFpEIrb6zE8t35yvld";
                    strArr2[5] = "jMLoot3yN0lnttWSwPI3";
                    if (lastPcrTimeUsInRange == C.TIME_UNSET) {
                        return C1234Gz.A04(jA06, j2);
                    }
                    return C1234Gz.A03(j2 + j3);
                }
                long j5 = jA06 + 100000;
                String[] strArr3 = A04;
                if (strArr3[1].charAt(12) != strArr3[2].charAt(12)) {
                    String[] strArr4 = A04;
                    strArr4[3] = "ZHgwZuqrkfLn2FTfbKUV";
                    strArr4[5] = "99YI6qOyfmrUQVvNk1ZB";
                    if (j5 > j) {
                        return C1234Gz.A03(((long) iA00) + j2);
                    }
                    j3 = iA00;
                    lastPcrTimeUsInRange = jA06;
                } else {
                    A04[4] = "5ynNf";
                    if (j5 > j) {
                        return C1234Gz.A03(((long) iA00) + j2);
                    }
                    j3 = iA00;
                    lastPcrTimeUsInRange = jA06;
                }
            }
            c09384v.A0f(iA01);
            j4 = iA01;
        }
        if (lastPcrTimeUsInRange != C.TIME_UNSET) {
            return C1234Gz.A05(lastPcrTimeUsInRange, j2 + j4);
        }
        return C1234Gz.A03;
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void AFs() {
        this.A02.A0i(C5C.A07);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final C1234Gz AIw(InterfaceC2482ms interfaceC2482ms, long j) throws IOException {
        long jA8n = interfaceC2482ms.A8n();
        int iMin = (int) Math.min(this.A01, interfaceC2482ms.A8O() - jA8n);
        this.A02.A0d(iMin);
        interfaceC2482ms.AGt(this.A02.A0l(), 0, iMin);
        return A00(this.A02, j, jA8n);
    }
}
