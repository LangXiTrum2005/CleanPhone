package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;

/* JADX INFO: loaded from: classes6.dex */
public class AsseblemCardSplashATView extends BaseNewStyleSDKSplashATView {
    protected TextView o1;
    protected TextView p1;
    protected TextView q1;
    protected RoundImageView r1;
    private SplashShakeTextHintView s1;
    private ImageView t1;

    public class a implements com.smartdigimkt.y5.a {
        public a() {
        }

        @Override // com.smartdigimkt.y5.a
        public void a(int i2, int i3) {
            AsseblemCardSplashATView.this.a(i2, i3);
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
            if (TextUtils.equals(str, AsseblemCardSplashATView.this.g0.w())) {
                AsseblemCardSplashATView.this.r1.setImageBitmap(bitmap);
            }
        }
    }

    public class c implements BaseShakeView.o {
        public c() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView.o
        public boolean a() {
            if (!AsseblemCardSplashATView.this.q()) {
                return false;
            }
            AsseblemCardSplashATView.this.a(4, 5);
            return true;
        }
    }

    public class d implements com.smartdigimkt.d7.b.f {
        public d() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (AsseblemCardSplashATView.this.t1 != null) {
                AsseblemCardSplashATView.this.t1.setImageBitmap(bitmap);
            }
        }
    }

    public class e implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FrameLayout f38260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WrapRoundImageView f38261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RoundImageView f38262c;

        public class a implements Runnable {
            final /* synthetic */ Bitmap X;

            public a(Bitmap bitmap) {
                this.X = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f38261b.setBitmapAndResize(this.X, eVar.f38260a.getWidth(), e.this.f38260a.getHeight());
                e.this.f38261b.setVisibility(0);
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
                e.this.f38262c.setImageBitmap(bitmap);
            }
        }

        public e(FrameLayout frameLayout, WrapRoundImageView wrapRoundImageView, RoundImageView roundImageView) {
            this.f38260a = frameLayout;
            this.f38261b = wrapRoundImageView;
            this.f38262c = roundImageView;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, AsseblemCardSplashATView.this.g0.s())) {
                this.f38260a.post(new a(bitmap));
                com.smartdigimkt.o8.b.a(AsseblemCardSplashATView.this.getContext(), bitmap, new b());
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AsseblemCardSplashATView asseblemCardSplashATView = AsseblemCardSplashATView.this;
            if (asseblemCardSplashATView.I0 == null) {
                return;
            }
            asseblemCardSplashATView.m();
        }
    }

    public AsseblemCardSplashATView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void D() {
        this.o1 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_ad_title", "id"));
        this.p1 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_desc", "id"));
        this.q1 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_cta_text", "id"));
        this.r1 = (RoundImageView) findViewById(h.a(getContext(), "myoffer_splash_icon", "id"));
        this.q0 = findViewById(h.a(getContext(), "myoffer_splash_ad_cta_layout", "id"));
        this.s1 = (SplashShakeTextHintView) findViewById(h.a(getContext(), "myoffer_splash_cta_shake", "id"));
        this.t1 = (ImageView) findViewById(h.a(getContext(), "myoffer_splash_ambience_bg", "id"));
        if (TextUtils.isEmpty(this.g0.w())) {
            com.smartdigimkt.j7.c.a(this.r1, 0, 0);
        } else {
            this.r1.setVisibility(0);
            this.r1.setNeedRadiu(true);
            this.r1.setRadiusInDip(12);
            int i2 = this.r1.getLayoutParams().width;
            com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, this.g0.w()), i2, i2, new b());
        }
        if (TextUtils.isEmpty(this.g0.g0())) {
            com.smartdigimkt.j7.c.a(this.o1, 0, 0);
        } else {
            this.o1.setText(this.g0.g0());
            this.o1.setVisibility(0);
        }
        if (this.p1 != null) {
            if (TextUtils.isEmpty(this.g0.r())) {
                this.p1.setVisibility(8);
            } else {
                this.p1.setText(this.g0.r());
            }
        }
        View view = this.q0;
        if (view != null) {
            this.n0.add(view);
        }
        if (p()) {
            TextView textView = this.q1;
            if (textView != null) {
                textView.setVisibility(8);
            }
            SplashShakeTextHintView splashShakeTextHintView = this.s1;
            if (splashShakeTextHintView != null) {
                if (this.l1 > this.m1) {
                    splashShakeTextHintView.setTextSize(17);
                }
                this.s1.setVisibility(0);
                this.s1.setShakeSetting(this.f0.t, this.g0.j());
                this.s1.setOnShakeListener(new c(), this.f0.t);
            }
        } else {
            if (this.q1 != null && this.l1 > this.m1) {
                if (TextUtils.isEmpty(this.g0.n())) {
                    this.q1.setText(i.a(getContext(), this.g0));
                } else {
                    this.q1.setText(this.g0.n());
                }
            }
            SplashShakeTextHintView splashShakeTextHintView2 = this.s1;
            if (splashShakeTextHintView2 != null) {
                splashShakeTextHintView2.setVisibility(8);
            }
        }
        if (this.t1 != null) {
            String strC = com.smartdigimkt.j5.a.a().c("sp_am_bg_and");
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC), new d());
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void F() {
        super.a(this.f0.t.i0() < 0 ? 100 : this.f0.t.i0(), new f());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void d() {
        View viewInflate = this.l1 > this.m1 ? LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_ad_layout_asseblem_card_horizontal", "layout"), this) : LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_ad_layout_asseblem_card_vertical", "layout"), this);
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
        com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, this.g0.s()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new e(frameLayout, wrapRoundImageView, roundImageView));
        if (this.f0.t.T() != 1) {
            this.n0.add(wrapRoundImageView);
        }
    }

    public AsseblemCardSplashATView(Context context, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, com.smartdigimkt.f5.a aVar2) {
        super(context, aVar, fVar, aVar2);
    }
}
