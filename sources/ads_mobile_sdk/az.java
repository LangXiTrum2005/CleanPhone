package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class az implements monofuel {
    public static final az a = new az();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        bz bzVar;
        if (i == 0) {
            bzVar = bz.UNSPECIFIED;
        } else if (i == 1) {
            bzVar = bz.TAILORED_WARNING_CT_BASE;
        } else if (i == 2) {
            bzVar = bz.TAILORED_WARNING_CT;
        } else if (i == 3) {
            bzVar = bz.TAILORED_WARNING_CT_ACCOUNT_INFO;
        } else if (i != 4) {
            bzVar = i != 5 ? null : bz.TAILORED_WARNING_SUSPICIOUS;
        } else {
            bzVar = bz.TAILORED_WARNING_SUSPICIOUS_BASE;
        }
        return bzVar != null;
    }
}
