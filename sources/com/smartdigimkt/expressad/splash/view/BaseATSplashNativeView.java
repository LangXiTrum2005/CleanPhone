package com.smartdigimkt.expressad.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.expressad.shake.MBShakeView;
import com.smartdigimkt.expressad.widget.FeedBackButton;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.q;
import com.smartdigimkt.v0.v;

/* JADX INFO: loaded from: classes5.dex */
public class BaseATSplashNativeView extends RelativeLayout {
    private static final String Y0 = "MBSplashNativeView";
    protected int A0;
    protected int B0;
    protected int C0;
    protected int D0;
    private int E0;
    private int F0;
    private int G0;
    private float H0;
    private float I0;
    private boolean J0;
    private boolean K0;
    protected boolean L0;
    protected boolean M0;
    protected boolean N0;
    private String O0;
    private String P0;
    protected ATSplashView Q0;
    protected com.smartdigimkt.x.d R0;
    protected MBShakeView S0;
    private String T0;
    private String U0;
    private String V0;
    private String W0;
    protected com.smartdigimkt.t4.b X0;
    private MBNoRecycledCrashImageView e0;
    private MBNoRecycledCrashImageView f0;
    private RelativeLayout g0;
    private ImageView h0;
    private FeedBackButton i0;
    protected TextView j0;
    private RelativeLayout k0;
    private MBNoRecycledCrashImageView l0;
    private TextView m0;
    private MBNoRecycledCrashImageView n0;
    private TextView o0;
    private TextView p0;
    protected RelativeLayout q0;
    protected TextView r0;
    protected TextView s0;
    protected TextView t0;
    protected TextView u0;
    protected MBSplashClickView v0;
    private int w0;
    private int x0;
    private int y0;
    private int z0;

    public class a implements com.smartdigimkt.f0.c {

        /* JADX INFO: renamed from: com.smartdigimkt.expressad.splash.view.BaseATSplashNativeView$a$a, reason: collision with other inner class name */
        public class C0473a implements com.smartdigimkt.o8.b.InterfaceC0563b {
            public C0473a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a(Bitmap bitmap) {
                if (bitmap == null || bitmap.isRecycled()) {
                    return;
                }
                BaseATSplashNativeView.this.e0.setScaleType(ImageView.ScaleType.CENTER_CROP);
                BaseATSplashNativeView.this.e0.setImageBitmap(bitmap);
            }
        }

