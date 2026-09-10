package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class u9 implements monofuel {
    public static final u9 a = new u9();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        v9 v9Var;
        if (i == 0) {
            v9Var = v9.FUNCTION_UNSPECIFIED;
        } else if (i == 1) {
            v9Var = v9.FUNCTION_METHOD_EXCHANGEIMPLEMENTATIONS;
        } else if (i == 2) {
            v9Var = v9.FUNCTION_METHOD_SETIMPLEMENTATIONS;
        } else if (i != 3) {
            v9Var = i != 4 ? null : v9.FUNCTION_CLASS_REPLACEMETHOD;
        } else {
            v9Var = v9.FUNCTION_CLASS_ADDMETHOD;
        }
        return v9Var != null;
    }
}
