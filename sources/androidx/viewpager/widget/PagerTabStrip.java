package androidx.viewpager.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {
    public int h0;
    public boolean i0;
    public boolean j0;
    public float k0;
    public float l0;

    /* JADX INFO: renamed from: androidx.viewpager.widget.PagerTabStrip$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.PagerTabStrip$2, reason: invalid class name */
    class AnonymousClass2 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void b(float f) {
        getHeight();
        throw null;
    }

    public boolean getDrawFullUnderline() {
        return this.i0;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), 0);
    }

    public int getTabIndicatorColor() {
        return this.h0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getHeight();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.j0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.k0 = x;
            this.l0 = y;
            this.j0 = false;
            return true;
        }
        if (action == 1) {
            throw null;
        }
        if (action == 2) {
            float f = 0;
            if (Math.abs(x - this.k0) > f || Math.abs(y - this.l0) > f) {
                this.j0 = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        super.setBackgroundColor(i2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
    }

    public void setDrawFullUnderline(boolean z2) {
        this.i0 = z2;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        if (i5 < 0) {
            i5 = 0;
        }
        super.setPadding(i2, i3, i4, i5);
    }

    public void setTabIndicatorColor(int i2) {
        this.h0 = i2;
        throw null;
    }

    public void setTabIndicatorColorResource(int i2) {
        setTabIndicatorColor(ContextCompat.getColor(getContext(), i2));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        super.setTextSpacing(i2);
    }
}
