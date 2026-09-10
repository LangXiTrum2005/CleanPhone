package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class f00 implements monofuel {
    public static final f00 a = new f00();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        g00 g00Var;
        if (i == 0) {
            g00Var = g00.SAFE_OR_OTHER;
        } else if (i == 1) {
            g00Var = g00.MALWARE;
        } else if (i == 2) {
            g00Var = g00.PHISHING;
        } else if (i != 3) {
            g00Var = i != 4 ? null : g00.BILLING;
        } else {
            g00Var = g00.UNWANTED;
        }
        return g00Var != null;
    }
}
