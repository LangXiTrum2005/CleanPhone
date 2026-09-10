package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes.dex */
public final class VideoFrameReleaseHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FixedFrameRateEstimator f6649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayHelper f6650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VSyncSampler f6651c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f6652e;
    public float f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f6654i;
    public int j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6655l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6656n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6657p;
    public long q;

    public static final class Api30 {
        public static void a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e2) {
                Log.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
            }
        }
    }

    public final class DisplayHelper implements DisplayManager.DisplayListener {
        public final DisplayManager X;

        public DisplayHelper(DisplayManager displayManager) {
            this.X = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i2) {
            if (i2 == 0) {
                VideoFrameReleaseHelper.a(VideoFrameReleaseHelper.this, this.X.getDisplay(0));
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i2) {
        }
    }

    public static final class VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {
        public static final VSyncSampler f0 = new VSyncSampler();
        public volatile long X = -9223372036854775807L;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Handler f6659Y;
        public Choreographer Z;
        public int e0;

        public VSyncSampler() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i2 = Util.f5683a;
            Handler handler = new Handler(looper, this);
            this.f6659Y = handler;
            handler.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.X = j;
            Choreographer choreographer = this.Z;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    this.Z = Choreographer.getInstance();
                } catch (RuntimeException e2) {
                    Log.h("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
                }
                return true;
            }
            if (i2 == 2) {
                Choreographer choreographer = this.Z;
                if (choreographer != null) {
                    int i3 = this.e0 + 1;
                    this.e0 = i3;
                    if (i3 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i2 != 3) {
                return false;
            }
            Choreographer choreographer2 = this.Z;
            if (choreographer2 != null) {
                int i4 = this.e0 - 1;
                this.e0 = i4;
                if (i4 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.X = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public VideoFrameReleaseHelper(Context context) {
        DisplayManager displayManager;
        FixedFrameRateEstimator fixedFrameRateEstimator = new FixedFrameRateEstimator();
        fixedFrameRateEstimator.f6624a = new FixedFrameRateEstimator.Matcher();
        fixedFrameRateEstimator.f6625b = new FixedFrameRateEstimator.Matcher();
        fixedFrameRateEstimator.d = -9223372036854775807L;
        this.f6649a = fixedFrameRateEstimator;
        DisplayHelper displayHelper = (context == null || (displayManager = (DisplayManager) context.getSystemService(d9.h.d)) == null) ? null : new DisplayHelper(displayManager);
        this.f6650b = displayHelper;
        this.f6651c = displayHelper != null ? VSyncSampler.f0 : null;
        this.k = -9223372036854775807L;
        this.f6655l = -9223372036854775807L;
        this.f = -1.0f;
        this.f6654i = 1.0f;
        this.j = 0;
    }

    public static void a(VideoFrameReleaseHelper videoFrameReleaseHelper, Display display) {
        videoFrameReleaseHelper.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            videoFrameReleaseHelper.k = refreshRate;
            videoFrameReleaseHelper.f6655l = (refreshRate * 80) / 100;
        } else {
            Log.g("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            videoFrameReleaseHelper.k = -9223372036854775807L;
            videoFrameReleaseHelper.f6655l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (Util.f5683a < 30 || (surface = this.f6652e) == null || this.j == Integer.MIN_VALUE || this.f6653h == 0.0f) {
            return;
        }
        this.f6653h = 0.0f;
        Api30.a(surface, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public final void c() {
        float f;
        float f2;
        if (Util.f5683a < 30 || this.f6652e == null) {
            return;
        }
        FixedFrameRateEstimator fixedFrameRateEstimator = this.f6649a;
        if (!fixedFrameRateEstimator.f6624a.a()) {
            f = this.f;
        } else if (fixedFrameRateEstimator.f6624a.a()) {
            FixedFrameRateEstimator.Matcher matcher = fixedFrameRateEstimator.f6624a;
            long j = matcher.f6631e;
            f = (float) (1.0E9d / (j != 0 ? matcher.f / j : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (fixedFrameRateEstimator.f6624a.a()) {
                if ((fixedFrameRateEstimator.f6624a.a() ? fixedFrameRateEstimator.f6624a.f : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.02f;
                } else {
                    f2 = 1.0f;
                }
            } else {
                f2 = 1.0f;
            }
            if (Math.abs(f - this.g) < f2) {
                return;
            }
        } else if (f == -1.0f && fixedFrameRateEstimator.f6627e < 30) {
            return;
        }
        this.g = f;
        d(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    public final void d(boolean z2) {
        Surface surface;
        float f;
        if (Util.f5683a < 30 || (surface = this.f6652e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.f6654i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z2 || this.f6653h != f) {
            this.f6653h = f;
            Api30.a(surface, f);
        }
    }
}
