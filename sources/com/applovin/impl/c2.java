package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class c2 extends y1 implements AppLovinCommunicatorSubscriber {
    private final d2 M;
    private MediaPlayer N;
    private final View O;
    protected final AppLovinVideoView P;
    protected final com.applovin.impl.a Q;
    protected final com.applovin.impl.adview.g R;
    protected k0 S;
    protected final ImageView T;
    protected final ProgressBar U;
    protected ProgressBar V;
    protected ImageView W;
    private final d X;
    private final Handler Y;
    private final Handler Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected final c1 f7623a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected final c1 f7624b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final boolean f7625c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected boolean f7626d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    protected long f7627e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f7628f0;
    private int g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    protected boolean f7629h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f7630i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final AtomicBoolean f7631j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final AtomicBoolean f7632k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private long f7633l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private long f7634m0;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements c1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7635a;

        public a(int i10) {
            this.f7635a = i10;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            c2 c2Var = c2.this;
            if (c2Var.S != null) {
                long seconds = ((long) this.f7635a) - TimeUnit.MILLISECONDS.toSeconds(c2Var.P.getCurrentPosition());
                if (seconds <= 0) {
                    c2.this.f10041v = true;
                } else if (c2.this.P()) {
                    c2.this.S.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return c2.this.P();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements c1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f7637a;

        public b(Integer num) {
            this.f7637a = num;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            c2 c2Var = c2.this;
            if (c2Var.f7629h0) {
                c2Var.U.setVisibility(8);
            } else {
                c2.this.U.setProgress((int) ((c2Var.P.getCurrentPosition() / c2.this.f7627e0) * this.f7637a.intValue()));
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return !c2.this.f7629h0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements c1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f7639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f7640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f7641c;

        public c(long j10, Integer num, Long l) {
            this.f7639a = j10;
            this.f7640b = num;
            this.f7641c = l;
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            c2.this.V.setProgress((int) ((c2.this.f10037r / this.f7639a) * this.f7640b.intValue()));
            c2 c2Var = c2.this;
            c2Var.f10037r = this.f7641c.longValue() + c2Var.f10037r;
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return c2.this.f10037r < this.f7639a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private d() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            c2.this.a(motionEvent);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.p pVar = c2.this.f10023c;
            if (com.applovin.impl.sdk.p.a()) {
                c2.this.f10023c.a("AppLovinFullscreenActivity", "Video completed");
            }
            c2.this.f7630i0 = true;
            c2 c2Var = c2.this;
            if (!c2Var.f10039t) {
                c2Var.R();
            } else if (c2Var.h()) {
                c2.this.A();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            c2.this.g(l1.d.f("Video view error (", i10, ",", i11, ")"));
            c2.this.P.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            com.applovin.impl.sdk.p pVar = c2.this.f10023c;
            if (com.applovin.impl.sdk.p.a()) {
                c2.this.f10023c.a("AppLovinFullscreenActivity", l1.d.f("MediaPlayer Info: (", i10, ", ", i11, ")"));
            }
            if (i10 == 701) {
                c2.this.Q();
                return false;
            }
            if (i10 != 3) {
                if (i10 != 702) {
                    return false;
                }
                c2.this.E();
                return false;
            }
            c2.this.f7623a0.b();
            c2 c2Var = c2.this;
            if (c2Var.R != null) {
                c2Var.O();
            }
            c2.this.E();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            c2.this.N = mediaPlayer;
            mediaPlayer.setOnInfoListener(c2.this.X);
            mediaPlayer.setOnErrorListener(c2.this.X);
            float f10 = !c2.this.f7626d0 ? 1 : 0;
            mediaPlayer.setVolume(f10, f10);
            c2.this.f10040u = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            c2.this.d(mediaPlayer.getDuration());
            c2.this.N();
            com.applovin.impl.sdk.p pVar = c2.this.f10023c;
            if (com.applovin.impl.sdk.p.a()) {
                c2.this.f10023c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + c2.this.N);
            }
        }

        public /* synthetic */ d(c2 c2Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements View.OnClickListener {
        private e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c2 c2Var = c2.this;
            if (view == c2Var.R) {
                c2Var.S();
                return;
            }
            if (view == c2Var.T) {
                c2Var.T();
            } else if (com.applovin.impl.sdk.p.a()) {
                c2.this.f10023c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ e(c2 c2Var, a aVar) {
            this();
        }
    }

    public c2(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.M = new d2(this.f10021a, this.f10024d, this.f10022b);
        a aVar = null;
        this.W = null;
        d dVar = new d(this, aVar);
        this.X = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.Y = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.Z = handler2;
        c1 c1Var = new c1(handler, this.f10022b);
        this.f7623a0 = c1Var;
        this.f7624b0 = new c1(handler2, this.f10022b);
        boolean zA0 = this.f10021a.A0();
        this.f7625c0 = zA0;
        this.f7626d0 = q7.e(this.f10022b);
        this.g0 = -1;
        this.f7631j0 = new AtomicBoolean();
        this.f7632k0 = new AtomicBoolean();
        this.f7633l0 = -2L;
        this.f7634m0 = 0L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.P = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(dVar);
        appLovinVideoView.setOnCompletionListener(dVar);
        appLovinVideoView.setOnErrorListener(dVar);
        bVar.h().putString("video_view_address", g8.a(appLovinVideoView));
        View view = new View(activity);
        this.O = view;
        boolean z10 = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        if (((Boolean) lVar.a(z4.f10232q1)).booleanValue()) {
            view.setOnTouchListener(new AppLovinTouchToClickListener(lVar, z4.f10131e0, activity, dVar));
        } else {
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(lVar, z4.f10131e0, activity, dVar));
            view.setOnTouchListener(new com.applovin.impl.adview.q(1));
        }
        e eVar = new e(this, aVar);
        if (bVar.c0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.U(), activity);
            this.R = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(eVar);
        } else {
            this.R = null;
        }
        if (a(this.f7626d0, lVar)) {
            ImageView imageView = new ImageView(activity);
            this.T = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(eVar);
            e(this.f7626d0);
        } else {
            this.T = null;
        }
        if (zA0) {
            com.applovin.impl.a aVar2 = new com.applovin.impl.a(activity, ((Integer) lVar.a(z4.f10217o2)).intValue(), R.attr.progressBarStyleLarge);
            this.Q = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.Q = null;
        }
        int iC = c();
        if (((Boolean) lVar.a(z4.Y1)).booleanValue() && iC > 0) {
            z10 = true;
        }
        if (this.S == null && z10) {
            this.S = new k0(activity);
            int iS = bVar.s();
            this.S.setTextColor(iS);
            this.S.setTextSize(((Integer) lVar.a(z4.X1)).intValue());
            this.S.setFinishedStrokeColor(iS);
            this.S.setFinishedStrokeWidth(((Integer) lVar.a(z4.W1)).intValue());
            this.S.setMax(iC);
            this.S.setProgress(iC);
            c1Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(iC));
        }
        if (!bVar.j0()) {
            this.U = null;
            return;
        }
        Long l = (Long) lVar.a(z4.f10192l2);
        Integer num = (Integer) lVar.a(z4.f10201m2);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.U = progressBar;
        a(progressBar, bVar.i0(), num.intValue());
        c1Var.a("PROGRESS_BAR", l.longValue(), new b(num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        this.f10036q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        if (this.f7629h0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f10023c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f10022b.o0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f10023c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        if (this.g0 < 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f10023c.a("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.g0 + "ms for MediaPlayer: " + this.N);
        }
        this.P.seekTo(this.g0);
        this.P.start();
        this.f7623a0.b();
        this.g0 = -1;
        a(new w8(this, 1), 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (this.f7632k0.compareAndSet(false, true)) {
            a(this.R, this.f10021a.c0(), new w8(this, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    private void e(boolean z10) {
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f10024d.getDrawable(z10 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
        if (animatedVectorDrawable == null) {
            ImageViewUtils.setImageUri(this.T, z10 ? this.f10021a.G() : this.f10021a.a0(), this.f10022b);
            return;
        }
        this.T.setScaleType(ImageView.ScaleType.FIT_XY);
        this.T.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
    }

    private void f(boolean z10) {
        this.f7628f0 = C();
        if (z10) {
            this.P.pause();
        } else {
            this.P.stopPlayback();
        }
    }

    @Override // com.applovin.impl.y1
    public void A() {
        this.M.a(this.l);
        this.f10036q = SystemClock.elapsedRealtime();
    }

    public void N() {
        long jP;
        long millis;
        if (this.f10021a.O() >= 0 || this.f10021a.P() >= 0) {
            if (this.f10021a.O() >= 0) {
                jP = this.f10021a.O();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f10021a;
                long j10 = this.f7627e0;
                long j11 = j10 > 0 ? j10 : 0L;
                if (aVar.S0()) {
                    int iE1 = (int) ((com.applovin.impl.sdk.ad.a) this.f10021a).e1();
                    if (iE1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iE1);
                    } else {
                        int iR = (int) aVar.r();
                        if (iR > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iR);
                        }
                    }
                    j11 += millis;
                }
                jP = (long) ((((double) this.f10021a.P()) / 100.0d) * j11);
            }
            c(jP);
        }
    }

    public boolean P() {
        return (this.f10041v || this.f7629h0 || !this.P.isPlaying()) ? false : true;
    }

    public void Q() {
        AppLovinSdkUtils.runOnUiThread(new w8(this, 0));
    }

    public void R() {
        c2 c2Var;
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        f(this.f10021a.Z0());
        long jM = this.f10021a.M();
        if (jM > 0) {
            this.f10037r = 0L;
            Long l = (Long) this.f10022b.a(z4.f10253t2);
            Integer num = (Integer) this.f10022b.a(z4.f10275w2);
            ProgressBar progressBar = new ProgressBar(this.f10024d, null, R.attr.progressBarStyleHorizontal);
            this.V = progressBar;
            a(progressBar, this.f10021a.L(), num.intValue());
            c2Var = this;
            this.f7624b0.a("POSTITIAL_PROGRESS_BAR", l.longValue(), c2Var.new c(jM, num, l));
            c2Var.f7624b0.b();
        } else {
            c2Var = this;
        }
        c2Var.M.a(c2Var.f10031k, c2Var.f10030j, c2Var.b(), c2Var.V);
        StringBuilder sb2 = new StringBuilder("javascript:al_onPoststitialShow(");
        sb2.append(c2Var.f10044y);
        sb2.append(",");
        c2Var.a(l1.d.i(sb2, c2Var.f10045z, ");"), c2Var.f10021a.x());
        if (c2Var.f10031k != null) {
            if (c2Var.f10021a.r() >= 0) {
                c2Var.a(c2Var.f10031k, c2Var.f10021a.r(), new w8(c2Var, 5));
            } else {
                c2Var.f10031k.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = c2Var.f10031k;
        if (gVar != null) {
            arrayList.add(new j4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = c2Var.f10030j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = c2Var.f10030j;
            arrayList.add(new j4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = c2Var.V;
        if (progressBar2 != null) {
            arrayList.add(new j4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        c2Var.f10021a.getAdEventTracker().b(c2Var.b(), arrayList);
        c2Var.p();
        c2Var.f7629h0 = true;
    }

    public void S() {
        this.f7633l0 = SystemClock.elapsedRealtime() - this.f7634m0;
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.a("AppLovinFullscreenActivity", defpackage.e.r(new StringBuilder("Attempting to skip video with skip time: "), this.f7633l0, "ms"));
        }
        D();
    }

    public void T() {
        MediaPlayer mediaPlayer = this.N;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f10 = this.f7626d0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f10, f10);
            boolean z10 = !this.f7626d0;
            this.f7626d0 = z10;
            e(z10);
            a(this.f7626d0, 0L);
        } catch (Throwable unused) {
        }
    }

    public void d(long j10) {
        this.f7627e0 = j10;
    }

    public void g(String str) {
        if (com.applovin.impl.sdk.p.a()) {
            com.applovin.impl.sdk.p pVar = this.f10023c;
            StringBuilder sbK = d5.u.k("Encountered media error: ", str, " for ad: ");
            sbK.append(this.f10021a);
            pVar.b("AppLovinFullscreenActivity", sbK.toString());
        }
        if (this.f7631j0.compareAndSet(false, true)) {
            if (((Boolean) this.f10022b.a(z4.P0)).booleanValue()) {
                this.f10022b.I().d(this.f10021a, com.applovin.impl.sdk.l.p());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.F;
            if (appLovinAdDisplayListener instanceof n2) {
                ((n2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            String str2 = this.f10021a instanceof r7 ? "handleVastVideoError" : "handleVideoError";
            this.f10022b.E().a(str2, str, this.f10021a);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", str2);
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f10022b.g().a(f2.G, this.f10021a, mapHashMap);
            a("media_error");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.y1
    public void m() {
        super.a(C(), this.f7625c0, F(), this.f7633l0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f10021a.getAdIdNumber() && this.f7625c0) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !s0.a(i10)) || this.f7630i0 || this.P.isPlaying()) {
                    return;
                }
                g("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.y1
    public void r() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (this.f7625c0) {
                AppLovinCommunicator.getInstance(this.f10024d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.P;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.P.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.N;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.p.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th2);
        }
        super.r();
    }

    @Override // com.applovin.impl.y1
    public void v() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.g0 = this.P.getCurrentPosition();
        this.P.pause();
        this.f7623a0.c();
        if (com.applovin.impl.sdk.p.a()) {
            this.f10023c.a("AppLovinFullscreenActivity", "Paused video at position " + this.g0 + "ms");
        }
    }

    @Override // com.applovin.impl.y1
    public void w() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
            com.applovin.impl.a aVar2 = this.Q;
            Objects.requireNonNull(aVar2);
            a(new u9(aVar2, 4), 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.f7633l0 = -1L;
        this.f7634m0 = SystemClock.elapsedRealtime();
    }

    public int C() {
        long currentPosition = this.P.getCurrentPosition();
        if (this.f7630i0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.f7627e0) * 100.0f) : this.f7628f0;
    }

    public void D() {
        this.f10044y++;
        if (this.f10021a.u()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f10023c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            a("video_skip");
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.f10023c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            R();
        }
    }

    public void E() {
        AppLovinSdkUtils.runOnUiThread(new w8(this, 3));
    }

    public boolean F() {
        if (this.J && this.f10021a.W0()) {
            return true;
        }
        return G();
    }

    public boolean G() {
        return C() >= this.f10021a.e0();
    }

    @Override // com.applovin.impl.y1
    public void b(boolean z10) {
        super.b(z10);
        if (z10) {
            b(0L);
            if (this.f7629h0) {
                this.f7624b0.b();
                return;
            }
            return;
        }
        if (this.f7629h0) {
            this.f7624b0.c();
        } else {
            v();
        }
    }

    @Override // com.applovin.impl.y1
    public void f() {
        super.f();
        this.M.a((View) this.R);
        if (!h() || this.f7629h0) {
            A();
        }
    }

    @Override // com.applovin.impl.y1
    public void a(ViewGroup viewGroup) {
        String str;
        this.M.a(this.T, this.R, this.Q, this.U, this.S, this.P, this.O, b(), this.f10030j, this.W, viewGroup);
        if (p0.e() && (str = this.f10022b.p0().getExtraParameters().get("audio_focus_request")) != null) {
            this.P.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) this.f10022b.a(z4.f10128d6)).booleanValue() || !a(!this.f7625c0)) {
            this.P.setVideoURI(this.f10021a.k0());
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            com.applovin.impl.adview.k kVar = this.f10030j;
            if (kVar != null) {
                kVar.b();
            }
            this.P.start();
            if (this.f7625c0) {
                Q();
            }
            b().renderAd(this.f10021a);
            if (this.R != null) {
                this.f10022b.s0().a(new u6(this.f10022b, "scheduleSkipButton", new w8(this, 4)), f6.b.TIMEOUT, this.f10021a.d0(), true);
            }
            super.c(this.f7626d0);
        }
    }

    @Override // com.applovin.impl.y1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.y1
    public void b(long j10) {
        a(new w8(this, 6), j10);
    }

    @Override // com.applovin.impl.y1
    public void a(String str, long j10) {
        super.a(str, j10);
    }

    private void a(ProgressBar progressBar, int i10, int i11) {
        progressBar.setMax(i11);
        progressBar.setPadding(0, 0, 0, 0);
        progressBar.setProgressTintList(ColorStateList.valueOf(i10));
    }

    @Override // com.applovin.impl.y1
    public void a(String str) {
        this.f7623a0.a();
        this.f7624b0.a();
        this.Y.removeCallbacksAndMessages(null);
        this.Z.removeCallbacksAndMessages(null);
        if (!((Boolean) this.f10022b.a(z4.T6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f10021a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        super.a(str);
    }

    public void a(MotionEvent motionEvent) {
        Context context;
        if (this.f10021a.z0()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f10023c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri uriB0 = this.f10021a.b0();
            if (uriB0 != null) {
                if (!((Boolean) this.f10022b.a(z4.f10272w)).booleanValue() || (context = this.f10024d) == null) {
                    context = b() != null ? b().getContext() : com.applovin.impl.sdk.l.p();
                }
                this.f10022b.l().trackAndLaunchVideoClick(this.f10021a, uriB0, motionEvent, this, context);
                v2.a(this.E, this.f10021a);
                this.f10045z++;
            }
        }
    }

    private static boolean a(boolean z10, com.applovin.impl.sdk.l lVar) {
        if (!((Boolean) lVar.a(z4.f10124d2)).booleanValue()) {
            return false;
        }
        if (!((Boolean) lVar.a(z4.f10133e2)).booleanValue() || z10) {
            return true;
        }
        return ((Boolean) lVar.a(z4.f10150g2)).booleanValue();
    }
}
