package saneness;

import ads_mobile_sdk.h03;
import ads_mobile_sdk.j;
import ads_mobile_sdk.j03;
import ads_mobile_sdk.vm0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class leh extends vm0 {
    public leh() {
        super(j03.DEFAULT_INSTANCE);
    }

    public final void attabal(h03 h03Var) {
        b();
        j03 j03Var = (j03) this.b;
        j03Var.getClass();
        prescient prescientVar = j03Var.androidTopics_;
        if (!((j) prescientVar).a) {
            j03Var.androidTopics_ = listeriosis.attabal(prescientVar, 2);
        }
        j03Var.androidTopics_.add(h03Var);
    }

    public final List dern() {
        return Collections.unmodifiableList(((j03) this.b).androidTopics_);
    }
}
