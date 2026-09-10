package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class rq extends FrameLayout {
    private final fs lnr;
    private final RotateAnimation mml;
    private final TextView qdl;
    private final ImageView ud;

    public rq(Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.lnr.qdl.mml(context));
        this.qdl = (TextView) findViewById(2097610742);
        this.ud = (ImageView) findViewById(2097610745);
        this.lnr = (fs) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.mml = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.mo.rq.1
            @Override // java.lang.Runnable
            public void run() {
                rq.this.ud.startAnimation(rq.this.mml);
                rq.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.mo.rq.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        rq.this.lnr.qdl(4);
                    }
                }, 100L);
                rq.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.mo.rq.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        rq.this.lnr.qdl(4);
                    }
                }, 300L);
                rq rqVar = rq.this;
                rqVar.postDelayed(rqVar.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.qdl;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void qdl() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void ud() {
        this.mml.cancel();
    }
}
