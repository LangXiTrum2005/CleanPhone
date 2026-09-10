package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jM, reason: from Kotlin metadata */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J(\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0015\u001a\u00020\u0016H\u0004¨\u0006\u001a"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker;", "", "<init>", "()V", "reportCodecCreating", "Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker$CreatingEvent;", "isVideo", "", "codecName", "", "source", "Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker$Source;", "reportCodecCreated", "", "creatingEvent", "codecInstanceId", "", "reportCodecAcquiredFromPool", "reportCodecReturnedToPool", "reportCodecReleasing", "reportCodecReleased", "getNowMilliseconds", "", "Source", "CreatingEvent", "ReleasingEvent", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MediaCodecPoolTracker {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-84, -72, -83, -82, -84, -105, -86, -74, -82, 19, 15, 21, 18, 3, 5};
    }

    public abstract void A06(C2451jJ c2451jJ, int i2);

    public abstract void A07(EnumC2453jL enumC2453jL, int i2);

    public abstract void A08(EnumC2453jL enumC2453jL, int i2);

    public abstract void A09(EnumC2453jL enumC2453jL, int i2);

    public abstract void A0A(boolean z2, String str, EnumC2453jL enumC2453jL, int i2);

    private final long A02() {
        return CF.A00().ACf();
    }

    public final C2451jJ A05(boolean z2, String str, EnumC2453jL enumC2453jL) {
        C2874qY.A09(str, A03(0, 9, 21));
        C2874qY.A09(enumC2453jL, A03(9, 6, 108));
        return new C2451jJ(A02(), z2, str, enumC2453jL);
    }
}
