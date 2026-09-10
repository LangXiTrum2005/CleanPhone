package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.gms.internal.measurement.f2;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class CusPlayerView extends ComponentLinearLayout {
    public static final String TAG = "PlayerView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.b f32548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f32552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f32553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SurfaceHolder f32554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected float f32555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f32556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f32557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f32558k;
    private MediaEvents l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f32559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f32560n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AudioManager f32561o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f32562p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f32563q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f32564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f32565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AspectRatioFrameLayout f32566t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f32567u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final com.mbridge.msdk.config.dynamic.baseview.video.c f32568v;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            CusPlayerView.this.a(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements SurfaceHolder.Callback {
        private c() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            try {
                q0.c("PlayerView", "surfaceChanged");
                if (CusPlayerView.this.f32548a != null && surfaceHolder != null && CusPlayerView.this.f32554g != surfaceHolder) {
                    CusPlayerView.this.f32554g = surfaceHolder;
                    CusPlayerView.this.f32548a.a(surfaceHolder);
                    if (CusPlayerView.this.f32567u) {
                        CusPlayerView.this.f32548a.n();
                    }
                }
                CusPlayerView.this.f32551d = false;
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceCreated");
                if (CusPlayerView.this.f32548a == null || surfaceHolder == null) {
                    return;
                }
                CusPlayerView.this.f32554g = surfaceHolder;
                CusPlayerView.this.f32548a.a(surfaceHolder);
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceDestroyed ");
                CusPlayerView.this.f32551d = true;
                CusPlayerView.this.f32553f = true;
                CusPlayerView.this.f32548a.m();
                CusPlayerView.this.pauseOmsdk();
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        public /* synthetic */ c(CusPlayerView cusPlayerView, a aVar) {
            this();
        }
    }

    public CusPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32550c = false;
        this.f32551d = false;
        this.f32552e = false;
        this.f32553f = false;
        this.f32557j = 1;
        this.f32558k = false;
        this.f32559m = "";
        this.f32560n = 1;
        this.f32563q = false;
        this.f32564r = false;
        this.f32565s = true;
        this.f32567u = false;
        this.f32568v = new b();
        b();
    }

    private boolean e() {
        int i10;
        try {
            if (this.f32561o == null) {
                q0.b("PlayerView", "AudioManager is null, cannot request audio focus");
                return false;
            }
            boolean z10 = true;
            if (this.f32564r) {
                q0.c("PlayerView", "Requesting audio focus with mix mode (AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)");
                i10 = 3;
            } else {
                q0.c("PlayerView", "Requesting audio focus without mix mode (AUDIOFOCUS_GAIN)");
                i10 = 1;
            }
            if (this.f32561o.requestAudioFocus(this.f32562p, 3, i10) != 1) {
                z10 = false;
            }
            this.f32563q = z10;
            return z10;
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("Error requesting audio focus: "), "PlayerView");
            return false;
        }
    }

    public void closeSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
        if (bVar != null) {
            bVar.j();
        }
    }

    public void coverUnlockResume() {
        try {
            if (this.f32548a != null) {
                q0.c("PlayerView", "coverUnlockResume========");
                if (this.f32548a.f() && !this.f32553f) {
                    start(true);
                    return;
                }
                playVideo(0);
            }
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
        }
    }

    public int getCurPosition() {
        long jC;
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
            jC = bVar != null ? bVar.c() : 0L;
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
        return Math.toIntExact(jC);
    }

    public int getDuration() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
        if (bVar != null) {
            return bVar.d();
        }
        return 0;
    }

    public String getSelfTag() {
        return this.f32559m;
    }

    public MediaEvents getVideoEvents() {
        return this.l;
    }

    public float getVolume() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
        return bVar != null ? bVar.e() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void initBufferIngParam(int i10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
        if (bVar != null) {
            bVar.b(i10);
        }
    }

    public boolean initVFPData(String str, String str2, com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        if (TextUtils.isEmpty(str)) {
            q0.c("PlayerView", "playUrl==null");
            return false;
        }
        this.f32549b = str;
        this.f32548a.a(aVar);
        this.f32548a.c(this.f32549b);
        this.f32550c = true;
        return true;
    }

    public boolean isComplete() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
            return bVar != null && bVar.g();
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage(), th2);
            return false;
        }
    }

    public boolean isMixWithOtherAudio() {
        return this.f32564r;
    }

    public boolean isPlayIng() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
            if (bVar != null) {
                return bVar.h();
            }
            return false;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
            return false;
        }
    }

    public boolean isPlayWithoutAudioFocus() {
        return this.f32565s;
    }

    public boolean isSilent() {
        return this.f32548a.i();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f32555h = motionEvent.getRawX();
        this.f32556i = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        try {
            pause();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void onResume() {
        try {
            if (this.f32548a == null || this.f32551d || isComplete() || this.f32552e) {
                return;
            }
            q0.c("PlayerView", "onresume========");
            if (this.f32548a.f()) {
                resumeStart();
            } else {
                playVideo(0);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void openSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
        if (bVar != null) {
            bVar.t();
        }
    }

    public void pause() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
            if (bVar != null) {
                bVar.m();
            }
            this.f32567u = false;
            pauseOmsdk();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void pauseOmsdk() {
        try {
            if (this.l == null || this.f32558k) {
                return;
            }
            q0.a("omsdk", "play view:  pause");
            this.f32558k = true;
            this.l.pause();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean playVideo(int i10) {
        try {
            if (this.f32548a == null) {
                q0.c("PlayerView", "player init error 播放失败");
                return false;
            }
            if (!this.f32550c) {
                q0.c("PlayerView", "vfp init failed 播放失败");
                return false;
            }
            if (e()) {
                this.f32548a.t();
            } else {
                q0.d("PlayerView", "Audio focus request denied");
                if (this.f32565s) {
                    q0.c("PlayerView", "Continuing playback without audio");
                    this.f32548a.j();
                }
            }
            this.f32548a.a(i10);
            this.f32567u = true;
            this.f32553f = false;
            return true;
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage(), th2);
            return false;
        }
    }

    public void prepare() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
            if (bVar != null) {
                bVar.o();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void release() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
            if (bVar != null) {
                bVar.p();
            }
            if (this.l != null) {
                this.l = null;
            }
            a();
            if (this.f32554g != null) {
                q0.b("PlayerView", "mSurfaceHolder release");
                this.f32554g.getSurface().release();
            }
        } catch (Throwable th2) {
            q0.b("PlayerView", th2.getMessage());
        }
    }

    public void resumeOMSDK() {
        try {
            MediaEvents mediaEvents = this.l;
            if (mediaEvents != null) {
                this.f32558k = false;
                mediaEvents.resume();
                q0.a("omsdk", "play view:  resume");
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public void resumeStart() {
        try {
            if (e()) {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
                if (bVar != null) {
                    bVar.t();
                }
            } else {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f32548a;
                if (bVar2 != null) {
                    bVar2.j();
                }
            }
            start(true);
            resumeOMSDK();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekTo(int i10) {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
            if (bVar != null) {
                bVar.a(i10);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekToEndFrame() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
        if (bVar != null) {
            bVar.q();
        }
    }

    public void setIsCovered(boolean z10) {
        try {
            this.f32552e = z10;
            q0.b("PlayerView", "mIsCovered:" + z10);
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void setMixWithOtherAudio(int i10) {
        this.f32564r = i10 == 1;
    }

    public void setPlayWithoutAudioFocus(boolean z10) {
        this.f32565s = z10;
        q0.c("PlayerView", "setPlayWithoutAudioFocus: " + z10);
    }

    public void setPlaybackParams(float f10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
        if (bVar != null) {
            bVar.a(f10);
        }
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f32559m = SameMD5.getMD5(str);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.l = mediaEvents;
    }

    public void setVideoGravity(int i10) {
        if (this.f32560n == i10) {
            return;
        }
        this.f32560n = i10;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f32566t;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i10);
        }
    }

    public void setVolume(float f10, float f11) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
        if (bVar != null) {
            bVar.a(f10, f11);
        }
    }

    public void start(boolean z10) {
        try {
            if (this.f32548a != null) {
                this.f32567u = true;
                if (z10) {
                    if (e()) {
                        this.f32548a.t();
                    } else {
                        this.f32548a.j();
                    }
                }
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
                if (bVar == null || this.f32552e) {
                    return;
                }
                bVar.n();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void stop() {
        try {
            this.f32567u = false;
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
            if (bVar != null) {
                bVar.s();
            }
            if (this.l != null) {
                this.l = null;
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    private void c() {
        try {
            this.f32561o = (AudioManager) getContext().getSystemService("audio");
            this.f32562p = new a();
            q0.c("PlayerView", "AudioManager initialized");
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("Failed to initialize AudioManager: "), "PlayerView");
        }
    }

    private void d() {
        this.f32566t = new AspectRatioFrameLayout(getContext());
        SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
        SurfaceHolder holder = surfaceView.getHolder();
        this.f32554g = holder;
        holder.setKeepScreenOn(true);
        this.f32554g.addCallback(new c(this, null));
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = new com.mbridge.msdk.config.dynamic.baseview.video.b();
        this.f32548a = bVar;
        bVar.a(getContext(), this.f32554g);
        this.f32548a.a(this.f32568v);
        this.f32566t.addView(surfaceView, -1, -1);
        setGravity(17);
        this.f32566t.setVisibility(4);
        addView(this.f32566t, -1, -1);
    }

    private void b() {
        try {
            d();
            c();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        try {
            if (i10 == -3) {
                q0.c("PlayerView", "Audio focus lost transient can duck");
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f32548a;
                if (bVar != null) {
                    bVar.a(0.3f, 0.3f);
                    return;
                }
                return;
            }
            if (i10 == -2) {
                q0.c("PlayerView", "Audio focus lost transient");
                this.f32563q = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f32548a;
                if (bVar2 == null || !bVar2.h()) {
                    return;
                }
                this.f32548a.m();
                return;
            }
            if (i10 == -1) {
                q0.c("PlayerView", "Audio focus lost");
                this.f32563q = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar3 = this.f32548a;
                if (bVar3 == null || !bVar3.h()) {
                    return;
                }
                this.f32548a.m();
                return;
            }
            if (i10 != 1) {
                return;
            }
            q0.c("PlayerView", "Audio focus gained");
            this.f32563q = true;
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar4 = this.f32548a;
            if (bVar4 != null) {
                bVar4.a(1.0f, 1.0f);
                if (this.f32548a.h()) {
                    return;
                }
                this.f32548a.n();
            }
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("Error handling audio focus change: "), "PlayerView");
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements com.mbridge.msdk.config.dynamic.baseview.video.c {
        public b() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.c
        public void a(float f10) {
            if (CusPlayerView.this.f32566t != null) {
                CusPlayerView.this.f32566t.setAspectRatio(f10);
                if (CusPlayerView.this.f32566t.getVisibility() != 0) {
                    CusPlayerView.this.f32566t.setVisibility(0);
                }
            }
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.c
        public void onRenderedFirstFrame() {
        }
    }

    private void a() {
        try {
            AudioManager audioManager = this.f32561o;
            if (audioManager == null || !this.f32563q) {
                return;
            }
            int iAbandonAudioFocus = audioManager.abandonAudioFocus(this.f32562p);
            this.f32563q = false;
            q0.c("PlayerView", "Audio focus abandoned, result: " + iAbandonAudioFocus);
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("Error abandoning audio focus: "), "PlayerView");
        }
    }
}
