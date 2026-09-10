package ads_mobile_sdk;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import saneness.capitulant;

/* JADX INFO: loaded from: classes.dex */
public final class pv1 implements capitulant {
    public final ArrayDeque b = new ArrayDeque();
    public ov1 c = null;
    public final ThreadPoolExecutor a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public final void a() {
        ov1 ov1Var = (ov1) this.b.poll();
        this.c = ov1Var;
        if (ov1Var != null) {
            ov1Var.a(this.a);
        }
    }

    public final void a(ov1 ov1Var) {
        ov1Var.a = this;
        this.b.add(ov1Var);
        if (this.c == null) {
            a();
        }
    }
}
