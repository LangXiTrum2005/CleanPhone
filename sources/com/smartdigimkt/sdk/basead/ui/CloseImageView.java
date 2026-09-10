package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.smartdigimkt.j7.c;
import com.smartdigimkt.l5.b;

/* JADX INFO: loaded from: classes6.dex */
public class CloseImageView extends ImageView implements b {
    private final String e0;
    private float f0;
    private Rect g0;
    private float h0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloseImageView.this.g0 = new Rect();
            CloseImageView closeImageView = CloseImageView.this;
            closeImageView.getHitRect(closeImageView.g0);
            int iWidth = ((int) ((CloseImageView.this.f0 - 1.0f) * CloseImageView.this.g0.width())) / 2;
            int iHeight = ((int) ((CloseImageView.this.f0 - 1.0f) * CloseImageView.this.g0.height())) / 2;
            CloseImageView.this.g0.top -= iHeight;
            CloseImageView.this.g0.bottom += iHeight;
            CloseImageView.this.g0.left -= iWidth;
            CloseImageView.this.g0.right += iWidth;
        }
    }

    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = getClass().getSimpleName();
        this.f0 = 1.0f;
    }

    @Override // android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        float f = this.f0;
        if (f > 1.0f) {
            c.a(this, f);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        Rect rect;
        if (this.f0 >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || (rect = this.g0) == null || rect.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.smartdigimkt.l5.b
    public void setClickAreaScaleFactor(float f) {
        this.f0 = f;
        if (f <= 0.0f) {
            this.f0 = 1.0f;
        }
        float f2 = this.f0;
        if (f2 < 1.0f) {
            post(new a());
        } else if (f2 > 1.0f) {
            c.a(this, f2);
        }
    }

    @Override // com.smartdigimkt.l5.b
    public void setClickViewAlpha(double d) {
        if (this.h0 < 1.0f && d >= 0.0d && d <= 1.0d) {
            float f = (float) d;
            try {
                this.h0 = f;
                setAlpha(f);
            } catch (Throwable unused) {
            }
        }
    }
}
