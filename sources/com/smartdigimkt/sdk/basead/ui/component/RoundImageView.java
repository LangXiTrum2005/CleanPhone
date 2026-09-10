package com.smartdigimkt.sdk.basead.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.smartdigimkt.j7.c;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.core.common.res.image.RecycleImageView;

/* JADX INFO: loaded from: classes6.dex */
public class RoundImageView extends RecycleImageView {
    int e0;
    boolean f0;

    public RoundImageView(Context context) {
        super(context);
        this.e0 = h.a(getContext(), 5.0f);
    }

    @Override // com.smartdigimkt.sdk.core.common.res.image.RecycleImageView, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        try {
            if (this.f0) {
                canvas2 = canvas;
                try {
                    int iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                    super.dispatchDraw(canvas2);
                    canvas2.translate(getPaddingLeft(), getPaddingTop());
                    c.a(canvas2, getWidth() - (getPaddingLeft() * 2), getHeight() - (getPaddingTop() * 2), this.e0);
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

    @Override // com.smartdigimkt.sdk.core.common.res.image.RecycleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        try {
            if (this.f0) {
                canvas2 = canvas;
                try {
                    int iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                    super.onDraw(canvas2);
                    canvas2.translate(getPaddingLeft(), getPaddingTop());
                    c.a(canvas2, getWidth() - (getPaddingLeft() * 2), getHeight() - (getPaddingTop() * 2), this.e0);
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
        this.f0 = z2;
    }

    public void setRadiusInDip(int i2) {
        this.e0 = h.a(getContext(), i2);
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = h.a(getContext(), 5.0f);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = h.a(getContext(), 5.0f);
    }
}
