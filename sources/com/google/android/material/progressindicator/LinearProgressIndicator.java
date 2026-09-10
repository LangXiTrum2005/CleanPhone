package com.google.android.material.progressindicator;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface IndeterminateAnimationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public int getIndeterminateAnimationType() {
        throw null;
    }

    public int getIndicatorDirection() {
        throw null;
    }

    public int getTrackStopIndicatorSize() {
        throw null;
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        throw null;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        int paddingRight = i2 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i3 - (getPaddingBottom() + getPaddingTop());
        IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        DeterminateDrawable<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i2) {
        throw null;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        throw null;
    }

    public void setIndicatorDirection(int i2) {
        throw null;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i2) {
        super.setTrackCornerRadius(i2);
        throw null;
    }

    public void setTrackStopIndicatorSize(int i2) {
        throw null;
    }
}
