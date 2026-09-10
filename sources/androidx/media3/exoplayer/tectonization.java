package androidx.media3.exoplayer;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: WakeLockManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class tectonization {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f12751attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f12752dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public PowerManager.WakeLock f12753saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f12754wireman;

    public tectonization(Context context) {
        this.f12751attabal = context.getApplicationContext();
    }

    public void attabal(boolean z) {
        if (z && this.f12753saneness == null) {
            PowerManager powerManager = (PowerManager) this.f12751attabal.getSystemService("power");
            if (powerManager == null) {
                decarock.triweekly.impromptu("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f12753saneness = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f12752dern = z;
        dern();
    }

    public final void dern() {
        PowerManager.WakeLock wakeLock = this.f12753saneness;
        if (wakeLock == null) {
            return;
        }
        if (this.f12752dern && this.f12754wireman) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void saneness(boolean z) {
        this.f12754wireman = z;
        dern();
    }
}
