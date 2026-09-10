package com.badlogic.gdx.backends.android.surfaceview;

/* JADX INFO: loaded from: classes.dex */
public class FixedResolutionStrategy implements ResolutionStrategy {
    private final int height;
    private final int width;

    public FixedResolutionStrategy(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override // com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy
    public ResolutionStrategy.MeasuredDimension calcMeasures(int i, int i2) {
        return new ResolutionStrategy.MeasuredDimension(this.width, this.height);
    }
}
