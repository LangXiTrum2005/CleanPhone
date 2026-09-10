package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float m0;
        public boolean n0;
        public float o0;
        public float p0;
        public float q0;
        public float r0;
        public float s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.m0 = 1.0f;
        layoutParams.n0 = false;
        layoutParams.o0 = 0.0f;
        layoutParams.p0 = 0.0f;
        layoutParams.q0 = 0.0f;
        layoutParams.r0 = 0.0f;
        layoutParams.s0 = 1.0f;
        layoutParams.t0 = 1.0f;
        layoutParams.u0 = 0.0f;
        layoutParams.v0 = 0.0f;
        layoutParams.w0 = 0.0f;
        layoutParams.x0 = 0.0f;
        layoutParams.y0 = 0.0f;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.m0 = 1.0f;
        layoutParams.n0 = false;
        layoutParams.o0 = 0.0f;
        layoutParams.p0 = 0.0f;
        layoutParams.q0 = 0.0f;
        layoutParams.r0 = 0.0f;
        layoutParams.s0 = 1.0f;
        layoutParams.t0 = 1.0f;
        layoutParams.u0 = 0.0f;
        layoutParams.v0 = 0.0f;
        layoutParams.w0 = 0.0f;
        layoutParams.x0 = 0.0f;
        layoutParams.y0 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f4128c);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 15) {
                layoutParams.m0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.m0);
            } else if (index == 28) {
                layoutParams.o0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.o0);
                layoutParams.n0 = true;
            } else if (index == 23) {
                layoutParams.q0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.q0);
            } else if (index == 24) {
                layoutParams.r0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.r0);
            } else if (index == 22) {
                layoutParams.p0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.p0);
            } else if (index == 20) {
                layoutParams.s0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.s0);
            } else if (index == 21) {
                layoutParams.t0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.t0);
            } else if (index == 16) {
                layoutParams.u0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.u0);
            } else if (index == 17) {
                layoutParams.v0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.v0);
            } else if (index == 18) {
                layoutParams.w0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.w0);
            } else if (index == 19) {
                layoutParams.x0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.x0);
            } else if (index == 27) {
                layoutParams.y0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.y0);
            }
        }
        return layoutParams;
    }

    public ConstraintSet getConstraintSet() {
        getChildCount();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }
}
