package saneness;

import ads_mobile_sdk.cd1;
import ads_mobile_sdk.m8;
import ads_mobile_sdk.vm0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cosurveillance extends vm0 {
    public cosurveillance() {
        super(m8.DEFAULT_INSTANCE);
    }

    public final void attabal(String str) {
        b();
        m8 m8Var = (m8) this.b;
        m8Var.getClass();
        m8Var.bitField0_ |= 1;
        m8Var.format_ = str;
    }

    public final void dern(String str, String str2) {
        str.getClass();
        str2.getClass();
        b();
        m8 m8Var = (m8) this.b;
        cd1 cd1Var = m8Var.extras_;
        if (!cd1Var.a) {
            m8Var.extras_ = cd1Var.b();
        }
        m8Var.extras_.put(str, str2);
    }

    public final Map wireman() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((m8) this.b).extras_));
    }
}
