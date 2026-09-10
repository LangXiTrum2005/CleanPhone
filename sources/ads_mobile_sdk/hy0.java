package ads_mobile_sdk;

import com.google.gson.Gson;
import java.util.Optional;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;
import saneness.micrococcus;
import saneness.veejay;

/* JADX INFO: loaded from: classes.dex */
public final class hy0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;

    public hy0(hb0 hb0Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, h21 h21Var, coffeecake coffeecakeVar4) {
        micrococcus micrococcusVar = veejay.f37359attabal;
        this.a = hb0Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = h21Var;
        this.f = coffeecakeVar4;
        this.g = micrococcusVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new gy0((wz0) this.a.get(), (yf2) this.b.get(), (Optional) this.c.get(), (String) this.d.get(), ((Boolean) this.e.get()).booleanValue(), (amphitheatre) this.f.get(), (Gson) this.g.get());
    }
}
