package ads_mobile_sdk;

import com.google.common.util.concurrent.adultoid;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import saneness.bochum;
import saneness.monday;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements monday {
    public final Map a;
    public final bochum b;
    public final v03 c;
    public final long d;

    public p0(bochum bochumVar, Map map, j5 j5Var, u13 u13Var) {
        this.a = map;
        this.b = bochumVar;
        this.c = u13Var.a(gf0.EVENT_ID_AD_ATTEST_SIGNALS_TASK);
        this.d = j5Var.B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        ra raVar;
        try {
            try {
                this.c.b();
                adultoid adultoidVar = (adultoid) this.a.get("gs");
                if (adultoidVar != null && (raVar = (ra) adultoidVar.get(this.d, TimeUnit.MILLISECONDS)) != null) {
                    synchronized (this.b) {
                        try {
                            this.b.polloi(raVar.q());
                            this.b.splinterproof(raVar.o());
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return null;
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e) {
                this.c.a(e);
                this.c.a();
                return null;
            }
        } finally {
            this.c.a();
        }
    }
}
