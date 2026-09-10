package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class t10 implements monofuel {
    public static final t10 a = new t10();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        u10 u10Var;
        switch (i) {
            case 0:
                u10Var = u10.UNKNOWN;
                break;
            case 1:
                u10Var = u10.PHISHING_INTERSTITIAL;
                break;
            case 2:
                u10Var = u10.CLIENT_SIDE_PHISHING_INTERSTITIAL;
                break;
            case 3:
                u10Var = u10.MALWARE_INTERSTITIAL;
                break;
            case 4:
                u10Var = u10.UWS_INTERSTITIAL;
                break;
            case 5:
                u10Var = u10.BILLING_INTERSTITIAL;
                break;
            case 6:
                u10Var = u10.BINARY_MALWARE_DOWNLOAD_WARNING;
                break;
            default:
                u10Var = null;
                break;
        }
        return u10Var != null;
    }
}
