package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class Group extends ConstraintHelper {
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void h() {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.l0.z(0);
        layoutParams.l0.w(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
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
