package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class SearchBar extends Toolbar {
    public static final /* synthetic */ int b1 = 0;
    public Drawable Y0;
    public int Z0;
    public boolean a1;

    /* JADX INFO: renamed from: com.google.android.material.search.SearchBar$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            int i2 = SearchBar.b1;
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            int i2 = SearchBar.b1;
            throw null;
        }
    }

    public static abstract class OnLoadAnimationCallback {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public String Z;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchBar$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.Z);
        }
    }

    private void setNavigationIconDecorative(boolean z2) {
        ImageButton imageButtonB = ToolbarUtils.b(this);
        if (imageButtonB == null) {
            return;
        }
        boolean z3 = !z2;
        imageButtonB.setClickable(z3);
        imageButtonB.setFocusable(z3);
        Drawable background = imageButtonB.getBackground();
        if (background != null) {
            this.Y0 = background;
        }
        imageButtonB.setBackgroundDrawable(z2 ? null : this.Y0);
        y();
    }

    public View getCenterView() {
        return null;
    }

    public float getCompatElevation() {
        return ViewCompat.k(this);
    }

    public float getCornerSize() {
        throw null;
    }

    public int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        throw null;
    }

    public int getMenuResId() {
        return this.Z0;
    }

    public int getStrokeColor() {
        throw null;
    }

    public float getStrokeWidth() {
        throw null;
    }

    public CharSequence getText() {
        throw null;
    }

    public TextView getTextView() {
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void n(int i2) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof MenuBuilder;
        if (z2) {
            ((MenuBuilder) menu).w();
        }
        super.n(i2);
        this.Z0 = i2;
        if (z2) {
            ((MenuBuilder) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.c(this, null);
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        int i2 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (i2 >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        y();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        setText(savedState.Z);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.Z = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(View view) {
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z2) {
        this.a1 = z2;
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.a1) {
                if (layoutParams.f19096a == 0) {
                    layoutParams.f19096a = 53;
                }
            } else if (layoutParams.f19096a == 53) {
                layoutParams.f19096a = 0;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z2) {
        throw null;
    }

    public void setStrokeColor(int i2) {
        if (getStrokeColor() == i2) {
            return;
        }
        ColorStateList.valueOf(i2);
        throw null;
    }

    public void setStrokeWidth(float f) {
        if (getStrokeWidth() != f) {
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void y() {
        int width;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z2 = getLayoutDirection() == 1;
        ImageButton imageButtonB = ToolbarUtils.b(this);
        if (imageButtonB == null || !imageButtonB.isClickable()) {
            width = 0;
        } else {
            width = z2 ? getWidth() - imageButtonB.getLeft() : imageButtonB.getRight();
        }
        ActionMenuView actionMenuViewA = ToolbarUtils.a(this);
        if (actionMenuViewA != null) {
            right = z2 ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft();
        }
        float f = -(z2 ? right : width);
        if (!z2) {
            width = right;
        }
        setHandwritingBoundsOffsets(f, 0.0f, -width, 0.0f);
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        public boolean h0;

        public ScrollingViewBehavior() {
            this.h0 = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.j(coordinatorLayout, view, view2);
            if (!this.h0 && (view2 instanceof AppBarLayout)) {
                this.h0 = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h0 = false;
        }
    }

    public void setHint(int i2) {
        throw null;
    }

    public void setText(int i2) {
        throw null;
    }
}
