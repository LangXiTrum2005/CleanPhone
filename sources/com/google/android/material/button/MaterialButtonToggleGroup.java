package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int o0 = 0;
    public final ArrayList e0;
    public final PressedStateTracker f0;
    public final LinkedHashSet g0;
    public final Comparator h0;
    public Integer[] i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public final int m0;
    public HashSet n0;

    public static class CornerData {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AbsoluteCornerSize f19152e = new AbsoluteCornerSize(0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CornerSize f19153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CornerSize f19154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CornerSize f19155c;
        public final CornerSize d;

        public CornerData(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
            this.f19153a = cornerSize;
            this.f19154b = cornerSize3;
            this.f19155c = cornerSize4;
            this.d = cornerSize2;
        }
    }

    public interface OnButtonCheckedListener {
        void a(int i2, boolean z2);
    }

    public class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        public PressedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public final void a() {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (c(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && c(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f0);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i2 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.s0);
        ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.e0.add(new CornerData(shapeAppearanceModel.f19430e, shapeAppearanceModel.f19431h, shapeAppearanceModel.f, shapeAppearanceModel.g));
        materialButton.setEnabled(isEnabled());
        ViewCompat.z(materialButton, new AccessibilityDelegateCompat() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                int i3;
                this.f4417a.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat.f4534a);
                int i4 = MaterialButtonToggleGroup.o0;
                MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                if (view2 instanceof MaterialButton) {
                    i3 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) != view2) {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.c(i5)) {
                                i3++;
                            }
                        }
                    }
                    i3 = -1;
                } else {
                    i3 = -1;
                }
                accessibilityNodeInfoCompat.l(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(0, 1, i3, 1, ((MaterialButton) view2).s0));
            }
        });
    }

    public final void b(int i2, boolean z2) {
        if (i2 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.n0);
        if (z2 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.k0 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i2))) {
                return;
            }
            if (!this.l0 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.n0;
        this.n0 = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.j0 = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.j0 = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean zContains2 = set.contains(Integer.valueOf(id));
                Iterator it = this.g0.iterator();
                while (it.hasNext()) {
                    ((OnButtonCheckedListener) it.next()).a(id, zContains2);
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.h0);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put((MaterialButton) getChildAt(i2), Integer.valueOf(i2));
        }
        this.i0 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        CornerData cornerData;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            if (materialButton.getVisibility() != 8) {
                ShapeAppearanceModel.Builder builderF = materialButton.getShapeAppearanceModel().f();
                CornerData cornerData2 = (CornerData) this.e0.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    AbsoluteCornerSize absoluteCornerSize = CornerData.f19152e;
                    if (i2 == firstVisibleChildIndex) {
                        cornerData = z2 ? ViewUtils.e(this) ? new CornerData(absoluteCornerSize, absoluteCornerSize, cornerData2.f19154b, cornerData2.f19155c) : new CornerData(cornerData2.f19153a, cornerData2.d, absoluteCornerSize, absoluteCornerSize) : new CornerData(cornerData2.f19153a, absoluteCornerSize, cornerData2.f19154b, absoluteCornerSize);
                    } else if (i2 != lastVisibleChildIndex) {
                        cornerData2 = null;
                    } else if (z2) {
                        cornerData = ViewUtils.e(this) ? new CornerData(cornerData2.f19153a, cornerData2.d, absoluteCornerSize, absoluteCornerSize) : new CornerData(absoluteCornerSize, absoluteCornerSize, cornerData2.f19154b, cornerData2.f19155c);
                    } else {
                        cornerData = new CornerData(absoluteCornerSize, cornerData2.d, absoluteCornerSize, cornerData2.f19155c);
                    }
                    cornerData2 = cornerData;
                }
                if (cornerData2 == null) {
                    builderF.c(0.0f);
                } else {
                    builderF.f19437e = cornerData2.f19153a;
                    builderF.f19438h = cornerData2.d;
                    builderF.f = cornerData2.f19154b;
                    builderF.g = cornerData2.f19155c;
                }
                materialButton.setShapeAppearanceModel(builderF.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.k0 || this.n0.isEmpty()) {
            return -1;
        }
        return ((Integer) this.n0.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            if (this.n0.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.i0;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i3;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.m0;
        if (i2 != -1) {
            d(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).k(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(1, getVisibleButtonCount(), this.k0 ? 1 : 2, false));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        e();
        a();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.e0.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.l0 = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.k0 != z2) {
            this.k0 = z2;
            d(new HashSet());
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setA11yClassName((this.k0 ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i2) {
        super(MaterialThemeOverlay.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.e0 = new ArrayList();
        this.f0 = new PressedStateTracker();
        this.g0 = new LinkedHashSet();
        this.h0 = new Comparator<MaterialButton>() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.1
            @Override // java.util.Comparator
            public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
                MaterialButton materialButton3 = materialButton;
                MaterialButton materialButton4 = materialButton2;
                int iCompareTo = Boolean.valueOf(materialButton3.s0).compareTo(Boolean.valueOf(materialButton4.s0));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
            }
        };
        this.j0 = false;
        this.n0 = new HashSet();
        TypedArray typedArrayD = ThemeEnforcement.d(getContext(), attributeSet, com.google.android.material.R.styleable.o, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayD.getBoolean(3, false));
        this.m0 = typedArrayD.getResourceId(1, -1);
        this.l0 = typedArrayD.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
