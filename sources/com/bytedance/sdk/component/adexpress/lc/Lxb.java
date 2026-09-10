package com.bytedance.sdk.component.adexpress.lc;

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
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends TextSwitcher implements ViewSwitcher.ViewFactory, com.bytedance.sdk.component.utils.aH.Lxb {
    private int JVA;
    private Context JXs;
    private List<String> LD;
    Animation.AnimationListener Lxb;
    private int NXR;
    private int OY;
    private float QAg;
    private Handler STP;
    private final int ZU;
    private int ebl;
    private TextView lc;
    private int lk;
    private int nBu;
    private int sLN;

    public Lxb(Context context, int i, float f, int i2, int i3) {
        super(context);
        this.LD = new ArrayList();
        this.lk = 0;
        this.ZU = 1;
        this.STP = new com.bytedance.sdk.component.utils.aH(Looper.getMainLooper(), this);
        this.Lxb = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.lc.Lxb.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (Lxb.this.lc != null) {
                    Lxb.this.lc.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.JXs = context;
        this.OY = i;
        this.QAg = f;
        this.nBu = i2;
        this.NXR = i3;
        lk();
    }

    private void lk() {
        setFactory(this);
    }

    public void LD() {
        List<String> list = this.LD;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i = this.lk;
        this.lk = i + 1;
        this.JVA = i;
        setText(this.LD.get(i));
        if (this.lk > this.LD.size() - 1) {
            this.lk = 0;
        }
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.lc = textView;
        textView.setTextColor(this.OY);
        this.lc.setTextSize(this.QAg);
        this.lc.setMaxLines(this.nBu);
        this.lc.setTextAlignment(this.NXR);
        return this.lc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.STP.sendEmptyMessageDelayed(1, this.ebl);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.STP.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.JXs.JVA.LD(this.LD.get(this.JVA), this.QAg, false)[0], 1073741824), i);
        } catch (Exception unused) {
            super.onMeasure(i, i2);
        }
    }

    public void setAnimationDuration(int i) {
        this.ebl = i;
    }

    public void setAnimationText(List<String> list) {
        this.LD = list;
    }

    public void setAnimationType(int i) {
        this.sLN = i;
    }

    public void setMaxLines(int i) {
        this.nBu = i;
    }

    public void setTextColor(int i) {
        this.OY = i;
    }

    public void setTextSize(float f) {
        this.QAg = f;
    }

    public void Lxb() {
        int i = this.sLN;
        if (i == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.tD.QAg(this.JXs, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.tD.QAg(this.JXs, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.tD.QAg(this.JXs, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.tD.QAg(this.JXs, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.Lxb);
            getOutAnimation().setAnimationListener(this.Lxb);
        }
        this.STP.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        if (message.what != 1) {
            return;
        }
        LD();
        this.STP.sendEmptyMessageDelayed(1, this.ebl);
    }
}
