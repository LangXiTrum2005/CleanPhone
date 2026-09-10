package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.ads.redexgen.core.AbstractC1517es;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.HandlerThreadC1610gO;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public static String[] A06 = {"pp0QVEtaMCAKPna3YJt78N0w4zMKyGdK", "79oygYboKir73b3UZTEr", "iW0XQzqmwgd6FOvBAvFbJOtiXtTxpr06", "Pd4yymMvmv58ummKZRY0HcFmILvlFe9Z", "xZXsZmauCpR5UWDcFjQmIkrGW1H4RY1n", "vkBBR8xyhBkspww5icXUHCOg", "mw4EXo3WbErcuntOCMbauI5byqzasizK", "k7SKMo0UCZ4vlpsSSXiadPQJgI2A6OyA"};
    public boolean A00;
    public final boolean A01;
    public final HandlerThreadC1610gO A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{119, 117, 126, 109, 119, 106, 102, 109, 66, 64, 93, 70, 87, 81, 70, 87, 86, 109, 81, 93, 92, 70, 87, 92, 70, 71, 69, 78, 93, 73, 74, 80, 93, 113, 119, 112, 100, 99, 97, 103, 110, 103, 113, 113, 93, 97, 109, 108, 118, 103, 122, 118, 112, 75, 86, 80, 85, 85, 74, 87, 81, 64, 65, 5, 85, 87, 76, 74, 87, 5, 81, 74, 5, 100, 117, 108, 5, 73, 64, 83, 64, 73, 5, 20, 18, cw.m, 3, 102, 97, 98, 103, 123, 116, 126, 104, 117, 115, 126, 52, 114, 123, 104, 126, 109, 123, 104, 127, 52, 108, 104, 52, 114, 115, 125, 114, 69, 106, 127, 104, 124, 117, 104, 119, 123, 116, 121, 127, 125, 111, 99, 125, 123, 96, 105};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized boolean A05(Context context) {
        boolean z;
        z = true;
        if (!A04) {
            A03 = AbstractC1600gE.A02 < 24 ? 0 : A00(context);
            A04 = true;
        }
        if (A03 == 0) {
            z = false;
        }
        return z;
    }

    static {
        A04();
    }

    public DummySurface(HandlerThreadC1610gO handlerThreadC1610gO, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.A02 = handlerThreadC1610gO;
        this.A01 = z;
    }

    public static int A00(Context context) {
        String strEglQueryString;
        if (AbstractC1600gE.A02 < 26 && (A02(EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 7, 123).equals(AbstractC1600gE.A05) || A02(85, 6, 34).equals(AbstractC1600gE.A06))) {
            return 0;
        }
        if ((AbstractC1600gE.A02 < 26 && !context.getPackageManager().hasSystemFeature(A02(91, 36, 111))) || (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !strEglQueryString.contains(A02(0, 25, 71))) {
            return 0;
        }
        if (strEglQueryString.contains(A02(25, 27, EnumC4719u30.JSON_ENCODE_ERROR_VALUE))) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public static DummySurface A01(Context context, boolean z) {
        boolean z2;
        A03();
        if (z) {
            boolean zA05 = A05(context);
            if (A06[5].length() == 0) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[3] = "kT07Bou9oyQQQ1q5147NOW74unBc9AOz";
            strArr[2] = "m3GLYlGhsoPlaVIPK312zxpp7FIUDalc";
            if (zA05) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        AbstractC1517es.A08(z2);
        DummySurface dummySurfaceA04 = new HandlerThreadC1610gO().A04(z ? A03 : 0);
        if (A06[7].charAt(5) == 'h') {
            return dummySurfaceA04;
        }
        A06[4] = "nGnDXsnVxv5BUIHARnh2Z4r9whZTo5LJ";
        return dummySurfaceA04;
    }

    public static void A03() {
        if (AbstractC1600gE.A02 >= 17) {
        } else {
            throw new UnsupportedOperationException(A02(52, 33, 80));
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
