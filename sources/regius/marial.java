package regius;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: DefaultConnectivityMonitorFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class marial implements dern {
    @Override // regius.dern
    public saneness attabal(Context context, saneness.attabal attabalVar) {
        boolean z = picketboat.saneness.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z ? new wireman(context, attabalVar) : new triweekly();
    }
}