        public a() {
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
                    if (bitmap.getWidth() < bitmap.getHeight()) {
                        BaseATSplashNativeView.this.K0 = true;
                        BaseATSplashNativeView.this.k0.setVisibility(4);
                        BaseATSplashNativeView.this.f0.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseATSplashNativeView.this.f0.setImageBitmap(bitmap);
                    } else if (BaseATSplashNativeView.this.E0 == 1) {
                        BaseATSplashNativeView.this.k0.setVisibility(0);
                        try {
                            Bitmap bitmapA = q.a(bitmap, 1, v.a(com.smartdigimkt.m6.b.p().k(), 10.0f));
                            if (bitmapA != null && !bitmapA.isRecycled()) {
                                BaseATSplashNativeView.this.n0.setScaleType(ImageView.ScaleType.FIT_XY);
                                BaseATSplashNativeView.this.n0.setImageBitmap(bitmapA);
                            }
                        } catch (Throwable th) {
                            try {
                                th.getMessage();
                                BaseATSplashNativeView.this.n0.setImageBitmap(bitmap);
                            } catch (Throwable th2) {
                                th2.getMessage();
                            }
                        }
                        BaseATSplashNativeView.this.m0.setText(BaseATSplashNativeView.this.R0.f());
                        BaseATSplashNativeView.this.g();
                    } else {
                        BaseATSplashNativeView.this.k0.setVisibility(4);
                        BaseATSplashNativeView.this.f0.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseATSplashNativeView.this.f0.setImageBitmap(bitmap);
                    }
                    try {
                        com.smartdigimkt.o8.b.a(com.smartdigimkt.m6.b.p().k(), bitmap, new C0473a());
                    } catch (Throwable unused) {
                        BaseATSplashNativeView.this.f0.setImageBitmap(bitmap);
                    }
                } catch (Throwable th3) {
                    th3.getMessage();
                }
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseATSplashNativeView.this.a(1);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseATSplashNativeView.this.a(0);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseATSplashNativeView baseATSplashNativeView = BaseATSplashNativeView.this;
            if (baseATSplashNativeView.L0) {
                if (baseATSplashNativeView.Q0.getSplashJSBridgeImpl() != null && BaseATSplashNativeView.this.Q0.getSplashJSBridgeImpl().getSplashBridgeListener() != null) {
                    BaseATSplashNativeView.this.Q0.getSplashJSBridgeImpl().getSplashBridgeListener().close();
                }
                BaseATSplashNativeView.this.j0.setVisibility(4);
                BaseATSplashNativeView.this.j0.setEnabled(false);
            }
        }
    }

    public BaseATSplashNativeView(Context context) {
        super(context);
        this.M0 = false;
        this.N0 = false;
    }

    private void i() {
        Drawable drawable;
        v.a(this.h0, this.R0, getContext(), true);
        try {
            drawable = getResources().getDrawable(k.a(getContext().getApplicationContext(), "sdm_splash_m_circle", k.d));
            try {
                drawable.setBounds(0, 0, v.a(getContext(), 10.0f), v.a(getContext(), 10.0f));
            } catch (Throwable th) {
                th = th;
                th.getMessage();
            }
        } catch (Throwable th2) {
            th = th2;
            drawable = null;
        }
        if (this.E0 == 1 && this.K0) {
            if (this.F0 != 0 && drawable != null) {
                this.p0.setCompoundDrawables(drawable, null, null, null);
            }
            this.p0.setText(k.a(com.smartdigimkt.m6.b.p().k(), "sdm_splash_ad_text", k.f38992h));
            this.o0.setVisibility(4);
            return;
        }
        if (this.F0 != 0 && drawable != null) {
            this.o0.setCompoundDrawables(drawable, null, null, null);
        }
        this.o0.setText(k.a(com.smartdigimkt.m6.b.p().k(), "sdm_splash_ad_text", k.f38992h));
        this.p0.setVisibility(4);
    }

    private void j() {
        if (this.z0 == 1) {
            this.v0.setVisibility(8);
        } else if (this.B0 == 1) {
            this.v0.setVisibility(8);
        } else {
            this.v0.initView(this.R0.b());
        }
    }

    private void k() {
        if (this.y0 == 1) {
            setOnClickListener(new c());
        } else {
            this.v0.setOnClickListener(new d());
        }
        this.j0.setOnClickListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountDownStatus(boolean z2) {
        if (this.Q0.getSplashJSBridgeImpl() == null || this.Q0.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        this.Q0.getSplashJSBridgeImpl().getSplashBridgeListener().a(z2 ? 2 : 1, this.x0);
    }

    public void b() {
    }

    public void f() {
    }

    public void l() {
        if (this.X0 != null) {
            com.smartdigimkt.t4.a.a().b(this.X0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.B0 != 1 || this.S0 == null || this.X0 == null) {
                return;
            }
            e();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.H0 = motionEvent.getRawX();
        this.I0 = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        TextView textView = this.j0;
        if (textView == null || textView.getParent() == null || !(this.j0.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((ViewGroup) this.j0.getParent()).getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            int iF = h.f(getContext()) + ((RelativeLayout.LayoutParams) layoutParams).topMargin;
            int[] iArr = new int[2];
            this.j0.getLocationOnScreen(iArr);
            int i6 = iArr[1];
            if (i6 < iF) {
                int i7 = iF - i6;
                ViewParent parent = this.j0.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop() + i7, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom() + i7);
                }
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z2) {
        super.onVisibilityAggregated(z2);
        if (!z2) {
            l();
        } else {
            if (this.B0 != 1 || this.S0 == null || this.X0 == null) {
                return;
            }
            e();
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
            l();
        } else {
            if (this.B0 != 1 || this.S0 == null || this.X0 == null) {
                return;
            }
            e();
        }
    }

    public void release() {
        try {
            if (this.X0 != null) {
                l();
                this.X0 = null;
            }
            com.smartdigimkt.z.b.b().d(this.O0);
            detachAllViewsFromParent();
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void setIsPause(boolean z2) {
        this.M0 = z2;
    }

    public void setNotchPadding(int i2, int i3, int i4, int i5) {
        try {
            RelativeLayout relativeLayout = this.g0;
            if (relativeLayout == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            int i6 = this.G0;
            layoutParams.leftMargin = i2 + i6;
            layoutParams.rightMargin = i3 + i6;
            layoutParams.topMargin = i4 + i6;
            layoutParams.bottomMargin = i6 + i5;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void updateCountDown(int i2) {
        String str;
        if (this.j0 != null) {
            this.x0 = i2;
            if (i2 <= 0) {
                str = this.W0;
            } else if (this.L0) {
                str = this.U0 + " " + i2 + this.T0;
            } else {
                str = i2 + this.T0 + " " + this.V0;
            }
            this.j0.setText(str);
        }
    }

    public class f implements com.smartdigimkt.z.a {
        public f() {
        }

        @Override // com.smartdigimkt.z.a
        public void a() {
            BaseATSplashNativeView baseATSplashNativeView = BaseATSplashNativeView.this;
            baseATSplashNativeView.N0 = true;
            baseATSplashNativeView.setCountDownStatus(false);
        }

        @Override // com.smartdigimkt.z.a
        public void close() {
            BaseATSplashNativeView baseATSplashNativeView = BaseATSplashNativeView.this;
            baseATSplashNativeView.N0 = false;
            baseATSplashNativeView.setCountDownStatus(true);
        }

        @Override // com.smartdigimkt.z.a
        public void a(String str) {
            BaseATSplashNativeView baseATSplashNativeView = BaseATSplashNativeView.this;
            baseATSplashNativeView.N0 = false;
            baseATSplashNativeView.setCountDownStatus(true);
        }
    }

    private void c() {
        try {
            this.J0 = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.smartdigimkt.d2.a.S);
        } catch (Throwable th) {
            th.getMessage();
        }
        a();
        h();
        i();
        f();
        j();
        k();
        b();
        updateCountDown(this.w0);
    }

    private void d() {
        try {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.E0 == 1 ? k.a(getContext().getApplicationContext(), "sdm_splash_portrait", "layout") : k.a(getContext().getApplicationContext(), "sdm_splash_landscape", "layout"), (ViewGroup) null);
            addView(viewInflate);
            this.e0 = (MBNoRecycledCrashImageView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_iv_image_bg", "id"));
            this.f0 = (MBNoRecycledCrashImageView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_iv_image", "id"));
            this.g0 = (RelativeLayout) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_topcontroller", "id"));
            this.h0 = (ImageView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_iv_link", "id"));
            this.i0 = (FeedBackButton) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_feedback", "id"));
            this.j0 = (TextView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_tv_skip", "id"));
            this.k0 = (RelativeLayout) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_landscape_foreground", "id"));
            this.l0 = (MBNoRecycledCrashImageView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_iv_icon", "id"));
            this.m0 = (TextView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_tv_title", "id"));
            this.n0 = (MBNoRecycledCrashImageView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_iv_foregroundimage", "id"));
            this.o0 = (TextView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_tv_adrect", "id"));
            this.q0 = (RelativeLayout) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_layout_appinfo", "id"));
            this.r0 = (TextView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_tv_appinfo", "id"));
            this.s0 = (TextView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_tv_privacy", "id"));
            this.t0 = (TextView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_tv_permission", "id"));
            this.u0 = (TextView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_tv_app_desc", "id"));
            this.v0 = (MBSplashClickView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_tv_click", "id"));
            this.p0 = (TextView) viewInflate.findViewById(k.a(getContext().getApplicationContext(), "sdm_splash_tv_adcircle", "id"));
            int iA = k.a(getContext().getApplicationContext(), "sdm_splash_count_time_can_skip", k.f38992h);
            int iA2 = k.a(getContext().getApplicationContext(), "sdm_splash_count_time_can_skip_not", k.f38992h);
            int iA3 = k.a(getContext().getApplicationContext(), "sdm_splash_count_time_can_skip_s", k.f38992h);
            int iA4 = k.a(getContext().getApplicationContext(), "sdm_splash_count_time_can_skip_action", k.f38992h);
            this.U0 = getContext().getResources().getString(iA);
            this.V0 = getContext().getResources().getString(iA2);
            this.T0 = getContext().getResources().getString(iA3);
            this.W0 = getContext().getResources().getString(iA4);
            this.G0 = v.a(getContext(), 9.0f);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (TextUtils.isEmpty(this.R0.i())) {
            this.l0.setVisibility(4);
        } else {
            com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(this.R0.i(), new b());
        }
    }

    private void h() {
        if (TextUtils.isEmpty(this.R0.k())) {
            this.f0.setVisibility(4);
        } else {
            com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(this.R0.k(), new a());
        }
    }

    public void e() {
        if (this.X0 != null) {
            com.smartdigimkt.t4.a.a().a(this.X0);
        }
    }

    public void a(int i2) {
        if (this.Q0.getSplashJSBridgeImpl() == null || this.Q0.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        try {
            this.Q0.getSplashJSBridgeImpl().getSplashBridgeListener().install(com.smartdigimkt.r1.a.a(com.smartdigimkt.r1.a.a(i2, this.H0, this.I0), this.R0));
        } catch (Throwable th) {
            th.getMessage();
            this.Q0.getSplashJSBridgeImpl().getSplashBridgeListener().install(this.R0);
        }
    }

    public BaseATSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseATSplashNativeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.M0 = false;
        this.N0 = false;
    }

    public class b implements com.smartdigimkt.f0.c {
        public b() {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            Bitmap bitmapA;
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    try {
                        if (BaseATSplashNativeView.this.l0 == null || (bitmapA = q.a(bitmap, 1, v.a(com.smartdigimkt.m6.b.p().k(), 40.0f))) == null || bitmapA.isRecycled()) {
                            return;
                        }
                        BaseATSplashNativeView.this.l0.setImageBitmap(bitmapA);
                    } catch (Throwable th) {
                        th.getMessage();
                        BaseATSplashNativeView.this.l0.setImageBitmap(bitmap);
                    }
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
            BaseATSplashNativeView.this.l0.setVisibility(4);
        }
    }

    public BaseATSplashNativeView(Context context, ATSplashView aTSplashView, com.smartdigimkt.q1.b bVar) {
        super(context);
        this.M0 = false;
        this.N0 = false;
        if (bVar != null) {
            this.O0 = bVar.m();
            this.P0 = bVar.i();
            this.R0 = bVar.b();
            this.Q0 = aTSplashView;
            this.w0 = bVar.d();
            this.z0 = bVar.c();
            this.y0 = bVar.f();
            this.A0 = bVar.a();
            this.B0 = bVar.j();
            this.C0 = bVar.k();
            this.D0 = bVar.l();
            this.E0 = bVar.h();
            this.L0 = bVar.n();
            this.F0 = bVar.e();
            d();
            c();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    private void a() {
        com.smartdigimkt.x.d dVar = this.R0;
        if (dVar != null) {
            dVar.G(this.O0);
        }
        if (com.smartdigimkt.z.b.b().a()) {
            com.smartdigimkt.z.b.b().a(this.O0, new f());
            com.smartdigimkt.z.b.b().a(this.O0, this.i0);
            com.smartdigimkt.z.b.b().a(this.O0, this.R0);
        } else {
            FeedBackButton feedBackButton = this.i0;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
    }
}
