package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: compiled from: StreamVolumeManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class immediately {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f11921attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f11922beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f11923competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final saneness f11924dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f11925impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public dern f11926marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Handler f11927saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AudioManager f11928wireman;

    /* JADX INFO: compiled from: StreamVolumeManager.java */
    public final class dern extends BroadcastReceiver {
        public dern() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = immediately.this.f11927saneness;
            final immediately immediatelyVar = immediately.this;
            handler.post(new Runnable() { // from class: androidx.media3.exoplayer.basify
                @Override // java.lang.Runnable
                public final void run() {
                    immediatelyVar.taiyuan();
                }
            });
        }
    }

    /* JADX INFO: compiled from: StreamVolumeManager.java */
    public interface saneness {
        void gintrap(int i, boolean z);

        void polloi(int i);
    }

    public immediately(Context context, Handler handler, saneness sanenessVar) {
        Context applicationContext = context.getApplicationContext();
        this.f11921attabal = applicationContext;
        this.f11927saneness = handler;
        this.f11924dern = sanenessVar;
        AudioManager audioManager = (AudioManager) decarock.attabal.taiyuan((AudioManager) applicationContext.getSystemService("audio"));
        this.f11928wireman = audioManager;
        this.f11922beachfront = 3;
        this.f11923competently = beachfront(audioManager, 3);
        this.f11925impromptu = marial(audioManager, this.f11922beachfront);
        dern dernVar = new dern();
        try {
            applicationContext.registerReceiver(dernVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f11926marial = dernVar;
        } catch (RuntimeException e) {
            decarock.triweekly.taiyuan("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public static int beachfront(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            decarock.triweekly.taiyuan("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public static boolean marial(AudioManager audioManager, int i) {
        if (decarock.grimness.f25080attabal >= 23) {
            return audioManager.isStreamMute(i);
        }
        return beachfront(audioManager, i) == 0;
    }

    public void competently() {
        dern dernVar = this.f11926marial;
        if (dernVar != null) {
            try {
                this.f11921attabal.unregisterReceiver(dernVar);
            } catch (RuntimeException e) {
                decarock.triweekly.taiyuan("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f11926marial = null;
        }
    }

    public int dern() {
        return this.f11928wireman.getStreamMaxVolume(this.f11922beachfront);
    }

    public void impromptu(int i) {
        if (this.f11922beachfront == i) {
            return;
        }
        this.f11922beachfront = i;
        taiyuan();
        this.f11924dern.polloi(i);
    }

    public final void taiyuan() {
        int iBeachfront = beachfront(this.f11928wireman, this.f11922beachfront);
        boolean zMarial = marial(this.f11928wireman, this.f11922beachfront);
        if (this.f11923competently == iBeachfront && this.f11925impromptu == zMarial) {
            return;
        }
        this.f11923competently = iBeachfront;
        this.f11925impromptu = zMarial;
        this.f11924dern.gintrap(iBeachfront, zMarial);
    }

    public int wireman() {
        if (decarock.grimness.f25080attabal >= 28) {
            return this.f11928wireman.getStreamMinVolume(this.f11922beachfront);
        }
        return 0;
    }
}
