package com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public class TextSeekbar extends SeekBar {
    private Paint e0;
    String f0;
    private Paint g0;
    RectF h0;
    float i0;
    Paint.FontMetrics j0;

    public TextSeekbar(Context context) {
        super(context);
    }

    public void hideAll() {
        this.g0 = null;
        this.e0 = null;
        invalidate();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.h0 == null) {
            this.h0 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        Paint paint = this.g0;
        if (paint != null) {
            RectF rectF = this.h0;
            float f = this.i0;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
        Paint paint2 = this.e0;
        if (paint2 != null) {
            if (this.j0 == null) {
                this.j0 = paint2.getFontMetrics();
            }
            Paint.FontMetrics fontMetrics = this.j0;
            canvas.drawText(this.f0, getWidth() / 2, (int) (((getHeight() / 2) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)), this.e0);
        }
        super.onDraw(canvas);
    }

    public TextSeekbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextSeekbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Paint paint = new Paint();
        this.e0 = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        this.e0.setTextSize(h.a(context, 12.0f));
        this.e0.setAntiAlias(true);
        this.e0.setColor(Color.parseColor("#FFFFFF"));
        this.f0 = getContext().getString(h.a(b.p().k(), "myoffer_g2c_seek_to_click", k.f38992h));
        Paint paint2 = new Paint();
        this.g0 = paint2;
        paint2.setColor(Color.parseColor("#80000000"));
        this.i0 = h.a(getContext(), 12.0f);
    }
}
