package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;
import saneness.bochum;
import saneness.transformable;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class l40 implements transformable {
    public final d40 a;
    public final i40 b;
    public Context c;
    public View d;
    public Activity e;
    public String f;
    public Map g;
    public bochum h;
    public yu2 i;

    public l40(d40 d40Var, i40 i40Var) {
        this.a = d40Var;
        this.b = i40Var;
    }

    public final m40 a() {
        vilification.saneness(this.c, Context.class);
        vilification.saneness(this.g, Map.class);
        vilification.saneness(this.h, bochum.class);
        vilification.saneness(this.i, yu2.class);
        return new m40(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
