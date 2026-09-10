package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import saneness.biogenic;
import saneness.cherub;
import saneness.macropsia;
import saneness.rotproof;
import saneness.traveling;

/* JADX INFO: loaded from: classes.dex */
public final class p11 implements ServiceConnection {
    public final traveling a;
    public final /* synthetic */ q11 b;

    public p11(q11 q11Var, d21 d21Var) {
        this.b = q11Var;
        this.a = d21Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        rotproof macropsiaVar;
        biogenic.attabal("Install Referrer service connected.");
        q11 q11Var = this.b;
        int i = cherub.f37092dern;
        if (iBinder == null) {
            macropsiaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            macropsiaVar = iInterfaceQueryLocalInterface instanceof rotproof ? (rotproof) iInterfaceQueryLocalInterface : new macropsia(iBinder);
        }
        q11Var.d = macropsiaVar;
        this.b.a = 2;
        ((d21) this.a).a(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        biogenic.saneness("Install Referrer service disconnected.");
        q11 q11Var = this.b;
        q11Var.d = null;
        q11Var.a = 0;
        this.a.getClass();
    }
}
