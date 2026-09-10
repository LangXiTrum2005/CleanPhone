package saneness;

import ads_mobile_sdk.vm0;
import ads_mobile_sdk.wo2;

/* JADX INFO: loaded from: classes.dex */
public final class unrenewable extends vm0 {
    public unrenewable() {
        super(wo2.DEFAULT_INSTANCE);
    }

    public final void attabal(boolean z) {
        b();
        ((wo2) this.b).automaticRefresh_ = z;
    }

    public final void dern(boolean z) {
        b();
        ((wo2) this.b).staleResultAllowed_ = z;
    }
}
