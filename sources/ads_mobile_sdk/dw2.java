package ads_mobile_sdk;

import java.io.File;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class dw2 implements coi {
    public final coffeecake a;

    public dw2(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new File(new File((File) this.a.get(), "drgd"), "pmtd");
    }
}
