package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class q9 implements monofuel {
    public static final q9 a = new q9();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        r9 r9Var;
        switch (i) {
            case 0:
                r9Var = r9.DEVICE_IDENTIFIER_NO_ID;
                break;
            case 1:
                r9Var = r9.DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
                break;
            case 2:
                r9Var = r9.DEVICE_IDENTIFIER_GLOBAL_ID;
                break;
            case 3:
                r9Var = r9.DEVICE_IDENTIFIER_ADVERTISER_ID;
                break;
            case 4:
                r9Var = r9.DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
                break;
            case 5:
                r9Var = r9.DEVICE_IDENTIFIER_ANDROID_AD_ID;
                break;
            case 6:
                r9Var = r9.DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
                break;
            case 7:
                r9Var = r9.DEVICE_IDENTIFIER_PER_APP_ID;
                break;
            case 8:
                r9Var = r9.DEVICE_IDENTIFIER_PER_APP_ID_V2;
                break;
            case 9:
                r9Var = r9.DEVICE_IDENTIFIER_CONNECTED_TV_IFA;
                break;
            default:
                r9Var = null;
                break;
        }
        return r9Var != null;
    }
}
