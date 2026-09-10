package com.bytedance.sdk.component.adexpress.lc;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class JVA extends FrameLayout {
    private final ImageView LD;
    private final TextView Lxb;
    private final RotateAnimation ZU;
    private final sLN lk;

    public JVA(@NonNull Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.lk.Lxb.ZU(context));
        this.Lxb = (TextView) findViewById(2097610742);
        this.LD = (ImageView) findViewById(2097610745);
        this.lk = (sLN) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.ZU = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lc.JVA.1
            @Override // java.lang.Runnable
            public void run() {
                JVA.this.LD.startAnimation(JVA.this.ZU);
                JVA.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lc.JVA.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        JVA.this.lk.Lxb(4);
                    }
                }, 100L);
                JVA.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lc.JVA.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        JVA.this.lk.Lxb(4);
                    }
                }, 300L);
                JVA jva = JVA.this;
                jva.postDelayed(jva.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.Lxb;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void LD() {
        this.ZU.cancel();
    }

    public void Lxb() {
        postDelayed(getHaloAnimation(), 300L);
    }
}
