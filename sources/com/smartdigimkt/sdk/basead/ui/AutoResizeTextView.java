package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public class AutoResizeTextView extends TextView {
    private static final int j0 = 1000;
    private static final int k0 = 5;
    private TextPaint e0;
    private float f0;
    private float g0;
    private boolean h0;
    private boolean i0;

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f0 = 1.0f;
        this.g0 = 0.0f;
        this.h0 = false;
        this.i0 = false;
        b();
    }

    private void a() {
        CharSequence text = getText();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width == 0 || height == 0 || TextUtils.isEmpty(text)) {
            return;
        }
        this.i0 = true;
        int textSize = (int) getTextSize();
        while (textSize >= 5) {
            this.e0.setTextSize(textSize);
            int iMeasureText = (int) this.e0.measureText(text, 0, text.length());
            int iA = a(text, width);
            if (iMeasureText < width && iA < height) {
                break;
            } else {
                textSize--;
            }
        }
        setTextSize(0, textSize);
        this.i0 = false;
        this.h0 = false;
        invalidate();
    }

    private void b() {
        this.e0 = new TextPaint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.i0) {
            return;
        }
        if (this.h0) {
            a();
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.h0 = true;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        this.h0 = true;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.f0 = f2;
        this.g0 = f;
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f0 = 1.0f;
        this.g0 = 0.0f;
        this.h0 = false;
        this.i0 = false;
        b();
    }

    public AutoResizeTextView(Context context) {
        super(context);
        this.f0 = 1.0f;
        this.g0 = 0.0f;
        this.h0 = false;
        this.i0 = false;
        b();
    }

    private int a(CharSequence charSequence, int i2) {
        return new StaticLayout(charSequence, this.e0, i2, Layout.Alignment.ALIGN_NORMAL, this.f0, this.g0, true).getHeight();
    }
}
