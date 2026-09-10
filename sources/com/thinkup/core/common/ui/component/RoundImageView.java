package com.thinkup.core.common.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.res.image.RecycleImageView;

/* JADX INFO: loaded from: classes6.dex */
public class RoundImageView extends RecycleImageView {
    boolean m;
    int o;

    public RoundImageView(Context context) {
        super(context);
        this.o = o00.o(getContext(), 5.0f);
    }

    @Override // com.thinkup.core.common.res.image.RecycleImageView, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        try {
            if (this.m) {
                canvas2 = canvas;
                try {
                    int iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                    super.dispatchDraw(canvas2);
                    canvas2.translate(getPaddingLeft(), getPaddingTop());
                    moo.o(canvas2, getWidth() - (getPaddingLeft() * 2), getHeight() - (getPaddingTop() * 2), this.o);
                    canvas2.restoreToCount(iSaveLayer);
                    return;
                } catch (Exception unused) {
                }
            } else {
                canvas2 = canvas;
            }
        } catch (Exception unused2) {
        }
        super.dispatchDraw(canvas2);
    }

    @Override // com.thinkup.core.common.res.image.RecycleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        try {
            if (this.m) {
                canvas2 = canvas;
                try {
                    int iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                    super.onDraw(canvas2);
                    canvas2.translate(getPaddingLeft(), getPaddingTop());
                    moo.o(canvas2, getWidth() - (getPaddingLeft() * 2), getHeight() - (getPaddingTop() * 2), this.o);
                    canvas2.restoreToCount(iSaveLayer);
                    return;
                } catch (Exception unused) {
                }
            } else {
                canvas2 = canvas;
            }
        } catch (Exception unused2) {
        }
        super.onDraw(canvas2);
    }

    public void setNeedRadiu(boolean z2) {
        this.m = z2;
    }

    public void setRadiusInDip(int i2) {
        this.o = o00.o(getContext(), i2);
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = o00.o(getContext(), 5.0f);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.o = o00.o(getContext(), 5.0f);
    }
}
