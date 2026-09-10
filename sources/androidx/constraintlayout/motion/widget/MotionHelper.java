package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements Animatable, MotionLayout.TransitionListener {
    public float l0;
    public View[] m0;

    public float getProgress() {
        return this.l0;
    }

    public void setProgress(float f) {
        this.l0 = f;
        int i2 = 0;
        if (this.f0 > 0) {
            this.m0 = e((ConstraintLayout) getParent());
            while (i2 < this.f0) {
                View view = this.m0[i2];
                i2++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i2 < childCount) {
            boolean z2 = viewGroup.getChildAt(i2) instanceof MotionHelper;
            i2++;
        }
    }
}
