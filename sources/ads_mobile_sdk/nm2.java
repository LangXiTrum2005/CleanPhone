package ads_mobile_sdk;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nm2 extends lk2 {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ pm2 c;

    public nm2(pm2 pm2Var, IBinder iBinder) {
        this.c = pm2Var;
        this.b = iBinder;
    }

    @Override // ads_mobile_sdk.lk2
    public final void a() {
        qm2 qm2Var = this.c.a;
        qm2Var.n = (IInterface) qm2Var.i.attabal(this.b);
        qm2 qm2Var2 = this.c.a;
        qm2Var2.b.a("linkToDeath", new Object[0]);
        try {
            qm2Var2.n.asBinder().linkToDeath(qm2Var2.k, 0);
        } catch (RemoteException unused) {
            hc1 hc1Var = qm2Var2.b;
            Object[] objArr = new Object[0];
            hc1Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                hc1.a(hc1Var.a, "linkToDeath failed", objArr);
            }
        }
        qm2 qm2Var3 = this.c.a;
        qm2Var3.g = false;
        Iterator it = qm2Var3.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.c.a.d.clear();
    }
}
