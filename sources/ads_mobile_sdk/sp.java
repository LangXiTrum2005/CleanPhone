package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class sp implements monofuel {
    public static final sp a = new sp();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        tp tpVar;
        if (i == 0) {
            tpVar = tp.BLOB_TYPE_UNKNOWN;
        } else if (i == 1) {
            tpVar = tp.BLOB_TYPE_DEFAULT;
        } else if (i == 2) {
            tpVar = tp.BLOB_TYPE_JAR;
        } else if (i != 3) {
            tpVar = i != 4 ? null : tp.BLOB_TYPE_BRAIN_SUGGEST;
        } else {
            tpVar = tp.BLOB_TYPE_WEB_SUGGEST;
        }
        return tpVar != null;
    }
}
