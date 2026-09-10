package saneness;

import ads_mobile_sdk.cd1;
import ads_mobile_sdk.sl;
import ads_mobile_sdk.vm0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cutwater extends vm0 {
    public cutwater() {
        super(sl.DEFAULT_INSTANCE);
    }

    public final void attabal(String str) {
        b();
        sl slVar = (sl) this.b;
        slVar.getClass();
        str.getClass();
        slVar.bitField0_ |= 1;
        slVar.adapterClassName_ = str;
    }

    public final void beachfront(boolean z) {
        b();
        sl slVar = (sl) this.b;
        slVar.bitField0_ |= 2;
        slVar.shouldGatherSignals_ = z;
    }

    public final Map competently() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((sl) this.b).serverParameters_));
    }

    public final void dern(Map map) {
        b();
        sl slVar = (sl) this.b;
        cd1 cd1Var = slVar.serverParameters_;
        if (!cd1Var.a) {
            slVar.serverParameters_ = cd1Var.b();
        }
        slVar.serverParameters_.putAll(map);
    }

    public final void marial(String str) {
        b();
        sl slVar = (sl) this.b;
        slVar.getClass();
        str.getClass();
        slVar.bitField0_ |= 8;
        slVar.platform_ = str;
    }

    public final void wireman(boolean z) {
        b();
        sl slVar = (sl) this.b;
        slVar.bitField0_ |= 4;
        slVar.shouldCollectSignalsOnFullApp_ = z;
    }
}
