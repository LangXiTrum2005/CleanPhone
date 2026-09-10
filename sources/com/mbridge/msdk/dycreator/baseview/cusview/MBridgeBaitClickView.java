package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.config.component.animation.h;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBridgeBaitClickView extends RelativeLayout implements h {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBridgeDyImageView f32974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBridgeDyImageView f32975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f32976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f32978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f32979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f32982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Animation f32983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Animation f32984k;
    private Animation l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animation f32985m;

    public MBridgeBaitClickView(@NonNull Context context) {
        super(context);
        this.f32977d = "";
        this.f32978e = "";
        this.f32979f = "Click now for details";
        this.f32980g = 1;
        this.f32981h = 1342177280;
        this.f32982i = false;
    }

    private void f() {
        if (this.f32975b == null) {
            return;
        }
        final int iA = i0.a(getContext(), "mbridge_icon_click_circle", "drawable");
        if (TextUtils.isEmpty(this.f32978e)) {
            this.f32975b.setImageResource(iA);
        } else {
            final String str = this.f32978e;
            f2.g().a(str, new c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onFailedLoad(String str2, String str3) {
                    if (MBridgeBaitClickView.this.f32975b == null || !TextUtils.equals(str, MBridgeBaitClickView.this.f32978e)) {
                        return;
                    }
                    MBridgeBaitClickView.this.f32975b.setImageResource(iA);
                }

                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onSuccessLoad(Bitmap bitmap, String str2) {
                    if (MBridgeBaitClickView.this.f32975b == null || bitmap.isRecycled() || !TextUtils.equals(str, MBridgeBaitClickView.this.f32978e)) {
                        return;
                    }
                    MBridgeBaitClickView.this.f32975b.setImageBitmap(bitmap);
                }
            });
        }
    }

    private void g() {
        if (this.f32976c == null) {
            return;
        }
        String strL = l();
        this.f32979f = strL;
        this.f32976c.setText(strL);
    }

    private void h() {
        setBackgroundColor(this.f32981h);
        g();
        f();
        i();
    }

    private void i() {
        if (this.f32974a == null) {
            return;
        }
        final int iA = i0.a(getContext(), "mbridge_icon_click_hand", "drawable");
        if (TextUtils.isEmpty(this.f32977d)) {
            this.f32974a.setImageResource(iA);
        } else {
            final String str = this.f32977d;
            f2.g().a(str, new c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onFailedLoad(String str2, String str3) {
                    if (MBridgeBaitClickView.this.f32974a == null || !TextUtils.equals(str, MBridgeBaitClickView.this.f32977d)) {
                        return;
                    }
                    MBridgeBaitClickView.this.f32974a.setImageResource(iA);
                }

                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onSuccessLoad(Bitmap bitmap, String str2) {
                    if (MBridgeBaitClickView.this.f32974a == null || bitmap.isRecycled() || !TextUtils.equals(str, MBridgeBaitClickView.this.f32977d)) {
                        return;
                    }
                    MBridgeBaitClickView.this.f32974a.setImageBitmap(bitmap);
                }
            });
        }
    }

    private void j() {
        if (!this.f32982i || this.f32974a == null || this.f32975b == null || this.f32976c == null) {
            init();
        }
    }

    private void k() {
        if (this.f32974a == null || this.f32975b == null || this.f32976c == null) {
            try {
                removeAllViews();
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                int iA = v0.a(getContext(), 55.0f);
                int iA2 = v0.a(getContext(), 33.0f);
                this.f32975b = new MBridgeDyImageView(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
                layoutParams.setMargins(iA2, iA2, 0, 0);
                this.f32975b.setLayoutParams(layoutParams);
                int iA3 = v0.a(getContext(), 108.0f);
                int iA4 = v0.a(getContext(), 35.0f);
                int iA5 = v0.a(getContext(), 43.0f);
                this.f32974a = new MBridgeDyImageView(getContext());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA3, iA3);
                layoutParams2.setMargins(iA4, iA5, 0, 0);
                this.f32974a.setLayoutParams(layoutParams2);
                relativeLayout.addView(this.f32975b);
                relativeLayout.addView(this.f32974a);
                LinearLayout linearLayout = new LinearLayout(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(13);
                linearLayout.setLayoutParams(layoutParams3);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                linearLayout.addView(relativeLayout);
                this.f32976c = new TextView(getContext());
                this.f32976c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                this.f32976c.setText(this.f32979f);
                this.f32976c.setTextColor(-1);
                this.f32976c.setGravity(14);
                linearLayout.addView(this.f32976c);
                addView(linearLayout);
            } catch (Throwable th2) {
                q0.b("MBridgeAnimationClickView", th2.getMessage());
            }
        }
    }

    private String l() {
        if (!TextUtils.isEmpty(this.f32979f)) {
            return this.f32979f;
        }
        try {
            return getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th2) {
            q0.b("MBridgeAnimationClickView", th2.getMessage());
            return "Click now for details";
        }
    }

    public void init(int i10) {
        this.f32980g = i10;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f32983j;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f32984k;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.l;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f32985m;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.mbridge.msdk.config.component.animation.h
    public View resolveAnimationTarget(String str) {
        j();
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.trim().toLowerCase(Locale.US);
            lowerCase.getClass();
            switch (lowerCase) {
                case "baithand":
                case "finger":
                case "hand":
                    MBridgeDyImageView mBridgeDyImageView = this.f32974a;
                    if (mBridgeDyImageView != null) {
                        return mBridgeDyImageView;
                    }
                    break;
                case "baittext":
                case "text":
                case "label":
                    TextView textView = this.f32976c;
                    if (textView != null) {
                        return textView;
                    }
                    break;
                case "circle":
                case "ripple":
                case "baitripple":
                    MBridgeDyImageView mBridgeDyImageView2 = this.f32975b;
                    if (mBridgeDyImageView2 != null) {
                        return mBridgeDyImageView2;
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

    public void startAnimation() {
        j();
        int i10 = this.f32980g;
        if (i10 == 2) {
            this.f32975b.setVisibility(4);
            d();
            return;
        }
        if (i10 == 3) {
            e();
            return;
        }
        if (i10 == 4) {
            this.f32975b.setVisibility(4);
            a();
        } else if (i10 != 5) {
            b();
        } else {
            c();
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f32983j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f32983j.setRepeatCount(1);
        this.f32983j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f32974a != null) {
                            MBridgeBaitClickView.this.f32974a.startAnimation(MBridgeBaitClickView.this.f32983j);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        MBridgeDyImageView mBridgeDyImageView = this.f32974a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f32983j);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f32983j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f32983j.setRepeatCount(-1);
        this.f32983j.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f32974a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f32983j);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f32984k = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f32984k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.l = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f32984k);
        animationSet.addAnimation(this.l);
        MBridgeDyImageView mBridgeDyImageView2 = this.f32975b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f32985m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f32985m.setRepeatMode(2);
        this.f32985m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f32984k = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f32984k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.l = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f32984k);
        animationSet.addAnimation(this.l);
        MBridgeDyImageView mBridgeDyImageView = this.f32974a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f32985m);
        }
        MBridgeDyImageView mBridgeDyImageView2 = this.f32975b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f32983j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f32983j.setRepeatCount(-1);
        this.f32983j.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f32974a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f32983j);
        }
    }

    private void e() {
        MBridgeDyImageView mBridgeDyImageView = this.f32975b;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f32983j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f32983j.setRepeatCount(1);
        this.f32983j.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f32984k = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f32984k.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.l.setRepeatCount(0);
        final AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f32984k);
        animationSet.addAnimation(this.l);
        this.f32984k.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (MBridgeBaitClickView.this.f32975b != null) {
                    MBridgeBaitClickView.this.f32975b.setVisibility(4);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                if (MBridgeBaitClickView.this.f32975b != null) {
                    MBridgeBaitClickView.this.f32975b.setVisibility(0);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.f32983j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f32974a != null) {
                            MBridgeBaitClickView.this.f32974a.startAnimation(MBridgeBaitClickView.this.f32983j);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f32975b != null) {
                            MBridgeBaitClickView.this.f32975b.startAnimation(animationSet);
                        }
                    }
                }, 550L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        MBridgeDyImageView mBridgeDyImageView2 = this.f32974a;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(this.f32983j);
        }
    }

    public void init(int i10, int i11) {
        this.f32981h = i10;
        this.f32980g = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f32981h = i10;
        this.f32980g = i11;
        this.f32977d = str;
        this.f32978e = str2;
        this.f32979f = str3;
        init();
    }

    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32977d = "";
        this.f32978e = "";
        this.f32979f = "Click now for details";
        this.f32980g = 1;
        this.f32981h = 1342177280;
        this.f32982i = false;
    }

    public void init() {
        try {
            k();
            h();
            this.f32982i = true;
        } catch (Throwable th2) {
            q0.b("MBridgeAnimationClickView", th2.getMessage());
        }
    }

    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32977d = "";
        this.f32978e = "";
        this.f32979f = "Click now for details";
        this.f32980g = 1;
        this.f32981h = 1342177280;
        this.f32982i = false;
    }

    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f32977d = "";
        this.f32978e = "";
        this.f32979f = "Click now for details";
        this.f32980g = 1;
        this.f32981h = 1342177280;
        this.f32982i = false;
    }
}
