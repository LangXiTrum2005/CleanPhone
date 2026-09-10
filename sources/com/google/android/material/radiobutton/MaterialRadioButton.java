package com.google.android.material.radiobutton;

import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    public static final int[][] k0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList i0;
    public boolean j0;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.i0 == null) {
            int iB = MaterialColors.b(com.charging.screenshow.battery.animations.themes.R.attr.colorControlActivated, this);
            int iB2 = MaterialColors.b(com.charging.screenshow.battery.animations.themes.R.attr.colorOnSurface, this);
            int iB3 = MaterialColors.b(com.charging.screenshow.battery.animations.themes.R.attr.colorSurface, this);
            this.i0 = new ColorStateList(k0, new int[]{MaterialColors.e(1.0f, iB3, iB), MaterialColors.e(0.54f, iB3, iB2), MaterialColors.e(0.38f, iB3, iB2), MaterialColors.e(0.38f, iB3, iB2)});
        }
        return this.i0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j0 && CompoundButtonCompat.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.j0 = z2;
        if (z2) {
            CompoundButtonCompat.d(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.d(this, null);
        }
    }
}
