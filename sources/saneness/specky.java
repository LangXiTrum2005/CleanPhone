package saneness;

import ads_mobile_sdk.g1;

/* JADX INFO: loaded from: classes.dex */
public final class specky {
    public static g1 attabal(int i) throws Exception {
        g1 g1Var = (g1) g1.c.get(Integer.valueOf(i));
        if (g1Var != null) {
            return g1Var;
        }
        throw new Exception("Invalid for value enum " + specky.class.getName() + ": " + i);
    }
}
