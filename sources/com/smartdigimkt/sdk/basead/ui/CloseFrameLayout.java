package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.smartdigimkt.j7.c;
import com.smartdigimkt.l5.b;

/* JADX INFO: loaded from: classes6.dex */
public class CloseFrameLayout extends FrameLayout implements b {
    private static final String h0 = "CloseFrameLayout";
    private float e0;
    private Rect f0;
    private float g0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloseFrameLayout.this.f0 = new Rect();
            CloseFrameLayout closeFrameLayout = CloseFrameLayout.this;
            closeFrameLayout.getHitRect(closeFrameLayout.f0);
            int iWidth = ((int) ((CloseFrameLayout.this.e0 - 1.0f) * CloseFrameLayout.this.f0.width())) / 2;
            int iHeight = ((int) ((CloseFrameLayout.this.e0 - 1.0f) * CloseFrameLayout.this.f0.height())) / 2;
            CloseFrameLayout.this.f0.top -= iHeight;
            CloseFrameLayout.this.f0.bottom += iHeight;
            CloseFrameLayout.this.f0.left -= iWidth;
            CloseFrameLayout.this.f0.right += iWidth;
        }
    }

    public CloseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = 1.0f;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        float f = this.e0;
        if (f > 1.0f) {
            c.a(this, f);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        Rect rect;
        if (this.e0 >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || (rect = this.f0) == null || rect.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.smartdigimkt.l5.b
    public void setClickAreaScaleFactor(float f) {
        this.e0 = f;
        if (f <= 0.0f) {
            this.e0 = 1.0f;
        }
        float f2 = this.e0;
        if (f2 < 1.0f) {
            post(new a());
        } else if (f2 > 1.0f) {
            c.a(this, f2);
        }
    }

    @Override // com.smartdigimkt.l5.b
    public void setClickViewAlpha(double d) {
        if (this.g0 < 1.0f && d >= 0.0d && d <= 1.0d) {
            float f = (float) d;
            try {
                this.g0 = f;
                setAlpha(f);
            } catch (Throwable unused) {
            }
        }
    }
}
