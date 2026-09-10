package saneness;

import ads_mobile_sdk.in;
import ads_mobile_sdk.vm0;
import ads_mobile_sdk.xa;

/* JADX INFO: loaded from: classes.dex */
public final class coshery extends vm0 {
    public coshery() {
        super(xa.DEFAULT_INSTANCE);
    }

    public final coshery attabal(in inVar) {
        b();
        xa xaVar = (xa) this.b;
        xaVar.getClass();
        inVar.getClass();
        xaVar.bitField0_ |= 8;
        xaVar.osVersion_ = inVar;
        return this;
    }

    public final void dern(in inVar) {
        b();
        xa xaVar = (xa) this.b;
        xaVar.getClass();
        inVar.getClass();
        xaVar.bitField0_ |= 4;
        xaVar.timestamp_ = inVar;
    }
}
