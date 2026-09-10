package p7;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements NsdManager.RegistrationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f48261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f48262b;

    public a(String str, String str2) {
        this.f48261a = str;
        this.f48262b = str2;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo serviceInfo, int i10) {
        n.f(serviceInfo, "serviceInfo");
        b.a(this.f48262b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
        n.f(NsdServiceInfo, "NsdServiceInfo");
        if (n.a(this.f48261a, NsdServiceInfo.getServiceName())) {
            return;
        }
        b.a(this.f48262b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo serviceInfo) {
        n.f(serviceInfo, "serviceInfo");
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i10) {
        n.f(serviceInfo, "serviceInfo");
    }
}
