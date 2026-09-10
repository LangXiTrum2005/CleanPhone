package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.storage.androidcleaner.R;
import p.a;
import p.k2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f3867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f3868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f3869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f3870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f3871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3874i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f43517a);
        boolean z10 = false;
        this.f3869d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f3870e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f3874i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f3872g = true;
            this.f3871f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f3872g ? !(this.f3869d != null || this.f3870e != null) : this.f3871f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3869d;
        if (drawable != null && drawable.isStateful()) {
            this.f3869d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3870e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3870e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3871f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f3871f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3869d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3870e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3871f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3867b = findViewById(R.id.action_bar);
        this.f3868c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3866a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (this.f3872g) {
            Drawable drawable = this.f3871f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f3869d == null) {
                z11 = false;
            } else if (this.f3867b.getVisibility() == 0) {
                this.f3869d.setBounds(this.f3867b.getLeft(), this.f3867b.getTop(), this.f3867b.getRight(), this.f3867b.getBottom());
            } else {
                View view = this.f3868c;
                if (view == null || view.getVisibility() != 0) {
                    this.f3869d.setBounds(0, 0, 0, 0);
                } else {
                    this.f3869d.setBounds(this.f3868c.getLeft(), this.f3868c.getTop(), this.f3868c.getRight(), this.f3868c.getBottom());
                }
            }
            this.f3873h = false;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f3867b == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f3874i) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f3867b == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f3869d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3869d);
        }
        this.f3869d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3867b;
            if (view != null) {
                this.f3869d.setBounds(view.getLeft(), this.f3867b.getTop(), this.f3867b.getRight(), this.f3867b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f3872g ? !(this.f3869d != null || this.f3870e != null) : this.f3871f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3871f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3871f);
        }
        this.f3871f = drawable;
        boolean z10 = this.f3872g;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f3871f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f3869d != null || this.f3870e != null) : this.f3871f == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f3870e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3870e);
        }
        this.f3870e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3873h && this.f3870e != null) {
                throw null;
            }
        }
        boolean z10 = false;
        if (!this.f3872g ? !(this.f3869d != null || this.f3870e != null) : this.f3871f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z10) {
        this.f3866a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f3869d;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f3870e;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f3871f;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3869d;
        boolean z10 = this.f3872g;
        if (drawable == drawable2 && !z10) {
            return true;
        }
        if (drawable == this.f3870e && this.f3873h) {
            return true;
        }
        return (drawable == this.f3871f && z10) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public void setTabContainer(k2 k2Var) {
    }
}
