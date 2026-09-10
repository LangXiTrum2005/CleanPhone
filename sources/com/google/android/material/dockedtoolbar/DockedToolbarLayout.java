package com.google.android.material.dockedtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.restrictive;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.hardpan;
import bubbles.dern;
import bubbles.formularize;
import bubbles.impassible;
import chinny.kowloon;
import chinny.taiyuan;
import com.google.android.material.internal.cuirassed;
import com.google.android.material.internal.rotuma;
import monroe.wireman;

/* JADX INFO: loaded from: classes3.dex */
public class DockedToolbarLayout extends FrameLayout {
    private static final int DEF_STYLE_RES = formularize.Widget_Material3_DockedToolbar;
    private static final String TAG = "DockedToolbarLayout";
    private Boolean paddingBottomSystemWindowInsets;
    private Boolean paddingTopSystemWindowInsets;

    public class attabal implements cuirassed.wireman {
        public attabal() {
        }

        @Override // com.google.android.material.internal.cuirassed.wireman
        public hardpan attabal(View view, hardpan hardpanVar, cuirassed.marial marialVar) {
            if (DockedToolbarLayout.this.paddingTopSystemWindowInsets != null && DockedToolbarLayout.this.paddingBottomSystemWindowInsets != null && !DockedToolbarLayout.this.paddingTopSystemWindowInsets.booleanValue() && !DockedToolbarLayout.this.paddingBottomSystemWindowInsets.booleanValue()) {
                return hardpanVar;
            }
            wireman wiremanVarBeachfront = hardpanVar.beachfront(hardpan.triweekly.competently() | hardpan.triweekly.attabal() | hardpan.triweekly.saneness());
            int i = wiremanVarBeachfront.f33607wireman;
            int i2 = wiremanVarBeachfront.f33606saneness;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i3 = (DockedToolbarLayout.this.hasGravity(layoutParams, 48) && DockedToolbarLayout.this.paddingTopSystemWindowInsets == null && DockedToolbarLayout.this.getFitsSystemWindows()) ? i2 : 0;
            int i4 = (DockedToolbarLayout.this.hasGravity(layoutParams, 80) && DockedToolbarLayout.this.paddingBottomSystemWindowInsets == null && DockedToolbarLayout.this.getFitsSystemWindows()) ? i : 0;
            if (DockedToolbarLayout.this.paddingBottomSystemWindowInsets != null) {
                if (!DockedToolbarLayout.this.paddingBottomSystemWindowInsets.booleanValue()) {
                    i = 0;
                }
                i4 = i;
            }
            if (DockedToolbarLayout.this.paddingTopSystemWindowInsets != null) {
                if (!DockedToolbarLayout.this.paddingTopSystemWindowInsets.booleanValue()) {
                    i2 = 0;
                }
                i3 = i2;
            }
            marialVar.f20448saneness += i3;
            marialVar.f20449wireman += i4;
            marialVar.attabal(view);
            return hardpanVar;
        }
    }

    public DockedToolbarLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasGravity(ViewGroup.LayoutParams layoutParams, int i) {
        if (layoutParams instanceof CoordinatorLayout.marial) {
            return (((CoordinatorLayout.marial) layoutParams).f9093dern & i) == i;
        }
        return (layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & i) == i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            int childCount = getChildCount();
            int iMax = Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom());
            for (int i3 = 0; i3 < childCount; i3++) {
                measureChild(getChildAt(i3), i, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
            }
            setMeasuredDimension(getMeasuredWidth(), iMax);
        }
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, dern.dockedToolbarStyle);
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, DEF_STYLE_RES);
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(crescentade.attabal.wireman(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        restrictive restrictiveVarCutely = rotuma.cutely(context2, attributeSet, impassible.DockedToolbar, i, i2, new int[0]);
        if (restrictiveVarCutely.molybdenite(impassible.DockedToolbar_backgroundTint)) {
            int iSaneness = restrictiveVarCutely.saneness(impassible.DockedToolbar_backgroundTint, 0);
            taiyuan taiyuanVar = new taiyuan(kowloon.marial(context2, attributeSet, i, i2).impassible());
            taiyuanVar.nosophobia(ColorStateList.valueOf(iSaneness));
            setBackground(taiyuanVar);
        }
        if (restrictiveVarCutely.molybdenite(impassible.DockedToolbar_paddingTopSystemWindowInsets)) {
            this.paddingTopSystemWindowInsets = Boolean.valueOf(restrictiveVarCutely.attabal(impassible.DockedToolbar_paddingTopSystemWindowInsets, true));
        }
        if (restrictiveVarCutely.molybdenite(impassible.DockedToolbar_paddingBottomSystemWindowInsets)) {
            this.paddingBottomSystemWindowInsets = Boolean.valueOf(restrictiveVarCutely.attabal(impassible.DockedToolbar_paddingBottomSystemWindowInsets, true));
        }
        cuirassed.beachfront(this, new attabal());
        setImportantForAccessibility(1);
        restrictiveVarCutely.rotuma();
    }
}
