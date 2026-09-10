package ads_mobile_sdk;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class hn extends kn {
    @Override // ads_mobile_sdk.kn
    public final int a() {
        return 0;
    }

    public abstract boolean a(kn knVar, int i, int i2);

    @Override // ads_mobile_sdk.kn
    public final boolean b() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bn(this);
    }
}
