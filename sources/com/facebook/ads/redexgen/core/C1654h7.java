package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1654h7 {
    public final Handler A00;
    public final InterfaceC1655h8 A01;

    public C1654h7(Handler handler, InterfaceC1655h8 interfaceC1655h8) {
        this.A00 = interfaceC1655h8 != null ? (Handler) AbstractC1517es.A01(handler) : null;
        this.A01 = interfaceC1655h8;
    }

    public final void A00(final int i, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.h5
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A02(i, j);
                }
            });
        }
    }

    public final void A01(final int i, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.gx
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A03(i, j);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i, long j) {
        ((InterfaceC1655h8) AbstractC1600gE.A0f(this.A01)).ACk(i, j);
    }

    public final /* synthetic */ void A03(int i, long j) {
        ((InterfaceC1655h8) AbstractC1600gE.A0f(this.A01)).AD0(i, j);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A04(int i, ZM zm) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC1653h6(this, i, zm));
        }
    }

    public final void A05(final OA oa) {
        oa.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.h1
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A07(oa);
                }
            });
        }
    }

    public final void A06(final OA oa) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.gu
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A08(oa);
                }
            });
        }
    }

    public final /* synthetic */ void A07(OA oa) {
        oa.A02();
        ((InterfaceC1655h8) AbstractC1600gE.A0f(this.A01)).AFW(oa);
    }

    public final /* synthetic */ void A08(OA oa) {
        ((InterfaceC1655h8) AbstractC1600gE.A0f(this.A01)).AFX(oa);
    }

    public final void A09(final ZM zm, final OD od) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0A(zm, od);
                }
            });
        }
    }

    public final /* synthetic */ void A0A(ZM zm, OD od) {
        ((InterfaceC1655h8) AbstractC1600gE.A0f(this.A01)).AFc(zm);
        ((InterfaceC1655h8) AbstractC1600gE.A0f(this.A01)).AFd(zm, od);
    }

    public final void A0B(final Y2 y2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.gz
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0C(y2);
                }
            });
        }
    }

    public final /* synthetic */ void A0C(Y2 y2) {
        ((InterfaceC1655h8) AbstractC1600gE.A0f(this.A01)).AFj(y2);
    }

    public final void A0D(final Object obj) {
        if (this.A00 != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.gy
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0E(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Object obj, long j) {
        ((InterfaceC1655h8) AbstractC1600gE.A0f(this.A01)).AEp(obj, j);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.h2
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.gv
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0H(str, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j, long j2) {
        ((InterfaceC1655h8) AbstractC1600gE.A0f(this.A01)).AFV(str, j, j2);
    }
}
