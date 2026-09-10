package com.google.android.material.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialTextView extends AppCompatTextView {
    public static int q(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i2 = 0; i2 < iArr.length && dimensionPixelSize < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (MaterialAttributes.b(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i2, com.google.android.material.R.styleable.v);
            int iQ = q(getContext(), typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iQ >= 0) {
                setLineHeight(iQ);
            }
        }
    }
}
