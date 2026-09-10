package com.google.android.material.navigation;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.activity.BackEventCompat;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.content.ContextCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.shape.MaterialShapeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    public static final /* synthetic */ int g0 = 0;
    public OnNavigationItemSelectedListener f0;

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$1, reason: invalid class name */
    public class AnonymousClass1 extends DrawerLayout.SimpleDrawerListener {
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$2, reason: invalid class name */
    class AnonymousClass2 implements MenuBuilder.Callback {
        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            throw null;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void b(MenuBuilder menuBuilder) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$3, reason: invalid class name */
    class AnonymousClass3 implements ViewTreeObserver.OnGlobalLayoutListener {
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            int i2 = NavigationView.g0;
            throw null;
        }
    }

    public interface OnNavigationItemSelectedListener {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public Bundle Z;

        /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationView$SavedState$1, reason: invalid class name */
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
            this.Z = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.Z);
        }
    }

    private MenuInflater getMenuInflater() {
        return null;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void b() {
        g();
        throw null;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void d(BackEventCompat backEventCompat) {
        g();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        throw null;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void e(BackEventCompat backEventCompat) {
        int i2 = ((DrawerLayout.LayoutParams) g().second).f4948a;
        throw null;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void f() {
        throw null;
    }

    public final Pair g() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return null;
    }

    public MenuItem getCheckedItem() {
        throw null;
    }

    public int getDividerInsetEnd() {
        throw null;
    }

    public int getDividerInsetStart() {
        throw null;
    }

    public int getHeaderCount() {
        throw null;
    }

    public Drawable getItemBackground() {
        throw null;
    }

    public int getItemHorizontalPadding() {
        throw null;
    }

    public int getItemIconPadding() {
        throw null;
    }

    public ColorStateList getItemIconTintList() {
        throw null;
    }

    public int getItemMaxLines() {
        throw null;
    }

    public ColorStateList getItemTextColor() {
        throw null;
    }

    public int getItemVerticalPadding() {
        throw null;
    }

    public Menu getMenu() {
        return null;
    }

    public int getSubheaderInsetEnd() {
        throw null;
    }

    public int getSubheaderInsetStart() {
        throw null;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
        if (getParent() instanceof DrawerLayout) {
            throw null;
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(null);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).getClass();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), 0), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            super.onRestoreInstanceState(((SavedState) parcelable).X);
            throw null;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        new SavedState(super.onSaveInstanceState()).Z = new Bundle();
        throw null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams)) {
            throw null;
        }
    }

    public void setBottomInsetScrimEnabled(boolean z2) {
    }

    public void setCheckedItem(int i2) {
        throw null;
    }

    public void setDividerInsetEnd(int i2) {
        throw null;
    }

    public void setDividerInsetStart(int i2) {
        throw null;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.b(this, f);
    }

    public void setForceCompatClippingEnabled(boolean z2) {
        throw null;
    }

    public void setItemBackground(Drawable drawable) {
        throw null;
    }

    public void setItemBackgroundResource(int i2) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setItemHorizontalPadding(int i2) {
        throw null;
    }

    public void setItemHorizontalPaddingResource(int i2) {
        getResources().getDimensionPixelSize(i2);
        throw null;
    }

    public void setItemIconPadding(int i2) {
        throw null;
    }

    public void setItemIconPaddingResource(int i2) {
        getResources().getDimensionPixelSize(i2);
        throw null;
    }

    public void setItemIconSize(int i2) {
        throw null;
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        throw null;
    }

    public void setItemMaxLines(int i2) {
        throw null;
    }

    public void setItemTextAppearance(int i2) {
        throw null;
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        throw null;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setItemVerticalPadding(int i2) {
        throw null;
    }

    public void setItemVerticalPaddingResource(int i2) {
        getResources().getDimensionPixelSize(i2);
        throw null;
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.f0 = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i2) {
        super.setOverScrollMode(i2);
    }

    public void setSubheaderInsetEnd(int i2) {
        throw null;
    }

    public void setSubheaderInsetStart(int i2) {
        throw null;
    }

    public void setTopInsetScrimEnabled(boolean z2) {
    }

    public void setCheckedItem(MenuItem menuItem) {
        menuItem.getItemId();
        throw null;
    }
}
