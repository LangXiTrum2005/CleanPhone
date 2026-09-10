package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.thinkup.core.common.ooo.moo;

/* JADX INFO: loaded from: classes6.dex */
public class CloseImageView extends ImageView implements o {
    private float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Rect f41842n;
    private final String o;
    private float o0;

    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = getClass().getSimpleName();
        this.m = 1.0f;
    }

    @Override // android.view.View
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
        if (this.m >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || (rect = this.f41842n) == null || rect.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
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
            post(new Runnable() { // from class: com.thinkup.core.common.inner.ui.CloseImageView.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseImageView.this.f41842n = new Rect();
                    CloseImageView closeImageView = CloseImageView.this;
                    closeImageView.getHitRect(closeImageView.f41842n);
                    int iWidth = ((int) ((CloseImageView.this.m - 1.0f) * CloseImageView.this.f41842n.width())) / 2;
                    int iHeight = ((int) ((CloseImageView.this.m - 1.0f) * CloseImageView.this.f41842n.height())) / 2;
                    CloseImageView.this.f41842n.top -= iHeight;
                    CloseImageView.this.f41842n.bottom += iHeight;
                    CloseImageView.this.f41842n.left -= iWidth;
                    CloseImageView.this.f41842n.right += iWidth;
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
