package ads_mobile_sdk;

import java.io.File;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ud0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public ud0(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new o72((File) this.a.get(), (q73) this.b.get(), (u13) this.c.get());
    }
}
