package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CompoundButtonCompat;

/* JADX INFO: loaded from: classes.dex */
class AppCompatCompoundButtonHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompoundButton f3550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f3551b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f3552c = null;
    public boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3553e = false;
    public boolean f;

    public AppCompatCompoundButtonHelper(CompoundButton compoundButton) {
        this.f3550a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f3550a;
        Drawable drawableA = CompoundButtonCompat.a(compoundButton);
        if (drawableA != null) {
            if (this.d || this.f3553e) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.d) {
                    DrawableCompat.j(drawableMutate, this.f3551b);
                }
                if (this.f3553e) {
                    DrawableCompat.k(drawableMutate, this.f3552c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i2) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.f3550a;
        Context context = compoundButton.getContext();
        int[] iArr = R.styleable.m;
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, iArr, i2);
        TypedArray typedArray = tintTypedArrayE.f3646b;
        ViewCompat.y(compoundButton, compoundButton.getContext(), iArr, attributeSet, tintTypedArrayE.f3646b, i2);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AppCompatResources.a(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AppCompatResources.a(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AppCompatResources.a(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                CompoundButtonCompat.d(compoundButton, tintTypedArrayE.a(2));
            }
            if (typedArray.hasValue(3)) {
                CompoundButtonCompat.e(compoundButton, DrawableUtils.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            tintTypedArrayE.f();
        }
    }
}
