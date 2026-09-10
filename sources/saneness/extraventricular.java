package saneness;

import ads_mobile_sdk.j;
import ads_mobile_sdk.kq;
import ads_mobile_sdk.u5;
import ads_mobile_sdk.vm0;
import ads_mobile_sdk.w5;

/* JADX INFO: loaded from: classes.dex */
public final class extraventricular extends vm0 {
    public extraventricular() {
        super(w5.DEFAULT_INSTANCE);
    }

    public final extraventricular attabal(kq kqVar) {
        b();
        w5 w5Var = (w5) this.b;
        w5Var.getClass();
        kqVar.getClass();
        w5Var.clientPingMetadata_ = kqVar;
        w5Var.bitField0_ |= 1;
        return this;
    }

    public final extraventricular dern(u5 u5Var) {
        b();
        w5 w5Var = (w5) this.b;
        w5Var.getClass();
        prescient prescientVar = w5Var.payloads_;
        if (!((j) prescientVar).a) {
            w5Var.payloads_ = listeriosis.attabal(prescientVar, 2);
        }
        w5Var.payloads_.add(u5Var);
        return this;
    }
}
