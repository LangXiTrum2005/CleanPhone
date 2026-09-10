package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class nm implements monofuel {
    public static final nm a = new nm();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        om omVar;
        if (i != 0) {
            omVar = i != 1 ? null : om.COLLECTED_BIDDING_SIGNAL;
        } else {
            omVar = om.UNKNOWN;
        }
        return omVar != null;
    }
}
