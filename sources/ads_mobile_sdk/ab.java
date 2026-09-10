package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class ab implements monofuel {
    public static final ab a = new ab();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        bb bbVar;
        switch (i) {
            case 0:
                bbVar = bb.UNKNOWN_ENCRYPTION_METHOD;
                break;
            case 1:
                bbVar = bb.BITSLICER;
                break;
            case 2:
                bbVar = bb.TINK_HYBRID;
                break;
            case 3:
                bbVar = bb.UNENCRYPTED;
                break;
            case 4:
                bbVar = bb.DG;
                break;
            case 5:
                bbVar = bb.DG_XTEA;
                break;
            case 6:
                bbVar = bb.ADSHIELD_3;
                break;
            default:
                bbVar = null;
                break;
        }
        return bbVar != null;
    }
}
