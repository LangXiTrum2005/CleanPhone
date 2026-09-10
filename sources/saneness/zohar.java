package saneness;

import ads_mobile_sdk.om;

/* JADX INFO: loaded from: classes.dex */
public final class zohar implements artsy {
    @Override // saneness.artsy
    public final Object a(int i) {
        om omVar;
        if (i != 0) {
            omVar = i != 1 ? null : om.COLLECTED_BIDDING_SIGNAL;
        } else {
            omVar = om.UNKNOWN;
        }
        return omVar == null ? om.UNKNOWN : omVar;
    }
}
