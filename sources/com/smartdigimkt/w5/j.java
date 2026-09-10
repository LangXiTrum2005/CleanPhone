package com.smartdigimkt.w5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.smartdigimkt.sdk.api.SDMSDK;
import com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView;
import com.smartdigimkt.sdk.basead.ui.BaseShakeView;
import com.smartdigimkt.sdk.basead.ui.ShakeBorderThumbView;
import com.smartdigimkt.sdk.basead.ui.ShakeNativeBorderThumbView;
import com.smartdigimkt.sdk.basead.ui.ShakeThumbView;
import com.smartdigimkt.sdk.basead.ui.ShakeView;
import com.smartdigimkt.u2.m;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class j extends com.smartdigimkt.w5.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    BaseShakeView f39451n;
    BaseShakeView o;
    long v;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f39449i = 12;
    private final int j = 252;
    private final int k = Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f39450l = 48;
    private final int m = 86;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f39452p = false;
    final long q = m.D0;
    final long r = 500;
    boolean s = false;
    boolean t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f39453u = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.smartdigimkt.w5.j$a$a, reason: collision with other inner class name */
        public class C0636a implements ValueAnimator.AnimatorUpdateListener {
            public C0636a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (j.this.o != null) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    j jVar = j.this;
                    if (jVar.f39451n != null && jVar.o.getParent() == null) {
                        j.this.f39451n.setAlpha(fFloatValue);
                    }
                    if (j.this.o.getParent() != null) {
                        j.this.o.setAlpha(fFloatValue);
                    }
                }
            }
        }

        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                int iIndexOfChild;
                super.onAnimationRepeat(animator);
                try {
                    j jVar = j.this;
                    if (jVar.o == null || !jVar.c()) {
                        return;
                    }
                    com.smartdigimkt.j7.c.a(j.this.o);
                    j jVar2 = j.this;
                    RelativeLayout relativeLayout = (RelativeLayout) jVar2.d.findViewById(com.smartdigimkt.n8.h.a(jVar2.f39411a, "myoffer_end_card_id", "id"));
                    if (relativeLayout != null) {
                        relativeLayout.addView(j.this.o);
                    } else {
                        j jVar3 = j.this;
                        View view = jVar3.g;
                        if (view == null || jVar3.d.indexOfChild(view) <= 0) {
                            iIndexOfChild = -1;
                        } else {
                            j jVar4 = j.this;
                            iIndexOfChild = jVar4.d.indexOfChild(jVar4.g);
                        }
                        j jVar5 = j.this;
                        jVar5.d.addView(jVar5.o, iIndexOfChild);
                    }
                    j.this.o.setAlpha(0.2f);
                    j.this.f39451n.setVisibility(8);
                } catch (Throwable unused) {
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j.this.c()) {
                try {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.2f);
                    valueAnimatorOfFloat.setDuration(500L);
                    valueAnimatorOfFloat.setRepeatCount(1);
                    valueAnimatorOfFloat.setRepeatMode(2);
                    valueAnimatorOfFloat.addUpdateListener(new C0636a());
                    valueAnimatorOfFloat.addListener(new b());
                    valueAnimatorOfFloat.start();
                } catch (Throwable unused) {
                    if (j.this.c()) {
                        BaseShakeView baseShakeView = j.this.o;
                        if (baseShakeView == null || baseShakeView.getParent() == null) {
                            j.this.f39451n.setVisibility(0);
                        } else {
                            j.this.f39451n.setVisibility(8);
                            j.this.o.setVisibility(0);
                        }
                    }
                }
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.w5.c.a aVar = j.this.f39415h;
            if (aVar != null) {
                aVar.a(1, 5);
            }
        }
    }

    public class c implements BaseShakeView.o {
        public c() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView.o
        public boolean a() {
            if (!j.this.b()) {
                return false;
            }
            com.smartdigimkt.w5.c.a aVar = j.this.f39415h;
            if (aVar == null) {
                return true;
            }
            aVar.a(4, 5);
            return true;
        }
    }

    private void b(Map<String, Object> map) {
        BaseShakeView baseShakeView;
        View view = this.g;
        int iIndexOfChild = (view == null || this.d.indexOfChild(view) <= 0) ? -1 : this.d.indexOfChild(this.g);
        int i2 = this.f39414e;
        RelativeLayout relativeLayout = null;
        if (i2 == 1 || i2 == 2) {
            try {
                relativeLayout = (RelativeLayout) this.d.findViewById(com.smartdigimkt.n8.h.a(this.f39411a, "myoffer_end_card_id", "id"));
            } catch (Throwable unused) {
            }
            BaseShakeView baseShakeView2 = this.f39451n;
            if (baseShakeView2 != null) {
                com.smartdigimkt.j7.c.a(baseShakeView2);
                this.f39451n.setVisibility(8);
                if (relativeLayout != null) {
                    relativeLayout.addView(this.f39451n);
                    return;
                } else {
                    this.d.addView(this.f39451n, iIndexOfChild);
                    return;
                }
            }
            return;
        }
        if (i2 == 3) {
            BaseShakeView baseShakeView3 = this.f39451n;
            if (baseShakeView3 != null) {
                com.smartdigimkt.j7.c.a(baseShakeView3);
                this.f39451n.setVisibility(0);
                if (iIndexOfChild > 0) {
                    iIndexOfChild++;
                }
                this.d.addView(this.f39451n, iIndexOfChild);
                return;
            }
            return;
        }
        if (i2 != 5 && i2 != 6) {
            if (i2 == 100 && (baseShakeView = this.f39451n) != null) {
                com.smartdigimkt.j7.c.a(baseShakeView);
                this.f39451n.setVisibility(0);
                this.d.addView(this.f39451n);
                return;
            }
            return;
        }
        BaseShakeView baseShakeView4 = this.f39451n;
        if (baseShakeView4 != null) {
            com.smartdigimkt.j7.c.a(baseShakeView4);
            Object obj = map != null ? map.get(g.a.f39427b) : null;
            if (obj != null && (obj instanceof ViewGroup)) {
                BaseShakeView baseShakeView5 = this.f39451n;
                if (baseShakeView5 instanceof ShakeNativeBorderThumbView) {
                    ((ShakeNativeBorderThumbView) baseShakeView5).changeBackground();
                    if (obj instanceof FrameLayout) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        this.f39451n.setLayoutParams(layoutParams);
                    }
                }
                ((ViewGroup) obj).addView(this.f39451n);
                return;
            }
            if (this.d.getMeasuredWidth() < i.a().b(this.f39411a) || this.d.getMeasuredHeight() < i.a().a(this.f39411a)) {
                Object obj2 = map.get(g.a.f39428c);
                if (obj2 == null || !(obj2 instanceof com.smartdigimkt.f5.h)) {
                    return;
                }
                ((com.smartdigimkt.f5.h) obj2).a(1);
                return;
            }
            if (this.d instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 21;
                this.f39451n.setLayoutParams(layoutParams2);
            }
            this.d.addView(this.f39451n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        return (this.f39414e == 1 && com.smartdigimkt.m3.i.g(this.f39412b, this.f39413c) && this.s) ? false : true;
    }

    private void d() {
        e();
        if (this.o == null || this.f39414e != 1 || com.smartdigimkt.m3.i.c(this.f39412b) || com.smartdigimkt.m3.i.a(this.f39412b)) {
            return;
        }
        if (this.f39413c.t.T() == 0 || com.smartdigimkt.n8.c.K(this.f39411a) == 2) {
            this.o.setAlpha(1.0f);
            this.o.setVisibility(0);
        }
    }

    private void e() {
        BaseShakeView baseShakeView = this.f39451n;
        if (baseShakeView != null) {
            baseShakeView.setVisibility(8);
        }
        BaseShakeView baseShakeView2 = this.o;
        if (baseShakeView2 != null) {
            baseShakeView2.setVisibility(8);
        }
    }

    private void f() {
        if (this.f39451n == null || this.o == null || this.f39452p || !c()) {
            return;
        }
        this.f39452p = true;
        this.f39451n.setVisibility(0);
        this.f39451n.postDelayed(new a(), m.D0);
    }

    @Override // com.smartdigimkt.w5.c
    public void a() {
    }

    /* JADX WARN: Code duplicated, block: B:66:0x019c  */
    @Override // com.smartdigimkt.w5.c
    public void a(Context context, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i2, com.smartdigimkt.w5.c.a aVar2) {
        boolean z2;
        super.a(context, fVar, aVar, viewGroup, relativeLayout, view, i2, aVar2);
        int i3 = this.f39414e;
        if (i3 == 1 || i3 == 2) {
            this.f39451n = new ShakeThumbView(context);
            RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-2, -2, 13);
            if (i2 == 2 && com.smartdigimkt.n8.c.K(context) == 2 && aVar.t.T() == 0) {
                this.f39451n.setPadding(0, 0, 0, com.smartdigimkt.n8.h.a(context, 42.0f));
            }
            this.f39451n.setLayoutParams(layoutParamsF);
            this.o = new ShakeBorderThumbView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9);
            layoutParams.addRule(12);
            int iA = com.smartdigimkt.n8.h.a(context, 12.0f);
            if (i2 == 1) {
                if (com.smartdigimkt.n8.c.K(context) == 2) {
                    layoutParams.setMargins(iA, 0, 0, com.smartdigimkt.n8.h.a(context, 132.0f));
                } else {
                    layoutParams.setMargins(iA, 0, 0, com.smartdigimkt.n8.h.a(context, 252.0f));
                }
            }
            if (i2 == 2 && !com.smartdigimkt.m3.i.a(this.f39412b)) {
                if (aVar.t.T() == 0) {
                    layoutParams.setMargins(iA, 0, 0, com.smartdigimkt.n8.h.a(context, 48.0f));
                } else {
                    layoutParams.setMargins(iA, 0, 0, com.smartdigimkt.n8.h.a(context, 86.0f));
                }
            }
            this.o.setLayoutParams(layoutParams);
            a(this.f39451n, aVar.t.T() != 1);
            a(this.o, aVar.t.T() != 1);
        } else if (i3 == 3) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            boolean z3 = (this.f39413c.t.y() == 1 && !TextUtils.isEmpty(this.f39413c.t.v())) || this.f39413c.t.v1() || this.f39413c.t.c();
            if (!this.f39412b.v0()) {
                if (BaseSdkSplashATView.isSinglePicture(this.f39412b, this.f39413c.t)) {
                    this.f39451n = new ShakeView(context);
                    layoutParams2.addRule(14);
                    layoutParams2.addRule(12);
                    int iA2 = this.f39413c.t.D1() == 2 ? com.smartdigimkt.n8.h.a(context, 46.0f) : com.smartdigimkt.n8.h.a(context, 63.0f);
                    if (this.f39413c.t.c()) {
                        iA2 = com.smartdigimkt.n8.h.a(context, 100.0f);
                    }
                    if (fVar.O() == 4) {
                        String directlySplashAdShakeIconString = SDMSDK.getInstance().getDirectlyOfferSetting().getDirectlySplashAdShakeIconString();
                        if (!TextUtils.isEmpty(directlySplashAdShakeIconString)) {
                            ((ShakeView) this.f39451n).setShakeHintText(directlySplashAdShakeIconString);
                        }
                        View directlySplashShakeButton = SDMSDK.getInstance().getDirectlyOfferSetting().getDirectlySplashShakeButton();
                        if (directlySplashShakeButton != null) {
                            ((ShakeView) this.f39451n).replaceShakeCTAButton(directlySplashShakeButton);
                        }
                    }
                    ((ShakeView) this.f39451n).setNeedHideShakeIcon(z3);
                    layoutParams2.setMargins(0, 0, 0, iA2);
                    z2 = true;
                } else if (z3 && this.f39413c.t.D1() != 1) {
                    this.f39451n = new ShakeBorderThumbView(context);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(15);
                } else {
                    this.f39451n = new ShakeThumbView(context);
                    layoutParams2.addRule(13);
                    if (this.f39413c.t.D1() == 2) {
                        this.f39451n.setPadding(0, 0, 0, com.smartdigimkt.n8.h.a(context, 26.0f));
                    }
                }
                this.f39451n.setLayoutParams(layoutParams2);
                a(this.f39451n, (z2 && aVar.t.T() == 1) ? false : true);
            } else if (!z3) {
                this.f39451n = new ShakeThumbView(context);
                layoutParams2.addRule(13);
                this.f39451n.setPadding(0, 0, 0, com.smartdigimkt.n8.h.a(context, 26.0f));
            } else {
                this.f39451n = new ShakeBorderThumbView(context);
                layoutParams2.addRule(11);
                layoutParams2.addRule(15);
            }
            z2 = false;
            this.f39451n.setLayoutParams(layoutParams2);
            a(this.f39451n, (z2 && aVar.t.T() == 1) ? false : true);
        } else if (i3 == 5 || i3 == 6) {
            this.f39451n = new ShakeNativeBorderThumbView(context);
            this.f39451n.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            a(this.f39451n, aVar.t.T() != 1);
        } else if (i3 == 100) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            this.f39451n = new ShakeBorderThumbView(context);
            layoutParams3.addRule(13);
            this.f39451n.setAlpha(0.0f);
            this.f39451n.setLayoutParams(layoutParams3);
            a(this.f39451n, false);
        }
        BaseShakeView baseShakeView = this.f39451n;
        if (baseShakeView != null) {
            baseShakeView.setShakeSetting(this.f39413c.t, this.f39412b.j());
        }
        BaseShakeView baseShakeView2 = this.o;
        if (baseShakeView2 != null) {
            baseShakeView2.setShakeSetting(this.f39413c.t, this.f39412b.j());
        }
    }

    public boolean b() {
        if (!com.smartdigimkt.a6.b.a(this.v, this.f39413c)) {
            return false;
        }
        int i2 = this.f39414e;
        if (i2 == 1 || i2 == 2) {
            return this.t;
        }
        if (i2 != 3) {
            return true;
        }
        return !this.f39453u;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005c  */
    @Override // com.smartdigimkt.w5.c
    public void a(int i2, Map<String, Object> map) {
        boolean z2;
        BaseShakeView baseShakeView;
        if (i2 == 102) {
            this.s = true;
            if (this.f39414e == 1 && com.smartdigimkt.m3.i.g(this.f39412b, this.f39413c)) {
                d();
                return;
            }
            return;
        }
        if (i2 == 103) {
            if (a(map)) {
                e();
                return;
            }
            return;
        }
        if (i2 == 105) {
            e();
            return;
        }
        if (i2 == 106) {
            if (this.f39414e == 3 && com.smartdigimkt.m3.i.c(this.f39412b)) {
                b(map);
                return;
            }
            return;
        }
        if (i2 == 118) {
            if (this.f39414e == 3 && com.smartdigimkt.m3.i.f(this.f39412b, this.f39413c)) {
                e();
                return;
            }
            return;
        }
        if (i2 == 119) {
            e();
            return;
        }
        if (i2 == 303) {
            if (this.f39414e == 100) {
                b(map);
                return;
            }
            return;
        }
        if (i2 != 304) {
            switch (i2) {
                case 110:
                    this.t = true;
                    break;
                case 111:
                    this.t = false;
                    break;
                case 112:
                    e();
                    break;
                default:
                    switch (i2) {
                        case 114:
                            this.v = System.currentTimeMillis();
                            if (map != null) {
                                Object obj = map.get(g.a.f39426a);
                                if ((obj instanceof Integer) && ((Integer) obj).intValue() == 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = false;
                            }
                            if (z2 && (baseShakeView = this.o) != null) {
                                ViewGroup.LayoutParams layoutParams = baseShakeView.getLayoutParams();
                                int iA = com.smartdigimkt.n8.h.a(this.f39411a, 12.0f);
                                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                                    ((RelativeLayout.LayoutParams) layoutParams).setMargins(iA, 0, 0, com.smartdigimkt.n8.h.a(this.f39411a, 48.0f));
                                }
                            }
                            int i3 = this.f39414e;
                            if (i3 == 1) {
                                b(map);
                                f();
                            } else if (!z2 && (i3 != 2 || com.smartdigimkt.m3.i.a(this.f39412b))) {
                                int i4 = this.f39414e;
                                if (i4 == 5 || i4 == 6) {
                                    b(map);
                                }
                            } else {
                                b(map);
                                f();
                            }
                            break;
                        case 115:
                            this.f39453u = true;
                            break;
                        case 116:
                            if (this.f39414e == 3 && !com.smartdigimkt.m3.i.c(this.f39412b)) {
                                b(map);
                                break;
                            }
                            break;
                    }
                    break;
            }
            return;
        }
        if (this.f39414e == 100) {
            e();
        }
    }

    private void a(BaseShakeView baseShakeView, boolean z2) {
        if (z2) {
            baseShakeView.setOnClickListener(new b());
        }
        baseShakeView.setOnShakeListener(new c(), this.f39413c.t);
    }
}
