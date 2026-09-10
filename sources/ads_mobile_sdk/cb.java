package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class cb implements monofuel {
    public static final cb a = new cb();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        db dbVar;
        if (i == 0) {
            dbVar = db.ENUM_FALSE;
        } else if (i == 1) {
            dbVar = db.ENUM_TRUE;
        } else if (i != 2) {
            dbVar = i != 1000 ? null : db.ENUM_UNKNOWN;
        } else {
            dbVar = db.ENUM_FAILURE;
        }
        return dbVar != null;
    }
}
