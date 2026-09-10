package saneness;

import ads_mobile_sdk.nc1;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class inceptive extends vm0 {
    public inceptive() {
        super(nc1.DEFAULT_INSTANCE);
    }

    public final void attabal(float f) {
        b();
        nc1 nc1Var = (nc1) this.b;
        nc1Var.bitField0_ |= 2;
        nc1Var.logSampleRate_ = f;
    }

    public final void dern(long j) {
        b();
        nc1 nc1Var = (nc1) this.b;
        nc1Var.bitField0_ |= 4;
        nc1Var.logBufferSize_ = j;
    }

    public final void marial(long j) {
        b();
        nc1 nc1Var = (nc1) this.b;
        nc1Var.bitField0_ |= 8;
        nc1Var.logIntervalMs_ = j;
    }

    public final void wireman(String str) {
        b();
        nc1 nc1Var = (nc1) this.b;
        nc1Var.getClass();
        str.getClass();
        nc1Var.bitField0_ |= 1;
        nc1Var.remoteCaptureServiceUrl_ = str;
    }
}
