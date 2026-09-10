package com.smartdigimkt.sdk.basead.ui.improveclick.ambience;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class BubbleDropAnimView extends BaseAmbienceView {
    private final int f0;
    private BubbleDropChildView g0;
    private ObjectAnimator h0;
    private Bitmap i0;
    private int j0;
    boolean k0;
    boolean l0;
    private boolean m0;

    public class a implements BubbleDropChildView.a {
        public a() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.improveclick.ambience.BubbleDropChildView.a
        public void a() {
            com.smartdigimkt.w5.c.a aVar = BubbleDropAnimView.this.e0;
            if (aVar != null) {
                aVar.a(17, 49);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleDropAnimView bubbleDropAnimView = BubbleDropAnimView.this;
            bubbleDropAnimView.j0 = bubbleDropAnimView.g0.getMeasuredHeight();
            BubbleDropAnimView.this.a();
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
            BubbleDropAnimView.this.l0 = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public BubbleDropAnimView(Context context) {
        super(context);
        this.f0 = 4000;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.improveclick.ambience.BaseAmbienceView
    public void initSetting(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w5.c.a aVar2) {
        this.e0 = aVar2;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.improveclick.ambience.BaseAmbienceView
    public void initView() {
        RelativeLayout.LayoutParams layoutParams;
        BubbleDropChildView bubbleDropChildView = new BubbleDropChildView(getContext());
        this.g0 = bubbleDropChildView;
        bubbleDropChildView.initSetting(new a());
        Bitmap bitmapB = com.smartdigimkt.j5.a.a().b("am_bubble");
        this.i0 = bitmapB;
        if (bitmapB == null || bitmapB.isRecycled()) {
            release();
            return;
        }
        if (h.g(getContext())) {
            layoutParams = new RelativeLayout.LayoutParams(getContext().getResources().getDisplayMetrics().heightPixels, -1);
            layoutParams.addRule(13);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        addView(this.g0, layoutParams);
        this.g0.post(new b());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.improveclick.ambience.BaseAmbienceView
    public void onPause() {
        ObjectAnimator objectAnimator = this.h0;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.improveclick.ambience.BaseAmbienceView
    public void onResume() {
        ObjectAnimator objectAnimator = this.h0;
        if (objectAnimator != null) {
            if (objectAnimator.isPaused()) {
                this.h0.resume();
            } else {
                a();
            }
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.improveclick.ambience.BaseAmbienceView
    public void release() {
        if (this.m0) {
            return;
        }
        BubbleDropChildView bubbleDropChildView = this.g0;
        if (bubbleDropChildView != null) {
            bubbleDropChildView.release();
        }
        b();
        this.m0 = true;
    }

    private void b() {
        BubbleDropChildView bubbleDropChildView = this.g0;
        if (bubbleDropChildView != null) {
            bubbleDropChildView.setTranslationY(-this.j0);
        }
        ObjectAnimator objectAnimator = this.h0;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.h0.cancel();
            this.h0 = null;
        }
        this.k0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        BubbleDropChildView bubbleDropChildView = this.g0;
        if (bubbleDropChildView == null) {
            return;
        }
        if (this.h0 == null && !this.l0) {
            bubbleDropChildView.setVisibility(0);
            this.g0.initRedPacketList(this.i0);
            BubbleDropChildView bubbleDropChildView2 = this.g0;
            int i2 = this.j0;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(bubbleDropChildView2, "translationY", -i2, i2);
            this.h0 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setRepeatCount(0);
            this.h0.setDuration(4000L);
            this.h0.setInterpolator(new LinearInterpolator());
            this.h0.addListener(new c());
        }
        ObjectAnimator objectAnimator = this.h0;
        if (objectAnimator != null && !objectAnimator.isStarted() && !this.l0) {
            this.g0.setTranslationY(-this.j0);
            this.h0.start();
        }
        this.k0 = true;
        this.m0 = false;
    }

    public BubbleDropAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f0 = 4000;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
    }

    public BubbleDropAnimView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f0 = 4000;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
    }
}
