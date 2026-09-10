package com.google.android.material.navigation;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NavigationBarView extends FrameLayout {
    public OnItemSelectedListener e0;
    public OnItemReselectedListener f0;

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarView$1, reason: invalid class name */
    class AnonymousClass1 implements MenuBuilder.Callback {
        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            throw null;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void b(MenuBuilder menuBuilder) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
    }

    public interface OnItemSelectedListener {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public Bundle Z;

        /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$1, reason: invalid class name */
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
            this.Z = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
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

    public int getActiveIndicatorLabelPadding() {
        throw null;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        throw null;
    }

    public int getItemActiveIndicatorHeight() {
        throw null;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        throw null;
    }

    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        throw null;
    }

    public int getItemActiveIndicatorWidth() {
        throw null;
    }

    public Drawable getItemBackground() {
        throw null;
    }

    @Deprecated
    public int getItemBackgroundResource() {
        throw null;
    }

    public int getItemIconSize() {
        throw null;
    }

    public ColorStateList getItemIconTintList() {
        throw null;
    }

    public int getItemPaddingBottom() {
        throw null;
    }

    public int getItemPaddingTop() {
        throw null;
    }

    public ColorStateList getItemRippleColor() {
        throw null;
    }

    public int getItemTextAppearanceActive() {
        throw null;
    }

    public int getItemTextAppearanceInactive() {
        throw null;
    }

    public ColorStateList getItemTextColor() {
        throw null;
    }

    public int getLabelVisibilityMode() {
        throw null;
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return null;
    }

    public MenuView getMenuView() {
        return null;
    }

    public NavigationBarPresenter getPresenter() {
        return null;
    }

    public int getSelectedItemId() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
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

    public void setActiveIndicatorLabelPadding(int i2) {
        throw null;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.b(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setItemActiveIndicatorEnabled(boolean z2) {
        throw null;
    }

    public void setItemActiveIndicatorHeight(int i2) {
        throw null;
    }

    public void setItemActiveIndicatorMarginHorizontal(int i2) {
        throw null;
    }

    public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
        throw null;
    }

    public void setItemActiveIndicatorWidth(int i2) {
        throw null;
    }

    public void setItemBackground(Drawable drawable) {
        throw null;
    }

    public void setItemBackgroundResource(int i2) {
        throw null;
    }

    public void setItemIconSize(int i2) {
        throw null;
    }

    public void setItemIconSizeRes(int i2) {
        setItemIconSize(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        throw null;
    }

    public void setItemPaddingBottom(int i2) {
        throw null;
    }

    public void setItemPaddingTop(int i2) {
        throw null;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setItemTextAppearanceActive(int i2) {
        throw null;
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        throw null;
    }

    public void setItemTextAppearanceInactive(int i2) {
        throw null;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setLabelVisibilityMode(int i2) {
        throw null;
    }

    public void setOnItemReselectedListener(OnItemReselectedListener onItemReselectedListener) {
        this.f0 = onItemReselectedListener;
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.e0 = onItemSelectedListener;
    }

    public void setSelectedItemId(int i2) {
        throw null;
    }
}
