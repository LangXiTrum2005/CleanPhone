package saneness;

import ads_mobile_sdk.fl2;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class notornis extends vm0 {
    public notornis() {
        super(fl2.DEFAULT_INSTANCE);
    }

    public final void attabal(long j) {
        b();
        fl2 fl2Var = (fl2) this.b;
        fl2Var.bitField0_ |= 2;
        fl2Var.lastUpdateTimeMs_ = j;
    }

    public final void dern(String str) {
        b();
        fl2 fl2Var = (fl2) this.b;
        fl2Var.getClass();
        str.getClass();
        fl2Var.bitField0_ |= 1;
        fl2Var.cachedSdkCore_ = str;
    }
}
