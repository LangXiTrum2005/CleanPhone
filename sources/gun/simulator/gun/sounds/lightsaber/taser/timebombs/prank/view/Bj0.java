package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import com.efs.sdk.base.core.util.NetworkUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class Bj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2887a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;

    public Bj0() {
        EnumC4314pV enumC4314pV = EnumC4314pV.STANDALONE;
        this.f2887a = 2;
        this.b = false;
        this.d = null;
        this.c = true;
        this.e = enumC4314pV;
    }

    public final void a() {
        switch (this.f2887a) {
            case 0:
                this.b = false;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.e;
                if (wakeLock != null) {
                    wakeLock.release();
                    break;
                }
                break;
            default:
                this.b = false;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.e;
                if (wifiLock != null) {
                    wifiLock.release();
                    break;
                }
                break;
        }
    }

    public final void b(boolean z) {
        switch (this.f2887a) {
            case 0:
                this.c = z;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.e;
                if (wakeLock != null) {
                    if (this.b && z) {
                        wakeLock.acquire();
                    } else {
                        wakeLock.release();
                    }
                    break;
                }
                break;
            default:
                this.c = z;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.e;
                if (wifiLock != null) {
                    if (this.b && z) {
                        wifiLock.acquire();
                    } else {
                        wifiLock.release();
                    }
                    break;
                }
                break;
        }
    }

    public Bj0(Context context, int i) {
        this.f2887a = i;
        if (i != 1) {
            this.d = (PowerManager) context.getApplicationContext().getSystemService("power");
        } else {
            this.d = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
        }
    }
}
