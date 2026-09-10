package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import com.google.android.material.elevation.ElevationOverlayProvider;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialShapeUtils {
    public static CornerTreatment a(int i2) {
        if (i2 != 0) {
            return i2 != 1 ? new RoundedCornerTreatment() : new CutCornerTreatment();
        }
        return new RoundedCornerTreatment();
    }

    public static void b(ViewGroup viewGroup, float f) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).k(f);
        }
    }

    public static void c(View view, MaterialShapeDrawable materialShapeDrawable) {
        ElevationOverlayProvider elevationOverlayProvider = materialShapeDrawable.X.f19418b;
        if (elevationOverlayProvider == null || !elevationOverlayProvider.f19278a) {
            return;
        }
        float fK = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fK += ViewCompat.k((View) parent);
        }
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.X;
        if (materialShapeDrawableState.f19423l != fK) {
            materialShapeDrawableState.f19423l = fK;
            materialShapeDrawable.r();
        }
    }

    public static void d(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            c(viewGroup, (MaterialShapeDrawable) background);
        }
    }
}
