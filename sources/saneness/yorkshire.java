package saneness;

import ads_mobile_sdk.j;
import ads_mobile_sdk.v6;
import ads_mobile_sdk.vm0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yorkshire extends vm0 {
    public yorkshire() {
        super(v6.DEFAULT_INSTANCE);
    }

    public final void attabal(String str) {
        b();
        v6 v6Var = (v6) this.b;
        v6Var.getClass();
        str.getClass();
        v6Var.bitField0_ |= 1;
        v6Var.effectiveAdUnitId_ = str;
    }

    public final List beachfront() {
        return Collections.unmodifiableList(((v6) this.b).includingRegexes_);
    }

    public final void dern(ArrayList arrayList) {
        b();
        v6 v6Var = (v6) this.b;
        prescient prescientVar = v6Var.excludingRegexes_;
        if (!((j) prescientVar).a) {
            v6Var.excludingRegexes_ = listeriosis.attabal(prescientVar, 2);
        }
        lamplit.a(arrayList, v6Var.excludingRegexes_);
    }

    public final List marial() {
        return Collections.unmodifiableList(((v6) this.b).excludingRegexes_);
    }

    public final void wireman(ArrayList arrayList) {
        b();
        v6 v6Var = (v6) this.b;
        prescient prescientVar = v6Var.includingRegexes_;
        if (!((j) prescientVar).a) {
            v6Var.includingRegexes_ = listeriosis.attabal(prescientVar, 2);
        }
        lamplit.a(arrayList, v6Var.includingRegexes_);
    }
}
