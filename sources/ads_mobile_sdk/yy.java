package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class yy implements monofuel {
    public static final yy a = new yy();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        zy zyVar;
        if (i == 0) {
            zyVar = zy.UNKNOWN;
        } else if (i == 1) {
            zyVar = zy.UNAVAILABLE;
        } else if (i != 2) {
            zyVar = i != 3 ? null : zy.ENTERPRISE_MANAGED;
        } else {
            zyVar = zy.NOT_MANAGED;
        }
        return zyVar != null;
    }
}
