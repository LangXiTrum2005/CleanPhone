package bluecoat;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import decarock.grimness;

/* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class impassible {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long f15075apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public long f15076arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impromptu f15077attabal = new impromptu();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public float f15078beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float f15079competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f15080cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final dern f15081dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public long f15082formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public long f15083impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f15084impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public long f15085kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Surface f15086marial;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public long f15087monoploid;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final saneness f15088saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public float f15089taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public long f15090triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f15091wireman;

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    public static final class attabal {
        public static void attabal(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
            } catch (IllegalStateException e) {
                decarock.triweekly.wireman("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    public static final class dern implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public static final dern f15092graveside = new dern();

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Handler f15093arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public volatile long f15094kowloon = C.TIME_UNSET;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f15095molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final HandlerThread f15096monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public Choreographer f15097polloi;

        public dern() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f15096monoploid = handlerThread;
            handlerThread.start();
            Handler handlerPreprohormone = grimness.preprohormone(handlerThread.getLooper(), this);
            this.f15093arytenoidectomy = handlerPreprohormone;
            handlerPreprohormone.sendEmptyMessage(1);
        }

        public static dern wireman() {
            return f15092graveside;
        }

        public void attabal() {
            this.f15093arytenoidectomy.sendEmptyMessage(2);
        }

        public final void beachfront() {
            Choreographer choreographer = this.f15097polloi;
            if (choreographer != null) {
                int i = this.f15095molybdenite - 1;
                this.f15095molybdenite = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f15094kowloon = C.TIME_UNSET;
                }
            }
        }

        public final void dern() {
            try {
                this.f15097polloi = Choreographer.getInstance();
            } catch (RuntimeException e) {
                decarock.triweekly.taiyuan("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f15094kowloon = j;
            ((Choreographer) decarock.attabal.marial(this.f15097polloi)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                dern();
                return true;
            }
            if (i == 2) {
                saneness();
                return true;
            }
            if (i != 3) {
                return false;
            }
            beachfront();
            return true;
        }

        public void marial() {
            this.f15093arytenoidectomy.sendEmptyMessage(3);
        }

        public final void saneness() {
            Choreographer choreographer = this.f15097polloi;
            if (choreographer != null) {
                int i = this.f15095molybdenite + 1;
                this.f15095molybdenite = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }
    }

    public impassible(Context context) {
        saneness sanenessVarBeachfront = beachfront(context);
        this.f15088saneness = sanenessVarBeachfront;
        this.f15081dern = sanenessVarBeachfront != null ? dern.wireman() : null;
        this.f15075apical = C.TIME_UNSET;
        this.f15082formularize = C.TIME_UNSET;
        this.f15078beachfront = -1.0f;
        this.f15089taiyuan = 1.0f;
        this.f15080cutely = 0;
    }

    public static boolean dern(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    public static long marial(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j3 + j5;
            j4 = j5;
            j5 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    public void apical() {
        this.f15091wireman = true;
        triweekly();
        if (this.f15088saneness != null) {
            ((dern) decarock.attabal.marial(this.f15081dern)).attabal();
            this.f15088saneness.saneness();
        }
        polloi(false);
    }

    public final void arytenoidectomy(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f15075apical = refreshRate;
            this.f15082formularize = (refreshRate * 80) / 100;
        } else {
            decarock.triweekly.impromptu("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f15075apical = C.TIME_UNSET;
            this.f15082formularize = C.TIME_UNSET;
        }
    }

    public final saneness beachfront(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService(X3.i.d)) == null) {
            return null;
        }
        return new saneness(displayManager);
    }

    public void competently(float f) {
        this.f15078beachfront = f;
        this.f15077attabal.competently();
        monoploid();
    }

    public void cutely() {
        triweekly();
    }

    public void formularize() {
        this.f15091wireman = false;
        saneness sanenessVar = this.f15088saneness;
        if (sanenessVar != null) {
            sanenessVar.dern();
            ((dern) decarock.attabal.marial(this.f15081dern)).marial();
        }
        wireman();
    }

    public void impassible(Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.f15086marial == surface) {
            return;
        }
        wireman();
        this.f15086marial = surface;
        polloi(true);
    }

    public void impromptu(long j) {
        long j2 = this.f15090triweekly;
        if (j2 != -1) {
            this.f15076arytenoidectomy = j2;
            this.f15087monoploid = this.f15085kowloon;
        }
        this.f15083impassible++;
        this.f15077attabal.beachfront(j * 1000);
        monoploid();
    }

    public void kowloon(int i) {
        if (this.f15080cutely == i) {
            return;
        }
        this.f15080cutely = i;
        polloi(true);
    }

    public final void monoploid() {
        if (grimness.f25080attabal < 30 || this.f15086marial == null) {
            return;
        }
        float fSaneness = this.f15077attabal.marial() ? this.f15077attabal.saneness() : this.f15078beachfront;
        float f = this.f15079competently;
        if (fSaneness == f) {
            return;
        }
        if (fSaneness != -1.0f && f != -1.0f) {
            if (Math.abs(fSaneness - this.f15079competently) < ((!this.f15077attabal.marial() || this.f15077attabal.wireman() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fSaneness == -1.0f && this.f15077attabal.dern() < 30) {
            return;
        }
        this.f15079competently = fSaneness;
        polloi(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    public final void polloi(boolean z) {
        Surface surface;
        float f;
        if (grimness.f25080attabal < 30 || (surface = this.f15086marial) == null || this.f15080cutely == Integer.MIN_VALUE) {
            return;
        }
        if (this.f15091wireman) {
            float f2 = this.f15079competently;
            if (f2 != -1.0f) {
                f = f2 * this.f15089taiyuan;
            } else {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (z || this.f15084impromptu != f) {
            this.f15084impromptu = f;
            attabal.attabal(surface, f);
        }
    }

    public long saneness(long j) {
        long j2;
        if (this.f15076arytenoidectomy == -1 || !this.f15077attabal.marial()) {
            j2 = j;
        } else {
            long jAttabal = this.f15087monoploid + ((long) ((this.f15077attabal.attabal() * (this.f15083impassible - this.f15076arytenoidectomy)) / this.f15089taiyuan));
            if (dern(j, jAttabal)) {
                j2 = jAttabal;
            } else {
                triweekly();
                j2 = j;
            }
        }
        this.f15090triweekly = this.f15083impassible;
        this.f15085kowloon = j2;
        dern dernVar = this.f15081dern;
        if (dernVar != null && this.f15075apical != C.TIME_UNSET) {
            long j3 = dernVar.f15094kowloon;
            if (j3 != C.TIME_UNSET) {
                return marial(j2, j3, this.f15075apical) - this.f15082formularize;
            }
        }
        return j2;
    }

    public void taiyuan(float f) {
        this.f15089taiyuan = f;
        triweekly();
        polloi(false);
    }

    public final void triweekly() {
        this.f15083impassible = 0L;
        this.f15076arytenoidectomy = -1L;
        this.f15090triweekly = -1L;
    }

    public final void wireman() {
        Surface surface;
        if (grimness.f25080attabal < 30 || (surface = this.f15086marial) == null || this.f15080cutely == Integer.MIN_VALUE || this.f15084impromptu == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.f15084impromptu = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        attabal.attabal(surface, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    public final class saneness implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final DisplayManager f15098attabal;

        public saneness(DisplayManager displayManager) {
            this.f15098attabal = displayManager;
        }

        public final Display attabal() {
            return this.f15098attabal.getDisplay(0);
        }

        public void dern() {
            this.f15098attabal.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                impassible.this.arytenoidectomy(attabal());
            }
        }

        public void saneness() {
            this.f15098attabal.registerDisplayListener(this, grimness.cord());
            impassible.this.arytenoidectomy(attabal());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }
}
