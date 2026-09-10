package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class a10 implements monofuel {
    public static final a10 a = new a10();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        b10 b10Var;
        if (i == 0) {
            b10Var = b10.AD_RESOURCE_UNKNOWN;
        } else if (i == 1) {
            b10Var = b10.AD_RESOURCE_CREATIVE;
        } else if (i != 2) {
            b10Var = i != 3 ? null : b10.AD_RESOURCE_AUTO_CLICK_DESTINATION;
        } else {
            b10Var = b10.AD_RESOURCE_POST_CLICK;
        }
        return b10Var != null;
    }
}
