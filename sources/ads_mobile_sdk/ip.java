package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class ip implements monofuel {
    public static final ip a = new ip();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        jp jpVar;
        if (i == 0) {
            jpVar = jp.NONE;
        } else if (i == 1) {
            jpVar = jp.GZIP;
        } else if (i != 2) {
            jpVar = i != 3 ? null : jp.UNKNOWN;
        } else {
            jpVar = jp.BROTLI;
        }
        return jpVar != null;
    }
}
