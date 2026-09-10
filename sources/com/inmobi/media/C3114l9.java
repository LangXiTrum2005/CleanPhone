package com.inmobi.media;

import A.C0888e0;
import A.C0890f0;
import A.C0892g0;
import A.C0896i0;
import A.RunnableC0886d0;
import A.RunnableC0905n;
import android.app.KeyguardManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import com.inmobi.media.C3114l9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3114l9 extends TextureView implements MediaController.MediaPlayerControl {
    public static final String C = "l9";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final MediaPlayer.OnErrorListener f23772A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final TextureViewSurfaceTextureListenerC3098k9 f23773B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f23774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Surface f23775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public G8 f23776c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23777e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC3050h9 f23779i;
    public InterfaceC3034g9 j;
    public InterfaceC3018f9 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23780l;
    public HandlerC3066i9 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C3002e9 f23781n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23782p;
    public boolean q;
    public boolean r;
    public Handler s;
    public boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C3017f8 f23783u;
    public MediaPlayer.OnVideoSizeChangedListener v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C3082j9 f23784w;
    public final MediaPlayer.OnCompletionListener x;
    public final MediaPlayer.OnInfoListener y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final MediaPlayer.OnBufferingUpdateListener f23785z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3114l9(Context context) {
        super(context);
        Intrinsics.f(context, "context");
        this.f23778h = Integer.MIN_VALUE;
        Context context2 = getContext();
        Intrinsics.e(context2, "getContext(...)");
        this.f23783u = new C3017f8(context2, this);
        requestLayout();
        invalidate();
        this.v = new C0888e0(this, 0);
        this.f23784w = new C3082j9(this);
        this.x = new C0890f0(this, 0);
        this.y = new C0892g0(this, 0);
        this.f23785z = new MediaPlayer.OnBufferingUpdateListener() { // from class: A.h0
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
                C3114l9.a(this.X, mediaPlayer, i2);
            }
        };
        this.f23772A = new C0896i0(this, 0);
        this.f23773B = new TextureViewSurfaceTextureListenerC3098k9(this);
    }

    public static final void a(C3114l9 this$0, MediaPlayer mediaPlayer) {
        Intrinsics.f(this$0, "this$0");
        try {
            this$0.d();
        } catch (Exception e2) {
            String TAG = C;
            Intrinsics.e(TAG, "TAG");
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public static final boolean b(C3114l9 this$0, MediaPlayer mediaPlayer, int i2, int i3) {
        Intrinsics.f(this$0, "this$0");
        if (3 != i2) {
            return true;
        }
        this$0.a(8, 8);
        return true;
    }

    public static final void c(C3114l9 this$0, MediaPlayer mediaPlayer, int i2, int i3) {
        Intrinsics.f(this$0, "this$0");
        this$0.f23777e = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this$0.f = videoHeight;
        if (this$0.f23777e == 0 || videoHeight == 0) {
            return;
        }
        this$0.requestLayout();
    }

    public static final void e(C3114l9 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.pause();
    }

    private final void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    private final void setVideoURI(Uri uri) {
        this.f23774a = uri;
        e();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return this.f23782p;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.q;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.r;
    }

    public final void d() {
        G8 g8 = this.f23776c;
        if (g8 != null) {
            g8.f22844a = 5;
        }
        if (g8 != null) {
            g8.f22845b = 5;
        }
        C3002e9 c3002e9 = this.f23781n;
        if (c3002e9 != null) {
            c3002e9.c();
        }
        HandlerC3066i9 handlerC3066i9 = this.m;
        if (handlerC3066i9 != null) {
            handlerC3066i9.removeMessages(1);
        }
        Object tag = getTag();
        if (tag instanceof C2968c9) {
            C2968c9 c2968c9 = (C2968c9) tag;
            Object obj = c2968c9.t.get("didCompleteQ4");
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((Boolean) obj).booleanValue()) {
                c2968c9.t.put("didCompleteQ4", Boolean.TRUE);
                InterfaceC3050h9 interfaceC3050h9 = this.f23779i;
                if (interfaceC3050h9 != null) {
                    ((C3336z8) interfaceC3050h9).a((byte) 3);
                }
            }
            c2968c9.t.put("didSignalVideoCompleted", Boolean.TRUE);
            HashMap map = c2968c9.t;
            if (map != null) {
                Boolean bool = Boolean.FALSE;
                map.put("didCompleteQ1", bool);
                map.put("didCompleteQ2", bool);
                map.put("didCompleteQ3", bool);
                map.put("didPause", bool);
                map.put("didStartPlaying", bool);
                map.put("didQ4Fire", bool);
            }
            if (c2968c9.f23489B) {
                start();
                return;
            }
            this.f23783u.a();
            Object obj2 = c2968c9.t.get("isFullScreen");
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj2).booleanValue()) {
                a(8, 0);
            }
        }
    }

    public final void f() {
        Surface surface = this.f23775b;
        if (surface != null) {
            surface.release();
        }
        this.f23775b = null;
        g();
    }

    public final void g() {
        G8 g8;
        HandlerC3066i9 handlerC3066i9 = this.m;
        if (handlerC3066i9 != null) {
            handlerC3066i9.removeMessages(1);
        }
        C3017f8 c3017f8 = this.f23783u;
        c3017f8.a();
        if (Build.VERSION.SDK_INT >= 26) {
            c3017f8.f = null;
        }
        c3017f8.g = null;
        Object tag = getTag();
        boolean z2 = tag instanceof C2968c9;
        if (z2) {
            ((C2968c9) tag).t.put("seekPosition", Integer.valueOf(getCurrentPosition()));
        }
        G8 g9 = this.f23776c;
        if (g9 != null) {
            g9.f22844a = 0;
        }
        if (g9 != null) {
            g9.f22845b = 0;
        }
        if (g9 != null) {
            try {
                g9.reset();
            } catch (Exception e2) {
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
            }
        }
        G8 g10 = this.f23776c;
        if (g10 != null) {
            g10.setOnPreparedListener(null);
            g10.setOnVideoSizeChangedListener(null);
            g10.setOnCompletionListener(null);
            g10.setOnErrorListener(null);
            g10.setOnInfoListener(null);
            g10.setOnBufferingUpdateListener(null);
        }
        if (z2) {
            Object obj = ((C2968c9) tag).t.get("placementType");
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Byte");
            if (((Byte) obj).byteValue() == 0 && (g8 = this.f23776c) != null) {
                g8.a();
            }
        } else {
            G8 g11 = this.f23776c;
            if (g11 != null) {
                g11.a();
            }
        }
        String TAG = C;
        Intrinsics.e(TAG, "TAG");
        this.f23776c = null;
    }

    public final C3017f8 getAudioFocusManager$media_release() {
        return this.f23783u;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.d == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.d = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.d;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f23776c != null) {
            return this.o;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        G8 g8 = this.f23776c;
        if (g8 == null || !a()) {
            return 0;
        }
        return g8.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        G8 g8 = this.f23776c;
        if (g8 == null || !a()) {
            return -1;
        }
        return g8.getDuration();
    }

    public final int getLastVolume() {
        return this.f23778h;
    }

    public final MediaPlayer.OnVideoSizeChangedListener getMSizeChangedListener() {
        return this.v;
    }

    public final C3002e9 getMediaController() {
        return this.f23781n;
    }

    public final G8 getMediaPlayer() {
        return this.f23776c;
    }

    public final boolean getPauseScheduled() {
        return this.t;
    }

    public final InterfaceC3034g9 getPlaybackEventListener() {
        return this.j;
    }

    public final InterfaceC3050h9 getQuartileCompletedListener() {
        return this.f23779i;
    }

    public final int getState() {
        G8 g8 = this.f23776c;
        if (g8 != null) {
            return g8.f22844a;
        }
        return 0;
    }

    public final int getVideoVolume() {
        if (isPlaying()) {
            return this.g;
        }
        return -1;
    }

    public final int getVolume() {
        if (a()) {
            return this.g;
        }
        return -1;
    }

    public final void h() {
        G8 g8 = this.f23776c;
        if (g8 != null) {
            this.g = 0;
            g8.setVolume(0.0f, 0.0f);
            Object tag = getTag();
            if (tag instanceof C2968c9) {
                ((C2968c9) tag).t.put("currentMediaVolume", 0);
            }
        }
    }

    public final void i() {
        G8 g8 = this.f23776c;
        if (g8 != null) {
            this.g = 1;
            g8.setVolume(1.0f, 1.0f);
            Object tag = getTag();
            if (tag instanceof C2968c9) {
                ((C2968c9) tag).t.put("currentMediaVolume", 15);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        G8 g8;
        return a() && (g8 = this.f23776c) != null && g8.isPlaying();
    }

    public final void j() {
        G8 g8;
        if (a() && (g8 = this.f23776c) != null && g8.isPlaying()) {
            G8 g9 = this.f23776c;
            if (g9 != null) {
                g9.pause();
            }
            G8 g10 = this.f23776c;
            if (g10 != null) {
                g10.seekTo(0);
            }
            this.f23783u.a();
            Object tag = getTag();
            if (tag instanceof C2968c9) {
                C2968c9 c2968c9 = (C2968c9) tag;
                HashMap map = c2968c9.t;
                Boolean bool = Boolean.TRUE;
                map.put("didPause", bool);
                c2968c9.t.put("seekPosition", 0);
                c2968c9.t.put("didCompleteQ4", bool);
            }
            G8 g11 = this.f23776c;
            if (g11 != null) {
                g11.f22844a = 4;
            }
            InterfaceC3034g9 interfaceC3034g9 = this.j;
            if (interfaceC3034g9 != null) {
                ((A8) interfaceC3034g9).a((byte) 4);
            }
        }
        G8 g12 = this.f23776c;
        if (g12 == null) {
            return;
        }
        g12.f22845b = 4;
    }

    public final void k() {
        if (this.f23776c != null) {
            if (isPlaying()) {
                this.f23783u.c();
            } else {
                i();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r1 > r6) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f23777e     // Catch: java.lang.Exception -> L79
            int r0 = android.view.View.getDefaultSize(r0, r6)     // Catch: java.lang.Exception -> L79
            int r1 = r5.f     // Catch: java.lang.Exception -> L79
            int r1 = android.view.View.getDefaultSize(r1, r7)     // Catch: java.lang.Exception -> L79
            int r2 = r5.f23777e     // Catch: java.lang.Exception -> L79
            if (r2 <= 0) goto L75
            int r2 = r5.f     // Catch: java.lang.Exception -> L79
            if (r2 <= 0) goto L75
            int r0 = android.view.View.MeasureSpec.getMode(r6)     // Catch: java.lang.Exception -> L79
            int r6 = android.view.View.MeasureSpec.getSize(r6)     // Catch: java.lang.Exception -> L79
            int r1 = android.view.View.MeasureSpec.getMode(r7)     // Catch: java.lang.Exception -> L79
            int r7 = android.view.View.MeasureSpec.getSize(r7)     // Catch: java.lang.Exception -> L79
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L3c
            if (r1 != r2) goto L3c
            int r0 = r5.f23777e     // Catch: java.lang.Exception -> L79
            int r1 = r0 * r7
            int r2 = r5.f     // Catch: java.lang.Exception -> L79
            int r3 = r6 * r2
            if (r1 >= r3) goto L36
            int r3 = r3 / r0
            goto L73
        L36:
            if (r1 <= r3) goto L5a
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L75
        L3c:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L4e
            int r0 = r5.f     // Catch: java.lang.Exception -> L79
            int r0 = r0 * r6
            int r2 = r5.f23777e     // Catch: java.lang.Exception -> L79
            int r0 = r0 / r2
            if (r1 != r3) goto L4b
            if (r0 <= r7) goto L4b
            goto L5a
        L4b:
            r1 = r0
        L4c:
            r0 = r6
            goto L75
        L4e:
            if (r1 != r2) goto L5e
            int r1 = r5.f23777e     // Catch: java.lang.Exception -> L79
            int r1 = r1 * r7
            int r2 = r5.f     // Catch: java.lang.Exception -> L79
            int r1 = r1 / r2
            if (r0 != r3) goto L5c
            if (r1 <= r6) goto L5c
        L5a:
            r1 = r7
            goto L4c
        L5c:
            r0 = r1
            goto L3a
        L5e:
            int r2 = r5.f23777e     // Catch: java.lang.Exception -> L79
            int r4 = r5.f     // Catch: java.lang.Exception -> L79
            if (r1 != r3) goto L6a
            if (r4 <= r7) goto L6a
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L6c
        L6a:
            r1 = r2
            r7 = r4
        L6c:
            if (r0 != r3) goto L5c
            if (r1 <= r6) goto L5c
            int r4 = r4 * r6
            int r3 = r4 / r2
        L73:
            r1 = r3
            goto L4c
        L75:
            r5.setMeasuredDimension(r0, r1)     // Catch: java.lang.Exception -> L79
            return
        L79:
            java.lang.String r6 = com.inmobi.media.C3114l9.C
            java.lang.String r7 = "TAG"
            kotlin.jvm.internal.Intrinsics.e(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3114l9.onMeasure(int, int):void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        G8 g8;
        if (a() && (g8 = this.f23776c) != null && g8.isPlaying()) {
            G8 g9 = this.f23776c;
            if (g9 != null) {
                g9.pause();
            }
            G8 g10 = this.f23776c;
            if (g10 != null) {
                g10.f22844a = 4;
            }
            this.f23783u.a();
            Object tag = getTag();
            if (tag instanceof C2968c9) {
                C2968c9 c2968c9 = (C2968c9) tag;
                c2968c9.t.put("didPause", Boolean.TRUE);
                c2968c9.t.put("seekPosition", Integer.valueOf(getCurrentPosition()));
            }
            InterfaceC3034g9 interfaceC3034g9 = this.j;
            if (interfaceC3034g9 != null) {
                ((A8) interfaceC3034g9).a((byte) 2);
            }
        }
        G8 g11 = this.f23776c;
        if (g11 != null) {
            g11.f22845b = 4;
        }
        this.t = false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i2) {
    }

    public final void setIsLockScreen(boolean z2) {
        this.f23780l = z2;
    }

    public final void setLastVolume(int i2) {
        this.f23778h = i2;
    }

    public final void setMSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        Intrinsics.f(onVideoSizeChangedListener, "<set-?>");
        this.v = onVideoSizeChangedListener;
    }

    public final void setMediaController(C3002e9 c3002e9) {
        C3002e9 mediaController;
        if (c3002e9 != null) {
            this.f23781n = c3002e9;
            if (this.f23776c == null || (mediaController = getMediaController()) == null) {
                return;
            }
            mediaController.setMediaPlayer(this);
            mediaController.setEnabled(a());
            mediaController.d();
        }
    }

    public final void setMediaErrorListener(InterfaceC3018f9 interfaceC3018f9) {
        this.k = interfaceC3018f9;
    }

    public final void setPlaybackEventListener(InterfaceC3034g9 interfaceC3034g9) {
        this.j = interfaceC3034g9;
    }

    public final void setQuartileCompletedListener(InterfaceC3050h9 interfaceC3050h9) {
        this.f23779i = interfaceC3050h9;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        boolean z2;
        G8 g8;
        int iIntValue;
        HandlerC3066i9 handlerC3066i9;
        G8 g9;
        Object systemService = getContext().getSystemService("power");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        Object systemService2 = getContext().getSystemService("keyguard");
        Intrinsics.d(systemService2, "null cannot be cast to non-null type android.app.KeyguardManager");
        boolean zIsKeyguardLocked = ((KeyguardManager) systemService2).isKeyguardLocked();
        boolean zIsInteractive = ((PowerManager) systemService).isInteractive();
        boolean zA = a();
        Object tag = getTag();
        C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
        boolean z3 = false;
        if (c2968c9 != null) {
            Object obj = c2968c9.t.get("shouldAutoPlay");
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if (zA && !z2) {
            a(8, 0);
        }
        if (zA && zIsInteractive && (g8 = this.f23776c) != null && !g8.isPlaying() && z2 && (this.f23780l || !zIsKeyguardLocked)) {
            if (c2968c9 != null) {
                Object obj2 = c2968c9.t.get("didCompleteQ4");
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj2).booleanValue()) {
                    iIntValue = 0;
                } else {
                    Object obj3 = c2968c9.t.get("seekPosition");
                    Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Int");
                    iIntValue = ((Integer) obj3).intValue();
                }
            } else {
                iIntValue = 0;
            }
            if (c2968c9 != null ? c2968c9.c() : false) {
                this.f23783u.c();
            } else {
                c();
            }
            if (a() && (g9 = this.f23776c) != null) {
                g9.seekTo(iIntValue);
            }
            G8 g10 = this.f23776c;
            if (g10 != null) {
                g10.start();
            }
            G8 g11 = this.f23776c;
            if (g11 != null) {
                g11.f22844a = 3;
            }
            a(8, 8);
            if (c2968c9 != null) {
                HashMap map = c2968c9.t;
                Boolean bool = Boolean.FALSE;
                map.put("didCompleteQ4", bool);
                Object obj4 = c2968c9.t.get("didPause");
                Intrinsics.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj4).booleanValue()) {
                    InterfaceC3034g9 interfaceC3034g9 = this.j;
                    if (interfaceC3034g9 != null) {
                        ((A8) interfaceC3034g9).a((byte) 3);
                    }
                    c2968c9.t.put("didPause", bool);
                } else {
                    InterfaceC3034g9 interfaceC3034g10 = this.j;
                    if (interfaceC3034g10 != null) {
                        ((A8) interfaceC3034g10).a((byte) 1);
                    }
                }
                HandlerC3066i9 handlerC3066i10 = this.m;
                if (handlerC3066i10 != null && !handlerC3066i10.hasMessages(1)) {
                    z3 = true;
                }
                if (z3 && (handlerC3066i9 = this.m) != null) {
                    handlerC3066i9.sendEmptyMessage(1);
                }
            }
            C3002e9 c3002e9 = this.f23781n;
            if (c3002e9 != null) {
                c3002e9.d();
            }
        }
        G8 g12 = this.f23776c;
        if (g12 == null) {
            return;
        }
        g12.f22845b = 3;
    }

    public final void b() {
        try {
            if (this.f23774a != null) {
                Uc.a(new RunnableC0886d0(this, 2));
            }
        } catch (Exception unused) {
            String TAG = C;
            Intrinsics.e(TAG, "TAG");
        }
    }

    public final void e() {
        byte bByteValue;
        G8 g8A;
        if (this.f23774a == null || this.f23775b == null) {
            return;
        }
        if (this.f23776c != null) {
            d(this);
            return;
        }
        Object tag = getTag();
        C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
        if (c2968c9 != null) {
            Object obj = c2968c9.t.get("placementType");
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Byte");
            bByteValue = ((Byte) obj).byteValue();
        } else {
            bByteValue = 1;
        }
        if (1 == bByteValue) {
            g8A = new G8();
        } else {
            Object obj2 = G8.d;
            g8A = F8.a();
        }
        this.f23776c = g8A;
        int i2 = this.d;
        if (i2 != 0) {
            g8A.setAudioSessionId(i2);
        } else {
            this.d = g8A.getAudioSessionId();
        }
        ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24145c.getX()).execute(new RunnableC0886d0(this, 1));
    }

    public static final void b(C3114l9 this$0) {
        Intrinsics.f(this$0, "this$0");
        try {
            G8 g8 = this$0.f23776c;
            if (g8 != null) {
                Context applicationContext = this$0.getContext().getApplicationContext();
                Uri uri = this$0.f23774a;
                Intrinsics.c(uri);
                g8.setDataSource(applicationContext, uri, (Map<String, String>) null);
            }
            ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
            RunnableC0886d0 runnableC0886d0 = new RunnableC0886d0(this$0, 0);
            executorC3160o7.getClass();
            executorC3160o7.f23866a.post(runnableC0886d0);
        } catch (IOException unused) {
            G8 g9 = this$0.f23776c;
            if (g9 != null) {
                g9.f22844a = -1;
            }
            if (g9 == null) {
                return;
            }
            g9.f22845b = -1;
        }
    }

    public static final void c(C3114l9 this$0) {
        Intrinsics.f(this$0, "this$0");
        d(this$0);
    }

    public static final void a(C3114l9 this$0, MediaPlayer mediaPlayer, int i2) {
        Intrinsics.f(this$0, "this$0");
        this$0.o = i2;
    }

    public final void c() {
        if (this.f23776c != null) {
            this.f23783u.a();
            h();
        }
    }

    public static final boolean a(C3114l9 this$0, MediaPlayer mediaPlayer, int i2, int i3) {
        Intrinsics.f(this$0, "this$0");
        String TAG = C;
        Intrinsics.e(TAG, "TAG");
        InterfaceC3018f9 interfaceC3018f9 = this$0.k;
        if (interfaceC3018f9 != null) {
            B8 b8 = (B8) interfaceC3018f9;
            T7 t7 = b8.f22722a.f22767b;
            if (!t7.t && (t7 instanceof C2934a9)) {
                try {
                    ((C2934a9) t7).a(b8.f22723b, i2);
                } catch (Exception e2) {
                    D8 d8 = b8.f22722a;
                    InterfaceC3333z5 interfaceC3333z5 = d8.f;
                    if (interfaceC3333z5 != null) {
                        String str = d8.g;
                        ((A5) interfaceC3333z5).b(str, rf.a(e2, H6.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in handling the onVideoError event; ")));
                    }
                }
            }
        }
        G8 g8 = this$0.f23776c;
        if (g8 != null) {
            g8.f22844a = -1;
        }
        if (g8 != null) {
            g8.f22845b = -1;
        }
        C3002e9 c3002e9 = this$0.f23781n;
        if (c3002e9 != null) {
            c3002e9.c();
        }
        this$0.b();
        return true;
    }

    public static final void a(C3114l9 this$0) {
        Intrinsics.f(this$0, "this$0");
        String strValueOf = String.valueOf(this$0.f23774a);
        C3122m1 c3122m1A = Nc.a();
        c3122m1A.getClass();
        ArrayList arrayListA = T1.a(c3122m1A, "disk_uri=? ", new String[]{strValueOf}, null, null, "created_ts DESC ", 1, 12);
        C3072j c3072j = arrayListA.isEmpty() ? null : (C3072j) arrayListA.get(0);
        int iNextInt = new Random().nextInt() & Integer.MAX_VALUE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (c3072j != null) {
            String url = c3072j.f23703b;
            Intrinsics.f(url, "url");
            Nc.a().a(new C3072j(iNextInt, url, null, 0, jCurrentTimeMillis, jCurrentTimeMillis2, System.currentTimeMillis(), 0L));
        }
    }

    public static final void d(C3114l9 c3114l9) {
        G8 g8;
        C3002e9 mediaController;
        try {
            G8 g9 = c3114l9.f23776c;
            if (g9 != null) {
                g9.setOnPreparedListener(c3114l9.f23784w);
                g9.setOnVideoSizeChangedListener(c3114l9.v);
                g9.setOnCompletionListener(c3114l9.x);
                g9.setOnErrorListener(c3114l9.f23772A);
                g9.setOnInfoListener(c3114l9.y);
                g9.setOnBufferingUpdateListener(c3114l9.f23785z);
                g9.setSurface(c3114l9.f23775b);
            }
            if (L3.f22938a.J()) {
                G8 g10 = c3114l9.f23776c;
                if (g10 != null) {
                    g10.setAudioAttributes(c3114l9.f23783u.f23611e);
                }
            } else {
                G8 g11 = c3114l9.f23776c;
                if (g11 != null) {
                    g11.setAudioStreamType(3);
                }
            }
            G8 g12 = c3114l9.f23776c;
            if (g12 != null) {
                g12.prepareAsync();
            }
            c3114l9.o = 0;
            G8 g13 = c3114l9.f23776c;
            if (g13 != null) {
                g13.f22844a = 1;
            }
            if (g13 != null && (mediaController = c3114l9.getMediaController()) != null) {
                mediaController.setMediaPlayer(c3114l9);
                mediaController.setEnabled(c3114l9.a());
                mediaController.d();
            }
            Object tag = c3114l9.getTag();
            if (tag instanceof C2968c9) {
                Object obj = ((C2968c9) tag).t.get("shouldAutoPlay");
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj).booleanValue() && (g8 = c3114l9.f23776c) != null) {
                    g8.f22845b = 3;
                }
                Object obj2 = ((C2968c9) tag).t.get("didCompleteQ4");
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj2).booleanValue()) {
                    c3114l9.a(8, 0);
                    return;
                }
            }
            c3114l9.a(0, 0);
        } catch (Exception e2) {
            G8 g14 = c3114l9.f23776c;
            if (g14 != null) {
                g14.f22844a = -1;
            }
            if (g14 != null) {
                g14.f22845b = -1;
            }
            c3114l9.f23772A.onError(g14, 1, 0);
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public final void a(C2968c9 videoAsset) {
        String strB;
        G8 g8A;
        Intrinsics.f(videoAsset, "videoAsset");
        this.f23777e = 0;
        this.f = 0;
        Object obj = videoAsset.f23516e;
        Ve ve = obj instanceof Ve ? (Ve) obj : null;
        if (ve == null || (strB = ((Ue) ve).b()) == null) {
            strB = "";
        }
        Uri uri = Uri.parse(strB);
        this.f23774a = uri;
        Object obj2 = videoAsset.t.get("placementType");
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Byte");
        if (1 == ((Byte) obj2).byteValue()) {
            g8A = new G8();
        } else {
            Object obj3 = G8.d;
            g8A = F8.a();
        }
        this.f23776c = g8A;
        int i2 = this.d;
        if (i2 != 0) {
            g8A.setAudioSessionId(i2);
        } else {
            this.d = g8A.getAudioSessionId();
        }
        setTag(videoAsset);
        this.m = new HandlerC3066i9(this);
        setSurfaceTextureListener(this.f23773B);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24145c.getX()).execute(new RunnableC0905n(20, this, uri));
    }

    public static final void a(C3114l9 this$0, Uri uri) {
        Intrinsics.f(this$0, "this$0");
        try {
            G8 g8 = this$0.f23776c;
            if (g8 != null) {
                g8.setDataSource(this$0.getContext().getApplicationContext(), uri, (Map<String, String>) null);
            }
        } catch (IOException unused) {
            G8 g9 = this$0.f23776c;
            if (g9 != null) {
                g9.f22844a = -1;
            }
            if (g9 == null) {
                return;
            }
            g9.f22845b = -1;
        }
    }

    public final boolean a() {
        int i2;
        G8 g8 = this.f23776c;
        return g8 == null || !((i2 = g8.f22844a) == -1 || i2 == 0 || i2 == 1);
    }

    public final void a(int i2) {
        if (this.t || 4 == getState()) {
            return;
        }
        if (this.s == null) {
            this.s = new Handler(Looper.getMainLooper());
        }
        if (i2 > 0) {
            this.t = true;
            c();
            Handler handler = this.s;
            if (handler != null) {
                handler.postDelayed(new RunnableC0886d0(this, 3), i2 * 1000);
                return;
            }
            return;
        }
        pause();
    }

    public final void a(int i2, int i3) {
        if (this.f23776c != null) {
            ViewParent parent = getParent();
            C3130m9 c3130m9 = parent instanceof C3130m9 ? (C3130m9) parent : null;
            ProgressBar progressBar = c3130m9 != null ? c3130m9.getProgressBar() : null;
            if (progressBar != null) {
                progressBar.setVisibility(i2);
            }
            ViewParent parent2 = getParent();
            C3130m9 c3130m10 = parent2 instanceof C3130m9 ? (C3130m9) parent2 : null;
            ImageView posterImage = c3130m10 != null ? c3130m10.getPosterImage() : null;
            if (posterImage == null) {
                return;
            }
            posterImage.setVisibility(i3);
        }
    }
}
