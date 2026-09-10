package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class pm2 implements ServiceConnection {
    public final /* synthetic */ qm2 a;

    public pm2(qm2 qm2Var) {
        this.a = qm2Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.b(new nm2(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.b(new om2(this));
    }
}
