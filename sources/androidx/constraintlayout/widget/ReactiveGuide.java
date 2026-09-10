package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import sensatory.wireman;

/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements saneness.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f8915arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f8916kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f8917monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f8918polloi;

    public ReactiveGuide(Context context) {
        super(context);
        this.f8916kowloon = -1;
        this.f8915arytenoidectomy = false;
        this.f8917monoploid = 0;
        this.f8918polloi = true;
        super.setVisibility(8);
        attabal(null);
    }

    public final void attabal(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wireman.ConstraintLayout_ReactiveGuide);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == wireman.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f8916kowloon = typedArrayObtainStyledAttributes.getResourceId(index, this.f8916kowloon);
                } else if (index == wireman.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f8915arytenoidectomy = typedArrayObtainStyledAttributes.getBoolean(index, this.f8915arytenoidectomy);
                } else if (index == wireman.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.f8917monoploid = typedArrayObtainStyledAttributes.getResourceId(index, this.f8917monoploid);
                } else if (index == wireman.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.f8918polloi = typedArrayObtainStyledAttributes.getBoolean(index, this.f8918polloi);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f8916kowloon != -1) {
            ConstraintLayout.getSharedValues().attabal(this.f8916kowloon, this);
        }
    }

    public int getApplyToConstraintSetId() {
        return this.f8917monoploid;
    }

    public int getAttributeId() {
        return this.f8916kowloon;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.f8915arytenoidectomy = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.f8917monoploid = i;
    }

    public void setAttributeId(int i) {
        saneness sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f8916kowloon;
        if (i2 != -1) {
            sharedValues.saneness(i2, this);
        }
        this.f8916kowloon = i;
        if (i != -1) {
            sharedValues.attabal(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f8815attabal = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f8867saneness = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f8828dern = f;
        setLayoutParams(layoutParams);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8916kowloon = -1;
        this.f8915arytenoidectomy = false;
        this.f8917monoploid = 0;
        this.f8918polloi = true;
        super.setVisibility(8);
        attabal(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8916kowloon = -1;
        this.f8915arytenoidectomy = false;
        this.f8917monoploid = 0;
        this.f8918polloi = true;
        super.setVisibility(8);
        attabal(attributeSet);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
