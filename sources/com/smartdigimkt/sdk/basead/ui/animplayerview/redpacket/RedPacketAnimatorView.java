package com.smartdigimkt.sdk.basead.ui.animplayerview.redpacket;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.smartdigimkt.o5.b;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class RedPacketAnimatorView extends FrameLayout implements b, Handler.Callback {
    private final int e0;
    private final int f0;
    private RedPacketView g0;
    private ObjectAnimator h0;
    private Bitmap i0;
    private boolean j0;
    private boolean k0;
    private int l0;
    private Handler m0;

    public class a extends com.smartdigimkt.o5.a {
        public a() {
        }

        @Override // com.smartdigimkt.o5.a, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (RedPacketAnimatorView.this.m0 != null) {
                RedPacketAnimatorView.this.m0.removeMessages(100);
                RedPacketAnimatorView.this.m0.sendEmptyMessageDelayed(100, 500L);
            }
        }
    }

    public RedPacketAnimatorView(Context context) {
        this(context, null);
    }

    private ViewGroup.LayoutParams getRedPacketViewLayoutParams() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 100) {
            return false;
        }
        a();
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.l0 = getMeasuredHeight();
    }

    @Override // com.smartdigimkt.o5.b
    public void pause() {
        Handler handler = this.m0;
        if (handler != null) {
            handler.removeMessages(100);
        }
        ObjectAnimator objectAnimator = this.h0;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
    }

    public void release() {
        if (this.k0) {
            return;
        }
        stop();
        RedPacketView redPacketView = this.g0;
        if (redPacketView != null) {
            redPacketView.release();
        }
        this.k0 = true;
    }

    @Override // com.smartdigimkt.o5.b
    public void resume() {
        ObjectAnimator objectAnimator = this.h0;
        if (objectAnimator != null) {
            if (objectAnimator.isPaused()) {
                this.h0.resume();
            } else {
                a();
            }
        }
    }

    @Override // com.smartdigimkt.o5.b
    public void setBitmapResources(List<Bitmap> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.i0 = list.get(0);
    }

    @Override // com.smartdigimkt.o5.b
    public void start() {
        if (this.j0) {
            resume();
            return;
        }
        Handler handler = this.m0;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(100, 500L);
        }
    }

    @Override // com.smartdigimkt.o5.b
    public void stop() {
        RedPacketView redPacketView = this.g0;
        if (redPacketView != null) {
            redPacketView.setTranslationY(-this.l0);
        }
        ObjectAnimator objectAnimator = this.h0;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.h0.cancel();
            this.h0 = null;
        }
        Handler handler = this.m0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.j0 = false;
    }

    public RedPacketAnimatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        RedPacketView redPacketView = this.g0;
        if (redPacketView == null) {
            return;
        }
        redPacketView.setTranslationY(-this.l0);
        if (this.h0 == null) {
            this.g0.setVisibility(0);
            this.g0.initRedPacketList(this.i0);
            RedPacketView redPacketView2 = this.g0;
            int i2 = this.l0;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(redPacketView2, "translationY", -i2, i2);
            this.h0 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.addListener(new a());
            this.h0.setRepeatCount(0);
            this.h0.setDuration(4000L);
            this.h0.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator = this.h0;
        if (objectAnimator != null && !objectAnimator.isStarted()) {
            this.h0.start();
        }
        this.j0 = true;
        this.k0 = false;
    }

    public RedPacketAnimatorView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = 4000;
        this.f0 = 100;
        this.j0 = false;
        this.k0 = false;
        this.m0 = new Handler(Looper.getMainLooper(), this);
        setClipChildren(false);
        RedPacketView redPacketView = new RedPacketView(getContext());
        this.g0 = redPacketView;
        addView(redPacketView, getRedPacketViewLayoutParams());
        this.g0.setVisibility(4);
    }
}
