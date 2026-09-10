package saneness;

import ads_mobile_sdk.nk2;
import ads_mobile_sdk.ok2;
import ads_mobile_sdk.so0;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class monacal extends vm0 {
    public monacal() {
        super(ok2.DEFAULT_INSTANCE);
    }

    public final void attabal(nk2 nk2Var) {
        b();
        ok2 ok2Var = (ok2) this.b;
        ok2Var.getClass();
        ok2Var.evictionReason_ = nk2Var.getNumber();
    }

    public final void dern(so0 so0Var) {
        b();
        ok2 ok2Var = (ok2) this.b;
        ok2Var.getClass();
        ok2Var.scarRequestType_ = so0Var.getNumber();
    }

    public final void marial(String str) {
        b();
        ok2 ok2Var = (ok2) this.b;
        ok2Var.getClass();
        ok2Var.requestId_ = str;
    }

    public final void wireman(String str) {
        b();
        ok2 ok2Var = (ok2) this.b;
        ok2Var.getClass();
        ok2Var.requestAgent_ = str;
    }
}
