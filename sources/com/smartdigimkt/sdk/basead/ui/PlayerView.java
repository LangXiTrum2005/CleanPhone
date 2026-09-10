package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.j4.s;
import com.smartdigimkt.m3.j;
import com.smartdigimkt.n4.q;
import com.smartdigimkt.p6.o;
import com.smartdigimkt.p6.p;
import com.smartdigimkt.q4.g;
import com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.w3.d0;
import com.smartdigimkt.w3.w;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PlayerView extends BasePlayerView {
    public static final String TAG = "PlayerView";
    private String A0;
    private String B0;
    private int C0;
    private int D0;
    private int E0;
    private int F0;
    private int G0;
    private boolean H0;
    private boolean I0;
    private boolean J0;
    private boolean K0;
    private boolean L0;
    private boolean M0;
    private boolean N0;
    private Handler O0;
    private boolean P0;
    private Thread Q0;
    private boolean R0;
    private boolean S0;
    int T0;
    int U0;
    int V0;
    private View W0;
    private w.c X0;
    private g Y0;
    boolean Z0;
    String a1;
    String b1;
    private final long c1;
    private long d1;
    private boolean e1;
    com.smartdigimkt.k5.d f1;
    Object g1;
    private d0 x0;
    private s y0;
    private TextureView z0;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (((BasePlayerView) PlayerView.this).s0 == null) {
                return;
            }
            PlayerView.this.C0 = message.what;
            if (!PlayerView.this.L0 && !((BasePlayerView) PlayerView.this).p0) {
                PlayerView.this.L0 = true;
                if (((BasePlayerView) PlayerView.this).s0 != null) {
                    ((BasePlayerView) PlayerView.this).s0.b();
                }
                PlayerView.this.a(202);
            }
            if (((BasePlayerView) PlayerView.this).s0 != null) {
                ((BasePlayerView) PlayerView.this).s0.b(PlayerView.this.C0);
            }
            if (!PlayerView.this.H0 && PlayerView.this.C0 >= PlayerView.this.E0) {
                PlayerView.this.H0 = true;
                if (((BasePlayerView) PlayerView.this).s0 != null) {
                    ((BasePlayerView) PlayerView.this).s0.a(25);
                }
                PlayerView.this.a(203);
            } else if (!PlayerView.this.I0 && PlayerView.this.C0 >= PlayerView.this.F0) {
                PlayerView.this.I0 = true;
                if (((BasePlayerView) PlayerView.this).s0 != null) {
                    ((BasePlayerView) PlayerView.this).s0.a(50);
                }
                PlayerView.this.a(204);
            } else if (!PlayerView.this.J0 && PlayerView.this.C0 >= PlayerView.this.G0) {
                PlayerView.this.J0 = true;
                if (((BasePlayerView) PlayerView.this).s0 != null) {
                    ((BasePlayerView) PlayerView.this).s0.a(75);
                }
                PlayerView.this.a(205);
            }
            if (PlayerView.this.e1 || !PlayerView.this.S0) {
                return;
            }
            int i2 = PlayerView.this.C0;
            PlayerView playerView = PlayerView.this;
            if (i2 < playerView.T0 || ((BasePlayerView) playerView).s0 == null) {
                return;
            }
            PlayerView.this.S0 = false;
            ((BasePlayerView) PlayerView.this).s0.onVideoDownloadResume();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (((BasePlayerView) PlayerView.this).s0 != null) {
                ((BasePlayerView) PlayerView.this).s0.b(1);
            }
        }
    }

    public class c implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                PlayerView.this.a(i.a("40002", "Video player error!Buffer timeout"));
            }
        }

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (PlayerView.this.K0) {
                if (((BasePlayerView) PlayerView.this).p0 || !PlayerView.this.isPlaying() || PlayerView.this.O0 == null) {
                    if (PlayerView.this.d1 == 0) {
                        PlayerView.this.d1 = SystemClock.elapsedRealtime();
                    }
                    try {
                        Thread.sleep(10L);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (SystemClock.elapsedRealtime() - PlayerView.this.d1 > 5000 && PlayerView.this.d1 != 0) {
                        if (((BasePlayerView) PlayerView.this).s0 != null) {
                            com.smartdigimkt.l7.b.a().e(new a());
                        }
                        PlayerView.this.i();
                    }
                } else {
                    PlayerView.this.d1 = 0L;
                    try {
                        PlayerView.this.O0.sendEmptyMessage((int) PlayerView.this.x0.F());
                    } catch (Throwable unused) {
                    }
                    try {
                        Thread.sleep(200L);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
    }

    public class d extends w.a {
        public d() {
        }

        @Override // com.smartdigimkt.w3.w.a, com.smartdigimkt.w3.w.c
        public void onPlayerError(com.smartdigimkt.w3.g gVar) {
            boolean z2;
            long jF;
            super.onPlayerError(gVar);
            String string = "Play error and ExoPlayer have not message.";
            if (gVar != null) {
                int i2 = gVar.f39281a;
                z2 = true;
                if (i2 != 0) {
                    if (i2 == 1) {
                        string = "Play error, because have a RendererException.";
                    } else if (i2 == 2) {
                        string = "Play error, because have a UnexpectedException.";
                    }
                    z2 = false;
                } else {
                    string = "Play error, because have a SourceException.";
                }
                if (gVar.getCause() != null && !TextUtils.isEmpty(gVar.getCause().getMessage())) {
                    StringBuilder sbX = android.support.v4.media.a.x(string, ",eception:");
                    sbX.append(gVar.getCause().getMessage());
                    string = sbX.toString();
                }
            } else {
                z2 = false;
            }
            PlayerView playerView = PlayerView.this;
            if (playerView.Z0 && z2) {
                playerView.b1 = string;
                String str = PlayerView.TAG;
                playerView.Z0 = false;
                playerView.e();
                return;
            }
            playerView.i();
            if (((BasePlayerView) PlayerView.this).s0 != null) {
                try {
                    jF = PlayerView.this.x0.F();
                } catch (Throwable unused) {
                    jF = 0;
                }
                String str2 = jF <= 0 ? "50001" : "40002";
                String str3 = "videoUrl:" + PlayerView.this.B0 + ",readyRate:" + PlayerView.this.V0 + ",cdRate:" + PlayerView.this.U0 + ",play process:" + jF;
                String strD = TextUtils.isEmpty(PlayerView.this.b1) ? android.support.v4.media.a.D(str3, ",localFileErrorMsg:", string) : android.support.v4.media.a.s(android.support.v4.media.a.x(str3, ",localFileErrorMsg:"), PlayerView.this.b1, ",errorMsg:", string);
                if (PlayerView.this.M0) {
                    PlayerView.this.b(i.a(str2, "Video player error!" + strD));
                    return;
                }
                PlayerView.this.b(i.a(str2, "Video player prepare fail!" + strD));
            }
        }

        @Override // com.smartdigimkt.w3.w.a, com.smartdigimkt.w3.w.c
        public void onPlayerStateChanged(boolean z2, int i2) {
            super.onPlayerStateChanged(z2, i2);
            String str = PlayerView.TAG;
            if (i2 == 2) {
                if (!PlayerView.this.N0) {
                    PlayerView.this.N0 = true;
                    PlayerView.this.g();
                }
                PlayerView playerView = PlayerView.this;
                playerView.a(playerView.x0.x());
                return;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    return;
                }
                PlayerView.this.i();
                if (((BasePlayerView) PlayerView.this).p0) {
                    return;
                }
                ((BasePlayerView) PlayerView.this).p0 = true;
                PlayerView playerView2 = PlayerView.this;
                playerView2.C0 = playerView2.D0;
                if (((BasePlayerView) PlayerView.this).s0 != null) {
                    ((BasePlayerView) PlayerView.this).s0.d();
                }
                PlayerView.this.a(206);
                PlayerView.this.a();
                return;
            }
            if (!PlayerView.this.M0) {
                PlayerView.this.N0 = false;
                PlayerView playerView3 = PlayerView.this;
                playerView3.D0 = (int) playerView3.x0.x();
                PlayerView playerView4 = PlayerView.this;
                playerView4.b(playerView4.D0);
                if (((BasePlayerView) PlayerView.this).s0 != null) {
                    ((BasePlayerView) PlayerView.this).s0.a(PlayerView.this.D0);
                }
                PlayerView playerView5 = PlayerView.this;
                playerView5.E0 = Math.round(playerView5.D0 * 0.25f);
                PlayerView playerView6 = PlayerView.this;
                playerView6.F0 = Math.round(playerView6.D0 * 0.5f);
                PlayerView playerView7 = PlayerView.this;
                playerView7.G0 = Math.round(playerView7.D0 * 0.75f);
                PlayerView playerView8 = PlayerView.this;
                playerView8.a(playerView8.D0);
                PlayerView.this.M0 = true;
            }
            if (PlayerView.this.C0 > 0 && Math.abs(((long) PlayerView.this.C0) - PlayerView.this.x0.F()) > 500) {
                PlayerView.this.x0.a(PlayerView.this.C0);
            }
            if (PlayerView.this.isPlaying()) {
                PlayerView.this.h();
            }
        }
    }

    public class e implements g {
        public e() {
        }

        @Override // com.smartdigimkt.q4.g
        public void a() {
        }

        @Override // com.smartdigimkt.q4.g
        public void a(int i2, int i3, int i4, float f) {
            PlayerView playerView = PlayerView.this;
            playerView.autoFitVideoSize(i2, i3, playerView.z0);
        }
    }

    public class f implements Runnable {
        final /* synthetic */ int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ long f38391Y;
        final /* synthetic */ long Z;

        public f(int i2, long j, long j2) {
            this.X = i2;
            this.f38391Y = j;
            this.Z = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jA;
            long jD;
            o oVarB;
            if (((BasePlayerView) PlayerView.this).u0 == null || ((BasePlayerView) PlayerView.this).t0 == null) {
                return;
            }
            if (((BasePlayerView) PlayerView.this).t0 == null || (oVarB = p.c().b(((BasePlayerView) PlayerView.this).t0.k0())) == null) {
                jA = 0;
                jD = 0;
            } else {
                jA = oVarB.a();
                jD = oVarB.d();
            }
            com.smartdigimkt.i7.d.a(((BasePlayerView) PlayerView.this).u0, ((BasePlayerView) PlayerView.this).t0, this.X, this.f38391Y, jA, this.Z, jD);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0 = "";
        this.B0 = "";
        this.C0 = -1;
        this.K0 = false;
        this.L0 = false;
        this.M0 = false;
        this.N0 = false;
        this.U0 = 0;
        this.V0 = 0;
        this.Z0 = false;
        this.a1 = "";
        this.b1 = "";
        this.c1 = 5000L;
        this.d1 = 0L;
        this.g1 = new Object();
        this.e1 = true;
        setSaveEnabled(true);
        this.O0 = new a(Looper.getMainLooper());
        setBackgroundColor(-16777216);
    }

    private String getValidVideoPath() {
        return new File(this.A0).exists() ? this.A0 : this.B0;
    }

    public void autoFitVideoSize(int i2, int i3, View view) {
        float f2 = i2;
        float f3 = i3;
        float fMax = Math.max(f2 / view.getMeasuredWidth(), f3 / view.getMeasuredHeight());
        int iCeil = (int) Math.ceil(f2 / fMax);
        int iCeil2 = (int) Math.ceil(f3 / fMax);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = iCeil;
        layoutParams.height = iCeil2;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public long getCurrentPosition() {
        return Math.max(this.C0, 0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public long getVideoLength() {
        d0 d0Var = this.x0;
        return d0Var != null ? d0Var.x() : this.D0;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public boolean hasVideo() {
        return this.R0;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void init(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, boolean z2, List<Bitmap> list, com.smartdigimkt.k5.d dVar) {
        super.init(fVar, aVar, z2, list, dVar);
        this.f1 = dVar;
        c(z2);
        initMuteStatus(z2);
        setVideoRateConfig(fVar.i().F0(), fVar.i().t());
        load(fVar.k0(), false);
    }

    public void initMuteStatus(boolean z2) {
        this.P0 = z2;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public boolean isMute() {
        return this.P0;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public boolean isPlaying() {
        d0 d0Var = this.x0;
        return d0Var != null && d0Var.Q();
    }

    public void load(String str, boolean z2) {
        this.B0 = str;
        this.A0 = j.a().a(4, str);
        a(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.v0) {
            return;
        }
        release(5);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        try {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable("superState");
            if (parcelable2 == null) {
                super.onRestoreInstanceState(parcelable);
                return;
            }
            super.onRestoreInstanceState(parcelable2);
            this.C0 = bundle.getInt("savePosition");
            this.H0 = bundle.getBoolean("saveVideoPlay25");
            this.I0 = bundle.getBoolean("saveVideoPlay50");
            this.J0 = bundle.getBoolean("saveVideoPlay75");
            this.L0 = bundle.getBoolean("saveIsVideoStart");
            this.p0 = bundle.getBoolean("saveIsVideoPlayCompletion");
            this.P0 = bundle.getBoolean("saveIsMute");
            this.S0 = bundle.getBoolean("saveVideoNeedResumeByCdRate");
            d0 d0Var = this.x0;
            if (d0Var != null) {
                d0Var.a(this.P0 ? 0.0f : 1.0f);
            }
            bundle.toString();
        } catch (Throwable unused) {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        try {
            Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
            Bundle bundle = new Bundle();
            bundle.putParcelable("superState", parcelableOnSaveInstanceState);
            bundle.putInt("savePosition", this.C0);
            bundle.putBoolean("saveVideoPlay25", this.H0);
            bundle.putBoolean("saveVideoPlay50", this.I0);
            bundle.putBoolean("saveVideoPlay75", this.J0);
            bundle.putBoolean("saveIsVideoStart", this.L0);
            bundle.putBoolean("saveIsVideoPlayCompletion", this.p0);
            bundle.putBoolean("saveIsMute", this.P0);
            bundle.putBoolean("saveVideoNeedResumeByCdRate", this.S0);
            bundle.toString();
            return bundle;
        } catch (Throwable unused) {
            return super.onSaveInstanceState();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void pause() {
        if (isPlaying()) {
            a(207);
        }
        i();
        d0 d0Var = this.x0;
        if (d0Var != null) {
            d0Var.a(false);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void rePlayVideo() {
        if (this.x0 != null) {
            this.C0 = 0;
            this.L0 = false;
            this.p0 = false;
            f();
            a(getValidVideoPath(), true);
            start();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void release(int i2) {
        long currentPosition = getCurrentPosition();
        long videoLength = getVideoLength();
        i();
        a();
        if (!this.p0) {
            a(BaseATView.g.f38289J);
        }
        d0 d0Var = this.x0;
        if (d0Var != null) {
            if (d0Var.Q()) {
                this.x0.stop();
            }
            w.c cVar = this.X0;
            if (cVar != null) {
                this.x0.b(cVar);
            }
            g gVar = this.Y0;
            if (gVar != null) {
                this.x0.b(gVar);
            }
            this.x0.release();
            this.x0 = null;
        }
        Handler handler = this.O0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.M0 = false;
        if (!this.e1) {
            com.smartdigimkt.g7.c.a().b(this.B0);
        }
        com.smartdigimkt.w6.f fVar = this.t0;
        if (fVar == null || !fVar.w0()) {
            com.smartdigimkt.l7.b.a().b((Runnable) new f(i2, currentPosition, videoLength), 8);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void setListener(BasePlayerView.a aVar) {
        this.s0 = aVar;
    }

    public void setLoadingView(View view) {
        this.W0 = view;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void setMute(boolean z2) {
        this.P0 = z2;
        if (z2) {
            d0 d0Var = this.x0;
            if (d0Var != null) {
                d0Var.a(0.0f);
            }
            BasePlayerView.a aVar = this.s0;
            if (aVar != null) {
                aVar.a();
            }
        } else {
            d0 d0Var2 = this.x0;
            if (d0Var2 != null) {
                d0Var2.a(1.0f);
            }
            BasePlayerView.a aVar2 = this.s0;
            if (aVar2 != null) {
                aVar2.e();
            }
        }
        c(z2);
        a(212);
    }

    public void setVideoRateConfig(int i2, int i3) {
        this.V0 = i2;
        this.U0 = i3;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void start() {
        c();
        if (!isPlaying()) {
            a(208);
        }
        d0 d0Var = this.x0;
        if (d0Var != null) {
            d0Var.a(true);
        }
        h();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void stop() {
        d0 d0Var = this.x0;
        if (d0Var != null) {
            d0Var.stop();
        }
        BasePlayerView.a aVar = this.s0;
        if (aVar != null) {
            aVar.c();
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.K0 = false;
        this.Q0 = null;
        this.d1 = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        View view = this.W0;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.Q0 != null) {
            return;
        }
        this.K0 = true;
        this.d1 = 0L;
        Thread thread = new Thread(new c());
        this.Q0 = thread;
        thread.setName("sdm_type_player_progress");
        this.Q0.start();
    }

    private void d() {
        if (this.z0 == null) {
            TextureView textureView = new TextureView(getContext());
            this.z0 = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.z0, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        BasePlayerView.a aVar = this.s0;
        if (aVar != null) {
            aVar.onVideoDownloadResume();
        }
        this.x0.a(this.y0);
    }

    private void f() {
        synchronized (this.g1) {
            this.f1 = null;
        }
    }

    private void a(boolean z2) {
        if (b()) {
            b(i.a("40002", "Video file and net url is empty!"));
            return;
        }
        d();
        b(z2);
        setOnClickListener(new b());
    }

    private boolean b() {
        if (!new File(this.A0).exists() && TextUtils.isEmpty(this.B0)) {
            return true;
        }
        this.R0 = true;
        return false;
    }

    private void c() {
        View view = this.W0;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void c(boolean z2) {
        synchronized (this.g1) {
            try {
                com.smartdigimkt.k5.d dVar = this.f1;
                if (dVar != null) {
                    dVar.a(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(boolean z2) {
        if (this.x0 == null) {
            this.x0 = com.smartdigimkt.w3.i.a(new com.smartdigimkt.w3.f(getContext()), new com.smartdigimkt.m4.c(), new com.smartdigimkt.w3.d());
            d dVar = new d();
            this.X0 = dVar;
            this.x0.a(dVar);
            e eVar = new e();
            this.Y0 = eVar;
            this.x0.a(eVar);
            this.x0.a(this.P0 ? 0.0f : 1.0f);
            this.x0.a(z2);
            a(getValidVideoPath(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        BasePlayerView.a aVar;
        if (this.e1) {
            return;
        }
        int i2 = this.V0;
        if (i2 > 0 && i2 < 100) {
            if (this.U0 > i2) {
                this.U0 = i2 / 2;
            }
            int i3 = this.U0;
            if (i3 == 0) {
                this.T0 = 0;
                this.S0 = true;
            } else if (j > 0) {
                this.T0 = Math.round(((i3 * 1.0f) / 100.0f) * j) - 2000;
                this.S0 = true;
            }
            if (this.T0 > 0 || !this.S0 || (aVar = this.s0) == null) {
                return;
            }
            this.S0 = false;
            aVar.onVideoDownloadResume();
            return;
        }
        this.S0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.g1) {
            try {
                com.smartdigimkt.k5.d dVar = this.f1;
                if (dVar != null) {
                    dVar.a(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(String str, boolean z2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.x0 == null) {
                b(i.a("40002", "Player show fail with some internal error"));
                return;
            }
            this.Z0 = TextUtils.equals(str, this.A0);
            if (TextUtils.equals(str, this.B0) && this.V0 > 0) {
                if (z2) {
                    com.smartdigimkt.i7.d.a("Video Play Fail:Play Network Url", "AdxPlayer videoUrl:" + str + ",readyRate:" + this.V0 + ",maxVideoCacheSize:" + p.c().d() + ",lastRecycleCheckDownloadedFileSize:" + p.c().b() + ",isChaoDi:true,ChaoDiThrowableMsg:" + this.a1, com.smartdigimkt.m6.b.p().q());
                } else {
                    com.smartdigimkt.i7.d.a("Video Play Fail:Play Network Url", "AdxPlayer videoUrl:" + str + ",readyRate:" + this.V0 + ",maxVideoCacheSize:" + p.c().d() + ",lastRecycleCheckDownloadedFileSize:" + p.c().b(), com.smartdigimkt.m6.b.p().q());
                }
            }
            Uri uri = Uri.parse(str);
            if (str.toLowerCase().startsWith("http")) {
                this.y0 = new com.smartdigimkt.j4.o.d(new q("SDM_ExoPlayer")).a(uri);
                this.e1 = true;
            } else {
                this.y0 = new com.smartdigimkt.j4.o.d(new com.smartdigimkt.n4.o(getContext(), "SDM_ExoPlayer")).a(uri);
                this.e1 = false;
            }
            this.x0.b(this.z0);
            this.x0.a(this.y0);
        } catch (Throwable th) {
            th.printStackTrace();
            if (!TextUtils.equals(str, this.B0) && !z2) {
                this.a1 = th.getMessage();
                a(this.B0, true);
            } else {
                b(i.a("40002", th.getMessage()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        synchronized (this.g1) {
            try {
                com.smartdigimkt.k5.d dVar = this.f1;
                if (dVar != null) {
                    dVar.a(i2, (View) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
