package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w5.c;

/* JADX INFO: loaded from: classes6.dex */
public class FingerSlideUpG2CV2View extends BaseG2CV2View {
    private int l0;
    private int m0;
    private ImageView n0;
    private ImageView o0;
    private AnimatorSet p0;
    private ObjectAnimator q0;
    private ObjectAnimator r0;
    float s0;
    float t0;
    int u0;
    float v0;

    public FingerSlideUpG2CV2View(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a(int i2, int i3) {
        this.l0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (i2 == 2) {
            LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_g2c_v2_finger_slide_up_s", "layout"), this);
            this.m0 = h.a(getContext(), 44.0f);
            int i4 = this.u0;
            if (i4 > 0) {
                setPadding(0, 0, 0, i4);
            }
        } else {
            LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_g2c_v2_finger_slide_up", "layout"), this);
            this.m0 = h.a(getContext(), 178.0f);
            int iA = h.a(getContext(), 192.0f);
            this.u0 = iA;
            setPadding(0, 0, 0, iA);
        }
        this.o0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_item_finger", "id"));
        this.n0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_item_point", "id"));
        startAnim();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void b() {
        super.b();
        AnimatorSet animatorSet = this.p0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void c() {
        super.c();
        AnimatorSet animatorSet = this.p0;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (a(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight > 0) {
            this.v0 = measuredHeight - this.u0;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        ObjectAnimator objectAnimator = this.q0;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.q0.cancel();
        }
        ObjectAnimator objectAnimator2 = this.r0;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            this.r0.cancel();
        }
        AnimatorSet animatorSet = this.p0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.p0.cancel();
            this.p0 = null;
        }
    }

    public void startAnim() {
        if (this.p0 == null) {
            ImageView imageView = this.o0;
            float f = -this.m0;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationY", 0.0f, f, f);
            this.q0 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(com.smartdigimkt.o1.b.C0);
            this.q0.setRepeatCount(-1);
            ImageView imageView2 = this.n0;
            float f2 = -this.m0;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView2, "translationY", 0.0f, f2, f2);
            this.r0 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(com.smartdigimkt.o1.b.C0);
            this.r0.setRepeatCount(-1);
            AnimatorSet animatorSet = new AnimatorSet();
            this.p0 = animatorSet;
            animatorSet.playTogether(this.q0, this.r0);
            this.p0.start();
        }
    }

    public void updateIsEmptyHalfInterLayout() {
        this.u0 = h.a(getContext(), 80.0f);
    }

    public FingerSlideUpG2CV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public FingerSlideUpG2CV2View(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    private boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (motionEvent.getY() > this.v0) {
                return false;
            }
            this.s0 = motionEvent.getY();
            return true;
        }
        if (action == 1) {
            if (this.t0 <= this.l0) {
                return false;
            }
            c.a aVar = this.i0;
            if (aVar != null) {
                aVar.a(11, 48);
            }
            return true;
        }
        if (action != 2) {
            return false;
        }
        this.t0 = Math.abs(motionEvent.getY() - this.s0) + this.t0;
        this.s0 = motionEvent.getY();
        return false;
    }
}
