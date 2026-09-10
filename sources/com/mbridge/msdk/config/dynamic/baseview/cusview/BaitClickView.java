package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.config.component.animation.h;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BaitClickView extends ComponentRelativeLayout implements h {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f32522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f32523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f32524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f32526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f32527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f32530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f32531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Animation f32532k;
    private Animation l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animation f32533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Animation f32534n;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32536b;

        public a(String str, int i10) {
            this.f32535a = str;
            this.f32536b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            if (BaitClickView.this.f32523b == null || !TextUtils.equals(this.f32535a, BaitClickView.this.f32526e)) {
                return;
            }
            BaitClickView.this.f32523b.setImageResource(this.f32536b);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (BaitClickView.this.f32523b == null || bitmap.isRecycled() || !TextUtils.equals(this.f32535a, BaitClickView.this.f32526e)) {
                return;
            }
            BaitClickView.this.f32523b.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32539b;

        public b(String str, int i10) {
            this.f32538a = str;
            this.f32539b = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            if (BaitClickView.this.f32522a == null || !TextUtils.equals(this.f32538a, BaitClickView.this.f32525d)) {
                return;
            }
            BaitClickView.this.f32522a.setImageResource(this.f32539b);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (BaitClickView.this.f32522a == null || bitmap.isRecycled() || !TextUtils.equals(this.f32538a, BaitClickView.this.f32525d)) {
                return;
            }
            BaitClickView.this.f32522a.setImageBitmap(bitmap);
        }
    }

    public BaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32525d = "";
        this.f32526e = "";
        this.f32527f = "Click now for details";
        this.f32528g = 1;
        this.f32529h = 1342177280;
        this.f32530i = 0;
        this.f32531j = false;
    }

    private void f() {
        if (this.f32530i == 0) {
            setBackgroundColor(this.f32529h);
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f32529h);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(v0.a(getContext(), this.f32530i));
        setBackground(gradientDrawable);
    }

    private void g() {
        if (this.f32523b == null) {
            return;
        }
        int iA = i0.a(getContext(), "mbridge_icon_click_circle", "drawable");
        if (TextUtils.isEmpty(this.f32526e)) {
            this.f32523b.setImageResource(iA);
        } else {
            String str = this.f32526e;
            f2.g().a(str, new a(str, iA));
        }
    }

    private void h() {
        if (this.f32524c == null) {
            return;
        }
        String strM = m();
        this.f32527f = strM;
        this.f32524c.setText(strM);
    }

    private void i() {
        f();
        h();
        g();
        j();
    }

    private void j() {
        if (this.f32522a == null) {
            return;
        }
        int iA = i0.a(getContext(), "mbridge_icon_click_hand", "drawable");
        if (TextUtils.isEmpty(this.f32525d)) {
            this.f32522a.setImageResource(iA);
        } else {
            String str = this.f32525d;
            f2.g().a(str, new b(str, iA));
        }
    }

    private void k() {
        if (!this.f32531j || this.f32522a == null || this.f32523b == null || this.f32524c == null) {
            init();
        }
    }

    private void l() {
        if (this.f32522a == null || this.f32523b == null || this.f32524c == null) {
            try {
                removeAllViews();
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                int iA = v0.a(getContext(), 55.0f);
                int iA2 = v0.a(getContext(), 33.0f);
                this.f32523b = new ImageView(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
                layoutParams.setMargins(iA2, iA2, 0, 0);
                this.f32523b.setLayoutParams(layoutParams);
                int iA3 = v0.a(getContext(), 108.0f);
                int iA4 = v0.a(getContext(), 35.0f);
                int iA5 = v0.a(getContext(), 43.0f);
                this.f32522a = new ImageView(getContext());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA3, iA3);
                layoutParams2.setMargins(iA4, iA5, 0, 0);
                this.f32522a.setLayoutParams(layoutParams2);
                relativeLayout.addView(this.f32523b);
                relativeLayout.addView(this.f32522a);
                LinearLayout linearLayout = new LinearLayout(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(13);
                linearLayout.setLayoutParams(layoutParams3);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                linearLayout.addView(relativeLayout);
                this.f32524c = new TextView(getContext());
                this.f32524c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                this.f32524c.setText(this.f32527f);
                this.f32524c.setTextColor(-1);
                this.f32524c.setGravity(14);
                linearLayout.addView(this.f32524c);
                addView(linearLayout);
            } catch (Throwable th2) {
                q0.b("BaitClickView", th2.getMessage());
            }
        }
    }

    private String m() {
        if (!TextUtils.isEmpty(this.f32527f)) {
            return this.f32527f;
        }
        try {
            return getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th2) {
            q0.b("BaitClickView", th2.getMessage());
            return "Click now for details";
        }
    }

    public void init(int i10) {
        this.f32528g = i10;
        init();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f32532k;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.l;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f32533m;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f32534n;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.mbridge.msdk.config.component.animation.h
    public View resolveAnimationTarget(String str) {
        k();
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.trim().toLowerCase(Locale.US);
            lowerCase.getClass();
            switch (lowerCase) {
                case "baithand":
                case "finger":
                case "hand":
                    ImageView imageView = this.f32522a;
                    if (imageView != null) {
                        return imageView;
                    }
                    break;
                case "baittext":
                case "text":
                case "label":
                    TextView textView = this.f32524c;
                    if (textView != null) {
                        return textView;
                    }
                    break;
                case "circle":
                case "ripple":
                case "baitripple":
                    ImageView imageView2 = this.f32523b;
                    if (imageView2 != null) {
                        return imageView2;
                    }
                    break;
                case "container":
                case "self":
                    break;
                default:
                    View viewFindViewWithTag = findViewWithTag(str);
                    if (viewFindViewWithTag != null) {
                        return viewFindViewWithTag;
                    }
                    break;
            }
        }
        return this;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals(com.ironsource.mediationsdk.metadata.a.f29610g)) {
                setViewClickListener();
            }
            Object obj = map.get("radius");
            if (obj instanceof String) {
                this.f32530i = Integer.parseInt(obj.toString());
            }
            init();
        } catch (Exception e10) {
            q0.b("BaitClickView", e10.getMessage());
        }
    }

    public void startAnimation() {
        k();
        int i10 = this.f32528g;
        if (i10 == 2) {
            this.f32523b.setVisibility(4);
            d();
            return;
        }
        if (i10 == 3) {
            e();
            return;
        }
        if (i10 == 4) {
            this.f32523b.setVisibility(4);
            a();
        } else if (i10 != 5) {
            b();
        } else {
            c();
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f32532k = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f32532k.setRepeatCount(1);
        this.f32532k.setAnimationListener(new e());
        ImageView imageView = this.f32522a;
        if (imageView != null) {
            imageView.startAnimation(this.f32532k);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f32532k = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f32532k.setRepeatCount(-1);
        this.f32532k.setRepeatMode(2);
        ImageView imageView = this.f32522a;
        if (imageView != null) {
            imageView.startAnimation(this.f32532k);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f, 1, 0.5f, 1, 0.5f);
        this.l = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.l.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f32533m = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f32533m.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.l);
        animationSet.addAnimation(this.f32533m);
        ImageView imageView2 = this.f32523b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f32534n = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f32534n.setRepeatMode(2);
        this.f32534n.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f, 1, 0.5f, 1, 0.5f);
        this.l = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.l.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f32533m = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f32533m.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.l);
        animationSet.addAnimation(this.f32533m);
        ImageView imageView = this.f32522a;
        if (imageView != null) {
            imageView.startAnimation(this.f32534n);
        }
        ImageView imageView2 = this.f32523b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f32532k = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f32532k.setRepeatCount(-1);
        this.f32532k.setRepeatMode(2);
        ImageView imageView = this.f32522a;
        if (imageView != null) {
            imageView.startAnimation(this.f32532k);
        }
    }

    private void e() {
        ImageView imageView = this.f32523b;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f32532k = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f32532k.setRepeatCount(1);
        this.f32532k.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.5f, 1, 0.5f, 1, 0.5f);
        this.l = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.l.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f32533m = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f32533m.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.l);
        animationSet.addAnimation(this.f32533m);
        this.l.setAnimationListener(new c());
        this.f32532k.setAnimationListener(new d(animationSet));
        ImageView imageView2 = this.f32522a;
        if (imageView2 != null) {
            imageView2.startAnimation(this.f32532k);
        }
    }

    public void init(int i10, int i11) {
        this.f32529h = i10;
        this.f32528g = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f32529h = i10;
        this.f32528g = i11;
        this.f32525d = str;
        this.f32526e = str2;
        this.f32527f = str3;
        init();
    }

    public void init() {
        try {
            l();
            i();
            this.f32531j = true;
        } catch (Throwable th2) {
            q0.b("BaitClickView", th2.getMessage());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (BaitClickView.this.f32523b != null) {
                BaitClickView.this.f32523b.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (BaitClickView.this.f32523b != null) {
                BaitClickView.this.f32523b.setVisibility(0);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimationSet f32542a;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f32523b != null) {
                    BaitClickView.this.f32523b.startAnimation(d.this.f32542a);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f32522a != null) {
                    BaitClickView.this.f32522a.startAnimation(BaitClickView.this.f32532k);
                }
            }
        }

        public d(AnimationSet animationSet) {
            this.f32542a = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new b(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 550L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Animation.AnimationListener {

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f32522a != null) {
                    BaitClickView.this.f32522a.startAnimation(BaitClickView.this.f32532k);
                }
            }
        }

        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
