package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1637gq {
    public static byte[] A0C;
    public static String[] A0D = {"G0Xt1hU7GwyJNrFWcYXDlV7NHLd7AFuq", "EZuZfACubY5qCrwPH", "9Cjlaq2lcIphQDKbLaFiZJQxIkLEs3fA", "aYyLs8We2y2dcYtIZcauluAIHMmFPeGS", "0PfaleH7zsMcRSzoYEDIJe6b8xxc2YZu", "hsW633r3gli70EacxNkef7UV1MpIu3qL", "ELpBWJma7iXhMXUG5x0D6yXjvwZkRb9a", "YYueXBeJXqvyV8fFsSM3b0EWa6ucq9wU"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final C1635go A0A;
    public final ChoreographerFrameCallbackC1636gp A0B;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{98, 111, 117, 118, 106, 103, 127, 105, 119, 112, 122, 113, 105};
    }

    static {
        A04();
    }

    public C1637gq() {
        this(null);
    }

    public C1637gq(Context context) {
        if (context != null) {
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, 26));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = AbstractC1600gE.A02 >= 17 ? A01(context) : null;
            this.A0B = ChoreographerFrameCallbackC1636gp.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = C.TIME_UNSET;
        this.A07 = C.TIME_UNSET;
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

    private C1635go A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 2));
        if (displayManager == null) {
            return null;
        }
        return new C1635go(this, displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            this.A06 = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.A07 = (this.A06 * 80) / 100;
        }
    }

    private boolean A06(long j, long j2) {
        long j3 = j - this.A04;
        long elapsedFrameTimeNs = this.A05;
        return Math.abs((j2 - elapsedFrameTimeNs) - j3) > 20000000;
    }

    public final long A07(long j, long j2) {
        long j3 = 1000 * j;
        long j4 = j3;
        long j5 = j2;
        if (this.A08) {
            if (j != this.A02) {
                this.A01++;
                this.A00 = this.A03;
            }
            if (this.A01 >= 6) {
                long j6 = this.A00 + ((j3 - this.A04) / this.A01);
                if (!A06(j6, j2)) {
                    j5 = (this.A05 + j6) - this.A04;
                    j4 = j6;
                } else {
                    this.A08 = false;
                }
            } else if (A06(j3, j2)) {
                this.A08 = false;
            }
        }
        if (!this.A08) {
            this.A04 = j3;
            this.A05 = j2;
            this.A01 = 0L;
            this.A08 = true;
        }
        this.A02 = j;
        this.A03 = j4;
        if (this.A0B == null || this.A06 == C.TIME_UNSET) {
            return j5;
        }
        long j7 = this.A0B.A04;
        if (j7 == C.TIME_UNSET) {
            return j5;
        }
        return A00(j5, j7, this.A06) - this.A07;
    }

    public final void A08() {
        if (this.A09 != null) {
            if (this.A0A != null) {
                this.A0A.A01();
            }
            ChoreographerFrameCallbackC1636gp choreographerFrameCallbackC1636gp = this.A0B;
            if (A0D[1].length() == 30) {
                throw new RuntimeException();
            }
            A0D[2] = "JN49jYCij5h6Tq7S4CvQlwkO4QmujBno";
            choreographerFrameCallbackC1636gp.A07();
        }
    }

    public final void A09() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A06();
            C1635go c1635go = this.A0A;
            if (A0D[1].length() == 30) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[7] = "NtrIb3NfnK1qxVFYT0bJp12oL7UKbRkp";
            strArr[6] = "iSeDF3WjO0vrQ5oYCKZT14gRJZ9FzjyJ";
            if (c1635go != null) {
                this.A0A.A00();
            }
            A03();
        }
    }
}
