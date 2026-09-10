package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class gb implements monofuel {
    public static final gb a = new gb();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        hb hbVar;
        if (i == 0) {
            hbVar = hb.UNKNOWN_PROTO;
        } else if (i == 1) {
            hbVar = hb.AFMA_SIGNALS;
        } else if (i == 2) {
            hbVar = hb.UNITY_SIGNALS;
        } else if (i != 3) {
            hbVar = i != 4 ? null : hb.FALLBACK_SIGNALS;
        } else {
            hbVar = hb.PARTNER_SIGNALS;
        }
        return hbVar != null;
    }
}
