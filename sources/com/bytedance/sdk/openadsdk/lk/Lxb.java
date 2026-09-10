package com.bytedance.sdk.openadsdk.lk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends com.bytedance.sdk.openadsdk.core.JXs.OY {
    private float LD;
    private Paint Lxb;
    private int ZU;
    private boolean lk;

    public Lxb(Context context) {
        super(context);
        Lxb();
    }

    private void Lxb() {
        this.LD = le.Lxb(getContext(), 8.0f);
        this.Lxb = new Paint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Lxb(getText().toString(), getWidth());
    }

    @Override // com.bytedance.sdk.openadsdk.core.JXs.OY, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.ZU = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.ZU);
        } else {
            layoutParams.height = this.ZU;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.JXs.OY, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i = this.ZU;
        if (i == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i;
    }

    public void setMinTextSize(float f) {
        if (f <= 0.0f) {
            return;
        }
        this.LD = f;
    }

    private void Lxb(String str, int i) {
        if (!this.lk && i > 0) {
            float textSize = getTextSize();
            this.Lxb.set(getPaint());
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float fLxb = Lxb(textSize, str);
            while (fLxb > paddingLeft) {
                textSize -= 1.0f;
                this.Lxb.setTextSize(textSize);
                if (textSize <= this.LD) {
                    break;
                } else {
                    fLxb = Lxb(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.lk = true;
        }
    }

    private float Lxb(float f, String str) {
        this.Lxb.setTextSize(f);
        return this.Lxb.measureText(str);
    }
}
