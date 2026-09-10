package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.koa;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends TextSwitcher implements ViewSwitcher.ViewFactory, koa.qdl {
    private int exu;
    private int fs;
    private int jpc;
    private int lnr;
    private final int mml;
    private TextView mo;
    private Context mzz;
    Animation.AnimationListener qdl;
    private Handler rdp;
    private int rq;
    private int to;
    private float tvp;
    private List<String> ud;
    private int wd;

    public qdl(Context context, int i2, float f, int i3, int i4) {
        super(context);
        this.ud = new ArrayList();
        this.lnr = 0;
        this.mml = 1;
        this.rdp = new koa(Looper.getMainLooper(), this);
        this.qdl = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.mo.qdl.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (qdl.this.mo != null) {
                    qdl.this.mo.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.mzz = context;
        this.jpc = i2;
        this.tvp = f;
        this.to = i3;
        this.exu = i4;
        lnr();
    }

    private void lnr() {
        setFactory(this);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.mo = textView;
        textView.setTextColor(this.jpc);
        this.mo.setTextSize(this.tvp);
        this.mo.setMaxLines(this.to);
        this.mo.setTextAlignment(this.exu);
        return this.mo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.rdp.sendEmptyMessageDelayed(1, this.wd);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.rdp.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.mzz.rq.ud(this.ud.get(this.rq), this.tvp, false)[0], 1073741824), i2);
        } catch (Exception unused) {
            super.onMeasure(i2, i3);
        }
    }

    public void setAnimationDuration(int i2) {
        this.wd = i2;
    }

    public void setAnimationText(List<String> list) {
        this.ud = list;
    }

    public void setAnimationType(int i2) {
        this.fs = i2;
    }

    public void setMaxLines(int i2) {
        this.to = i2;
    }

    public void setTextColor(int i2) {
        this.jpc = i2;
    }

    public void setTextSize(float f) {
        this.tvp = f;
    }

    public void ud() {
        List<String> list = this.ud;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i2 = this.lnr;
        this.lnr = i2 + 1;
        this.rq = i2;
        setText(this.ud.get(i2));
        if (this.lnr > this.ud.size() - 1) {
            this.lnr = 0;
        }
    }

    public void qdl() {
        int i2 = this.fs;
        if (i2 == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.ljh.tvp(this.mzz, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.ljh.tvp(this.mzz, "tt_text_animation_y_out"));
        } else if (i2 == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.ljh.tvp(this.mzz, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.ljh.tvp(this.mzz, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.qdl);
            getOutAnimation().setAnimationListener(this.qdl);
        }
        this.rdp.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.koa.qdl
    public void qdl(Message message) {
        if (message.what != 1) {
            return;
        }
        ud();
        this.rdp.sendEmptyMessageDelayed(1, this.wd);
    }
}
