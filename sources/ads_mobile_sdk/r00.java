package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class r00 implements monofuel {
    public static final r00 a = new r00();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        s00 s00Var;
        if (i == 0) {
            s00Var = s00.UNSPECIFIED;
        } else if (i == 1) {
            s00Var = s00.PHISHY_CLICK_EVENT;
        } else if (i != 2) {
            s00Var = i != 3 ? null : s00.PHISHY_PASTE_EVENT;
        } else {
            s00Var = s00.PHISHY_KEY_EVENT;
        }
        return s00Var != null;
    }
}
