package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1180Ew {
    public InterfaceC1179Ev A00;
    public F6 A01;

    public abstract boolean A0Y();

    public abstract C1181Ex A0b(InterfaceC10107p[] interfaceC10107pArr, C2521nW c2521nW, C2539no c2539no, Timeline timeline) throws AD;

    public abstract void A0c(Object obj);

    public final F6 A00() {
        return (F6) AbstractC09153y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC1179Ev interfaceC1179Ev, F6 f6) {
        this.A00 = interfaceC1179Ev;
        this.A01 = f6;
    }
}
