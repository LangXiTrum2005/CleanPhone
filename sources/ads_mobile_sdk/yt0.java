package ads_mobile_sdk;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yt0 {
    public String b;
    public dg2 d;
    public int a = -1;
    public final LinkedHashMap c = new LinkedHashMap();

    public final zt0 a() {
        int i = this.a;
        if (i >= 0) {
            return new zt0(i, this.b, this.c, this.d, 0);
        }
        throw new IllegalStateException(("Invalid status code: " + i).toString());
    }
}
