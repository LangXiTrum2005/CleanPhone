package saneness;

import ads_mobile_sdk.cd1;
import ads_mobile_sdk.vm0;
import ads_mobile_sdk.xk1;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class strokes extends vm0 {
    public strokes() {
        super(xk1.DEFAULT_INSTANCE);
    }

    public final void attabal(long j) {
        b();
        ((xk1) this.b).appVersionCode_ = j;
    }

    public final void dern(String str, boolean z) {
        str.getClass();
        b();
        xk1 xk1Var = (xk1) this.b;
        cd1 cd1Var = xk1Var.adUnitToUseMediaView_;
        if (!cd1Var.a) {
            xk1Var.adUnitToUseMediaView_ = cd1Var.b();
        }
        xk1Var.adUnitToUseMediaView_.put(str, Boolean.valueOf(z));
    }

    public final Map wireman() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((xk1) this.b).adUnitToUseMediaView_));
    }
}
