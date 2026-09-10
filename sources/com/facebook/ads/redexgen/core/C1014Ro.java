package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1014Ro {
    public final Handler A00;
    public final InterfaceC1015Rp A01;

    public C1014Ro(Handler handler, InterfaceC1015Rp interfaceC1015Rp) {
        this.A00 = interfaceC1015Rp != null ? (Handler) AbstractC1517es.A01(handler) : null;
        this.A01 = interfaceC1015Rp;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A00(final int i) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Rm
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A01(final int i, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Rf
                @Override // java.lang.Runnable
                public final void run() {
                    this.A03.A02(i, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i, long j, long j2) {
        ((InterfaceC1015Rp) AbstractC1600gE.A0f(this.A01)).ACR(i, j, j2);
    }

    public final void A03(final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.RZ
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A04(j);
                }
            });
        }
    }

    public final /* synthetic */ void A04(long j) {
        ((InterfaceC1015Rp) AbstractC1600gE.A0f(this.A01)).ACN(j);
    }

    public final void A05(final OA oa) {
        oa.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Rg
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A07(oa);
                }
            });
        }
    }

    public final void A06(final OA oa) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Ra
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A08(oa);
                }
            });
        }
    }

    public final /* synthetic */ void A07(OA oa) {
        oa.A02();
        ((InterfaceC1015Rp) AbstractC1600gE.A0f(this.A01)).ACJ(oa);
    }

    public final /* synthetic */ void A08(OA oa) {
        ((InterfaceC1015Rp) AbstractC1600gE.A0f(this.A01)).ACK(oa);
    }

    public final void A09(final ZM zm, final OD od) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Re
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0A(zm, od);
                }
            });
        }
    }

    public final /* synthetic */ void A0A(ZM zm, OD od) {
        ((InterfaceC1015Rp) AbstractC1600gE.A0f(this.A01)).ACL(zm);
        ((InterfaceC1015Rp) AbstractC1600gE.A0f(this.A01)).ACM(zm, od);
    }

    public final void A0B(final C1017Rr c1017Rr) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Rl
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0C(final C1017Rr c1017Rr) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Rn
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0D(final Exception exc) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Rd
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A0E(exc);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Exception exc) {
        ((InterfaceC1015Rp) AbstractC1600gE.A0f(this.A01)).ACO(exc);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Rc
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Rj
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0H(str, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j, long j2) {
        ((InterfaceC1015Rp) AbstractC1600gE.A0f(this.A01)).ACI(str, j, j2);
    }

    public final void A0I(final boolean z) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Ri
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A0J(z);
                }
            });
        }
    }

    public final /* synthetic */ void A0J(boolean z) {
        ((InterfaceC1015Rp) AbstractC1600gE.A0f(this.A01)).AF7(z);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0K(final byte[] bArr, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Rh
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}
