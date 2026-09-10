package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import com.smartdigimkt.j7.c;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseEndCardView extends RelativeLayout {
    protected String e0;
    protected f f0;
    protected com.smartdigimkt.v6.a g0;
    protected g h0;
    private boolean i0;
    public a mListener;

    public interface a {
        void a(int i2);

        void b();
    }

    public interface b extends a {
        void a();
    }

    public BaseEndCardView(Context context, f fVar, com.smartdigimkt.v6.a aVar) {
        super(context);
        this.e0 = getClass().getSimpleName();
        super.setWillNotDraw(false);
        this.f0 = fVar;
        this.g0 = aVar;
        this.h0 = aVar.t;
    }

    private RectF a(int i2, int i3) {
        int i4 = i2 / 2;
        float f = i3;
        int i5 = (int) (1.0f * f);
        RectF rectF = new RectF();
        rectF.left = i4 - i5;
        rectF.top = i3 - (i5 * 2);
        rectF.right = i4 + i5;
        rectF.bottom = f;
        return rectF;
    }

    public abstract void a();

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Canvas canvas2;
        try {
            if (this.i0) {
                canvas2 = canvas;
                try {
                    int iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                    super.draw(canvas2);
                    c.a(canvas2, getWidth(), getHeight(), a(getWidth(), getHeight()));
                    canvas2.restoreToCount(iSaveLayer);
                    return;
                } catch (Exception unused) {
                }
            } else {
                canvas2 = canvas;
            }
        } catch (Exception unused2) {
        }
        super.draw(canvas2);
    }

    public Drawable getBgDrawable() {
        return null;
    }

    public void setNeedArc(boolean z2) {
        this.i0 = z2;
        postInvalidate();
    }
}
