package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
class a1 extends TextureView implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f8964A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f8965B;
    private boolean C;
    private boolean D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f8966E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private String f8967F;
    private FileInputStream G;
    private h0 H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private com.adcolony.sdk.c f8968I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Surface f8969J;
    private SurfaceTexture K;
    private RectF L;
    private j M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ProgressBar f8970N;
    private MediaPlayer O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private f1 f8971P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private ExecutorService f8972Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private h0 f8973R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f8974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f8975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f8976c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f8977e;
    private float f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f8979i;
    private Paint j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8980l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8981n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8982p;
    private int q;
    private double r;
    private double s;
    private long t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8983u;
    private boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8984w;
    private boolean x;
    private boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f8985z;

    public class a implements j0 {
        public a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a1.this.a(h0Var)) {
                a1.this.i();
            }
        }
    }

    public class b implements j0 {
        public b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a1.this.a(h0Var)) {
                a1.this.c(h0Var);
            }
        }
    }

    public class c implements j0 {
        public c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a1.this.a(h0Var)) {
                a1.this.d(h0Var);
            }
        }
    }

    public class d implements j0 {
        public d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a1.this.a(h0Var)) {
                a1.this.h();
            }
        }
    }

    public class e implements j0 {
        public e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a1.this.a(h0Var)) {
                a1.this.b(h0Var);
            }
        }
    }

    public class f implements j0 {
        public f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a1.this.a(h0Var)) {
                a1.this.e(h0Var);
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(150L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            if (a1.this.f8973R != null) {
                f1 f1VarB = c0.b();
                c0.b(f1VarB, "id", a1.this.o);
                c0.a(f1VarB, "ad_session_id", a1.this.f8967F);
                c0.b(f1VarB, "success", true);
                a1.this.f8973R.a(f1VarB).c();
                a1.this.f8973R = null;
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.t = 0L;
            while (!a1.this.f8983u && !a1.this.x && com.adcolony.sdk.a.c()) {
                Context contextA = com.adcolony.sdk.a.a();
                if (a1.this.f8983u || a1.this.f8985z || contextA == null || !(contextA instanceof Activity)) {
                    return;
                }
                if (a1.this.O.isPlaying()) {
                    if (a1.this.t == 0 && com.adcolony.sdk.a.d) {
                        a1.this.t = System.currentTimeMillis();
                    }
                    a1.this.f8984w = true;
                    a1 a1Var = a1.this;
                    a1Var.r = ((double) a1Var.O.getCurrentPosition()) / 1000.0d;
                    a1 a1Var2 = a1.this;
                    a1Var2.s = ((double) a1Var2.O.getDuration()) / 1000.0d;
                    if (System.currentTimeMillis() - a1.this.t > 1000 && !a1.this.C && com.adcolony.sdk.a.d) {
                        if (a1.this.r == 0.0d) {
                            new e0.a().a("getCurrentPosition() not working, firing ").a("AdSession.on_error").a(e0.f9132i);
                            a1.this.g();
                        } else {
                            a1.this.C = true;
                        }
                    }
                    if (a1.this.f8965B) {
                        a1.this.e();
                    }
                }
                if (a1.this.f8984w && !a1.this.f8983u && !a1.this.x) {
                    c0.b(a1.this.f8971P, "id", a1.this.o);
                    c0.b(a1.this.f8971P, "container_id", a1.this.f8968I.c());
                    c0.a(a1.this.f8971P, "ad_session_id", a1.this.f8967F);
                    c0.a(a1.this.f8971P, "elapsed", a1.this.r);
                    c0.a(a1.this.f8971P, "duration", a1.this.s);
                    new h0("VideoView.on_progress", a1.this.f8968I.k(), a1.this.f8971P).c();
                }
                if (a1.this.v || ((Activity) contextA).isFinishing()) {
                    a1.this.v = false;
                    a1.this.j();
                    return;
                } else {
                    try {
                        Thread.sleep(50L);
                    } catch (InterruptedException unused) {
                        a1.this.g();
                        new e0.a().a("InterruptedException in ADCVideoView's update thread.").a(e0.f9131h);
                    }
                }
            }
            if (a1.this.v) {
                a1.this.j();
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f8994a;

        public i(Context context) {
            this.f8994a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.M = a1.this.new j(this.f8994a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (a1.this.f8976c * 4.0f), (int) (a1.this.f8976c * 4.0f));
            layoutParams.setMargins(0, a1.this.f8968I.b() - ((int) (a1.this.f8976c * 4.0f)), 0, 0);
            layoutParams.gravity = 0;
            a1.this.f8968I.addView(a1.this.M, layoutParams);
        }
    }

    public class j extends View {
        public j(Context context) {
            super(context);
            setWillNotDraw(false);
            try {
                j.class.getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(this, 1, null);
            } catch (Exception unused) {
            }
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawArc(a1.this.L, 270.0f, a1.this.d, false, a1.this.f8979i);
            canvas.drawText("" + a1.this.g, a1.this.L.centerX(), (float) ((((double) a1.this.j.getFontMetrics().bottom) * 1.35d) + ((double) a1.this.L.centerY())), a1.this.j);
            invalidate();
        }
    }

    public a1(Context context, h0 h0Var, int i2, com.adcolony.sdk.c cVar) {
        super(context);
        this.f8978h = true;
        this.f8979i = new Paint();
        this.j = new Paint(1);
        this.L = new RectF();
        this.f8971P = c0.b();
        this.f8972Q = Executors.newSingleThreadExecutor();
        this.f8968I = cVar;
        this.H = h0Var;
        this.o = i2;
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f8983u = true;
        this.r = this.s;
        c0.b(this.f8971P, "id", this.o);
        c0.b(this.f8971P, "container_id", this.f8968I.c());
        c0.a(this.f8971P, "ad_session_id", this.f8967F);
        c0.a(this.f8971P, "elapsed", this.r);
        c0.a(this.f8971P, "duration", this.s);
        new h0("VideoView.on_progress", this.f8968I.k(), this.f8971P).c();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        g();
        new e0.a().a(android.support.v4.media.a.g(i2, i3, "MediaPlayer error: ", ",")).a(e0.f9131h);
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        l();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.y = true;
        if (this.D) {
            this.f8968I.removeView(this.f8970N);
        }
        if (this.f8964A) {
            this.f8982p = mediaPlayer.getVideoWidth();
            this.q = mediaPlayer.getVideoHeight();
            l();
            new e0.a().a("MediaPlayer getVideoWidth = ").a(mediaPlayer.getVideoWidth()).a(e0.f9130e);
            new e0.a().a("MediaPlayer getVideoHeight = ").a(mediaPlayer.getVideoHeight()).a(e0.f9130e);
        }
        f1 f1VarB = c0.b();
        c0.b(f1VarB, "id", this.o);
        c0.b(f1VarB, "container_id", this.f8968I.c());
        c0.a(f1VarB, "ad_session_id", this.f8967F);
        new h0("VideoView.on_ready", this.f8968I.k(), f1VarB).c();
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        ExecutorService executorService = this.f8972Q;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        try {
            this.f8972Q.submit(new g());
        } catch (RejectedExecutionException unused) {
            g();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (surfaceTexture == null || this.f8985z) {
            new e0.a().a("Null texture provided by system's onSurfaceTextureAvailable or ").a("MediaPlayer has been destroyed.").a(e0.f9132i);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        this.f8969J = surface;
        try {
            this.O.setSurface(surface);
        } catch (IllegalStateException unused) {
            new e0.a().a("IllegalStateException thrown when calling MediaPlayer.setSurface()").a(e0.f9131h);
            g();
        }
        this.K = surfaceTexture;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.K = surfaceTexture;
        if (!this.f8985z) {
            return false;
        }
        surfaceTexture.release();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.K = surfaceTexture;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.K = surfaceTexture;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k kVarB = com.adcolony.sdk.a.b();
        com.adcolony.sdk.d dVarC = kVarB.c();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        f1 f1VarB = c0.b();
        c0.b(f1VarB, "view_id", this.o);
        c0.a(f1VarB, "ad_session_id", this.f8967F);
        c0.b(f1VarB, "container_x", this.k + x);
        c0.b(f1VarB, "container_y", this.f8980l + y);
        c0.b(f1VarB, "view_x", x);
        c0.b(f1VarB, "view_y", y);
        c0.b(f1VarB, "id", this.f8968I.c());
        if (action == 0) {
            new h0("AdContainer.on_touch_began", this.f8968I.k(), f1VarB).c();
        } else if (action == 1) {
            if (!this.f8968I.p()) {
                kVarB.a(dVarC.d().get(this.f8967F));
            }
            new h0("AdContainer.on_touch_ended", this.f8968I.k(), f1VarB).c();
        } else if (action == 2) {
            new h0("AdContainer.on_touch_moved", this.f8968I.k(), f1VarB).c();
        } else if (action == 3) {
            new h0("AdContainer.on_touch_cancelled", this.f8968I.k(), f1VarB).c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            c0.b(f1VarB, "container_x", ((int) motionEvent.getX(action2)) + this.k);
            c0.b(f1VarB, "container_y", ((int) motionEvent.getY(action2)) + this.f8980l);
            c0.b(f1VarB, "view_x", (int) motionEvent.getX(action2));
            c0.b(f1VarB, "view_y", (int) motionEvent.getY(action2));
            new h0("AdContainer.on_touch_began", this.f8968I.k(), f1VarB).c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            c0.b(f1VarB, "container_x", ((int) motionEvent.getX(action3)) + this.k);
            c0.b(f1VarB, "container_y", ((int) motionEvent.getY(action3)) + this.f8980l);
            c0.b(f1VarB, "view_x", (int) motionEvent.getX(action3));
            c0.b(f1VarB, "view_y", (int) motionEvent.getY(action3));
            if (!this.f8968I.p()) {
                kVarB.a(dVarC.d().get(this.f8967F));
            }
            new h0("AdContainer.on_touch_ended", this.f8968I.k(), f1VarB).c();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "id", this.f8967F);
        new h0("AdSession.on_error", this.f8968I.k(), f1VarB).c();
        this.f8983u = true;
    }

    private void l() {
        double dMin = Math.min(((double) this.m) / ((double) this.f8982p), ((double) this.f8981n) / ((double) this.q));
        int i2 = (int) (((double) this.f8982p) * dMin);
        int i3 = (int) (((double) this.q) * dMin);
        new e0.a().a("setMeasuredDimension to ").a(i2).a(" by ").a(i3).a(e0.f9130e);
        setMeasuredDimension(i2, i3);
        if (this.f8964A) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = i3;
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
        }
    }

    private void m() {
        try {
            this.f8972Q.submit(new h());
        } catch (RejectedExecutionException unused) {
            g();
        }
    }

    public boolean h() {
        if (!this.y) {
            new e0.a().a("ADCVideoView pause() called while MediaPlayer is not prepared.").a(e0.g);
            return false;
        }
        if (!this.f8984w) {
            return false;
        }
        this.O.getCurrentPosition();
        this.s = this.O.getDuration();
        this.O.pause();
        this.x = true;
        return true;
    }

    public boolean i() {
        if (!this.y) {
            return false;
        }
        if (!this.x && com.adcolony.sdk.a.d) {
            this.O.start();
            m();
        } else if (!this.f8983u && com.adcolony.sdk.a.d) {
            this.O.start();
            this.x = false;
            if (!this.f8972Q.isShutdown()) {
                m();
            }
            j jVar = this.M;
            if (jVar != null) {
                jVar.invalidate();
            }
        }
        setWillNotDraw(false);
        return true;
    }

    public void j() {
        new e0.a().a("MediaPlayer stopped and released.").a(e0.f9130e);
        try {
            if (!this.f8983u && this.y && this.O.isPlaying()) {
                this.O.stop();
            }
        } catch (IllegalStateException unused) {
            new e0.a().a("Caught IllegalStateException when calling stop on MediaPlayer").a(e0.g);
        }
        ProgressBar progressBar = this.f8970N;
        if (progressBar != null) {
            this.f8968I.removeView(progressBar);
        }
        this.f8983u = true;
        this.y = false;
        this.O.release();
    }

    public void k() {
        this.v = true;
    }

    public void d() {
        Context contextA;
        f1 f1VarA = this.H.a();
        this.f8967F = c0.h(f1VarA, "ad_session_id");
        this.k = c0.d(f1VarA, "x");
        this.f8980l = c0.d(f1VarA, "y");
        this.m = c0.d(f1VarA, "width");
        this.f8981n = c0.d(f1VarA, "height");
        this.f8965B = c0.b(f1VarA, "enable_timer");
        this.D = c0.b(f1VarA, "enable_progress");
        this.f8966E = c0.h(f1VarA, "filepath");
        this.f8982p = c0.d(f1VarA, "video_width");
        this.q = c0.d(f1VarA, "video_height");
        this.f = com.adcolony.sdk.a.b().n().s();
        new e0.a().a("Original video dimensions = ").a(this.f8982p).a("x").a(this.q).a(e0.f9129c);
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.m, this.f8981n);
        layoutParams.setMargins(this.k, this.f8980l, 0, 0);
        layoutParams.gravity = 0;
        this.f8968I.addView(this, layoutParams);
        if (this.D && (contextA = com.adcolony.sdk.a.a()) != null) {
            ProgressBar progressBar = new ProgressBar(contextA);
            this.f8970N = progressBar;
            com.adcolony.sdk.c cVar = this.f8968I;
            int i2 = (int) (this.f * 100.0f);
            cVar.addView(progressBar, new FrameLayout.LayoutParams(i2, i2, 17));
        }
        this.O = new MediaPlayer();
        this.y = false;
        try {
            if (!this.f8966E.startsWith("http")) {
                FileInputStream fileInputStream = new FileInputStream(this.f8966E);
                this.G = fileInputStream;
                this.O.setDataSource(fileInputStream.getFD());
            } else {
                this.f8964A = true;
                this.O.setDataSource(this.f8966E);
            }
            this.O.setOnErrorListener(this);
            this.O.setOnPreparedListener(this);
            this.O.setOnCompletionListener(this);
            this.O.prepareAsync();
        } catch (IOException e2) {
            new e0.a().a("Failed to create/prepare MediaPlayer: ").a(e2.toString()).a(e0.f9131h);
            g();
        }
        this.f8968I.i().add(com.adcolony.sdk.a.a("VideoView.play", (j0) new a(), true));
        this.f8968I.i().add(com.adcolony.sdk.a.a("VideoView.set_bounds", (j0) new b(), true));
        this.f8968I.i().add(com.adcolony.sdk.a.a("VideoView.set_visible", (j0) new c(), true));
        this.f8968I.i().add(com.adcolony.sdk.a.a("VideoView.pause", (j0) new d(), true));
        this.f8968I.i().add(com.adcolony.sdk.a.a("VideoView.seek_to_time", (j0) new e(), true));
        this.f8968I.i().add(com.adcolony.sdk.a.a("VideoView.set_volume", (j0) new f(), true));
        this.f8968I.j().add("VideoView.play");
        this.f8968I.j().add("VideoView.set_bounds");
        this.f8968I.j().add("VideoView.set_visible");
        this.f8968I.j().add("VideoView.pause");
        this.f8968I.j().add("VideoView.seek_to_time");
        this.f8968I.j().add("VideoView.set_volume");
    }

    public void e() {
        if (this.f8978h) {
            this.f8977e = (float) (360.0d / this.s);
            this.j.setColor(-3355444);
            this.j.setShadowLayer((int) (this.f * 2.0f), 0.0f, 0.0f, -16777216);
            this.j.setTextAlign(Paint.Align.CENTER);
            this.j.setLinearText(true);
            this.j.setTextSize(this.f * 12.0f);
            this.f8979i.setStyle(Paint.Style.STROKE);
            float f2 = this.f * 2.0f;
            if (f2 > 6.0f) {
                f2 = 6.0f;
            }
            if (f2 < 4.0f) {
                f2 = 4.0f;
            }
            this.f8979i.setStrokeWidth(f2);
            this.f8979i.setShadowLayer((int) (this.f * 3.0f), 0.0f, 0.0f, -16777216);
            this.f8979i.setColor(-3355444);
            Rect rect = new Rect();
            this.j.getTextBounds("0123456789", 0, 9, rect);
            this.f8976c = rect.height();
            Context contextA = com.adcolony.sdk.a.a();
            if (contextA != null) {
                z0.b(new i(contextA));
            }
            this.f8978h = false;
        }
        this.g = (int) (this.s - this.r);
        float f3 = this.f8976c;
        float f4 = (int) f3;
        this.f8974a = f4;
        float f5 = (int) (3.0f * f3);
        this.f8975b = f5;
        float f6 = f3 / 2.0f;
        float f7 = f3 * 2.0f;
        this.L.set(f4 - f6, f5 - f7, f4 + f7, f5 + f6);
        this.d = (float) ((this.s - this.r) * ((double) this.f8977e));
    }

    public boolean f() {
        return this.f8983u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        this.k = c0.d(f1VarA, "x");
        this.f8980l = c0.d(f1VarA, "y");
        this.m = c0.d(f1VarA, "width");
        this.f8981n = c0.d(f1VarA, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.k, this.f8980l, 0, 0);
        layoutParams.width = this.m;
        layoutParams.height = this.f8981n;
        setLayoutParams(layoutParams);
        if (!this.f8965B || this.M == null) {
            return;
        }
        int i2 = (int) (this.f8976c * 4.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.setMargins(0, this.f8968I.b() - ((int) (this.f8976c * 4.0f)), 0, 0);
        layoutParams2.gravity = 0;
        this.M.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(h0 h0Var) {
        if (!this.y) {
            return false;
        }
        if (this.f8983u) {
            this.f8983u = false;
        }
        this.f8973R = h0Var;
        int iD = c0.d(h0Var.a(), "time");
        int duration = this.O.getDuration() / 1000;
        this.O.setOnSeekCompleteListener(this);
        this.O.seekTo(iD * 1000);
        if (duration == iD) {
            this.f8983u = true;
        }
        return true;
    }

    public void a() {
        if (this.K != null) {
            this.f8985z = true;
        }
        this.f8972Q.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        return c0.d(f1VarA, "id") == this.o && c0.d(f1VarA, "container_id") == this.f8968I.c() && c0.h(f1VarA, "ad_session_id").equals(this.f8968I.a());
    }

    public MediaPlayer b() {
        return this.O;
    }

    public boolean c() {
        return this.O != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(h0 h0Var) {
        if (!this.y) {
            return false;
        }
        float fC = (float) c0.c(h0Var.a(), "volume");
        AdColonyInterstitial adColonyInterstitialJ = com.adcolony.sdk.a.b().j();
        if (adColonyInterstitialJ != null) {
            adColonyInterstitialJ.a(((double) fC) <= 0.0d);
        }
        this.O.setVolume(fC, fC);
        f1 f1VarB = c0.b();
        c0.b(f1VarB, "success", true);
        h0Var.a(f1VarB).c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(h0 h0Var) {
        j jVar;
        j jVar2;
        if (c0.b(h0Var.a(), "visible")) {
            setVisibility(0);
            if (!this.f8965B || (jVar2 = this.M) == null) {
                return;
            }
            jVar2.setVisibility(0);
            return;
        }
        setVisibility(4);
        if (!this.f8965B || (jVar = this.M) == null) {
            return;
        }
        jVar.setVisibility(4);
    }
}
