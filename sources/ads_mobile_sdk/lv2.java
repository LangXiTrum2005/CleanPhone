package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class lv2 implements monofuel {
    public static final lv2 a = new lv2();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        nv2 nv2Var;
        if (i == 0) {
            nv2Var = nv2.STATUS_UNKNOWN;
        } else if (i != 1) {
            nv2Var = i != 2 ? null : nv2.STATUS_FAIL;
        } else {
            nv2Var = nv2.STATUS_SUCCESS;
        }
        return nv2Var != null;
    }
}
