package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w5.c;

/* JADX INFO: loaded from: classes6.dex */
public class GestureNewG2CV2View extends BaseG2CV2View {
    private final int A0;
    private final int B0;
    private final int C0;
    private int D0;
    ImageView l0;
    ImageView m0;
    TextView n0;
    AnimatorSet o0;
    int p0;
    int q0;
    private boolean r0;
    ViewGroup s0;
    private float t0;
    private float u0;
    private int v0;
    com.smartdigimkt.u5.a w0;
    private final int x0;
    private final int y0;
    private final int z0;

    public class a implements com.smartdigimkt.u5.b {
        public a() {
        }

        @Override // com.smartdigimkt.u5.b
        public boolean a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                GestureNewG2CV2View.this.t0 = motionEvent.getX();
                return true;
            }
            if (action == 1) {
                if (GestureNewG2CV2View.this.u0 <= GestureNewG2CV2View.this.v0) {
                    return false;
                }
                c.a aVar = GestureNewG2CV2View.this.i0;
                if (aVar != null) {
                    aVar.a(11, 46);
                }
                return true;
            }
            if (action != 2) {
                return false;
            }
            GestureNewG2CV2View.b(GestureNewG2CV2View.this, Math.abs(motionEvent.getX() - GestureNewG2CV2View.this.t0));
            GestureNewG2CV2View.this.t0 = motionEvent.getX();
            return false;
        }
    }

    public GestureNewG2CV2View(Context context) {
        super(context);
        this.r0 = false;
        this.x0 = 80;
        this.y0 = 110;
        this.z0 = -1;
        this.A0 = 10;
        this.B0 = 11;
        this.C0 = 12;
        this.D0 = -1;
    }

    private com.smartdigimkt.u5.a d() {
        for (ViewParent parent = getParent(); parent.getParent() != null; parent = parent.getParent()) {
            if (parent instanceof com.smartdigimkt.u5.a) {
                return (com.smartdigimkt.u5.a) parent;
            }
        }
        return null;
    }

    private void e() {
        AnimatorSet animatorSet = this.o0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.o0 = null;
        }
        startAnim();
    }

    private void startAnim() {
        if (this.o0 == null) {
            ImageView imageView = this.l0;
            int i2 = this.p0;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", i2, -i2);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(2);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.l0, "translationY", 0.0f, (-this.q0) / 2, 0.0f);
            objectAnimatorOfFloat2.setDuration(1000L);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            objectAnimatorOfFloat2.setRepeatMode(2);
            AnimatorSet animatorSet = new AnimatorSet();
            this.o0 = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            this.o0.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.smartdigimkt.u5.a aVarD = d();
        this.w0 = aVarD;
        if (aVarD != null) {
            aVarD.setCallback(new a());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.smartdigimkt.u5.a aVar = this.w0;
        if (aVar != null) {
            aVar.setCallback(null);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (getMeasuredWidth() < h.a(getContext(), com.smartdigimkt.sdk.basead.ui.guidetoclickv2.a.b.f38534b)) {
            a();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight < h.a(getContext(), com.smartdigimkt.sdk.basead.ui.guidetoclickv2.a.b.f38534b)) {
            a();
            return;
        }
        if (measuredHeight >= h.a(getContext(), com.smartdigimkt.sdk.basead.ui.guidetoclickv2.a.b.f38534b) && measuredHeight < h.a(getContext(), 80.0f)) {
            if (this.D0 == 12) {
                return;
            }
            this.D0 = 12;
            this.p0 = h.a(getContext(), 18.0f);
            this.q0 = h.a(getContext(), 6.0f);
            ImageView imageView = this.m0;
            if (imageView != null) {
                com.smartdigimkt.j7.c.a(imageView, h.a(getContext(), 118.0f), h.a(getContext(), 21.0f));
            }
            ImageView imageView2 = this.l0;
            if (imageView2 != null) {
                com.smartdigimkt.j7.c.a(imageView2, h.a(getContext(), 18.0f), h.a(getContext(), 19.0f));
            }
            TextView textView = this.n0;
            if (textView != null) {
                textView.setVisibility(8);
            }
            e();
            return;
        }
        if (measuredHeight < h.a(getContext(), 80.0f) || measuredHeight > h.a(getContext(), 110.0f)) {
            if (this.D0 == 10) {
                return;
            }
            this.D0 = 10;
            TextView textView2 = this.n0;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            e();
            return;
        }
        if (this.D0 == 11) {
            return;
        }
        this.D0 = 11;
        this.p0 = h.a(getContext(), 22.0f);
        this.q0 = h.a(getContext(), 6.0f);
        ImageView imageView3 = this.m0;
        if (imageView3 != null) {
            com.smartdigimkt.j7.c.a(imageView3, h.a(getContext(), 142.0f), h.a(getContext(), 24.0f));
        }
        ImageView imageView4 = this.l0;
        if (imageView4 != null) {
            com.smartdigimkt.j7.c.a(imageView4, h.a(getContext(), 22.0f), h.a(getContext(), 24.0f));
        }
        TextView textView3 = this.n0;
        if (textView3 != null) {
            textView3.setVisibility(0);
            if (this.n0.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.n0.getLayoutParams();
                layoutParams.topMargin = h.a(getContext(), 2.0f);
                this.n0.setLayoutParams(layoutParams);
            }
        }
        e();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        AnimatorSet animatorSet = this.o0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public static /* synthetic */ float b(GestureNewG2CV2View gestureNewG2CV2View, float f) {
        float f2 = gestureNewG2CV2View.u0 + f;
        gestureNewG2CV2View.u0 = f2;
        return f2;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void c() {
        super.c();
        AnimatorSet animatorSet = this.o0;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a(int i2, int i3) {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_g2c_v2_gesture_v2", "layout"), this);
        this.v0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.l0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_slide_finger", "id"));
        this.m0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_white_line", "id"));
        this.n0 = (TextView) findViewById(h.a(getContext(), "myoffer_g2c_slide_hint", "id"));
        this.s0 = (ViewGroup) findViewById(h.a(getContext(), "myoffer_g2c_item_container", "id"));
        this.p0 = h.a(getContext(), 32.0f);
        this.q0 = h.a(getContext(), 10.0f);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void b() {
        super.b();
        AnimatorSet animatorSet = this.o0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
