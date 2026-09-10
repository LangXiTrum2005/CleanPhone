package ads_mobile_sdk;

import java.lang.reflect.Method;
import saneness.bochum;
import saneness.counters;
import saneness.monday;

/* JADX INFO: loaded from: classes.dex */
public abstract class ys2 implements monday {
    public final String a;
    public final String b;
    public final counters c;
    public final bochum d;
    public final v03 e;

    public ys2(String str, String str2, bochum bochumVar, counters countersVar, v03 v03Var) {
        this.a = str;
        this.b = str2;
        this.d = bochumVar;
        this.c = countersVar;
        this.e = v03Var;
    }

    public abstract void a(Method method, bochum bochumVar);

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            this.e.b();
            Method methodA = ((mf1) this.c).a(this.a, this.b);
            if (methodA != null) {
                a(methodA, this.d);
            }
            this.e.a();
            return null;
        } catch (Throwable th) {
            try {
                this.e.a(th);
                throw th;
            } catch (Throwable th2) {
                this.e.a();
                throw th2;
            }
        }
    }
}
