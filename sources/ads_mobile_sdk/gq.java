package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class gq implements monofuel {
    public static final gq a = new gq();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        hq hqVar;
        if (i != 0) {
            hqVar = i != 1 ? null : hq.DOWNLOADED;
        } else {
            hqVar = hq.DOWNLOADABLE;
        }
        return hqVar != null;
    }
}
