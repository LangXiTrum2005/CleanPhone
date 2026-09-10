package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class s9 implements monofuel {
    public static final s9 a = new s9();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        t9 t9Var;
        if (i != 0) {
            t9Var = i != 1 ? null : t9.FALLBACK_TIMEOUT;
        } else {
            t9Var = t9.FALLBACK_NONE;
        }
        return t9Var != null;
    }
}
