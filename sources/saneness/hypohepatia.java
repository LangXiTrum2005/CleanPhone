package saneness;

import ads_mobile_sdk.v11;
import ads_mobile_sdk.vm0;
import ads_mobile_sdk.w11;

/* JADX INFO: loaded from: classes.dex */
public final class hypohepatia extends vm0 {
    public hypohepatia() {
        super(w11.DEFAULT_INSTANCE);
    }

    public final void attabal(long j) {
        b();
        ((w11) this.b).installBeginTimestampSeconds_ = j;
    }

    public final void beachfront(long j) {
        b();
        ((w11) this.b).installBeginTimestampServerSeconds_ = j;
    }

    public final void competently(String str) {
        b();
        w11 w11Var = (w11) this.b;
        w11Var.getClass();
        w11Var.installVersion_ = str;
    }

    public final void dern(v11 v11Var) {
        b();
        w11 w11Var = (w11) this.b;
        w11Var.getClass();
        w11Var.installReferrerErrorCode_ = v11Var.getNumber();
    }

    public final void impromptu(long j) {
        b();
        ((w11) this.b).referrerClickTimestampSeconds_ = j;
    }

    public final void marial(boolean z) {
        b();
        ((w11) this.b).googlePlayInstant_ = z;
    }

    public final void taiyuan(long j) {
        b();
        ((w11) this.b).referrerClickTimestampServerSeconds_ = j;
    }

    public final void wireman(String str) {
        b();
        w11 w11Var = (w11) this.b;
        w11Var.getClass();
        w11Var.installReferrer_ = str;
    }
}
