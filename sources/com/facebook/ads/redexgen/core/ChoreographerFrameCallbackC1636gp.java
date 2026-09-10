package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ChoreographerFrameCallbackC1636gp implements Choreographer.FrameCallback, Handler.Callback {
    public static byte[] A05;
    public static String[] A06 = {"uKCrUhLeLNE2bbaqTzHqmVoWf5w1rYVu", "A4eIkZpZRh11nb1KckaHxrLNGtHhD0TK", "SLhmNsGzHL8KcroYUEXGMbqgT3ahKBkO", "Ahz43YDUeJdqdZwVn", "u8jwHHegX093FDawWVIfkyfN4hqXxEAs", "JA3CZKf3kSlLhBnFxVjTNInFKj", "sNP4eW1x69y4cz3Ux", "BLPat4gP1SehHfWI2EZik7VQtZQcBq2P"};
    public static final ChoreographerFrameCallbackC1636gp A07;
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public volatile long A04 = C.TIME_UNSET;
    public final HandlerThread A03 = new HandlerThread(A01(0, 26, 108));

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{-62, -25, -18, -15, -28, -18, -26, -15, -32, -17, -25, -28, -15, -50, -10, -19, -28, -15, -71, -57, -32, -19, -29, -21, -28, -15};
        if (A06[2].length() == 26) {
            throw new RuntimeException();
        }
        A06[4] = "ODOKa8Of8c4RzKYNE64poliXvKONzExP";
    }

    static {
        A05();
        A07 = new ChoreographerFrameCallbackC1636gp();
    }

    public ChoreographerFrameCallbackC1636gp() {
        this.A03.start();
        this.A02 = AbstractC1600gE.A0c(this.A03.getLooper(), this);
        this.A02.sendEmptyMessage(0);
    }

    public static ChoreographerFrameCallbackC1636gp A00() {
        return A07;
    }

    private void A02() {
        this.A00++;
        if (this.A00 == 1) {
            this.A01.postFrameCallback(this);
        }
    }

    private void A03() {
        this.A01 = Choreographer.getInstance();
    }

    private void A04() {
        this.A00--;
        if (this.A00 == 0) {
            this.A01.removeFrameCallback(this);
            this.A04 = C.TIME_UNSET;
        }
    }

    public final void A06() {
        this.A02.sendEmptyMessage(1);
    }

    public final void A07() {
        this.A02.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.A04 = j;
        this.A01.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A03();
                return true;
            case 1:
                A02();
                return true;
            case 2:
                A04();
                return true;
            default:
                return false;
        }
    }
}
