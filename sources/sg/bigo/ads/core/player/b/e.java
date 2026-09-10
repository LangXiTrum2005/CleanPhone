package sg.bigo.ads.core.player.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p004ironsource.d9;
import java.util.HashMap;
import java.util.Objects;
import sg.bigo.ads.R;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.utils.s;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends f implements c.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f48806A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f48807B;
    private int C;
    private boolean D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f48808E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f48809F;
    private long G;
    private String H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private String f48810I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f48811J;
    private boolean K;
    private View L;
    private b M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f48812N;
    private final View.OnClickListener O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Runnable f48813P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f48814a;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f48815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f48816i;
    private ImageView j;
    private ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AdImageView f48817l;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ProgressBar f48818n;
    private View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private c f48819p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f48820u;
    private long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Runnable f48821w;
    private Runnable x;
    private boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f48822z;

    public e(Context context, int i2, int i3, sg.bigo.ads.api.c.b bVar, sg.bigo.ads.core.a.a aVar) {
        sg.bigo.ads.core.a.a aVar2;
        super(context, bVar, aVar);
        this.f48819p = new c();
        this.q = 0;
        this.r = 0;
        this.s = true;
        this.y = false;
        this.f48822z = true;
        this.f48806A = false;
        this.f48807B = false;
        this.D = false;
        this.G = 0L;
        this.H = "";
        this.f48810I = "";
        this.f48811J = true;
        this.K = false;
        TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: sg.bigo.ads.core.player.b.e.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f48824b = SystemClock.elapsedRealtime();

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onSurfaceTextureAvailable");
                sg.bigo.ads.common.n.d.a(e.this.x);
                e.this.a(13, SystemClock.elapsedRealtime() - this.f48824b, 0);
                e.this.G = SystemClock.elapsedRealtime();
                e.this.f48819p.a(new Surface(surfaceTexture));
                sg.bigo.ads.core.a.a aVar3 = e.this.f48832e;
                if (aVar3 != null && aVar3.aZ()) {
                    e.this.f48819p.a(e.this.m);
                    e.d(e.this);
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "real video is not ready, begin to load backup image");
                sg.bigo.ads.core.a.a aVar4 = e.this.f48832e;
                if (aVar4 == null || aVar4.bh() == null) {
                    e.g(e.this);
                    return;
                }
                Pair<Bitmap, String> pairBh = e.this.f48832e.bh();
                if (pairBh != null) {
                    e.this.a(pairBh.first);
                    if (e.this.M != null) {
                        e.this.M.a((Bitmap) pairBh.first);
                    }
                }
                e.this.w();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                sg.bigo.ads.common.t.a.b("VideoPlayView", "onSurfaceTextureDestroyed");
                e.this.d(false);
                c cVar = e.this.f48819p;
                try {
                    if (!c.f48788h.get()) {
                        cVar.f48789a.reset();
                    }
                    sg.bigo.ads.common.n.d.a(cVar.g);
                } catch (IllegalStateException e2) {
                    c.a aVar3 = cVar.f48791c;
                    if (aVar3 != null) {
                        aVar3.a(11, Log.getStackTraceString(e2), cVar.f48793i);
                    }
                    sg.bigo.ads.common.t.a.a(0, "MediaPlayerWrapper", "reset IllegalStateException");
                }
                cVar.f = false;
                cVar.f48792e = false;
                if (!e.this.t) {
                    e eVar = e.this;
                    eVar.f = false;
                    if (eVar.q > 0) {
                        e eVar2 = e.this;
                        eVar2.r = eVar2.q;
                    }
                }
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
                sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onSurfaceTextureSizeChanged");
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.f48812N = surfaceTextureListener;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: sg.bigo.ads.core.player.b.e.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (view.getId()) {
                    case 200011:
                        e.this.o();
                        break;
                    case 200012:
                        if (!e.this.f48809F || !e.this.f48807B) {
                            e.this.v();
                        }
                        break;
                }
            }
        };
        this.O = onClickListener;
        this.f48814a = 0;
        this.f48813P = new Runnable() { // from class: sg.bigo.ads.core.player.b.e.5
            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.k != null) {
                    e.this.k.setVisibility(8);
                }
            }
        };
        this.f48810I = aVar != null ? aVar.aT() : "";
        if (aVar != null && aVar.bm() != null) {
            this.H = aVar.bm().f48474b;
        }
        w();
        this.v = bVar.f;
        this.t = bVar.f47010e;
        this.g = i2;
        this.f48815h = i3;
        int i4 = bVar.f47007a;
        this.f48820u = bVar.f47008b;
        g gVar = new g(this.f48831c, i2, i3, i4);
        this.f48816i = gVar;
        u.a(gVar, this, null, -1);
        this.f48816i.setSurfaceTextureListener(surfaceTextureListener);
        sg.bigo.ads.core.a.a aVar3 = this.f48832e;
        if (aVar3 != null && aVar3.x() != 2 && y()) {
            sg.bigo.ads.common.n.d.a(this.x);
            if (this.x == null) {
                this.x = new Runnable() { // from class: sg.bigo.ads.core.player.b.e.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.x();
                        sg.bigo.ads.core.a.a aVar4 = e.this.f48832e;
                        sg.bigo.ads.core.d.b.a(aVar4, aVar4 != null ? aVar4.aK() : "", 13, "onSurfaceTextureAvailable not called", 0);
                        e.this.a("AdVideoTooLate", new int[]{10311});
                    }
                };
            }
            sg.bigo.ads.common.n.d.a(2, this.x, this.v);
        }
        if (!bVar.g && (aVar2 = this.f48832e) != null && !TextUtils.isEmpty(aVar2.aN())) {
            a(o.b(getContext().getApplicationContext(), this.f48832e.aN()));
        }
        this.s = this.f48819p.a(bVar.d);
        if (!bVar.f47009c) {
            int iB = sg.bigo.ads.common.utils.a.b(this.f48831c, R.dimen.bigo_ad_volume_padding);
            ImageView imageView = new ImageView(this.f48831c);
            this.j = imageView;
            imageView.setId(200011);
            this.j.setOnClickListener(onClickListener);
            this.j.setPadding(iB, iB, iB, iB);
            this.j.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f48831c, this.s ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
            int iB2 = (iB * 2) + sg.bigo.ads.common.utils.a.b(this.f48831c, R.dimen.bigo_ad_volume_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iB2, iB2, 85);
            layoutParams.rightMargin = iB;
            layoutParams.bottomMargin = iB;
            this.j.setVisibility(0);
            u.a(this.j, this, layoutParams, -1);
        }
        sg.bigo.ads.core.a.a aVar4 = this.f48832e;
        boolean z2 = aVar4 != null && aVar4.aO();
        this.f48809F = z2;
        if (z2) {
            z();
        }
        int iB3 = sg.bigo.ads.common.utils.a.b(this.f48831c, R.dimen.bigo_ad_replay_size);
        sg.bigo.ads.core.a.a aVar5 = this.f48832e;
        if (aVar5 != null && aVar5.x() == 2 && sg.bigo.ads.api.c.b.b() > 0) {
            iB3 = sg.bigo.ads.common.utils.e.a(this.f48831c, sg.bigo.ads.api.c.b.b());
        }
        ImageView imageView2 = new ImageView(this.f48831c);
        this.k = imageView2;
        imageView2.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f48831c, R.drawable.bigo_ad_ic_media_play));
        this.k.setVisibility(this.t ? 0 : 8);
        u.a(this.k, this, new FrameLayout.LayoutParams(iB3, iB3, 17), -1);
        this.f48819p.f48791c = this;
        setId(200012);
        setOnClickListener(onClickListener);
        b(0);
    }

    private void A() {
        if (this.f48818n == null) {
            z();
        }
        this.f48818n.setVisibility(8);
    }

    private void B() {
        if (this.o == null) {
            this.o = sg.bigo.ads.common.utils.a.a(getContext(), R.layout.bigo_ad_default_loading_layout, null, false);
        }
        View view = this.o;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        sg.bigo.ads.core.a.a aVar;
        int i2;
        sg.bigo.ads.core.a.a aVar2 = this.f48832e;
        if (aVar2 == null) {
            return;
        }
        Pair<Bitmap, String> pairBh = aVar2.bh();
        if (this.f48832e.aZ()) {
            aVar = this.f48832e;
            i2 = 0;
        } else if (pairBh == null) {
            aVar = this.f48832e;
            i2 = 5;
        } else if (Objects.equals(pairBh.second, this.H)) {
            aVar = this.f48832e;
            i2 = 1;
        } else {
            if (!Objects.equals(pairBh.second, this.f48810I)) {
                return;
            }
            aVar = this.f48832e;
            i2 = 2;
        }
        aVar.j(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.f48819p.d();
        this.f48819p.e();
    }

    private boolean y() {
        return this.v > 0;
    }

    private void z() {
        Context context = getContext();
        ProgressBar progressBar = new ProgressBar(context);
        this.f48818n = progressBar;
        progressBar.setBackgroundColor(sg.bigo.ads.common.utils.a.c(context, android.R.color.transparent));
        s.a(context, this.f48818n, R.drawable.bigo_ad_progressbar_white);
        this.f48818n.setVisibility(8);
        u.a(this.f48818n, this, new FrameLayout.LayoutParams(-2, -2, 17), -1);
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "destroy player");
        d(false);
        x();
        setOnEventListener(null);
        this.f48818n = null;
        sg.bigo.ads.common.n.d.a(this.f48821w);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void e_() {
        a("AdVideoStart", (int[]) null);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void f() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onPlay");
        this.t = false;
        int i2 = this.r;
        if (i2 > 0) {
            this.f48819p.a(i2);
            this.r = -1;
        }
        a("AdVideoPlaying", (int[]) null);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void g() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", d9.h.t0);
        a("AdVideoPaused", (int[]) null);
    }

    public final int getAdDuration() {
        return this.f48819p.f();
    }

    public final int getAdRemainingTime() {
        return this.f48819p.c();
    }

    public final ImageView getCoverView() {
        return this.f48817l;
    }

    public final int getCurrentPos() {
        return this.q;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final int getPlayStatus() {
        return this.f48819p.d;
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void h() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onStop");
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void j() {
        this.t = true;
        AdImageView adImageView = this.f48817l;
        if (adImageView != null) {
            adImageView.setVisibility(0);
        }
        this.k.setVisibility(this.f48820u ? 8 : 0);
        this.k.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f48831c, R.drawable.bigo_ad_ic_media_play));
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onCompletion play");
        d(false);
        a("AdVideoComplete", (int[]) null);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void k() {
        a("AdSizeChange", (int[]) null);
    }

    public final void l() {
        g gVar;
        if (this.f48832e == null || (gVar = this.f48816i) == null || !gVar.isAvailable() || this.K || this.f48832e.bh() == null || this.f48832e.bb()) {
            return;
        }
        Bitmap bitmap = (Bitmap) this.f48832e.bh().first;
        this.K = true;
        B();
        a(bitmap);
        c cVar = this.f48819p;
        a("AdBackupImgReady", new int[]{(cVar == null || TextUtils.isEmpty(cVar.f48790b)) ? 0 : 1});
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final boolean n() {
        return this.f48811J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onDetachedFromWindow called");
        d(false);
        this.f48818n = null;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 != 0) {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onVisibilityChanged visibility != VISIBLE");
            d(false);
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onVisibilityChanged visibility == VISIBLE");
            d(true);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        super.onWindowVisibilityChanged(i2);
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onWindowVisibilityChanged: ".concat(String.valueOf(i2)));
        View view2 = this.L;
        if (view2 != null) {
            if (i2 == 0) {
                u.b(view2);
                view = this.f48816i;
                layoutParams = null;
            } else {
                u.b(this.f48816i);
                view = this.L;
                layoutParams = new FrameLayout.LayoutParams(this.g, this.f48815h);
            }
            u.a(view, this, layoutParams, 0);
        }
    }

    public final void setIVideoPlayerViewListener(b bVar) {
        this.M = bVar;
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void setMute(boolean z2) {
        if (this.s == z2) {
            this.f48822z = false;
            return;
        }
        boolean zA = this.f48819p.a(z2);
        this.s = zA;
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f48831c, zA ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
        }
        if (!this.f48822z && !this.f48806A) {
            a("AdVolumeChange", new int[]{this.s ? 0 : 100});
        } else {
            this.f48822z = false;
            this.f48806A = false;
        }
    }

    public final void setPlayInfo$505cff1c(String str) {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", android.support.v4.media.a.n("setPlayInfo path=", str, ",position=0"));
        this.m = str;
        this.q = 0;
    }

    public final void setSeekPos(int i2) {
        this.r = i2;
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final void setStatPrepareEventOnce(boolean z2) {
        this.f48811J = z2;
    }

    public static /* synthetic */ void d(e eVar) {
        if (eVar.y()) {
            sg.bigo.ads.common.n.d.a(eVar.f48821w);
            if (eVar.f48821w == null) {
                eVar.f48821w = new Runnable() { // from class: sg.bigo.ads.core.player.b.e.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.x();
                        e.this.a("AdVideoTooLate", new int[]{10107});
                    }
                };
            }
            sg.bigo.ads.common.n.d.a(2, eVar.f48821w, eVar.v);
        }
    }

    public static /* synthetic */ void g(e eVar) {
        if (eVar.o == null) {
            eVar.o = sg.bigo.ads.common.utils.a.a(eVar.getContext(), R.layout.bigo_ad_default_loading_layout, null, false);
        }
        View view = eVar.o;
        if (view != null) {
            u.a(view, eVar, new FrameLayout.LayoutParams(-2, -2, 17), -1);
            eVar.o.setVisibility(0);
        }
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final boolean c() {
        return this.s;
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final boolean e() {
        return this.f48819p.f48792e;
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void i() {
        String str;
        int adRemainingTime = getAdRemainingTime();
        if (this.f48809F && (str = this.m) != null && !str.startsWith("file:")) {
            if (this.C == adRemainingTime) {
                if (!this.D) {
                    if (this.f48818n == null) {
                        z();
                    }
                    this.f48818n.setVisibility(0);
                    sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onBuffering");
                    this.f48807B = true;
                    a("AdVideoBuffering", (int[]) null);
                }
                this.D = true;
            } else {
                if (this.D) {
                    A();
                    sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "onBuffered");
                    this.f48807B = false;
                    a("AdVideoBuffered", (int[]) null);
                }
                this.D = false;
            }
            this.C = adRemainingTime;
        }
        if (this.f48808E <= 0) {
            int adDuration = getAdDuration();
            this.f48808E = adDuration;
            if (adDuration <= 0) {
                return;
            }
        }
        int i2 = this.f48808E;
        if (adRemainingTime > i2) {
            adRemainingTime = i2;
        }
        this.q = adRemainingTime;
        a("AdRemainingTimeChange", new int[]{adRemainingTime, i2, (int) ((adRemainingTime * 100.0f) / i2)});
    }

    public final void m() {
        g gVar;
        if (this.f48832e == null || (gVar = this.f48816i) == null || this.K || !gVar.isAvailable() || this.f48832e.bb()) {
            return;
        }
        this.K = true;
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "real video is download success, update media player datasource:  " + this.f48832e.c(getContext()));
        this.f48819p.a(this.f48832e.c(getContext().getApplicationContext()));
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        c cVar = this.f48819p;
        if (cVar.f48792e && cVar.b()) {
            this.y = false;
            if (this.f48809F) {
                A();
            }
            this.D = false;
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "pauseAd called");
        }
    }

    @Override // sg.bigo.ads.core.player.b.a
    public final void b() {
        if (this.f || this.t) {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "tryStartAd, video is completed play, unregister it from list");
            d(false);
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayView", "try start play video ad");
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, long j, int i3) {
        sg.bigo.ads.core.a.a aVar = this.f48832e;
        sg.bigo.ads.core.d.b.a(aVar, aVar != null ? aVar.aK() : "", i2, j, i3);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void a(int i2, String str, int i3) {
        sg.bigo.ads.core.a.a aVar = this.f48832e;
        sg.bigo.ads.core.d.b.a(aVar, aVar != null ? aVar.aK() : "", i2, str, i3);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final void a(MediaPlayer mediaPlayer, int i2) {
        sg.bigo.ads.common.n.d.a(this.f48821w);
        A();
        B();
        boolean z2 = this.g == 0 && this.f48815h == 0;
        this.g = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f48815h = videoHeight;
        if (this.K || (z2 && this.g > 0 && videoHeight > 0)) {
            g gVar = this.f48816i;
            gVar.f48837a = this.g;
            gVar.f48838b = videoHeight;
            gVar.requestLayout();
        }
        new HashMap();
        if (this.G > 0) {
            a(10, SystemClock.elapsedRealtime() - this.G, i2);
            this.G = 0L;
        }
        if (this.f48811J) {
            b(18);
        }
        if (this.y || y()) {
            this.y = false;
            b();
        } else {
            if (this.f || this.t) {
                return;
            }
            d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> void a(T t) {
        if (t == 0) {
            return;
        }
        if (this.f48817l == null) {
            AdImageView adImageView = new AdImageView(this.f48831c);
            this.f48817l = adImageView;
            adImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        u.a(this.f48817l, this, new FrameLayout.LayoutParams(-1, -1, 17), -1);
        boolean z2 = false;
        if (t instanceof String) {
            String str = (String) t;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f48817l.setVisibility(0);
            AdImageView adImageView2 = this.f48817l;
            sg.bigo.ads.core.a.a aVar = this.f48832e;
            if (aVar != null && aVar.al()) {
                z2 = true;
            }
            adImageView2.a(str, z2);
            return;
        }
        if (t instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) t;
            this.f48817l.setVisibility(0);
            this.f48817l.setImageBitmap(bitmap);
            ImageView imageView = this.j;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            this.f48816i.f48837a = bitmap.getWidth();
            this.f48816i.f48838b = bitmap.getHeight();
            this.f48816i.requestLayout();
        }
    }

    @Override // sg.bigo.ads.core.player.b.f
    public final void a(boolean z2) {
        super.a(z2);
        this.f = false;
        if (!this.f48819p.f48792e) {
            sg.bigo.ads.common.t.a.b("VideoPlayView", "incorrect status, the player is not prepared".concat(z2 ? " wating to play" : ", start ad failed"));
            this.y = z2;
            int i2 = this.f48814a;
            if (i2 < 8) {
                int i3 = i2 + 1;
                this.f48814a = i3;
                if (i3 == 8) {
                    sg.bigo.ads.core.d.b.a(this.f48832e, 3003, 10107, "Not prepared, src path = " + this.m);
                    return;
                }
                return;
            }
            return;
        }
        if (!sg.bigo.ads.common.aa.b.a(getContext().getApplicationContext())) {
            sg.bigo.ads.common.t.a.b("VideoPlayView", "screen is off, start ad cancel");
            return;
        }
        if (this.f48819p.a()) {
            this.f48808E = getAdDuration();
            sg.bigo.ads.core.a.a aVar = this.f48832e;
            if (aVar != null) {
                aVar.j(0);
            }
        }
        AdImageView adImageView = this.f48817l;
        if (adImageView != null) {
            adImageView.setVisibility(8);
        }
        this.k.setVisibility(8);
        d(true);
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final boolean a(int i2) {
        sg.bigo.ads.common.t.a.a("VideoPlayView", "onInfo called, whatInfo = ".concat(String.valueOf(i2)));
        if (i2 == 3) {
            sg.bigo.ads.common.t.a.a("VideoPlayView", "player pushed first video frame for rendering, video started");
            AdImageView adImageView = this.f48817l;
            if (adImageView != null) {
                adImageView.setVisibility(8);
            }
            ImageView imageView = this.j;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.core.player.b.c.a
    public final boolean a(int i2, int i3) {
        if (i2 == 100) {
            this.f48819p.e();
            this.f48819p = new c();
        }
        sg.bigo.ads.common.t.a.a(2, "VideoPlayView", "An error occurred during the video playback: ".concat(String.valueOf(i2)));
        a("AdError", new int[]{i2, i3});
        if (i2 == -38) {
            sg.bigo.ads.common.t.a.a(0, "VideoPlayView", "onError code = -38, now reset status and init again.Range=" + this.q);
            this.f48819p.a(this.m);
            return true;
        }
        StringBuilder sbU = android.support.v4.media.a.u(i2, "onError code = ", ", now reset status and init again.Range=");
        sbU.append(this.q);
        sg.bigo.ads.common.t.a.a(0, "VideoPlayView", sbU.toString());
        if (this.f48819p.c() != 0) {
            return true;
        }
        c cVar = this.f48819p;
        if (cVar.f48793i >= 3) {
            return true;
        }
        cVar.b(15);
        return true;
    }
}
