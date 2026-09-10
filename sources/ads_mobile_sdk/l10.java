package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class l10 implements monofuel {
    public static final l10 a = new l10();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        m10 m10Var;
        if (i == 0) {
            m10Var = m10.SAFE_OR_OTHER;
        } else if (i == 1) {
            m10Var = m10.MALWARE;
        } else if (i == 2) {
            m10Var = m10.PHISHING;
        } else if (i != 3) {
            m10Var = i != 4 ? null : m10.BILLING;
        } else {
            m10Var = m10.UNWANTED;
        }
        return m10Var != null;
    }
}
