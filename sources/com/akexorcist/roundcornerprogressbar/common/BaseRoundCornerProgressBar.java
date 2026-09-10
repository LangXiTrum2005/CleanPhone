package com.akexorcist.roundcornerprogressbar.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.customview.view.AbsSavedState;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseRoundCornerProgressBar extends LinearLayout {
    protected static final int DEFAULT_BACKGROUND_PADDING = 0;
    protected static final int DEFAULT_MAX_PROGRESS = 100;
    protected static final int DEFAULT_PROGRESS = 0;
    protected static final int DEFAULT_PROGRESS_RADIUS = 30;
    protected static final int DEFAULT_SECONDARY_PROGRESS = 0;
    protected int backgroundColor;
    protected boolean isReverse;
    protected LinearLayout layoutBackground;
    protected LinearLayout layoutProgress;
    protected LinearLayout layoutSecondaryProgress;
    protected float max;
    protected int padding;
    protected float progress;
    protected OnProgressChangedListener progressChangedListener;
    private int progressColor;
    protected int[] progressColors;
    protected GradientDrawable progressDrawable;
    protected int radius;
    protected float secondaryProgress;
    protected int secondaryProgressColor;
    protected int[] secondaryProgressColors;
    protected GradientDrawable secondaryProgressDrawable;
    protected int totalWidth;

    public interface OnProgressChangedListener {
        void a();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new AnonymousClass1();
        public float Z;
        public float e0;
        public float f0;
        public int g0;
        public int h0;
        public int i0;
        public int j0;
        public int k0;
        public int[] l0;
        public int[] m0;
        public boolean n0;

        /* JADX INFO: renamed from: com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar$SavedState$1, reason: invalid class name */
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
            this.Z = parcel.readFloat();
            this.e0 = parcel.readFloat();
            this.f0 = parcel.readFloat();
            this.g0 = parcel.readInt();
            this.h0 = parcel.readInt();
            this.i0 = parcel.readInt();
            this.j0 = parcel.readInt();
            this.k0 = parcel.readInt();
            int[] iArr = new int[parcel.readInt()];
            this.l0 = iArr;
            parcel.readIntArray(iArr);
            int[] iArr2 = new int[parcel.readInt()];
            this.m0 = iArr2;
            parcel.readIntArray(iArr2);
            this.n0 = parcel.readByte() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeFloat(this.Z);
            parcel.writeFloat(this.e0);
            parcel.writeFloat(this.f0);
            parcel.writeInt(this.g0);
            parcel.writeInt(this.h0);
            parcel.writeInt(this.i0);
            parcel.writeInt(this.j0);
            parcel.writeInt(this.k0);
            int[] iArr = this.l0;
            parcel.writeInt(iArr != null ? iArr.length : 0);
            int[] iArr2 = this.l0;
            if (iArr2 == null) {
                iArr2 = new int[0];
            }
            parcel.writeIntArray(iArr2);
            int[] iArr3 = this.m0;
            parcel.writeInt(iArr3 != null ? iArr3.length : 0);
            int[] iArr4 = this.m0;
            if (iArr4 == null) {
                iArr4 = new int[0];
            }
            parcel.writeIntArray(iArr4);
            parcel.writeByte(this.n0 ? (byte) 1 : (byte) 0);
        }
    }

    public BaseRoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setup(context, attributeSet);
    }

    private void drawBackgroundProgress() {
        GradientDrawable gradientDrawableCreateGradientDrawable = createGradientDrawable(this.backgroundColor);
        float f = this.radius - (this.padding / 2);
        gradientDrawableCreateGradientDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
        this.layoutBackground.setBackground(gradientDrawableCreateGradientDrawable);
    }

    private void drawPadding() {
        LinearLayout linearLayout = this.layoutBackground;
        int i2 = this.padding;
        linearLayout.setPadding(i2, i2, i2, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drawPrimaryProgress() {
        drawProgress(this.layoutProgress, this.progressDrawable, this.max, this.progress, this.totalWidth, Math.min(this.radius, this.layoutBackground.getMeasuredHeight() / 2), this.padding, this.isReverse);
    }

    private void drawProgressReverse() {
        setupProgressReversing(this.layoutProgress, this.isReverse);
        setupProgressReversing(this.layoutSecondaryProgress, this.isReverse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drawSecondaryProgress() {
        drawProgress(this.layoutSecondaryProgress, this.secondaryProgressDrawable, this.max, this.secondaryProgress, this.totalWidth, Math.min(this.radius, this.layoutBackground.getMeasuredHeight() / 2), this.padding, this.isReverse);
    }

    private void removeLayoutParamsRule(RelativeLayout.LayoutParams layoutParams) {
        layoutParams.removeRule(11);
        layoutParams.removeRule(21);
        layoutParams.removeRule(9);
        layoutParams.removeRule(20);
    }

    private void setupProgressReversing(LinearLayout linearLayout, boolean z2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        removeLayoutParamsRule(layoutParams);
        if (z2) {
            layoutParams.addRule(11);
            layoutParams.addRule(21);
        } else {
            layoutParams.addRule(9);
            layoutParams.addRule(20);
        }
        linearLayout.setLayoutParams(layoutParams);
    }

    private void updateProgressDrawable() {
        int i2 = this.progressColor;
        if (i2 != -1) {
            this.progressDrawable = createGradientDrawable(i2);
            return;
        }
        int[] iArr = this.progressColors;
        if (iArr == null || iArr.length <= 0) {
            this.progressDrawable = createGradientDrawable(getResources().getColor(R.color.round_corner_progress_bar_progress_default));
        } else {
            this.progressDrawable = createGradientDrawable(iArr);
        }
    }

    private void updateSecondaryProgressDrawable() {
        int i2 = this.secondaryProgressColor;
        if (i2 != -1) {
            this.secondaryProgressDrawable = createGradientDrawable(i2);
            return;
        }
        int[] iArr = this.secondaryProgressColors;
        if (iArr == null || iArr.length <= 0) {
            this.secondaryProgressDrawable = createGradientDrawable(getResources().getColor(R.color.round_corner_progress_bar_secondary_progress_default));
        } else {
            this.secondaryProgressDrawable = createGradientDrawable(iArr);
        }
    }

    public GradientDrawable createGradientDrawable(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    public float dp2px(float f) {
        return TypedValue.applyDimension(1, f, getContext().getResources().getDisplayMetrics());
    }

    public void drawAll() {
        drawBackgroundProgress();
        drawPadding();
        drawProgressReverse();
        drawPrimaryProgress();
        drawSecondaryProgress();
        onViewDraw();
    }

    public abstract void drawProgress(LinearLayout linearLayout, GradientDrawable gradientDrawable, float f, float f2, float f3, int i2, int i3, boolean z2);

    public float getLayoutWidth() {
        return this.totalWidth;
    }

    public float getMax() {
        return this.max;
    }

    public int getPadding() {
        return this.padding;
    }

    public float getProgress() {
        return this.progress;
    }

    public int getProgressBackgroundColor() {
        return this.backgroundColor;
    }

    public int getProgressColor() {
        return this.progressColor;
    }

    public int[] getProgressColors() {
        return this.progressColors;
    }

    public int getRadius() {
        return this.radius;
    }

    public float getSecondaryProgress() {
        return this.secondaryProgress;
    }

    public int getSecondaryProgressColor() {
        return this.secondaryProgressColor;
    }

    public int[] getSecondaryProgressColors() {
        return this.secondaryProgressColors;
    }

    public float getSecondaryProgressWidth() {
        LinearLayout linearLayout = this.layoutSecondaryProgress;
        if (linearLayout != null) {
            return linearLayout.getWidth();
        }
        return 0.0f;
    }

    public abstract int initLayout();

    public abstract void initStyleable(Context context, AttributeSet attributeSet);

    public abstract void initView();

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        drawAll();
    }

    public boolean isReverse() {
        return this.isReverse;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        this.max = savedState.Z;
        this.progress = savedState.e0;
        this.secondaryProgress = savedState.f0;
        this.radius = savedState.g0;
        this.padding = savedState.h0;
        this.backgroundColor = savedState.i0;
        this.progressColor = savedState.j0;
        this.secondaryProgressColor = savedState.k0;
        this.progressColors = savedState.l0;
        this.secondaryProgressColors = savedState.m0;
        this.isReverse = savedState.n0;
        updateProgressDrawable();
        updateSecondaryProgressDrawable();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Z = this.max;
        savedState.e0 = this.progress;
        savedState.f0 = this.secondaryProgress;
        savedState.g0 = this.radius;
        savedState.h0 = this.padding;
        savedState.i0 = this.backgroundColor;
        savedState.j0 = this.progressColor;
        savedState.k0 = this.secondaryProgressColor;
        savedState.l0 = this.progressColors;
        savedState.m0 = this.secondaryProgressColors;
        savedState.n0 = this.isReverse;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.totalWidth = i2;
        drawBackgroundProgress();
        drawPadding();
        drawProgressReverse();
        post(new Runnable() { // from class: com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                BaseRoundCornerProgressBar baseRoundCornerProgressBar = BaseRoundCornerProgressBar.this;
                baseRoundCornerProgressBar.drawPrimaryProgress();
                baseRoundCornerProgressBar.drawSecondaryProgress();
            }
        });
        onViewDraw();
    }

    public abstract void onViewDraw();

    public void setMax(float f) {
        if (f >= 0.0f) {
            this.max = f;
        }
        if (this.progress > f) {
            this.progress = f;
        }
        drawPrimaryProgress();
        drawSecondaryProgress();
    }

    public void setOnProgressChangedListener(OnProgressChangedListener onProgressChangedListener) {
        this.progressChangedListener = onProgressChangedListener;
    }

    public void setPadding(int i2) {
        if (i2 >= 0) {
            this.padding = i2;
        }
        drawPadding();
        drawPrimaryProgress();
        drawSecondaryProgress();
    }

    public void setProgress(int i2) {
        setProgress(i2);
    }

    public void setProgressBackgroundColor(int i2) {
        this.backgroundColor = i2;
        drawBackgroundProgress();
    }

    public void setProgressColor(int i2) {
        this.progressColor = i2;
        this.progressColors = null;
        updateProgressDrawable();
        drawPrimaryProgress();
    }

    public void setProgressColors(int[] iArr) {
        this.progressColor = -1;
        this.progressColors = iArr;
        updateProgressDrawable();
        drawPrimaryProgress();
    }

    public void setRadius(int i2) {
        if (i2 >= 0) {
            this.radius = i2;
        }
        drawBackgroundProgress();
        drawPrimaryProgress();
        drawSecondaryProgress();
    }

    public void setReverse(boolean z2) {
        this.isReverse = z2;
        drawProgressReverse();
        drawPrimaryProgress();
        drawSecondaryProgress();
    }

    public void setSecondaryProgress(int i2) {
        setSecondaryProgress(i2);
    }

    public void setSecondaryProgressColor(int i2) {
        this.secondaryProgressColor = i2;
        this.secondaryProgressColors = null;
        updateSecondaryProgressDrawable();
        drawSecondaryProgress();
    }

    public void setSecondaryProgressColors(int[] iArr) {
        this.secondaryProgressColor = -1;
        this.secondaryProgressColors = iArr;
        updateSecondaryProgressDrawable();
        drawSecondaryProgress();
    }

    public void setup(Context context, AttributeSet attributeSet) {
        setupStyleable(context, attributeSet);
        removeAllViews();
        LayoutInflater.from(context).inflate(initLayout(), this);
        this.layoutBackground = (LinearLayout) findViewById(R.id.layout_background);
        this.layoutProgress = (LinearLayout) findViewById(R.id.layout_progress);
        this.layoutSecondaryProgress = (LinearLayout) findViewById(R.id.layout_secondary_progress);
        initView();
    }

    public void setupStyleable(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.akexorcist.roundcornerprogressbar.R.styleable.f9968b);
        this.radius = (int) typedArrayObtainStyledAttributes.getDimension(6, dp2px(30.0f));
        this.padding = (int) typedArrayObtainStyledAttributes.getDimension(1, dp2px(0.0f));
        this.isReverse = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.max = typedArrayObtainStyledAttributes.getFloat(2, 100.0f);
        this.progress = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.secondaryProgress = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.backgroundColor = typedArrayObtainStyledAttributes.getColor(0, context.getResources().getColor(R.color.round_corner_progress_bar_background_default));
        this.progressColor = typedArrayObtainStyledAttributes.getColor(4, -1);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        if (resourceId != 0) {
            this.progressColors = getResources().getIntArray(resourceId);
        } else {
            this.progressColors = null;
        }
        this.secondaryProgressColor = typedArrayObtainStyledAttributes.getColor(9, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(10, 0);
        if (resourceId2 != 0) {
            this.secondaryProgressColors = getResources().getIntArray(resourceId2);
        } else {
            this.secondaryProgressColors = null;
        }
        typedArrayObtainStyledAttributes.recycle();
        updateProgressDrawable();
        updateSecondaryProgressDrawable();
        initStyleable(context, attributeSet);
    }

    public void setProgress(float f) {
        if (f < 0.0f) {
            this.progress = 0.0f;
        } else {
            this.progress = Math.min(f, this.max);
        }
        drawPrimaryProgress();
        OnProgressChangedListener onProgressChangedListener = this.progressChangedListener;
        if (onProgressChangedListener != null) {
            onProgressChangedListener.a();
        }
    }

    public void setSecondaryProgress(float f) {
        if (f < 0.0f) {
            this.secondaryProgress = 0.0f;
        } else {
            this.secondaryProgress = Math.min(f, this.max);
        }
        drawSecondaryProgress();
        OnProgressChangedListener onProgressChangedListener = this.progressChangedListener;
        if (onProgressChangedListener != null) {
            onProgressChangedListener.a();
        }
    }

    public BaseRoundCornerProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setup(context, attributeSet);
    }

    public GradientDrawable createGradientDrawable(int[] iArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setOrientation(!isReverse() ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT);
        gradientDrawable.setColors(iArr);
        return gradientDrawable;
    }

    public BaseRoundCornerProgressBar(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        setup(context, attributeSet);
    }
}
