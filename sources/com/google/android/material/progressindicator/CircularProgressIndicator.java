package com.google.android.material.progressindicator;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public int getIndicatorDirection() {
        throw null;
    }

    public int getIndicatorInset() {
        throw null;
    }

    public int getIndicatorSize() {
        throw null;
    }

    public void setIndicatorDirection(int i2) {
        throw null;
    }

    public void setIndicatorInset(int i2) {
        throw null;
    }

    public void setIndicatorSize(int i2) {
        Math.max(i2, getTrackThickness() * 2);
        throw null;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i2) {
        super.setTrackThickness(i2);
        throw null;
    }
}
