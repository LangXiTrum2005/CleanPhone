package ads_mobile_sdk;

import complexometry.formularize;
import saneness.adjudge;
import saneness.holophone;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class y80 implements holophone {
    public final i60 a;
    public adjudge.saneness b;
    public formularize c;
    public Boolean d;
    public Boolean e;

    public y80(i60 i60Var) {
        this.a = i60Var;
    }

    @Override // saneness.holophone
    public final adjudge a() {
        vilification.saneness(this.b, adjudge.saneness.class);
        vilification.saneness(this.c, formularize.class);
        vilification.saneness(this.d, Boolean.class);
        vilification.saneness(this.e, Boolean.class);
        return new z80(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // saneness.holophone
    public final holophone b() {
        this.e = Boolean.FALSE;
        return this;
    }

    @Override // saneness.holophone
    public final holophone c() {
        this.d = Boolean.FALSE;
        return this;
    }

    @Override // saneness.holophone
    public final holophone a(formularize formularizeVar) {
        formularizeVar.getClass();
        this.c = formularizeVar;
        return this;
    }

    @Override // saneness.holophone
    public final holophone a(adjudge.saneness sanenessVar) {
        sanenessVar.getClass();
        this.b = sanenessVar;
        return this;
    }
}
