package com.google.android.material.floatingtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.restrictive;
import androidx.core.view.hardpan;
import androidx.core.view.premeiotic;
import androidx.core.view.supplicat;
import bubbles.dern;
import bubbles.formularize;
import bubbles.impassible;
import chinny.kowloon;
import chinny.taiyuan;
import com.google.android.material.internal.rotuma;
import monroe.wireman;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingToolbarLayout extends FrameLayout {
    private static final int DEF_STYLE_RES = formularize.Widget_Material3_FloatingToolbar;
    private static final String TAG = "FloatingToolbarLayout";
    private int bottomMarginWindowInset;
    private int leftMarginWindowInset;
    private boolean marginBottomSystemWindowInsets;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private Rect originalMargins;
    private int rightMarginWindowInset;
    private int topMarginWindowInset;

    public class attabal implements supplicat {
        public attabal() {
        }

        @Override // androidx.core.view.supplicat
        public hardpan attabal(View view, hardpan hardpanVar) {
            if (!FloatingToolbarLayout.this.marginLeftSystemWindowInsets && !FloatingToolbarLayout.this.marginRightSystemWindowInsets && !FloatingToolbarLayout.this.marginTopSystemWindowInsets && !FloatingToolbarLayout.this.marginBottomSystemWindowInsets) {
                return hardpanVar;
            }
            wireman wiremanVarBeachfront = hardpanVar.beachfront(hardpan.triweekly.competently() | hardpan.triweekly.attabal() | hardpan.triweekly.saneness());
            FloatingToolbarLayout.this.bottomMarginWindowInset = wiremanVarBeachfront.f33607wireman;
            FloatingToolbarLayout.this.topMarginWindowInset = wiremanVarBeachfront.f33606saneness;
            FloatingToolbarLayout.this.rightMarginWindowInset = wiremanVarBeachfront.f33605dern;
            FloatingToolbarLayout.this.leftMarginWindowInset = wiremanVarBeachfront.f33604attabal;
            FloatingToolbarLayout.this.updateMargins();
            return hardpanVar;
        }
    }

    public FloatingToolbarLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMargins() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.originalMargins;
        if (rect == null) {
            return;
        }
        int i = rect.left + (this.marginLeftSystemWindowInsets ? this.leftMarginWindowInset : 0);
        int i2 = rect.right + (this.marginRightSystemWindowInsets ? this.rightMarginWindowInset : 0);
        int i3 = rect.top + (this.marginTopSystemWindowInsets ? this.topMarginWindowInset : 0);
        int i4 = rect.bottom + (this.marginBottomSystemWindowInsets ? this.bottomMarginWindowInset : 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.bottomMargin == i4 && marginLayoutParams.leftMargin == i && marginLayoutParams.rightMargin == i2 && marginLayoutParams.topMargin == i3) {
            return;
        }
        marginLayoutParams.bottomMargin = i4;
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i2;
        marginLayoutParams.topMargin = i3;
        requestLayout();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            this.originalMargins = null;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.originalMargins = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        updateMargins();
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, dern.floatingToolbarStyle);
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, DEF_STYLE_RES);
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(crescentade.attabal.wireman(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        restrictive restrictiveVarCutely = rotuma.cutely(context2, attributeSet, impassible.FloatingToolbar, i, i2, new int[0]);
        if (restrictiveVarCutely.molybdenite(impassible.FloatingToolbar_backgroundTint)) {
            int iSaneness = restrictiveVarCutely.saneness(impassible.FloatingToolbar_backgroundTint, 0);
            taiyuan taiyuanVar = new taiyuan(kowloon.marial(context2, attributeSet, i, i2).impassible());
            taiyuanVar.nosophobia(ColorStateList.valueOf(iSaneness));
            setBackground(taiyuanVar);
        }
        this.marginLeftSystemWindowInsets = restrictiveVarCutely.attabal(impassible.FloatingToolbar_marginLeftSystemWindowInsets, true);
        this.marginTopSystemWindowInsets = restrictiveVarCutely.attabal(impassible.FloatingToolbar_marginTopSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = restrictiveVarCutely.attabal(impassible.FloatingToolbar_marginRightSystemWindowInsets, true);
        this.marginBottomSystemWindowInsets = restrictiveVarCutely.attabal(impassible.FloatingToolbar_marginBottomSystemWindowInsets, true);
        premeiotic.picketboat(this, new attabal());
        restrictiveVarCutely.rotuma();
    }
}
