package com.google.android.material.button;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import bubbles.apical;
import bubbles.formularize;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialSplitButton extends MaterialButtonGroup {
    private static final int DEF_STYLE_RES = formularize.Widget_Material3_MaterialSplitButton;
    private static final int REQUIRED_BUTTON_COUNT = 2;

    public MaterialSplitButton(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold MaterialButtons.");
        }
        if (getChildCount() > 2) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold two MaterialButtons.");
        }
        MaterialButton materialButton = (MaterialButton) view;
        super.addView(view, i, layoutParams);
        if (indexOfChild(view) == 1) {
            materialButton.setCheckable(true);
            materialButton.setA11yClassName(Button.class.getName());
            if (Build.VERSION.SDK_INT >= 30) {
                materialButton.setStateDescription(getResources().getString(materialButton.isChecked() ? apical.mtrl_button_expanded_content_description : apical.mtrl_button_collapsed_content_description));
                materialButton.addOnCheckedChangeListener(new MaterialButton.saneness() { // from class: com.google.android.material.button.beachfront
                    @Override // com.google.android.material.button.MaterialButton.saneness
                    public final void attabal(MaterialButton materialButton2, boolean z) {
                        materialButton2.setStateDescription(this.f19827attabal.getResources().getString(z ? apical.mtrl_button_expanded_content_description : apical.mtrl_button_collapsed_content_description));
                    }
                });
            }
        }
    }

    public MaterialSplitButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bubbles.dern.materialSplitButtonStyle);
    }

    public MaterialSplitButton(Context context, AttributeSet attributeSet, int i) {
        super(crescentade.attabal.wireman(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
    }
}
