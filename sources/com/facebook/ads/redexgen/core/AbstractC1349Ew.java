package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1349Ew {
    public InterfaceC1348Ev A00;
    public F6 A01;

    public abstract boolean A0Y();

    public abstract C1350Ex A0b(InterfaceC11797p[] interfaceC11797pArr, C2690nW c2690nW, C2708no c2708no, Timeline timeline) throws AD;

    public abstract void A0c(Object obj);

    public final F6 A00() {
        return (F6) AbstractC10843y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC1348Ev interfaceC1348Ev, F6 f6) {
        this.A00 = interfaceC1348Ev;
        this.A01 = f6;
    }
}
