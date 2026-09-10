package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.moo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseEndCardView extends RelativeLayout {
    protected ooo m;
    public o mListener;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected oom f41835n;
    protected String o;
    protected oon o0;
    private boolean oo;

    public interface m extends o {
        void n();
    }

    public interface o {
        void m();

        void o();
    }

    public BaseEndCardView(Context context, ooo oooVar, oom oomVar) {
        super(context);
        this.o = getClass().getSimpleName();
        super.setWillNotDraw(false);
        this.m = oooVar;
        this.f41835n = oomVar;
        this.o0 = oomVar.oo0;
    }

    private static RectF o(int i2, int i3) {
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

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Canvas canvas2;
        try {
            if (this.oo) {
                canvas2 = canvas;
                try {
                    int iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
                    super.draw(canvas2);
                    int width = getWidth();
                    int height = getHeight();
                    int width2 = getWidth();
                    int height2 = getHeight();
                    int i2 = width2 / 2;
                    float f = height2;
                    int i3 = (int) (1.0f * f);
                    RectF rectF = new RectF();
                    rectF.left = i2 - i3;
                    rectF.top = height2 - (i3 * 2);
                    rectF.right = i2 + i3;
                    rectF.bottom = f;
                    moo.o(canvas2, width, height, rectF);
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

    public Drawable m() {
        return null;
    }

    public abstract void o();

    public void setNeedArc(boolean z2) {
        this.oo = z2;
        postInvalidate();
    }
}
