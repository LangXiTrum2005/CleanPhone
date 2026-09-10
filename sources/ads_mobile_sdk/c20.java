package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class c20 implements monofuel {
    public static final c20 a = new c20();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        d20 d20Var;
        if (i == 0) {
            d20Var = d20.UNDEFINED;
        } else if (i == 1) {
            d20Var = d20.BROWSER_INITIATED;
        } else if (i == 2) {
            d20Var = d20.RENDERER_INITIATED_WITHOUT_USER_GESTURE;
        } else if (i == 3) {
            d20Var = d20.RENDERER_INITIATED_WITH_USER_GESTURE;
        } else if (i != 4) {
            d20Var = i != 5 ? null : d20.NOTIFICATION_INITIATED;
        } else {
            d20Var = d20.COPY_PASTE_USER_INITIATED;
        }
        return d20Var != null;
    }
}
