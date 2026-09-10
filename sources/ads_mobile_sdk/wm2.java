package ads_mobile_sdk;

import java.util.List;
import saneness.coffeecake;
import saneness.dustman;

/* JADX INFO: loaded from: classes.dex */
public final class wm2 {
    public static final /* synthetic */ boolean c = true;
    public final List a;
    public final List b = dustman.dern(0);

    public wm2(int i) {
        this.a = dustman.dern(i);
    }

    public final void a(coffeecake coffeecakeVar) {
        if (!c && coffeecakeVar == null) {
            throw new AssertionError("Codegen error? Null provider");
        }
        this.a.add(coffeecakeVar);
    }

    public final xm2 a() {
        boolean z = c;
        if (!z && dustman.saneness(this.a)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        if (z || !dustman.saneness(this.b)) {
            return new xm2(this.a, this.b);
        }
        throw new AssertionError("Codegen error?  Duplicates in the provider list");
    }
}
