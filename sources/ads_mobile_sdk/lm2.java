package ads_mobile_sdk;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class lm2 extends lk2 {
    public final /* synthetic */ qm2 b;

    public lm2(qm2 qm2Var) {
        this.b = qm2Var;
    }

    @Override // ads_mobile_sdk.lk2
    public final void a() {
        synchronized (this.b.f) {
            try {
                if (this.b.l.get() > 0 && this.b.l.decrementAndGet() > 0) {
                    this.b.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                qm2 qm2Var = this.b;
                if (qm2Var.n != null) {
                    qm2Var.b.a("Unbind from service.", new Object[0]);
                    qm2 qm2Var2 = this.b;
                    qm2Var2.a.unbindService(qm2Var2.m);
                    qm2 qm2Var3 = this.b;
                    qm2Var3.g = false;
                    qm2Var3.n = null;
                    qm2Var3.m = null;
                }
                qm2 qm2Var4 = this.b;
                Iterator it = qm2Var4.e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(qm2Var4.c + " : Binder has died."));
                }
                qm2Var4.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
