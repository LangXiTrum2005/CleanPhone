package sg.bigo.ads.ad.interstitial.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.f;
import sg.bigo.ads.ad.interstitial.multi_img.e;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.v;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final p f46291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final f f46292i;
    protected ViewGroup j;
    protected ViewGroup k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected RoundedImageView f46293l;
    protected RoundedImageView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Button f46294n;
    protected TextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected ViewGroup f46295p;
    protected AnimationSet q;
    protected Rect r;

    /* JADX WARN: Type inference failed for: r2v1, types: [sg.bigo.ads.api.core.c] */
    public a(sg.bigo.ads.ad.b.c cVar, m mVar, p pVar) {
        super(cVar, mVar);
        this.f46291h = pVar;
        ?? F2 = cVar.f();
        this.f46292i = new f(mVar.a("layer.gp_element"), 0, F2 != 0 ? F2.n() : "");
    }

    public static int a(m mVar) {
        return sg.bigo.ads.ad.interstitial.d.a.a(mVar, "layer.webview_layout");
    }

    public static int b(m mVar) {
        return sg.bigo.ads.ad.interstitial.d.a.b(mVar, "layer.webview_force_time");
    }

    public abstract void d(r rVar);

    @Override // sg.bigo.ads.ad.interstitial.v
    public final int e() {
        m mVar = this.g;
        return e.a(mVar != null ? mVar.a("layer.mediaview_colour") : 3);
    }

    public void f(r rVar) {
        Button button = (Button) this.k.findViewById(R.id.inter_btn_cta);
        this.f46294n = button;
        if (button != null) {
            int iG = g(rVar);
            float fA = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 8);
            this.f46294n.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, iG));
            sg.bigo.ads.ad.interstitial.d.a(this.f46294n, sg.bigo.ads.common.w.b.a(iG));
        }
    }

    public final int g(r rVar) {
        int i2;
        m mVar = this.g;
        if (mVar == null) {
            return -16736769;
        }
        int iA = mVar.a("layer.cta_color");
        return (iA == 3 && d() && (i2 = v.a(rVar).f46659i) != 0) ? i2 : s.a(this.f, iA, null);
    }

    public abstract boolean g();

    public abstract int h();

    public final void i() {
        a(1, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.g.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.k.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.g.a.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.j();
                    }
                });
            }
        });
    }

    public final void j() {
        ViewStub viewStub;
        View viewInflate;
        ViewStub viewStub2;
        final View viewInflate2;
        ViewGroup viewGroup;
        m mVar = this.g;
        int iA = mVar != null ? mVar.a("layer.guided_click") : 2;
        if (iA == 1) {
            Button button = this.f46294n;
            if (button != null) {
                sg.bigo.ads.ad.interstitial.c.e(button);
                return;
            }
            return;
        }
        if (iA != 3) {
            ViewGroup viewGroup2 = this.k;
            if (viewGroup2 == null || this.f46294n == null || (viewStub2 = (ViewStub) viewGroup2.findViewById(R.id.inter_gesture_zoom_layout)) == null || (viewInflate2 = viewStub2.inflate()) == null) {
                return;
            }
            viewInflate2.setAlpha(0.0f);
            sg.bigo.ads.common.e.a.a(viewInflate2, 99.0f);
            final View viewFindViewById = viewInflate2.findViewById(R.id.inter_click_guide);
            final View viewFindViewById2 = viewInflate2.findViewById(R.id.inter_click_ripple);
            if (viewFindViewById == null || viewFindViewById2 == null) {
                return;
            }
            int iA2 = sg.bigo.ads.common.utils.e.a(this.k.getContext(), 50);
            viewInflate2.setPadding(iA2, iA2, 0, 0);
            Button button2 = this.f46294n;
            if (button2 != null && (viewGroup = this.k) != null) {
                Point pointA = u.a(viewGroup, button2);
                Rect rect = new Rect(pointA.x, pointA.y, this.f46294n.getMeasuredWidth() + pointA.x, this.f46294n.getMeasuredHeight() + pointA.y);
                Rect rect2 = new Rect(0, 0, viewFindViewById2.getLayoutParams().width, viewFindViewById2.getLayoutParams().height);
                int iCenterY = ((rect.centerY() - rect2.centerY()) + rect2.top) - iA2;
                int iCenterX = ((rect.centerX() - rect2.centerX()) + rect2.left) - iA2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate2.getLayoutParams();
                marginLayoutParams.topMargin = iCenterY;
                marginLayoutParams.leftMargin = (int) (iCenterX - (rect.width() * 0.15f));
                viewInflate2.requestLayout();
            }
            sg.bigo.ads.ad.interstitial.c.a(0, v.f46694e, 200L, new ValueCallback<Integer>() { // from class: sg.bigo.ads.ad.interstitial.g.a.3
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    Integer num2 = num;
                    if (num2 != null) {
                        viewInflate2.setAlpha((num2.intValue() * 1.0f) / v.f46694e);
                    }
                }
            }, new ValueCallback<Void>() { // from class: sg.bigo.ads.ad.interstitial.g.a.4
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Void r2) {
                    viewInflate2.setAlpha(1.0f);
                    sg.bigo.ads.ad.interstitial.c.a(viewFindViewById, viewFindViewById2);
                }
            });
            return;
        }
        ViewGroup viewGroup3 = this.k;
        if (viewGroup3 == null || (viewStub = (ViewStub) viewGroup3.findViewById(R.id.inter_gesture_slide_layout)) == null || (viewInflate = viewStub.inflate()) == null) {
            return;
        }
        sg.bigo.ads.common.e.a.a(viewInflate, 99.0f);
        View viewFindViewById3 = viewInflate.findViewById(R.id.inter_click_guide);
        if (viewFindViewById3 != null) {
            viewInflate.setTag(16);
            sg.bigo.ads.ad.b.a.a(this.j, viewInflate, 10, this.f, 0);
            int iMax = Math.max(1300, Math.max(600, 600));
            sg.bigo.ads.common.a.a aVar = new sg.bigo.ads.common.a.a(-(sg.bigo.ads.common.utils.e.c(viewFindViewById3.getContext()) >> 1));
            aVar.setRepeatCount(-1);
            aVar.setInterpolator(new sg.bigo.ads.common.utils.b.InterpolatorC0850b(iMax - 1000) { // from class: sg.bigo.ads.ad.interstitial.c.12

                /* JADX INFO: renamed from: a */
                private final Interpolator f45848a = sg.bigo.ads.common.utils.b.a(2);

                public AnonymousClass12(long j) {
                    super(1000L, 0L, j);
                    this.f45848a = sg.bigo.ads.common.utils.b.a(2);
                }

                @Override // sg.bigo.ads.common.utils.b.InterpolatorC0850b, android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    float interpolation = super.getInterpolation(f);
                    Interpolator interpolator = this.f45848a;
                    return interpolator != null ? interpolator.getInterpolation(interpolation) : interpolation;
                }
            });
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setRepeatCount(-1);
            long j = iMax + AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED;
            alphaAnimation.setInterpolator(new sg.bigo.ads.common.utils.b.InterpolatorC0850b(300L, 0L, j));
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setInterpolator(new sg.bigo.ads.common.utils.b.InterpolatorC0850b(300L, 0L, j));
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setRepeatCount(-1);
            alphaAnimation2.setInterpolator(new sg.bigo.ads.common.utils.b.InterpolatorC0850b(300L, j, 0L));
            AnimationSet animationSet = new AnimationSet(false);
            animationSet.setDuration(iMax);
            animationSet.setRepeatCount(-1);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(aVar);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(alphaAnimation2);
            viewFindViewById3.startAnimation(animationSet);
            this.q = animationSet;
            a(true);
        }
    }

    public void k() {
        Context context = this.k.getContext();
        RoundedImageView roundedImageView = (RoundedImageView) this.k.findViewById(R.id.inter_icon);
        this.f46293l = roundedImageView;
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 22));
            this.f46293l.setStrokeWidth(sg.bigo.ads.common.utils.e.a(context, 1));
            this.f46293l.setStrokeColor(134217728);
        }
    }

    public final View a(r rVar, ViewGroup viewGroup, int i2, final v.a aVar) {
        if (viewGroup == null) {
            return null;
        }
        this.j = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), h(), null, false);
        this.k = viewGroup2;
        if (viewGroup2 == null) {
            return null;
        }
        this.j.addView(viewGroup2, new ViewGroup.LayoutParams(-1, -1));
        this.k.setBackgroundColor(-234881024);
        k();
        e(rVar);
        f(rVar);
        TextView textView = (TextView) this.k.findViewById(R.id.inter_warning);
        this.o = textView;
        sg.bigo.ads.ad.interstitial.d.a(textView, -234881024);
        sg.bigo.ads.common.e.a.a((View) this.o, 101.0f);
        ViewGroup viewGroup3 = (ViewGroup) this.k.findViewById(R.id.inter_ad_tag_layout);
        this.f46295p = viewGroup3;
        sg.bigo.ads.common.e.a.a((View) viewGroup3, 101.0f);
        d(rVar);
        sg.bigo.ads.ad.interstitial.c.a(this.k, this.j, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.g.a.1
            @Override // java.lang.Runnable
            public final void run() {
                v.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(a.this.k);
                }
                a.this.i();
            }
        });
        int iA = this.g.a("layer.click_type");
        ViewGroup viewGroup4 = this.j;
        ViewGroup viewGroup5 = this.k;
        a(rVar, viewGroup4, viewGroup5, null, i2, 10, iA, viewGroup5);
        TextView textView2 = this.o;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        a(iA, this.g.a("layer.media_view_clickable_switch") == 1, this.g.a("layer.other_space_clickable_switch") == 1);
        String strI = ((sg.bigo.ads.core.a.a) this.f.f()).i();
        TextView textView3 = (TextView) this.k.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(strI)) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(strI);
        }
        return this.k;
    }

    public void e(r rVar) {
        RoundedImageView roundedImageView = (RoundedImageView) this.k.findViewById(R.id.inter_click_guide_image);
        this.m = roundedImageView;
        if (roundedImageView == null || rVar == null) {
            return;
        }
        roundedImageView.setTag(5);
        ValueCallback<Bitmap> valueCallback = new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.g.a.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    a.this.m.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.g.a.5.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.m.setImageBitmap(bitmap2);
                        }
                    });
                }
            }
        };
        Bitmap bitmapG = v.a(rVar).g();
        if (bitmapG != null) {
            valueCallback.onReceiveValue(bitmapG);
        } else {
            v.a(rVar, valueCallback);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean f() {
        return true;
    }

    public static a a(Context context, sg.bigo.ads.ad.b.c cVar, m mVar, boolean z2) {
        int i2;
        int iC;
        if (mVar == null || cVar == null || z2) {
            return null;
        }
        if (context != null) {
            i2 = context.getResources().getDisplayMetrics().widthPixels;
            iC = sg.bigo.ads.common.utils.e.c(context);
        } else {
            i2 = 0;
            iC = 0;
        }
        p pVar = new p(i2, iC);
        int iA = mVar.a("layer.ad_component_layout");
        if (iA == 1) {
            return new b(cVar, mVar, pVar);
        }
        if (iA == 2) {
            return new c(cVar, mVar, pVar);
        }
        if (iA != 3) {
            return null;
        }
        return new d(cVar, mVar, pVar);
    }

    public void a(int i2, boolean z2, boolean z3) {
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            return;
        }
        sg.bigo.ads.ad.b.a.a(viewGroup, 12);
        sg.bigo.ads.ad.b.a.a(this.f46294n, 17);
        sg.bigo.ads.ad.b.a.a(this.f46293l, 17);
        if (z3) {
            sg.bigo.ads.ad.b.a.a(this.j, this.k, 10, this.f, i2);
        } else {
            sg.bigo.ads.ad.b.a.a(this.j, this.k, 10, r.f46631F, 0);
        }
        sg.bigo.ads.ad.b.a.a(this.m, 5);
        RoundedImageView roundedImageView = this.m;
        if (roundedImageView != null) {
            if (z2) {
                sg.bigo.ads.ad.b.a.a(this.j, roundedImageView, 10, this.f, i2);
            } else {
                sg.bigo.ads.ad.b.a.a(this.j, roundedImageView, 10, r.f46631F, 0);
            }
        }
    }

    public final void a(View view) {
        ViewGroup viewGroup = this.k;
        if (viewGroup == null || view == null) {
            return;
        }
        Point pointA = u.a(viewGroup, view);
        this.r = new Rect(pointA.x, pointA.y, view.getMeasuredWidth() + pointA.x, view.getMeasuredHeight() + pointA.y);
        a(false);
    }

    private void a(boolean z2) {
        AnimationSet animationSet = this.q;
        if (animationSet == null || this.r == null) {
            return;
        }
        List<Animation> animations = animationSet.getAnimations();
        for (int i2 = 0; animations != null && i2 < animations.size(); i2++) {
            Animation animation = animations.get(i2);
            if (animation instanceof sg.bigo.ads.common.a.a) {
                sg.bigo.ads.common.a.a aVar = (sg.bigo.ads.common.a.a) animation;
                int iHeight = this.r.height();
                aVar.f47092c = iHeight;
                if (z2) {
                    aVar.d = iHeight;
                }
            }
        }
    }
}
