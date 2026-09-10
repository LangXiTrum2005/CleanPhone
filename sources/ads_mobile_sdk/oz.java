package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class oz implements monofuel {
    public static final oz a = new oz();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        pz pzVar;
        switch (i) {
            case 0:
                pzVar = pz.ACTION_UNSPECIFIED;
                break;
            case 1:
                pzVar = pz.PROCEED;
                break;
            case 2:
                pzVar = pz.DISCARD;
                break;
            case 3:
                pzVar = pz.KEEP;
                break;
            case 4:
                pzVar = pz.CLOSE;
                break;
            case 5:
                pzVar = pz.CANCEL;
                break;
            case 6:
                pzVar = pz.DISMISS;
                break;
            case 7:
                pzVar = pz.BACK;
                break;
            case 8:
                pzVar = pz.OPEN_SUBPAGE;
                break;
            case 9:
                pzVar = pz.PROCEED_DEEP_SCAN;
                break;
            case 10:
                pzVar = pz.OPEN_LEARN_MORE_LINK;
                break;
            default:
                pzVar = null;
                break;
        }
        return pzVar != null;
    }
}
