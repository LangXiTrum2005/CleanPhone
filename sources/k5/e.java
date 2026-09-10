package k5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.google.android.gms.internal.ads.uf;
import d5.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f44320i = o.i("NetworkStateTracker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f44321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uf f44322h;

    public e(Context context, p5.a aVar) {
        super(context, aVar);
        this.f44321g = (ConnectivityManager) this.f44316b.getSystemService("connectivity");
        this.f44322h = new uf(this, 6);
    }

    @Override // k5.d
    public final Object a() {
        return f();
    }

    @Override // k5.d
    public final void d() {
        String str = f44320i;
        try {
            o.g().e(str, "Registering network callback", new Throwable[0]);
            this.f44321g.registerDefaultNetworkCallback(this.f44322h);
        } catch (IllegalArgumentException | SecurityException e10) {
            o.g().f(str, "Received exception while registering network callback", e10);
        }
    }

    @Override // k5.d
    public final void e() {
        String str = f44320i;
        try {
            o.g().e(str, "Unregistering network callback", new Throwable[0]);
            this.f44321g.unregisterNetworkCallback(this.f44322h);
        } catch (IllegalArgumentException | SecurityException e10) {
            o.g().f(str, "Received exception while unregistering network callback", e10);
        }
    }

    public final i5.a f() {
        boolean z10;
        ConnectivityManager connectivityManager = this.f44321g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z11 = false;
        boolean z12 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            z10 = networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e10) {
            o.g().f(f44320i, "Unable to validate active network", e10);
        }
        boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z11 = true;
        }
        i5.a aVar = new i5.a();
        aVar.f42885a = z12;
        aVar.f42886b = z10;
        aVar.f42887c = zIsActiveNetworkMetered;
        aVar.f42888d = z11;
        return aVar;
    }
}
