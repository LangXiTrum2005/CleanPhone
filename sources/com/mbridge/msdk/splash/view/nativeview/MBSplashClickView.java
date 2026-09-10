package com.mbridge.msdk.splash.view.nativeview;

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
import com.mbridge.msdk.foundation.tools.v0;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBSplashClickView extends RelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f36073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f36074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f36075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f36076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f36077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f36078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f36079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f36080k;
    private String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView f36082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f36083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final RectF f36084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Paint f36085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Paint f36086r;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f36090a;

        public b(ScaleAnimation scaleAnimation) {
            this.f36090a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashClickView.this.f36083o.startAnimation(this.f36090a);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.f36070a = "浏览第三方应用";
        this.f36071b = "View";
        this.f36072c = "打开第三方应用";
        this.f36073d = "Open";
        this.f36074e = "下载第三方应用";
        this.f36075f = "Install";
        this.f36076g = "mbridge_splash_btn_arrow_right";
        this.f36077h = "mbridge_splash_btn_circle";
        this.f36078i = "mbridge_splash_btn_finger";
        this.f36079j = "mbridge_splash_btn_go";
        this.f36080k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f36084p = new RectF();
        this.f36085q = new Paint();
        this.f36086r = new Paint();
        a();
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new a(scaleAnimation2));
        this.f36083o.setVisibility(4);
        this.f36082n.startAnimation(scaleAnimation);
        this.f36083o.postDelayed(new b(scaleAnimation2), 500L);
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f36082n.startAnimation(scaleAnimation);
    }

    private void e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new c());
        this.f36082n.startAnimation(translateAnimation);
    }

    private void setBgDrawable(int i10) {
        int color = Color.parseColor("#666666");
        int color2 = Color.parseColor("#8FC31F");
        int color3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i10 == 2) {
            gradientDrawable.setColor(color2);
        } else {
            gradientDrawable.setColor(color3);
            gradientDrawable.setStroke(2, color);
        }
        gradientDrawable.setCornerRadius(200);
        setBackground(gradientDrawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f36084p, this.f36086r, 31);
        canvas.drawRoundRect(this.f36084p, 200.0f, 200.0f, this.f36086r);
        canvas.saveLayer(this.f36084p, this.f36085q, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        this.l = str;
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f36081m;
        if (i10 == 2) {
            d();
        } else if (i10 == 1) {
            e();
        } else if (i10 == 3) {
            c();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f36084p.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight());
    }

    private void a() {
        this.f36085q.setAntiAlias(true);
        this.f36085q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f36086r.setAntiAlias(true);
        this.f36086r.setColor(-1);
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams;
        int identifier;
        if (!a(this.l)) {
            boolean zContains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
            if (TextUtils.isEmpty(this.l)) {
                this.l = zContains ? "浏览第三方应用" : "View";
            }
            this.f36081m = 2;
        }
        setBgDrawable(this.f36081m);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.l);
        this.f36082n = new ImageView(getContext());
        int i10 = this.f36081m;
        if (i10 == 2) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_go", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 35.0f), v0.a(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v0.a(getContext(), 10.0f);
        } else if (i10 == 1) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_light", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v0.a(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("mbridge_splash_btn_arrow_right", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i10 == 3) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_finger", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 25.0f), v0.a(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams.topMargin = v0.a(getContext(), 18.0f);
            this.f36083o = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v0.a(getContext(), 30.0f), v0.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams4.topMargin = v0.a(getContext(), 5.0f);
            this.f36083o.setLayoutParams(layoutParams4);
            this.f36083o.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            addView(this.f36083o);
        } else {
            layoutParams = null;
            identifier = 0;
        }
        this.f36082n.setLayoutParams(layoutParams);
        this.f36082n.setImageResource(identifier);
        addView(textView);
        addView(this.f36082n);
        invalidate();
    }

    private boolean a(String str) {
        str.getClass();
        switch (str) {
            case "Install":
            case "下载第三方应用":
                this.f36081m = 3;
                return true;
            case "Open":
            case "打开第三方应用":
                this.f36081m = 1;
                return true;
            case "View":
            case "浏览第三方应用":
                this.f36081m = 2;
                return true;
            default:
                return false;
        }
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36070a = "浏览第三方应用";
        this.f36071b = "View";
        this.f36072c = "打开第三方应用";
        this.f36073d = "Open";
        this.f36074e = "下载第三方应用";
        this.f36075f = "Install";
        this.f36076g = "mbridge_splash_btn_arrow_right";
        this.f36077h = "mbridge_splash_btn_circle";
        this.f36078i = "mbridge_splash_btn_finger";
        this.f36079j = "mbridge_splash_btn_go";
        this.f36080k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f36084p = new RectF();
        this.f36085q = new Paint();
        this.f36086r = new Paint();
        a();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f36087a;

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0184a implements Runnable {
            public RunnableC0184a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f36083o.startAnimation(a.this.f36087a);
            }
        }

        public a(ScaleAnimation scaleAnimation) {
            this.f36087a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f36083o.setVisibility(4);
            MBSplashClickView.this.f36083o.postDelayed(new RunnableC0184a(), 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f36083o.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Animation.AnimationListener {

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Animation f36093a;

            public a(Animation animation) {
                this.f36093a = animation;
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f36082n.startAnimation(this.f36093a);
            }
        }

        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f36082n.setVisibility(4);
            MBSplashClickView.this.f36082n.postDelayed(new a(animation), 2000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f36082n.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36070a = "浏览第三方应用";
        this.f36071b = "View";
        this.f36072c = "打开第三方应用";
        this.f36073d = "Open";
        this.f36074e = "下载第三方应用";
        this.f36075f = "Install";
        this.f36076g = "mbridge_splash_btn_arrow_right";
        this.f36077h = "mbridge_splash_btn_circle";
        this.f36078i = "mbridge_splash_btn_finger";
        this.f36079j = "mbridge_splash_btn_go";
        this.f36080k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f36084p = new RectF();
        this.f36085q = new Paint();
        this.f36086r = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f36070a = "浏览第三方应用";
        this.f36071b = "View";
        this.f36072c = "打开第三方应用";
        this.f36073d = "Open";
        this.f36074e = "下载第三方应用";
        this.f36075f = "Install";
        this.f36076g = "mbridge_splash_btn_arrow_right";
        this.f36077h = "mbridge_splash_btn_circle";
        this.f36078i = "mbridge_splash_btn_finger";
        this.f36079j = "mbridge_splash_btn_go";
        this.f36080k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f36084p = new RectF();
        this.f36085q = new Paint();
        this.f36086r = new Paint();
    }
}
