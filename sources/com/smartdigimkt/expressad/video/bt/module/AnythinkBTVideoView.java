package com.smartdigimkt.expressad.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.c3.e;
import com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener;
import com.smartdigimkt.expressad.playercommon.PlayerView;
import com.smartdigimkt.expressad.video.widget.SoundImageView;
import com.smartdigimkt.expressad.widget.FeedBackButton;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.y;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkBTVideoView extends BTBaseView {
    private static final String S0 = "sdm_reward_videoview_item";
    private static boolean T0 = false;
    private static final String U0 = "2";
    private WebView A0;
    private com.smartdigimkt.c3.c B0;
    private int C0;
    private int D0;
    private int E0;
    private d F0;
    private int G0;
    private int H0;
    private boolean I0;
    private int J0;
    private int K0;
    private String L0;
    private boolean M0;
    private boolean N0;
    private boolean O0;
    private RelativeLayout P0;
    private ProgressBar Q0;
    private com.smartdigimkt.s2.a R0;
    private PlayerView u0;
    private SoundImageView v0;
    private TextView w0;
    private View x0;
    private FeedBackButton y0;
    private ImageView z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AnythinkBTVideoView.this.u0.isSilent();
            if (AnythinkBTVideoView.this.A0 != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.s0);
                    jSONObject.put("id", AnythinkBTVideoView.this.h0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("mute", AnythinkBTVideoView.this.G0);
                    jSONObject.put("data", jSONObject2);
                    h.a().a(AnythinkBTVideoView.this.A0, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    int unused = AnythinkBTVideoView.this.G0;
                } catch (Exception e2) {
                    com.smartdigimkt.z1.c.c().a(AnythinkBTVideoView.this.A0, e2.getMessage());
                }
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AnythinkBTVideoView.this.A0 != null) {
                BTBaseView.a(AnythinkBTVideoView.this.A0, "onPlayerCloseBtnClicked", AnythinkBTVideoView.this.h0);
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AnythinkBTVideoView.this.A0 != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.s0);
                    jSONObject.put("id", AnythinkBTVideoView.this.h0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", String.valueOf(view.getX()));
                    jSONObject2.put("y", String.valueOf(view.getY()));
                    jSONObject.put("data", jSONObject2);
                    h.a().a(AnythinkBTVideoView.this.A0, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    com.smartdigimkt.z1.c.c().a(AnythinkBTVideoView.this.A0, "onClicked", AnythinkBTVideoView.this.h0);
                }
            }
        }
    }

    public static final class d extends DefaultVideoPlayerStatusListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AnythinkBTVideoView f34761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WebView f34762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f34763c;
        private String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f34764e;
        private int f;
        private boolean g;
        private int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f34767l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f34765h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f34766i = false;
        private boolean j = false;
        private boolean m = false;

        public d(AnythinkBTVideoView anythinkBTVideoView, WebView webView) {
            this.f34761a = anythinkBTVideoView;
            this.f34762b = webView;
            if (anythinkBTVideoView != null) {
                this.f34763c = anythinkBTVideoView.h0;
                this.d = anythinkBTVideoView.g0;
            }
        }

        private void b() {
        }

        public int a() {
            return this.f34764e;
        }

        public void c() {
            this.f34761a = null;
            this.f34762b = null;
            boolean unused = AnythinkBTVideoView.T0 = false;
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onBufferingEnd() {
            try {
                super.onBufferingEnd();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (!str.equals("mediaplayer prepare timeout") && !str.equals("play buffering tiemout")) {
                    return;
                }
                if (this.f34762b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.s0);
                        jSONObject.put("id", this.f34763c);
                        jSONObject.put("data", new JSONObject());
                        h.a().a(this.f34762b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e2) {
                        com.smartdigimkt.z1.c.c().a(this.f34762b, e2.getMessage());
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onPlayCompleted() {
            super.onPlayCompleted();
            AnythinkBTVideoView anythinkBTVideoView = this.f34761a;
            com.smartdigimkt.x.d dVar = anythinkBTVideoView.f0;
            if (dVar == null) {
                anythinkBTVideoView.w0.setText("0");
            } else if (dVar.o2() > 0) {
                this.f34761a.w0.setText(k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_complete", k.f38992h));
            } else {
                this.f34761a.w0.setText("0");
            }
            this.f34761a.u0.setClickable(false);
            WebView webView = this.f34762b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f34763c);
            }
            this.f34764e = this.f;
            boolean unused = AnythinkBTVideoView.T0 = true;
            this.f34761a.stop();
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f34762b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.t0);
                    jSONObject.put("id", this.f34763c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f34763c);
                    jSONObject.put("data", jSONObject2);
                    h.a().a(this.f34762b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e2) {
                    com.smartdigimkt.z1.c.c().a(this.f34762b, e2.getMessage());
                }
            }
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onPlayProgress(int i2, int i3) {
            int i4;
            String str;
            int iO2;
            String strF;
            super.onPlayProgress(i2, i3);
            AnythinkBTVideoView anythinkBTVideoView = this.f34761a;
            if (anythinkBTVideoView.l0) {
                com.smartdigimkt.x.d dVar = anythinkBTVideoView.f0;
                if (dVar != null) {
                    iO2 = dVar.o2();
                    com.smartdigimkt.z.b.b().b(this.f34761a.f0.i0() + "_1", i2);
                } else {
                    iO2 = 0;
                }
                if (iO2 > i3 || iO2 <= 0) {
                    iO2 = i3;
                }
                int i5 = iO2 <= 0 ? i3 - i2 : iO2 - i2;
                if (i5 <= 0) {
                    strF = iO2 <= 0 ? "0" : (String) this.f34761a.getContext().getResources().getText(k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_complete", k.f38992h));
                } else if (iO2 <= 0) {
                    strF = androidx.datastore.preferences.protobuf.a.f(i5, "");
                } else {
                    strF = i5 + ((String) this.f34761a.getContext().getResources().getText(k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_left", k.f38992h)));
                }
                com.smartdigimkt.x.d dVar2 = this.f34761a.f0;
                if (dVar2 != null && dVar2.j2() == 1) {
                    int iMin = Math.min(this.f34761a.f0.w2(), i3);
                    if (iMin >= iO2 || iMin < 0) {
                        int i6 = iO2 - i2;
                        if (this.f34761a.f0.S() == 287) {
                            if (i6 > 0) {
                                strF = i6 + ((String) this.f34761a.getContext().getResources().getText(k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_left_skip_time", k.f38992h)));
                            } else if (i6 == 0) {
                                this.f34761a.w0.setVisibility(4);
                            }
                        }
                    } else {
                        int i7 = iMin - i2;
                        if (i7 > 0) {
                            strF = i7 + ((String) this.f34761a.getContext().getResources().getText(k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_left_skip_time", k.f38992h)));
                        } else if (this.f34761a.f0.S() == 287 && i7 == 0) {
                            this.f34761a.w0.setVisibility(4);
                        }
                    }
                }
                this.f34761a.w0.setText(strF);
            }
            this.f = i3;
            this.f34764e = i2;
            this.f34761a.Q0.setMax(this.f);
            this.f34761a.Q0.setProgress(this.f34764e);
            if (this.f34762b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.s0);
                    jSONObject.put("id", this.f34763c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", this.f34763c);
                    jSONObject2.put("progress", AnythinkBTVideoView.b(i2, i3));
                    jSONObject2.put("time", String.valueOf(i2));
                    jSONObject2.put("duration", String.valueOf(i3));
                    jSONObject.put("data", jSONObject2);
                    h.a().a(this.f34762b, "onPlayerProgressChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e2) {
                    com.smartdigimkt.z1.c.c().a(this.f34762b, e2.getMessage());
                }
            }
            try {
                int i8 = this.k;
                if (i8 == 100 || this.m || i8 == 0 || (i4 = this.f34767l) < 0 || i2 < (i3 * i4) / 100) {
                    return;
                }
                if (this.f34761a.f0.S() == 94 || this.f34761a.f0.S() == 287) {
                    str = this.f34761a.f0.N1() + this.f34761a.f0.j() + this.f34761a.f0.u2();
                } else {
                    str = this.f34761a.f0.j() + this.f34761a.f0.u2() + this.f34761a.f0.e0();
                }
                com.smartdigimkt.c3.c cVarA = e.a().a(this.d, str);
                if (cVarA != null) {
                    cVarA.v();
                    this.m = true;
                }
            } catch (Exception e3) {
                e3.getMessage();
            }
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onPlayStarted(int i2) {
            super.onPlayStarted(i2);
            if (!this.g) {
                this.f34761a.Q0.setMax(i2);
                WebView webView = this.f34762b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f34763c);
                }
                this.g = true;
            }
            boolean unused = AnythinkBTVideoView.T0 = false;
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onVideoDownloadResume() {
            String str;
            if (this.f34761a.f0.S() == 94 || this.f34761a.f0.S() == 287) {
                str = this.f34761a.f0.N1() + this.f34761a.f0.j() + this.f34761a.f0.u2();
            } else {
                str = this.f34761a.f0.j() + this.f34761a.f0.u2() + this.f34761a.f0.e0();
            }
            com.smartdigimkt.c3.c cVarA = e.a().a(this.d, str);
            if (cVarA != null) {
                cVarA.v();
                this.m = true;
            }
        }

        public void a(int i2, int i3) {
            this.k = i2;
            this.f34767l = i3;
            b();
        }
    }

    public AnythinkBTVideoView(Context context) {
        super(context);
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.G0 = 2;
        this.I0 = false;
        this.J0 = 2;
        this.K0 = 1;
        this.M0 = false;
        this.N0 = false;
        this.O0 = false;
    }

    private int getBufferTimeout() {
        try {
            com.smartdigimkt.f3.a aVarC = com.smartdigimkt.f3.c.b().c();
            if (aVarC == null) {
                com.smartdigimkt.f3.c.b().a();
            }
            if (aVarC != null) {
                return (int) aVarC.i();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    private String getPlayURL() {
        String strU2 = "";
        try {
            strU2 = this.f0.u2();
            com.smartdigimkt.c3.c cVar = this.B0;
            if (cVar != null && cVar.h() == 5) {
                String strJ = this.B0.j();
                if (!y.a(strJ) && new File(strJ).exists()) {
                    return strJ;
                }
            }
            return strU2;
        } catch (Throwable th) {
            th.getMessage();
            return strU2;
        }
    }

    public int getMute() {
        return this.G0;
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        int iFindLayout = findLayout(S0);
        if (iFindLayout > 0) {
            this.j0.inflate(iFindLayout, this);
            this.l0 = d();
            b();
        }
        T0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.O0) {
            this.J0 = com.smartdigimkt.z1.c.c().h(this.g0);
        }
        View view = this.x0;
        if (view != null) {
            view.setVisibility(this.D0 == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.v0;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.E0 == 0 ? 8 : 0);
        }
        TextView textView = this.w0;
        if (textView != null) {
            textView.setVisibility(this.C0 == 0 ? 8 : 0);
            if (this.w0.getVisibility() == 0 && com.smartdigimkt.z.b.b().a()) {
                this.f0.G(this.g0);
                com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.g0, "_1"), this.f0);
                com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.g0, "_1"), this.y0);
            }
        }
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            PlayerView playerView = this.u0;
            if (playerView != null) {
                playerView.setOnClickListener(null);
                this.u0.release();
                this.u0 = null;
            }
            SoundImageView soundImageView = this.v0;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.x0;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.A0 != null) {
                this.A0 = null;
            }
            if (this.R0 != null) {
                this.R0 = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void onPause() {
        PlayerView playerView = this.u0;
        if (playerView != null) {
            boolean zIsPlayIng = playerView.isPlayIng();
            this.N0 = zIsPlayIng;
            this.u0.setIsBTVideoPlaying(zIsPlayIng);
            this.u0.onPause();
        }
    }

    public void onResume(com.smartdigimkt.s2.a aVar) {
        PlayerView playerView = this.u0;
        if (playerView != null) {
            playerView.setDesk(true);
            this.u0.setIsCovered(false);
            if (this.N0) {
                this.u0.onResume();
            }
        }
        this.R0 = aVar;
    }

    public void onStop() {
        PlayerView playerView = this.u0;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.u0;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.A0;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.h0);
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void play() {
        d dVar;
        try {
            if (this.O0) {
                if (this.I0) {
                    this.u0.playVideo(0);
                    this.I0 = false;
                } else {
                    this.u0.start(false);
                }
                WebView webView = this.A0;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.h0);
                    return;
                }
                return;
            }
            if (this.J0 == 1) {
                playMute();
            } else {
                playUnMute();
            }
            if (!this.u0.playVideo() && (dVar = this.F0) != null) {
                dVar.onPlayError("play video failed");
            }
            this.O0 = true;
            WebView webView2 = this.A0;
            if (webView2 != null) {
                BTBaseView.a(webView2, "onPlayerPlay", this.h0);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.u0;
            if (playerView != null && this.A0 != null) {
                playerView.closeSound();
                this.v0.setSoundStatus(false);
                this.G0 = 1;
                BTBaseView.a(this.A0, "onPlayerMute", this.h0);
                com.smartdigimkt.s2.a aVar = this.R0;
                if (aVar != null) {
                    aVar.a(true);
                }
                return true;
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.u0;
            if (playerView != null && this.A0 != null) {
                playerView.openSound();
                this.v0.setSoundStatus(true);
                this.G0 = 2;
                BTBaseView.a(this.A0, "onUnmute", this.h0);
                com.smartdigimkt.s2.a aVar = this.R0;
                if (aVar != null) {
                    aVar.a(false);
                }
                return true;
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
        return false;
    }

    public void preLoadData() {
        c();
        this.H0 = getBufferTimeout();
        String playURL = getPlayURL();
        this.L0 = playURL;
        if (this.l0 && !TextUtils.isEmpty(playURL) && this.f0 != null) {
            d dVar = new d(this, this.A0);
            this.F0 = dVar;
            dVar.a(b(this.f0), a(this.f0));
            this.u0.setDesk(false);
            this.u0.initBufferIngParam(this.H0);
            this.u0.initVFPData(this.L0, this.f0.u2(), this.f0.L1(), this.F0);
            soundOperate(this.G0, -1, null);
        }
        T0 = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.u0;
            if (playerView != null) {
                if (this.I0) {
                    playerView.playVideo(0);
                    this.I0 = false;
                } else {
                    playerView.onResume();
                }
                WebView webView = this.A0;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.h0);
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void setCampaign(com.smartdigimkt.x.d dVar) {
        super.setCampaign(dVar);
        if (dVar == null || dVar.o2() <= 0) {
            this.w0.setBackgroundResource(k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_shape_progress", k.d));
            this.w0.setWidth(v.a(com.smartdigimkt.m6.b.p().k(), 30.0f));
            return;
        }
        this.w0.setBackgroundResource(k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_time_count_num_bg", k.d));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, v.a(com.smartdigimkt.m6.b.p().k(), 30.0f));
        int iA = v.a(com.smartdigimkt.m6.b.p().k(), 5.0f);
        layoutParams.setMargins(iA, 0, 0, 0);
        this.w0.setPadding(iA, 0, iA, 0);
        this.w0.setLayoutParams(layoutParams);
    }

    public void setCloseViewVisable(int i2) {
        this.x0.setVisibility(i2 == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i2) {
        this.w0.setVisibility(i2 == 0 ? 4 : 0);
    }

    public void setCreateWebView(WebView webView) {
        this.A0 = webView;
    }

    public void setNotchPadding(int i2, int i3, int i4, int i5) {
        if (i2 <= 0) {
            i2 = this.P0.getPaddingLeft();
        }
        if (i3 <= 0) {
            i3 = this.P0.getPaddingRight();
        }
        if (i4 <= 0) {
            i4 = this.P0.getPaddingTop();
        }
        if (i5 <= 0) {
            i5 = this.P0.getPaddingBottom();
        }
        String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        this.P0.setPadding(i2, i4, i3, i5);
    }

    public void setOrientation(int i2) {
        this.K0 = i2;
    }

    public void setPlaybackParams(float f) {
        PlayerView playerView = this.u0;
        if (playerView != null) {
            playerView.setPlaybackParams(f);
        }
    }

    public void setProgressBarState(int i2) {
        ProgressBar progressBar = this.Q0;
        if (progressBar != null) {
            progressBar.setVisibility(i2 == 0 ? 8 : 0);
        }
    }

    public void setShowClose(int i2) {
        this.D0 = i2;
    }

    public void setShowMute(int i2) {
        this.E0 = i2;
    }

    public void setShowTime(int i2) {
        this.C0 = i2;
    }

    public void setSoundImageViewVisble(int i2) {
        this.v0.setVisibility(i2 == 0 ? 4 : 0);
    }

    public void setVolume(float f, float f2) {
        PlayerView playerView = this.u0;
        if (playerView != null) {
            playerView.setVolume(f, f2);
        }
    }

    public void soundOperate(int i2, int i3, String str) {
        if (this.l0) {
            this.G0 = i2;
            if (i2 == 1) {
                this.v0.setSoundStatus(false);
                this.u0.closeSound();
            } else if (i2 == 2) {
                this.v0.setSoundStatus(true);
                this.u0.openSound();
            }
            if (i3 == 1) {
                this.v0.setVisibility(8);
            } else if (i3 == 2) {
                this.v0.setVisibility(0);
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.u0;
            if (playerView != null) {
                playerView.pause();
                this.u0.stop();
                try {
                    this.u0.prepare();
                    this.u0.justSeekTo(0);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                WebView webView = this.A0;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.h0);
                }
            }
        } catch (Exception e3) {
            e3.getMessage();
        }
    }

    private void c() {
        String str;
        if (this.f0.S() == 94 || this.f0.S() == 287) {
            str = this.f0.N1() + this.f0.j() + this.f0.u2();
        } else {
            str = this.f0.j() + this.f0.u2() + this.f0.e0();
        }
        com.smartdigimkt.c3.c cVarA = e.a().a(this.g0, str);
        if (cVarA != null) {
            this.B0 = cVarA;
        }
    }

    private boolean d() {
        try {
            this.u0 = (PlayerView) findViewById(findID("sdm_vfpv"));
            this.v0 = (SoundImageView) findViewById(findID("sdm_sound_switch"));
            this.w0 = (TextView) findViewById(findID("sdm_tv_count"));
            this.x0 = findViewById(findID("sdm_rl_playing_close"));
            this.P0 = (RelativeLayout) findViewById(findID("sdm_top_control"));
            this.Q0 = (ProgressBar) findViewById(findID("sdm_video_progress_bar"));
            this.u0.setIsBTVideo(true);
            this.y0 = (FeedBackButton) findViewById(findID("sdm_native_endcard_feed_btn"));
            this.z0 = (ImageView) findViewById(findID("sdm_iv_link"));
            return isNotNULL(this.u0, this.v0, this.w0, this.x0);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    @Override // com.smartdigimkt.expressad.video.bt.module.BTBaseView
    public void b() {
        super.b();
        if (this.l0) {
            this.v0.setOnClickListener(new a());
            this.x0.setOnClickListener(new b());
            setOnClickListener(new c());
        }
    }

    private int a(com.smartdigimkt.x.d dVar) {
        return com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), this.g0, false).o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i2, int i3) {
        if (i3 != 0) {
            try {
                return v.a(Double.valueOf(i2 / i3)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return androidx.datastore.preferences.protobuf.a.f(i3, "");
    }

    public AnythinkBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.G0 = 2;
        this.I0 = false;
        this.J0 = 2;
        this.K0 = 1;
        this.M0 = false;
        this.N0 = false;
        this.O0 = false;
    }

    private int b(com.smartdigimkt.x.d dVar) {
        if (dVar != null) {
            if (dVar.L1() != -1) {
                return dVar.L1();
            }
            return com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), this.g0, false).J();
        }
        return com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), this.g0, false).J();
    }
}
