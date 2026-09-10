package com.facebook.ads.androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.ads.redexgen.core.AbstractC10843y;
import com.facebook.ads.redexgen.core.C5C;
import com.facebook.ads.redexgen.core.HandlerThreadC1361Fi;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public static String[] A06 = {"ToLQMf4zVEPQ4KvEooDgfRDe7yK6oNRK", "K0o48H12GfZKMIt1wQk8mac7vZfrpMfZ", "E5u", "BRaMCvq", "l9UvErrzvq13nAT2kKu87XSUotDZHlU4", "KpcnqVP7VQEeHX003zJg7kklGvYVOXV6", "nWaipra9RnK7e6o7QCyQoP578AoonQfH", "y6ffzf1HkvdiGAu1g8uZUTsw8JywLKMO"};
    public boolean A00;
    public final boolean A01;
    public final HandlerThreadC1361Fi A02;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 72);
            String[] strArr = A06;
            if (strArr[4].charAt(13) != strArr[7].charAt(13)) {
                throw new RuntimeException();
            }
            A06[6] = "JqkQNQrwLqX5JhphVyehfhpUDDUdSiIM";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{22, 20, 31, 12, 22, 11, 7, 12, 35, 33, 60, 39, 54, 48, 39, 54, 55, 12, 48, 60, 61, 39, 54, 61, 39, 4, 6, 13, 30, 10, 9, 19, 30, 50, 52, 51, 39, 32, 34, 36, 45, 36, 50, 50, 30, 34, 46, 47, 53, 36, 57, 53, 32, 27, 6, 0, 5, 5, 26, 7, 1, 16, 17, 85, 5, 7, 28, 26, 7, 85, 1, 26, 85, 52, 37, 60, 85, 25, 16, 3, 16, 25, 85, 68, 66, 101, 105, 12, 11, 8, 13, 63, 48, 58, 44, 49, 55, 58, 112, 54, 63, 44, 58, 41, 63, 44, 59, 112, 40, 44, 112, 54, 55, 57, 54, 1, 46, 59, 44, 56, 49, 44, 51, 63, 48, 61, 59, 11, 25, 21, 11, 13, 22, 31};
        if (A06[6].charAt(20) == 'p') {
            throw new RuntimeException();
        }
        A06[0] = "LdigSr1cvkrlhyQY3m7v5wXMq9EFvMie";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized boolean A05(Context context) {
        boolean z2;
        z2 = true;
        if (!A04) {
            A03 = C5C.A02 < 24 ? 0 : A00(context);
            A04 = true;
        }
        if (A03 == 0) {
            z2 = false;
        }
        return z2;
    }

    static {
        A04();
    }

    public DummySurface(HandlerThreadC1361Fi handlerThreadC1361Fi, SurfaceTexture surfaceTexture, boolean z2) {
        super(surfaceTexture);
        this.A02 = handlerThreadC1361Fi;
        this.A01 = z2;
    }

    public static int A00(Context context) {
        String strEglQueryString;
        if (C5C.A02 < 26 && (A02(127, 7, 48).equals(C5C.A05) || A02(85, 6, 117).equals(C5C.A06))) {
            return 0;
        }
        if ((C5C.A02 < 26 && !context.getPackageManager().hasSystemFeature(A02(91, 36, 22))) || (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !strEglQueryString.contains(A02(0, 25, 27))) {
            return 0;
        }
        if (strEglQueryString.contains(A02(25, 27, 9))) {
            return 1;
        }
        return 2;
    }

    public static DummySurface A01(Context context, boolean z2) {
        A03();
        AbstractC10843y.A08(!z2 || A05(context));
        return new HandlerThreadC1361Fi().A04(z2 ? A03 : 0);
    }

    public static void A03() {
        if (C5C.A02 >= 17) {
        } else {
            throw new UnsupportedOperationException(A02(52, 33, 61));
        }
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
