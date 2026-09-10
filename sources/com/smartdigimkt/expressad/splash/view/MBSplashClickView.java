package com.smartdigimkt.expressad.splash.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;

/* JADX INFO: loaded from: classes5.dex */
public class MBSplashClickView extends RelativeLayout {
    private static final String t0 = "MBSplashClickView";
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;
    private String e0;
    private String f0;
    private String g0;
    private final String h0;
    private final String i0;
    private final String j0;
    private final String k0;
    private final String l0;
    private String m0;
    private int n0;
    private ImageView o0;
    private ImageView p0;
    private final RectF q0;
    private final Paint r0;
    private final Paint s0;

    public class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f34744a;

        /* JADX INFO: renamed from: com.smartdigimkt.expressad.splash.view.MBSplashClickView$a$a, reason: collision with other inner class name */
        public class RunnableC0474a implements Runnable {
            public RunnableC0474a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.p0.startAnimation(a.this.f34744a);
            }
        }

        public a(ScaleAnimation scaleAnimation) {
            this.f34744a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.p0.setVisibility(4);
            MBSplashClickView.this.p0.postDelayed(new RunnableC0474a(), 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.p0.setVisibility(0);
        }
    }

    public class b implements Runnable {
        final /* synthetic */ ScaleAnimation X;

        public b(ScaleAnimation scaleAnimation) {
            this.X = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashClickView.this.p0.startAnimation(this.X);
        }
    }

    public class c implements Animation.AnimationListener {

        public class a implements Runnable {
            final /* synthetic */ Animation X;

            public a(Animation animation) {
                this.X = animation;
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.o0.startAnimation(this.X);
            }
        }

        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.o0.setVisibility(4);
            MBSplashClickView.this.o0.postDelayed(new a(animation), 2000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.o0.setVisibility(0);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.e0 = "";
        this.f0 = "";
        this.g0 = "";
        this.h0 = "sdm_splash_btn_arrow_right";
        this.i0 = "sdm_splash_btn_circle";
        this.j0 = "sdm_splash_btn_finger";
        this.k0 = "sdm_splash_btn_go";
        this.l0 = "sdm_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.q0 = new RectF();
        this.r0 = new Paint();
        this.s0 = new Paint();
        a();
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new a(scaleAnimation2));
        this.p0.setVisibility(4);
        this.o0.startAnimation(scaleAnimation);
        this.p0.postDelayed(new b(scaleAnimation2), 500L);
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.o0.startAnimation(scaleAnimation);
    }

    private void e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new c());
        this.o0.startAnimation(translateAnimation);
    }

    private void setBgDrawable(int i2) {
        int color = Color.parseColor("#666666");
        int color2 = Color.parseColor("#8FC31F");
        int color3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i2 == 2) {
            gradientDrawable.setColor(color2);
        } else {
            gradientDrawable.setColor(color3);
            gradientDrawable.setStroke(2, color);
        }
        gradientDrawable.setCornerRadius(200);
        setBackgroundDrawable(gradientDrawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.q0, this.s0, 31);
        canvas.drawRoundRect(this.q0, 200.0f, 200.0f, this.s0);
        canvas.saveLayer(this.q0, this.r0, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        this.m0 = str;
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i2 = this.n0;
        if (i2 == 2) {
            d();
        } else if (i2 == 1) {
            e();
        } else if (i2 == 3) {
            c();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.q0.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.r0.setAntiAlias(true);
        this.r0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.s0.setAntiAlias(true);
        this.s0.setColor(-1);
        this.e0 = getContext().getString(k.a(getContext(), "sdm_cm_shake_view_click_default_view", k.f38992h));
        this.f0 = getContext().getString(k.a(getContext(), "sdm_cm_shake_view_click_default_open", k.f38992h));
        this.g0 = getContext().getString(k.a(getContext(), "sdm_cm_shake_view_click_default_inst", k.f38992h));
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams;
        int iA;
        if (!a(this.m0)) {
            if (TextUtils.isEmpty(this.m0)) {
                this.m0 = this.e0;
            }
            this.n0 = 2;
        }
        setBgDrawable(this.n0);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.m0);
        this.o0 = new ImageView(getContext());
        int i2 = this.n0;
        if (i2 == 2) {
            iA = k.a(getContext(), "sdm_splash_btn_go", k.d);
            layoutParams = new RelativeLayout.LayoutParams(v.a(getContext(), 35.0f), v.a(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v.a(getContext(), 10.0f);
        } else if (i2 == 1) {
            iA = k.a(getContext(), "sdm_splash_btn_light", k.d);
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v.a(getContext(), 50.0f);
            imageView.setImageResource(k.a(getContext(), "sdm_splash_btn_arrow_right", k.d));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i2 == 3) {
            iA = k.a(getContext(), "sdm_splash_btn_finger", k.d);
            layoutParams = new RelativeLayout.LayoutParams(v.a(getContext(), 25.0f), v.a(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v.a(getContext(), 50.0f);
            layoutParams.topMargin = v.a(getContext(), 18.0f);
            this.p0 = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v.a(getContext(), 30.0f), v.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v.a(getContext(), 50.0f);
            layoutParams4.topMargin = v.a(getContext(), 5.0f);
            this.p0.setLayoutParams(layoutParams4);
            this.p0.setImageResource(k.a(getContext(), "sdm_splash_btn_circle", k.d));
            addView(this.p0);
        } else {
            layoutParams = null;
            iA = 0;
        }
        this.o0.setLayoutParams(layoutParams);
        this.o0.setImageResource(iA);
        addView(textView);
        addView(this.o0);
        invalidate();
    }

    private boolean a(String str) {
        if (TextUtils.equals(str, this.e0)) {
            this.n0 = 2;
            return true;
        }
        if (TextUtils.equals(str, this.g0)) {
            this.n0 = 3;
            return true;
        }
        if (!TextUtils.equals(str, this.f0)) {
            return false;
        }
        this.n0 = 1;
        return true;
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = "";
        this.f0 = "";
        this.g0 = "";
        this.h0 = "sdm_splash_btn_arrow_right";
        this.i0 = "sdm_splash_btn_circle";
        this.j0 = "sdm_splash_btn_finger";
        this.k0 = "sdm_splash_btn_go";
        this.l0 = "sdm_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.q0 = new RectF();
        this.r0 = new Paint();
        this.s0 = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = "";
        this.f0 = "";
        this.g0 = "";
        this.h0 = "sdm_splash_btn_arrow_right";
        this.i0 = "sdm_splash_btn_circle";
        this.j0 = "sdm_splash_btn_finger";
        this.k0 = "sdm_splash_btn_go";
        this.l0 = "sdm_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.q0 = new RectF();
        this.r0 = new Paint();
        this.s0 = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.e0 = "";
        this.f0 = "";
        this.g0 = "";
        this.h0 = "sdm_splash_btn_arrow_right";
        this.i0 = "sdm_splash_btn_circle";
        this.j0 = "sdm_splash_btn_finger";
        this.k0 = "sdm_splash_btn_go";
        this.l0 = "sdm_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.q0 = new RectF();
        this.r0 = new Paint();
        this.s0 = new Paint();
    }
}
