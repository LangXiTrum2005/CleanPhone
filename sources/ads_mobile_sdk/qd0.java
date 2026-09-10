package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.delouse;

/* JADX INFO: loaded from: classes.dex */
public final class qd0 implements coffeecake, delouse {
    public static final Object c = new Object();
    public static final /* synthetic */ boolean d = true;
    public volatile coffeecake a;
    public volatile Object b = c;

    public qd0(coffeecake coffeecakeVar) {
        if (!d && coffeecakeVar == null) {
            throw new AssertionError();
        }
        this.a = coffeecakeVar;
    }

    public static delouse a(coffeecake coffeecakeVar) {
        if (coffeecakeVar instanceof delouse) {
            return (delouse) coffeecakeVar;
        }
        coffeecakeVar.getClass();
        return new qd0(coffeecakeVar);
    }

    @Override // saneness.adultoid
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.get();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
