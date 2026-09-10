package curium;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.ri.ri.ri.ik.ik;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class wireman extends marial {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public beccafico.attabal f24528apical;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final attabal f24529cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public Surface f24530formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final Object f24531impassible;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final MediaPlayer f24532taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public volatile boolean f24533triweekly;

    public static class attabal implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final WeakReference<wireman> f24534kowloon;

        public attabal(wireman wiremanVar) {
            this.f24534kowloon = new WeakReference<>(wiremanVar);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            try {
                wireman wiremanVar = this.f24534kowloon.get();
                if (wiremanVar != null) {
                    wiremanVar.monoploid(i);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                wireman wiremanVar = this.f24534kowloon.get();
                if (wiremanVar != null) {
                    wiremanVar.formularize();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                wireman wiremanVar = this.f24534kowloon.get();
                return wiremanVar != null && wiremanVar.molybdenite(i, i2);
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                wireman wiremanVar = this.f24534kowloon.get();
                return wiremanVar != null && wiremanVar.kowloon(i, i2);
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                wireman wiremanVar = this.f24534kowloon.get();
                if (wiremanVar != null) {
                    wiremanVar.triweekly();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                wireman wiremanVar = this.f24534kowloon.get();
                if (wiremanVar != null) {
                    wiremanVar.impassible();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                wireman wiremanVar = this.f24534kowloon.get();
                if (wiremanVar != null) {
                    wiremanVar.polloi(i, i2, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public wireman() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f24531impassible = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f24532taiyuan = mediaPlayer;
        }
        dovishness(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.f24529cutely = new attabal(this);
        graveside();
    }

    public final void adultoid() {
        try {
            Surface surface = this.f24530formularize;
            if (surface != null) {
                surface.release();
                this.f24530formularize = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // curium.attabal
    public void apical(FileDescriptor fileDescriptor) throws Throwable {
        this.f24532taiyuan.setDataSource(fileDescriptor);
    }

    @Override // curium.attabal
    public void aw() throws Throwable {
        try {
            this.f24532taiyuan.reset();
        } catch (Throwable unused) {
        }
        gintrap();
        arytenoidectomy();
        graveside();
    }

    @Override // curium.attabal
    public int bgr() {
        MediaPlayer mediaPlayer = this.f24532taiyuan;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // curium.attabal
    public void co() throws Throwable {
        synchronized (this.f24531impassible) {
            try {
                if (!this.f24533triweekly) {
                    this.f24532taiyuan.release();
                    this.f24533triweekly = true;
                    adultoid();
                    gintrap();
                    arytenoidectomy();
                    graveside();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // curium.attabal
    public void cutely(boolean z) throws Throwable {
        this.f24532taiyuan.setLooping(z);
    }

    @Override // curium.attabal
    public void dern(logician.saneness sanenessVar) throws Throwable {
        this.f24532taiyuan.setPlaybackParams(this.f24532taiyuan.getPlaybackParams().setSpeed(sanenessVar.attabal()));
    }

    @Override // curium.attabal
    public void di() throws Throwable {
        this.f24532taiyuan.start();
    }

    public final void dovishness(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(logician.attabal.marial(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(objNewInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // curium.attabal
    public PlaybackParams fi() throws IllegalStateException {
        return this.f24532taiyuan.getPlaybackParams();
    }

    public void finalize() throws Throwable {
        super.finalize();
        adultoid();
    }

    public final void gintrap() {
        beccafico.attabal attabalVar = this.f24528apical;
        if (attabalVar != null) {
            try {
                attabalVar.close();
            } catch (Throwable unused) {
            }
            this.f24528apical = null;
        }
    }

    public final void graveside() {
        this.f24532taiyuan.setOnPreparedListener(this.f24529cutely);
        this.f24532taiyuan.setOnBufferingUpdateListener(this.f24529cutely);
        this.f24532taiyuan.setOnCompletionListener(this.f24529cutely);
        this.f24532taiyuan.setOnSeekCompleteListener(this.f24529cutely);
        this.f24532taiyuan.setOnVideoSizeChangedListener(this.f24529cutely);
        this.f24532taiyuan.setOnErrorListener(this.f24529cutely);
        this.f24532taiyuan.setOnInfoListener(this.f24529cutely);
    }

    @Override // curium.attabal
    public void impromptu(Surface surface) {
        adultoid();
        this.f24530formularize = surface;
        this.f24532taiyuan.setSurface(surface);
    }

    @Override // curium.attabal
    public void jbs() {
        MediaPlayer mediaPlayer = this.f24532taiyuan;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // curium.attabal
    public void ka(boolean z) throws Throwable {
        MediaPlayer mediaPlayer = this.f24532taiyuan;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            mediaPlayer.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // curium.attabal
    public void lr(boolean z) throws Throwable {
        this.f24532taiyuan.setScreenOnWhilePlaying(z);
    }

    @Override // curium.attabal
    public void mj() throws Throwable {
        this.f24532taiyuan.pause();
    }

    @Override // curium.attabal
    public long qt() {
        try {
            return this.f24532taiyuan.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // curium.attabal
    public void ri(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.f24531impassible) {
            try {
                if (!this.f24533triweekly && surfaceHolder != null && surfaceHolder.getSurface() != null && this.f24500impromptu) {
                    this.f24532taiyuan.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // curium.attabal
    public long sf() {
        try {
            return this.f24532taiyuan.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // curium.attabal
    public int vr() {
        MediaPlayer mediaPlayer = this.f24532taiyuan;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // curium.attabal
    public void xha() throws Throwable {
        this.f24532taiyuan.stop();
    }

    @Override // curium.attabal
    public void ri(String str) throws Throwable {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase(X3.i.b)) {
            this.f24532taiyuan.setDataSource(uri.getPath());
        } else {
            this.f24532taiyuan.setDataSource(str);
        }
    }

    @Override // curium.attabal
    public synchronized void ri(ik ikVar) {
        this.f24528apical = beccafico.attabal.attabal(logician.attabal.marial(), ikVar);
        sanskrit.attabal.saneness(ikVar);
        this.f24532taiyuan.setDataSource(this.f24528apical);
    }

    @Override // curium.attabal
    public void ri(long j, int i) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.f24532taiyuan.seekTo((int) j);
            return;
        }
        if (i == 0) {
            this.f24532taiyuan.seekTo((int) j, 0);
            return;
        }
        if (i == 1) {
            this.f24532taiyuan.seekTo((int) j, 1);
            return;
        }
        if (i == 2) {
            this.f24532taiyuan.seekTo((int) j, 2);
        } else if (i == 3) {
            this.f24532taiyuan.seekTo((int) j, 3);
        } else {
            this.f24532taiyuan.seekTo((int) j);
        }
    }
}
