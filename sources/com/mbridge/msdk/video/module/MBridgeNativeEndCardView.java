package com.mbridge.msdk.video.module;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.FeedBackButton;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class MBridgeNativeEndCardView extends MBridgeNativeEndCardViewDiff {
    private LinearLayout A;
    private Runnable B;
    private Runnable C;
    private RelativeLayout D;
    private com.mbridge.msdk.video.signal.factory.b E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private AlphaAnimation K;
    private int L;
    private int M;
    private int N;
    private int O;
    private Bitmap P;
    private View Q;
    private FeedBackButton R;
    private String S;
    private CampaignUnit T;
    private MBShakeView U;
    private com.mbridge.msdk.shake.b V;
    private MBridgeBaitClickView W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f37638a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f37639b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f37640c0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewGroup f37641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ViewGroup f37642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RelativeLayout f37643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f37644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ImageView f37645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ImageView f37646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ImageView f37647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f37648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f37649u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ImageView f37650v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f37651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private TextView f37652x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f37653y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private LinearLayout f37654z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends com.mbridge.msdk.widget.a {
        public a() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (MBridgeNativeEndCardView.this.ctaView != null) {
                if (!com.mbridge.msdk.util.b.a()) {
                    MBridgeNativeEndCardView.this.f37560b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.c(0);
                } else if (MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                    MBridgeNativeEndCardView.this.f37560b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.c(0);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeNativeEndCardView.this.D != null) {
                CampaignEx campaignEx = MBridgeNativeEndCardView.this.f37560b;
                if (campaignEx != null && !campaignEx.isDynamicView() && MBridgeNativeEndCardView.this.f37560b.getAdSpaceT() != 2) {
                    MBridgeNativeEndCardView.this.D.setPadding(MBridgeNativeEndCardView.this.L, MBridgeNativeEndCardView.this.N, MBridgeNativeEndCardView.this.M, MBridgeNativeEndCardView.this.O);
                    MBridgeNativeEndCardView.this.D.startAnimation(MBridgeNativeEndCardView.this.K);
                }
                MBridgeNativeEndCardView.this.D.setVisibility(0);
            }
            if (MBridgeNativeEndCardView.this.Q != null && MBridgeNativeEndCardView.this.Q.getVisibility() != 0 && MBridgeNativeEndCardView.this.G) {
                MBridgeNativeEndCardView.this.Q.setVisibility(0);
            }
            MBridgeNativeEndCardView.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.mbridge.msdk.foundation.feedback.a {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBridgeNativeEndCardView.this.I = true;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBridgeNativeEndCardView.this.I = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBridgeNativeEndCardView.this.I = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeNativeEndCardView.this.f37560b.setTriggerClickSource(5);
            MBridgeNativeEndCardView.this.c(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e extends com.mbridge.msdk.shake.b {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        @Override // com.mbridge.msdk.shake.b
        public void a() {
            if ((com.mbridge.msdk.util.b.a() && MBridgeNativeEndCardView.this.checkChinaShakeState()) || MBridgeNativeEndCardView.this.I || !MBridgeNativeEndCardView.this.H) {
                return;
            }
            MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
            mBridgeNativeEndCardView.f37564f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            mBridgeNativeEndCardView.f37565g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            mBridgeNativeEndCardView.f37560b.setTriggerClickSource(5);
            MBridgeNativeEndCardView.this.c(4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeNativeEndCardView.this.f37560b.setTriggerClickSource(2);
            MBridgeNativeEndCardView.this.c(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView.this.f37560b.setTriggerClickSource(2);
            MBridgeNativeEndCardView.this.f37560b.setClickType(1);
            MBridgeNativeEndCardView.this.c(2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView.this.f37560b.setTriggerClickSource(2);
            MBridgeNativeEndCardView.this.f37560b.setClickType(1);
            MBridgeNativeEndCardView.this.c(2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView.this.G = true;
            if (MBridgeNativeEndCardView.this.Q != null) {
                MBridgeNativeEndCardView.this.Q.setVisibility(0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class l implements com.mbridge.msdk.foundation.feedback.a {
        public l() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBridgeNativeEndCardView.this.I = true;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBridgeNativeEndCardView.this.I = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBridgeNativeEndCardView.this.I = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f37667a;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                if (mBridgeNativeEndCardView.f37566h) {
                    mBridgeNativeEndCardView.f37644p.setBackground(null);
                }
                q0.b("async", "执行异步加载图");
                MBridgeNativeEndCardView.this.f37644p.setImageBitmap(MBridgeNativeEndCardView.this.P);
            }
        }

        public m(Bitmap bitmap) {
            this.f37667a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
            mBridgeNativeEndCardView.P = mBridgeNativeEndCardView.blurBitmap(this.f37667a);
            if (MBridgeNativeEndCardView.this.P == null || MBridgeNativeEndCardView.this.P.isRecycled() || MBridgeNativeEndCardView.this.f37644p == null) {
                return;
            }
            MBridgeNativeEndCardView.this.f37644p.post(new a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class n implements View.OnClickListener {
        public n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeNativeEndCardView.this.F) {
                MBridgeNativeEndCardView.this.f37560b.setTriggerClickSource(2);
                MBridgeNativeEndCardView.this.c(1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeNativeEndCardView.this.f37566h) {
                try {
                    com.mbridge.msdk.video.dynview.moffer.a.a().b();
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
                try {
                    CampaignEx campaignEx = MBridgeNativeEndCardView.this.f37560b;
                    if (campaignEx != null) {
                        String strA = c1.a(campaignEx.getendcard_url(), "ecid");
                        String strA2 = c1.a(MBridgeNativeEndCardView.this.f37560b.getendcard_url(), "mof");
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a("type", "choseFromTwoClose");
                        eVar.a("endcard_id", strA);
                        eVar.a("mof", strA2);
                        com.mbridge.msdk.video.module.report.a.a("2000103", MBridgeNativeEndCardView.this.f37560b, eVar);
                    }
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        e11.printStackTrace();
                    }
                }
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar2.a("type", 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", MBridgeNativeEndCardView.this.f37560b);
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
            MBridgeNativeEndCardView.this.notifyListener.a(InterfaceC0435l1.d.b.f29108e, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class p extends com.mbridge.msdk.widget.a {
        public p() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            MBridgeNativeEndCardView.this.f37560b.setTriggerClickSource(1);
            MBridgeNativeEndCardView.this.c(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class q extends com.mbridge.msdk.widget.a {
        public q() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (MBridgeNativeEndCardView.this.ctaView != null) {
                if (!com.mbridge.msdk.util.b.a()) {
                    MBridgeNativeEndCardView.this.f37560b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.c(0);
                } else if (MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                    MBridgeNativeEndCardView.this.f37560b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.c(0);
                }
            }
        }
    }

    public MBridgeNativeEndCardView(Context context) {
        super(context);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.f37638a0 = false;
        this.f37639b0 = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerBackGroundBlurBimap(Bitmap bitmap) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new m(bitmap));
        } catch (Exception e10) {
            q0.a(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @TargetApi(17)
    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript renderScriptCreate = RenderScript.create(this.f37559a.getApplicationContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(25.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean canBackPress() {
        View view = this.Q;
        return view != null && view.getVisibility() == 0;
    }

    public void clearMoreOfferBitmap() {
        CampaignUnit campaignUnit;
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx == null || !campaignEx.isDynamicView() || (campaignUnit = this.T) == null || campaignUnit.getAds() == null || this.T.getAds().size() <= 0) {
            return;
        }
        for (CampaignEx campaignEx2 : this.T.getAds()) {
            if (!TextUtils.isEmpty(campaignEx2.getIconUrl())) {
                f2.g().a(campaignEx2.getIconUrl());
            }
        }
    }

    public boolean isDyXmlSuccess() {
        return this.f37638a0;
    }

    public void notifyShowListener() {
        this.notifyListener.a(InterfaceC0435l1.d.b.f29111h, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B == null) {
            this.B = new i();
        }
        Runnable runnable = this.B;
        if (runnable != null) {
            postDelayed(runnable, this.J * 1000);
            if (!this.H) {
                this.H = true;
            }
            m();
        }
        e();
        g();
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.B;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.C;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        if (this.V != null) {
            com.mbridge.msdk.shake.a.a().b(this.V);
            this.V = null;
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx == null || !campaignEx.isDynamicView()) {
            RelativeLayout relativeLayout = this.D;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            int i10 = configuration.orientation;
            this.f37562d = i10;
            if (i10 == 2) {
                removeView(this.f37641m);
                b(this.f37642n);
            } else {
                removeView(this.f37642n);
                b(this.f37641m);
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeNativeEndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.E = bVar;
        try {
            if (this.f37560b == null || !this.f37563e) {
                return;
            }
            h();
        } catch (Throwable th2) {
            q0.a(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void release() {
        try {
            removeAllViews();
            AlphaAnimation alphaAnimation = this.K;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.B = null;
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void setCloseBtnDelay(int i10) {
        this.J = i10;
    }

    public void setLayout() {
        if (this.f37566h) {
            i();
        } else {
            j();
        }
    }

    public void setMoreOfferCampaignUnit(CampaignUnit campaignUnit) {
        MBShakeView mBShakeView;
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx == null || !campaignEx.isDynamicView()) {
            return;
        }
        this.T = campaignUnit;
        if (campaignUnit == null || campaignUnit.getAds() == null || this.T.getAds().size() <= 5 || (mBShakeView = this.U) == null) {
            return;
        }
        mBShakeView.setPadding(0, 0, 0, v0.a(getContext(), 5.0f));
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        q0.b(MBridgeBaseView.TAG, "NOTCH NativeEndCard ".concat(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13))));
        this.L = i10;
        this.M = i11;
        this.N = i12;
        this.O = i13;
        o();
    }

    public void setOnPause() {
        this.H = false;
    }

    public void setOnResume() {
        this.H = true;
    }

    public void setUnitId(String str) {
        this.S = str;
    }

    private void e() {
        int i10;
        MBridgeBaitClickView mBridgeBaitClickView;
        try {
            CampaignEx campaignEx = this.f37560b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                String endScreenUrl = this.f37560b.getendcard_url();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    endScreenUrl = this.f37560b.getEndScreenUrl();
                }
                String strA = c1.a(endScreenUrl, "bait_click");
                try {
                    i10 = Integer.parseInt(strA);
                } catch (Throwable th2) {
                    q0.b(MBridgeBaseView.TAG, th2.getMessage());
                    i10 = 1;
                }
                if (TextUtils.isEmpty(strA) || i10 == 0 || (mBridgeBaitClickView = this.W) == null) {
                    return;
                }
                mBridgeBaitClickView.setVisibility(0);
                this.W.init(1342177280, i10);
                if (this.f37560b.getEcTemplateId() == 1302) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(1342177280);
                    gradientDrawable.setStroke(0, -65536);
                    gradientDrawable.setCornerRadius(25.0f);
                    this.W.setBackground(gradientDrawable);
                }
                this.W.startAnimation();
                b1.a(this.W, this.f37560b.getLocalRequestId(), this.f37560b.getLocalAllowTrackClick());
                this.W.setOnClickListener(new f());
            }
        } catch (Throwable th3) {
            q0.b(MBridgeBaseView.TAG, th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.S);
            com.mbridge.msdk.foundation.feedback.b.b().a(defpackage.e.q(this.S, "_2", new StringBuilder()), this.f37560b);
        }
        if (!com.mbridge.msdk.foundation.feedback.b.b().a()) {
            FeedBackButton feedBackButton = this.R;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(defpackage.e.q(this.S, "_2", new StringBuilder()), new c());
        com.mbridge.msdk.foundation.feedback.b.b().d(this.S + "_1");
        if (this.R != null) {
            com.mbridge.msdk.foundation.feedback.b.b().a(defpackage.e.q(this.S, "_2", new StringBuilder()), this.R);
        }
    }

    private void g() {
        int i10;
        int i11;
        try {
            CampaignEx campaignEx = this.f37560b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                String endScreenUrl = this.f37560b.getendcard_url();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    endScreenUrl = this.f37560b.getEndScreenUrl();
                }
                String strA = c1.a(endScreenUrl, "shake_show");
                String strA2 = c1.a(endScreenUrl, "shake_strength");
                String strA3 = c1.a(endScreenUrl, "shake_time");
                if (!TextUtils.isEmpty(strA) && strA.equals("1") && this.U == null) {
                    MBridgeBaitClickView mBridgeBaitClickView = this.W;
                    if (mBridgeBaitClickView != null) {
                        mBridgeBaitClickView.setVisibility(8);
                    }
                    MBShakeView mBShakeView = new MBShakeView(getContext());
                    this.U = mBShakeView;
                    mBShakeView.initView(this.f37560b.getAdCall(), true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (isLandscape()) {
                        layoutParams.addRule(13);
                    } else {
                        layoutParams.addRule(2, filterFindViewId(this.f37638a0, "mbridge_iv_logo"));
                        layoutParams.addRule(14);
                        this.U.setPadding(0, 0, 0, v0.a(getContext(), 20.0f));
                    }
                    this.U.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.f37643o;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        this.f37643o.addView(this.U);
                        TextView textView = this.ctaView;
                        if (textView != null) {
                            textView.setVisibility(4);
                        }
                        b1.a(this.U, this.f37560b.getLocalRequestId(), this.f37560b.getLocalAllowTrackClick());
                        this.U.setOnClickListener(new d());
                        int i12 = 10;
                        if (!TextUtils.isEmpty(strA2) && (i11 = Integer.parseInt(strA2)) > 0) {
                            i12 = i11;
                        }
                        int i13 = 5000;
                        if (!TextUtils.isEmpty(strA3) && (i10 = Integer.parseInt(strA3)) > 0) {
                            i13 = i10 * 1000;
                        }
                        this.V = new e(i12, i13);
                        com.mbridge.msdk.shake.a.a().a(this.V);
                    }
                }
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    private void h() {
        com.mbridge.msdk.foundation.same.image.b.a(this.f37559a.getApplicationContext()).a(this.f37560b.getImageUrl(), new k());
        com.mbridge.msdk.foundation.same.image.b.a(this.f37559a.getApplicationContext()).a(this.f37560b.getIconUrl(), new com.mbridge.msdk.video.module.listener.impl.j(this.f37646r, f2.c(8.0f)));
        this.f37651w.setText(this.f37560b.getAppName());
        TextView textView = this.ctaView;
        if (textView != null) {
            textView.setText(this.f37560b.getAdCall());
        }
        TextView textView2 = this.f37652x;
        if (textView2 != null) {
            textView2.setText(this.f37560b.getAppDesc());
        }
        TextView textView3 = this.f37653y;
        if (textView3 != null) {
            textView3.setText(this.f37560b.getNumberRating() + ")");
        }
        this.f37654z.removeAllViews();
        double rating = this.f37560b.getRating();
        if (rating <= 0.0d) {
            rating = 5.0d;
        }
        LinearLayout linearLayout = this.f37654z;
        if (linearLayout instanceof StarLevelView) {
            ((StarLevelView) linearLayout).initScore(rating);
        }
        LinearLayout linearLayout2 = this.f37654z;
        if (linearLayout2 instanceof MBridgeLevelLayoutView) {
            ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, this.f37560b.getNumberRating());
        }
        LinearLayout linearLayout3 = this.f37654z;
        if (linearLayout3 instanceof MBStarLevelLayoutView) {
            ((MBStarLevelLayoutView) linearLayout3).setRating((int) rating);
        }
        LinearLayout linearLayout4 = this.A;
        if (linearLayout4 != null && (linearLayout4 instanceof MBHeatLevelLayoutView)) {
            ((MBHeatLevelLayoutView) linearLayout4).setHeatCount(this.f37560b.getNumberRating());
        }
        if (!TextUtils.isEmpty(this.f37560b.getendcard_url()) && this.f37560b.getendcard_url().contains("alecfc=1")) {
            this.F = true;
        }
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.f37647s.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
            this.f37640c0 = "AD";
        } else {
            this.f37647s.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
            this.f37640c0 = "广告";
        }
        if (this.f37639b0 == 0) {
            ImageView imageView = this.f37647s;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            ImageView imageView2 = this.f37649u;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            TextView textView4 = this.f37648t;
            if (textView4 != null) {
                textView4.setVisibility(0);
                this.f37648t.setText(this.f37640c0);
            }
        }
        v0.a(2, this.f37650v, this.f37560b, this.f37559a, true, new l());
        if (this.G) {
            return;
        }
        this.Q.setVisibility(8);
    }

    private void i() throws Throwable {
        com.mbridge.msdk.video.dynview.c cVarA = new com.mbridge.msdk.video.dynview.wrapper.c().a(getContext(), this.f37560b, this.f37567i, com.mbridge.msdk.util.b.a() ? "cn_" : "en_");
        this.f37639b0 = cVarA.o();
        com.mbridge.msdk.video.dynview.b.a().a(cVarA, new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int iK = k();
        if (i0.a(iK)) {
            this.f37563e = b(iK);
            l();
            CampaignEx campaignEx = this.f37560b;
            if (campaignEx != null) {
                campaignEx.setECTemplateRenderSucc(false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x001d A[PHI: r3
  0x001d: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:20:0x002b, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    private int k() {
        int i10 = this.f37569k;
        String str = "mbridge_reward_endcard_native_land";
        String str2 = "mbridge_reward_endcard_native_hor";
        if (i10 == 0) {
            str2 = this.f37568j ? "mbridge_reward_endcard_native_half_portrait" : "mbridge_reward_endcard_native_hor";
            if (!isLandscape()) {
                str = str2;
            } else if (this.f37568j) {
                str = "mbridge_reward_endcard_native_half_landscape";
            }
        } else {
            if (i10 != 1) {
                str2 = "";
            } else if (this.f37568j) {
                str2 = "mbridge_reward_endcard_native_half_portrait";
            }
            if (i10 != 2) {
                str = str2;
            } else if (this.f37568j) {
                str = "mbridge_reward_endcard_native_half_landscape";
            }
        }
        return findLayout(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        d();
        if (!this.f37563e) {
            this.notifyListener.a(InterfaceC0435l1.d.b.f29108e, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f);
        this.K = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    private void m() {
        try {
            CampaignEx campaignEx = this.f37560b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                String endScreenUrl = this.f37560b.getendcard_url();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    endScreenUrl = this.f37560b.getEndScreenUrl();
                }
                String strA = c1.a(endScreenUrl, "alac");
                if (!TextUtils.isEmpty(strA) && strA.equals("1") && this.f37560b.getAutoShowStoreMiniCard() != 1) {
                    postDelayed(new g(), 1000L);
                }
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    private void n() {
        try {
            CampaignEx campaignEx = this.f37560b;
            if (campaignEx == null || campaignEx.getAutoShowStoreMiniCard() == 0 || TextUtils.isEmpty(this.f37560b.getDeepLinkURL())) {
                return;
            }
            long showStoreMiniCardDelayTime = this.f37560b.getShowStoreMiniCardDelayTime();
            if (showStoreMiniCardDelayTime == 0) {
                showStoreMiniCardDelayTime = 1;
            }
            if (this.C == null) {
                this.C = new h();
            }
            postDelayed(this.C, showStoreMiniCardDelayTime * 1000);
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    private void o() {
        RelativeLayout relativeLayout;
        if (!this.f37563e || (relativeLayout = this.D) == null) {
            return;
        }
        relativeLayout.postDelayed(new b(), 200L);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        if (this.f37563e) {
            b1.a(this.f37643o, this.f37560b.getLocalRequestId(), this.f37560b.getLocalAllowTrackClick());
            this.f37643o.setOnClickListener(new n());
            this.Q.setOnClickListener(new o());
            TextView textView = this.ctaView;
            if (textView != null) {
                b1.a(textView, this.f37560b.getLocalRequestId(), this.f37560b.getLocalAllowTrackClick());
                this.ctaView.setOnClickListener(new p());
            }
            b1.a(this.f37646r, this.f37560b.getLocalRequestId(), this.f37560b.getLocalAllowTrackClick());
            this.f37646r.setOnClickListener(new q());
            b1.a(this.f37645q, this.f37560b.getLocalRequestId(), this.f37560b.getLocalAllowTrackClick());
            this.f37645q.setOnClickListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i10) {
        JSONException jSONException;
        JSONObject jSONObject;
        CampaignEx campaignEx = this.f37560b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = this.f37560b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.k() + "";
                }
                com.mbridge.msdk.foundation.same.report.j.a(com.mbridge.msdk.foundation.controller.c.n().d(), "end_card_click", this.f37560b.getCampaignUnitId(), this.f37560b.isBidCampaign(), this.f37560b.getRequestId(), this.f37560b.getRequestIdNotice(), this.f37560b.getId(), str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f33724j, a(i10));
                if (this.f37560b.getDynamicTempCode() == 5) {
                    jSONObject.put("camp_position", 0);
                }
            } catch (JSONException e11) {
                jSONException = e11;
                jSONException.printStackTrace();
            }
        } catch (JSONException e12) {
            jSONException = e12;
            jSONObject = null;
        }
        this.f37560b.setClickTempSource(2);
        this.notifyListener.a(InterfaceC0435l1.d.b.f29109f, jSONObject);
    }

    private void b(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.E);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            a(view);
            d();
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view) {
        boolean z10;
        try {
            this.f37643o = (RelativeLayout) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_native_ec_layout"));
            this.f37645q = (ImageView) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_iv_adbanner"));
            this.f37646r = (ImageView) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_iv_icon"));
            this.f37647s = (ImageView) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_iv_flag"));
            this.f37648t = (TextView) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_tv_flag"));
            this.f37649u = (ImageView) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_iv_logo"));
            this.f37650v = (ImageView) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_iv_link"));
            this.f37651w = (TextView) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_tv_apptitle"));
            this.f37654z = (LinearLayout) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_sv_starlevel"));
            this.A = (LinearLayout) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_sv_heat_count_level"));
            this.Q = view.findViewById(filterFindViewId(this.f37638a0, "mbridge_iv_close"));
            this.ctaView = (TextView) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_tv_cta"));
            this.R = (FeedBackButton) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_native_endcard_feed_btn"));
            this.D = (RelativeLayout) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_native_ec_controller"));
            this.f37644p = (ImageView) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_iv_adbanner_bg"));
            this.W = (MBridgeBaitClickView) findViewById(filterFindViewId(this.f37638a0, "mbridge_animation_click_view"));
            this.f37652x = (TextView) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_tv_appdesc"));
            if (this.f37566h) {
                ImageView imageView = this.f37645q;
                if (imageView != null && (imageView instanceof RoundImageView)) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                }
                ImageView imageView2 = this.f37646r;
                if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                    ((RoundImageView) imageView2).setBorderRadius(10);
                }
                return isNotNULL(this.f37645q, this.f37646r, this.f37651w, this.f37654z, this.Q, this.ctaView);
            }
            TextView textView = (TextView) view.findViewById(filterFindViewId(this.f37638a0, "mbridge_tv_number"));
            this.f37653y = textView;
            z10 = false;
            try {
                return isNotNULL(this.f37645q, this.f37646r, this.f37651w, this.f37652x, textView, this.f37654z, this.Q, this.ctaView);
            } catch (Throwable th2) {
                th = th2;
                q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
                return z10;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.f37638a0 = false;
        this.f37639b0 = 1;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j implements com.mbridge.msdk.video.dynview.listener.h {
        public j() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                MBridgeNativeEndCardView.this.addView(aVar.b());
                MBridgeNativeEndCardView.this.f37638a0 = aVar.c();
                if (MBridgeNativeEndCardView.this.ctaViewCanGet(aVar.b(), MBridgeNativeEndCardView.this.f37638a0)) {
                    MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView.f37563e = mBridgeNativeEndCardView.a(aVar.b());
                    MBridgeNativeEndCardView.this.l();
                } else {
                    MBridgeNativeEndCardView.this.f37638a0 = false;
                    MBridgeNativeEndCardView mBridgeNativeEndCardView2 = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView2.f37566h = false;
                    mBridgeNativeEndCardView2.j();
                }
                MBridgeNativeEndCardView mBridgeNativeEndCardView3 = MBridgeNativeEndCardView.this;
                CampaignEx campaignEx = mBridgeNativeEndCardView3.f37560b;
                if (campaignEx != null) {
                    campaignEx.setECTemplateRenderSucc(mBridgeNativeEndCardView3.f37638a0);
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            q0.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.h());
        }
    }

    private boolean b(int i10) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f37561c.inflate(i10, (ViewGroup) null);
            this.f37642n = viewGroup;
            addView(viewGroup);
            return a(this.f37642n);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f37561c.inflate(i10, (ViewGroup) null);
        this.f37641m = viewGroup2;
        addView(viewGroup2);
        return a(this.f37641m);
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet, boolean z10, int i10, boolean z11, int i11, int i12) {
        super(context, attributeSet, z10, i10, z11, i11, i12);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.f37638a0 = false;
        this.f37639b0 = 1;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class k implements com.mbridge.msdk.foundation.same.image.c {
        public k() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                if (MBridgeNativeEndCardView.this.f37645q != null) {
                    MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                    if (mBridgeNativeEndCardView.f37566h) {
                        mBridgeNativeEndCardView.f37645q.setBackground(null);
                    }
                    MBridgeNativeEndCardView.this.f37645q.setImageBitmap(bitmap);
                }
                MBridgeNativeEndCardView.this.setBannerBackGroundBlurBimap(bitmap);
            } catch (Throwable unused) {
                if (MBridgeNativeEndCardView.this.f37644p != null) {
                    MBridgeNativeEndCardView.this.f37644p.setVisibility(4);
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }
}
