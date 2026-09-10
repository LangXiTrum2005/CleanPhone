package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.impromptu;
import androidx.constraintlayout.core.widgets.taiyuan;
import androidx.constraintlayout.core.widgets.wireman;
import androidx.constraintlayout.widget.VirtualLayout;
import sayid.attabal;

/* JADX INFO: loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public impromptu f8425cord;

    public MotionPlaceholder(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void kowloon(AttributeSet attributeSet) {
        super.kowloon(attributeSet);
        this.f8786polloi = new impromptu();
        gintrap();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onMeasure(int i, int i2) {
        rotuma(this.f8425cord, i, i2);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void rotuma(taiyuan taiyuanVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (taiyuanVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            taiyuanVar.alloy(mode, size, mode2, size2);
            setMeasuredDimension(taiyuanVar.collection(), taiyuanVar.cybernatic());
        }
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void adultoid(wireman wiremanVar, attabal attabalVar, SparseArray<ConstraintWidget> sparseArray) {
    }
}
