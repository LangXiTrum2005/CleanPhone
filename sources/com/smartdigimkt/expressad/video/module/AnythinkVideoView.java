package com.smartdigimkt.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.smartdigimkt.expressad.atsignalcommon.commonwebview.CollapsibleWebView;
import com.smartdigimkt.expressad.atsignalcommon.commonwebview.CommonWebView;
import com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener;
import com.smartdigimkt.expressad.playercommon.PlayerView;
import com.smartdigimkt.expressad.video.dynview.widget.AnyThinkSegmentsProgressBar;
import com.smartdigimkt.expressad.video.dynview.widget.AnythinkBaitClickView;
import com.smartdigimkt.expressad.video.widget.SoundImageView;
import com.smartdigimkt.expressad.widget.FeedBackButton;
import com.smartdigimkt.expressad.widget.rewardpopview.ATAcquireRewardPopView;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.y;
import com.smartdigimkt.v0.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkVideoView extends AnythinkBaseView implements com.smartdigimkt.x2.j, com.smartdigimkt.x2.f {
    private static final String T1 = "sdm_reward_videoview_item";
    public static final String TAG = "AnythinkVideoView";
    private static final int U1 = 1;
    private static final float V1 = 1280.0f;
    private static final float W1 = 720.0f;
    private static final float X1 = 0.1f;
    private static int Y1 = 0;
    private static int Z1 = 0;
    private static int a2 = 0;
    private static int b2 = 0;
    private static int c2 = 0;
    private static final String d2 = "2";
    private static boolean e2 = false;
    private ImageView A0;
    private boolean A1;
    private boolean B0;
    private boolean B1;
    private AnyThinkSegmentsProgressBar C0;
    private boolean C1;
    private com.smartdigimkt.i2.a D0;
    private boolean D1;
    private int E0;
    private AlphaAnimation E1;
    private FrameLayout F0;
    private AnythinkBaitClickView F1;
    private AnythinkClickCTAView G0;
    private int G1;
    private com.smartdigimkt.y2.b H0;
    private int H1;
    private int I0;
    private int I1;
    private RelativeLayout J0;
    private int J1;
    private boolean K0;
    private com.smartdigimkt.i3.c K1;
    private com.smartdigimkt.t2.a L0;
    private ATAcquireRewardPopView L1;
    private int M0;
    private boolean M1;
    private RelativeLayout N0;
    private boolean N1;
    private CollapsibleWebView O0;
    private int O1;
    private RelativeLayout P0;
    private u P1;
    private com.smartdigimkt.s2.a Q0;
    private boolean Q1;
    com.smartdigimkt.i1.c R0;
    private Runnable R1;
    private boolean S0;
    private Runnable S1;
    private boolean T0;
    private boolean U0;
    private String V0;
    private int W0;
    private int X0;
    private int Y0;
    private int Z0;
    private com.smartdigimkt.h3.a a1;
    private com.smartdigimkt.h3.b b1;
    private String c1;
    private double d1;
    private double e1;
    private boolean f1;
    private boolean g1;
    private boolean h1;
    private boolean i1;
    private boolean j1;
    private boolean k1;
    private boolean l1;
    private boolean m1;
    public List<com.smartdigimkt.x.d> mCampOrderViewData;
    public int mCampaignSize;
    public int mCurrPlayNum;
    public int mCurrentPlayProgressTime;
    public int mMuteSwitch;
    private boolean n1;
    private int o1;
    private boolean p1;
    private int q1;
    private String r1;
    private PlayerView s0;
    private int s1;
    private SoundImageView t0;
    private int t1;
    public TextView tvFlag;
    private TextView u0;
    private int u1;
    private View v0;
    private boolean v1;
    private RelativeLayout w0;
    private boolean w1;
    private ImageView x0;
    private boolean x1;
    private ProgressBar y0;
    private boolean y1;
    private FeedBackButton z0;
    private boolean z1;

    public class b implements com.smartdigimkt.f0.c {

        public class a implements Runnable {
            final /* synthetic */ Bitmap X;

            /* JADX INFO: renamed from: com.smartdigimkt.expressad.video.module.AnythinkVideoView$b$a$a, reason: collision with other inner class name */
            public class RunnableC0476a implements Runnable {
                final /* synthetic */ Bitmap X;

                public RunnableC0476a(Bitmap bitmap) {
                    this.X = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    AnythinkVideoView.this.x0.setVisibility(0);
                    AnythinkVideoView.this.x0.setImageBitmap(this.X);
                }
            }

            public a(Bitmap bitmap) {
                this.X = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    AnythinkVideoView.this.x0.post(new RunnableC0476a(com.smartdigimkt.v0.h.a(this.X, 10)));
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
        }

        public b() {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    com.smartdigimkt.t0.a.b().execute(new a(bitmap));
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
    }

    public class c implements CollapsibleWebView.e {
        public c() {
        }

        @Override // com.smartdigimkt.expressad.atsignalcommon.commonwebview.CollapsibleWebView.e
        public void a(View view, Map<String, String> map) {
        }

        @Override // com.smartdigimkt.expressad.atsignalcommon.commonwebview.CollapsibleWebView.e
        public void b(View view, Map<String, String> map) {
            String str;
            String str2 = "";
            if (map != null) {
                String str3 = map.get("url");
                str2 = str3 != null ? str3 : "";
                str = map.get("description");
            } else {
                str = "";
            }
            a(str2, str);
        }

        @Override // com.smartdigimkt.expressad.atsignalcommon.commonwebview.CollapsibleWebView.e
        public void a(View view, String str) {
            JSONException jSONException;
            JSONObject jSONObject;
            if (AnythinkVideoView.this.N1) {
                return;
            }
            AnythinkVideoView.this.N1 = true;
            if (AnythinkVideoView.this.N0 != null && AnythinkVideoView.this.N0.getVisibility() != 0) {
                AnythinkVideoView.this.N0.setVisibility(0);
            }
            Context context = AnythinkVideoView.this.getContext();
            AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
            com.smartdigimkt.o.a.a(context, anythinkVideoView.f0, anythinkVideoView.getUnitId(), AnythinkVideoView.this.f0.r1(), true, false, com.smartdigimkt.q.a.r);
            if (AnythinkVideoView.this.L0 != null) {
                try {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put(com.smartdigimkt.b0.a.i2, AnythinkVideoView.this.a(0));
                    } catch (JSONException e2) {
                        jSONException = e2;
                        jSONException.printStackTrace();
                    }
                } catch (JSONException e3) {
                    jSONException = e3;
                    jSONObject = null;
                }
                AnythinkVideoView.this.L0.a(131, jSONObject);
            }
        }

        @Override // com.smartdigimkt.expressad.atsignalcommon.commonwebview.CollapsibleWebView.e
        public void b(View view, String str) {
            a(str, "timeout");
        }

        private void a(String str, String str2) {
            if (AnythinkVideoView.this.N1) {
                return;
            }
            AnythinkVideoView.this.N1 = true;
            if (AnythinkVideoView.this.N0 == null || AnythinkVideoView.this.N0.getVisibility() != 0) {
                return;
            }
            AnythinkVideoView.this.N0.setVisibility(8);
        }
    }

    public class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }
    }

    public class e implements CommonWebView.h {
        public e() {
        }

        @Override // com.smartdigimkt.expressad.atsignalcommon.commonwebview.CommonWebView.h
        public void a() {
            if (AnythinkVideoView.this.P0 != null) {
                AnythinkVideoView.this.P0.setVisibility(0);
            }
            if (AnythinkVideoView.this.O0 != null) {
                AnythinkVideoView.this.O0.setCustomizedToolBarMarginWidthPixel(0, 0, 0, 0);
            }
            AnythinkVideoView.this.n();
        }
    }

    public class f implements CommonWebView.h {
        public f() {
        }

        @Override // com.smartdigimkt.expressad.atsignalcommon.commonwebview.CommonWebView.h
        public void a() {
            if (AnythinkVideoView.this.P0 != null) {
                AnythinkVideoView.this.P0.setVisibility(8);
            }
            if (AnythinkVideoView.this.O0 != null) {
                AnythinkVideoView.this.O0.setCustomizedToolBarMarginWidthPixel(0, AnythinkVideoView.this.O1, 0, 0);
            }
            AnythinkVideoView.this.m();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AnythinkVideoView.this.P0 != null) {
                AnythinkVideoView.this.P0.setVisibility(0);
            }
            if (AnythinkVideoView.this.N0 != null) {
                AnythinkVideoView.this.N0.setVisibility(8);
            }
            if (AnythinkVideoView.this.z1) {
                return;
            }
            AnythinkVideoView.this.n();
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AnythinkVideoView.this.F0 != null) {
                AnythinkVideoView.this.F0.setVisibility(8);
            }
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AnythinkVideoView.this.b("bait_click_clicked");
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AnythinkVideoView.this.H1 <= 0) {
                AnythinkVideoView.this.showRewardPopView();
                AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                anythinkVideoView.removeCallbacks(anythinkVideoView.S1);
            } else {
                AnythinkVideoView.M(AnythinkVideoView.this);
                AnythinkVideoView anythinkVideoView2 = AnythinkVideoView.this;
                anythinkVideoView2.postDelayed(anythinkVideoView2.S1, 1000L);
            }
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AnythinkVideoView.this.i0 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.smartdigimkt.b0.a.i2, AnythinkVideoView.this.s0.buildH5JsonObject(0));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                AnythinkVideoView.this.i0.a(1, jSONObject);
            }
            AnythinkVideoView.this.setCTALayoutVisibleOrGone();
        }
    }

    public class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AnythinkVideoView.this.i0 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.smartdigimkt.b0.a.i2, AnythinkVideoView.this.s0.buildH5JsonObject(0));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                AnythinkVideoView.this.i0.a(1, jSONObject);
            }
        }
    }

    public class n implements View.OnClickListener {
        public n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Integer num = 2;
            if (AnythinkVideoView.this.s0 != null && AnythinkVideoView.this.s0.isSilent()) {
                num = 1;
            }
            if (num.intValue() == 1) {
                AnythinkVideoView.this.mMuteSwitch = 2;
            } else {
                AnythinkVideoView.this.mMuteSwitch = 1;
            }
            com.smartdigimkt.t2.a aVar = AnythinkVideoView.this.i0;
            if (aVar != null) {
                aVar.a(5, num);
            }
            if (AnythinkVideoView.this.Q0 != null) {
                AnythinkVideoView.this.Q0.a(num.intValue() == 2);
            }
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!AnythinkVideoView.this.p1) {
                com.smartdigimkt.x.d dVar = AnythinkVideoView.this.f0;
                if (dVar == null || dVar.U1() == null || AnythinkVideoView.this.f0.U1().g() != 5002010 || !AnythinkVideoView.this.z1) {
                    AnythinkVideoView.this.w();
                    return;
                }
                AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                if (anythinkVideoView.i0 != null) {
                    anythinkVideoView.M1 = true;
                    AnythinkVideoView anythinkVideoView2 = AnythinkVideoView.this;
                    anythinkVideoView2.i0.a(2, anythinkVideoView2.b(anythinkVideoView2.z1));
                    return;
                }
                return;
            }
            AnythinkVideoView.this.C1 = true;
            com.smartdigimkt.x.d dVar2 = AnythinkVideoView.this.f0;
            if (dVar2 != null && dVar2.U1() != null && AnythinkVideoView.this.f0.U1().g() == 5002010 && AnythinkVideoView.this.z1) {
                AnythinkVideoView anythinkVideoView3 = AnythinkVideoView.this;
                if (anythinkVideoView3.i0 != null) {
                    anythinkVideoView3.M1 = true;
                    AnythinkVideoView anythinkVideoView4 = AnythinkVideoView.this;
                    anythinkVideoView4.i0.a(2, anythinkVideoView4.b(anythinkVideoView4.z1));
                    return;
                }
                return;
            }
            if (AnythinkVideoView.this.y1) {
                AnythinkVideoView.this.w();
                return;
            }
            com.smartdigimkt.t2.a aVar = AnythinkVideoView.this.i0;
            if (aVar != null) {
                aVar.a(123, "");
            }
        }
    }

    public class p implements com.smartdigimkt.h3.b {
        public p() {
        }

        @Override // com.smartdigimkt.h3.b
        public void a() {
            AnythinkVideoView.this.S0 = false;
            AnythinkVideoView.this.x1 = true;
            AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
            anythinkVideoView.setShowingAlertViewCover(anythinkVideoView.S0);
            if (AnythinkVideoView.this.p1 && AnythinkVideoView.this.s1 == com.smartdigimkt.b0.a.v2) {
                AnythinkVideoView anythinkVideoView2 = AnythinkVideoView.this;
                if (anythinkVideoView2.i0 != null) {
                    anythinkVideoView2.M1 = true;
                    AnythinkVideoView anythinkVideoView3 = AnythinkVideoView.this;
                    anythinkVideoView3.i0.a(2, anythinkVideoView3.b(anythinkVideoView3.z1));
                    return;
                }
                return;
            }
            if (AnythinkVideoView.this.p1 && AnythinkVideoView.this.s1 == com.smartdigimkt.b0.a.w2) {
                AnythinkVideoView.this.n();
                return;
            }
            AnythinkVideoView anythinkVideoView4 = AnythinkVideoView.this;
            if (anythinkVideoView4.i0 != null) {
                anythinkVideoView4.M1 = true;
                AnythinkVideoView.this.i0.a(2, "");
            }
        }

        @Override // com.smartdigimkt.h3.b
        public void b() {
            c();
        }

        @Override // com.smartdigimkt.h3.b
        public void c() {
            AnythinkVideoView.this.S0 = false;
            AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
            anythinkVideoView.setShowingAlertViewCover(anythinkVideoView.S0);
            if (AnythinkVideoView.this.p1 && (AnythinkVideoView.this.s1 == com.smartdigimkt.b0.a.w2 || AnythinkVideoView.this.s1 == com.smartdigimkt.b0.a.v2)) {
                AnythinkVideoView.this.w1 = true;
                com.smartdigimkt.t2.a aVar = AnythinkVideoView.this.i0;
                if (aVar != null) {
                    aVar.a(124, "");
                }
                AnythinkVideoView.this.B1 = true;
                AnythinkVideoView.this.gonePlayingCloseView();
            }
            AnythinkVideoView.this.n();
        }
    }

    public class q implements com.smartdigimkt.f0.c {
        public q() {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            float width = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
            int iA = v.a(AnythinkVideoView.this.e0, 12.0f);
            ImageView imageView = new ImageView(AnythinkVideoView.this.e0);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setImageBitmap(bitmap);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (iA * width), iA);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = v.a(AnythinkVideoView.this.e0, 5.0f);
            layoutParams.rightMargin = v.a(AnythinkVideoView.this.e0, 12.0f);
            AnythinkVideoView.this.addView(imageView, layoutParams);
        }
    }

    public class r implements Runnable {
        public r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AnythinkVideoView.this.m1 = true;
        }
    }

    public class s implements Runnable {
        final /* synthetic */ int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ int f34818Y;
        final /* synthetic */ int Z;
        final /* synthetic */ int e0;

        public s(int i2, int i3, int i4, int i5) {
            this.X = i2;
            this.f34818Y = i3;
            this.Z = i4;
            this.e0 = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AnythinkVideoView.this.w0 == null) {
                return;
            }
            AnythinkVideoView.this.w0.setVisibility(0);
            com.smartdigimkt.x.d dVar = AnythinkVideoView.this.f0;
            if (dVar != null && !dVar.H2() && AnythinkVideoView.this.f0.R() != 2) {
                AnythinkVideoView.this.w0.setPadding(this.X, this.f34818Y, this.Z, this.e0);
                AnythinkVideoView.this.w0.startAnimation(AnythinkVideoView.this.E1);
            }
            AnythinkVideoView.this.w0.setVisibility(0);
        }
    }

    public static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f34821c;

        public String toString() {
            StringBuilder sb = new StringBuilder("ProgressData{curPlayPosition=");
            sb.append(this.f34819a);
            sb.append(", allDuration=");
            return android.support.v4.media.a.p(sb, this.f34820b, AbstractJsonLexerKt.END_OBJ);
        }
    }

    public static final class u extends DefaultVideoPlayerStatusListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AnythinkVideoView f34822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f34823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f34824c;
        private int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f34825e;
        private boolean j;
        private String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.smartdigimkt.x.d f34828l;
        private int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f34829n;
        private t f = new t();
        private boolean g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f34826h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f34827i = false;
        private boolean o = false;

        public u(AnythinkVideoView anythinkVideoView) {
            this.f34822a = anythinkVideoView;
        }

        private void d() {
        }

        private void f() {
            AnythinkVideoView anythinkVideoView = this.f34822a;
            if (anythinkVideoView == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) anythinkVideoView.u0.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = v.a(com.smartdigimkt.m6.b.p().k(), 25.0f);
                this.f34822a.u0.setLayoutParams(layoutParams);
            }
            int iA = v.a(com.smartdigimkt.m6.b.p().k(), 5.0f);
            this.f34822a.u0.setPadding(iA, 0, iA, 0);
        }

        public com.smartdigimkt.x.d a() {
            return this.f34828l;
        }

        public int b() {
            return this.f34823b;
        }

        public int c() {
            return this.d;
        }

        public void e() {
            this.f34822a = null;
            boolean unused = AnythinkVideoView.e2 = false;
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onBufferingEnd() {
            com.smartdigimkt.t2.a aVar;
            try {
                super.onBufferingEnd();
                AnythinkVideoView anythinkVideoView = this.f34822a;
                if (anythinkVideoView == null || (aVar = anythinkVideoView.i0) == null) {
                    return;
                }
                aVar.a(14, "");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onBufferingStart(String str) {
            com.smartdigimkt.t2.a aVar;
            try {
                super.onBufferingStart(str);
                AnythinkVideoView anythinkVideoView = this.f34822a;
                if (anythinkVideoView == null || (aVar = anythinkVideoView.i0) == null) {
                    return;
                }
                aVar.a(13, "");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onPlayCompleted() {
            com.smartdigimkt.t2.a aVar;
            AnythinkVideoView anythinkVideoView;
            super.onPlayCompleted();
            this.f34822a.z1 = true;
            if (this.f34828l != null) {
                this.f34822a.u0.setText(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_complete", com.smartdigimkt.v0.k.f38992h));
                this.f34828l.w0(100);
                if (this.f34828l.R() == 2) {
                    this.f34822a.v0.setVisibility(4);
                    if (this.f34822a.z0 != null) {
                        this.f34822a.z0.setClickable(false);
                    }
                    if (this.f34822a.t0 != null) {
                        this.f34822a.t0.setClickable(false);
                    }
                }
            } else {
                this.f34822a.u0.setText("0");
            }
            this.f34822a.s0.setClickable(false);
            String strB = this.f34822a.b(true);
            com.smartdigimkt.x.d dVar = this.f34828l;
            if (dVar != null && dVar.t0() == 5 && (anythinkVideoView = this.f34822a) != null && anythinkVideoView.D0 != null) {
                AnythinkVideoView anythinkVideoView2 = this.f34822a;
                if (anythinkVideoView2.mCampaignSize > anythinkVideoView2.mCurrPlayNum) {
                    HashMap map = new HashMap();
                    map.put("position", Integer.valueOf(this.f34822a.mCurrPlayNum));
                    int i2 = this.f34822a.mMuteSwitch;
                    if (i2 != 0) {
                        map.put("mute", Integer.valueOf(i2));
                    }
                    this.f34822a.D0.a(map);
                    return;
                }
            }
            AnythinkVideoView anythinkVideoView3 = this.f34822a;
            if (anythinkVideoView3 != null && (aVar = anythinkVideoView3.i0) != null) {
                aVar.a(121, "");
                this.f34822a.i0.a(11, strB);
            }
            int i3 = this.f34824c;
            this.f34823b = i3;
            this.f34822a.mCurrentPlayProgressTime = i3;
            boolean unused = AnythinkVideoView.e2 = true;
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onPlayError(String str) {
            com.smartdigimkt.t2.a aVar;
            super.onPlayError(str);
            AnythinkVideoView anythinkVideoView = this.f34822a;
            if (anythinkVideoView == null || (aVar = anythinkVideoView.i0) == null) {
                return;
            }
            aVar.a(12, str);
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onPlayProgress(int i2, int i3) {
            String str;
            com.smartdigimkt.x.d dVar;
            com.smartdigimkt.t2.a aVar;
            int iO2;
            super.onPlayProgress(i2, i3);
            if (this.f34822a.j0) {
                com.smartdigimkt.x.d dVar2 = this.f34828l;
                if (dVar2 != null) {
                    iO2 = dVar2.o2();
                    if (iO2 <= 0) {
                        iO2 = i3;
                    }
                    com.smartdigimkt.z.b.b().b(this.f34828l.i0() + "_1", i2);
                } else {
                    iO2 = 0;
                }
                if (this.f34828l.H2() && this.f34828l.t0() == 5) {
                    try {
                        b(iO2, this.f34822a.E0, i2);
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                } else {
                    a(iO2, i3, i2);
                    this.f.f34819a = i2;
                }
            }
            this.f34824c = i3;
            AnythinkVideoView anythinkVideoView = this.f34822a;
            anythinkVideoView.mCurrentPlayProgressTime = i2;
            t tVar = this.f;
            tVar.f34819a = i2;
            tVar.f34820b = i3;
            tVar.f34821c = anythinkVideoView.B1;
            this.f34823b = i2;
            AnythinkVideoView anythinkVideoView2 = this.f34822a;
            if (anythinkVideoView2 != null && (aVar = anythinkVideoView2.i0) != null) {
                aVar.a(15, this.f);
            }
            if (this.f34822a.p1 && !this.f34822a.v1 && this.f34822a.s1 == com.smartdigimkt.b0.a.w2) {
                this.f34822a.w();
            }
            try {
                AnythinkVideoView anythinkVideoView3 = this.f34822a;
                if (anythinkVideoView3 != null && anythinkVideoView3.C0 != null) {
                    int i4 = (i2 * 100) / i3;
                    this.f34822a.C0.setProgress(i4, this.f34822a.mCurrPlayNum - 1);
                    this.f34828l.w0(i4);
                }
                AnythinkVideoView anythinkVideoView4 = this.f34822a;
                if (anythinkVideoView4 != null) {
                    int i5 = anythinkVideoView4.M0 != -5 ? this.f34822a.M0 : this.f34822a.I0;
                    if (i5 != -1 && i2 == i5 && (dVar = this.f34822a.f0) != null && dVar.H2()) {
                        this.f34822a.setCTALayoutVisibleOrGone();
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            int i6 = this.m;
            if (i6 == 100 || this.o || i6 == 0) {
                return;
            }
            if (this.f34829n > i6) {
                this.f34829n = i6 / 2;
            }
            int i7 = this.f34829n;
            if (i7 < 0 || i2 < (i3 * i7) / 100) {
                return;
            }
            if (this.f34828l.S() == 94 || this.f34828l.S() == 287) {
                str = this.f34828l.N1() + this.f34828l.j() + this.f34828l.u2();
            } else {
                str = this.f34828l.j() + this.f34828l.u2() + this.f34828l.e0();
            }
            com.smartdigimkt.c3.c cVarA = com.smartdigimkt.c3.e.a().a(this.k, str);
            if (cVarA != null) {
                cVarA.v();
                this.o = true;
            }
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onPlayStarted(int i2) {
            com.smartdigimkt.t2.a aVar;
            super.onPlayStarted(i2);
            if (!this.f34825e) {
                AnythinkVideoView anythinkVideoView = this.f34822a;
                if (anythinkVideoView != null) {
                    anythinkVideoView.B0 = true;
                }
                AnythinkVideoView anythinkVideoView2 = this.f34822a;
                if (anythinkVideoView2 != null && (aVar = anythinkVideoView2.i0) != null) {
                    aVar.a(10, this.f);
                }
                this.f34825e = true;
            }
            this.d = i2;
            com.smartdigimkt.x.d dVar = this.f34828l;
            if (dVar != null) {
                int iO2 = dVar.o2();
                if (iO2 <= 0) {
                    iO2 = i2;
                }
                if (this.f34828l.H2()) {
                    b(iO2);
                } else {
                    a(iO2);
                }
            }
            if (this.f34822a.y0 != null) {
                this.f34822a.y0.setMax(i2);
            }
            com.smartdigimkt.x.d dVar2 = this.f34828l;
            if (dVar2 != null && dVar2.R() == 2) {
                this.f34822a.w0.setVisibility(0);
            }
            if (this.f34822a.u0.getVisibility() == 0) {
                this.f34822a.e();
            }
            boolean unused = AnythinkVideoView.e2 = false;
            if (this.f34822a != null && this.f34828l.H2()) {
                if (this.f34822a.M0 != -5) {
                    if (this.f34822a.M0 == 0) {
                        this.f34822a.setCTALayoutVisibleOrGone();
                    }
                } else if (this.f34822a.I0 == 0) {
                    this.f34822a.setCTALayoutVisibleOrGone();
                }
            }
            this.f34822a.showMoreOfferInPlayTemplate();
            this.f34822a.showBaitClickView();
            this.f34822a.o();
        }

        @Override // com.smartdigimkt.expressad.playercommon.DefaultVideoPlayerStatusListener, com.smartdigimkt.expressad.playercommon.VideoPlayerStatusListener
        public void onVideoDownloadResume() {
            String str;
            if (this.f34828l.S() == 94 || this.f34828l.S() == 287) {
                str = this.f34828l.N1() + this.f34828l.j() + this.f34828l.u2();
            } else {
                str = this.f34828l.j() + this.f34828l.u2() + this.f34828l.e0();
            }
            com.smartdigimkt.c3.c cVarA = com.smartdigimkt.c3.e.a().a(this.k, str);
            if (cVarA != null) {
                cVarA.v();
                this.o = true;
            }
        }

        private void b(int i2) {
            AnythinkVideoView anythinkVideoView = this.f34822a;
            if (anythinkVideoView == null || anythinkVideoView.u0 == null) {
                return;
            }
            String str = "sdm_reward_video_time_count_num_bg";
            if (this.f34828l.t0() == 5) {
                AnythinkVideoView anythinkVideoView2 = this.f34822a;
                if (anythinkVideoView2.mCurrPlayNum > 1 && i2 <= 0) {
                    anythinkVideoView2.u0.setBackgroundResource(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_time_count_num_bg", com.smartdigimkt.v0.k.d));
                    f();
                    return;
                }
            }
            if (i2 <= 0) {
                str = "sdm_reward_shape_progress";
            } else if (!this.j || this.f34828l.t0() == 5) {
                f();
            }
            com.smartdigimkt.x.d dVar = this.f34828l;
            if (dVar != null && dVar.j2() == 1 && this.j) {
                f();
            }
            this.f34822a.u0.setBackgroundResource(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), str, com.smartdigimkt.v0.k.d));
        }

        public void a(com.smartdigimkt.x.d dVar) {
            this.f34828l = dVar;
        }

        public void a(boolean z2) {
            this.j = z2;
        }

        public void a(String str) {
            this.k = str;
        }

        public void a(int i2, int i3) {
            this.m = i2;
            this.f34829n = i3;
            d();
        }

        private void a(int i2) {
            if (i2 > 0) {
                this.f34822a.u0.setBackgroundResource(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_time_count_num_bg", com.smartdigimkt.v0.k.d));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, v.a(com.smartdigimkt.m6.b.p().k(), 30.0f));
                int iA = v.a(com.smartdigimkt.m6.b.p().k(), 5.0f);
                layoutParams.addRule(1, com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_native_endcard_feed_btn", "id"));
                layoutParams.setMargins(iA, 0, 0, 0);
                this.f34822a.u0.setPadding(iA, 0, iA, 0);
                this.f34822a.u0.setLayoutParams(layoutParams);
                return;
            }
            this.f34822a.u0.setBackgroundResource(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_shape_progress", com.smartdigimkt.v0.k.d));
        }

        private void b(int i2, int i3, int i4) {
            int i5;
            AnythinkVideoView anythinkVideoView = this.f34822a;
            if (anythinkVideoView == null) {
                return;
            }
            String strF = (String) anythinkVideoView.getContext().getResources().getText(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_complete", com.smartdigimkt.v0.k.f38992h));
            String str = (String) this.f34822a.getContext().getResources().getText(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_left", com.smartdigimkt.v0.k.f38992h));
            if (i2 >= 0) {
                if (this.f34828l.j2() == 1) {
                    int iMin = Math.min(this.f34822a.W0, i2);
                    if (iMin >= i2 || iMin <= 0) {
                        i5 = i2 - i4;
                        if (this.j) {
                            if (i5 <= 0) {
                                this.f34822a.u0.setVisibility(4);
                            } else {
                                str = (String) this.f34822a.getContext().getResources().getText(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_left_skip_time", com.smartdigimkt.v0.k.f38992h));
                            }
                        }
                    } else {
                        i5 = iMin - i4;
                        if (i5 <= 0) {
                            i5 = i2 - i4;
                            if (this.j) {
                                this.f34822a.u0.setVisibility(4);
                            }
                        } else {
                            str = (String) this.f34822a.getContext().getResources().getText(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_left_skip_time", com.smartdigimkt.v0.k.f38992h));
                        }
                    }
                } else {
                    i5 = i2 - i4;
                }
                if (i5 > 0) {
                    strF = androidx.datastore.preferences.protobuf.a.f(i5, str);
                }
            } else {
                i5 = i3 - i4;
                if (i5 > 0) {
                    strF = i2 <= 0 ? androidx.datastore.preferences.protobuf.a.f(i5, "") : androidx.datastore.preferences.protobuf.a.f(i5, str);
                } else if (i2 <= 0) {
                    strF = "0";
                }
            }
            this.f.f34819a = i4;
            this.f34822a.u0.setText(strF);
            if (this.f34822a.y0 != null && this.f34822a.y0.getVisibility() == 0) {
                this.f34822a.y0.setProgress(i4);
            }
            if (i5 >= this.f34822a.J1 || this.f34822a.L1 == null || !this.f34822a.U0) {
                return;
            }
            this.f34822a.L1.onTimeLessThanReduce(i5);
        }

        private void a(int i2, int i3, int i4) {
            String strF;
            AnythinkVideoView anythinkVideoView = this.f34822a;
            if (anythinkVideoView == null) {
                return;
            }
            if (!this.j) {
                if (i2 > i3) {
                    i2 = i3;
                }
                int i5 = i2 <= 0 ? i3 - i4 : i2 - i4;
                if (i5 <= 0) {
                    i5 = 0;
                    strF = i2 <= 0 ? "0" : (String) anythinkVideoView.getContext().getResources().getText(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_complete", com.smartdigimkt.v0.k.f38992h));
                } else if (i2 <= 0) {
                    strF = androidx.datastore.preferences.protobuf.a.f(i5, "");
                } else {
                    strF = i5 + ((String) this.f34822a.getContext().getResources().getText(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_left", com.smartdigimkt.v0.k.f38992h)));
                }
                if (i5 < this.f34822a.J1 && this.f34822a.L1 != null && this.f34822a.U0) {
                    this.f34822a.L1.onTimeLessThanReduce(i5);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(i3 - i4);
                strF = sb.toString();
            }
            com.smartdigimkt.x.d dVar = this.f34828l;
            if (dVar != null && dVar.j2() == 1) {
                int iMin = Math.min(this.f34822a.W0, i3);
                if (iMin >= i2 || iMin < 0) {
                    int i6 = i2 - i4;
                    if (this.j) {
                        if (i6 > 0) {
                            strF = i6 + ((String) this.f34822a.getContext().getResources().getText(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_left_skip_time", com.smartdigimkt.v0.k.f38992h)));
                        } else if (i6 == 0) {
                            this.f34822a.u0.setVisibility(4);
                        }
                    }
                } else {
                    int i7 = iMin - i4;
                    if (i7 > 0) {
                        strF = i7 + ((String) this.f34822a.getContext().getResources().getText(com.smartdigimkt.v0.k.a(com.smartdigimkt.m6.b.p().k(), "sdm_reward_video_view_reward_time_left_skip_time", com.smartdigimkt.v0.k.f38992h)));
                    } else if (this.j && i7 == 0) {
                        this.f34822a.u0.setVisibility(4);
                    }
                }
            }
            this.f34822a.u0.setText(strF);
            if (this.f34822a.y0 == null || this.f34822a.y0.getVisibility() != 0) {
                return;
            }
            this.f34822a.y0.setProgress(i4);
        }
    }

    public AnythinkVideoView(Context context) {
        super(context);
        this.mMuteSwitch = 0;
        this.E0 = 0;
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.K0 = false;
        this.S0 = false;
        this.T0 = false;
        this.U0 = false;
        this.c1 = "";
        this.f1 = false;
        this.g1 = false;
        this.h1 = false;
        this.i1 = false;
        this.j1 = false;
        this.k1 = false;
        this.l1 = false;
        this.m1 = false;
        this.n1 = false;
        this.p1 = false;
        this.q1 = 2;
        this.v1 = false;
        this.w1 = false;
        this.x1 = false;
        this.y1 = true;
        this.z1 = false;
        this.A1 = false;
        this.B1 = false;
        this.C1 = false;
        this.D1 = false;
        this.G1 = 0;
        this.H1 = 5;
        this.I1 = 5;
        this.J1 = 5;
        this.M1 = false;
        this.N1 = false;
        this.O1 = 0;
        this.P1 = new u(this);
        this.Q1 = false;
        this.R1 = new h();
        this.S1 = new k();
    }

    public static /* synthetic */ int M(AnythinkVideoView anythinkVideoView) {
        int i2 = anythinkVideoView.H1;
        anythinkVideoView.H1 = i2 - 1;
        return i2;
    }

    private int getVideoAllDuration() {
        try {
            u uVar = this.P1;
            int iC = uVar != null ? uVar.c() : 0;
            return iC == 0 ? this.f0.t() : iC;
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoCompleteTime() {
        int iO2 = 0;
        try {
            int videoAllDuration = getVideoAllDuration();
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar != null) {
                iO2 = dVar.o2();
                if (this.f0.t0() != 5 && iO2 > videoAllDuration) {
                    iO2 = videoAllDuration;
                }
                if (iO2 > 0) {
                    return iO2;
                }
            }
            return videoAllDuration;
        } catch (Throwable th) {
            th.getMessage();
            return iO2;
        }
    }

    private void r() {
    }

    private void setBlurBackgroundImage(String str) {
        com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(str, new b());
    }

    private void setPlayerViewRadius(int i2) {
        if (i2 > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(v.a(getContext(), i2));
            gradientDrawable.setColor(-1);
            gradientDrawable.setStroke(1, 0);
            setBackground(gradientDrawable);
            this.s0.setBackground(gradientDrawable);
            setClipToOutline(true);
            this.s0.setClipToOutline(true);
        }
    }

    @Override // com.smartdigimkt.x2.j
    public void alertWebViewShowed() {
        this.S0 = true;
        setShowingAlertViewCover(true);
    }

    @Override // com.smartdigimkt.x2.j
    public void closeVideoOperate(int i2, int i3) {
        if (i2 == 1) {
            this.C1 = true;
            if (getVisibility() == 0) {
                w();
            }
        }
        if (i3 == 1) {
            gonePlayingCloseView();
        } else if (i3 == 2) {
            if (this.B1 && getVisibility() == 0) {
                return;
            }
            v();
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
        this.f1 = true;
        showVideoLocation(0, 0, v.g(this.e0), v.f(this.e0), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.W0 == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    @Override // com.smartdigimkt.x2.j
    public void dismissAllAlert() {
        com.smartdigimkt.h3.a aVar = this.a1;
        if (aVar != null) {
            aVar.dismiss();
        }
        com.smartdigimkt.t2.a aVar2 = this.i0;
        if (aVar2 != null) {
            aVar2.a(125, "");
        }
    }

    @Override // com.smartdigimkt.x2.j
    public int getBorderViewHeight() {
        return c2;
    }

    @Override // com.smartdigimkt.x2.j
    public int getBorderViewLeft() {
        return a2;
    }

    @Override // com.smartdigimkt.x2.j
    public int getBorderViewRadius() {
        return Y1;
    }

    @Override // com.smartdigimkt.x2.j
    public int getBorderViewTop() {
        return Z1;
    }

    @Override // com.smartdigimkt.x2.j
    public int getBorderViewWidth() {
        return b2;
    }

    public int getCloseAlert() {
        return this.Y0;
    }

    @Override // com.smartdigimkt.x2.j
    public String getCurrentProgress() {
        try {
            int iB = this.P1.b();
            com.smartdigimkt.x.d dVar = this.f0;
            int iT = dVar != null ? dVar.t() : 0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(iB, iT));
            jSONObject.put("time", iB);
            jSONObject.put("duration", iT + "");
            return jSONObject.toString();
        } catch (Throwable th) {
            th.getMessage();
            return JsonUtils.EMPTY_JSON;
        }
    }

    public int getMute() {
        return this.q1;
    }

    public String getUnitId() {
        return this.c1;
    }

    public int getVideoSkipTime() {
        return this.W0;
    }

    public void gonePlayingCloseView() {
        if (this.j0 && this.v0.getVisibility() != 8) {
            this.v0.setVisibility(8);
            this.j1 = false;
        }
        h();
    }

    @Override // com.smartdigimkt.x2.j
    public void hideAlertView(int i2) {
        if (this.S0) {
            this.S0 = false;
            this.v1 = true;
            setShowingAlertViewCover(false);
            com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), this.c1, false).d();
            if (i2 == 0) {
                n();
                if (this.p1) {
                    int i3 = this.s1;
                    if (i3 == com.smartdigimkt.b0.a.w2 || i3 == com.smartdigimkt.b0.a.v2) {
                        this.w1 = true;
                        com.smartdigimkt.t2.a aVar = this.i0;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        com.smartdigimkt.x.d dVar = this.f0;
                        if (dVar != null && dVar.U1() != null && this.f0.U1().g() == 5002010) {
                            v();
                            return;
                        } else {
                            this.B1 = true;
                            gonePlayingCloseView();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            this.x1 = true;
            boolean z2 = this.p1;
            if (z2 && this.s1 == com.smartdigimkt.b0.a.w2) {
                n();
                return;
            }
            if (z2 && this.s1 == com.smartdigimkt.b0.a.v2) {
                com.smartdigimkt.t2.a aVar2 = this.i0;
                if (aVar2 != null) {
                    this.M1 = true;
                    aVar2.a(2, b(this.z1));
                    return;
                }
                return;
            }
            com.smartdigimkt.t2.a aVar3 = this.i0;
            if (aVar3 != null) {
                this.M1 = true;
                aVar3.a(2, "");
            }
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    @Override // com.smartdigimkt.x2.j
    public boolean isH5Canvas() {
        return getLayoutParams().height < v.f(this.e0.getApplicationContext());
    }

    public boolean isInstallDialogShowing() {
        return this.T0;
    }

    public boolean isMiniCardShowing() {
        return this.i1;
    }

    public boolean isRewardPopViewShowing() {
        return this.U0;
    }

    public boolean isShowingAlertView() {
        return this.S0;
    }

    public boolean isShowingTransparent() {
        return this.n1;
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i2 = iIndexOfChild + 1;
        boolean z2 = false;
        while (i2 <= childCount - 1) {
            if (viewGroup.getChildAt(i2).getVisibility() == 0 && this.i1) {
                return false;
            }
            i2++;
            z2 = true;
        }
        return z2;
    }

    @Override // com.smartdigimkt.x2.j
    public void notifyCloseBtn(int i2) {
        if (i2 == 0) {
            this.k1 = true;
            this.m1 = false;
        } else if (i2 == 1) {
            this.l1 = true;
        }
    }

    public void notifyVideoClose() {
        this.M1 = true;
        this.i0.a(2, "");
    }

    public void onActivityPause() {
        try {
            ATAcquireRewardPopView aTAcquireRewardPopView = this.L1;
            if (aTAcquireRewardPopView != null) {
                aTAcquireRewardPopView.onPause();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void onActivityResume() {
        try {
            ATAcquireRewardPopView aTAcquireRewardPopView = this.L1;
            if (aTAcquireRewardPopView != null) {
                aTAcquireRewardPopView.onResume();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void onActivityStop() {
        try {
            ATAcquireRewardPopView aTAcquireRewardPopView = this.L1;
            if (aTAcquireRewardPopView != null) {
                aTAcquireRewardPopView.onStop();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void onBackPress() {
        boolean z2;
        if (this.i1 || this.S0 || this.w1) {
            return;
        }
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar != null && dVar.U1() != null && this.f0.U1().g() == 5002010 && (z2 = this.z1)) {
            com.smartdigimkt.t2.a aVar = this.i0;
            if (aVar != null) {
                this.M1 = true;
                aVar.a(2, b(z2));
                return;
            }
            return;
        }
        if (this.j1) {
            w();
            return;
        }
        boolean z3 = this.k1;
        if (z3 && this.l1) {
            w();
        } else {
            if (z3 || !this.m1) {
                return;
            }
            w();
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.smartdigimkt.x.d dVar = this.f0;
        if ((dVar == null || !dVar.H2()) && this.j0 && this.f1) {
            s();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.R1 != null) {
                getHandler().removeCallbacks(this.R1);
            }
            if (this.G1 != 0) {
                removeCallbacks(this.S1);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.x2.f
    public void preLoadData(com.smartdigimkt.y2.b bVar) {
        this.H0 = bVar;
        if (!this.j0) {
            com.smartdigimkt.t2.a aVar = this.i0;
            if (aVar != null) {
                aVar.a(12, "AnyThinkVideoView initSuccess false");
            }
        } else if (!TextUtils.isEmpty(this.V0) && this.f0 != null) {
            j();
            com.smartdigimkt.i1.c cVar = this.R0;
            if (cVar != null) {
                cVar.e();
            }
            this.s0.setTempEventListener(this.R0);
            this.s0.initBufferIngParam(this.X0);
            this.s0.initVFPData(this.V0, this.f0.u2(), this.f0.L1(), this.P1);
            soundOperate(this.q1, -1, null);
        }
        e2 = false;
    }

    @Override // com.smartdigimkt.x2.j
    public void progressBarOperate(int i2) {
        ProgressBar progressBar;
        if (this.j0) {
            if (i2 == 1) {
                ProgressBar progressBar2 = this.y0;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                }
                return;
            }
            if (i2 != 2 || (progressBar = this.y0) == null) {
                return;
            }
            progressBar.setVisibility(0);
        }
    }

    @Override // com.smartdigimkt.x2.j
    public void progressOperate(int i2, int i3) {
        PlayerView playerView;
        if (this.j0) {
            com.smartdigimkt.x.d dVar = this.f0;
            int iT = dVar != null ? dVar.t() : 0;
            if (i2 > 0 && i2 <= iT && (playerView = this.s0) != null) {
                playerView.seekTo(i2 * 1000);
            }
            if (i3 == 1) {
                this.u0.setVisibility(8);
            } else if (i3 == 2) {
                this.u0.setVisibility(0);
            }
            if (this.u0.getVisibility() == 0) {
                e();
            }
        }
    }

    public void releasePlayer() {
        try {
            PlayerView playerView = this.s0;
            if (playerView != null && !this.h1) {
                playerView.release();
            }
            u uVar = this.P1;
            if (uVar != null) {
                uVar.e();
            }
            if (this.L0 != null) {
                this.L0 = null;
            }
            if (this.Q0 != null) {
                this.Q0 = null;
            }
        } catch (Exception e3) {
            e3.getMessage();
        }
    }

    public void setBufferTimeout(int i2) {
        this.X0 = i2;
    }

    public void setCTALayoutVisibleOrGone() {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || this.F0 == null) {
            return;
        }
        if (dVar.U1() == null || this.f0.U1().g() != 902) {
            int i2 = this.M0;
            if (i2 != -5) {
                if (i2 == -3) {
                    return;
                }
                if (this.G0 == null) {
                    d();
                }
                if (this.M0 == -1) {
                    if (this.F0.getVisibility() != 0) {
                        this.F0.setVisibility(0);
                        postDelayed(this.R1, com.smartdigimkt.u2.m.D0);
                    } else {
                        this.F0.setVisibility(8);
                        getHandler().removeCallbacks(this.R1);
                    }
                }
                if (this.M0 >= 0) {
                    this.F0.setVisibility(0);
                    return;
                }
                return;
            }
            if (this.I0 < -1) {
                return;
            }
            if (this.G0 == null) {
                d();
            }
            int i3 = this.I0;
            if (i3 >= 0) {
                this.F0.setVisibility(0);
                return;
            }
            if (i3 == -1) {
                if (this.F0.getVisibility() != 0) {
                    this.F0.setVisibility(0);
                    postDelayed(this.R1, com.smartdigimkt.u2.m.D0);
                } else {
                    this.F0.setVisibility(8);
                    getHandler().removeCallbacks(this.R1);
                }
            }
        }
    }

    public void setCamPlayOrderCallback(com.smartdigimkt.i2.a aVar, List<com.smartdigimkt.x.d> list, int i2, int i3) {
        AnyThinkSegmentsProgressBar anyThinkSegmentsProgressBar;
        this.D0 = aVar;
        this.mCampaignSize = list.size();
        this.mCurrPlayNum = i2;
        this.E0 = i3;
        this.mCampOrderViewData = list;
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null) {
            return;
        }
        if (dVar.t0() != 5) {
            com.smartdigimkt.x.d dVar2 = this.f0;
            if (dVar2 == null || dVar2.G1() != 1 || (anyThinkSegmentsProgressBar = this.C0) == null) {
                return;
            }
            anyThinkSegmentsProgressBar.init(1, 3);
            this.C0.setVisibility(0);
            return;
        }
        AnyThinkSegmentsProgressBar anyThinkSegmentsProgressBar2 = this.C0;
        if (anyThinkSegmentsProgressBar2 == null || this.mCampOrderViewData == null) {
            return;
        }
        if (this.mCampaignSize > 1) {
            anyThinkSegmentsProgressBar2.setVisibility(0);
            this.C0.init(this.mCampaignSize, 2);
            for (int i4 = 0; i4 < this.mCampOrderViewData.size(); i4++) {
                int iR2 = this.mCampOrderViewData.get(i4).r2();
                if (iR2 > 0) {
                    this.C0.setProgress(iR2, i4);
                }
                if (this.mCampOrderViewData.get(i4).p3) {
                    this.K0 = true;
                }
            }
            return;
        }
        com.smartdigimkt.x.d dVar3 = this.f0;
        if (dVar3 == null || dVar3.G1() != 1) {
            this.C0.setVisibility(8);
            return;
        }
        AnyThinkSegmentsProgressBar anyThinkSegmentsProgressBar3 = this.C0;
        if (anyThinkSegmentsProgressBar3 != null) {
            anyThinkSegmentsProgressBar3.init(1, 3);
            this.C0.setVisibility(0);
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void setCampaign(com.smartdigimkt.x.d dVar) {
        super.setCampaign(dVar);
        u uVar = this.P1;
        if (uVar != null) {
            uVar.a(dVar);
            this.P1.a(b(dVar), a(dVar));
        }
    }

    public void setCloseAlert(int i2) {
        this.Y0 = i2;
    }

    public void setContainerViewOnNotifyListener(com.smartdigimkt.t2.a aVar) {
        this.L0 = aVar;
    }

    @Override // com.smartdigimkt.x2.j
    public void setCover(boolean z2) {
        if (this.j0) {
            this.s0.setIsCovered(z2);
        }
    }

    public void setDialogRole(int i2) {
        this.y1 = i2 == 1;
    }

    public void setIVRewardEnable(int i2, int i3, int i4) {
        this.s1 = i2;
        this.t1 = i3;
        this.u1 = i4;
    }

    @Override // com.smartdigimkt.x2.j
    public void setInstallDialogState(boolean z2) {
        this.T0 = z2;
        this.s0.setIsCovered(z2);
    }

    public void setIsIV(boolean z2) {
        this.p1 = z2;
        u uVar = this.P1;
        if (uVar != null) {
            uVar.a(z2);
        }
    }

    @Override // com.smartdigimkt.x2.j
    public void setMiniEndCardState(boolean z2) {
        this.i1 = z2;
    }

    public void setNotchPadding(int i2, int i3, int i4, int i5) {
        RelativeLayout relativeLayout;
        AnythinkVideoView anythinkVideoView;
        try {
            String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            int i6 = layoutParams.leftMargin;
            int i7 = layoutParams.rightMargin;
            int i8 = layoutParams.topMargin;
            int i9 = layoutParams.bottomMargin;
            this.O1 = i4;
            if (Math.max(Math.max(i6, i7), Math.max(i8, i9)) <= Math.max(Math.max(i2, i3), Math.max(i4, i5)) && (relativeLayout = this.w0) != null) {
                anythinkVideoView = this;
                try {
                    relativeLayout.postDelayed(anythinkVideoView.new s(i2, i4, i3, i5), 200L);
                } catch (Exception e3) {
                    e = e3;
                    e.getMessage();
                    return;
                }
            } else {
                anythinkVideoView = this;
            }
            if (anythinkVideoView.u0.getVisibility() == 0) {
                e();
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public void setPlayURL(String str) {
        this.V0 = str;
    }

    @Override // com.smartdigimkt.x2.j
    public void setScaleFitXY(int i2) {
        this.o1 = i2;
    }

    public void setShowingAlertViewCover(boolean z2) {
        ATAcquireRewardPopView aTAcquireRewardPopView;
        if (z2 && (aTAcquireRewardPopView = this.L1) != null && this.U0 && this.S0) {
            aTAcquireRewardPopView.onPause();
        }
        this.s0.setIsCovered(z2);
    }

    public void setShowingTransparent(boolean z2) {
        this.n1 = z2;
    }

    public void setSoundListener(com.smartdigimkt.s2.a aVar) {
        this.Q0 = aVar;
    }

    public void setSoundState(int i2) {
        this.q1 = i2;
    }

    public void setTempEventListener(com.smartdigimkt.i1.c cVar) {
        this.R0 = cVar;
    }

    public void setUnitId(String str) {
        this.c1 = str;
        u uVar = this.P1;
        if (uVar != null) {
            uVar.a(str);
        }
    }

    public void setVideoLayout(com.smartdigimkt.x.d dVar) {
        if (dVar != null) {
            this.f0 = dVar;
            this.m0 = dVar.H2();
        }
        if (this.m0) {
            a(this, dVar);
        } else {
            g();
        }
    }

    public void setVideoSkipTime(int i2) {
        this.W0 = i2;
    }

    @Override // com.smartdigimkt.x2.j
    public void setVisible(int i2) {
        setVisibility(i2);
    }

    @Override // com.smartdigimkt.x2.j
    public void showAlertView() {
        com.smartdigimkt.x.d dVar;
        if (this.i1) {
            return;
        }
        if (this.b1 == null) {
            this.b1 = new p();
        }
        if (this.a1 == null) {
            this.a1 = new com.smartdigimkt.h3.a(getContext(), this.b1);
        }
        if (this.p1) {
            this.a1.a(this.s1, this.c1);
        } else {
            this.a1.a(this.c1);
        }
        PlayerView playerView = this.s0;
        if (playerView != null) {
            if (playerView.isComplete() && ((dVar = this.f0) == null || dVar.U1() == null || this.f0.U1().g() != 5002010)) {
                return;
            }
            this.a1.show();
            this.v1 = true;
            this.S0 = true;
            setShowingAlertViewCover(true);
            this.r1 = com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), this.c1, false).d();
        }
    }

    public void showBaitClickView() {
        int i2;
        AnythinkBaitClickView anythinkBaitClickView;
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || !dVar.H2() || this.f0.U1() == null) {
            return;
        }
        String strF = this.f0.U1().f();
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        try {
            String strA = z.a(strF, "bait_click");
            if (TextUtils.isEmpty(strA) || (i2 = Integer.parseInt(strA)) == 0 || (anythinkBaitClickView = this.F1) == null) {
                return;
            }
            anythinkBaitClickView.setVisibility(0);
            this.F1.init(i2);
            this.F1.startAnimation();
            this.F1.setOnClickListener(new i());
        } catch (Exception e3) {
            e3.getMessage();
        }
    }

    @Override // com.smartdigimkt.x2.j
    public void showIVRewardAlertView(String str) {
        this.i0.a(8, "");
    }

    public void showMoreOfferInPlayTemplate() {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || this.J0 == null || !dVar.H2() || this.f0.U1() == null) {
            return;
        }
        TextUtils.isEmpty(this.f0.U1().f());
    }

    public void showRewardPopView() {
        com.smartdigimkt.i3.c cVar;
        ATAcquireRewardPopView aTAcquireRewardPopView = this.L1;
        if (aTAcquireRewardPopView == null || (cVar = this.K1) == null) {
            return;
        }
        try {
            aTAcquireRewardPopView.init(cVar);
            this.L1.setVisibility(0);
            setCover(true);
            m();
            this.U0 = true;
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar != null) {
                dVar.p3 = true;
            }
        } catch (Exception e3) {
            e3.getMessage();
        }
    }

    @Override // com.smartdigimkt.x2.j
    public void showVideoLocation(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        float f2;
        if (this.j0) {
            this.w0.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.w0.getVisibility() != 0) {
                this.w0.setVisibility(0);
            }
            if (this.u0.getVisibility() == 0) {
                e();
            }
            if (!b(i4, i5) || this.f1) {
                s();
                return;
            }
            Z1 = i7;
            a2 = i8;
            b2 = i9 + 4;
            c2 = i10 + 4;
            float f3 = i4 / i5;
            try {
                f2 = (float) (this.d1 / this.e1);
            } catch (Throwable th) {
                th.getMessage();
                f2 = 0.0f;
            }
            if (i6 > 0) {
                Y1 = i6;
                setPlayerViewRadius(i6);
            }
            if (Math.abs(f3 - f2) > 0.1f && this.o1 != 1) {
                s();
                videoOperate(1);
                return;
            }
            s();
            if (!this.n1) {
                setLayoutParam(i3, i2, i4, i5);
                return;
            }
            setLayoutCenter(i4, i5);
            com.smartdigimkt.t2.a aVar = this.i0;
            if (aVar != null) {
                if (e2) {
                    aVar.a(114, "");
                } else {
                    aVar.a(116, "");
                }
            }
        }
    }

    @Override // com.smartdigimkt.x2.j
    public void soundOperate(int i2, int i3) {
        soundOperate(i2, i3, "2");
    }

    @Override // com.smartdigimkt.x2.j
    public void videoOperate(int i2) {
        if (this.j0) {
            if (i2 == 1) {
                if (getVisibility() == 0 && isfront()) {
                    RelativeLayout relativeLayout = this.P0;
                    if ((relativeLayout != null && relativeLayout.getVisibility() != 0) || this.S0 || com.smartdigimkt.z.b.f || this.i1) {
                        return;
                    }
                    n();
                    return;
                }
                return;
            }
            if (i2 == 2) {
                if (getVisibility() == 0) {
                    m();
                    return;
                }
                return;
            }
            if (i2 == 3) {
                if (this.h1) {
                    return;
                }
                this.s0.stop();
                com.smartdigimkt.x.d dVar = this.f0;
                if (dVar == null || dVar.U1() == null || this.f0.U1().g() != 5002010) {
                    this.s0.release();
                    this.h1 = true;
                    return;
                }
                return;
            }
            if (i2 == 5) {
                this.T0 = true;
                if (this.h1) {
                    return;
                }
                m();
                return;
            }
            if (i2 == 4) {
                this.T0 = false;
                if (this.h1 || isMiniCardShowing()) {
                    return;
                }
                n();
                return;
            }
            if (i2 != 6 || this.h1) {
                return;
            }
            this.s0.release();
            this.h1 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        u uVar;
        RelativeLayout relativeLayout;
        try {
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar == null || dVar.U1() == null || this.f0.U1().g() != 5002010 || (relativeLayout = this.P0) == null || relativeLayout.getVisibility() == 0) {
                if (this.g1) {
                    ATAcquireRewardPopView aTAcquireRewardPopView = this.L1;
                    if (aTAcquireRewardPopView != null && this.U0) {
                        aTAcquireRewardPopView.onResume();
                    }
                    if (this.U0) {
                        return;
                    }
                    this.s0.setIsCovered(false);
                    u();
                    return;
                }
                boolean zPlayVideo = this.s0.playVideo();
                com.smartdigimkt.x.d dVar2 = this.f0;
                if (dVar2 != null && dVar2.B1() != 2 && !zPlayVideo && (uVar = this.P1) != null) {
                    uVar.onPlayError("play video failed");
                }
                this.g1 = true;
            }
        } catch (Exception e3) {
            e3.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        String strF;
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || !dVar.H2() || this.K0) {
            return;
        }
        if (!TextUtils.isEmpty(this.f0.k1())) {
            strF = this.f0.k1();
        } else if (this.f0.U1() == null) {
            return;
        } else {
            strF = this.f0.U1().f();
        }
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        try {
            String strA = z.a(strF, "guideShow");
            String strA2 = z.a(strF, "guideDelay");
            String strA3 = z.a(strF, "guideTime");
            String strA4 = z.a(strF, "guideRewardTime");
            if (!TextUtils.isEmpty(strA)) {
                this.G1 = Integer.parseInt(strA);
            }
            if (!TextUtils.isEmpty(strA2)) {
                int i2 = Integer.parseInt(strA2);
                this.H1 = i2;
                if (i2 > 10 || i2 < 3) {
                    this.H1 = 5;
                }
            }
            if (!TextUtils.isEmpty(strA3)) {
                int i3 = Integer.parseInt(strA3);
                this.I1 = i3;
                if (i3 > 10 || i3 < 3) {
                    this.I1 = 5;
                }
            }
            if (!TextUtils.isEmpty(strA4)) {
                int i4 = Integer.parseInt(strA4);
                this.J1 = i4;
                if (i4 > 10 || i4 < 5) {
                    this.J1 = 5;
                }
            }
            int i5 = this.G1;
            if (i5 > 0 && i5 <= 2) {
                int videoCompleteTime = getVideoCompleteTime();
                if (videoCompleteTime == 0 || videoCompleteTime > this.H1) {
                    int i6 = videoCompleteTime - this.H1;
                    if (i6 >= 0 && this.J1 > i6) {
                        this.J1 = i6;
                    }
                    int videoAllDuration = getVideoAllDuration();
                    if (this.J1 >= videoAllDuration) {
                        this.J1 = videoAllDuration - this.H1;
                    }
                    if (this.H1 >= videoAllDuration) {
                        return;
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(this.f0.f());
                    com.smartdigimkt.n1.a aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.m6.b.p().f());
                    this.K1 = new com.smartdigimkt.i3.c.a("", this.c1, this.G1, aVarC != null ? aVarC.s() : "US").a(this.I1).l(this.J1).a(new j()).a(arrayList).a();
                    postDelayed(this.S1, 1000L);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void p() {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || dVar.R() != 2 || this.tvFlag == null) {
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals(com.smartdigimkt.d2.a.S)) {
            this.tvFlag.setText("AD");
        } else {
            this.tvFlag.setText("广告");
        }
    }

    private void q() {
        int iC;
        int iG;
        float fG = v.g(this.e0);
        float f2 = v.f(this.e0);
        double d3 = this.d1;
        if (d3 > 0.0d) {
            double d4 = this.e1;
            if (d4 > 0.0d && fG > 0.0f && f2 > 0.0f) {
                double d5 = d3 / d4;
                double dA = v.a(Double.valueOf(d5));
                double dA2 = v.a(Double.valueOf(fG / f2));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.s0.getLayoutParams();
                if (dA > dA2) {
                    double d6 = (((double) fG) * this.e1) / this.d1;
                    layoutParams.width = -1;
                    layoutParams.height = (int) d6;
                    layoutParams.gravity = 17;
                } else if (dA < dA2) {
                    layoutParams.width = (int) (((double) f2) * d5);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                try {
                    com.smartdigimkt.x.d dVar = this.f0;
                    if (dVar != null && dVar.H2()) {
                        if (this.f0.U1() != null) {
                            iG = this.f0.U1().g();
                            iC = this.f0.U1().c();
                        } else {
                            iC = this.e0.getResources().getConfiguration().orientation;
                            iG = com.smartdigimkt.d2.a.t;
                        }
                        if (iG == 102 || iG == 202) {
                            if (iC == 1) {
                                layoutParams.width = -1;
                                layoutParams.gravity = 17;
                                layoutParams.height = (int) (this.e1 / (this.d1 / ((double) fG)));
                            } else {
                                layoutParams.height = -1;
                                layoutParams.gravity = 17;
                                layoutParams.width = (int) (((double) f2) * d5);
                            }
                        }
                        if (iG == 202 && !TextUtils.isEmpty(this.f0.k())) {
                            setBlurBackgroundImage(this.f0.k());
                        }
                        if (iG == 302 || iG == 802 || iG == 5002010) {
                            double d7 = this.d1;
                            double d8 = this.e1;
                            if (d7 / d8 > 1.0d) {
                                layoutParams.width = -1;
                                layoutParams.height = (int) ((d8 * ((double) fG)) / d7);
                            } else {
                                int iA = v.a(getContext(), 220.0f);
                                layoutParams.width = (int) ((this.d1 * ((double) iA)) / this.e1);
                                layoutParams.height = iA;
                            }
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
                this.s0.setLayoutParams(layoutParams);
                setMatchParent();
                return;
            }
        }
        t();
    }

    private void s() {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null) {
            return;
        }
        if (dVar.R() == 2) {
            r();
        } else {
            q();
        }
    }

    private void t() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (isLandscape() || !this.j0) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.s0.getLayoutParams();
            int iG = v.g(this.e0);
            layoutParams.width = -1;
            layoutParams.height = (iG * 9) / 16;
            layoutParams.gravity = 17;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void u() {
        if (this.z1) {
            if (!this.A1) {
                this.s0.seekToEndFrame();
            }
            this.A1 = true;
        } else {
            this.s0.onResume();
        }
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || dVar.p3) {
            return;
        }
        post(this.S1);
    }

    private void v() {
        if (!this.j0 || this.v0.getVisibility() == 0) {
            return;
        }
        if (!this.m0 || this.B0) {
            this.v0.setVisibility(0);
        }
        this.j1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:108:0x014e A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:8:0x001b, B:10:0x001f, B:12:0x0023, B:14:0x0027, B:18:0x0034, B:21:0x003c, B:23:0x0042, B:25:0x0046, B:27:0x004a, B:29:0x004e, B:31:0x0052, B:33:0x005e, B:35:0x0062, B:37:0x0066, B:39:0x006a, B:41:0x0076, B:43:0x007a, B:45:0x008a, B:47:0x0097, B:49:0x00a4, B:51:0x00ad, B:53:0x00b1, B:55:0x00b5, B:57:0x00c1, B:59:0x00c5, B:61:0x00c9, B:63:0x00cd, B:65:0x00d9, B:67:0x00dd, B:68:0x00e0, B:70:0x00e6, B:72:0x00ec, B:74:0x00f0, B:76:0x00f7, B:78:0x00fb, B:80:0x00ff, B:82:0x0103, B:84:0x010a, B:46:0x0091, B:86:0x010e, B:88:0x0112, B:90:0x0118, B:92:0x012d, B:110:0x0152, B:112:0x0156, B:102:0x013f, B:104:0x0143, B:106:0x0147, B:108:0x014e, B:114:0x015c, B:116:0x0160), top: B:120:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    public void w() {
        com.smartdigimkt.t2.a aVar;
        int i2;
        com.smartdigimkt.t2.a aVar2;
        boolean z2;
        try {
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar != null && dVar.U1() != null && this.f0.U1().g() == 5002010 && this.M1 && !(z2 = this.z1)) {
                com.smartdigimkt.t2.a aVar3 = this.i0;
                if (aVar3 != null) {
                    this.M1 = true;
                    aVar3.a(2, b(z2));
                    return;
                }
                return;
            }
            if (!this.p1 || ((i2 = this.s1) != com.smartdigimkt.b0.a.v2 && i2 != com.smartdigimkt.b0.a.w2)) {
                com.smartdigimkt.x.d dVar2 = this.f0;
                if (dVar2 == null || dVar2.R() == 2) {
                    com.smartdigimkt.t2.a aVar4 = this.i0;
                    if (aVar4 != null) {
                        this.M1 = true;
                        aVar4.a(2, "");
                        return;
                    }
                    return;
                }
                int videoCompleteTime = getVideoCompleteTime();
                int curPosition = this.s0.getCurPosition() / 1000;
                if (this.f0.t0() != 5 || this.mCurrPlayNum <= 1) {
                    if ((videoCompleteTime > 0 && curPosition < videoCompleteTime) || videoCompleteTime == 0) {
                        if (this.Y0 == 1 && !this.n1) {
                            m();
                            aVar = this.i0;
                            if (aVar != null) {
                                aVar.a(8, "");
                                return;
                            }
                            return;
                        }
                    }
                } else if (videoCompleteTime != 0 && videoCompleteTime > 0 && curPosition < videoCompleteTime) {
                    if (this.Y0 == 1) {
                        m();
                        aVar = this.i0;
                        if (aVar != null) {
                            aVar.a(8, "");
                            return;
                        }
                        return;
                    }
                }
                com.smartdigimkt.t2.a aVar5 = this.i0;
                if (aVar5 != null) {
                    this.M1 = true;
                    aVar5.a(2, "");
                    return;
                }
                return;
            }
            if (this.v1) {
                if (i2 != com.smartdigimkt.b0.a.w2 || (aVar2 = this.i0) == null) {
                    return;
                }
                this.M1 = true;
                aVar2.a(2, b(this.z1));
                return;
            }
            if (i2 == com.smartdigimkt.b0.a.w2 && this.C1) {
                com.smartdigimkt.t2.a aVar6 = this.i0;
                if (aVar6 != null) {
                    this.M1 = true;
                    aVar6.a(2, b(this.z1));
                    return;
                }
                return;
            }
            if (this.y1) {
                int curPosition2 = this.s0.getCurPosition() / 1000;
                int iT = (int) ((curPosition2 / (this.s0.getDuration() == 0 ? this.f0.t() : this.s0.getDuration())) * 100.0f);
                if (this.s1 == com.smartdigimkt.b0.a.v2) {
                    m();
                    int i3 = this.t1;
                    if (i3 == com.smartdigimkt.b0.a.x2 && iT >= this.u1) {
                        com.smartdigimkt.t2.a aVar7 = this.i0;
                        if (aVar7 != null) {
                            this.M1 = true;
                            aVar7.a(2, b(this.z1));
                            return;
                        }
                        return;
                    }
                    if (i3 == com.smartdigimkt.b0.a.y2 && curPosition2 >= this.u1) {
                        com.smartdigimkt.t2.a aVar8 = this.i0;
                        if (aVar8 != null) {
                            this.M1 = true;
                            aVar8.a(2, b(this.z1));
                            return;
                        }
                        return;
                    }
                    com.smartdigimkt.t2.a aVar9 = this.i0;
                    if (aVar9 != null) {
                        aVar9.a(8, "");
                    }
                }
                if (this.s1 == com.smartdigimkt.b0.a.w2) {
                    int i4 = this.t1;
                    if (i4 == com.smartdigimkt.b0.a.x2 && iT >= this.u1) {
                        m();
                        com.smartdigimkt.t2.a aVar10 = this.i0;
                        if (aVar10 != null) {
                            aVar10.a(8, "");
                            return;
                        }
                        return;
                    }
                    if (i4 != com.smartdigimkt.b0.a.y2 || curPosition2 < this.u1) {
                        return;
                    }
                    m();
                    com.smartdigimkt.t2.a aVar11 = this.i0;
                    if (aVar11 != null) {
                        aVar11.a(8, "");
                    }
                }
            }
        } catch (Exception e3) {
            e3.getMessage();
        }
    }

    @Override // com.smartdigimkt.x2.j
    public void soundOperate(int i2, int i3, String str) {
        com.smartdigimkt.t2.a aVar;
        SoundImageView soundImageView;
        if (this.j0) {
            this.q1 = i2;
            if (i2 == 1) {
                SoundImageView soundImageView2 = this.t0;
                if (soundImageView2 != null) {
                    soundImageView2.setSoundStatus(false);
                }
                this.s0.closeSound();
            } else if (i2 == 2) {
                SoundImageView soundImageView3 = this.t0;
                if (soundImageView3 != null) {
                    soundImageView3.setSoundStatus(true);
                }
                this.s0.openSound();
            }
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar != null && dVar.H2()) {
                SoundImageView soundImageView4 = this.t0;
                if (soundImageView4 != null) {
                    soundImageView4.setVisibility(0);
                }
            } else if (i3 == 1) {
                SoundImageView soundImageView5 = this.t0;
                if (soundImageView5 != null) {
                    soundImageView5.setVisibility(8);
                }
            } else if (i3 == 2 && (soundImageView = this.t0) != null) {
                soundImageView.setVisibility(0);
            }
        }
        if (str == null || !str.equals("2") || (aVar = this.i0) == null) {
            return;
        }
        aVar.a(7, Integer.valueOf(i2));
    }

    private void d() {
        if (this.F0 == null) {
            return;
        }
        if (this.G0 == null) {
            AnythinkClickCTAView anythinkClickCTAView = new AnythinkClickCTAView(getContext());
            this.G0 = anythinkClickCTAView;
            anythinkClickCTAView.setCampaign(this.f0);
            this.G0.setUnitId(this.c1);
            com.smartdigimkt.t2.a aVar = this.L0;
            if (aVar != null) {
                this.G0.setNotifyListener(new com.smartdigimkt.u2.i(aVar));
            }
            this.G0.preLoadData(this.H0);
        }
        this.F0.addView(this.G0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar != null) {
            dVar.G(this.c1);
            com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.c1, "_1"), this.f0);
        }
        if (com.smartdigimkt.z.b.b().a()) {
            this.f0.G(this.c1);
            com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.c1, "_1"), this.f0);
            com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.c1, "_1"), this.z0);
        } else {
            FeedBackButton feedBackButton = this.z0;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
    }

    private void f() {
        CollapsibleWebView collapsibleWebView = this.O0;
        if (collapsibleWebView == null || this.f0 == null || !TextUtils.isEmpty(collapsibleWebView.getUrl())) {
            return;
        }
        this.O0.loadUrl(this.f0.p0());
        this.O0.setToolBarTitle(this.f0.f());
        com.smartdigimkt.n1.a aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a());
        if (aVarC == null) {
            aVarC = com.smartdigimkt.n1.b.b().a();
        }
        this.O0.setPageLoadTimtout((int) aVarC.V0());
        this.O0.setPageLoadListener(new c());
        this.O0.setWebViewClient(new d());
        this.O0.setCollapseListener(new e());
        this.O0.setExpandListener(new f());
        this.O0.setExitsClickListener(new g());
    }

    private void g() {
        int iFindLayout = findLayout(T1);
        if (iFindLayout > 0) {
            this.g0.inflate(iFindLayout, this);
            l();
        }
        e2 = false;
        p();
    }

    private void h() {
        if (this.Q1 || this.m1 || this.k1) {
            return;
        }
        this.Q1 = true;
        int i2 = this.W0;
        if (i2 < 0) {
            return;
        }
        if (i2 == 0) {
            this.m1 = true;
        } else {
            new Handler().postDelayed(new r(), this.W0 * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || !dVar.H2() || this.F0 == null) {
            return;
        }
        if (this.G0 == null) {
            d();
        }
        if (this.F0.getVisibility() != 0) {
            this.F0.setVisibility(0);
            postDelayed(this.R1, com.smartdigimkt.u2.m.D0);
        } else {
            this.F0.setVisibility(8);
            getHandler().removeCallbacks(this.R1);
        }
    }

    private void j() {
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || !y.b(dVar.s2())) {
            return;
        }
        String[] strArrSplit = this.f0.s2().split("x");
        if (strArrSplit.length == 2) {
            if (v.j(strArrSplit[0]) > 0.0d) {
                this.d1 = v.j(strArrSplit[0]);
            }
            if (v.j(strArrSplit[1]) > 0.0d) {
                this.e1 = v.j(strArrSplit[1]);
            }
        }
        if (this.d1 <= 0.0d) {
            this.d1 = 1280.0d;
        }
        if (this.e1 <= 0.0d) {
            this.e1 = 720.0d;
        }
    }

    private boolean k() {
        try {
            this.s0 = (PlayerView) findViewById(filterFindViewId(this.D1, "sdm_vfpv"));
            this.t0 = (SoundImageView) findViewById(filterFindViewId(this.D1, "sdm_sound_switch"));
            this.u0 = (TextView) findViewById(filterFindViewId(this.D1, "sdm_tv_count"));
            View viewFindViewById = findViewById(filterFindViewId(this.D1, "sdm_rl_playing_close"));
            this.v0 = viewFindViewById;
            viewFindViewById.setVisibility(4);
            this.w0 = (RelativeLayout) findViewById(filterFindViewId(this.D1, "sdm_top_control"));
            this.x0 = (ImageView) findViewById(filterFindViewId(this.D1, "sdm_videoview_bg"));
            this.y0 = (ProgressBar) findViewById(filterFindViewId(this.D1, "sdm_video_progress_bar"));
            this.z0 = (FeedBackButton) findViewById(filterFindViewId(this.D1, "sdm_native_endcard_feed_btn"));
            this.A0 = (ImageView) findViewById(filterFindViewId(this.D1, "sdm_iv_link"));
            this.N0 = (RelativeLayout) findViewById(filterFindViewId(this.D1, "sdm_reward_scale_webview_layout"));
            this.P0 = (RelativeLayout) findViewById(filterFindViewId(this.D1, "sdm_reward_header_layout"));
            if (this.N0 != null) {
                CollapsibleWebView collapsibleWebView = new CollapsibleWebView(getContext());
                this.O0 = collapsibleWebView;
                this.N0.addView(collapsibleWebView, new RelativeLayout.LayoutParams(-1, -1));
            }
            v.a(this.A0, this.f0, this.e0, false);
            this.C0 = (AnyThinkSegmentsProgressBar) findViewById(filterFindViewId(this.D1, "sdm_reward_segment_progressbar"));
            this.F0 = (FrameLayout) findViewById(filterFindViewId(this.D1, "sdm_reward_cta_layout"));
            this.F1 = (AnythinkBaitClickView) findViewById(filterFindViewId(this.D1, "sdm_animation_click_view"));
            this.J0 = (RelativeLayout) findViewById(filterFindViewId(this.D1, "sdm_reward_moreoffer_layout"));
            this.L1 = (ATAcquireRewardPopView) findViewById(filterFindViewId(this.D1, "sdm_reward_popview"));
            try {
                String strP = this.f0.P();
                if (TextUtils.isEmpty(strP)) {
                    strP = com.smartdigimkt.b.b.e0;
                }
                if (!TextUtils.isEmpty(strP)) {
                    com.smartdigimkt.f0.b.a(this.e0).a(strP, new q());
                }
            } catch (Exception e3) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e3.getLocalizedMessage();
                }
            }
            this.tvFlag = (TextView) findViewById(filterFindViewId(this.D1, "sdm_tv_flag"));
            return isNotNULL(this.s0, this.t0, this.u0, this.v0);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.j0 = k();
        c();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.E1 = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            if (this.s0 != null) {
                com.smartdigimkt.x.d dVar = this.f0;
                if (dVar != null && !dVar.p3) {
                    removeCallbacks(this.S1);
                }
                this.s0.setIsCovered(this.T0 || this.S0 || this.U0);
                this.s0.onPause();
                com.smartdigimkt.x.d dVar2 = this.f0;
                if (dVar2 == null || dVar2.p1() == null || this.f0.J2()) {
                    return;
                }
                this.f0.i(true);
                Context contextK = com.smartdigimkt.m6.b.p().k();
                com.smartdigimkt.x.d dVar3 = this.f0;
                com.smartdigimkt.o.a.a(contextK, dVar3, this.c1, dVar3.p1().o(), false, false);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void c() {
        super.c();
        if (this.j0) {
            if (this.m0) {
                if (com.smartdigimkt.m2.c.b(this.f0) == -1 || com.smartdigimkt.m2.c.b(this.f0) == 100) {
                    this.s0.setOnClickListener(new l());
                }
            } else {
                this.s0.setOnClickListener(new m());
            }
            SoundImageView soundImageView = this.t0;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(new n());
            }
            this.v0.setOnClickListener(new o());
        }
    }

    private boolean b(int i2, int i3) {
        return i2 > 0 && i3 > 0 && v.g(this.e0) >= i2 && v.f(this.e0) >= i3;
    }

    private void a(ViewGroup viewGroup, com.smartdigimkt.x.d dVar) {
        com.smartdigimkt.c2.c cVarB = new com.smartdigimkt.r2.c().b(viewGroup, dVar);
        com.smartdigimkt.c2.b.a().a(cVarB, new a(viewGroup, cVarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(boolean z2) {
        if (!this.p1) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.v1) {
                jSONObject.put("Alert_window_status", com.smartdigimkt.b0.a.z2);
            }
            if (this.x1) {
                jSONObject.put("Alert_window_status", com.smartdigimkt.b0.a.B2);
            }
            if (this.w1) {
                jSONObject.put("Alert_window_status", com.smartdigimkt.b0.a.A2);
            }
            jSONObject.put("complete_info", z2 ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public class j implements com.smartdigimkt.i3.a {
        public j() {
        }

        @Override // com.smartdigimkt.i3.a
        public void a(int i2) {
            AnythinkVideoView.this.U0 = false;
            AnythinkVideoView.this.setCover(false);
            int videoCompleteTime = AnythinkVideoView.this.getVideoCompleteTime() - i2;
            AnythinkVideoView.this.f0.u0(videoCompleteTime);
            AnythinkVideoView.this.n();
            com.smartdigimkt.t2.a aVar = AnythinkVideoView.this.i0;
            if (aVar != null) {
                aVar.a(130, Integer.valueOf(videoCompleteTime));
            }
        }

        @Override // com.smartdigimkt.i3.a
        public void a(String str) {
            AnythinkVideoView.this.U0 = false;
            AnythinkVideoView.this.setCover(false);
            AnythinkVideoView.this.n();
        }

        @Override // com.smartdigimkt.i3.a
        public void a(float f, float f2) {
            if (AnythinkVideoView.this.L0 != null) {
                AnythinkVideoView.this.L0.a(105, "");
            }
        }
    }

    private String a(int i2, int i3) {
        if (i3 != 0) {
            try {
                return v.a(Double.valueOf(i2 / i3)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return androidx.datastore.preferences.protobuf.a.f(i3, "");
    }

    public class a implements com.smartdigimkt.i2.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f34805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.c2.c f34806b;

        /* JADX INFO: renamed from: com.smartdigimkt.expressad.video.module.AnythinkVideoView$a$a, reason: collision with other inner class name */
        public class C0475a extends com.smartdigimkt.g3.a {
            public C0475a() {
            }

            @Override // com.smartdigimkt.g3.a
            public void a(View view) {
                if (AnythinkVideoView.this.f0.U1() == null || AnythinkVideoView.this.f0.U1().g() != 902) {
                    AnythinkVideoView.this.b("video_play_click");
                } else {
                    AnythinkVideoView.this.i();
                }
            }
        }

        public a(ViewGroup viewGroup, com.smartdigimkt.c2.c cVar) {
            this.f34805a = viewGroup;
            this.f34806b = cVar;
        }

        @Override // com.smartdigimkt.i2.h
        public void a(com.smartdigimkt.c2.a aVar) {
            if (aVar != null) {
                if (this.f34805a != null && aVar.b() != null) {
                    aVar.b().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f34805a.addView(aVar.b());
                }
                if (aVar.a() != null) {
                    Iterator<View> it = aVar.a().iterator();
                    while (it.hasNext()) {
                        it.next().setOnClickListener(new C0475a());
                    }
                }
                AnythinkVideoView.this.D1 = aVar.c();
                AnythinkVideoView.this.l();
                boolean unused = AnythinkVideoView.e2 = false;
                AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                com.smartdigimkt.x.d dVar = anythinkVideoView.f0;
                anythinkVideoView.I0 = this.f34806b.k();
                AnythinkVideoView.this.M0 = this.f34806b.f();
            }
        }

        @Override // com.smartdigimkt.i2.h
        public void a(com.smartdigimkt.f2.b bVar) {
            bVar.d();
        }
    }

    private int a(com.smartdigimkt.x.d dVar) {
        return com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), this.c1, false).o();
    }

    private int b(com.smartdigimkt.x.d dVar) {
        if (dVar != null) {
            if (dVar.L1() != -1) {
                return dVar.L1();
            }
            return com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), this.c1, false).J();
        }
        return com.smartdigimkt.f3.c.b().a(com.smartdigimkt.u.a.f().a(), this.c1, false).J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        JSONException e3;
        JSONObject jSONObject;
        if (this.L0 != null) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.smartdigimkt.b0.a.i2, a(0));
                } catch (JSONException e4) {
                    e3 = e4;
                    e3.printStackTrace();
                }
            } catch (JSONException e5) {
                e3 = e5;
                jSONObject = null;
            }
            this.L0.a(105, jSONObject);
        }
    }

    public AnythinkVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMuteSwitch = 0;
        this.E0 = 0;
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.K0 = false;
        this.S0 = false;
        this.T0 = false;
        this.U0 = false;
        this.c1 = "";
        this.f1 = false;
        this.g1 = false;
        this.h1 = false;
        this.i1 = false;
        this.j1 = false;
        this.k1 = false;
        this.l1 = false;
        this.m1 = false;
        this.n1 = false;
        this.p1 = false;
        this.q1 = 2;
        this.v1 = false;
        this.w1 = false;
        this.x1 = false;
        this.y1 = true;
        this.z1 = false;
        this.A1 = false;
        this.B1 = false;
        this.C1 = false;
        this.D1 = false;
        this.G1 = 0;
        this.H1 = 5;
        this.I1 = 5;
        this.J1 = 5;
        this.M1 = false;
        this.N1 = false;
        this.O1 = 0;
        this.P1 = new u(this);
        this.Q1 = false;
        this.R1 = new h();
        this.S1 = new k();
    }
}
