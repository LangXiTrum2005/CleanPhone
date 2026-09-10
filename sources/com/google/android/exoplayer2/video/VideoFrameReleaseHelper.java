package com.google.android.exoplayer2.video;

import A.C0880a0;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoFrameReleaseHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FixedFrameRateEstimator f19013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayHelper f19014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VSyncSampler f19015c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f19016e;
    public float f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f19018i;
    public int j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f19019l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f19020n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f19021p;
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

    public interface DisplayHelper {

        public interface Listener {
        }

        void a(C0880a0 c0880a0);

        void b();
    }

    public static final class DisplayHelperV16 implements DisplayHelper {
        public final WindowManager X;

        public DisplayHelperV16(WindowManager windowManager) {
            this.X = windowManager;
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public final void a(C0880a0 c0880a0) {
            c0880a0.e(this.X.getDefaultDisplay());
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public final void b() {
        }
    }

    public static final class DisplayHelperV17 implements DisplayHelper, DisplayManager.DisplayListener {
        public final DisplayManager X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public C0880a0 f19022Y;

        public DisplayHelperV17(DisplayManager displayManager) {
            this.X = displayManager;
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public final void a(C0880a0 c0880a0) {
            this.f19022Y = c0880a0;
            Handler handlerL = Util.l(null);
            DisplayManager displayManager = this.X;
            displayManager.registerDisplayListener(this, handlerL);
            c0880a0.e(displayManager.getDisplay(0));
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public final void b() {
            this.X.unregisterDisplayListener(this);
            this.f19022Y = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i2) {
            C0880a0 c0880a0 = this.f19022Y;
            if (c0880a0 == null || i2 != 0) {
                return;
            }
            c0880a0.e(this.X.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i2) {
        }
    }

    public static final class VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {
        public static final VSyncSampler f0 = new VSyncSampler();
        public volatile long X = -9223372036854775807L;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Handler f19023Y;
        public Choreographer Z;
        public int e0;

        public VSyncSampler() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i2 = Util.f18979a;
            Handler handler = new Handler(looper, this);
            this.f19023Y = handler;
            handler.sendEmptyMessage(0);
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
            if (i2 == 0) {
                try {
                    this.Z = Choreographer.getInstance();
                    return true;
                } catch (RuntimeException e2) {
                    Log.h("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
                }
            } else if (i2 == 1) {
                Choreographer choreographer = this.Z;
                if (choreographer != null) {
                    int i3 = this.e0 + 1;
                    this.e0 = i3;
                    if (i3 == 1) {
                        choreographer.postFrameCallback(this);
                        return true;
                    }
                }
            } else {
                if (i2 != 2) {
                    return false;
                }
                Choreographer choreographer2 = this.Z;
                if (choreographer2 != null) {
                    int i4 = this.e0 - 1;
                    this.e0 = i4;
                    if (i4 == 0) {
                        choreographer2.removeFrameCallback(this);
                        this.X = -9223372036854775807L;
                        return true;
                    }
                }
            }
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    public VideoFrameReleaseHelper(Context context) {
        DisplayHelper displayHelperV17;
        DisplayManager displayManager;
        FixedFrameRateEstimator fixedFrameRateEstimator = new FixedFrameRateEstimator();
        fixedFrameRateEstimator.f18993a = new FixedFrameRateEstimator.Matcher();
        fixedFrameRateEstimator.f18994b = new FixedFrameRateEstimator.Matcher();
        fixedFrameRateEstimator.d = -9223372036854775807L;
        this.f19013a = fixedFrameRateEstimator;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            displayHelperV17 = (Util.f18979a < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService(d9.h.d)) == null) ? null : new DisplayHelperV17(displayManager);
            if (displayHelperV17 == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    displayHelperV17 = new DisplayHelperV16(windowManager);
                } else {
                    displayHelperV17 = null;
                }
            }
        } else {
            displayHelperV17 = null;
        }
        this.f19014b = displayHelperV17;
        this.f19015c = displayHelperV17 != null ? VSyncSampler.f0 : null;
        this.k = -9223372036854775807L;
        this.f19019l = -9223372036854775807L;
        this.f = -1.0f;
        this.f19018i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (Util.f18979a < 30 || (surface = this.f19016e) == null || this.j == Integer.MIN_VALUE || this.f19017h == 0.0f) {
            return;
        }
        this.f19017h = 0.0f;
        Api30.a(surface, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public final void b() {
        float f;
        float f2;
        if (Util.f18979a < 30 || this.f19016e == null) {
            return;
        }
        FixedFrameRateEstimator fixedFrameRateEstimator = this.f19013a;
        if (!fixedFrameRateEstimator.f18993a.a()) {
            f = this.f;
        } else if (fixedFrameRateEstimator.f18993a.a()) {
            FixedFrameRateEstimator.Matcher matcher = fixedFrameRateEstimator.f18993a;
            long j = matcher.f19000e;
            f = (float) (1.0E9d / (j != 0 ? matcher.f / j : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (fixedFrameRateEstimator.f18993a.a()) {
                if ((fixedFrameRateEstimator.f18993a.a() ? fixedFrameRateEstimator.f18993a.f : -9223372036854775807L) >= 5000000000L) {
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
        } else if (f == -1.0f && fixedFrameRateEstimator.f18996e < 30) {
            return;
        }
        this.g = f;
        c(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    public final void c(boolean z2) {
        Surface surface;
        float f;
        if (Util.f18979a < 30 || (surface = this.f19016e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.f19018i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z2 || this.f19017h != f) {
            this.f19017h = f;
            Api30.a(surface, f);
        }
    }
}
