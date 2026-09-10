package com.smartdigimkt.expressad.video.module;

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
import com.smartdigimkt.expressad.shake.MBShakeView;
import com.smartdigimkt.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.smartdigimkt.expressad.video.dynview.widget.AnythinkBaitClickView;
import com.smartdigimkt.expressad.videocommon.view.RoundImageView;
import com.smartdigimkt.expressad.videocommon.view.StarLevelView;
import com.smartdigimkt.expressad.widget.FeedBackButton;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.z;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkNativeEndCardView extends AnythinkBaseView implements com.smartdigimkt.x2.f {
    private static final String k1 = "sdm_reward_endcard_native_hor";
    private static final String l1 = "sdm_reward_endcard_native_land";
    private static final String m1 = "sdm_reward_endcard_native_half_portrait";
    private static final String n1 = "sdm_reward_endcard_native_half_landscape";
    private ImageView A0;
    private ImageView B0;
    private TextView C0;
    private TextView D0;
    private TextView E0;
    private LinearLayout F0;
    private FeedBackButton G0;
    private Runnable H0;
    private Runnable I0;
    private RelativeLayout J0;
    private com.smartdigimkt.y2.b K0;
    private boolean L0;
    private boolean M0;
    private int N0;
    private boolean O0;
    private boolean P0;
    private boolean Q0;
    private AlphaAnimation R0;
    private int S0;
    private int T0;
    private int U0;
    private int V0;
    private boolean W0;
    private Bitmap X0;
    private int Y0;
    private String Z0;
    private View a1;
    private TextView b1;
    private boolean c1;
    private String d1;
    private com.smartdigimkt.x.e e1;
    private MBShakeView f1;
    private com.smartdigimkt.t4.b g1;
    private AnythinkBaitClickView h1;
    private int i1;
    private boolean j1;
    private ViewGroup s0;
    private ViewGroup t0;
    private RelativeLayout u0;
    private RelativeLayout v0;
    private ImageView w0;
    private ImageView x0;
    private ImageView y0;
    private ImageView z0;

    public class a extends com.smartdigimkt.g3.a {
        public a() {
        }

        @Override // com.smartdigimkt.g3.a
        public void a(View view) {
            AnythinkNativeEndCardView.this.c(0);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.x.d dVar = AnythinkNativeEndCardView.this.f0;
            if (dVar != null && !dVar.H2() && AnythinkNativeEndCardView.this.f0.R() != 2) {
                AnythinkNativeEndCardView.this.J0.setPadding(AnythinkNativeEndCardView.this.S0, AnythinkNativeEndCardView.this.U0, AnythinkNativeEndCardView.this.T0, AnythinkNativeEndCardView.this.V0);
                AnythinkNativeEndCardView.this.J0.startAnimation(AnythinkNativeEndCardView.this.R0);
            }
            AnythinkNativeEndCardView.this.J0.setVisibility(0);
            if (AnythinkNativeEndCardView.this.a1.getVisibility() != 0 && AnythinkNativeEndCardView.this.M0) {
                AnythinkNativeEndCardView.this.a1.setVisibility(0);
            }
            AnythinkNativeEndCardView.this.e();
        }
    }

    public class c implements com.smartdigimkt.z.a {
        public c() {
        }

        @Override // com.smartdigimkt.z.a
        public void a() {
            AnythinkNativeEndCardView.this.Q0 = true;
        }

        @Override // com.smartdigimkt.z.a
        public void close() {
            AnythinkNativeEndCardView.this.Q0 = false;
        }

        @Override // com.smartdigimkt.z.a
        public void a(String str) {
            AnythinkNativeEndCardView.this.Q0 = false;
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AnythinkNativeEndCardView.this.c(0);
        }
    }

    public class e extends com.smartdigimkt.t4.b {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        @Override // com.smartdigimkt.t4.b
        public void a() {
            if (!AnythinkNativeEndCardView.this.Q0 && AnythinkNativeEndCardView.this.P0 && AnythinkNativeEndCardView.this.isShown()) {
                AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                anythinkNativeEndCardView.k0 = 0.0f;
                anythinkNativeEndCardView.l0 = 0.0f;
                anythinkNativeEndCardView.c(4);
            }
        }
    }

    public class f implements View.OnAttachStateChangeListener {
        public f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (AnythinkNativeEndCardView.this.g1 != null) {
                AnythinkNativeEndCardView.this.j1 = true;
                AnythinkNativeEndCardView.this.l();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AnythinkNativeEndCardView.this.o();
            AnythinkNativeEndCardView.this.g1 = null;
            AnythinkNativeEndCardView.this.j1 = false;
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AnythinkNativeEndCardView.this.c(0);
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AnythinkNativeEndCardView.this.c(2);
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AnythinkNativeEndCardView.this.M0 = true;
            if (AnythinkNativeEndCardView.this.a1 != null) {
                AnythinkNativeEndCardView.this.a1.setVisibility(0);
            }
        }
    }

    public class k implements com.smartdigimkt.f0.c {
        public k() {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                if (AnythinkNativeEndCardView.this.x0 != null) {
                    AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                    if (anythinkNativeEndCardView.m0) {
                        anythinkNativeEndCardView.x0.setBackgroundDrawable(null);
                    }
                    AnythinkNativeEndCardView.this.x0.setImageBitmap(bitmap);
                }
                AnythinkNativeEndCardView.this.setBannerBackGroundBlurBimap(bitmap);
            } catch (Throwable unused) {
                if (AnythinkNativeEndCardView.this.w0 != null) {
                    AnythinkNativeEndCardView.this.w0.setVisibility(4);
                }
            }
        }
    }

    public class l implements com.smartdigimkt.f0.c {
        public l() {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled() || bitmap.isRecycled()) {
                return;
            }
            try {
                float width = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
                int iA = v.a(AnythinkNativeEndCardView.this.e0, 12.0f);
                AnythinkNativeEndCardView.this.z0.getLayoutParams().height = iA;
                AnythinkNativeEndCardView.this.z0.getLayoutParams().width = (int) (iA * width);
                AnythinkNativeEndCardView.this.z0.setImageBitmap(bitmap);
                AnythinkNativeEndCardView.this.z0.setBackgroundColor(1426063360);
            } catch (Throwable unused) {
            }
        }
    }

    public class m implements Runnable {
        final /* synthetic */ Bitmap X;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                if (anythinkNativeEndCardView.m0) {
                    anythinkNativeEndCardView.w0.setBackgroundDrawable(null);
                }
                AnythinkNativeEndCardView.this.w0.setImageBitmap(AnythinkNativeEndCardView.this.X0);
            }
        }

        public m(Bitmap bitmap) {
            this.X = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
            anythinkNativeEndCardView.X0 = anythinkNativeEndCardView.blurBitmap(this.X);
            if (AnythinkNativeEndCardView.this.X0 == null || AnythinkNativeEndCardView.this.X0.isRecycled() || AnythinkNativeEndCardView.this.w0 == null) {
                return;
            }
            AnythinkNativeEndCardView.this.w0.post(new a());
        }
    }

    public class n implements View.OnClickListener {
        public n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
            boolean z2 = anythinkNativeEndCardView.m0;
            anythinkNativeEndCardView.i0.a(104, "");
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AnythinkNativeEndCardView.this.L0) {
                AnythinkNativeEndCardView.this.c(1);
            }
        }
    }

    public class p extends com.smartdigimkt.g3.a {
        public p() {
        }

        @Override // com.smartdigimkt.g3.a
        public void a(View view) {
            AnythinkNativeEndCardView.this.c(0);
        }
    }

    public class q extends com.smartdigimkt.g3.a {
        public q() {
        }

        @Override // com.smartdigimkt.g3.a
        public void a(View view) {
            AnythinkNativeEndCardView.this.c(0);
        }
    }

    public AnythinkNativeEndCardView(Context context) {
        super(context);
        this.L0 = false;
        this.M0 = false;
        this.N0 = 0;
        this.O0 = false;
        this.P0 = false;
        this.Q0 = false;
        this.W0 = false;
        this.Y0 = 1;
        this.i1 = 1;
        this.j1 = false;
    }

    private void n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerBackGroundBlurBimap(Bitmap bitmap) {
        try {
            com.smartdigimkt.t0.a.b().execute(new m(bitmap));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript renderScriptCreate = RenderScript.create(this.e0.getApplicationContext());
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
        View view = this.a1;
        return view != null && view.getVisibility() == 0;
    }

    public void clearMoreOfferBitmap() {
        com.smartdigimkt.x.e eVar;
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || !dVar.H2() || (eVar = this.e1) == null || eVar.f() == null || this.e1.f().size() <= 0) {
            return;
        }
        for (com.smartdigimkt.x.d dVar2 : this.e1.f()) {
            if (!TextUtils.isEmpty(dVar2.i())) {
                com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(dVar2.i());
            }
        }
    }

    public boolean ctaViewCanGet(View view, boolean z2) {
        try {
            View viewFindViewById = view.findViewById(filterFindViewId(z2, "sdm_tv_cta"));
            if (viewFindViewById instanceof TextView) {
                this.b1 = (TextView) viewFindViewById;
            }
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
        }
        return this.b1 != null;
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    public boolean isDyXmlSuccess() {
        return this.W0;
    }

    public void notifyShowListener() {
        this.i0.a(110, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H0 == null) {
            this.H0 = new i();
        }
        Runnable runnable = this.H0;
        if (runnable != null) {
            postDelayed(runnable, this.N0 * 1000);
            if (!this.P0) {
                this.P0 = true;
            }
            m();
        }
        d();
        f();
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.H0;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.I0;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        if (this.g1 != null) {
            com.smartdigimkt.t4.a.a().b(this.g1);
            this.g1 = null;
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || !dVar.H2()) {
            RelativeLayout relativeLayout = this.J0;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            int i2 = configuration.orientation;
            this.h0 = i2;
            if (i2 == 2) {
                removeView(this.s0);
                b(this.t0);
            } else {
                removeView(this.t0);
                b(this.s0);
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z2) {
        super.onVisibilityAggregated(z2);
        if (!z2) {
            o();
        } else {
            if (!this.j1 || this.f1 == null || this.g1 == null) {
                return;
            }
            l();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (!z2) {
            o();
        } else {
            if (!this.j1 || this.g1 == null) {
                return;
            }
            l();
        }
    }

    @Override // com.smartdigimkt.x2.f
    public void preLoadData(com.smartdigimkt.y2.b bVar) {
        this.K0 = bVar;
        try {
            if (this.f0 == null || !this.j0) {
                return;
            }
            g();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void release() {
        try {
            removeAllViews();
            AlphaAnimation alphaAnimation = this.R0;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.H0 = null;
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void setCloseBtnDelay(int i2) {
        this.N0 = i2;
    }

    public void setLayout() {
        if (this.m0) {
            h();
        } else {
            i();
        }
    }

    public void setMoreOfferCampaignUnit(com.smartdigimkt.x.e eVar) {
        MBShakeView mBShakeView;
        com.smartdigimkt.x.d dVar = this.f0;
        if (dVar == null || !dVar.H2()) {
            return;
        }
        this.e1 = eVar;
        if (eVar == null || eVar.f() == null || this.e1.f().size() <= 5 || (mBShakeView = this.f1) == null) {
            return;
        }
        mBShakeView.setPadding(0, 0, 0, v.a(getContext(), 5.0f));
    }

    public void setNotchPadding(int i2, int i3, int i4, int i5) {
        String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        this.S0 = i2;
        this.T0 = i3;
        this.U0 = i4;
        this.V0 = i5;
        p();
    }

    public void setOnPause() {
        this.P0 = false;
    }

    public void setOnResume() {
        this.P0 = true;
    }

    public void setUnitId(String str) {
        this.d1 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!com.smartdigimkt.z.b.b().a()) {
            FeedBackButton feedBackButton = this.G0;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        this.f0.G(this.d1);
        com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.d1, "_2"), new c());
        com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.d1, "_2"), this.f0);
        com.smartdigimkt.z.b.b().d(this.d1 + "_1");
        com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.d1, "_2"), this.G0);
        if (this.G0 != null) {
            com.smartdigimkt.z.b.b().a(android.support.v4.media.a.r(new StringBuilder(), this.d1, "_2"), this.G0);
        }
    }

    private void f() {
        int i2;
        int i3;
        try {
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar != null && dVar.H2()) {
                String strB2 = this.f0.B2();
                if (TextUtils.isEmpty(strB2)) {
                    strB2 = this.f0.x0();
                }
                String strA = z.a(strB2, "shake_strength");
                String strA2 = z.a(strB2, "shake_time");
                if (!TextUtils.isEmpty("1") && this.f1 == null) {
                    AnythinkBaitClickView anythinkBaitClickView = this.h1;
                    if (anythinkBaitClickView != null) {
                        anythinkBaitClickView.setVisibility(8);
                    }
                    MBShakeView mBShakeView = new MBShakeView(getContext());
                    this.f1 = mBShakeView;
                    mBShakeView.initView(this.f0.b(), true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (isLandscape()) {
                        layoutParams.addRule(13);
                    } else {
                        layoutParams.addRule(2, filterFindViewId(this.W0, "sdm_iv_logo"));
                        layoutParams.addRule(14);
                        this.f1.setPadding(0, 0, 0, v.a(getContext(), 20.0f));
                    }
                    this.f1.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.u0;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        if (this.b1 != null) {
                            this.u0.addView(this.f1);
                        }
                        this.b1.setVisibility(4);
                        this.f1.setOnClickListener(new d());
                        int i4 = 10;
                        if (!TextUtils.isEmpty(strA) && (i3 = Integer.parseInt(strA)) >= 0) {
                            i4 = i3;
                        }
                        int i5 = 5000;
                        if (!TextUtils.isEmpty(strA2) && (i2 = Integer.parseInt(strA2)) > 0) {
                            i5 = i2 * 1000;
                        }
                        this.g1 = new e(i4, i5);
                        this.f1.addOnAttachStateChangeListener(new f());
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void g() {
        com.smartdigimkt.f0.b.a(this.e0.getApplicationContext()).a(this.f0.k(), new k());
        com.smartdigimkt.f0.b.a(this.e0.getApplicationContext()).a(this.f0.i(), new com.smartdigimkt.u2.j(this.y0, v.a(com.smartdigimkt.m6.b.p().k(), 8.0f)));
        this.C0.setText(this.f0.f());
        TextView textView = this.b1;
        if (textView != null) {
            textView.setText(this.f0.b());
        }
        TextView textView2 = this.D0;
        if (textView2 != null) {
            textView2.setText(this.f0.e());
        }
        TextView textView3 = this.E0;
        if (textView3 != null) {
            textView3.setText(this.f0.m() + ")");
        }
        this.F0.removeAllViews();
        double dO = this.f0.o();
        if (dO <= 0.0d) {
            dO = 5.0d;
        }
        LinearLayout linearLayout = this.F0;
        if (linearLayout instanceof StarLevelView) {
            ((StarLevelView) linearLayout).initScore(dO);
        }
        LinearLayout linearLayout2 = this.F0;
        if (linearLayout2 instanceof AnyThinkLevelLayoutView) {
            ((AnyThinkLevelLayoutView) linearLayout2).setRatingAndUser(dO, this.f0.m());
        }
        if (!TextUtils.isEmpty(this.f0.B2()) && this.f0.B2().contains("alecfc=1")) {
            this.L0 = true;
        }
        com.smartdigimkt.f0.b.a(this.e0.getApplicationContext()).a(TextUtils.isEmpty(this.f0.P()) ? com.smartdigimkt.b.b.e0 : this.f0.P(), new l());
        v.a(this.A0, this.f0, this.e0, true);
        if (this.M0) {
            return;
        }
        this.a1.setVisibility(8);
    }

    private void h() {
        com.smartdigimkt.c2.c cVarA = new com.smartdigimkt.r2.c().a(getContext(), this.f0, this.n0, "en_");
        this.Y0 = cVarA.q();
        com.smartdigimkt.c2.b.a().a(cVarA, new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int iJ = j();
        if (iJ > 0) {
            this.j0 = b(iJ);
            k();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x001d A[PHI: r3
  0x001d: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:20:0x002b, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    private int j() {
        int i2 = this.i1;
        String str = l1;
        String str2 = k1;
        if (i2 == 0) {
            if (this.c1) {
                str2 = m1;
            }
            if (!isLandscape()) {
                str = str2;
            } else if (this.c1) {
                str = n1;
            }
        } else {
            if (i2 != 1) {
                str2 = "";
            } else if (this.c1) {
                str2 = m1;
            }
            if (i2 != 2) {
                str = str2;
            } else if (this.c1) {
                str = n1;
            }
        }
        return findLayout(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        com.smartdigimkt.t2.a aVar;
        c();
        if (!this.j0 && (aVar = this.i0) != null) {
            aVar.a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.R0 = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    private void m() {
        try {
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar != null && dVar.H2()) {
                String strB2 = this.f0.B2();
                if (TextUtils.isEmpty(strB2)) {
                    strB2 = this.f0.x0();
                }
                String strA = z.a(strB2, "alac");
                if (TextUtils.isEmpty(strA) || !strA.equals("1")) {
                    return;
                }
                postDelayed(new h(), 1000L);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void p() {
        RelativeLayout relativeLayout;
        if (!this.j0 || (relativeLayout = this.J0) == null) {
            return;
        }
        relativeLayout.postDelayed(new b(), 200L);
    }

    public void l() {
        if (this.g1 != null) {
            com.smartdigimkt.t4.a.a().a(this.g1);
        }
    }

    public void o() {
        if (this.g1 != null) {
            com.smartdigimkt.t4.a.a().b(this.g1);
        }
    }

    private void d() {
        int i2;
        AnythinkBaitClickView anythinkBaitClickView;
        try {
            com.smartdigimkt.x.d dVar = this.f0;
            if (dVar != null && dVar.H2()) {
                String strB2 = this.f0.B2();
                if (TextUtils.isEmpty(strB2)) {
                    strB2 = this.f0.x0();
                }
                String strA = z.a(strB2, "bait_click");
                try {
                    i2 = Integer.parseInt(strA);
                } catch (Throwable th) {
                    th.getMessage();
                    i2 = 1;
                }
                if (TextUtils.isEmpty(strA) || i2 == 0 || (anythinkBaitClickView = this.h1) == null) {
                    return;
                }
                anythinkBaitClickView.setVisibility(0);
                this.h1.init(1342177280, i2);
                if (this.f0.v0() == 1302) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(1342177280);
                    gradientDrawable.setStroke(0, -65536);
                    gradientDrawable.setCornerRadius(25.0f);
                    this.h1.setBackground(gradientDrawable);
                }
                this.h1.startAnimation();
                this.h1.setOnClickListener(new g());
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.video.module.AnythinkBaseView
    public void c() {
        View view = this.a1;
        if (view != null) {
            view.setOnClickListener(new n());
        }
        if (this.j0) {
            this.u0.setOnClickListener(new o());
            TextView textView = this.b1;
            if (textView != null) {
                textView.setOnClickListener(new p());
            }
            this.y0.setOnClickListener(new q());
            this.x0.setOnClickListener(new a());
        }
    }

    private void b(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.K0);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            a(view);
            c();
        }
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view) {
        try {
            this.u0 = (RelativeLayout) view.findViewById(filterFindViewId(this.W0, "sdm_native_ec_layout"));
            this.v0 = (RelativeLayout) view.findViewById(filterFindViewId(this.W0, "sdm_native_ec_layer_layout"));
            this.x0 = (ImageView) view.findViewById(filterFindViewId(this.W0, "sdm_iv_adbanner"));
            this.y0 = (ImageView) view.findViewById(filterFindViewId(this.W0, "sdm_iv_icon"));
            this.z0 = (ImageView) view.findViewById(filterFindViewId(this.W0, "sdm_iv_flag"));
            this.B0 = (ImageView) view.findViewById(filterFindViewId(this.W0, "sdm_iv_logo"));
            this.A0 = (ImageView) view.findViewById(filterFindViewId(this.W0, "sdm_iv_link"));
            this.C0 = (TextView) view.findViewById(filterFindViewId(this.W0, "sdm_tv_apptitle"));
            this.F0 = (LinearLayout) view.findViewById(filterFindViewId(this.W0, "sdm_sv_starlevel"));
            this.a1 = view.findViewById(filterFindViewId(this.W0, "sdm_iv_close"));
            View viewFindViewById = view.findViewById(filterFindViewId(this.W0, "sdm_tv_cta"));
            if (viewFindViewById != null && (viewFindViewById instanceof TextView)) {
                this.b1 = (TextView) viewFindViewById;
            }
            this.G0 = (FeedBackButton) view.findViewById(filterFindViewId(this.W0, "sdm_native_endcard_feed_btn"));
            this.J0 = (RelativeLayout) view.findViewById(filterFindViewId(this.W0, "sdm_native_ec_controller"));
            this.w0 = (ImageView) view.findViewById(filterFindViewId(this.W0, "sdm_iv_adbanner_bg"));
            this.h1 = (AnythinkBaitClickView) findViewById(filterFindViewId(this.W0, "sdm_animation_click_view"));
            this.D0 = (TextView) view.findViewById(filterFindViewId(this.W0, "sdm_tv_appdesc"));
            if (this.m0) {
                ImageView imageView = this.x0;
                if (imageView != null && (imageView instanceof RoundImageView)) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                }
                ImageView imageView2 = this.y0;
                if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                    ((RoundImageView) imageView2).setBorderRadius(10);
                }
                return isNotNULL(this.x0, this.y0, this.C0, this.F0, this.a1);
            }
            this.D0 = (TextView) view.findViewById(filterFindViewId(this.W0, "sdm_tv_appdesc"));
            TextView textView = (TextView) view.findViewById(filterFindViewId(this.W0, "sdm_tv_number"));
            this.E0 = textView;
            return isNotNULL(this.x0, this.y0, this.C0, this.D0, textView, this.F0, this.a1, this.b1);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public class j implements com.smartdigimkt.i2.h {
        public j() {
        }

        @Override // com.smartdigimkt.i2.h
        public void a(com.smartdigimkt.c2.a aVar) {
            if (aVar != null) {
                AnythinkNativeEndCardView.this.addView(aVar.b());
                AnythinkNativeEndCardView.this.W0 = aVar.c();
                if (AnythinkNativeEndCardView.this.ctaViewCanGet(aVar.b(), AnythinkNativeEndCardView.this.W0)) {
                    AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                    anythinkNativeEndCardView.j0 = anythinkNativeEndCardView.a(aVar.b());
                    AnythinkNativeEndCardView.this.k();
                } else {
                    AnythinkNativeEndCardView.this.W0 = false;
                    AnythinkNativeEndCardView anythinkNativeEndCardView2 = AnythinkNativeEndCardView.this;
                    anythinkNativeEndCardView2.m0 = false;
                    anythinkNativeEndCardView2.i();
                }
                com.smartdigimkt.x.d dVar = AnythinkNativeEndCardView.this.f0;
            }
        }

        @Override // com.smartdigimkt.i2.h
        public void a(com.smartdigimkt.f2.b bVar) {
            bVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.smartdigimkt.b0.a.i2, a(i2));
                if (this.f0.t0() == 5) {
                    jSONObject.put("camp_position", 0);
                }
            } catch (JSONException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (JSONException e3) {
            e = e3;
            jSONObject = null;
        }
        this.i0.a(105, jSONObject);
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L0 = false;
        this.M0 = false;
        this.N0 = 0;
        this.O0 = false;
        this.P0 = false;
        this.Q0 = false;
        this.W0 = false;
        this.Y0 = 1;
        this.i1 = 1;
        this.j1 = false;
    }

    private boolean b(int i2) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.g0.inflate(i2, (ViewGroup) null);
            this.t0 = viewGroup;
            addView(viewGroup);
            return a(this.t0);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.g0.inflate(i2, (ViewGroup) null);
        this.s0 = viewGroup2;
        addView(viewGroup2);
        return a(this.s0);
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet, boolean z2, int i2, boolean z3, int i3, int i4) {
        super(context, attributeSet, z2, i2, z3, i3, i4);
        this.L0 = false;
        this.M0 = false;
        this.N0 = 0;
        this.O0 = false;
        this.P0 = false;
        this.Q0 = false;
        this.W0 = false;
        this.Y0 = 1;
        this.i1 = 1;
        this.j1 = false;
    }
}
