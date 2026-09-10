package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
public final class C11175f {
    public static byte[] A0A;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public ML A06;
    public String A07;
    public Map<String, String> A08;
    public byte[] A09;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-35, -15, -18, -87, -2, -5, -14, -87, -10, -2, -4, -3, -87, -21, -18, -87, -4, -18, -3, -73};
    }

    public C11175f() {
        this.A01 = 1;
        this.A08 = Collections.emptyMap();
        this.A02 = -1L;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public C11175f(C11205i c11205i) {
        this.A05 = c11205i.A06;
        this.A04 = c11205i.A05;
        this.A01 = c11205i.A01;
        this.A09 = c11205i.A0A;
        this.A08 = c11205i.A09;
        this.A03 = c11205i.A04;
        this.A02 = c11205i.A03;
        this.A07 = c11205i.A08;
        this.A00 = c11205i.A00;
        this.A06 = c11205i.A07;
    }

    public final C11175f A02(int i2) {
        this.A00 = i2;
        return this;
    }

    public final C11175f A03(long j) {
        this.A02 = j;
        return this;
    }

    public final C11175f A04(long j) {
        this.A03 = j;
        return this;
    }

    public final C11175f A05(long j) {
        this.A04 = j;
        return this;
    }

    public final C11175f A06(Uri uri) {
        this.A05 = uri;
        return this;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public final C11175f A07(ML ml) {
        this.A06 = ml;
        return this;
    }

    public final C11175f A08(String str) {
        this.A07 = str;
        return this;
    }

    @MetaExoPlayerCustomization("D50990955; Ensure that fbDataSpecExtension is not null")
    public final C11205i A09() {
        ML ml;
        AbstractC10843y.A03(this.A05, A00(0, 20, 122));
        Uri uri = this.A05;
        long j = this.A04;
        int i2 = this.A01;
        byte[] bArr = this.A09;
        Map<String, String> map = this.A08;
        long j2 = this.A03;
        long j3 = this.A02;
        String str = this.A07;
        int i3 = this.A00;
        if (this.A06 != null) {
            ml = this.A06;
        } else {
            ml = new ML();
        }
        return new C11205i(uri, j, i2, bArr, map, j2, j3, str, i3, ml);
    }
}
