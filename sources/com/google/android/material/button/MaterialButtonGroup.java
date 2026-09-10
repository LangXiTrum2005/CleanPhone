package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bubbles.formularize;
import bubbles.impassible;
import chinny.dovishness;
import chinny.gintrap;
import chinny.kowloon;
import com.google.android.material.internal.cuirassed;
import com.google.android.material.internal.rotuma;
import com.google.android.material.shape.StateListSizeChange;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonGroup extends LinearLayout {
    private static final int DEF_STYLE_RES = formularize.Widget_Material3_MaterialButtonGroup;
    private static final String LOG_TAG = "MButtonGroup";
    private StateListSizeChange buttonSizeChange;
    private Integer[] childOrder;
    private final Comparator<MaterialButton> childOrderComparator;
    private boolean childShapesDirty;
    private gintrap groupStateListShapeAppearance;
    dovishness innerCornerSize;
    private final List<kowloon> originalChildShapeAppearanceModels;
    private final List<gintrap> originalChildStateListShapeAppearanceModels;
    private final saneness pressedStateTracker;
    private int spacing;

    public class saneness implements MaterialButton.dern {
        public saneness() {
        }

        @Override // com.google.android.material.button.MaterialButton.dern
        public void attabal(MaterialButton materialButton, boolean z) {
            MaterialButtonGroup.this.invalidate();
        }
    }

    public MaterialButtonGroup(Context context) {
        this(context, null);
    }

    private void adjustChildMarginsAndUpdateLayout() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton childButton = getChildButton(i);
            MaterialButton childButton2 = getChildButton(i - 1);
            if (this.spacing <= 0) {
                iMin = Math.min(childButton.getStrokeWidth(), childButton2.getStrokeWidth());
                childButton.setShouldDrawSurfaceColorStroke(true);
                childButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                childButton.setShouldDrawSurfaceColorStroke(false);
                childButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsBuildLayoutParams = buildLayoutParams(childButton);
            if (getOrientation() == 0) {
                layoutParamsBuildLayoutParams.setMarginEnd(0);
                layoutParamsBuildLayoutParams.setMarginStart(this.spacing - iMin);
                layoutParamsBuildLayoutParams.topMargin = 0;
            } else {
                layoutParamsBuildLayoutParams.bottomMargin = 0;
                layoutParamsBuildLayoutParams.topMargin = this.spacing - iMin;
                layoutParamsBuildLayoutParams.setMarginStart(0);
            }
            childButton.setLayoutParams(layoutParamsBuildLayoutParams);
        }
        resetChildMargins(firstVisibleChildIndex);
    }

    private void adjustChildSizeChange() {
        if (this.buttonSizeChange == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (isChildVisible(i)) {
                int buttonAllowedWidthIncrease = getButtonAllowedWidthIncrease(i);
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    buttonAllowedWidthIncrease /= 2;
                }
                iMin = Math.min(iMin, buttonAllowedWidthIncrease);
            }
        }
        int i2 = firstVisibleChildIndex;
        while (i2 <= lastVisibleChildIndex) {
            if (isChildVisible(i2)) {
                getChildButton(i2).setSizeChange(this.buttonSizeChange);
                getChildButton(i2).setWidthChangeMax((i2 == firstVisibleChildIndex || i2 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i2++;
        }
    }

    public static /* synthetic */ int attabal(MaterialButtonGroup materialButtonGroup, MaterialButton materialButton, MaterialButton materialButton2) {
        materialButtonGroup.getClass();
        int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonGroup.indexOfChild(materialButton), materialButtonGroup.indexOfChild(materialButton2));
    }

    private int getButtonAllowedWidthIncrease(int i) {
        if (!isChildVisible(i) || this.buttonSizeChange == null) {
            return 0;
        }
        int iMax = Math.max(0, this.buttonSizeChange.dern(getChildButton(i).getWidth()));
        MaterialButton prevVisibleChildButton = getPrevVisibleChildButton(i);
        int allowedWidthDecrease = prevVisibleChildButton == null ? 0 : prevVisibleChildButton.getAllowedWidthDecrease();
        MaterialButton nextVisibleChildButton = getNextVisibleChildButton(i);
        return Math.min(iMax, allowedWidthDecrease + (nextVisibleChildButton != null ? nextVisibleChildButton.getAllowedWidthDecrease() : 0));
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (isChildVisible(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (isChildVisible(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private MaterialButton getNextVisibleChildButton(int i) {
        int childCount = getChildCount();
        do {
            i++;
            if (i >= childCount) {
                return null;
            }
        } while (!isChildVisible(i));
        return getChildButton(i);
    }

    private gintrap.saneness getOriginalStateListShapeBuilder(boolean z, boolean z2, int i) {
        gintrap gintrapVar = this.groupStateListShapeAppearance;
        if (gintrapVar == null || (!z && !z2)) {
            gintrapVar = this.originalChildStateListShapeAppearanceModels.get(i);
        }
        return gintrapVar == null ? new gintrap.saneness(this.originalChildShapeAppearanceModels.get(i)) : gintrapVar.taiyuan();
    }

    private MaterialButton getPrevVisibleChildButton(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (isChildVisible(i2)) {
                return getChildButton(i2);
            }
        }
        return null;
    }

    private boolean isChildVisible(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    private void recoverAllChildrenLayoutParams() {
        for (int i = 0; i < getChildCount(); i++) {
            getChildButton(i).recoverOriginalLayoutParams();
        }
    }

    private void resetChildMargins(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildButton(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    private void updateChildOrder() {
        TreeMap treeMap = new TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(getChildButton(i), Integer.valueOf(i));
        }
        this.childOrder = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            recoverAllChildrenLayoutParams();
            this.childShapesDirty = true;
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            materialButton.setOnPressedChangeListenerInternal(this.pressedStateTracker);
            this.originalChildShapeAppearanceModels.add(materialButton.getShapeAppearanceModel());
            this.originalChildStateListShapeAppearanceModels.add(materialButton.getStateListShapeAppearanceModel());
            materialButton.setEnabled(isEnabled());
        }
    }

    public LinearLayout.LayoutParams buildLayoutParams(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        updateChildOrder();
        super.dispatchDraw(canvas);
    }

    public StateListSizeChange getButtonSizeChange() {
        return this.buttonSizeChange;
    }

    public MaterialButton getChildButton(int i) {
        return (MaterialButton) getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.childOrder;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public chinny.wireman getInnerCornerSize() {
        return this.innerCornerSize.marial();
    }

    public dovishness getInnerCornerSizeStateList() {
        return this.innerCornerSize;
    }

    public kowloon getShapeAppearance() {
        gintrap gintrapVar = this.groupStateListShapeAppearance;
        if (gintrapVar == null) {
            return null;
        }
        return gintrapVar.dern(true);
    }

    public int getSpacing() {
        return this.spacing;
    }

    public gintrap getStateListShapeAppearance() {
        return this.groupStateListShapeAppearance;
    }

    public void onButtonWidthChanged(MaterialButton materialButton, int i) {
        int iIndexOfChild = indexOfChild(materialButton);
        if (iIndexOfChild < 0) {
            return;
        }
        MaterialButton prevVisibleChildButton = getPrevVisibleChildButton(iIndexOfChild);
        MaterialButton nextVisibleChildButton = getNextVisibleChildButton(iIndexOfChild);
        if (prevVisibleChildButton == null && nextVisibleChildButton == null) {
            return;
        }
        if (prevVisibleChildButton == null) {
            nextVisibleChildButton.setDisplayedWidthDecrease(i);
        }
        if (nextVisibleChildButton == null) {
            prevVisibleChildButton.setDisplayedWidthDecrease(i);
        }
        if (prevVisibleChildButton == null || nextVisibleChildButton == null) {
            return;
        }
        prevVisibleChildButton.setDisplayedWidthDecrease(i / 2);
        nextVisibleChildButton.setDisplayedWidthDecrease((i + 1) / 2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            recoverAllChildrenLayoutParams();
            adjustChildSizeChange();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.originalChildShapeAppearanceModels.remove(iIndexOfChild);
            this.originalChildStateListShapeAppearanceModels.remove(iIndexOfChild);
        }
        this.childShapesDirty = true;
        updateChildShapes();
        recoverAllChildrenLayoutParams();
        adjustChildMarginsAndUpdateLayout();
    }

    public void setButtonSizeChange(StateListSizeChange stateListSizeChange) {
        if (this.buttonSizeChange != stateListSizeChange) {
            this.buttonSizeChange = stateListSizeChange;
            adjustChildSizeChange();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            getChildButton(i).setEnabled(z);
        }
    }

    public void setInnerCornerSize(chinny.wireman wiremanVar) {
        this.innerCornerSize = dovishness.dern(wiremanVar);
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public void setInnerCornerSizeStateList(dovishness dovishnessVar) {
        this.innerCornerSize = dovishnessVar;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.childShapesDirty = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(kowloon kowloonVar) {
        this.groupStateListShapeAppearance = new gintrap.saneness(kowloonVar).cutely();
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public void setSpacing(int i) {
        this.spacing = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(gintrap gintrapVar) {
        this.groupStateListShapeAppearance = gintrapVar;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public void updateChildShapes() {
        int iImpromptu;
        if (!(this.innerCornerSize == null && this.groupStateListShapeAppearance == null) && this.childShapesDirty) {
            this.childShapesDirty = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i = 0;
            while (i < childCount) {
                MaterialButton childButton = getChildButton(i);
                if (childButton.getVisibility() != 8) {
                    boolean z = i == firstVisibleChildIndex;
                    boolean z2 = i == lastVisibleChildIndex;
                    gintrap.saneness originalStateListShapeBuilder = getOriginalStateListShapeBuilder(z, z2, i);
                    boolean z3 = getOrientation() == 0;
                    boolean zImpassible = cuirassed.impassible(this);
                    if (z3) {
                        iImpromptu = z ? 5 : 0;
                        if (z2) {
                            iImpromptu |= 10;
                        }
                        if (zImpassible) {
                            iImpromptu = gintrap.impromptu(iImpromptu);
                        }
                    } else {
                        iImpromptu = z ? 3 : 0;
                        if (z2) {
                            iImpromptu |= 12;
                        }
                    }
                    gintrap gintrapVarCutely = originalStateListShapeBuilder.triweekly(this.innerCornerSize, ~iImpromptu).cutely();
                    if (gintrapVarCutely.beachfront()) {
                        childButton.setStateListShapeAppearanceModel(gintrapVarCutely);
                    } else {
                        childButton.setShapeAppearanceModel(gintrapVarCutely.dern(true));
                    }
                }
                i++;
            }
        }
    }

    public MaterialButtonGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bubbles.dern.materialButtonGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(crescentade.attabal.wireman(context, attributeSet, i, i2), attributeSet, i);
        this.originalChildShapeAppearanceModels = new ArrayList();
        this.originalChildStateListShapeAppearanceModels = new ArrayList();
        this.pressedStateTracker = new saneness();
        this.childOrderComparator = new Comparator() { // from class: com.google.android.material.button.dern
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MaterialButtonGroup.attabal(this.f19828kowloon, (MaterialButton) obj, (MaterialButton) obj2);
            }
        };
        this.childShapesDirty = true;
        Context context2 = getContext();
        TypedArray typedArrayTaiyuan = rotuma.taiyuan(context2, attributeSet, impassible.MaterialButtonGroup, i, i2, new int[0]);
        if (typedArrayTaiyuan.hasValue(impassible.MaterialButtonGroup_buttonSizeChange)) {
            this.buttonSizeChange = StateListSizeChange.saneness(context2, typedArrayTaiyuan, impassible.MaterialButtonGroup_buttonSizeChange);
        }
        if (typedArrayTaiyuan.hasValue(impassible.MaterialButtonGroup_shapeAppearance)) {
            gintrap gintrapVarSaneness = gintrap.saneness(context2, typedArrayTaiyuan, impassible.MaterialButtonGroup_shapeAppearance);
            this.groupStateListShapeAppearance = gintrapVarSaneness;
            if (gintrapVarSaneness == null) {
                this.groupStateListShapeAppearance = new gintrap.saneness(kowloon.saneness(context2, typedArrayTaiyuan.getResourceId(impassible.MaterialButtonGroup_shapeAppearance, 0), typedArrayTaiyuan.getResourceId(impassible.MaterialButtonGroup_shapeAppearanceOverlay, 0)).impassible()).cutely();
            }
        }
        if (typedArrayTaiyuan.hasValue(impassible.MaterialButtonGroup_innerCornerSize)) {
            this.innerCornerSize = dovishness.saneness(context2, typedArrayTaiyuan, impassible.MaterialButtonGroup_innerCornerSize, new chinny.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        this.spacing = typedArrayTaiyuan.getDimensionPixelSize(impassible.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayTaiyuan.getBoolean(impassible.MaterialButtonGroup_android_enabled, true));
        typedArrayTaiyuan.recycle();
    }
}
