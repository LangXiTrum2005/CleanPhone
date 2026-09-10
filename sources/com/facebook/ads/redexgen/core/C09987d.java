package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C09987d {
    public int A00;
    public int A01;
    public Looper A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Timeline A0A;
    public final AnonymousClass45 A0B;
    public final InterfaceC09967b A0C;
    public final InterfaceC09977c A0D;
    public long A02 = C.TIME_UNSET;
    public boolean A05 = true;

    public C09987d(InterfaceC09967b interfaceC09967b, InterfaceC09977c interfaceC09977c, Timeline timeline, int i, AnonymousClass45 anonymousClass45, Looper looper) {
        this.A0C = interfaceC09967b;
        this.A0D = interfaceC09977c;
        this.A0A = timeline;
        this.A03 = looper;
        this.A0B = anonymousClass45;
        this.A00 = i;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Looper A03() {
        return this.A03;
    }

    public final Timeline A04() {
        return this.A0A;
    }

    public final InterfaceC09977c A05() {
        return this.A0D;
    }

    public final C09987d A06() {
        AbstractC09153y.A08(!this.A09);
        if (this.A02 == C.TIME_UNSET) {
            AbstractC09153y.A07(this.A05);
        }
        this.A09 = true;
        this.A0C.AJC(this);
        return this;
    }

    public final C09987d A07(int i) {
        AbstractC09153y.A08(!this.A09);
        this.A01 = i;
        return this;
    }

    public final C09987d A08(Object obj) {
        AbstractC09153y.A08(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z) {
        this.A07 |= z;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        AbstractC09153y.A08(this.A09);
        AbstractC09153y.A08(this.A03.getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
