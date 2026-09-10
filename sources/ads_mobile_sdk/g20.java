package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class g20 implements monofuel {
    public static final g20 a = new g20();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        h20 h20Var;
        switch (i) {
            case 1:
                h20Var = h20.EVENT_URL;
                break;
            case 2:
                h20Var = h20.LANDING_PAGE;
                break;
            case 3:
                h20Var = h20.LANDING_REFERRER;
                break;
            case 4:
                h20Var = h20.CLIENT_REDIRECT;
                break;
            case 5:
                h20Var = h20.SERVER_REDIRECT;
                break;
            case 6:
                h20Var = h20.RECENT_NAVIGATION;
                break;
            case 7:
                h20Var = h20.REFERRER;
                break;
            default:
                h20Var = null;
                break;
        }
        return h20Var != null;
    }
}
