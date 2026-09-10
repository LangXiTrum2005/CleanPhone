package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class uc0 implements monofuel {
    public static final uc0 a = new uc0();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        vc0 vc0Var;
        switch (i) {
            case 0:
                vc0Var = vc0.DEVICE_TYPE_UNKNOWN;
                break;
            case 1:
                vc0Var = vc0.DEVICE_TYPE_PHONE;
                break;
            case 2:
                vc0Var = vc0.DEVICE_TYPE_TABLET;
                break;
            case 3:
                vc0Var = vc0.DEVICE_TYPE_WATCH;
                break;
            case 4:
                vc0Var = vc0.DEVICE_TYPE_AUTO;
                break;
            case 5:
                vc0Var = vc0.DEVICE_TYPE_TV;
                break;
            case 6:
                vc0Var = vc0.DEVICE_TYPE_PC;
                break;
            default:
                vc0Var = null;
                break;
        }
        return vc0Var != null;
    }
}
