package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    public final ListPopupWindow i0;
    public final AccessibilityManager j0;
    public final Rect k0;
    public final int l0;
    public final float m0;
    public ColorStateList n0;
    public int o0;
    public ColorStateList p0;

    public class MaterialArrayAdapter<T> extends ArrayAdapter<String> {
        public ColorStateList X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public ColorStateList f19530Y;

        public MaterialArrayAdapter(Context context, int i2, String[] strArr) {
            super(context, i2, strArr);
            a();
        }

        public final void a() {
            ColorStateList colorStateList;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            ColorStateList colorStateList2 = materialAutoCompleteTextView.p0;
            ColorStateList colorStateList3 = null;
            if (colorStateList2 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.f19530Y = colorStateList;
            if (materialAutoCompleteTextView.o0 != 0 && materialAutoCompleteTextView.p0 != null) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{ColorUtils.c(materialAutoCompleteTextView.p0.getColorForState(iArr3, 0), materialAutoCompleteTextView.o0), ColorUtils.c(materialAutoCompleteTextView.p0.getColorForState(iArr2, 0), materialAutoCompleteTextView.o0), materialAutoCompleteTextView.o0});
            }
            this.X = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i2, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i2, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                Drawable rippleDrawable = null;
                if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.o0 != 0) {
                    ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.o0);
                    if (this.f19530Y != null) {
                        DrawableCompat.j(colorDrawable, this.X);
                        rippleDrawable = new RippleDrawable(this.f19530Y, colorDrawable, null);
                    } else {
                        rippleDrawable = colorDrawable;
                    }
                }
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                textView.setBackground(rippleDrawable);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(MaterialThemeOverlay.a(context, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.k0 = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.m, com.charging.screenshow.battery.animations.themes.R.attr.autoCompleteTextViewStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayD.hasValue(0) && typedArrayD.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.l0 = typedArrayD.getResourceId(3, com.charging.screenshow.battery.animations.themes.R.layout.mtrl_auto_complete_simple_item);
        this.m0 = typedArrayD.getDimensionPixelOffset(1, com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayD.hasValue(2)) {
            this.n0 = ColorStateList.valueOf(typedArrayD.getColor(2, 0));
        }
        this.o0 = typedArrayD.getColor(4, 0);
        this.p0 = MaterialResources.a(context2, typedArrayD, 5);
        this.j0 = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.i0 = listPopupWindow;
        listPopupWindow.z0 = true;
        listPopupWindow.A0.setFocusable(true);
        listPopupWindow.p0 = this;
        listPopupWindow.A0.setInputMethodMode(2);
        listPopupWindow.l(getAdapter());
        listPopupWindow.q0 = new AdapterView.OnItemClickListener() { // from class: com.google.android.material.textfield.MaterialAutoCompleteTextView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                Object item;
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                if (i2 < 0) {
                    ListPopupWindow listPopupWindow2 = materialAutoCompleteTextView.i0;
                    item = !listPopupWindow2.A0.isShowing() ? null : listPopupWindow2.Z.getSelectedItem();
                } else {
                    item = materialAutoCompleteTextView.getAdapter().getItem(i2);
                }
                MaterialAutoCompleteTextView.a(materialAutoCompleteTextView, item);
                AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
                ListPopupWindow listPopupWindow3 = materialAutoCompleteTextView.i0;
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        view = listPopupWindow3.A0.isShowing() ? listPopupWindow3.Z.getSelectedView() : null;
                        i2 = !listPopupWindow3.A0.isShowing() ? -1 : listPopupWindow3.Z.getSelectedItemPosition();
                        j = !listPopupWindow3.A0.isShowing() ? Long.MIN_VALUE : listPopupWindow3.Z.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(listPopupWindow3.Z, view, i2, j);
                }
                listPopupWindow3.dismiss();
            }
        };
        if (typedArrayD.hasValue(6)) {
            setSimpleItems(typedArrayD.getResourceId(6, 0));
        }
        typedArrayD.recycle();
    }

    public static void a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.j0;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.i0.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.n0;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.I0) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.m0;
    }

    public int getSimpleItemSelectedColor() {
        return this.o0;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.p0;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.I0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i0.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.i0;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !listPopupWindow.A0.isShowing() ? -1 : listPopupWindow.Z.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = listPopupWindow.A0.getBackground();
                if (background != null) {
                    Rect rect = this.k0;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.i0.l(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.i0;
        if (listPopupWindow != null) {
            listPopupWindow.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i2) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i2));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.n0 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) dropDownBackground).l(this.n0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.i0.r0 = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i2) {
        super.setRawInputType(i2);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.s();
        }
    }

    public void setSimpleItemSelectedColor(int i2) {
        this.o0 = i2;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.p0 = colorStateList;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i2) {
        setSimpleItems(getResources().getStringArray(i2));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.i0.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new MaterialArrayAdapter(getContext(), this.l0, strArr));
    }
}
