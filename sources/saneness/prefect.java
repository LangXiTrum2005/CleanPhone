package saneness;

import ads_mobile_sdk.d42;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class prefect extends vm0 {
    public prefect() {
        super(d42.DEFAULT_INSTANCE);
    }

    public final void attabal(int i) {
        b();
        ((d42) this.b).maxBufferSize_ = i;
    }

    public final void beachfront(String str) {
        b();
        d42 d42Var = (d42) this.b;
        d42Var.getClass();
        str.getClass();
        d42Var.preloadId_ = str;
    }

    public final void competently(boolean z) {
        b();
        ((d42) this.b).preloadInFlight_ = z;
    }

    public final void dern(String str) {
        b();
        d42 d42Var = (d42) this.b;
        d42Var.getClass();
        str.getClass();
        d42Var.evictedAdId_ = str;
    }

    public final void marial(int i) {
        b();
        ((d42) this.b).numPreloadedAds_ = i;
    }

    public final void wireman(boolean z) {
        b();
        ((d42) this.b).cacheHit_ = z;
    }
}
