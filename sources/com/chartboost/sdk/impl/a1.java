package com.chartboost.sdk.impl;

import A.C0890f0;
import A.C0892g0;
import A.C0896i0;
import android.media.MediaPlayer;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.FileDescriptor;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements b1, SurfaceHolder.Callback, zi.b, qi.b, y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaPlayer f13385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SurfaceView f13386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c1 f13387c;
    public final lh d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function4 f13388e;
    public final CoroutineDispatcher f;
    public final a8 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f13389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13390i;
    public boolean j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13391l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SurfaceHolder f13392n;
    public ne o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public qi f13393p;
    public final zi q;
    public boolean r;
    public float s;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0 {
        public a(Object obj) {
            super(0, obj, a1.class, "startMediaPlayer", "startMediaPlayer$ChartboostMonetization_9_10_2_productionRelease()V", 0);
        }

        public final void a() {
            ((a1) this.receiver).n();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public a1(MediaPlayer mediaPlayer, SurfaceView surfaceView, c1 c1Var, lh uiPoster, Function3 videoProgressFactory, Function4 videoBufferFactory, CoroutineDispatcher coroutineDispatcher, a8 fileCache) {
        Intrinsics.f(uiPoster, "uiPoster");
        Intrinsics.f(videoProgressFactory, "videoProgressFactory");
        Intrinsics.f(videoBufferFactory, "videoBufferFactory");
        Intrinsics.f(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.f(fileCache, "fileCache");
        this.f13385a = mediaPlayer;
        this.f13386b = surfaceView;
        this.f13387c = c1Var;
        this.d = uiPoster;
        this.f13388e = videoBufferFactory;
        this.f = coroutineDispatcher;
        this.g = fileCache;
        this.f13392n = surfaceView != null ? surfaceView.getHolder() : null;
        this.q = (zi) videoProgressFactory.invoke(this.f13387c, this, uiPoster);
    }

    private final void b(int i2, int i3) {
        MediaPlayer mediaPlayer = this.f13385a;
        if (mediaPlayer == null) {
            return;
        }
        SurfaceView surfaceView = this.f13386b;
        int videoHeight = mediaPlayer.getVideoHeight();
        MediaPlayer mediaPlayer2 = this.f13385a;
        hj.a(surfaceView, mediaPlayer2 != null ? mediaPlayer2.getVideoWidth() : 1, videoHeight, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    @Override // com.chartboost.sdk.impl.b1
    public void a(oi asset) {
        c1 c1Var;
        Intrinsics.f(asset, "asset");
        Unit unit = null;
        za.a("asset() - asset: " + asset, (Throwable) null, 2, (Object) null);
        if (this.f13385a != null) {
            qi qiVar = (qi) this.f13388e.invoke(asset, this, this.f, this.g);
            this.f13393p = qiVar;
            this.o = qiVar != null ? qiVar.d() : null;
            SurfaceHolder surfaceHolder = this.f13392n;
            if (surfaceHolder != null) {
                surfaceHolder.addCallback(this);
                unit = Unit.f43263a;
            }
            if (unit == null) {
                c1Var = this.f13387c;
                if (c1Var != null) {
                    c1Var.a("Missing media player during startMediaPlayer");
                }
            }
        } else {
            c1Var = this.f13387c;
            if (c1Var != null) {
                c1Var.a("Missing media player during startMediaPlayer");
            }
        }
        this.r = false;
    }

    @Override // com.chartboost.sdk.impl.y1
    public void c() {
        this.m = true;
    }

    @Override // com.chartboost.sdk.impl.qi.b
    public void d() {
        this.j = true;
        MediaPlayer mediaPlayer = this.f13385a;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        l();
        MediaPlayer mediaPlayer2 = this.f13385a;
        if (mediaPlayer2 != null) {
            mediaPlayer2.prepareAsync();
        }
        c1 c1Var = this.f13387c;
        if (c1Var != null) {
            c1Var.d();
        }
    }

    public final void e() {
        if (!this.j || this.f13391l) {
            return;
        }
        qi qiVar = this.f13393p;
        if (qiVar != null) {
            qiVar.a();
        }
        this.f13391l = false;
        c1 c1Var = this.f13387c;
        if (c1Var != null) {
            c1Var.c();
        }
        pause();
        qi qiVar2 = this.f13393p;
        if (qiVar2 != null) {
            qiVar2.c();
        }
    }

    @Override // com.chartboost.sdk.impl.b1
    public void f() {
        this.s = 0.0f;
        MediaPlayer mediaPlayer = this.f13385a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @Override // com.chartboost.sdk.impl.b1
    public float g() {
        return this.s;
    }

    @Override // com.chartboost.sdk.impl.b1
    public boolean h() {
        return this.r;
    }

    public final void i() {
        MediaPlayer mediaPlayer = this.f13385a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.f13387c = null;
        this.f13385a = null;
        this.f13392n = null;
        this.f13386b = null;
        this.f13393p = null;
    }

    public final void j() {
        this.q.a();
    }

    public final void k() {
        zi.a.a(this.q, 0L, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b A[Catch: IOException -> 0x0016, TryCatch #0 {IOException -> 0x0016, blocks: (B:3:0x0003, B:5:0x0007, B:7:0x000d, B:9:0x0011, B:19:0x0029, B:14:0x001b, B:16:0x001f), top: B:28:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x001f A[Catch: IOException -> 0x0016, TryCatch #0 {IOException -> 0x0016, blocks: (B:3:0x0003, B:5:0x0007, B:7:0x000d, B:9:0x0011, B:19:0x0029, B:14:0x001b, B:16:0x001f), top: B:28:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    public final void l() {
        c1 c1Var;
        Unit unit;
        FileDescriptor fileDescriptorB;
        Unit unit2 = Unit.f43263a;
        try {
            ne neVar = this.o;
            if (neVar == null || (fileDescriptorB = neVar.b()) == null) {
                c1Var = this.f13387c;
                if (c1Var != null) {
                    c1Var.a("Missing video asset");
                    unit = unit2;
                } else {
                    unit = null;
                }
            } else {
                MediaPlayer mediaPlayer = this.f13385a;
                if (mediaPlayer != null) {
                    mediaPlayer.setDataSource(fileDescriptorB);
                    unit = unit2;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    c1Var = this.f13387c;
                    if (c1Var != null) {
                        c1Var.a("Missing video asset");
                        unit = unit2;
                    } else {
                        unit = null;
                    }
                }
            }
            if (unit == null) {
                za.b("MediaPlayer missing callback on error", (Throwable) null, 2, (Object) null);
            }
        } catch (IOException e2) {
            c1 c1Var2 = this.f13387c;
            if (c1Var2 != null) {
                c1Var2.a(e2.toString());
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                za.b("MediaPlayer missing callback on IOException", e2);
            }
        }
    }

    public final void m() {
        MediaPlayer mediaPlayer = this.f13385a;
        if (mediaPlayer != null) {
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: p.a
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    this.X.a(mediaPlayer2);
                }
            });
            mediaPlayer.setOnInfoListener(new C0892g0(this, 1));
            mediaPlayer.setOnCompletionListener(new C0890f0(this, 1));
            mediaPlayer.setOnErrorListener(new C0896i0(this, 1));
        }
    }

    public final void n() {
        Unit unit = Unit.f43263a;
        MediaPlayer mediaPlayer = this.f13385a;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
                this.r = true;
                k();
                c1 c1Var = this.f13387c;
                if (c1Var != null) {
                    c1Var.a();
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaPlayer.seekTo(this.f13389h, 3);
                } else {
                    mediaPlayer.seekTo((int) this.f13389h);
                }
            } catch (IllegalStateException e2) {
                c1 c1Var2 = this.f13387c;
                if (c1Var2 != null) {
                    c1Var2.a(e2.toString());
                } else {
                    unit = null;
                }
            }
            if (unit != null) {
                return;
            }
        }
        c1 c1Var3 = this.f13387c;
        if (c1Var3 != null) {
            c1Var3.a("Missing video player during startVideoPlayer");
        }
    }

    public final void o() {
        this.d.a(500L, new a(this));
    }

    @Override // com.chartboost.sdk.impl.b1
    public void pause() {
        za.a("pause()", (Throwable) null, 2, (Object) null);
        if (this.f13390i && this.j) {
            qi qiVar = this.f13393p;
            if (qiVar != null) {
                qiVar.e();
            }
            j();
            try {
                MediaPlayer mediaPlayer = this.f13385a;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
            } catch (Exception e2) {
                c1 c1Var = this.f13387c;
                if (c1Var != null) {
                    c1Var.a(e2.toString());
                }
            }
            this.f13389h = a();
            this.j = false;
            this.k = true;
        }
    }

    @Override // com.chartboost.sdk.impl.b1
    public void play() {
        za.a("play()", (Throwable) null, 2, (Object) null);
        if (this.f13390i && !this.j) {
            o();
        }
        this.j = true;
        this.k = this.m;
        this.m = false;
    }

    @Override // com.chartboost.sdk.impl.b1
    public void stop() throws IOException {
        za.a("stop()", (Throwable) null, 2, (Object) null);
        if (this.f13390i) {
            qi qiVar = this.f13393p;
            if (qiVar != null) {
                qiVar.e();
            }
            this.f13393p = null;
            this.f13389h = 0L;
            j();
            try {
                MediaPlayer mediaPlayer = this.f13385a;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                }
            } catch (Exception e2) {
                c1 c1Var = this.f13387c;
                if (c1Var != null) {
                    c1Var.a(e2.toString());
                }
            }
            this.j = false;
            this.k = false;
            ne neVar = this.o;
            if (neVar != null) {
                neVar.a();
            }
            this.o = null;
            i();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int i2, int i3, int i4) {
        Intrinsics.f(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        Intrinsics.f(holder, "holder");
        if (this.k) {
            MediaPlayer mediaPlayer = this.f13385a;
            if (mediaPlayer != null) {
                mediaPlayer.setDisplay(holder);
            }
            play();
            return;
        }
        try {
            m();
            l();
            MediaPlayer mediaPlayer2 = this.f13385a;
            if (mediaPlayer2 != null) {
                mediaPlayer2.prepareAsync();
            }
            MediaPlayer mediaPlayer3 = this.f13385a;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setDisplay(holder);
            }
        } catch (Exception e2) {
            za.b("SurfaceCreated exception", e2);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        Intrinsics.f(holder, "holder");
        MediaPlayer mediaPlayer = this.f13385a;
        if (mediaPlayer != null) {
            mediaPlayer.setDisplay(null);
        }
    }

    public final void c(int i2, int i3) {
        za.b("MediaPlayer error: " + android.support.v4.media.a.g(i2, i3, "error: ", " extra: "), (Throwable) null, 2, (Object) null);
        if (this.f13390i) {
            e();
        }
    }

    public static final boolean b(a1 this$0, MediaPlayer mediaPlayer, int i2, int i3) {
        Intrinsics.f(this$0, "this$0");
        this$0.c(i2, i3);
        return true;
    }

    @Override // com.chartboost.sdk.impl.b1
    public void b() {
        MediaPlayer mediaPlayer = this.f13385a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a1(MediaPlayer mediaPlayer, SurfaceView surfaceView, c1 c1Var, lh lhVar, Function3 function3, Function4 function4, CoroutineDispatcher coroutineDispatcher, a8 a8Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        mediaPlayer = (i2 & 1) != 0 ? new MediaPlayer() : mediaPlayer;
        if ((i2 & 64) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = MainDispatcherLoader.f45042a;
        }
        this(mediaPlayer, surfaceView, c1Var, lhVar, function3, function4, coroutineDispatcher, a8Var);
    }

    @Override // com.chartboost.sdk.impl.zi.b
    public long a() {
        MediaPlayer mediaPlayer = this.f13385a;
        if (mediaPlayer == null) {
            return 0L;
        }
        long currentPosition = mediaPlayer.getCurrentPosition();
        this.f13389h = currentPosition;
        return currentPosition;
    }

    public final void a(MediaPlayer mp) {
        Intrinsics.f(mp, "mp");
        this.f13391l = false;
        int duration = mp.getDuration();
        SurfaceView surfaceView = this.f13386b;
        int width = surfaceView != null ? surfaceView.getWidth() : 0;
        SurfaceView surfaceView2 = this.f13386b;
        b(width, surfaceView2 != null ? surfaceView2.getHeight() : 0);
        c1 c1Var = this.f13387c;
        if (c1Var != null) {
            c1Var.b(duration);
        }
        this.f13390i = true;
        qi qiVar = this.f13393p;
        if (qiVar != null) {
            qiVar.a(duration);
        }
        if (this.j) {
            n();
        }
    }

    @Override // com.chartboost.sdk.impl.of
    public void a(int i2, int i3) {
        b(i3, i2);
    }

    public static final boolean a(a1 this$0, MediaPlayer mediaPlayer, int i2, int i3) {
        Intrinsics.f(this$0, "this$0");
        if ((i2 != 805 && i2 != 804) || i3 != -1004) {
            return true;
        }
        this$0.e();
        return true;
    }

    public static final void a(a1 this$0, MediaPlayer mediaPlayer) {
        Intrinsics.f(this$0, "this$0");
        if (this$0.f13389h >= ((double) mediaPlayer.getDuration()) - (((double) mediaPlayer.getDuration()) * 0.05d)) {
            c1 c1Var = this$0.f13387c;
            if (c1Var != null) {
                c1Var.b();
                return;
            }
            return;
        }
        this$0.e();
    }
}
