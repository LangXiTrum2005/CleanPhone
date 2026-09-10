package ads_mobile_sdk;

import saneness.monofuel;

/* JADX INFO: loaded from: classes.dex */
public final class vy implements monofuel {
    public static final vy a = new vy();

    @Override // saneness.monofuel
    public final boolean a(int i) {
        wy wyVar;
        if (i != 0) {
            wyVar = i != 1 ? null : wy.CLIENT_GENERATION;
        } else {
            wyVar = wy.SOURCE_UNSPECIFIED;
        }
        return wyVar != null;
    }
}
