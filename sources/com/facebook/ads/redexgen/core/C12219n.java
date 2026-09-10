package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C12219n extends AbstractC2715nv implements DI {
    public long A00;
    public InterfaceC11315t A01;
    public InterfaceC2541ku<InterfaceExecutorC1354Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass32 A07;
    public final C2849q7 A08;
    public final C5Y A09;
    public final A6 A0A;
    public final DC A0B;
    public final FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C12219n(C2849q7 c2849q7, C5Y c5y, DC dc, A6 a6, FF ff, int i2, InterfaceC2541ku<InterfaceExecutorC1354Fb> interfaceC2541ku) {
        this.A07 = (AnonymousClass32) AbstractC10843y.A01(c2849q7.A03);
        this.A08 = c2849q7;
        this.A09 = c5y;
        this.A0B = dc;
        this.A0A = a6 == null ? A6.A00 : a6;
        this.A0C = ff;
        this.A06 = i2;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC2541ku;
    }

    private void A00() {
        final Timeline c12209m = new C12209m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9t(c12209m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.facebook.ads.redexgen.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2827pl A0I(int i2, C2827pl c2827pl, boolean z2) {
                    super.A0I(i2, c2827pl, z2);
                    c2827pl.A05 = true;
                    return c2827pl;
                }

                @Override // com.facebook.ads.redexgen.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2825pj A0L(int i2, C2825pj c2825pj, long j) {
                    super.A0L(i2, c2825pj, j);
                    c2825pj.A0F = true;
                    return c2825pj;
                }
            };
            c12209m = timeline;
        }
        A05(c12209m);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2715nv
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2715nv
    public final void A0A(InterfaceC11315t interfaceC11315t) {
        this.A01 = interfaceC11315t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC10843y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1298Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC2709np A5W(C2708no c2708no, F0 f0, long j) {
        InterfaceExecutorC1354Fb interfaceExecutorC1354Fb;
        InterfaceC2796pF interfaceC2796pFA5I = this.A09.A5I();
        if (this.A01 != null) {
            interfaceC2796pFA5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        DD ddA5X = this.A0B.A5X(C8O.A03);
        A6 a6 = this.A0A;
        A1 a1A01 = A01(c2708no);
        FF ff = this.A0C;
        D8 d8A02 = A02(c2708no);
        String str = this.A07.A04;
        int i2 = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC1354Fb = this.A02.get();
        } else {
            interfaceExecutorC1354Fb = null;
        }
        return new C12239p(uri, interfaceC2796pFA5I, ddA5X, a6, a1A01, ff, d8A02, this, f0, str, i2, interfaceExecutorC1354Fb);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1298Cx
    public final void ACT() {
    }

    @Override // com.facebook.ads.redexgen.core.DI
    public final void AG0(long j, boolean z2, boolean z3) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (!this.A04 && this.A00 == j && this.A05 == z2 && this.A03 == z3) {
            return;
        }
        this.A00 = j;
        this.A05 = z2;
        this.A03 = z3;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1298Cx
    public final void AHk(InterfaceC2709np interfaceC2709np) {
        ((C12239p) interfaceC2709np).A0a();
    }
}
