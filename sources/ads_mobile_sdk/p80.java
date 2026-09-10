package ads_mobile_sdk;

import complexometry.competently;
import complexometry.formularize;
import saneness.kcia;
import saneness.pitchy;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class p80 implements pitchy {
    public final i60 a;
    public competently b;
    public formularize c;
    public yf2 d;
    public Boolean e;
    public Boolean f;
    public com.google.android.libraries.ads.mobile.sdk.nativead.saneness g;
    public com.google.android.libraries.ads.mobile.sdk.nativead.dern h;
    public Integer i;

    public p80(i60 i60Var) {
        this.a = i60Var;
    }

    @Override // saneness.pitchy
    public final kcia a() {
        vilification.saneness(this.b, competently.class);
        vilification.saneness(this.c, formularize.class);
        vilification.saneness(this.d, yf2.class);
        vilification.saneness(this.e, Boolean.class);
        vilification.saneness(this.f, Boolean.class);
        vilification.saneness(this.g, com.google.android.libraries.ads.mobile.sdk.nativead.saneness.class);
        vilification.saneness(this.h, com.google.android.libraries.ads.mobile.sdk.nativead.dern.class);
        vilification.saneness(this.i, Integer.class);
        return new q80(this.a, this.c, this.d, this.e, this.f, this.g, this.i);
    }

    @Override // saneness.co
    public final Object b(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    @Override // saneness.co
    public final Object a(competently competentlyVar) {
        competentlyVar.getClass();
        this.b = competentlyVar;
        return this;
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

    @Override // saneness.pitchy
    public final pitchy a(com.google.android.libraries.ads.mobile.sdk.nativead.saneness sanenessVar) {
        sanenessVar.getClass();
        this.g = sanenessVar;
        return this;
    }

    @Override // saneness.pitchy
    public final pitchy a(com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar) {
        dernVar.getClass();
        this.h = dernVar;
        return this;
    }

    @Override // saneness.pitchy
    public final pitchy a(int i) {
        this.i = Integer.valueOf(i);
        return this;
    }

    @Override // saneness.co
    public final Object a(yf2 yf2Var) {
        this.d = yf2Var;
        return this;
    }
}
