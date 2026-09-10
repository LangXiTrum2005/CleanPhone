package ads_mobile_sdk;

import java.io.File;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ew2 implements coi {
    public final coffeecake a;

    public ew2(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new File(new File(new File((File) this.a.get(), "drgd"), "v"), "pcopt");
    }
}
