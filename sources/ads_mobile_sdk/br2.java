package ads_mobile_sdk;

import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.gintrap;
import com.google.common.util.concurrent.rotuma;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import saneness.bochum;
import saneness.coffeecake;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class br2 {
    public final gintrap a;
    public final a b;
    public final Set c;
    public final String d;
    public final bochum e;
    public final counters f;
    public final u13 g;

    public br2(gintrap gintrapVar, a aVar, counters countersVar, yu2 yu2Var, String str, bochum bochumVar, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, u13 u13Var) {
        this.a = gintrapVar;
        this.b = aVar;
        this.d = str;
        this.f = countersVar;
        this.e = bochumVar;
        this.g = u13Var;
        int iOrdinal = yu2Var.ordinal();
        if (iOrdinal == 0) {
            this.c = (Set) coffeecakeVar.get();
        } else if (iOrdinal == 1) {
            this.c = (Set) coffeecakeVar2.get();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            this.c = (Set) coffeecakeVar3.get();
        }
    }

    public final String a() {
        u13 u13Var = this.g;
        gf0 gf0Var = gf0.EVENT_ID_ENCRYPTION;
        Callable callable = new Callable() { // from class: saneness.setterwort
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37309kowloon.c();
            }
        };
        v03 v03Var = new v03(gf0Var, u13Var.b, u13Var.a);
        try {
            v03Var.b();
            Object objCall = callable.call();
            v03Var.a();
            return (String) objCall;
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

    public final adultoid b() {
        boolean z;
        a aVar = this.b;
        synchronized (aVar) {
            z = aVar.d;
        }
        if (!z) {
            return arytenoidectomy.impromptu(Integer.toString(7));
        }
        if (!((mf1) this.f).b()) {
            return arytenoidectomy.apical(new Callable() { // from class: saneness.dhss
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f37123kowloon.d();
                }
            }, this.a);
        }
        ArrayList arrayList = new ArrayList(this.c.size());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.add(this.a.submit((Callable) it.next()));
        }
        return arytenoidectomy.triweekly(arrayList).attabal(new Callable() { // from class: saneness.vesuvio
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37360kowloon.a();
            }
        }, rotuma.attabal());
    }

    public final /* synthetic */ String c() {
        return this.b.a((ra) this.e.a(), this.d);
    }

    public final /* synthetic */ String d() {
        return this.b.a(ga.PSN_INITIALIZATION_FAIL, this.d);
    }
}
