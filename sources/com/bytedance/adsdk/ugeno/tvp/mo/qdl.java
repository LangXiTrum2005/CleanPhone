package com.bytedance.adsdk.ugeno.tvp.mo;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.mml;
import com.bytedance.adsdk.ugeno.qdl.jpc;
import com.bytedance.adsdk.ugeno.qdl.wd;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends TextView implements IAnimation, wd {
    private jpc lnr;
    private float mml;
    private float mo;
    private float mzz;
    private mml qdl;
    private float ud;
    private float wd;

    public qdl(Context context) {
        super(context);
        this.mml = -1.0f;
        this.mo = 1.0f;
        this.wd = 0.0f;
        this.lnr = new jpc(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.ud(canvas);
        }
    }

    public float getBorderRadius() {
        return this.lnr.qdl();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.qdl.wd
    public float getRipple() {
        return this.ud;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getRubIn() {
        return this.lnr.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getShine() {
        return this.lnr.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getStretch() {
        return this.lnr.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.qdl(canvas, this);
            this.qdl.qdl(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.qdl(i2, i3, i4, i5);
        }
        if (z2 && this.mml > 0.0f) {
            qdl(((i4 - i2) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i5 - i3) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        mml mmlVar = this.qdl;
        if (mmlVar == null) {
            super.onMeasure(i2, i3);
        } else {
            int[] iArrQdl = mmlVar.qdl(i2, i3);
            super.onMeasure(iArrQdl[0], iArrQdl[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.ud(i2, i3, i4, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    public void qdl(mml mmlVar) {
        this.qdl = mmlVar;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        this.lnr.qdl(i2);
    }

    public void setBorderRadius(float f) {
        jpc jpcVar = this.lnr;
        if (jpcVar != null) {
            jpcVar.qdl(f);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.mo = f2;
        this.wd = f;
    }

    public void setMinTextSize(float f) {
        this.mml = f;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.ud = f;
        jpc jpcVar = this.lnr;
        if (jpcVar != null) {
            jpcVar.ud(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        jpc jpcVar = this.lnr;
        if (jpcVar != null) {
            jpcVar.mzz(f);
        }
    }

    public void setShine(float f) {
        jpc jpcVar = this.lnr;
        if (jpcVar != null) {
            jpcVar.lnr(f);
        }
    }

    public void setStretch(float f) {
        jpc jpcVar = this.lnr;
        if (jpcVar != null) {
            jpcVar.mml(f);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        this.mzz = getTextSize();
    }

    private void qdl(int i2, int i3) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i3 <= 0 || i2 <= 0 || this.mzz == 0.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float fMax = this.mzz;
        int iQdl = qdl(text, paint, i2, fMax);
        while (iQdl > i3 && fMax > this.mml) {
            Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.mml);
            fMax = Math.max(fMax - 1.0f, this.mml);
            iQdl = qdl(text, paint, i2, fMax);
        }
        Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
        setTextSize(0, fMax);
        setLineSpacing(this.wd, this.mo);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f) {
        super.setTextSize(i2, f);
        this.mzz = getTextSize();
    }

    private int qdl(CharSequence charSequence, TextPaint textPaint, int i2, float f) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f);
        return new StaticLayout(charSequence, textPaint2, i2, Layout.Alignment.ALIGN_NORMAL, this.mo, this.wd, true).getHeight();
    }
}
