package ads_mobile_sdk;

import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.rotuma;
import saneness.amphitheatre;
import saneness.neurotropism;

/* JADX INFO: loaded from: classes.dex */
public final class u13 {
    public final neurotropism a;
    public final amphitheatre b;

    public u13(amphitheatre amphitheatreVar, neurotropism neurotropismVar) {
        this.a = neurotropismVar;
        this.b = amphitheatreVar;
    }

    public final adultoid a(gf0 gf0Var, adultoid adultoidVar) {
        v03 v03Var = new v03(gf0Var, this.b, this.a);
        v03Var.b();
        arytenoidectomy.attabal(adultoidVar, new t13(v03Var), rotuma.attabal());
        return adultoidVar;
    }

    public final void b(gf0 gf0Var) {
        ((kc1) this.a).a(gf0Var.a, -1L, null, null);
    }

    public final v03 a(gf0 gf0Var) {
        return new v03(gf0Var, this.b, this.a);
    }

    public final void a(gf0 gf0Var, Runnable runnable) {
        v03 v03Var = new v03(gf0Var, this.b, this.a);
        try {
            v03Var.b();
            runnable.run();
            v03Var.a();
        } catch (Throwable th) {
            try {
                v03Var.a(th);
                throw th;
            } catch (Throwable th2) {
                v03Var.a();
                throw th2;
            }
        }
    }
}
