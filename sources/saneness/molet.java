package saneness;

import ads_mobile_sdk.d1;

/* JADX INFO: loaded from: classes.dex */
public final class molet {
    public static d1 attabal(int i) throws Exception {
        d1 d1Var = (d1) d1.c.get(Integer.valueOf(i));
        if (d1Var != null) {
            return d1Var;
        }
        throw new Exception("Invalid value for enum " + molet.class.getName() + ": " + i);
    }
}
