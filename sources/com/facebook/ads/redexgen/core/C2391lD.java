package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2391lD implements H1 {
    public static String[] A02 = {"icMuAGNUwG3qooMsLkIelsXOgqR", "wZwGdqwzUfLFhHeDnVqZXfrekI2t19Nm", "6NjHclQwJEhKen4shQzzT38fKShvFJl3", "cwvHChui6ScrilPVLNLxDwwq1RZibmTM", "KGSyfhH5I6lVnEy0NkdKQy5Ija", "JgLMaajFBM7mBqcCk", "W9ygPHkeZ", ""};
    public final C09384v A00;
    public final AnonymousClass53 A01;

    public C2391lD(AnonymousClass53 anonymousClass53) {
        this.A01 = anonymousClass53;
        this.A00 = new C09384v();
    }

    private C1234Gz A00(C09384v c09384v, long scrValue, long scrTimeUs) {
        int iA09 = -1;
        int iA010 = -1;
        long j = C.TIME_UNSET;
        while (c09384v.A07() >= 4) {
            if (C2390lC.A00(c09384v.A0l(), c09384v.A09()) != 442) {
                c09384v.A0g(1);
            } else {
                c09384v.A0g(4);
                long jA06 = L6.A06(c09384v);
                if (jA06 != C.TIME_UNSET) {
                    long jA07 = this.A01.A06(jA06);
                    if (jA07 > scrValue) {
                        if (j == C.TIME_UNSET) {
                            return C1234Gz.A04(jA07, scrTimeUs);
                        }
                        return C1234Gz.A03(((long) iA09) + scrTimeUs);
                    }
                    int startOfLastPacketPosition = A02[1].charAt(26);
                    if (startOfLastPacketPosition == 113) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[3] = "JRu5yfiOOmZm3e1j9KGmxzziCqUEhgmX";
                    strArr[2] = "rPvZuTIICj36zhJU166yjphfEhohU7nm";
                    long lastScrTimeUsInRange = 100000 + jA07;
                    if (lastScrTimeUsInRange > scrValue) {
                        return C1234Gz.A03(((long) c09384v.A09()) + scrTimeUs);
                    }
                    j = jA07;
                    iA09 = c09384v.A09();
                }
                A01(c09384v);
                iA010 = c09384v.A09();
            }
        }
        if (j != C.TIME_UNSET) {
            return C1234Gz.A05(j, ((long) iA010) + scrTimeUs);
        }
        return C1234Gz.A03;
    }

    public static void A01(C09384v c09384v) {
        int systemHeaderLength = c09384v.A0A();
        if (c09384v.A07() < 10) {
            c09384v.A0f(systemHeaderLength);
            return;
        }
        c09384v.A0g(9);
        int limit = c09384v.A0I();
        int packStuffingLength = limit & 7;
        int limit2 = c09384v.A07();
        if (limit2 < packStuffingLength) {
            c09384v.A0f(systemHeaderLength);
            return;
        }
        c09384v.A0g(packStuffingLength);
        int limit3 = c09384v.A07();
        if (limit3 < 4) {
            c09384v.A0f(systemHeaderLength);
            return;
        }
        byte[] bArrA0l = c09384v.A0l();
        int limit4 = c09384v.A09();
        if (C2390lC.A00(bArrA0l, limit4) == 443) {
            c09384v.A0g(4);
            int packStuffingLength2 = c09384v.A0M();
            int limit5 = c09384v.A07();
            if (limit5 < packStuffingLength2) {
                c09384v.A0f(systemHeaderLength);
                return;
            }
            c09384v.A0g(packStuffingLength2);
        }
        while (limit >= 4) {
            byte[] bArrA0l2 = c09384v.A0l();
            int limit6 = c09384v.A09();
            int packStuffingLength3 = C2390lC.A00(bArrA0l2, limit6);
            if (packStuffingLength3 == 442 || packStuffingLength3 == 441 || (packStuffingLength3 >>> 8) != 1) {
                return;
            }
            c09384v.A0g(4);
            if (c09384v.A07() < 2) {
                c09384v.A0f(systemHeaderLength);
                return;
            }
            int nextStartCode = c09384v.A0M();
            int packStuffingLength4 = c09384v.A0A();
            int limit7 = c09384v.A09();
            c09384v.A0f(Math.min(packStuffingLength4, limit7 + nextStartCode));
        }
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void AFs() {
        this.A00.A0i(C5C.A07);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final C1234Gz AIw(InterfaceC2482ms interfaceC2482ms, long j) throws IOException {
        long jA8n = interfaceC2482ms.A8n();
        int iMin = (int) Math.min(20000L, interfaceC2482ms.A8O() - jA8n);
        this.A00.A0d(iMin);
        interfaceC2482ms.AGt(this.A00.A0l(), 0, iMin);
        return A00(this.A00, j, jA8n);
    }
}
