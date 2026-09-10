package com.smartdigimkt.sdk.basead.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.w6.f;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SinglePictureBottomSlideSplashATView extends BaseNewStyleSDKSplashATView {
    View o1;
    ImageView p1;
    SplashBottomShakeTextHintView q1;
    TextView r1;
    TextView s1;
    final long t1;
    private List<Integer> u1;
    ObjectAnimator v1;
    ValueAnimator w1;

    public class a implements com.smartdigimkt.y5.a {
        public a() {
        }

        @Override // com.smartdigimkt.y5.a
        public void a(int i2, int i3) {
            SinglePictureBottomSlideSplashATView.this.a(i2, i3);
        }
    }

    public class b implements BaseShakeView.o {
        public b() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView.o
        public boolean a() {
            if (!SinglePictureBottomSlideSplashATView.this.q()) {
                return false;
            }
            SinglePictureBottomSlideSplashATView.this.a(4, 5);
            return true;
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            SinglePictureBottomSlideSplashATView singlePictureBottomSlideSplashATView = SinglePictureBottomSlideSplashATView.this;
            if (singlePictureBottomSlideSplashATView.p1 == null || iIntValue >= singlePictureBottomSlideSplashATView.u1.size()) {
                return;
            }
            SinglePictureBottomSlideSplashATView singlePictureBottomSlideSplashATView2 = SinglePictureBottomSlideSplashATView.this;
            singlePictureBottomSlideSplashATView2.p1.setImageResource(((Integer) singlePictureBottomSlideSplashATView2.u1.get(iIntValue)).intValue());
        }
    }

    public class d implements com.smartdigimkt.d7.b.f {

        public class a implements Runnable {
            final /* synthetic */ WrapRoundImageView X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ Bitmap f38420Y;

            public a(WrapRoundImageView wrapRoundImageView, Bitmap bitmap) {
                this.X = wrapRoundImageView;
                this.f38420Y = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.setBitmapAndResize(this.f38420Y, SinglePictureBottomSlideSplashATView.this.getWidth(), SinglePictureBottomSlideSplashATView.this.getHeight());
            }
        }

        public class b implements com.smartdigimkt.o8.b.InterfaceC0563b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RoundImageView f38421a;

            public b(RoundImageView roundImageView) {
                this.f38421a = roundImageView;
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a(Bitmap bitmap) {
                this.f38421a.setVisibility(0);
                this.f38421a.setImageBitmap(bitmap);
            }
        }

        public d() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, SinglePictureBottomSlideSplashATView.this.g0.s())) {
                SinglePictureBottomSlideSplashATView singlePictureBottomSlideSplashATView = SinglePictureBottomSlideSplashATView.this;
                WrapRoundImageView wrapRoundImageView = (WrapRoundImageView) singlePictureBottomSlideSplashATView.findViewById(h.a(singlePictureBottomSlideSplashATView.getContext(), "myoffer_splash_ad_content_image_area", "id"));
                SinglePictureBottomSlideSplashATView singlePictureBottomSlideSplashATView2 = SinglePictureBottomSlideSplashATView.this;
                RoundImageView roundImageView = (RoundImageView) singlePictureBottomSlideSplashATView2.findViewById(h.a(singlePictureBottomSlideSplashATView2.getContext(), "myoffer_splash_bg", "id"));
                wrapRoundImageView.setVisibility(0);
                if (SinglePictureBottomSlideSplashATView.this.f0.t.C1() == 2) {
                    wrapRoundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    wrapRoundImageView.setImageBitmap(bitmap);
                } else {
                    wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    wrapRoundImageView.post(new a(wrapRoundImageView, bitmap));
                }
                if (roundImageView != null) {
                    com.smartdigimkt.o8.b.a(SinglePictureBottomSlideSplashATView.this.getContext(), bitmap, new b(roundImageView));
                }
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SinglePictureBottomSlideSplashATView singlePictureBottomSlideSplashATView = SinglePictureBottomSlideSplashATView.this;
            if (singlePictureBottomSlideSplashATView.I0 == null) {
                return;
            }
            int width = singlePictureBottomSlideSplashATView.getWidth();
            int height = SinglePictureBottomSlideSplashATView.this.getHeight();
            int i2 = (int) (((double) SinglePictureBottomSlideSplashATView.this.getResources().getDisplayMetrics().widthPixels) * 0.5d);
            int i3 = (int) (((double) SinglePictureBottomSlideSplashATView.this.getResources().getDisplayMetrics().heightPixels) * 0.5d);
            if (width < i2) {
                SinglePictureBottomSlideSplashATView.this.a(i.a("40002", "Splash display width is less than 50% of screen width!"));
                Log.e("sdm", "Splash display width is less than 50% of screen width!");
            } else if (height >= i3) {
                SinglePictureBottomSlideSplashATView.this.m();
            } else {
                SinglePictureBottomSlideSplashATView.this.a(i.a("40002", "Splash display height is less than 50% of screen height!"));
                Log.e("sdm", "Splash display height is less than 50% of screen height!");
            }
        }
    }

    public SinglePictureBottomSlideSplashATView(Context context) {
        super(context);
        this.t1 = 500L;
    }

    private void H() {
        View view = this.o1;
        if (view != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.1f);
            this.v1 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.v1.setRepeatCount(-1);
            this.v1.setRepeatMode(2);
        }
        if (this.p1 != null) {
            ArrayList arrayList = new ArrayList();
            this.u1 = arrayList;
            arrayList.add(Integer.valueOf(h.a(getContext(), "myoffer_slide_up_arrow_1", k.d)));
            this.u1.add(Integer.valueOf(h.a(getContext(), "myoffer_slide_up_arrow_2", k.d)));
            this.u1.add(Integer.valueOf(h.a(getContext(), "myoffer_slide_up_arrow_3", k.d)));
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.u1.size());
            this.w1 = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(700L);
            this.w1.setRepeatCount(-1);
            this.w1.addUpdateListener(new c());
        }
    }

    private void I() {
        try {
            ObjectAnimator objectAnimator = this.v1;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ValueAnimator valueAnimator = this.w1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    private void J() {
        try {
            ObjectAnimator objectAnimator = this.v1;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.v1.cancel();
            }
            ValueAnimator valueAnimator = this.w1;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.w1.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    private void K() {
        try {
            ObjectAnimator objectAnimator = this.v1;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
            ValueAnimator valueAnimator = this.w1;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void D() {
        View viewFindViewById = findViewById(h.a(getContext(), "myoffer_splash_ad_bottom_container", "id"));
        this.q0 = viewFindViewById;
        this.n0.add(viewFindViewById);
        this.o1 = findViewById(h.a(getContext(), "myoffer_splash_ad_bottom_bg", "id"));
        this.p1 = (ImageView) findViewById(h.a(getContext(), "myoffer_splash_ad_bottom_slide_icon", "id"));
        this.q1 = (SplashBottomShakeTextHintView) findViewById(h.a(getContext(), "myoffer_splash_cta_shake", "id"));
        this.r1 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_ad_bottom_slide_hint", "id"));
        this.s1 = (TextView) findViewById(h.a(getContext(), "myoffer_splash_ad_bottom_slide_title", "id"));
        if (!p()) {
            H();
            return;
        }
        if (this.q1 != null) {
            this.p1.setVisibility(8);
            this.r1.setVisibility(8);
            this.s1.setText(com.smartdigimkt.m3.i.a(getContext(), this.g0.j()));
            this.q1.setVisibility(0);
            this.q1.setShakeSetting(this.f0.t, this.g0.j());
            this.q1.setOnShakeListener(new b(), this.f0.t);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void F() {
        a(this.f0.t.i0() < 0 ? 100 : this.f0.t.i0(), new e());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void d() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_ad_layout_single_bottom_slide", "layout"), this);
        B();
        com.smartdigimkt.a6.d dVar = this.R0;
        if (dVar != null) {
            dVar.a(com.smartdigimkt.a6.d.o).a(new a()).a(getContext(), viewInflate);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void z() {
        super.z();
        com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, this.g0.s()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new d());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView, com.smartdigimkt.sdk.basead.ui.BaseSplashATView, com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(int i2) {
        super.a(i2);
        if (i2 != 110) {
            if (i2 == 111) {
                I();
                return;
            } else if (i2 != 114) {
                if (i2 != 115) {
                    return;
                }
                J();
                return;
            }
        }
        K();
    }

    public SinglePictureBottomSlideSplashATView(Context context, com.smartdigimkt.v6.a aVar, f fVar, com.smartdigimkt.f5.a aVar2) {
        super(context, aVar, fVar, aVar2);
        this.t1 = 500L;
    }
}
