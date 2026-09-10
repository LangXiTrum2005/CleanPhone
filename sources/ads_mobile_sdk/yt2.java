package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class yt2 implements coffeecake {
    public static final Object c = new Object();
    public volatile coffeecake a;
    public volatile Object b = c;

    public yt2(coi coiVar) {
        this.a = coiVar;
    }

    public static coffeecake a(coi coiVar) {
        return ((coiVar instanceof yt2) || (coiVar instanceof qd0)) ? coiVar : new yt2(coiVar);
    }

    @Override // saneness.adultoid
    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        coffeecake coffeecakeVar = this.a;
        if (coffeecakeVar == null) {
            return this.b;
        }
        Object obj2 = coffeecakeVar.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }
}
