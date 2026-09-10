package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.component.CTAButtonLayout;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class AsseblemSplashATView extends BaseSdkSplashATView {
    protected TextView l1;
    protected TextView m1;
    protected RoundImageView n1;
    protected View o1;

    public class a implements com.smartdigimkt.y5.a {
        public a() {
        }

        @Override // com.smartdigimkt.y5.a
        public void a(int i2, int i3) {
            AsseblemSplashATView.this.a(i2, i3);
        }
    }

    public class b implements com.smartdigimkt.d7.b.f {
        public b() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, AsseblemSplashATView.this.g0.w())) {
                AsseblemSplashATView.this.n1.setImageBitmap(bitmap);
            }
        }
    }

    public class c implements com.smartdigimkt.a6.b.a {
        public c() {
        }

        @Override // com.smartdigimkt.a6.b.a
        public void a(int i2, int i3) {
            AsseblemSplashATView.this.a(i2, i3);
        }
    }

    public class d implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FrameLayout f38268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WrapRoundImageView f38269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RoundImageView f38270c;

        public class a implements Runnable {
            final /* synthetic */ Bitmap X;

            public a(Bitmap bitmap) {
                this.X = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                dVar.f38269b.setBitmapAndResize(this.X, dVar.f38268a.getWidth(), d.this.f38268a.getHeight());
                d.this.f38269b.setVisibility(0);
            }
        }

        public class b implements com.smartdigimkt.o8.b.InterfaceC0563b {
            public b() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a(Bitmap bitmap) {
                d.this.f38270c.setImageBitmap(bitmap);
            }
        }

        public d(FrameLayout frameLayout, WrapRoundImageView wrapRoundImageView, RoundImageView roundImageView) {
            this.f38268a = frameLayout;
            this.f38269b = wrapRoundImageView;
            this.f38270c = roundImageView;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, AsseblemSplashATView.this.g0.s())) {
                this.f38268a.post(new a(bitmap));
                com.smartdigimkt.o8.b.a(AsseblemSplashATView.this.getContext(), bitmap, new b());
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AsseblemSplashATView asseblemSplashATView = AsseblemSplashATView.this;
            if (asseblemSplashATView.I0 == null) {
                return;
            }
            asseblemSplashATView.m();
        }
    }

    public AsseblemSplashATView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void D() {
        this.o1 = findViewById(h.a(getContext(), "myoffer_splash_ad_bottom_container", "id"));
        this.l1 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_ad_title", "id"));
        this.m1 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_desc", "id"));
        this.n1 = (RoundImageView) findViewById(h.a(getContext(), "myoffer_splash_icon", "id"));
        this.q0 = findViewById(h.a(getContext(), "myoffer_splash_ad_cta_layout", "id"));
        if (TextUtils.isEmpty(this.g0.w())) {
            com.smartdigimkt.a6.b.a((View) this.n1, true, false);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.n1.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.rightMargin = 0;
                this.n1.setLayoutParams(layoutParams);
            }
            if (this.f0.t.D1() != 2) {
                TextView textView = this.l1;
                if (textView != null) {
                    textView.setGravity(17);
                }
                TextView textView2 = this.m1;
                if (textView2 != null) {
                    textView2.setGravity(17);
                }
            }
        } else {
            this.n1.setVisibility(0);
            this.n1.setNeedRadiu(true);
            this.n1.setRadiusInDip(12);
            int i2 = this.n1.getLayoutParams().width;
            com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, this.g0.w()), i2, i2, new b());
        }
        if (this.f0.t.T() != 1) {
            this.n0.add(this.n1);
        }
        if (TextUtils.isEmpty(this.g0.g0())) {
            this.l1.setVisibility(4);
        } else {
            this.l1.setText(this.g0.g0());
            this.l1.setVisibility(0);
        }
        if (this.f0.t.T() != 1) {
            this.n0.add(this.l1);
        }
        View view = this.q0;
        if (view != null) {
            if (view instanceof CTAButtonLayout) {
                ((CTAButtonLayout) view).initSetting(this.g0, this.f0, false, new c());
                ((CTAButtonLayout) this.q0).changeMinorButtonStyle();
            }
            this.n0.add(this.q0);
        }
        if (this.m1 != null) {
            if (TextUtils.isEmpty(this.g0.r())) {
                this.m1.setVisibility(8);
            } else {
                this.m1.setText(this.g0.r());
            }
            if (this.f0.t.T() != 1) {
                this.n0.add(this.m1);
            }
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void F() {
        super.a(this.f0.t.i0() < 0 ? 100 : this.f0.t.i0(), new e());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView, com.smartdigimkt.sdk.basead.ui.BaseSplashATView
    public void beforeSplashEndCardShow() {
        super.beforeSplashEndCardShow();
        TextView textView = (TextView) findViewById(h.a(getContext(), "myoffer_splash_ad_title", "id"));
        View viewFindViewById = findViewById(h.a(getContext(), "myoffer_splash_ad_cta_layout", "id"));
        TextView textView2 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_desc", "id"));
        RoundImageView roundImageView = (RoundImageView) findViewById(h.a(getContext(), "myoffer_splash_icon", "id"));
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        if (roundImageView != null) {
            roundImageView.setVisibility(8);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void d() {
        View viewInflate = this.f0.t.D1() == 2 ? LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_ad_layout_asseblem_vertical_land", "layout"), this) : LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_ad_layout_asseblem_vertical_port", "layout"), this);
        B();
        com.smartdigimkt.a6.d dVar = this.R0;
        if (dVar != null) {
            dVar.a(com.smartdigimkt.a6.d.o).a(new a()).a(getContext(), viewInflate);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void z() {
        super.z();
        FrameLayout frameLayout = (FrameLayout) findViewById(h.a(getContext(), "myoffer_splash_ad_content_image_area", "id"));
        RoundImageView roundImageView = (RoundImageView) findViewById(h.a(getContext(), "myoffer_splash_bg", "id"));
        frameLayout.removeAllViews();
        WrapRoundImageView wrapRoundImageView = new WrapRoundImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        wrapRoundImageView.setLayoutParams(layoutParams);
        wrapRoundImageView.setNeedRadiu(false);
        wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        wrapRoundImageView.setVisibility(4);
        frameLayout.addView(wrapRoundImageView, layoutParams);
        frameLayout.setVisibility(0);
        roundImageView.setNeedRadiu(false);
        roundImageView.setVisibility(0);
        if (TextUtils.isEmpty(this.g0.s())) {
            roundImageView.setBackgroundColor(Color.parseColor("#EFEFEF"));
            return;
        }
        com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, this.g0.s()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new d(frameLayout, wrapRoundImageView, roundImageView));
        if (this.f0.t.T() != 1) {
            this.n0.add(wrapRoundImageView);
        }
    }

    public AsseblemSplashATView(Context context, com.smartdigimkt.v6.a aVar, f fVar, com.smartdigimkt.f5.a aVar2) {
        super(context, aVar, fVar, aVar2);
    }
}
