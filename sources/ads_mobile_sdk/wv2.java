package ads_mobile_sdk;

import java.io.File;
import saneness.cockpit;
import saneness.coffeecake;
import saneness.coi;
import saneness.nesslerize;

/* JADX INFO: loaded from: classes.dex */
public final class wv2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public wv2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return cockpit.saneness((File) this.a.get(), (nesslerize) this.b.get(), (u13) this.c.get());
    }
}
