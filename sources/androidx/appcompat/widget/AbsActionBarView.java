package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes.dex */
abstract class AbsActionBarView extends ViewGroup {
    public final VisibilityAnimListener e0;
    public final Context f0;
    public ActionMenuView g0;
    public ActionMenuPresenter h0;
    public int i0;
    public ViewPropertyAnimatorCompat j0;
    public boolean k0;
    public boolean l0;

    /* JADX INFO: renamed from: androidx.appcompat.widget.AbsActionBarView$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public class VisibilityAnimListener implements ViewPropertyAnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3519a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3520b;

        public VisibilityAnimListener() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void a() {
            this.f3519a = true;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void b() {
            AbsActionBarView.super.setVisibility(0);
            this.f3519a = false;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void c() {
            if (this.f3519a) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.j0 = null;
            AbsActionBarView.super.setVisibility(this.f3520b);
        }
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        this.e0 = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f0 = context;
        } else {
            this.f0 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(int i2, int i3, View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    public static int d(View view, boolean z2, int i2, int i3, int i4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, androidx.appcompat.R.styleable.f3277a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.h0;
        if (actionMenuPresenter != null) {
            Context context = actionMenuPresenter.f3466Y;
            ActionBarPolicy actionBarPolicy = new ActionBarPolicy();
            actionBarPolicy.f3419a = context;
            actionMenuPresenter.q0 = actionBarPolicy.a();
            MenuBuilder menuBuilder = actionMenuPresenter.Z;
            if (menuBuilder != null) {
                menuBuilder.p(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.l0 = false;
        }
        if (!this.l0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.l0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.l0 = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.k0 = false;
        }
        if (!this.k0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.k0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.k0 = false;
        return true;
    }

    public void setContentHeight(int i2) {
        this.i0 = i2;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.j0;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.b();
            }
            super.setVisibility(i2);
        }
    }
}
