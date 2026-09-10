package ei;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.uf;
import od.c;
import xi.g;
import xi.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends BroadcastReceiver implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f40096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f40097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f40098c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uf f40099d;

    public a(Context context, c cVar) {
        this.f40096a = cVar;
    }

    @Override // xi.h
    public final void g(g gVar) {
        this.f40097b = gVar;
        uf ufVar = new uf(this, 5);
        this.f40099d = ufVar;
        c cVar = this.f40096a;
        ((ConnectivityManager) cVar.f47386b).registerDefaultNetworkCallback(ufVar);
        ConnectivityManager connectivityManager = (ConnectivityManager) cVar.f47386b;
        this.f40098c.post(new com.unity3d.services.ads.operation.show.b(8, this, c.h(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()))));
    }

    @Override // xi.h
    public final void onCancel() {
        uf ufVar = this.f40099d;
        if (ufVar != null) {
            try {
                ((ConnectivityManager) this.f40096a.f47386b).unregisterNetworkCallback(ufVar);
            } catch (Exception unused) {
            } finally {
                this.f40099d = null;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g gVar = this.f40097b;
        if (gVar != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f40096a.f47386b;
            gVar.b(c.h(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }
}
