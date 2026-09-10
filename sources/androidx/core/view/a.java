package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements DifferentialMotionFlingController.FlingVelocityThresholdCalculator, DifferentialMotionFlingController.DifferentialVelocityProvider {
    @Override // androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator
    public final void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        DifferentialMotionFlingController.calculateFlingVelocityThresholds(context, iArr, motionEvent, i);
    }

    @Override // androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider
    public final float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        return DifferentialMotionFlingController.getCurrentVelocity(velocityTracker, motionEvent, i);
    }
}
