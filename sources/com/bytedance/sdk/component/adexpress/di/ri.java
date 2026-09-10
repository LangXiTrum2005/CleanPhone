package com.bytedance.sdk.component.adexpress.di;

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
import com.bytedance.sdk.component.utils.igq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends TextSwitcher implements ViewSwitcher.ViewFactory, igq.ri {
    private int aw;
    private Handler bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private int f18034co;
    private TextView di;
    private Context fi;
    private int ik;
    private float jbs;
    private final int ka;
    private List<String> lr;
    private int mj;
    private int qt;
    Animation.AnimationListener ri;
    private int sf;
    private int xha;

    public ri(Context context, int i, float f, int i2, int i3) {
        super(context);
        this.lr = new ArrayList();
        this.ik = 0;
        this.ka = 1;
        this.bgr = new igq(Looper.getMainLooper(), this);
        this.ri = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.di.ri.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (ri.this.di != null) {
                    ri.this.di.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.fi = context;
        this.mj = i;
        this.jbs = f;
        this.qt = i2;
        this.aw = i3;
        ik();
    }

    private void ik() {
        setFactory(this);
    }

    public void lr() {
        List<String> list = this.lr;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i = this.ik;
        this.ik = i + 1;
        this.sf = i;
        setText(this.lr.get(i));
        if (this.ik > this.lr.size() - 1) {
            this.ik = 0;
        }
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.di = textView;
        textView.setTextColor(this.mj);
        this.di.setTextSize(this.jbs);
        this.di.setMaxLines(this.qt);
        this.di.setTextAlignment(this.aw);
        return this.di;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bgr.sendEmptyMessageDelayed(1, this.xha);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.bgr.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.fi.sf.lr(this.lr.get(this.sf), this.jbs, false)[0], 1073741824), i);
        } catch (Exception unused) {
            super.onMeasure(i, i2);
        }
    }

    public void setAnimationDuration(int i) {
        this.xha = i;
    }

    public void setAnimationText(List<String> list) {
        this.lr = list;
    }

    public void setAnimationType(int i) {
        this.f18034co = i;
    }

    public void setMaxLines(int i) {
        this.qt = i;
    }

    public void setTextColor(int i) {
        this.mj = i;
    }

    public void setTextSize(float f) {
        this.jbs = f;
    }

    public void ri() {
        int i = this.f18034co;
        if (i == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.uq.jbs(this.fi, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.uq.jbs(this.fi, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.uq.jbs(this.fi, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.uq.jbs(this.fi, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.ri);
            getOutAnimation().setAnimationListener(this.ri);
        }
        this.bgr.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        if (message.what != 1) {
            return;
        }
        lr();
        this.bgr.sendEmptyMessageDelayed(1, this.xha);
    }
}
