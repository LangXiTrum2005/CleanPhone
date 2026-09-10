package com.akexorcist.roundcornerprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class TextRoundCornerProgressBar extends AnimatedRoundCornerProgressBar implements ViewTreeObserver.OnGlobalLayoutListener {
    protected static final int DEFAULT_TEXT_MARGIN = 10;
    protected static final int DEFAULT_TEXT_SIZE = 16;
    public static final int GRAVITY_END = 1;
    public static final int GRAVITY_START = 0;
    public static final int PRIORITY_INSIDE = 0;
    public static final int PRIORITY_OUTSIDE = 1;
    private int colorTextProgress;
    private int textInsideGravity;
    private int textOutsideGravity;
    private int textPositionPriority;
    private String textProgress;
    private int textProgressMargin;
    private int textProgressSize;
    private TextView tvProgress;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new AnonymousClass1();
        public int Z;
        public int e0;
        public int f0;
        public String g0;
        public int h0;
        public int i0;
        public int j0;

        /* JADX INFO: renamed from: com.akexorcist.roundcornerprogressbar.TextRoundCornerProgressBar$SavedState$1, reason: invalid class name */
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
            this.g0 = parcel.readString();
            this.h0 = parcel.readInt();
            this.i0 = parcel.readInt();
            this.j0 = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.Z);
            parcel.writeInt(this.e0);
            parcel.writeInt(this.f0);
            parcel.writeString(this.g0);
            parcel.writeInt(this.h0);
            parcel.writeInt(this.i0);
            parcel.writeInt(this.j0);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TEXT_POSITION_PRIORITY {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TEXT_PROGRESS_GRAVITY {
    }

    public TextRoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void alignTextProgressInsideProgress() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.tvProgress.getLayoutParams();
        if (isReverse()) {
            if (this.textInsideGravity == 1) {
                layoutParams.addRule(7, com.charging.screenshow.battery.animations.themes.R.id.layout_progress);
                layoutParams.addRule(19, com.charging.screenshow.battery.animations.themes.R.id.layout_progress);
            } else {
                layoutParams.addRule(5, com.charging.screenshow.battery.animations.themes.R.id.layout_progress);
                layoutParams.addRule(18, com.charging.screenshow.battery.animations.themes.R.id.layout_progress);
            }
        } else if (this.textInsideGravity == 1) {
            layoutParams.addRule(5, com.charging.screenshow.battery.animations.themes.R.id.layout_progress);
            layoutParams.addRule(18, com.charging.screenshow.battery.animations.themes.R.id.layout_progress);
        } else {
            layoutParams.addRule(7, com.charging.screenshow.battery.animations.themes.R.id.layout_progress);
            layoutParams.addRule(19, com.charging.screenshow.battery.animations.themes.R.id.layout_progress);
        }
        this.tvProgress.setLayoutParams(layoutParams);
    }

    private void alignTextProgressOutsideProgress() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.tvProgress.getLayoutParams();
        if (isReverse()) {
            if (this.textOutsideGravity == 1) {
                layoutParams.addRule(9);
                layoutParams.addRule(20);
            } else {
                layoutParams.addRule(0, com.charging.screenshow.battery.animations.themes.R.id.layout_progress);
                layoutParams.addRule(16, com.charging.screenshow.battery.animations.themes.R.id.layout_progress);
            }
        } else if (this.textOutsideGravity == 1) {
            layoutParams.addRule(11);
            layoutParams.addRule(21);
        } else {
            layoutParams.addRule(1, com.charging.screenshow.battery.animations.themes.R.id.layout_progress);
            layoutParams.addRule(17, com.charging.screenshow.battery.animations.themes.R.id.layout_progress);
        }
        this.tvProgress.setLayoutParams(layoutParams);
    }

    private void clearTextProgressAlign() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.tvProgress.getLayoutParams();
        layoutParams.removeRule(0);
        layoutParams.removeRule(1);
        layoutParams.removeRule(5);
        layoutParams.removeRule(7);
        layoutParams.removeRule(9);
        layoutParams.removeRule(11);
        layoutParams.removeRule(16);
        layoutParams.removeRule(17);
        layoutParams.removeRule(18);
        layoutParams.removeRule(19);
        layoutParams.removeRule(20);
        layoutParams.removeRule(21);
        this.tvProgress.setLayoutParams(layoutParams);
    }

    private void drawTextProgress() {
        this.tvProgress.setText(this.textProgress);
    }

    private void drawTextProgressColor() {
        this.tvProgress.setTextColor(this.colorTextProgress);
    }

    private void drawTextProgressMargin() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.tvProgress.getLayoutParams();
        int i2 = this.textProgressMargin;
        marginLayoutParams.setMargins(i2, 0, i2, 0);
        this.tvProgress.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drawTextProgressPosition() {
        clearTextProgressAlign();
        int textProgressMargin = (getTextProgressMargin() * 2) + this.tvProgress.getMeasuredWidth();
        int layoutWidth = (int) ((getLayoutWidth() - (getPadding() * 2)) / (getMax() / getProgress()));
        if (this.textPositionPriority == 1) {
            if (getLayoutWidth() - layoutWidth > textProgressMargin) {
                alignTextProgressOutsideProgress();
                return;
            } else {
                alignTextProgressInsideProgress();
                return;
            }
        }
        if (textProgressMargin + this.textProgressMargin > layoutWidth) {
            alignTextProgressOutsideProgress();
        } else {
            alignTextProgressInsideProgress();
        }
    }

    private void drawTextProgressSize() {
        this.tvProgress.setTextSize(0, this.textProgressSize);
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void drawProgress(LinearLayout linearLayout, GradientDrawable gradientDrawable, float f, float f2, float f3, int i2, int i3, boolean z2) {
        float f4 = i2 - (i3 / 2);
        gradientDrawable.setCornerRadii(new float[]{f4, f4, f4, f4, f4, f4, f4, f4});
        linearLayout.setBackground(gradientDrawable);
        int i4 = (int) ((f3 - (i3 * 2)) / (f / f2));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
        int i5 = i4 / 2;
        if (i3 + i5 < i2) {
            int iMax = Math.max(i2 - i3, 0) - i5;
            marginLayoutParams.topMargin = iMax;
            marginLayoutParams.bottomMargin = iMax;
        } else {
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
        marginLayoutParams.width = i4;
        linearLayout.setLayoutParams(marginLayoutParams);
    }

    public String getProgressText() {
        return this.textProgress;
    }

    public int getTextInsideGravity() {
        return this.textInsideGravity;
    }

    public int getTextOutsideGravity() {
        return this.textOutsideGravity;
    }

    public int getTextPositionPriority() {
        return this.textPositionPriority;
    }

    public int getTextProgressColor() {
        return this.colorTextProgress;
    }

    public int getTextProgressMargin() {
        return this.textProgressMargin;
    }

    public int getTextProgressSize() {
        return this.textProgressSize;
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public int initLayout() {
        return com.charging.screenshow.battery.animations.themes.R.layout.layout_text_round_corner_progress_bar;
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initStyleable(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.d);
        this.colorTextProgress = typedArrayObtainStyledAttributes.getColor(4, -1);
        this.textProgressSize = (int) typedArrayObtainStyledAttributes.getDimension(6, dp2px(16.0f));
        this.textProgressMargin = (int) typedArrayObtainStyledAttributes.getDimension(5, dp2px(10.0f));
        this.textProgress = typedArrayObtainStyledAttributes.getString(3);
        this.textInsideGravity = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.textOutsideGravity = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.textPositionPriority = typedArrayObtainStyledAttributes.getInt(2, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initView() {
        TextView textView = (TextView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.tv_progress);
        this.tvProgress = textView;
        textView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.tvProgress.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        drawTextProgressPosition();
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar, com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        this.colorTextProgress = savedState.Z;
        this.textProgressSize = savedState.e0;
        this.textProgressMargin = savedState.f0;
        this.textProgress = savedState.g0;
        this.textInsideGravity = savedState.h0;
        this.textOutsideGravity = savedState.i0;
        this.textPositionPriority = savedState.j0;
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar, com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Z = this.colorTextProgress;
        savedState.e0 = this.textProgressSize;
        savedState.f0 = this.textProgressMargin;
        savedState.g0 = this.textProgress;
        savedState.h0 = this.textInsideGravity;
        savedState.i0 = this.textOutsideGravity;
        savedState.j0 = this.textPositionPriority;
        return savedState;
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void onViewDraw() {
        drawTextProgress();
        drawTextProgressSize();
        drawTextProgressMargin();
        post(new Runnable() { // from class: com.akexorcist.roundcornerprogressbar.TextRoundCornerProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                TextRoundCornerProgressBar.this.drawTextProgressPosition();
            }
        });
        drawTextProgressColor();
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar, com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setProgress(int i2) {
        setProgress(i2);
    }

    public void setProgressText(String str) {
        this.textProgress = str;
        drawTextProgress();
        drawTextProgressPosition();
    }

    public void setTextInsideGravity(int i2) {
        this.textInsideGravity = i2;
        drawTextProgressPosition();
    }

    public void setTextOutsideGravity(int i2) {
        this.textOutsideGravity = i2;
        drawTextProgressPosition();
    }

    public void setTextPositionPriority(int i2) {
        this.textPositionPriority = i2;
        drawTextProgressPosition();
    }

    public void setTextProgressColor(int i2) {
        this.colorTextProgress = i2;
        drawTextProgressColor();
    }

    public void setTextProgressMargin(int i2) {
        this.textProgressMargin = i2;
        drawTextProgressMargin();
        drawTextProgressPosition();
    }

    public void setTextProgressSize(int i2) {
        this.textProgressSize = i2;
        drawTextProgressSize();
        drawTextProgressPosition();
    }

    public TextRoundCornerProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar, com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void setProgress(float f) {
        super.setProgress(f);
        drawTextProgressPosition();
    }
}
