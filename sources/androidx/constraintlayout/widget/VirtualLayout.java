package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {
    public boolean l0;
    public boolean m0;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void f(AttributeSet attributeSet) {
        super.f(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f4127b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.l0 = true;
                } else if (index == 13) {
                    this.m0 = true;
                }
            }
        }
    }

    public void k(androidx.constraintlayout.solver.widgets.VirtualLayout virtualLayout, int i2, int i3) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.l0 || this.m0) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f0; i2++) {
                View viewById = constraintLayout.getViewById(this.e0[i2]);
                if (viewById != null) {
                    if (this.l0) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.m0 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        c();
    }
}
