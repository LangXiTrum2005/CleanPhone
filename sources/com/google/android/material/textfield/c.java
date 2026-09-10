package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f19535Y;

    public /* synthetic */ c(EndIconDelegate endIconDelegate, int i2) {
        this.X = i2;
        this.f19535Y = endIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.X) {
            case 0:
                ClearTextEndIconDelegate clearTextEndIconDelegate = (ClearTextEndIconDelegate) this.f19535Y;
                clearTextEndIconDelegate.getClass();
                clearTextEndIconDelegate.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                ClearTextEndIconDelegate clearTextEndIconDelegate2 = (ClearTextEndIconDelegate) this.f19535Y;
                clearTextEndIconDelegate2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = clearTextEndIconDelegate2.d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
                break;
            default:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) this.f19535Y;
                dropdownMenuEndIconDelegate.getClass();
                dropdownMenuEndIconDelegate.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
