package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class v00 implements monofuel {
    public static final v00 a = new v00();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        w00 w00Var;
        if (i != 0) {
            w00Var = i != 1 ? null : w00.TYPE_CREATIVE;
        } else {
            w00Var = w00.TYPE_UNKNOWN;
        }
        return w00Var != null;
    }
}
