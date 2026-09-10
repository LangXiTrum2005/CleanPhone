package com.bytedance.adsdk.ugeno.jbs.di;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.ka;
import com.bytedance.adsdk.ugeno.ri.mj;
import com.bytedance.adsdk.ugeno.ri.xha;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends TextView implements IAnimation, xha {
    private float di;
    private float fi;
    private mj ik;
    private float ka;
    private float lr;
    private ka ri;
    private float xha;

    public ri(Context context) {
        super(context);
        this.ka = -1.0f;
        this.di = 1.0f;
        this.xha = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ik = new mj(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.lr(canvas);
        }
    }

    public float getBorderRadius() {
        return this.ik.ri();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.ri.xha
    public float getRipple() {
        return this.lr;
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getRubIn() {
        return this.ik.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getShine() {
        return this.ik.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getStretch() {
        return this.ik.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.xha();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.mj();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.ri(canvas, this);
            this.ri.ri(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.ri(i, i2, i3, i4);
        }
        if (z && this.ka > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ri(((i3 - i) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i4 - i2) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        ka kaVar = this.ri;
        if (kaVar == null) {
            super.onMeasure(i, i2);
        } else {
            int[] iArrRi = kaVar.ri(i, i2);
            super.onMeasure(iArrRi[0], iArrRi[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.lr(i, i2, i3, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void ri(ka kaVar) {
        this.ri = kaVar;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.ik.ri(i);
    }

    public void setBorderRadius(float f) {
        mj mjVar = this.ik;
        if (mjVar != null) {
            mjVar.ri(f);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.di = f2;
        this.xha = f;
    }

    public void setMinTextSize(float f) {
        this.ka = f;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.lr = f;
        mj mjVar = this.ik;
        if (mjVar != null) {
            mjVar.lr(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        mj mjVar = this.ik;
        if (mjVar != null) {
            mjVar.fi(f);
        }
    }

    public void setShine(float f) {
        mj mjVar = this.ik;
        if (mjVar != null) {
            mjVar.ik(f);
        }
    }

    public void setStretch(float f) {
        mj mjVar = this.ik;
        if (mjVar != null) {
            mjVar.ka(f);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        this.fi = getTextSize();
    }

    private void ri(int i, int i2) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i2 <= 0 || i <= 0 || this.fi == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        TextPaint paint = getPaint();
        float fMax = this.fi;
        int iRi = ri(text, paint, i, fMax);
        while (iRi > i2 && fMax > this.ka) {
            fMax = Math.max(fMax - 1.0f, this.ka);
            iRi = ri(text, paint, i, fMax);
        }
        "resizeText: targetSize: ".concat(String.valueOf(fMax));
        setTextSize(0, fMax);
        setLineSpacing(this.xha, this.di);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.fi = getTextSize();
    }

    private int ri(CharSequence charSequence, TextPaint textPaint, int i, float f) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f);
        return new StaticLayout(charSequence, textPaint2, i, Layout.Alignment.ALIGN_NORMAL, this.di, this.xha, true).getHeight();
    }
}
