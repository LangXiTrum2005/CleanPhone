package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class g10 implements monofuel {
    public static final g10 a = new g10();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        h10 h10Var;
        switch (i) {
            case 0:
                h10Var = h10.SAFE_BROWSING_URL_API_TYPE_UNSPECIFIED;
                break;
            case 1:
                h10Var = h10.PVER3_NATIVE;
                break;
            case 2:
                h10Var = h10.PVER4_NATIVE;
                break;
            case 3:
                h10Var = h10.ANDROID_SAFETYNET;
                break;
            case 4:
                h10Var = h10.FLYWHEEL;
                break;
            case 5:
                h10Var = h10.REAL_TIME;
                break;
            case 6:
                h10Var = h10.PVER5_NATIVE_REAL_TIME;
                break;
            case 7:
                h10Var = h10.ANDROID_SAFEBROWSING_REAL_TIME;
                break;
            case 8:
                h10Var = h10.ANDROID_SAFEBROWSING;
                break;
            case 9:
                h10Var = h10.CLIENT_SIDE_DETECTION;
                break;
            default:
                h10Var = null;
                break;
        }
        return h10Var != null;
    }
}
