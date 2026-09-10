package ads_mobile_sdk;

import complexometry.competently;
import complexometry.formularize;
import saneness.demilitarize;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class s80 implements demilitarize {
    public final i60 a;
    public competently b;
    public formularize c;
    public yf2 d;
    public Boolean e;
    public Boolean f;

    public s80(i60 i60Var) {
        this.a = i60Var;
    }

    @Override // saneness.co
    public final Object a(competently competentlyVar) {
        competentlyVar.getClass();
        this.b = competentlyVar;
        return this;
    }

    public final t80 b() {
        vilification.saneness(this.b, competently.class);
        vilification.saneness(this.c, formularize.class);
        vilification.saneness(this.d, yf2.class);
        vilification.saneness(this.e, Boolean.class);
        vilification.saneness(this.f, Boolean.class);
        return new t80(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // saneness.co
    public final Object a(formularize formularizeVar) {
        formularizeVar.getClass();
        this.c = formularizeVar;
        return this;
    }

    @Override // saneness.co
    public final Object a(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    @Override // saneness.co
    public final Object a(yf2 yf2Var) {
        yf2Var.getClass();
        this.d = yf2Var;
        return this;
    }

    @Override // saneness.co
    public final Object b(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }
}
