package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.coroutines.CoroutineContext;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;
import saneness.dent;

/* JADX INFO: loaded from: classes.dex */
public final class r02 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public r02(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5, coffeecake coffeecakeVar6) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
        this.e = coffeecakeVar5;
        this.f = coffeecakeVar6;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new q02((saran) this.a.get(), (CoroutineContext) this.b.get(), (uf2) this.c.get(), (amphitheatre) this.d.get(), (ve2) this.e.get(), (dent) this.f.get());
    }
}
