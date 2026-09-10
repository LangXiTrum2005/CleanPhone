package saneness;

import ads_mobile_sdk.tm;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class concerto extends vm0 {
    public concerto() {
        super(tm.DEFAULT_INSTANCE);
    }

    public final void attabal(long j) {
        b();
        tm tmVar = (tm) this.b;
        tmVar.bitField0_ |= 1;
        tmVar.major_ = j;
    }

    public final void dern(long j) {
        b();
        tm tmVar = (tm) this.b;
        tmVar.bitField0_ |= 4;
        tmVar.micro_ = j;
    }

    public final void wireman(long j) {
        b();
        tm tmVar = (tm) this.b;
        tmVar.bitField0_ |= 2;
        tmVar.minor_ = j;
    }
}
