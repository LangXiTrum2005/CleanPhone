package ads_mobile_sdk;

import saneness.coi;
import saneness.delouse;

/* JADX INFO: loaded from: classes.dex */
public final class h21 implements coi, delouse {
    public static final h21 b = new h21(null);
    public final Object a;

    public h21(Object obj) {
        this.a = obj;
    }

    public static h21 a(Object obj) {
        if (obj != null) {
            return new h21(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // saneness.adultoid
    public final Object get() {
        return this.a;
    }
}
