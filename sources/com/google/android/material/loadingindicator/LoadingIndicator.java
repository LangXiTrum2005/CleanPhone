package com.google.android.material.loadingindicator;

import acaudal.dern;
import acaudal.saneness;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import bubbles.formularize;
import com.google.android.material.progressindicator.attabal;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class LoadingIndicator extends View implements Drawable.Callback {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final int f20540monoploid = formularize.Widget_Material3_LoadingIndicator;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final LoadingIndicatorSpec f20541arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final saneness f20542kowloon;

    public LoadingIndicator(Context context) {
        this(context, null);
    }

    public boolean attabal() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    public int getContainerColor() {
        return this.f20541arytenoidectomy.f20544beachfront;
    }

    public int getContainerHeight() {
        return this.f20541arytenoidectomy.f20548wireman;
    }

    public int getContainerWidth() {
        return this.f20541arytenoidectomy.f20545dern;
    }

    public saneness getDrawable() {
        return this.f20542kowloon;
    }

    public int[] getIndicatorColor() {
        return this.f20541arytenoidectomy.f20546marial;
    }

    public int getIndicatorSize() {
        return this.f20541arytenoidectomy.f20547saneness;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        this.f20542kowloon.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        dern dernVarDern = this.f20542kowloon.dern();
        int iMarial = dernVarDern.marial() + getPaddingLeft() + getPaddingRight();
        int iWireman = dernVarDern.wireman() + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(size, iMarial), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(iMarial, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, iWireman), 1073741824);
        } else if (mode2 == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(iWireman, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f20542kowloon.setBounds(0, 0, i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.f20542kowloon.beachfront(saneness(), false, i == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f20542kowloon.beachfront(saneness(), false, i == 0);
    }

    public boolean saneness() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && attabal();
    }

    public void setAnimatorDurationScaleProvider(attabal attabalVar) {
        this.f20542kowloon.f3267kowloon = attabalVar;
    }

    public void setContainerColor(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f20541arytenoidectomy;
        if (loadingIndicatorSpec.f20544beachfront != i) {
            loadingIndicatorSpec.f20544beachfront = i;
            invalidate();
        }
    }

    public void setContainerHeight(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f20541arytenoidectomy;
        if (loadingIndicatorSpec.f20548wireman != i) {
            loadingIndicatorSpec.f20548wireman = i;
            requestLayout();
            invalidate();
        }
    }

    public void setContainerWidth(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f20541arytenoidectomy;
        if (loadingIndicatorSpec.f20545dern != i) {
            loadingIndicatorSpec.f20545dern = i;
            requestLayout();
            invalidate();
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{pyrope.attabal.saneness(getContext(), beachfront.attabal.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f20541arytenoidectomy.f20546marial = iArr;
        this.f20542kowloon.saneness().impromptu();
        invalidate();
    }

    public void setIndicatorSize(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f20541arytenoidectomy;
        if (loadingIndicatorSpec.f20547saneness != i) {
            loadingIndicatorSpec.f20547saneness = i;
            requestLayout();
            invalidate();
        }
    }

    public LoadingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bubbles.dern.loadingIndicatorStyle);
    }

    public LoadingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(crescentade.attabal.wireman(context, attributeSet, i, f20540monoploid), attributeSet, i);
        Context context2 = getContext();
        saneness sanenessVarAttabal = saneness.attabal(context2, new LoadingIndicatorSpec(context2, attributeSet, i));
        this.f20542kowloon = sanenessVarAttabal;
        sanenessVarAttabal.setCallback(this);
        this.f20541arytenoidectomy = sanenessVarAttabal.dern().f3257attabal;
        setAnimatorDurationScaleProvider(new attabal());
    }
}
