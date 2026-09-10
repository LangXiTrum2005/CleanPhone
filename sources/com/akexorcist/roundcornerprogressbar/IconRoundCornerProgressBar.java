package com.akexorcist.roundcornerprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.customview.view.AbsSavedState;
import com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class IconRoundCornerProgressBar extends AnimatedRoundCornerProgressBar {
    protected static final int DEFAULT_ICON_PADDING_BOTTOM = 0;
    protected static final int DEFAULT_ICON_PADDING_LEFT = 0;
    protected static final int DEFAULT_ICON_PADDING_RIGHT = 0;
    protected static final int DEFAULT_ICON_PADDING_TOP = 0;
    protected static final int DEFAULT_ICON_SIZE = 20;
    private int colorIconBackground;
    private Bitmap iconBitmap;
    private OnIconClickListener iconClickListener;
    private Drawable iconDrawable;
    private int iconHeight;
    private int iconPadding;
    private int iconPaddingBottom;
    private int iconPaddingLeft;
    private int iconPaddingRight;
    private int iconPaddingTop;
    private int iconResource;
    private int iconSize;
    private int iconWidth;
    private ImageView ivProgressIcon;

    public interface OnIconClickListener {
        void a();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new AnonymousClass1();
        public int Z;
        public int e0;
        public int f0;
        public int g0;
        public int h0;
        public int i0;
        public int j0;
        public int k0;
        public int l0;
        public int m0;

        /* JADX INFO: renamed from: com.akexorcist.roundcornerprogressbar.IconRoundCornerProgressBar$SavedState$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.Z = parcel.readInt();
            this.e0 = parcel.readInt();
            this.f0 = parcel.readInt();
            this.g0 = parcel.readInt();
            this.h0 = parcel.readInt();
            this.i0 = parcel.readInt();
            this.j0 = parcel.readInt();
            this.k0 = parcel.readInt();
            this.l0 = parcel.readInt();
            this.m0 = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.Z);
            parcel.writeInt(this.e0);
            parcel.writeInt(this.f0);
            parcel.writeInt(this.g0);
            parcel.writeInt(this.h0);
            parcel.writeInt(this.i0);
            parcel.writeInt(this.j0);
            parcel.writeInt(this.k0);
            parcel.writeInt(this.l0);
            parcel.writeInt(this.m0);
        }
    }

    public IconRoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void drawIconBackgroundColor() {
        GradientDrawable gradientDrawableCreateGradientDrawable = createGradientDrawable(this.colorIconBackground);
        float radius = getRadius() - (getPadding() / 2);
        gradientDrawableCreateGradientDrawable.setCornerRadii(new float[]{radius, radius, 0.0f, 0.0f, 0.0f, 0.0f, radius, radius});
        this.ivProgressIcon.setBackground(gradientDrawableCreateGradientDrawable);
    }

    private void drawImageIcon() {
        int i2 = this.iconResource;
        if (i2 != -1) {
            this.ivProgressIcon.setImageResource(i2);
            return;
        }
        Bitmap bitmap = this.iconBitmap;
        if (bitmap != null) {
            this.ivProgressIcon.setImageBitmap(bitmap);
            return;
        }
        Drawable drawable = this.iconDrawable;
        if (drawable != null) {
            this.ivProgressIcon.setImageDrawable(drawable);
        }
    }

    private void drawImageIconPadding() {
        int i2 = this.iconPadding;
        if (i2 == -1 || i2 == 0) {
            this.ivProgressIcon.setPadding(this.iconPaddingLeft, this.iconPaddingTop, this.iconPaddingRight, this.iconPaddingBottom);
        } else {
            this.ivProgressIcon.setPadding(i2, i2, i2, i2);
        }
        this.ivProgressIcon.invalidate();
    }

    private void drawImageIconSize() {
        if (this.iconSize == -1) {
            this.ivProgressIcon.setLayoutParams(new LinearLayout.LayoutParams(this.iconWidth, this.iconHeight));
            return;
        }
        ImageView imageView = this.ivProgressIcon;
        int i2 = this.iconSize;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void drawProgress(LinearLayout linearLayout, GradientDrawable gradientDrawable, float f, float f2, float f3, int i2, int i3, boolean z2) {
        int i4 = i2 - (i3 / 2);
        if (!z2 || f2 == f) {
            float f4 = i4;
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, f4, f4, f4, f4, 0.0f, 0.0f});
        } else {
            float f5 = i4;
            gradientDrawable.setCornerRadii(new float[]{f5, f5, f5, f5, f5, f5, f5, f5});
        }
        linearLayout.setBackground(gradientDrawable);
        int width = (int) ((f3 - (this.ivProgressIcon.getWidth() + (i3 * 2))) / (f / f2));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
        if (z2) {
            int i5 = width / 2;
            if (i3 + i5 < i2) {
                int iMax = Math.max(i2 - i3, 0) - i5;
                marginLayoutParams.topMargin = iMax;
                marginLayoutParams.bottomMargin = iMax;
            } else {
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.bottomMargin = 0;
            }
        }
        marginLayoutParams.width = width;
        linearLayout.setLayoutParams(marginLayoutParams);
    }

    public int getColorIconBackground() {
        return this.colorIconBackground;
    }

    public Bitmap getIconImageBitmap() {
        return this.iconBitmap;
    }

    public Drawable getIconImageDrawable() {
        return this.iconDrawable;
    }

    public int getIconImageResource() {
        return this.iconResource;
    }

    public int getIconPadding() {
        return this.iconPadding;
    }

    public int getIconPaddingBottom() {
        return this.iconPaddingBottom;
    }

    public int getIconPaddingLeft() {
        return this.iconPaddingLeft;
    }

    public int getIconPaddingRight() {
        return this.iconPaddingRight;
    }

    public int getIconPaddingTop() {
        return this.iconPaddingTop;
    }

    public int getIconSize() {
        return this.iconSize;
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public int initLayout() {
        return com.charging.screenshow.battery.animations.themes.R.layout.layout_icon_round_corner_progress_bar;
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initStyleable(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f9969c);
        this.iconResource = typedArrayObtainStyledAttributes.getResourceId(8, -1);
        this.iconSize = (int) typedArrayObtainStyledAttributes.getDimension(7, -1.0f);
        this.iconWidth = (int) typedArrayObtainStyledAttributes.getDimension(9, dp2px(20.0f));
        this.iconHeight = (int) typedArrayObtainStyledAttributes.getDimension(1, dp2px(20.0f));
        this.iconPadding = (int) typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.iconPaddingLeft = (int) typedArrayObtainStyledAttributes.getDimension(4, dp2px(0.0f));
        this.iconPaddingRight = (int) typedArrayObtainStyledAttributes.getDimension(5, dp2px(0.0f));
        this.iconPaddingTop = (int) typedArrayObtainStyledAttributes.getDimension(6, dp2px(0.0f));
        this.iconPaddingBottom = (int) typedArrayObtainStyledAttributes.getDimension(3, dp2px(0.0f));
        this.colorIconBackground = typedArrayObtainStyledAttributes.getColor(0, context.getResources().getColor(com.charging.screenshow.battery.animations.themes.R.color.round_corner_progress_bar_background_default));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initView() {
        ImageView imageView = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.iv_progress_icon);
        this.ivProgressIcon = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.akexorcist.roundcornerprogressbar.IconRoundCornerProgressBar.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IconRoundCornerProgressBar iconRoundCornerProgressBar = IconRoundCornerProgressBar.this;
                if (iconRoundCornerProgressBar.iconClickListener != null) {
                    iconRoundCornerProgressBar.iconClickListener.a();
                }
            }
        });
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar, com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        this.iconResource = savedState.Z;
        this.iconSize = savedState.e0;
        this.iconWidth = savedState.f0;
        this.iconHeight = savedState.g0;
        this.iconPadding = savedState.h0;
        this.iconPaddingLeft = savedState.i0;
        this.iconPaddingRight = savedState.j0;
        this.iconPaddingTop = savedState.k0;
        this.iconPaddingBottom = savedState.l0;
        this.colorIconBackground = savedState.m0;
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar, com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Z = this.iconResource;
        savedState.e0 = this.iconSize;
        savedState.f0 = this.iconWidth;
        savedState.g0 = this.iconHeight;
        savedState.h0 = this.iconPadding;
        savedState.i0 = this.iconPaddingLeft;
        savedState.j0 = this.iconPaddingRight;
        savedState.k0 = this.iconPaddingTop;
        savedState.l0 = this.iconPaddingBottom;
        savedState.m0 = this.colorIconBackground;
        return savedState;
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void onViewDraw() {
        drawImageIcon();
        drawImageIconSize();
        drawImageIconPadding();
        drawIconBackgroundColor();
    }

    public void setIconBackgroundColor(int i2) {
        this.colorIconBackground = i2;
        drawIconBackgroundColor();
    }

    public void setIconImageBitmap(Bitmap bitmap) {
        this.iconResource = -1;
        this.iconBitmap = bitmap;
        this.iconDrawable = null;
        drawImageIcon();
    }

    public void setIconImageDrawable(Drawable drawable) {
        this.iconResource = -1;
        this.iconBitmap = null;
        this.iconDrawable = drawable;
        drawImageIcon();
    }

    public void setIconImageResource(int i2) {
        this.iconResource = i2;
        this.iconBitmap = null;
        this.iconDrawable = null;
        drawImageIcon();
    }

    public void setIconPadding(int i2) {
        if (i2 >= 0) {
            this.iconPadding = i2;
        }
        drawImageIconPadding();
    }

    public void setIconPaddingBottom(int i2) {
        if (i2 > 0) {
            this.iconPaddingBottom = i2;
        }
        drawImageIconPadding();
    }

    public void setIconPaddingLeft(int i2) {
        if (i2 > 0) {
            this.iconPaddingLeft = i2;
        }
        drawImageIconPadding();
    }

    public void setIconPaddingRight(int i2) {
        if (i2 > 0) {
            this.iconPaddingRight = i2;
        }
        drawImageIconPadding();
    }

    public void setIconPaddingTop(int i2) {
        if (i2 > 0) {
            this.iconPaddingTop = i2;
        }
        drawImageIconPadding();
    }

    public void setIconSize(int i2) {
        if (i2 >= 0) {
            this.iconSize = i2;
        }
        drawImageIconSize();
    }

    public void setOnIconClickListener(OnIconClickListener onIconClickListener) {
        this.iconClickListener = onIconClickListener;
    }

    public IconRoundCornerProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public IconRoundCornerProgressBar(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
