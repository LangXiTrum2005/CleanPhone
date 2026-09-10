package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.a6.d;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.api.SDMSDK;
import com.smartdigimkt.sdk.basead.ui.component.CTAButtonLayout;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class SinglePictureSplashATView extends BaseSdkSplashATView {

    public class a implements com.smartdigimkt.y5.a {
        public a() {
        }

        @Override // com.smartdigimkt.y5.a
        public void a(int i2, int i3) {
            SinglePictureSplashATView.this.a(i2, i3);
        }
    }

    public class b implements com.smartdigimkt.d7.b.f {

        public class a implements Runnable {
            final /* synthetic */ WrapRoundImageView X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ Bitmap f38425Y;

            public a(WrapRoundImageView wrapRoundImageView, Bitmap bitmap) {
                this.X = wrapRoundImageView;
                this.f38425Y = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.setBitmapAndResize(this.f38425Y, SinglePictureSplashATView.this.getWidth(), SinglePictureSplashATView.this.getHeight());
            }
        }

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.ui.SinglePictureSplashATView$b$b, reason: collision with other inner class name */
        public class C0602b implements com.smartdigimkt.o8.b.InterfaceC0563b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RoundImageView f38426a;

            public C0602b(RoundImageView roundImageView) {
                this.f38426a = roundImageView;
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a(Bitmap bitmap) {
                this.f38426a.setVisibility(0);
                this.f38426a.setImageBitmap(bitmap);
            }
        }

        public b() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, SinglePictureSplashATView.this.g0.s())) {
                SinglePictureSplashATView singlePictureSplashATView = SinglePictureSplashATView.this;
                WrapRoundImageView wrapRoundImageView = (WrapRoundImageView) singlePictureSplashATView.findViewById(h.a(singlePictureSplashATView.getContext(), "myoffer_splash_ad_content_image_area", "id"));
                SinglePictureSplashATView singlePictureSplashATView2 = SinglePictureSplashATView.this;
                RoundImageView roundImageView = (RoundImageView) singlePictureSplashATView2.findViewById(h.a(singlePictureSplashATView2.getContext(), "myoffer_splash_bg", "id"));
                wrapRoundImageView.setVisibility(0);
                if (SinglePictureSplashATView.this.f0.t.C1() == 2) {
                    wrapRoundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    wrapRoundImageView.setImageBitmap(bitmap);
                } else {
                    wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    wrapRoundImageView.post(new a(wrapRoundImageView, bitmap));
                }
                if (roundImageView != null) {
                    com.smartdigimkt.o8.b.a(SinglePictureSplashATView.this.getContext(), bitmap, new C0602b(roundImageView));
                }
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SinglePictureSplashATView singlePictureSplashATView = SinglePictureSplashATView.this;
            if (singlePictureSplashATView.I0 == null) {
                return;
            }
            int width = singlePictureSplashATView.getWidth();
            int height = SinglePictureSplashATView.this.getHeight();
            int i2 = (int) (((double) SinglePictureSplashATView.this.getResources().getDisplayMetrics().widthPixels) * 0.5d);
            int i3 = (int) (((double) SinglePictureSplashATView.this.getResources().getDisplayMetrics().heightPixels) * 0.5d);
            if (width < i2) {
                SinglePictureSplashATView.this.a(i.a("40002", "Splash display width is less than 50% of screen width!"));
                Log.e("sdm", "Splash display width is less than 50% of screen width!");
            } else if (height >= i3) {
                SinglePictureSplashATView.super.m();
            } else {
                SinglePictureSplashATView.this.a(i.a("40002", "Splash display height is less than 50% of screen height!"));
                Log.e("sdm", "Splash display height is less than 50% of screen height!");
            }
        }
    }

    public SinglePictureSplashATView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void D() {
        View view;
        this.q0 = findViewById(h.a(getContext(), "myoffer_splash_ad_cta_layout", "id"));
        if (this.g0.O() == 4) {
            try {
                View directlySplashCTAButton = SDMSDK.getInstance().getDirectlyOfferSetting().getDirectlySplashCTAButton();
                if (directlySplashCTAButton != null) {
                    try {
                        int iIndexOfChild = indexOfChild(this.q0);
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.q0.getLayoutParams();
                        this.q0.setVisibility(8);
                        this.q0 = directlySplashCTAButton;
                        if (directlySplashCTAButton.getLayoutParams() != null && (directlySplashCTAButton.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                            layoutParams = (RelativeLayout.LayoutParams) directlySplashCTAButton.getLayoutParams();
                        }
                        com.smartdigimkt.j7.c.a(directlySplashCTAButton);
                        addView(directlySplashCTAButton, iIndexOfChild, layoutParams);
                        if (com.smartdigimkt.m6.b.p().D()) {
                            Log.d(this.e0, "DIRECTLY Splash View replace cta success");
                        }
                    } catch (Throwable unused) {
                        Log.w(this.e0, "DIRECTLY Splash View replace cta fail");
                        this.q0 = findViewById(h.a(getContext(), "myoffer_splash_ad_cta_layout", "id"));
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        com.smartdigimkt.v6.a aVar = this.f0;
        if (aVar.t == null || (view = this.q0) == null) {
            return;
        }
        if (view instanceof CTAButtonLayout) {
            ((CTAButtonLayout) view).initSetting(this.g0, aVar, false, null);
        } else if (view instanceof TextView) {
            if (TextUtils.isEmpty(this.g0.n())) {
                ((TextView) this.q0).setText(com.smartdigimkt.m3.i.a(getContext(), this.g0));
            } else {
                ((TextView) this.q0).setText(this.g0.n());
            }
        }
        if (this.f0.t.T() == 0 || p()) {
            this.q0.setVisibility(8);
        } else {
            this.n0.add(this.q0);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void F() {
        super.a(this.f0.t.i0() < 0 ? 100 : this.f0.t.i0(), new c());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void d() {
        View viewInflate = this.f0.t.D1() == 2 ? LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_ad_layout_single_land", "layout"), this) : LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_ad_layout_single_port", "layout"), this);
        B();
        d dVar = this.R0;
        if (dVar != null) {
            dVar.a(d.o).a(new a()).a(getContext(), viewInflate);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void z() {
        super.z();
        com.smartdigimkt.d7.b.a(getContext()).a(new e(1, this.g0.s()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new b());
    }

    public SinglePictureSplashATView(Context context, com.smartdigimkt.v6.a aVar, f fVar, com.smartdigimkt.f5.a aVar2) {
        super(context, aVar, fVar, aVar2);
    }
}
