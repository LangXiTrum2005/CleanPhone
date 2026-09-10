package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.thinkup.core.common.ooo.moo;

/* JADX INFO: loaded from: classes6.dex */
public class CloseFrameLayout extends FrameLayout implements o {
    private static final String o = "CloseFrameLayout";
    private float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Rect f41841n;
    private float o0;

    public CloseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = 1.0f;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        float f = this.m;
        if (f > 1.0f) {
            moo.o(this, f);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        Rect rect;
        if (this.m >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || (rect = this.f41841n) == null || rect.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.thinkup.core.common.inner.ui.o
    public void setClickAreaScaleFactor(float f) {
        this.m = f;
        if (f <= 0.0f) {
            this.m = 1.0f;
        }
        float f2 = this.m;
        if (f2 < 1.0f) {
            post(new Runnable() { // from class: com.thinkup.core.common.inner.ui.CloseFrameLayout.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseFrameLayout.this.f41841n = new Rect();
                    CloseFrameLayout closeFrameLayout = CloseFrameLayout.this;
                    closeFrameLayout.getHitRect(closeFrameLayout.f41841n);
                    int iWidth = ((int) ((CloseFrameLayout.this.m - 1.0f) * CloseFrameLayout.this.f41841n.width())) / 2;
                    int iHeight = ((int) ((CloseFrameLayout.this.m - 1.0f) * CloseFrameLayout.this.f41841n.height())) / 2;
                    CloseFrameLayout.this.f41841n.top -= iHeight;
                    CloseFrameLayout.this.f41841n.bottom += iHeight;
                    CloseFrameLayout.this.f41841n.left -= iWidth;
                    CloseFrameLayout.this.f41841n.right += iWidth;
                }
            });
        } else if (f2 > 1.0f) {
            moo.o(this, f2);
        }
    }

    @Override // com.thinkup.core.common.inner.ui.o
    public void setClickViewAlpha(double d) {
        if (this.o0 < 1.0f && d >= 0.0d && d <= 1.0d) {
            float f = (float) d;
            try {
                this.o0 = f;
                setAlpha(f);
            } catch (Throwable unused) {
            }
        }
    }
}
