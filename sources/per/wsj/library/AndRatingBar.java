package per.wsj.library;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4028m90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4260oo0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4412qc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3667i4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XW;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"AppCompatCustomView"})
public class AndRatingBar extends RatingBar implements RatingBar.OnRatingBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f5360a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final int d;
    public final int e;
    public final boolean f;
    public float g;
    public float h;
    public final boolean i;
    public final C4028m90 j;

    public AndRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, XW.f3972a, 0, 0);
        this.i = typedArrayObtainStyledAttributes.getBoolean(3, false);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            if (this.i) {
                this.c = typedArrayObtainStyledAttributes.getColorStateList(5);
            } else {
                this.f5360a = typedArrayObtainStyledAttributes.getColorStateList(5);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(8) && !this.i) {
            this.b = typedArrayObtainStyledAttributes.getColorStateList(8);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            if (this.i) {
                this.f5360a = typedArrayObtainStyledAttributes.getColorStateList(0);
            } else {
                this.c = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.g = typedArrayObtainStyledAttributes.getFloat(4, 1.0f);
        this.h = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        this.d = typedArrayObtainStyledAttributes.getResourceId(6, 2131231192);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.e = typedArrayObtainStyledAttributes.getResourceId(1, 2131231192);
        } else {
            this.e = this.d;
        }
        typedArrayObtainStyledAttributes.recycle();
        int numStars = getNumStars();
        int i = this.e;
        int i2 = this.d;
        ColorStateList colorStateList = this.c;
        ColorStateList colorStateList2 = this.b;
        ColorStateList colorStateList3 = this.f5360a;
        boolean z = this.f;
        C4260oo0 c4260oo0 = new C4260oo0();
        c4260oo0.f4809a = context;
        C4028m90 c4028m90 = new C4028m90(new Drawable[]{c4260oo0.a(i, R.attr.colorControlHighlight, z), new ClipDrawable(c4260oo0.b(i2, 0), 3, 1), new ClipDrawable(c4260oo0.a(i2, R.attr.colorControlActivated, z), 3, 1)});
        c4028m90.setId(0, android.R.id.background);
        c4028m90.setId(1, android.R.id.secondaryProgress);
        c4028m90.setId(2, android.R.id.progress);
        C4412qc0 c4412qc0A = c4028m90.a(android.R.id.background);
        C4412qc0 c4412qc0A2 = c4028m90.a(android.R.id.secondaryProgress);
        C4412qc0 c4412qc0A3 = c4028m90.a(android.R.id.progress);
        c4412qc0A.e(numStars);
        c4412qc0A2.e(numStars);
        c4412qc0A3.e(numStars);
        if (colorStateList != null) {
            c4412qc0A.setTintList(colorStateList);
        }
        if (colorStateList2 != null) {
            c4412qc0A2.setTintList(colorStateList2);
        }
        if (colorStateList3 != null) {
            c4412qc0A3.setTintList(colorStateList3);
        }
        this.j = c4028m90;
        setProgressDrawable(c4028m90);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        Drawable drawable = this.j.a(android.R.id.progress).g;
        setMeasuredDimension(View.resolveSizeAndState(Math.round(measuredHeight * (drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * getNumStars() * this.g) + ((int) ((getNumStars() - 1) * this.h)), i, 0), measuredHeight);
    }

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
    }

    @Override // android.widget.RatingBar
    public void setNumStars(int i) {
        super.setNumStars(i);
        C4028m90 c4028m90 = this.j;
        if (c4028m90 != null) {
            c4028m90.a(android.R.id.background).e(i);
            c4028m90.a(android.R.id.secondaryProgress).e(i);
            c4028m90.a(android.R.id.progress).e(i);
        }
    }

    public void setOnRatingChangeListener(InterfaceC3667i4 interfaceC3667i4) {
        setOnRatingBarChangeListener(this);
    }

    @Override // android.widget.RatingBar
    public void setRating(float f) {
        super.setRating(f);
        if (this.i) {
            super.setRating(getNumStars() - getRating());
        }
    }

    public void setScaleFactor(float f) {
        this.g = f;
        requestLayout();
    }

    public void setStarSpacing(float f) {
        this.h = f;
        requestLayout();
    }
}
