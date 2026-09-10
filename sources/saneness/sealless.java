package saneness;

import ads_mobile_sdk.d;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sealless extends d {
    public sealless(int i) {
        super(i);
    }

    public final void attabal(String str, coffeecake coffeecakeVar) {
        LinkedHashMap linkedHashMap = this.a;
        if (coffeecakeVar == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMap.put(str, coffeecakeVar);
    }
}
