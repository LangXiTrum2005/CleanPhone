package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.ironsource.T3;

/* JADX INFO: compiled from: WifiLockManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class prefect {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f12281attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f12282dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public WifiManager.WifiLock f12283saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f12284wireman;

    public prefect(Context context) {
        this.f12281attabal = context.getApplicationContext();
    }

    public void attabal(boolean z) {
        if (z && this.f12283saneness == null) {
            WifiManager wifiManager = (WifiManager) this.f12281attabal.getApplicationContext().getSystemService(T3.b);
            if (wifiManager == null) {
                decarock.triweekly.impromptu("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f12283saneness = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f12282dern = z;
        dern();
    }

    public final void dern() {
        WifiManager.WifiLock wifiLock = this.f12283saneness;
        if (wifiLock == null) {
            return;
        }
        if (this.f12282dern && this.f12284wireman) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void saneness(boolean z) {
        this.f12284wireman = z;
        dern();
    }
}
