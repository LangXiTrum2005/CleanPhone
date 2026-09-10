package com.bytedance.sdk.openadsdk.ik;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends com.bytedance.sdk.openadsdk.core.di.mj {
    private boolean ik;
    private int ka;
    private float lr;
    private Paint ri;

    public ri(Context context) {
        super(context);
        ri();
    }

    private void ri() {
        this.lr = qd.ri(getContext(), 8.0f);
        this.ri = new Paint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ri(getText().toString(), getWidth());
    }

    @Override // com.bytedance.sdk.openadsdk.core.di.mj, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.ka = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.ka);
        } else {
            layoutParams.height = this.ka;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.di.mj, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i = this.ka;
        if (i == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i;
    }

    public void setMinTextSize(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.lr = f;
    }

    private void ri(String str, int i) {
        if (!this.ik && i > 0) {
            float textSize = getTextSize();
            this.ri.set(getPaint());
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float fRi = ri(textSize, str);
            while (fRi > paddingLeft) {
                textSize -= 1.0f;
                this.ri.setTextSize(textSize);
                if (textSize <= this.lr) {
                    break;
                } else {
                    fRi = ri(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.ik = true;
        }
    }

    private float ri(float f, String str) {
        this.ri.setTextSize(f);
        return this.ri.measureText(str);
    }
}
