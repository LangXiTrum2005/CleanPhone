package saneness;

import ads_mobile_sdk.bz;

/* JADX INFO: loaded from: classes.dex */
public final class rhexis implements artsy {
    @Override // saneness.artsy
    public final Object a(int i) {
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
        return bzVar == null ? bz.UNSPECIFIED : bzVar;
    }
}
