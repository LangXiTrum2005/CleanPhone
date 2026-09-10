package ads_mobile_sdk;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import saneness.coffeecake;
import saneness.coi;
import saneness.salination;

/* JADX INFO: loaded from: classes.dex */
public final class ww0 implements coi {
    public final coffeecake a;

    public ww0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        coffeecake coffeecakeVar = this.a;
        return salination.attabal(coffeecakeVar, CampaignEx.KEY_OMID, coffeecakeVar, false);
    }
}
