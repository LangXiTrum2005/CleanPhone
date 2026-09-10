package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C12209m extends Timeline {
    public static byte[] A0D;
    public static final C2849q7 A0E;
    public static final Object A0F;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C2852qA A07;
    public final C2849q7 A08;
    public final Object A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0D = new byte[]{-79, -57, -52, -59, -54, -61, -82, -61, -48, -57, -51, -62, -78, -57, -53, -61, -54, -57, -52, -61};
    }

    static {
        A01();
        A0F = new Object();
        A0E = new C10562u().A03(A00(0, 20, 44)).A00(Uri.EMPTY).A05();
    }

    public C12209m(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z2, boolean z3, boolean z4, Object obj, C2849q7 c2849q7, C2852qA c2852qA) {
        this.A02 = j;
        this.A06 = j2;
        this.A00 = j3;
        this.A01 = j4;
        this.A04 = j5;
        this.A05 = j6;
        this.A03 = j7;
        this.A0B = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A09 = obj;
        this.A08 = (C2849q7) AbstractC10843y.A01(c2849q7);
        this.A07 = c2852qA;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C12209m(long j, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, Object obj, C2849q7 c2849q7) {
        C2852qA c2852qA;
        if (z4) {
            c2852qA = c2849q7.A02;
        } else {
            c2852qA = null;
        }
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z2, z3, false, obj, c2849q7, c2852qA);
    }

    public C12209m(long j, boolean z2, boolean z3, boolean z4, Object obj, C2849q7 c2849q7) {
        this(j, j, 0L, 0L, z2, z3, z4, obj, c2849q7);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0A(Object obj) {
        return A0F.equals(obj) ? 0 : -1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2827pl A0I(int i2, C2827pl c2827pl, boolean z2) {
        AbstractC10843y.A00(i2, 0, 1);
        return c2827pl.A0F(null, z2 ? A0F : null, 0, this.A01, -this.A05);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2825pj A0L(int i2, C2825pj c2825pj, long j) {
        AbstractC10843y.A00(i2, 0, 1);
        long j2 = this.A03;
        if (this.A0A && !this.A0C && j != 0) {
            if (this.A04 == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            } else {
                j2 += j;
                if (j2 > this.A04) {
                    j2 = -9223372036854775807L;
                }
            }
        }
        return c2825pj.A07(C2825pj.A0K, this.A08, this.A09, this.A02, this.A06, -9223372036854775807L, this.A0B, this.A0A, null, j2, this.A04, 0, 0, this.A05);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final Object A0M(int i2) {
        AbstractC10843y.A00(i2, 0, 1);
        return A0F;
    }
}
