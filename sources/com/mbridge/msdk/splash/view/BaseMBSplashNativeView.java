package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.splash.view.nativeview.MBNoRecycledCrashImageView;
import com.mbridge.msdk.splash.view.nativeview.MBSplashClickView;
import com.mbridge.msdk.widget.FeedBackButton;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BaseMBSplashNativeView extends RelativeLayout {
    private int A;
    private int B;
    private int C;
    private float D;
    private float E;
    private boolean F;
    private boolean G;
    protected boolean H;
    protected boolean I;
    protected boolean J;
    protected String K;
    private String L;
    protected MBSplashView M;
    protected CampaignEx N;
    protected MBShakeView O;
    private String P;
    private String Q;
    private String R;
    protected com.mbridge.msdk.shake.b S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBNoRecycledCrashImageView f35973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBNoRecycledCrashImageView f35974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f35975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f35976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FeedBackButton f35977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected TextView f35978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RelativeLayout f35979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MBNoRecycledCrashImageView f35980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f35981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBNoRecycledCrashImageView f35982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f35983k;
    private TextView l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected RelativeLayout f35984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected TextView f35985n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected TextView f35986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected TextView f35987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected TextView f35988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected MBSplashClickView f35989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected int f35990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35991t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f35992u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35993v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected int f35994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f35995x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected int f35996y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f35997z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements com.mbridge.msdk.foundation.same.image.c {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaseMBSplashNativeView.this.f35980h.setVisibility(4);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            Bitmap bitmapA;
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    try {
                        if (BaseMBSplashNativeView.this.f35980h == null || (bitmapA = p0.a(bitmap, 1, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 40.0f))) == null || bitmapA.isRecycled()) {
                            return;
                        }
                        BaseMBSplashNativeView.this.f35980h.setImageBitmap(bitmapA);
                        return;
                    } catch (Throwable th2) {
                        q0.b("MBSplashNativeView", th2.getMessage());
                        BaseMBSplashNativeView.this.f35980h.setImageBitmap(bitmap);
                        return;
                    }
                    q0.b("MBSplashNativeView", th.getMessage());
                } catch (Throwable th3) {
                    q0.b("MBSplashNativeView", th3.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView.this.a(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView.this.a(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            if (baseMBSplashNativeView.H) {
                if (baseMBSplashNativeView.M.getSplashSignalCommunicationImpl() != null && BaseMBSplashNativeView.this.M.getSplashSignalCommunicationImpl().a() != null) {
                    BaseMBSplashNativeView.this.M.getSplashSignalCommunicationImpl().a().close();
                }
                BaseMBSplashNativeView.this.f35978f.setVisibility(4);
                BaseMBSplashNativeView.this.f35978f.setEnabled(false);
            }
        }
    }

    public BaseMBSplashNativeView(Context context) {
        super(context);
        this.I = false;
        this.J = false;
    }

    private void i() {
        if (this.f35993v == 1) {
            this.f35989r.setVisibility(8);
        } else if (this.f35995x == 1) {
            this.f35989r.setVisibility(8);
        } else {
            this.f35989r.initView(this.N.getAdCall());
        }
    }

    private void j() {
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.N.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.N.getBidToken(), eVar, this.N, this.K);
        if (this.f35992u == 1) {
            b1.a(this, cVarA.t(), this.N.getLocalAllowTrackClick());
            setOnClickListener(new d());
        } else {
            b1.a(this.f35989r, cVarA.t(), this.N.getLocalAllowTrackClick());
            this.f35989r.setOnClickListener(new e());
        }
        this.f35978f.setOnClickListener(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountDownStatus(boolean z10) {
        if (this.M.getSplashSignalCommunicationImpl() == null || this.M.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        this.M.getSplashSignalCommunicationImpl().a().a(z10 ? 2 : 1, this.f35991t);
    }

    public void b() {
    }

    public void e() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f35995x != 1 || this.O == null || this.S == null) {
                return;
            }
            com.mbridge.msdk.shake.a.a().a(this.S);
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.D = motionEvent.getRawX();
        this.E = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void release() {
        try {
            if (this.S != null) {
                com.mbridge.msdk.shake.a.a().b(this.S);
                this.S = null;
            }
            com.mbridge.msdk.foundation.feedback.b.b().d(this.K);
            detachAllViewsFromParent();
        } catch (Exception e10) {
            q0.b("MBSplashNativeView", e10.getMessage());
        }
    }

    public void setIsPause(boolean z10) {
        this.I = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        try {
            RelativeLayout relativeLayout = this.f35975c;
            if (relativeLayout == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            int i14 = this.C;
            layoutParams.leftMargin = i10 + i14;
            layoutParams.rightMargin = i11 + i14;
            layoutParams.topMargin = i12 + i14;
            layoutParams.bottomMargin = i14 + i13;
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    public void updateCountDown(int i10) {
        String str;
        if (this.f35978f != null) {
            this.f35991t = i10;
            if (this.H) {
                str = this.Q + " " + i10 + this.P;
            } else {
                str = i10 + this.P + " " + this.R;
            }
            this.f35978f.setText(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.mbridge.msdk.foundation.feedback.a {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = true;
            baseMBSplashNativeView.setCountDownStatus(false);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements com.mbridge.msdk.foundation.feedback.a {
        public g() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = true;
            baseMBSplashNativeView.setCountDownStatus(false);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }
    }

    private void c() {
        try {
            this.F = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
        a();
        g();
        h();
        e();
        i();
        j();
        b();
        updateCountDown(this.f35990s);
    }

    private void d() {
        try {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.A == 1 ? i0.a(getContext().getApplicationContext(), "mbridge_splash_portrait", TtmlNode.TAG_LAYOUT) : i0.a(getContext().getApplicationContext(), "mbridge_splash_landscape", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
            addView(viewInflate);
            this.f35973a = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_image_bg", "id"));
            this.f35974b = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_image", "id"));
            this.f35975c = (RelativeLayout) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_topcontroller", "id"));
            this.f35976d = (ImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_link", "id"));
            this.f35977e = (FeedBackButton) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_feedback", "id"));
            this.f35978f = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_skip", "id"));
            this.f35979g = (RelativeLayout) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_landscape_foreground", "id"));
            this.f35980h = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_icon", "id"));
            this.f35981i = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_title", "id"));
            this.f35982j = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_foregroundimage", "id"));
            this.f35983k = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_adrect", "id"));
            this.f35984m = (RelativeLayout) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_layout_appinfo", "id"));
            this.f35985n = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_appinfo", "id"));
            this.f35986o = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_privacy", "id"));
            this.f35987p = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_permission", "id"));
            this.f35988q = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_app_desc", "id"));
            this.f35989r = (MBSplashClickView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_click", "id"));
            this.l = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_adcircle", "id"));
            int iA = i0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip", "string");
            int iA2 = i0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip_not", "string");
            int iA3 = i0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip_s", "string");
            this.Q = getContext().getResources().getString(iA);
            this.R = getContext().getResources().getString(iA2);
            this.P = getContext().getResources().getString(iA3);
            this.C = v0.a(getContext(), 9.0f);
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (TextUtils.isEmpty(this.N.getIconUrl())) {
            this.f35980h.setVisibility(4);
        } else {
            f2.g().a(this.N.getIconUrl(), new b());
        }
    }

    private void g() {
        if (TextUtils.isEmpty(this.N.getImageUrl())) {
            this.f35974b.setVisibility(4);
        } else {
            f2.g().a(this.N.getImageUrl(), new a());
        }
    }

    private void h() {
        Drawable drawable;
        v0.a(3, this.f35976d, this.N, getContext(), true, new c());
        try {
            drawable = getResources().getDrawable(i0.a(getContext().getApplicationContext(), "mbridge_splash_m_circle", "drawable"));
            try {
                drawable.setBounds(0, 0, v0.a(getContext(), 10.0f), v0.a(getContext(), 10.0f));
            } catch (Throwable th2) {
                th = th2;
                q0.b("MBSplashNativeView", th.getMessage());
            }
        } catch (Throwable th3) {
            th = th3;
            drawable = null;
        }
        if (this.A == 1 && this.G) {
            if (this.B != 0 && drawable != null) {
                this.l.setCompoundDrawables(drawable, null, null, null);
            }
            this.l.setText(this.F ? "广告" : "AD");
            this.f35983k.setVisibility(4);
            return;
        }
        if (this.B != 0 && drawable != null) {
            this.f35983k.setCompoundDrawables(drawable, null, null, null);
        }
        this.f35983k.setText(this.F ? "广告" : "AD");
        this.l.setVisibility(4);
    }

    public void a(int i10) {
        if (this.M.getSplashSignalCommunicationImpl() == null || this.M.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        try {
            this.M.getSplashSignalCommunicationImpl().a().a(com.mbridge.msdk.splash.common.util.a.a(com.mbridge.msdk.splash.common.util.a.a(i10, this.D, this.E), this.N));
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
            this.M.getSplashSignalCommunicationImpl().a().a(this.N);
        }
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.I = false;
        this.J = false;
    }

    public BaseMBSplashNativeView(Context context, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar) {
        super(context);
        this.I = false;
        this.J = false;
        if (cVar != null) {
            this.K = cVar.l();
            this.L = cVar.h();
            this.N = cVar.b();
            this.M = mBSplashView;
            this.f35990s = cVar.d();
            this.f35993v = cVar.c();
            this.f35992u = cVar.f();
            this.f35994w = cVar.a();
            this.f35995x = cVar.i();
            this.f35996y = cVar.j();
            this.f35997z = cVar.k();
            this.A = cVar.g();
            this.H = cVar.m();
            this.B = cVar.e();
            d();
            c();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    private void a() {
        CampaignEx campaignEx = this.N;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.K);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.N);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, new g());
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.f35977e);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.N);
            return;
        }
        FeedBackButton feedBackButton = this.f35977e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements com.mbridge.msdk.foundation.same.image.c {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    if (bitmap.getWidth() < bitmap.getHeight()) {
                        BaseMBSplashNativeView.this.G = true;
                        BaseMBSplashNativeView.this.f35979g.setVisibility(4);
                        BaseMBSplashNativeView.this.f35974b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseMBSplashNativeView.this.f35974b.setImageBitmap(bitmap);
                    } else if (BaseMBSplashNativeView.this.A == 1) {
                        BaseMBSplashNativeView.this.f35979g.setVisibility(0);
                        try {
                            Bitmap bitmapA = p0.a(bitmap, 1, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f));
                            if (bitmapA != null && !bitmapA.isRecycled()) {
                                BaseMBSplashNativeView.this.f35982j.setScaleType(ImageView.ScaleType.FIT_XY);
                                BaseMBSplashNativeView.this.f35982j.setImageBitmap(bitmapA);
                            }
                        } catch (Throwable th2) {
                            try {
                                q0.b("MBSplashNativeView", th2.getMessage());
                                BaseMBSplashNativeView.this.f35982j.setImageBitmap(bitmap);
                            } catch (Throwable th3) {
                                q0.b("MBSplashNativeView", th3.getMessage());
                            }
                        }
                        BaseMBSplashNativeView.this.f35981i.setText(BaseMBSplashNativeView.this.N.getAppName());
                        BaseMBSplashNativeView.this.f();
                        try {
                            try {
                                Bitmap bitmapA2 = p0.a(bitmap);
                                if (bitmapA2 != null && !bitmapA2.isRecycled()) {
                                    BaseMBSplashNativeView.this.f35974b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    BaseMBSplashNativeView.this.f35974b.setImageBitmap(bitmapA2);
                                }
                            } catch (Throwable unused) {
                                BaseMBSplashNativeView.this.f35974b.setImageBitmap(bitmap);
                            }
                        } catch (Throwable th4) {
                            q0.b("MBSplashNativeView", th4.getMessage());
                        }
                    } else {
                        BaseMBSplashNativeView.this.f35979g.setVisibility(4);
                        BaseMBSplashNativeView.this.f35974b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseMBSplashNativeView.this.f35974b.setImageBitmap(bitmap);
                    }
                    try {
                        Bitmap bitmapA3 = p0.a(bitmap);
                        if (bitmapA3 == null || bitmapA3.isRecycled()) {
                            return;
                        }
                        BaseMBSplashNativeView.this.f35973a.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        BaseMBSplashNativeView.this.f35973a.setImageBitmap(bitmapA3);
                        return;
                    } catch (Throwable unused2) {
                        BaseMBSplashNativeView.this.f35974b.setImageBitmap(bitmap);
                        return;
                    }
                    q0.b("MBSplashNativeView", th.getMessage());
                } catch (Throwable th5) {
                    q0.b("MBSplashNativeView", th5.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }
}
