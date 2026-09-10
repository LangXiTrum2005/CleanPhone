package saneness;

import ads_mobile_sdk.gj0;
import ads_mobile_sdk.mv;
import ads_mobile_sdk.vm0;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class earstone extends vm0 {
    public earstone() {
        super(gj0.DEFAULT_INSTANCE);
    }

    public final void attabal(int i) {
        b();
        gj0 gj0Var = (gj0) this.b;
        gj0Var.bitField0_ |= 2;
        gj0Var.sessionsSinceUpdate_ = i;
    }

    public final int beachfront() {
        return ((gj0) this.b).sessionsSinceUpdate_;
    }

    public final Map competently() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((gj0) this.b).storedSdkCoreData_));
    }

    public final void dern(mv mvVar) {
        b();
        gj0 gj0Var = (gj0) this.b;
        gj0Var.getClass();
        mvVar.getClass();
        gj0Var.consentState_ = mvVar;
        gj0Var.bitField0_ |= 8;
    }

    public final void impromptu() {
        b();
        gj0 gj0Var = (gj0) this.b;
        gj0Var.bitField0_ |= 4;
        gj0Var.hasSdkInitializedPreviously_ = true;
    }

    public final void marial(String str) {
        b();
        gj0 gj0Var = (gj0) this.b;
        gj0Var.getClass();
        str.getClass();
        gj0Var.bitField0_ |= 1;
        gj0Var.flagJson_ = str;
    }

    public final void wireman(String str) {
        b();
        gj0 gj0Var = (gj0) this.b;
        gj0Var.getClass();
        str.getClass();
        gj0Var.bitField0_ |= 16;
        gj0Var.cachedUserAgent_ = str;
    }
}
