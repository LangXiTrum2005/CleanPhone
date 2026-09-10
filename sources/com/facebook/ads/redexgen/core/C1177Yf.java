package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1177Yf implements InterfaceC0904Nb {
    public static byte[] A0H;
    public static String[] A0I = {"SAapicflT3iI", "Cg8o3isv82DGavEyExCpZHKfeIP6Bt9", "0iLCFfdzsihKbVTTPxmDwgsUAu4XGhZg", "ki99bQoAzPnnQ3ScvR9EgP8VBWVgkmKf", "bdAF2dkAxAJYvSOQZeKzDLIY90b61U8b", "nGiQbFjvO2SYqXYUHTdzFIzWO4B7dxoL", "PT0dbs14ZL5XU7ucZcbIZE", "BcuxomgrL001XI6Ss1cXVg5hNCOjYGVW"};
    public static final InterfaceC0903Na<C1177Yf> A0J;
    public static final Object A0K;
    public static final ZE A0L;
    public static final Object A0M;
    public static final String A0N;
    public static final String A0O;
    public static final String A0P;
    public static final String A0Q;
    public static final String A0R;
    public static final String A0S;
    public static final String A0T;
    public static final String A0U;
    public static final String A0V;
    public static final String A0W;
    public static final String A0X;
    public static final String A0Y;
    public static final String A0Z;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public ZG A08;
    public Object A0A;

    @Deprecated
    public Object A0B;
    public boolean A0D;

    @Deprecated
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Object A0C = A0K;
    public ZE A09 = A0L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1177Yf A00(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(A0W);
        ZE ze = bundle2 != null ? (ZE) ZE.A08.A6V(bundle2) : ZE.A09;
        long j = bundle.getLong(A0Y, C.TIME_UNSET);
        long j2 = bundle.getLong(A0Z, C.TIME_UNSET);
        long j3 = bundle.getLong(A0P, C.TIME_UNSET);
        boolean z = bundle.getBoolean(A0T, false);
        boolean z2 = bundle.getBoolean(A0R, false);
        Bundle bundle3 = bundle.getBundle(A0V);
        ZG zg = bundle3 != null ? (ZG) ZG.A06.A6V(bundle3) : null;
        boolean z3 = bundle.getBoolean(A0S, false);
        long j4 = bundle.getLong(A0N, 0L);
        long j5 = bundle.getLong(A0O, C.TIME_UNSET);
        int i = bundle.getInt(A0Q, 0);
        int i2 = bundle.getInt(A0U, 0);
        long j6 = bundle.getLong(A0X, 0L);
        C1177Yf c1177Yf = new C1177Yf();
        c1177Yf.A07(A0M, ze, null, j, j2, j3, z, z2, zg, j4, j5, i, i2, j6);
        c1177Yf.A0F = z3;
        return c1177Yf;
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0H = new byte[]{33, 45, 47, 108, 37, 45, 45, 37, 46, 39, 108, 35, 44, 38, 48, 45, 43, 38, 108, 39, 58, 45, 50, 46, 35, 59, 39, 48, 112, 108, 22, 43, 47, 39, 46, 43, 44, 39};
    }

    static {
        A03();
        A0K = new Object();
        A0M = new Object();
        A0L = new PH().A03(A02(0, 38, EnumC4719u30.JSON_ENCODE_ERROR_VALUE)).A00(Uri.EMPTY).A05();
        A0W = AbstractC1600gE.A0h(1);
        A0Y = AbstractC1600gE.A0h(2);
        A0Z = AbstractC1600gE.A0h(3);
        A0P = AbstractC1600gE.A0h(4);
        A0T = AbstractC1600gE.A0h(5);
        A0R = AbstractC1600gE.A0h(6);
        A0V = AbstractC1600gE.A0h(7);
        A0S = AbstractC1600gE.A0h(8);
        A0N = AbstractC1600gE.A0h(9);
        A0O = AbstractC1600gE.A0h(10);
        A0Q = AbstractC1600gE.A0h(11);
        A0U = AbstractC1600gE.A0h(12);
        A0X = AbstractC1600gE.A0h(13);
        A0J = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.Yg
            @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
            public final InterfaceC0904Nb A6V(Bundle bundle) {
                return C1177Yf.A00(bundle);
            }
        };
    }

    public final long A04() {
        return AbstractC1600gE.A0P(this.A02);
    }

    public final long A05() {
        return this.A02;
    }

    public final long A06() {
        return AbstractC1600gE.A0P(this.A03);
    }

    public final C1177Yf A07(Object obj, ZE ze, Object obj2, long j, long j2, long j3, boolean z, boolean z2, ZG zg, long j4, long j5, int i, int i2, long j6) {
        this.A0C = obj;
        this.A09 = ze != null ? ze : A0L;
        this.A0B = (ze == null || ze.A03 == null) ? null : ze.A03.A03;
        if (A0I[0].length() != 12) {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[5] = "wFH17o3iyIsYs5AJy0JntWwUIx6qz1SD";
        strArr[4] = "3Bf6zvB9WBBYjRVrpgxhF14nZQ8gfffp";
        this.A0A = obj2;
        this.A06 = j;
        this.A07 = j2;
        this.A04 = j3;
        this.A0G = z;
        this.A0D = z2;
        this.A0E = zg != null;
        this.A08 = zg;
        this.A02 = j4;
        this.A03 = j5;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = j6;
        this.A0F = false;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C1177Yf c1177Yf = (C1177Yf) obj;
        if (AbstractC1600gE.A1E(this.A0C, c1177Yf.A0C) && AbstractC1600gE.A1E(this.A09, c1177Yf.A09) && AbstractC1600gE.A1E(this.A0A, c1177Yf.A0A) && AbstractC1600gE.A1E(this.A08, c1177Yf.A08) && this.A06 == c1177Yf.A06 && this.A07 == c1177Yf.A07 && this.A04 == c1177Yf.A04 && this.A0G == c1177Yf.A0G && this.A0D == c1177Yf.A0D && this.A0F == c1177Yf.A0F) {
            long j = this.A02;
            long j2 = c1177Yf.A02;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[1].length()) {
                A0I[7] = "tltv1tYAY2jsV3HhUhtKnQZCs9NcUXGU";
                if (j == j2) {
                    long j3 = this.A03;
                    long j4 = c1177Yf.A03;
                    String[] strArr2 = A0I;
                    if (strArr2[2].charAt(1) == strArr2[3].charAt(1)) {
                        A0I[0] = "MSl7E3EydAPD";
                        if (j3 == j4 && this.A00 == c1177Yf.A00 && this.A01 == c1177Yf.A01 && this.A05 == c1177Yf.A05) {
                            return true;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((7 * 31) + this.A0C.hashCode()) * 31) + this.A09.hashCode()) * 31) + (this.A0A == null ? 0 : this.A0A.hashCode())) * 31) + (this.A08 != null ? this.A08.hashCode() : 0)) * 31) + ((int) (this.A06 ^ (this.A06 >>> 32)))) * 31) + ((int) (this.A07 ^ (this.A07 >>> 32)))) * 31) + ((int) (this.A04 ^ (this.A04 >>> 32)))) * 31) + (this.A0G ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) (this.A05 ^ (this.A05 >>> 32)));
    }
}
