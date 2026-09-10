package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1447dj {
    public static byte[] A0B;

    @MetaExoPlayerCustomization
    public static final C1447dj A0C;
    public final int A00;
    public final int A01;

    @Deprecated
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Uri A06;

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public final C1452dp A07;
    public final String A08;
    public final Map<String, String> A09;
    public final byte[] A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @MetaExoPlayerCustomization("Replacement of customData Object with fbDataSpecExtension")
    public C1447dj(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, C1452dp c1452dp) {
        boolean z = true;
        AbstractC1517es.A07(j + j2 >= 0);
        AbstractC1517es.A07(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        AbstractC1517es.A07(z);
        this.A06 = uri;
        this.A05 = j;
        this.A01 = i;
        this.A0A = (bArr == null || bArr.length == 0) ? null : bArr;
        this.A09 = Collections.unmodifiableMap(new HashMap(map));
        this.A04 = j2;
        this.A02 = j + j2;
        this.A03 = j3;
        this.A08 = str;
        this.A00 = i2;
        this.A07 = c1452dp;
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0B = new byte[]{123, -22, -34, -68, -39, -20, -39, -53, -24, -35, -37, -45, -36, -38, -23, 12, 9, 5, 8, -5, -6, -2, -1, -51, 40, 48, 48, 40, -17, 38, 57, 48, -17, 37, 34, 53, 34, 52, 48, 54, 51, 36, 38, -24, -24, -24, -97, -41, -46, -44, -42, -45, -32, -32, -36, -97, -44, -32, -34};
    }

    static {
        A03();
        PS.A03(A02(24, 19, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE));
        A0C = new C1447dj(Uri.parse(A02(43, 16, 38)));
    }

    public C1447dj(Uri uri) {
        this(uri, 0, -1);
    }

    @MetaExoPlayerCustomization
    @Deprecated
    public C1447dj(Uri uri, int i, int i2) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, i, new C1452dp(A02(0, 0, 74), -1L, false, -1, -1, -1, -1, false, false, i2, -1L, new Cdo(), -1L, false, -1, -1, -1L, -1L, -1, null, -1, null, null, C1451dn.A03, -1, false, null, A02(0, 0, 74), A02(0, 0, 74), null, -1L, -1L));
    }

    @MetaExoPlayerCustomization("creation and passage of FbDataSpecExtension")
    @Deprecated
    public C1447dj(Uri uri, long j, long j2, String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, str, 0, new C1452dp());
    }

    private final String A00() {
        return A01(this.A01);
    }

    public static String A01(int i) {
        switch (i) {
            case 1:
                return A02(12, 3, 74);
            case 2:
                return A02(19, 4, 96);
            case 3:
                return A02(15, 4, 121);
            default:
                throw new IllegalStateException();
        }
    }

    public final C1444dg A04() {
        return new C1444dg(this);
    }

    @MetaExoPlayerCustomization("Replacement of customData Object with fbDataSpecExtension + new copy creation")
    public final C1447dj A05(long j, long j2) {
        if (j == 0 && this.A03 == j2) {
            return this;
        }
        return new C1447dj(this.A06, this.A05, this.A01, this.A0A, this.A09, this.A04 + j, j2, this.A08, this.A00, new C1452dp(this.A07));
    }

    public final boolean A06(int i) {
        return (this.A00 & i) == i;
    }

    @MetaExoPlayerCustomization("Stringification of fbDataSpecExtension (last two items)")
    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(A02(3, 9, 45)).append(A00()).append(A02(0, 1, 16)).append(this.A06);
        String strA02 = A02(1, 2, 115);
        return sbAppend.append(strA02).append(this.A04).append(strA02).append(this.A03).append(strA02).append(this.A08).append(strA02).append(this.A00).append(strA02).append(this.A07).append(strA02).append(this.A07.A0Q).append(A02(23, 1, 37)).toString();
    }
}
