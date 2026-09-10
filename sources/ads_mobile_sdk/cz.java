package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class cz implements monofuel {
    public static final cz a = new cz();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        dz dzVar;
        if (i == 0) {
            dzVar = dz.UNKNOWN_USER_POPULATION;
        } else if (i == 1) {
            dzVar = dz.SAFE_BROWSING;
        } else if (i != 2) {
            dzVar = i != 3 ? null : dz.ENHANCED_PROTECTION;
        } else {
            dzVar = dz.EXTENDED_REPORTING;
        }
        return dzVar != null;
    }
}
