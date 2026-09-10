package com.google.android.material.transition;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
interface FitModeEvaluator {
    FitModeResult a(float f, float f2, float f3, float f4, float f5, float f6, float f7);

    boolean b(FitModeResult fitModeResult);

    void c(RectF rectF, float f, FitModeResult fitModeResult);
}
