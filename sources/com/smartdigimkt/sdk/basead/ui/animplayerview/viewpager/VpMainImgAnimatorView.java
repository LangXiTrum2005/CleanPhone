package com.smartdigimkt.sdk.basead.ui.animplayerview.viewpager;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.WrapRoundImageView;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class VpMainImgAnimatorView extends RelativeLayout implements com.smartdigimkt.o5.c {
    private static final String p0 = "VpMainImgView";
    private static final int q0 = 100;
    private static final int r0 = 1500;
    private static final int s0 = 500;
    private static final int t0 = 8;
    private WrapRoundImageView e0;
    private WrapRoundImageView f0;
    private CircleIndicatorView g0;
    private CircleIndicatorView h0;
    private int i0;
    private float j0;
    private float k0;
    private final Handler l0;
    private ObjectAnimator m0;
    private ObjectAnimator n0;
    private AnimatorSet o0;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 100) {
                VpMainImgAnimatorView.this.d();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VpMainImgAnimatorView.this.b();
        }
    }

    public class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VpMainImgAnimatorView.this.c();
            if (VpMainImgAnimatorView.this.l0 != null) {
                VpMainImgAnimatorView.this.l0.removeMessages(100);
                VpMainImgAnimatorView.this.l0.sendEmptyMessageDelayed(100, 1500L);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class d implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f38474a;

        public d(View view) {
            this.f38474a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f38474a;
            if (view == null || view.getTranslationX() >= 0.0f) {
                return;
            }
            this.f38474a.setTranslationX(VpMainImgAnimatorView.this.k0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public VpMainImgAnimatorView(Context context) {
        this(context, null);
    }

    @Override // com.smartdigimkt.o5.c
    public void addMainView(Bitmap bitmap, WrapRoundImageView... wrapRoundImageViewArr) {
        if (wrapRoundImageViewArr == null || bitmap == null || wrapRoundImageViewArr.length < 2) {
            return;
        }
        removeAllViews();
        this.e0 = wrapRoundImageViewArr[0];
        this.f0 = wrapRoundImageViewArr[1];
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        layoutParams2.addRule(13);
        this.e0.setLayoutParams(layoutParams);
        this.f0.setLayoutParams(layoutParams2);
        addView(this.e0);
        addView(this.f0);
        int i2 = getContext().getResources().getDisplayMetrics().widthPixels;
        int i3 = getContext().getResources().getDisplayMetrics().heightPixels;
        this.e0.setBitmapAndResize(bitmap, i2, i3);
        this.f0.setBitmapAndResize(bitmap, i2, i3);
        ViewGroup.LayoutParams layoutParams3 = this.e0.getLayoutParams();
        this.i0 = layoutParams3.width;
        int i4 = layoutParams3.height;
        ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
        layoutParams4.width = this.i0;
        layoutParams4.height = i4;
        setLayoutParams(layoutParams4);
        float translationX = this.e0.getTranslationX();
        this.j0 = translationX;
        float f = translationX + this.i0;
        this.k0 = f;
        this.f0.setTranslationX(f);
        a();
    }

    @Override // com.smartdigimkt.o5.b
    public void pause() {
        AnimatorSet animatorSet = this.o0;
        if (animatorSet != null) {
            animatorSet.pause();
        }
    }

    @Override // com.smartdigimkt.o5.c
    public void release() {
        stop();
    }

    @Override // com.smartdigimkt.o5.b
    public void resume() {
        AnimatorSet animatorSet = this.o0;
        if (animatorSet != null) {
            animatorSet.resume();
            return;
        }
        Handler handler = this.l0;
        if (handler != null) {
            handler.removeMessages(100);
            this.l0.sendEmptyMessageDelayed(100, 1500L);
        }
    }

    @Override // com.smartdigimkt.o5.b
    public void setBitmapResources(List<Bitmap> list) {
    }

    @Override // com.smartdigimkt.o5.b
    public void start() {
        if (this.o0 != null) {
            resume();
            return;
        }
        Handler handler = this.l0;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(100, 1500L);
        }
    }

    @Override // com.smartdigimkt.o5.b
    public void stop() {
        Handler handler = this.l0;
        if (handler != null) {
            handler.removeMessages(100);
        }
        ObjectAnimator objectAnimator = this.m0;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.m0 = null;
        }
        ObjectAnimator objectAnimator2 = this.n0;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            this.n0 = null;
        }
        AnimatorSet animatorSet = this.o0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.o0.cancel();
            this.o0 = null;
        }
    }

    public VpMainImgAnimatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        this.g0 = new CircleIndicatorView(getContext());
        this.h0 = new CircleIndicatorView(getContext());
        int iA = h.a(getContext(), 8.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iA, iA);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iA, iA);
        layoutParams2.leftMargin = h.a(getContext(), 4.0f);
        linearLayout.addView(this.g0, layoutParams);
        linearLayout.addView(this.h0, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(12);
        layoutParams3.addRule(14);
        layoutParams3.bottomMargin = h.a(getContext(), 3.0f);
        addView(linearLayout, layoutParams3);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        float[] fArrA = a(this.e0);
        float[] fArrA2 = a(this.f0);
        this.m0 = a(this.m0, this.e0, fArrA[0], fArrA[1]);
        this.n0 = a(this.n0, this.f0, fArrA2[0], fArrA2[1]);
        if (this.o0 == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.o0 = animatorSet;
            animatorSet.playTogether(this.m0, this.n0);
            this.o0.setDuration(500L);
            this.o0.setInterpolator(new AccelerateDecelerateInterpolator());
            this.o0.addListener(new c());
        }
        this.o0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        WrapRoundImageView wrapRoundImageView;
        if (this.g0 == null || this.h0 == null || (wrapRoundImageView = this.e0) == null) {
            return;
        }
        if (wrapRoundImageView.getTranslationX() == this.j0) {
            this.g0.setSelectStatus(true);
            this.h0.setSelectStatus(false);
        } else {
            this.g0.setSelectStatus(false);
            this.h0.setSelectStatus(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        WrapRoundImageView wrapRoundImageView = this.e0;
        if (wrapRoundImageView == null || this.f0 == null) {
            return;
        }
        if (this.i0 == 0) {
            wrapRoundImageView.post(new b());
        } else {
            b();
        }
    }

    public VpMainImgAnimatorView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l0 = new a(Looper.getMainLooper());
    }

    private float[] a(View view) {
        float translationX = view.getTranslationX();
        float f = this.j0;
        if (translationX != f) {
            f = this.k0;
        }
        float translationX2 = view.getTranslationX();
        float f2 = this.j0;
        if (translationX2 == f2) {
            f2 = -this.k0;
        }
        return new float[]{f, f2};
    }

    private ObjectAnimator a(ObjectAnimator objectAnimator, View view, float f, float f2) {
        if (objectAnimator == null) {
            objectAnimator = new ObjectAnimator();
            objectAnimator.setPropertyName("translationX");
            objectAnimator.addListener(new d(view));
        }
        objectAnimator.setTarget(view);
        objectAnimator.setFloatValues(f, f2);
        return objectAnimator;
    }
}
