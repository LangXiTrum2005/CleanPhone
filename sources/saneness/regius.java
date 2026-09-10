package saneness;

import ads_mobile_sdk.az1;
import ads_mobile_sdk.dh;
import ads_mobile_sdk.i72;
import ads_mobile_sdk.j;
import ads_mobile_sdk.j21;
import ads_mobile_sdk.j72;
import ads_mobile_sdk.vm0;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class regius extends vm0 {
    public regius() {
        super(i72.DEFAULT_INSTANCE);
    }

    public final regius attabal(az1 az1Var) {
        b();
        i72 i72Var = (i72) this.b;
        i72Var.getClass();
        az1Var.getClass();
        i72Var.metadata_ = az1Var;
        i72Var.metadataCase_ = 2;
        return this;
    }

    public final regius dern(dh dhVar) {
        b();
        i72 i72Var = (i72) this.b;
        i72Var.getClass();
        i72Var.architecture_ = dhVar.a;
        i72Var.bitField0_ |= 1;
        return this;
    }

    public final regius marial(cyrtometer cyrtometerVar) {
        b();
        i72 i72Var = (i72) this.b;
        RandomAccess randomAccess = i72Var.activeExperimentIds_;
        if (!((j) randomAccess).a) {
            j21 j21Var = (j21) randomAccess;
            i72Var.activeExperimentIds_ = j21Var.a(j21Var.c * 2);
        }
        lamplit.a(cyrtometerVar, i72Var.activeExperimentIds_);
        return this;
    }

    public final regius wireman(j72 j72Var) {
        b();
        i72 i72Var = (i72) this.b;
        i72Var.getClass();
        j72Var.getClass();
        i72Var.metadata_ = j72Var;
        i72Var.metadataCase_ = 1;
        return this;
    }
}
