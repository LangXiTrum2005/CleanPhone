package saneness;

import ads_mobile_sdk.f10;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class sulfarsenide extends vm0 {
    public sulfarsenide() {
        super(f10.DEFAULT_INSTANCE);
    }

    public final void attabal(String str) {
        b();
        f10 f10Var = (f10) this.b;
        f10Var.getClass();
        str.getClass();
        f10Var.bitField0_ |= 1;
        f10Var.clientVersion_ = str;
    }

    public final void dern(boolean z) {
        b();
        f10 f10Var = (f10) this.b;
        f10Var.bitField0_ |= 4;
        f10Var.isInstantApps_ = z;
    }
}
