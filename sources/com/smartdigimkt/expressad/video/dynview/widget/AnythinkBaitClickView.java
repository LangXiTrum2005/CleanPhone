package com.smartdigimkt.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.v;

/* JADX INFO: loaded from: classes5.dex */
public class AnythinkBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;
    private static final String q0 = "MBridgeAnimationClickView";
    private AnyThinkImageView e0;
    private AnyThinkImageView f0;
    private TextView g0;
    private String h0;
    private String i0;
    private String j0;
    private int k0;
    private int l0;
    private Animation m0;
    private Animation n0;
    private Animation o0;
    private Animation p0;

    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (AnythinkBaitClickView.this.f0 != null) {
                AnythinkBaitClickView.this.f0.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (AnythinkBaitClickView.this.f0 != null) {
                AnythinkBaitClickView.this.f0.setVisibility(0);
            }
        }
    }

    public class d implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimationSet f34780a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AnythinkBaitClickView.this.f0 != null) {
                    AnythinkBaitClickView.this.f0.startAnimation(d.this.f34780a);
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AnythinkBaitClickView.this.e0 != null) {
                    AnythinkBaitClickView.this.e0.startAnimation(AnythinkBaitClickView.this.m0);
                }
            }
        }

        public d(AnimationSet animationSet) {
            this.f34780a = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AnythinkBaitClickView.this.postDelayed(new b(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AnythinkBaitClickView.this.postDelayed(new a(), 550L);
        }
    }

    public class e implements Animation.AnimationListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AnythinkBaitClickView.this.e0 != null) {
                    AnythinkBaitClickView.this.e0.startAnimation(AnythinkBaitClickView.this.m0);
                }
            }
        }

        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AnythinkBaitClickView.this.postDelayed(new a(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public AnythinkBaitClickView(Context context) {
        super(context);
        this.h0 = "";
        this.i0 = "";
        this.j0 = "Click now for details";
        this.k0 = 1;
        this.l0 = 1342177280;
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.m0 = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.m0.setRepeatCount(-1);
        this.m0.setRepeatMode(2);
        AnyThinkImageView anyThinkImageView = this.e0;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.m0);
        }
    }

    private void e() {
        AnyThinkImageView anyThinkImageView = this.f0;
        if (anyThinkImageView != null) {
            anyThinkImageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.m0 = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.m0.setRepeatCount(1);
        this.m0.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.n0 = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.n0.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.o0 = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.o0.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.n0);
        animationSet.addAnimation(this.o0);
        this.n0.setAnimationListener(new c());
        this.m0.setAnimationListener(new d(animationSet));
        AnyThinkImageView anyThinkImageView2 = this.e0;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.startAnimation(this.m0);
        }
    }

    private void getDefaultClickText() {
        try {
            this.j0 = getContext().getString(k.a(getContext(), "sdm_cm_click_for_detail", k.f38992h));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void init(int i2) {
        this.k0 = i2;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.m0;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.n0;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.o0;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.p0;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i2 = this.k0;
        if (i2 == 2) {
            this.f0.setVisibility(4);
            d();
            return;
        }
        if (i2 == 3) {
            e();
            return;
        }
        if (i2 == 4) {
            this.f0.setVisibility(4);
            a();
        } else if (i2 != 5) {
            b();
        } else {
            c();
        }
    }

    public class a implements com.smartdigimkt.f0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f34775a;

        public a(int i2) {
            this.f34775a = i2;
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            AnythinkBaitClickView.this.f0.setImageBitmap(bitmap);
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
            AnythinkBaitClickView.this.f0.setImageResource(this.f34775a);
        }
    }

    public class b implements com.smartdigimkt.f0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f34777a;

        public b(int i2) {
            this.f34777a = i2;
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            AnythinkBaitClickView.this.e0.setImageBitmap(bitmap);
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
            AnythinkBaitClickView.this.e0.setImageResource(this.f34777a);
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.m0 = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.m0.setRepeatCount(1);
        this.m0.setAnimationListener(new e());
        AnyThinkImageView anyThinkImageView = this.e0;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.m0);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.m0 = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.m0.setRepeatCount(-1);
        this.m0.setRepeatMode(2);
        AnyThinkImageView anyThinkImageView = this.e0;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.m0);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.n0 = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.n0.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.o0 = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.o0.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.n0);
        animationSet.addAnimation(this.o0);
        AnyThinkImageView anyThinkImageView2 = this.f0;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.p0 = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.p0.setRepeatMode(2);
        this.p0.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.n0 = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.n0.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.o0 = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.o0.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.n0);
        animationSet.addAnimation(this.o0);
        AnyThinkImageView anyThinkImageView = this.e0;
        if (anyThinkImageView != null) {
            anyThinkImageView.startAnimation(this.p0);
        }
        AnyThinkImageView anyThinkImageView2 = this.f0;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.startAnimation(animationSet);
        }
    }

    public void init(int i2, int i3) {
        this.l0 = i2;
        this.k0 = i3;
        init();
    }

    public void init(int i2, int i3, String str, String str2, String str3) {
        this.l0 = i2;
        this.k0 = i3;
        this.h0 = str;
        this.i0 = str2;
        this.j0 = str3;
        init();
    }

    public AnythinkBaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h0 = "";
        this.i0 = "";
        this.j0 = "Click now for details";
        this.k0 = 1;
        this.l0 = 1342177280;
    }

    public void init() {
        try {
            setBackgroundColor(this.l0);
            getDefaultClickText();
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iA = v.a(getContext(), 55.0f);
            int iA2 = v.a(getContext(), 33.0f);
            this.f0 = new AnyThinkImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.setMargins(iA2, iA2, 0, 0);
            this.f0.setLayoutParams(layoutParams);
            int iA3 = k.a(getContext(), "sdm_icon_click_circle", k.d);
            if (TextUtils.isEmpty(this.i0)) {
                this.f0.setImageResource(iA3);
            } else {
                com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(this.h0, new a(iA3));
            }
            int iA4 = v.a(getContext(), 108.0f);
            int iA5 = v.a(getContext(), 35.0f);
            int iA6 = v.a(getContext(), 43.0f);
            this.e0 = new AnyThinkImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA4, iA4);
            layoutParams2.setMargins(iA5, iA6, 0, 0);
            this.e0.setLayoutParams(layoutParams2);
            int iA7 = k.a(getContext(), "sdm_icon_click_hand", k.d);
            if (TextUtils.isEmpty(this.h0)) {
                this.e0.setImageResource(iA7);
            } else {
                com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(this.h0, new b(iA7));
            }
            relativeLayout.addView(this.f0);
            relativeLayout.addView(this.e0);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.g0 = new TextView(getContext());
            this.g0.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.g0.setText(this.j0);
            this.g0.setTextColor(-1);
            this.g0.setGravity(14);
            linearLayout.addView(this.g0);
            addView(linearLayout);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public AnythinkBaitClickView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h0 = "";
        this.i0 = "";
        this.j0 = "Click now for details";
        this.k0 = 1;
        this.l0 = 1342177280;
    }

    public AnythinkBaitClickView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.h0 = "";
        this.i0 = "";
        this.j0 = "Click now for details";
        this.k0 = 1;
        this.l0 = 1342177280;
    }
}
