package com.google.android.material.switchmaterial;

import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes4.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int[][] Z0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList X0;
    public boolean Y0;

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        throw null;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.X0 == null) {
            int iB = MaterialColors.b(com.charging.screenshow.battery.animations.themes.R.attr.colorSurface, this);
            int iB2 = MaterialColors.b(com.charging.screenshow.battery.animations.themes.R.attr.colorControlActivated, this);
            int iB3 = MaterialColors.b(com.charging.screenshow.battery.animations.themes.R.attr.colorOnSurface, this);
            this.X0 = new ColorStateList(Z0, new int[]{MaterialColors.e(0.54f, iB, iB2), MaterialColors.e(0.32f, iB, iB3), MaterialColors.e(0.12f, iB, iB2), MaterialColors.e(0.12f, iB, iB3)});
        }
        return this.X0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.Y0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.Y0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.Y0 = z2;
        if (z2) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
