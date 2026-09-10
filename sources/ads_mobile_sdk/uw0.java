package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.salination;

/* JADX INFO: loaded from: classes.dex */
public final class uw0 implements coi {
    public final coffeecake a;

    public uw0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        coffeecake coffeecakeVar = this.a;
        return salination.attabal(coffeecakeVar, "nativeAdSettingsDataStore", coffeecakeVar, false);
    }
}
