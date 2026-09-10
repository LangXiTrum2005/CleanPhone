package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C12038o {
    public final Handler A00;
    public final InterfaceC12048p A01;

    public C12038o(Handler handler, InterfaceC12048p interfaceC12048p) {
        this.A00 = interfaceC12048p != null ? (Handler) AbstractC10843y.A01(handler) : null;
        this.A01 = interfaceC12048p;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A00(final int i2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8a
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A01(final int i2, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8e
                @Override // java.lang.Runnable
                public final void run() {
                    this.A03.A02(i2, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i2, long j, long j2) {
        ((InterfaceC12048p) C5C.A0f(this.A01)).AD9(i2, j, j2);
    }

    public final void A03(final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8f
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A04(j);
                }
            });
        }
    }

    public final /* synthetic */ void A04(long j) {
        ((InterfaceC12048p) C5C.A0f(this.A01)).AD5(j);
    }

    public final void A05(final C2860qI c2860qI, final C6L c6l) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8j
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A06(c2860qI, c6l);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C2860qI c2860qI, C6L c6l) {
        ((InterfaceC12048p) C5C.A0f(this.A01)).AD3(c2860qI);
        ((InterfaceC12048p) C5C.A0f(this.A01)).AD4(c2860qI, c6l);
    }

    public final void A07(final C6I c6i) {
        c6i.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8h
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A09(c6i);
                }
            });
        }
    }

    public final void A08(final C6I c6i) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8n
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0A(c6i);
                }
            });
        }
    }

    public final /* synthetic */ void A09(C6I c6i) {
        c6i.A02();
        ((InterfaceC12048p) C5C.A0f(this.A01)).AD1(c6i);
    }

    public final /* synthetic */ void A0A(C6I c6i) {
        ((InterfaceC12048p) C5C.A0f(this.A01)).AD2(c6i);
    }

    public final void A0B(final C12058r c12058r) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8d
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0C(final C12058r c12058r) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8Z
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0D(final Exception exc) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8g
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A0E(exc);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Exception exc) {
        ((InterfaceC12048p) C5C.A0f(this.A01)).AD6(exc);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8k
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8Y
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0H(str, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j, long j2) {
        ((InterfaceC12048p) C5C.A0f(this.A01)).AD0(str, j, j2);
    }

    public final void A0I(final boolean z2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8c
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A0J(z2);
                }
            });
        }
    }

    public final /* synthetic */ void A0J(boolean z2) {
        ((InterfaceC12048p) C5C.A0f(this.A01)).AFy(z2);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0K(final byte[] bArr, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8l
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}
