package saneness;

import ads_mobile_sdk.vm0;
import ads_mobile_sdk.xm1;

/* JADX INFO: loaded from: classes.dex */
public final class exonumist extends vm0 {
    public exonumist() {
        super(xm1.DEFAULT_INSTANCE);
    }

    public final void attabal() {
        b();
        xm1 xm1Var = (xm1) this.b;
        xm1Var.bitField0_ |= 2;
        xm1Var.clickToExpandRequested_ = true;
    }

    public final void dern() {
        b();
        xm1 xm1Var = (xm1) this.b;
        xm1Var.bitField0_ |= 4;
        xm1Var.customControlsRequested_ = true;
    }

    public final void wireman() {
        b();
        xm1 xm1Var = (xm1) this.b;
        xm1Var.bitField0_ |= 1;
        xm1Var.startMuted_ = true;
    }
}
