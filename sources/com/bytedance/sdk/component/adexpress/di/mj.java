package com.bytedance.sdk.component.adexpress.di;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends ihz {
    private AnimatorSet di;
    private int fi;
    private ImageView ik;
    private ImageView ka;
    private ImageView lr;
    private TextView ri;

    public mj(Context context) {
        super(context);
        this.di = new AnimatorSet();
        lr(context);
    }

    private void ka() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    private void lr(Context context) {
        addView(com.bytedance.sdk.component.adexpress.ik.ri.lr(context));
        this.lr = (ImageView) findViewById(2097610751);
        this.ik = (ImageView) findViewById(2097610750);
        this.ka = (ImageView) findViewById(2097610749);
        this.ri = (TextView) findViewById(2097610748);
    }

    public float getAlphaColor() {
        return this.fi;
    }

    @Override // com.bytedance.sdk.component.adexpress.di.ihz
    public void ri(Context context) {
    }

    public void setAlphaColor(int i) {
        if (i < 0 || i > 60) {
            return;
        }
        int i2 = i + Opcodes.MONITOREXIT;
        ImageView imageView = this.ka;
        int iRgb = Color.rgb(i2, i2, i2);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i3 = ((i + 20) % 60) + Opcodes.MONITOREXIT;
        this.ik.setColorFilter(Color.rgb(i3, i3, i3), mode);
        int i4 = ((i + 40) % 60) + Opcodes.MONITOREXIT;
        this.lr.setColorFilter(Color.rgb(i4, i4, i4), mode);
    }

    public void setButtonText(String str) {
        if (this.ri == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.ri.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.di.ihz
    public void ri() {
        ka();
    }

    @Override // com.bytedance.sdk.component.adexpress.di.ihz
    public void lr() {
        this.di.cancel();
    }
}
