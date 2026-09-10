package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class aq implements monofuel {
    public static final aq a = new aq();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        bq bqVar;
        if (i == 0) {
            bqVar = bq.BLOB_INCREMENT_NOOP;
        } else if (i != 1) {
            bqVar = i != 2 ? null : bq.BLOB_INCREMENT_FILEBYFILE;
        } else {
            bqVar = bq.BLOB_INCREMENT_BSDIFF;
        }
        return bqVar != null;
    }
}
