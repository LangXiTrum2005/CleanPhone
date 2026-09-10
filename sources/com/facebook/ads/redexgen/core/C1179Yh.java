package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1179Yh implements InterfaceC0904Nb {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public C1213Zq A06 = C1213Zq.A08;
    public static String[] A07 = {"G9WL4rn12iP6MyxvnFNwDtQWsimlKdOL", "5vvu1vG4BQil762AXDshcOSHPA4me7wW", "", "IsJF7Y1nrSs0jxoBG0t78uVULAdJVy1C", "We8vwXt7TZnfCQYZLmN8kIA2X", "CW", "iQjNWKLgBFbyGY8ZXGBvi2tWoFAZOZnz", "rgBv8h0AMw5V2xLZmvANYUoNfbGvDgEj"};
    public static final String A0D = AbstractC1600gE.A0h(0);
    public static final String A0A = AbstractC1600gE.A0h(1);
    public static final String A0C = AbstractC1600gE.A0h(2);
    public static final String A0B = AbstractC1600gE.A0h(3);
    public static final String A09 = AbstractC1600gE.A0h(4);
    public static final InterfaceC0903Na<C1179Yh> A08 = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.Yi
        @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
        public final InterfaceC0904Nb A6V(Bundle bundle) {
            return C1179Yh.A01(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1179Yh A01(Bundle bundle) {
        int i = bundle.getInt(A0D, 0);
        long j = bundle.getLong(A0A, C.TIME_UNSET);
        long j2 = bundle.getLong(A0C, 0L);
        boolean z = bundle.getBoolean(A0B, false);
        Bundle bundle2 = bundle.getBundle(A09);
        C1213Zq c1213Zq = bundle2 != null ? (C1213Zq) C1213Zq.A09.A6V(bundle2) : C1213Zq.A08;
        C1179Yh c1179Yh = new C1179Yh();
        c1179Yh.A0G(null, null, i, j, j2, c1213Zq, z);
        return c1179Yh;
    }

    public final int A03() {
        return this.A06.A00;
    }

    public final int A04(int i) {
        return this.A06.A07(i).A00;
    }

    public final int A05(int i) {
        return this.A06.A07(i).A04();
    }

    public final int A06(int i, int i2) {
        return this.A06.A07(i).A05(i2);
    }

    public final int A07(long j) {
        return this.A06.A05(j, this.A01);
    }

    public final int A08(long j) {
        return this.A06.A06(j, this.A01);
    }

    public final long A09() {
        return this.A06.A02;
    }

    public final long A0A() {
        return this.A01;
    }

    public final long A0B() {
        return AbstractC1600gE.A0P(this.A02);
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D(int i) {
        return this.A06.A07(i).A03;
    }

    public final long A0E(int i, int i2) {
        C1214Zr c1214ZrA07 = this.A06.A07(i);
        return c1214ZrA07.A00 != -1 ? c1214ZrA07.A06[i2] : C.TIME_UNSET;
    }

    public final C1179Yh A0F(Object obj, Object obj2, int i, long j, long j2) {
        return A0G(obj, obj2, i, j, j2, C1213Zq.A08, false);
    }

    public final C1179Yh A0G(Object obj, Object obj2, int i, long j, long j2, C1213Zq c1213Zq, boolean z) {
        this.A03 = obj;
        this.A04 = obj2;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
        this.A06 = c1213Zq;
        this.A05 = z;
        return this;
    }

    public final boolean A0H(int i) {
        return !this.A06.A07(i).A07();
    }

    @MetaExoPlayerCustomization("Can be removed once MediaPeriodQueue is updated.")
    public final boolean A0I(int i, int i2) {
        C1214Zr c1214Zr = this.A06.A05[i];
        if (c1214Zr.A00 != -1) {
            int[] iArr = c1214Zr.A05;
            if (A07[2].length() == 11) {
                throw new RuntimeException();
            }
            A07[2] = "KV2GFfXtv35xYupWYP2sQJI3oJ5M";
            if (iArr[i2] != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C1179Yh c1179Yh = (C1179Yh) obj;
        if (AbstractC1600gE.A1E(this.A03, c1179Yh.A03) && AbstractC1600gE.A1E(this.A04, c1179Yh.A04) && this.A00 == c1179Yh.A00 && this.A01 == c1179Yh.A01 && this.A02 == c1179Yh.A02 && this.A05 == c1179Yh.A05 && AbstractC1600gE.A1E(this.A06, c1179Yh.A06)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((7 * 31) + (this.A03 == null ? 0 : this.A03.hashCode())) * 31) + (this.A04 != null ? this.A04.hashCode() : 0)) * 31) + this.A00) * 31) + ((int) (this.A01 ^ (this.A01 >>> 32)))) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A06.hashCode();
    }
}
