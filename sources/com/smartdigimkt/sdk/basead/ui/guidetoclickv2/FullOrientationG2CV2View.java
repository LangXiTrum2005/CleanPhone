package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public class FullOrientationG2CV2View extends BaseG2CV2View {
    public static final int DEFAULT_SIZE = 120;
    ValueAnimator l0;
    private int m0;
    ViewGroup n0;
    ImageView o0;
    private float p0;
    private float q0;
    private float r0;
    private float s0;
    private int t0;
    com.smartdigimkt.u5.a u0;
    RelativeLayout.LayoutParams v0;
    private int w0;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (FullOrientationG2CV2View.this.o0 != null) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i2 = FullOrientationG2CV2View.this.m0 % 4;
                if (i2 == 1) {
                    FullOrientationG2CV2View.this.o0.setTranslationY(fFloatValue);
                    return;
                }
                if (i2 == 2) {
                    FullOrientationG2CV2View.this.o0.setTranslationX(-fFloatValue);
                } else if (i2 != 3) {
                    FullOrientationG2CV2View.this.o0.setTranslationY(-fFloatValue);
                } else {
                    FullOrientationG2CV2View.this.o0.setTranslationX(fFloatValue);
                }
            }
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            FullOrientationG2CV2View.b(FullOrientationG2CV2View.this);
        }
    }

    public class c implements com.smartdigimkt.u5.b {
        public c() {
        }

        @Override // com.smartdigimkt.u5.b
        public boolean a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                FullOrientationG2CV2View.this.p0 = motionEvent.getX();
                FullOrientationG2CV2View.this.q0 = motionEvent.getY();
                return true;
            }
            if (action != 1) {
                if (action == 2) {
                    float x = motionEvent.getX() - FullOrientationG2CV2View.this.p0;
                    float y = motionEvent.getY() - FullOrientationG2CV2View.this.q0;
                    FullOrientationG2CV2View.c(FullOrientationG2CV2View.this, Math.abs(x));
                    FullOrientationG2CV2View.d(FullOrientationG2CV2View.this, Math.abs(y));
                    FullOrientationG2CV2View.this.p0 = motionEvent.getX();
                    FullOrientationG2CV2View.this.q0 = motionEvent.getY();
                    return false;
                }
                if (action != 3) {
                    return false;
                }
            }
            if (FullOrientationG2CV2View.this.s0 + FullOrientationG2CV2View.this.r0 <= FullOrientationG2CV2View.this.t0) {
                return false;
            }
            com.smartdigimkt.w5.c.a aVar = FullOrientationG2CV2View.this.i0;
            if (aVar != null) {
                aVar.a(11, 21);
            }
            return true;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f38502a = 501;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f38503b = 502;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f38504c = 504;
        public static final int d = 505;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f38505e = 507;
    }

    public FullOrientationG2CV2View(Context context) {
        super(context);
        this.m0 = 0;
        this.w0 = h.a(getContext(), 120.0f);
    }

    public static /* synthetic */ int b(FullOrientationG2CV2View fullOrientationG2CV2View) {
        int i2 = fullOrientationG2CV2View.m0;
        fullOrientationG2CV2View.m0 = i2 + 1;
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.smartdigimkt.u5.a aVarD = d();
        this.u0 = aVarD;
        if (aVarD != null) {
            aVarD.setCallback(new c());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.smartdigimkt.u5.a aVar = this.u0;
        if (aVar != null) {
            aVar.setCallback(null);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void setViewMode(int i2) {
        int i3 = this.w0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i3);
        this.v0 = layoutParams;
        if (i2 == 502 || i2 == 504 || i2 == 505) {
            layoutParams.addRule(13);
            return;
        }
        layoutParams.addRule(12);
        this.v0.addRule(14);
        this.v0.addRule(14);
        this.v0.setMargins(0, 0, 0, h.a(getContext(), 140.0f));
    }

    public void updateSize(int i2) {
        int i3 = (int) (i2 * 0.72f);
        RelativeLayout.LayoutParams layoutParams = this.v0;
        layoutParams.width = -2;
        layoutParams.height = i3;
        this.n0.setBackgroundColor(0);
        View viewFindViewById = findViewById(h.a(getContext(), "myoffer_g2c_fullori_bg", "id"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i3, i3);
        layoutParams2.width = i3;
        layoutParams2.height = i3;
        layoutParams2.topMargin = 0;
        layoutParams2.addRule(15);
        viewFindViewById.setLayoutParams(layoutParams2);
        this.o0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_fullori_finger", "id"));
        float f = i3;
        float f2 = f * 0.5f;
        int i4 = (int) f2;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i4, i4);
        layoutParams3.topMargin = 0;
        layoutParams3.leftMargin = (int) ((f - f2) * 0.5f);
        layoutParams3.addRule(15);
        this.o0.setLayoutParams(layoutParams3);
        TextView textView = (TextView) findViewById(h.a(getContext(), "myoffer_g2c_fullori_text", "id"));
        textView.setTextSize(2, 10.0f);
        textView.setText(h.a(getContext(), "myoffer_g2c_fuu_ori_hint_small", k.f38992h));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.width = -2;
        layoutParams4.topMargin = 0;
        layoutParams4.leftMargin = h.a(getContext(), 10.0f);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, viewFindViewById.getId());
        textView.setLayoutParams(layoutParams4);
        this.n0.setLayoutParams(this.v0);
    }

    public static /* synthetic */ float c(FullOrientationG2CV2View fullOrientationG2CV2View, float f) {
        float f2 = fullOrientationG2CV2View.r0 + f;
        fullOrientationG2CV2View.r0 = f2;
        return f2;
    }

    public static /* synthetic */ float d(FullOrientationG2CV2View fullOrientationG2CV2View, float f) {
        float f2 = fullOrientationG2CV2View.s0 + f;
        fullOrientationG2CV2View.s0 = f2;
        return f2;
    }

    private void e() {
        if (this.l0 == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, h.a(getContext(), 12.0f), 0.0f);
            this.l0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(500L);
            this.l0.setRepeatCount(-1);
            this.l0.addUpdateListener(new a());
            this.l0.addListener(new b());
        }
    }

    private com.smartdigimkt.u5.a d() {
        for (ViewParent parent = getParent(); parent.getParent() != null; parent = parent.getParent()) {
            if (parent instanceof com.smartdigimkt.u5.a) {
                return (com.smartdigimkt.u5.a) parent;
            }
        }
        return null;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a(int i2, int i3) {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_g2c_v2_full_orientation", "layout"), this);
        this.t0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        ViewGroup viewGroup = (ViewGroup) findViewById(h.a(getContext(), "myoffer_g2c_fullori_container", "id"));
        this.n0 = viewGroup;
        RelativeLayout.LayoutParams layoutParams = this.v0;
        if (layoutParams != null) {
            viewGroup.setLayoutParams(layoutParams);
        }
        this.o0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_fullori_finger", "id"));
        e();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void b() {
        super.b();
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void c() {
        super.c();
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
