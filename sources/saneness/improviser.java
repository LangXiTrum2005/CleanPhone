package saneness;

import ads_mobile_sdk.t72;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class improviser extends vm0 {
    public improviser() {
        super(t72.DEFAULT_INSTANCE);
    }

    public final void attabal(long j) {
        b();
        t72 t72Var = (t72) this.b;
        t72Var.bitField0_ |= 64;
        t72Var.appStartProgramUpdateDelayMs_ = j;
    }

    public final void beachfront(boolean z) {
        b();
        t72 t72Var = (t72) this.b;
        t72Var.bitField0_ |= 4;
        t72Var.updateBeforeInitialization_ = z;
    }

    public final void competently(long j) {
        b();
        t72 t72Var = (t72) this.b;
        t72Var.bitField0_ |= 16;
        t72Var.programAlmostExpiredMs_ = j;
    }

    public final void dern(String str) {
        b();
        t72 t72Var = (t72) this.b;
        t72Var.getClass();
        str.getClass();
        t72Var.bitField0_ |= 32;
        t72Var.programRequestUrl_ = str;
    }

    public final void impromptu(long j) {
        b();
        t72 t72Var = (t72) this.b;
        t72Var.bitField0_ |= 512;
        t72Var.retryBaseIntervalMs_ = j;
    }

    public final void marial(long j) {
        b();
        t72 t72Var = (t72) this.b;
        t72Var.bitField0_ |= 256;
        t72Var.maxRetryCount_ = j;
    }

    public final void wireman(boolean z) {
        b();
        t72 t72Var = (t72) this.b;
        t72Var.bitField0_ |= 128;
        t72Var.enableRetryDownload_ = z;
    }
}
