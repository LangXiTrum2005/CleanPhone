package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10669a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzea f10670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VideoLifecycleCallbacks f10671c;

    public int getPlaybackState() {
        synchronized (this.f10669a) {
            zzea zzeaVar = this.f10670b;
            if (zzeaVar == null) {
                return 0;
            }
            try {
                return zzeaVar.zzi();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call getPlaybackState on video controller.", e10);
                return 0;
            }
        }
    }

    @Nullable
    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.f10669a) {
            videoLifecycleCallbacks = this.f10671c;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z10;
        synchronized (this.f10669a) {
            z10 = this.f10670b != null;
        }
        return z10;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.f10669a) {
            zzea zzeaVar = this.f10670b;
            if (zzeaVar == null) {
                return false;
            }
            try {
                return zzeaVar.zzp();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call isClickToExpandEnabled.", e10);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.f10669a) {
            zzea zzeaVar = this.f10670b;
            if (zzeaVar == null) {
                return false;
            }
            try {
                return zzeaVar.zzn();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call isUsingCustomPlayerControls.", e10);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.f10669a) {
            zzea zzeaVar = this.f10670b;
            if (zzeaVar == null) {
                return true;
            }
            try {
                return zzeaVar.zzh();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call isMuted on video controller.", e10);
                return true;
            }
        }
    }

    public void mute(boolean z10) {
        synchronized (this.f10669a) {
            zzea zzeaVar = this.f10670b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzg(z10);
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call mute on video controller.", e10);
            }
        }
    }

    public void pause() {
        synchronized (this.f10669a) {
            zzea zzeaVar = this.f10670b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzf();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call pause on video controller.", e10);
            }
        }
    }

    public void play() {
        synchronized (this.f10669a) {
            zzea zzeaVar = this.f10670b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zze();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call play on video controller.", e10);
            }
        }
    }

    public void setVideoLifecycleCallbacks(@Nullable VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfv zzfvVar;
        synchronized (this.f10669a) {
            this.f10671c = videoLifecycleCallbacks;
            zzea zzeaVar = this.f10670b;
            if (zzeaVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzfvVar = null;
            } else {
                try {
                    zzfvVar = new zzfv(videoLifecycleCallbacks);
                } catch (RemoteException e10) {
                    zzo.zzg("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                }
            }
            zzeaVar.zzl(zzfvVar);
        }
    }

    public void stop() {
        synchronized (this.f10669a) {
            zzea zzeaVar = this.f10670b;
            if (zzeaVar == null) {
                return;
            }
            try {
                zzeaVar.zzq();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call stop on video controller.", e10);
            }
        }
    }

    public final void zza(@Nullable zzea zzeaVar) {
        synchronized (this.f10669a) {
            try {
                this.f10670b = zzeaVar;
                VideoLifecycleCallbacks videoLifecycleCallbacks = this.f10671c;
                if (videoLifecycleCallbacks != null) {
                    setVideoLifecycleCallbacks(videoLifecycleCallbacks);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final zzea zzb() {
        zzea zzeaVar;
        synchronized (this.f10669a) {
            zzeaVar = this.f10670b;
        }
        return zzeaVar;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }

        public void onVideoMute(boolean z10) {
        }
    }
}
