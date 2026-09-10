package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class qp implements monofuel {
    public static final qp a = new qp();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        rp rpVar;
        if (i == 1) {
            rpVar = rp.BLOB_STATE_AVAILABLE;
        } else if (i == 2) {
            rpVar = rp.BLOB_STATE_INACTIVE;
        } else if (i != 3) {
            rpVar = i != 4 ? null : rp.BLOB_STATE_FAILED;
        } else {
            rpVar = rp.BLOB_STATE_ACTIVE;
        }
        return rpVar != null;
    }
}
