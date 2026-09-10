package saneness;

import ads_mobile_sdk.j;
import ads_mobile_sdk.vm0;
import ads_mobile_sdk.ye1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kith extends vm0 {
    public kith() {
        super(ye1.DEFAULT_INSTANCE);
    }

    public final void attabal(ArrayList arrayList) {
        b();
        ye1 ye1Var = (ye1) this.b;
        prescient prescientVar = ye1Var.adNetworkInfo_;
        if (!((j) prescientVar).a) {
            ye1Var.adNetworkInfo_ = listeriosis.attabal(prescientVar, 2);
        }
        lamplit.a(arrayList, ye1Var.adNetworkInfo_);
    }

    public final List dern() {
        return Collections.unmodifiableList(((ye1) this.b).adNetworkInfo_);
    }
}
