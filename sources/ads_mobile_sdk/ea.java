package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class ea implements monofuel {
    public static final ea a = new ea();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        fa faVar;
        switch (i) {
            case 0:
                faVar = fa.NETWORK_INTERFACE_UNSPECIFIED;
                break;
            case 1:
                faVar = fa.NETWORK_INTERFACE_NOT_SET;
                break;
            case 2:
                faVar = fa.NETWORK_INTERFACE_ERROR;
                break;
            case 3:
                faVar = fa.NETWORK_INTERFACE_WIFI;
                break;
            case 4:
                faVar = fa.NETWORK_INTERFACE_CELLULAR;
                break;
            case 5:
                faVar = fa.NETWORK_INTERFACE_ETHERNET;
                break;
            case 6:
                faVar = fa.NETWORK_INTERFACE_LOOPBACK;
                break;
            case 7:
                faVar = fa.NETWORK_INTERFACE_OTHER;
                break;
            case 8:
                faVar = fa.NETWORK_INTERFACE_NO_CONNECTION;
                break;
            default:
                faVar = null;
                break;
        }
        return faVar != null;
    }
}
