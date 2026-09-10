package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] d1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer Y0;
    public boolean Z0;
    public boolean a1;
    public ImageView.ScaleType b1;
    public Boolean c1;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(MaterialThemeOverlay.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.y, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayD.hasValue(2)) {
            setNavigationIconTint(typedArrayD.getColor(2, -1));
        }
        this.Z0 = typedArrayD.getBoolean(4, false);
        this.a1 = typedArrayD.getBoolean(3, false);
        int i2 = typedArrayD.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = d1;
            if (i2 < scaleTypeArr.length) {
                this.b1 = scaleTypeArr[i2];
            }
        }
        if (typedArrayD.hasValue(0)) {
            this.c1 = Boolean.valueOf(typedArrayD.getBoolean(0, false));
        }
        typedArrayD.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : DrawableUtils.d(background);
        if (colorStateListValueOf != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.l(colorStateListValueOf);
            materialShapeDrawable.j(context2);
            materialShapeDrawable.k(ViewCompat.k(this));
            setBackground(materialShapeDrawable);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.b1;
    }

    public Integer getNavigationIconTint() {
        return this.Y0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void n(int i2) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof MenuBuilder;
        if (z2) {
            ((MenuBuilder) menu).w();
        }
        super.n(i2);
        if (z2) {
            ((MenuBuilder) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i2, i3, i4, i5);
        ImageView imageView2 = null;
        if (this.Z0 || this.a1) {
            ArrayList arrayListC = ToolbarUtils.c(this, getTitle());
            boolean zIsEmpty = arrayListC.isEmpty();
            Comparator comparator = ToolbarUtils.f19352a;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListC, comparator);
            ArrayList arrayListC2 = ToolbarUtils.c(this, getSubtitle());
            TextView textView2 = arrayListC2.isEmpty() ? null : (TextView) Collections.max(arrayListC2, comparator);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.Z0 && textView != null) {
                    y(textView, pair);
                }
                if (this.a1 && textView2 != null) {
                    y(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt2 = getChildAt(i8);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.c1;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.b1;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.b(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.c1;
        if (bool == null || bool.booleanValue() != z2) {
            this.c1 = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.b1 != scaleType) {
            this.b1 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.Y0 != null) {
            drawable = drawable.mutate();
            DrawableCompat.i(drawable, this.Y0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.Y0 = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.a1 != z2) {
            this.a1 = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.Z0 != z2) {
            this.Z0 = z2;
            requestLayout();
        }
    }

    public final void y(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i2 += iMax;
            i3 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i2, textView.getTop(), i3, textView.getBottom());
    }
}
