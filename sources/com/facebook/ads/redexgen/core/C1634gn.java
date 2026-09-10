package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1634gn {
    public static byte[] A0H;
    public static String[] A0I = {"du0GCr4iaKlN", "XUJMN7HLlR8SwTpbNsNPNMZ5RZTOiWXW", "0sczhz72jaJlPK1piHSSAP7JYHMpRYdd", "jaslWVB", "EO7", "zBgDjEllCd9lrdTjtkWGgDQC9YJUY5A", "kp3LPKAZ9agggr6ZIMLQuw7glHijHNcX", "k9tONJFkf4"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Surface A0C;
    public boolean A0D;
    public final C1612gR A0E = new C1612gR();
    public final InterfaceC1632gl A0F;
    public final ChoreographerFrameCallbackC1633gm A0G;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{10, 35, 22, 23, 33, 26, -43, 41, 36, -43, 38, 42, 26, 39, 46, -43, 25, 30, 40, 37, 33, 22, 46, -43, 39, 26, 27, 39, 26, 40, 29, -43, 39, 22, 41, 26, 23, 42, 37, 38, 48, 7, 51, 34, 46, 38, 19, 38, 45, 38, 34, 52, 38, 9, 38, 45, 49, 38, 51};
    }

    static {
        A06();
    }

    public C1634gn(Context context) {
        this.A0F = A01(context);
        this.A0G = this.A0F != null ? ChoreographerFrameCallbackC1633gm.A00() : null;
        this.A0A = C.TIME_UNSET;
        this.A0B = C.TIME_UNSET;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
        this.A04 = 0;
    }

    public static long A00(long j, long j2, long j3) {
        long j4;
        long vsyncCount = j3 * ((j - j2) / j3);
        long j5 = j2 + vsyncCount;
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j4 = j5;
            j5 += j3;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    public static InterfaceC1632gl A01(Context context) {
        C0944Ot c0944OtA01 = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (AbstractC1600gE.A02 >= 17) {
            c0944OtA01 = C0944Ot.A01(applicationContext);
        }
        if (c0944OtA01 == null) {
            return C0945Ou.A00(applicationContext);
        }
        return c0944OtA01;
    }

    private void A03() {
        if (AbstractC1600gE.A02 < 30 || this.A0C == null || this.A04 == Integer.MIN_VALUE || this.A03 == 0.0f) {
            return;
        }
        this.A03 = 0.0f;
        C1630gj.A02(this.A0C, 0.0f);
    }

    private void A04() {
        this.A05 = 0L;
        this.A06 = -1L;
        this.A08 = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    private void A05() {
        float fA00;
        float f;
        if (AbstractC1600gE.A02 < 30 || this.A0C == null) {
            return;
        }
        if (this.A0E.A06()) {
            C1612gR c1612gR = this.A0E;
            if (A0I[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[7] = "C6rxC3kvLt";
            strArr[5] = "vo2xOMhV5ZKnZ0I0h3bb2qC5TnGrU5d";
            fA00 = c1612gR.A00();
        } else {
            fA00 = this.A00;
        }
        float candidateFrameRate = this.A02;
        if (fA00 == candidateFrameRate) {
            return;
        }
        boolean z = true;
        if (fA00 != -1.0f) {
            float candidateFrameRate2 = this.A02;
            if (candidateFrameRate2 != -1.0f) {
                if (this.A0E.A06() && this.A0E.A03() >= 5000000000L) {
                    f = 0.02f;
                } else {
                    f = 1.0f;
                }
                float candidateFrameRate3 = this.A02;
                if (Math.abs(fA00 - candidateFrameRate3) < f) {
                    z = false;
                }
            } else if (fA00 != -1.0f) {
                z = true;
            } else if (this.A0E.A01() < 30) {
                z = false;
            }
        } else if (fA00 != -1.0f) {
            z = true;
        } else if (this.A0E.A01() < 30) {
            z = false;
        }
        if (z) {
            this.A02 = fA00;
            A09(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(Display display) {
        if (display != null) {
            double defaultDisplayRefreshRate = display.getRefreshRate();
            this.A0A = (long) (1.0E9d / defaultDisplayRefreshRate);
            this.A0B = (this.A0A * 80) / 100;
        } else {
            AbstractC1561fb.A07(A02(36, 23, 100), A02(0, 36, 88));
            this.A0A = C.TIME_UNSET;
            this.A0B = C.TIME_UNSET;
        }
    }

    private void A09(boolean z) {
        if (AbstractC1600gE.A02 < 30 || this.A0C == null || this.A04 == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.A0D) {
            float f2 = this.A02;
            String[] strArr = A0I;
            if (strArr[7].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[7] = "Y9Ko4sWw8N";
            strArr2[5] = "qvFzGTXBODJMyG5diREJF0pEl1MB9hx";
            if (f2 != -1.0f) {
                float f3 = this.A02;
                float surfacePlaybackFrameRate = this.A01;
                f = f3 * surfacePlaybackFrameRate;
            }
        }
        if (!z) {
            float surfacePlaybackFrameRate2 = this.A03;
            if (surfacePlaybackFrameRate2 == f) {
                return;
            }
        }
        this.A03 = f;
        C1630gj.A02(this.A0C, f);
    }

    public static boolean A0A(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    public final long A0B(long j) {
        long j2 = j;
        if (this.A06 != -1 && this.A0E.A06()) {
            long jA02 = this.A0E.A02();
            long frameDurationNs = this.A07;
            long j3 = this.A05;
            long adjustedReleaseTimeNs = this.A06;
            long frameDurationNs2 = frameDurationNs + ((long) (((j3 - adjustedReleaseTimeNs) * jA02) / this.A01));
            if (A0A(j2, frameDurationNs2)) {
                j2 = frameDurationNs2;
            } else {
                A04();
            }
        }
        long adjustedReleaseTimeNs2 = this.A05;
        this.A08 = adjustedReleaseTimeNs2;
        this.A09 = j2;
        if (this.A0G == null || this.A0A == C.TIME_UNSET) {
            return j2;
        }
        long j4 = this.A0G.A04;
        String[] strArr = A0I;
        if (strArr[2].charAt(9) != strArr[6].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[2] = "XZfN1sy6zag6ccWpZonCeAL6F7A2dhwP";
        strArr2[6] = "0Q65bcoMvaBytuYvigG0fUhEd63k8ySI";
        if (j4 == C.TIME_UNSET) {
            return j2;
        }
        long sampledVsyncTimeNs = A00(j2, j4, this.A0A);
        long adjustedReleaseTimeNs3 = this.A0B;
        return sampledVsyncTimeNs - adjustedReleaseTimeNs3;
    }

    public final void A0C() {
        A04();
    }

    public final void A0D() {
        this.A0D = true;
        A04();
        if (this.A0F != null) {
            ((ChoreographerFrameCallbackC1633gm) AbstractC1517es.A01(this.A0G)).A06();
            this.A0F.AGf(new InterfaceC1631gk() { // from class: com.facebook.ads.redexgen.X.Ov
                @Override // com.facebook.ads.redexgen.core.InterfaceC1631gk
                public final void ACs(Display display) {
                    this.A00.A07(display);
                }
            });
        }
        A09(false);
    }

    public final void A0E() {
        this.A0D = false;
        if (this.A0F != null) {
            this.A0F.AJb();
            ((ChoreographerFrameCallbackC1633gm) AbstractC1517es.A01(this.A0G)).A07();
        }
        A03();
        if (A0I[4].length() != 3) {
            throw new RuntimeException();
        }
        A0I[0] = "buU96Qzpfn7b";
    }

    public final void A0F(float f) {
        this.A00 = f;
        this.A0E.A04();
        A05();
    }

    public final void A0G(long j) {
        if (this.A08 != -1) {
            this.A06 = this.A08;
            long j2 = this.A09;
            if (A0I[1].charAt(1) != 'U') {
                throw new RuntimeException();
            }
            A0I[3] = "GaKGdyp";
            this.A07 = j2;
        }
        this.A05++;
        this.A0E.A05(1000 * j);
        A05();
    }
}
