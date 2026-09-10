package saneness;

import ads_mobile_sdk.hm;
import ads_mobile_sdk.rm;
import ads_mobile_sdk.vm0;

/* JADX INFO: loaded from: classes.dex */
public final class physical extends vm0 {
    public physical() {
        super(rm.DEFAULT_INSTANCE);
    }

    public final void attabal(hm hmVar) {
        b();
        rm rmVar = (rm) this.b;
        rmVar.getClass();
        rmVar.errorType_ = hmVar.a;
        rmVar.bitField0_ |= 1;
    }

    public final void dern(String str) {
        b();
        rm rmVar = (rm) this.b;
        rmVar.getClass();
        str.getClass();
        rmVar.bitField0_ |= 2;
        rmVar.errorDescription_ = str;
    }
}
