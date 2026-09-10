package com.smartdigimkt.sdk.basead.ui.animplayerview.scale;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.smartdigimkt.sdk.basead.ui.WrapRoundImageView;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AlbumScaleMainView extends FrameLayout implements com.smartdigimkt.o5.b, Handler.Callback {
    public static final int MAIN_VIEW_INIT_HEIGHT = 42;
    public static final int MAIN_VIEW_INIT_WIDTH = 90;
    private final int e0;
    private final int f0;
    private RoundImageView g0;
    private WrapRoundImageView h0;
    private AlbumScaleMainView i0;
    private AnimatorSet j0;
    private AnimatorSet k0;
    private Handler l0;
    private long m0;

    public class a implements com.smartdigimkt.o8.b.InterfaceC0563b {
        public a() {
        }

        @Override // com.smartdigimkt.o8.b.InterfaceC0563b
        public void a() {
        }

        @Override // com.smartdigimkt.o8.b.InterfaceC0563b
        public void a(Bitmap bitmap) {
            AlbumScaleMainView.this.g0.setImageBitmap(bitmap);
        }
    }

    public class b implements Runnable {
        final /* synthetic */ Bitmap X;

        public b(Bitmap bitmap) {
            this.X = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlbumScaleMainView.this.h0.setBitmapAndResize(this.X, AlbumScaleMainView.this.getWidth(), AlbumScaleMainView.this.getHeight());
        }
    }

    public class c extends com.smartdigimkt.o5.a {
        public c() {
        }

        @Override // com.smartdigimkt.o5.a, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AlbumScaleMainView.this.l0.sendEmptyMessageDelayed(100, 500L);
        }
    }

    public class d extends com.smartdigimkt.o5.a {
        public d() {
        }

        @Override // com.smartdigimkt.o5.a, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (AlbumScaleMainView.this.l0 != null) {
                AlbumScaleMainView.this.l0.sendEmptyMessageDelayed(100, 500L);
            }
        }
    }

    public AlbumScaleMainView(Context context) {
        this(context, null);
    }

    public float getMainViewScale() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            return 1.0f;
        }
        return Math.min(getContext().getResources().getDisplayMetrics().widthPixels, getContext().getResources().getDisplayMetrics().heightPixels) / Math.min(layoutParams.width, layoutParams.height);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 100) {
            return false;
        }
        b();
        return false;
    }

    public void initView(Bitmap bitmap, boolean z2) {
        com.smartdigimkt.o8.b.a(getContext(), bitmap, new a());
        this.h0.post(new b(bitmap));
        if (z2) {
            AlbumScaleMainView albumScaleMainView = new AlbumScaleMainView(getContext());
            this.i0 = albumScaleMainView;
            albumScaleMainView.initView(bitmap, false);
            this.i0.setVisibility(4);
            addView(this.i0, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // com.smartdigimkt.o5.b
    public void pause() {
        AnimatorSet animatorSet = this.j0;
        if (animatorSet != null) {
            animatorSet.pause();
        }
    }

    public void release() {
        stop();
        removeAllViews();
    }

    @Override // com.smartdigimkt.o5.b
    public void resume() {
        AnimatorSet animatorSet = this.j0;
        if (animatorSet != null) {
            animatorSet.resume();
        }
    }

    @Override // com.smartdigimkt.o5.b
    public void setBitmapResources(List<Bitmap> list) {
    }

    public void setStartDelay(long j) {
        this.m0 = j;
    }

    @Override // com.smartdigimkt.o5.b
    public void start() {
        a();
    }

    @Override // com.smartdigimkt.o5.b
    public void stop() {
        AnimatorSet animatorSet = this.j0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.j0.cancel();
            this.j0 = null;
        }
        AnimatorSet animatorSet2 = this.k0;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
            this.k0.cancel();
            this.k0 = null;
        }
        Handler handler = this.l0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public AlbumScaleMainView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        float mainViewScale = getMainViewScale();
        if (mainViewScale == 1.0f) {
            return;
        }
        if (this.j0 == null) {
            this.j0 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, mainViewScale);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, mainViewScale);
            long j = this.m0;
            if (j > 0) {
                this.j0.setStartDelay(j);
            }
            this.j0.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            this.j0.setDuration(4000L);
            this.j0.setInterpolator(new AccelerateDecelerateInterpolator());
            this.j0.addListener(new c());
        }
        this.j0.start();
    }

    private void b() {
        AlbumScaleMainView albumScaleMainView = this.i0;
        if (albumScaleMainView == null) {
            return;
        }
        if (albumScaleMainView.getVisibility() != 0) {
            this.i0.setVisibility(0);
        }
        if (this.k0 == null) {
            this.k0 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.i0, "scaleX", 1.0f, 1.3f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.i0, "scaleY", 1.0f, 1.3f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.i0, "alpha", 0.4f, 0.0f);
            this.k0.setDuration(500L);
            this.k0.setInterpolator(new LinearInterpolator());
            this.k0.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            this.k0.addListener(new d());
        }
        AnimatorSet animatorSet = this.k0;
        if (animatorSet == null || animatorSet.isStarted()) {
            return;
        }
        this.k0.start();
    }

    public AlbumScaleMainView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = 100;
        this.f0 = 500;
        this.g0 = new RoundImageView(context);
        this.h0 = new WrapRoundImageView(context);
        RoundImageView roundImageView = this.g0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        roundImageView.setScaleType(scaleType);
        this.h0.setScaleType(scaleType);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        addView(this.g0, layoutParams);
        addView(this.h0, layoutParams2);
        this.l0 = new Handler(Looper.getMainLooper(), this);
    }
}
