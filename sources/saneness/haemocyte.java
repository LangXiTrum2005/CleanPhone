package saneness;

import ads_mobile_sdk.m7;

/* JADX INFO: loaded from: classes.dex */
public final class haemocyte {
    public static m7 attabal(int i) throws Exception {
        m7 m7Var = (m7) m7.c.get(Integer.valueOf(i));
        if (m7Var != null) {
            return m7Var;
        }
        throw new Exception("Invalid for value enum " + haemocyte.class.getName() + ": " + i);
    }
}
