package saneness;

import ads_mobile_sdk.j;
import ads_mobile_sdk.vm0;
import ads_mobile_sdk.z6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class enthrallment extends vm0 {
    public enthrallment() {
        super(z6.DEFAULT_INSTANCE);
    }

    public final void attabal(ArrayList arrayList) {
        b();
        z6 z6Var = (z6) this.b;
        prescient prescientVar = z6Var.adUnitPatterns_;
        if (!((j) prescientVar).a) {
            z6Var.adUnitPatterns_ = listeriosis.attabal(prescientVar, 2);
        }
        lamplit.a(arrayList, z6Var.adUnitPatterns_);
    }

    public final List dern() {
        return Collections.unmodifiableList(((z6) this.b).adUnitPatterns_);
    }
}
