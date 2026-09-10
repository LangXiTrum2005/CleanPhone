package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.CompoundButtonCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final AppCompatAutoCompleteTextView a(Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        MaterialRadioButton materialRadioButton = new MaterialRadioButton(MaterialThemeOverlay.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = materialRadioButton.getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.t, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayD.hasValue(0)) {
            CompoundButtonCompat.d(materialRadioButton, MaterialResources.a(context2, typedArrayD, 0));
        }
        materialRadioButton.j0 = typedArrayD.getBoolean(1, false);
        typedArrayD.recycle();
        return materialRadioButton;
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        MaterialTextView materialTextView = new MaterialTextView(MaterialThemeOverlay.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = materialTextView.getContext();
        if (MaterialAttributes.b(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = com.google.android.material.R.styleable.f19076w;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iQ = MaterialTextView.q(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iQ == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, com.google.android.material.R.styleable.v);
                    int iQ2 = MaterialTextView.q(materialTextView.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iQ2 >= 0) {
                        materialTextView.setLineHeight(iQ2);
                    }
                }
            }
        }
        return materialTextView;
    }
}
