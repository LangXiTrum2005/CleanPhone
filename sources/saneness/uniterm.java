package saneness;

import ads_mobile_sdk.b12;
import ads_mobile_sdk.cd1;
import ads_mobile_sdk.gt;
import ads_mobile_sdk.mv;
import ads_mobile_sdk.n32;
import ads_mobile_sdk.vm0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class uniterm extends vm0 {
    public uniterm() {
        super(mv.DEFAULT_INSTANCE);
    }

    public final void attabal(b12 b12Var) {
        b();
        mv mvVar = (mv) this.b;
        mvVar.getClass();
        b12Var.getClass();
        mvVar.patternMatchingFlag_ = b12Var;
        mvVar.bitField0_ |= 4;
    }

    public final void beachfront(LinkedHashMap linkedHashMap) {
        b();
        mv mvVar = (mv) this.b;
        cd1 cd1Var = mvVar.concatenatedSignalsMap_;
        if (!cd1Var.a) {
            mvVar.concatenatedSignalsMap_ = cd1Var.b();
        }
        mvVar.concatenatedSignalsMap_.putAll(linkedHashMap);
    }

    public final void competently(String str) {
        b();
        mv mvVar = (mv) this.b;
        mvVar.getClass();
        str.getClass();
        mvVar.bitField0_ |= 1;
        mvVar.consentStringJson_ = str;
    }

    public final void dern(gt gtVar) {
        b();
        mv mvVar = (mv) this.b;
        mvVar.getClass();
        gtVar.getClass();
        mvVar.consentAllowlist_ = gtVar;
        mvVar.bitField0_ |= 16;
    }

    public final Map impromptu() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((mv) this.b).concatenatedSignalsMap_));
    }

    public final void marial(String str) {
        b();
        mv mvVar = (mv) this.b;
        mvVar.getClass();
        str.getClass();
        mvVar.bitField0_ |= 2;
        mvVar.consentStateJson_ = str;
    }

    public final void wireman(n32 n32Var) {
        b();
        mv mvVar = (mv) this.b;
        mvVar.getClass();
        n32Var.getClass();
        mvVar.preProcessingFlag_ = n32Var;
        mvVar.bitField0_ |= 8;
    }
}
