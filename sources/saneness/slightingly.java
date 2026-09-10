package saneness;

import ads_mobile_sdk.cd1;
import ads_mobile_sdk.j;
import ads_mobile_sdk.td1;
import ads_mobile_sdk.vm0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class slightingly extends vm0 {
    public slightingly() {
        super(td1.DEFAULT_INSTANCE);
    }

    public final void attabal(ArrayList arrayList) {
        b();
        td1 td1Var = (td1) this.b;
        prescient prescientVar = td1Var.adapters_;
        if (!((j) prescientVar).a) {
            td1Var.adapters_ = listeriosis.attabal(prescientVar, 2);
        }
        lamplit.a(arrayList, td1Var.adapters_);
    }

    public final void dern(LinkedHashMap linkedHashMap) {
        b();
        td1 td1Var = (td1) this.b;
        cd1 cd1Var = td1Var.data_;
        if (!cd1Var.a) {
            td1Var.data_ = cd1Var.b();
        }
        td1Var.data_.putAll(linkedHashMap);
    }

    public final Map marial() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((td1) this.b).data_));
    }

    public final List wireman() {
        return Collections.unmodifiableList(((td1) this.b).adapters_);
    }
}
