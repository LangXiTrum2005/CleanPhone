package com.bytedance.sdk.component.adexpress.di;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class sf extends FrameLayout {
    private final co ik;
    private final RotateAnimation ka;
    private final ImageView lr;
    private final TextView ri;

    public sf(Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.ik.ri.ka(context));
        this.ri = (TextView) findViewById(2097610742);
        this.lr = (ImageView) findViewById(2097610745);
        this.ik = (co) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30.0f, 1, 0.65f, 1, 0.9f);
        this.ka = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.sf.1
            @Override // java.lang.Runnable
            public void run() {
                sf.this.lr.startAnimation(sf.this.ka);
                sf.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.sf.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        sf.this.ik.ri(4);
                    }
                }, 100L);
                sf.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.sf.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        sf.this.ik.ri(4);
                    }
                }, 300L);
                sf sfVar = sf.this;
                sfVar.postDelayed(sfVar.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.ri;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void lr() {
        this.ka.cancel();
    }

    public void ri() {
        postDelayed(getHaloAnimation(), 300L);
    }
}
