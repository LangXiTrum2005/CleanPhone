package sg.bigo.ads.a.a;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends CustomTabsServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<d> f45358a;

    public c(d dVar) {
        this.f45358a = new WeakReference<>(dVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        d dVar = this.f45358a.get();
        if (dVar != null) {
            dVar.a(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.f45358a.get();
        if (dVar != null) {
            dVar.b();
        }
    }
}
