package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2827pl implements AnonymousClass24 {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public C2868qS A06 = C2868qS.A08;
    public static String[] A07 = {"4zGdQbqEEbqON0fsiZAaEQkKoAoKYmna", "yJpzHCnd9V3wUr5Wrx8duzmTaMKaViaS", "6le5bHbrSJ1W0fbLNXPlurR", "jvR1cNhZ0960aRA7pVRRRMqTg6KbIJja", "KqjZe5mn0dP", "Q", "Z7fKuPhHzVcFnrI", "fPry0FIfciS3iZV36uBdTRShtkwqjgIo"};
    public static final String A0D = C5C.A0h(0);
    public static final String A0A = C5C.A0h(1);
    public static final String A0C = C5C.A0h(2);
    public static final String A0B = C5C.A0h(3);
    public static final String A09 = C5C.A0h(4);
    public static final AnonymousClass23<C2827pl> A08 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pp
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2827pl.A01(bundle);
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
    public static C2827pl A01(Bundle bundle) {
        int i2 = bundle.getInt(A0D, 0);
        long j = bundle.getLong(A0A, -9223372036854775807L);
        long j2 = bundle.getLong(A0C, 0L);
        boolean z2 = bundle.getBoolean(A0B, false);
        Bundle bundle2 = bundle.getBundle(A09);
        C2868qS c2868qS = bundle2 != null ? (C2868qS) C2868qS.A09.A6f(bundle2) : C2868qS.A08;
        C2827pl c2827pl = new C2827pl();
        c2827pl.A0G(null, null, i2, j, j2, c2868qS, z2);
        return c2827pl;
    }

    public final int A03() {
        return this.A06.A00;
    }

    public final int A04(int i2) {
        return this.A06.A07(i2).A00;
    }

    public final int A05(int i2) {
        return this.A06.A07(i2).A04();
    }

    public final int A06(int i2, int i3) {
        return this.A06.A07(i2).A05(i3);
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
        return C5C.A0P(this.A02);
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D(int i2) {
        return this.A06.A07(i2).A03;
    }

    public final long A0E(int i2, int i3) {
        C2869qT c2869qTA07 = this.A06.A07(i2);
        if (c2869qTA07.A00 != -1) {
            return c2869qTA07.A06[i3];
        }
        return -9223372036854775807L;
    }

    public final C2827pl A0F(Object obj, Object obj2, int i2, long j, long j2) {
        return A0G(obj, obj2, i2, j, j2, C2868qS.A08, false);
    }

    public final C2827pl A0G(Object obj, Object obj2, int i2, long j, long j2, C2868qS c2868qS, boolean z2) {
        this.A03 = obj;
        this.A04 = obj2;
        this.A00 = i2;
        this.A01 = j;
        this.A02 = j2;
        this.A06 = c2868qS;
        this.A05 = z2;
        return this;
    }

    public final boolean A0H(int i2) {
        return !this.A06.A07(i2).A07();
    }

    @MetaExoPlayerCustomization("Can be removed once MediaPeriodQueue is updated.")
    public final boolean A0I(int i2, int i3) {
        C2869qT c2869qT = this.A06.A05[i2];
        return (c2869qT.A00 == -1 || c2869qT.A05[i3] == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C2827pl c2827pl = (C2827pl) obj;
        if (C5C.A1E(this.A03, c2827pl.A03) && C5C.A1E(this.A04, c2827pl.A04) && this.A00 == c2827pl.A00 && this.A01 == c2827pl.A01 && this.A02 == c2827pl.A02 && this.A05 == c2827pl.A05 && C5C.A1E(this.A06, c2827pl.A06)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((7 * 31) + (this.A03 == null ? 0 : this.A03.hashCode())) * 31;
        if (this.A04 != null) {
            Object obj = this.A04;
            String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A07[6] = "a7xjZFv85Fgc1YV";
            iHashCode = obj.hashCode();
        }
        return ((((((((((iHashCode2 + iHashCode) * 31) + this.A00) * 31) + ((int) (this.A01 ^ (this.A01 >>> 32)))) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A06.hashCode();
    }
}
