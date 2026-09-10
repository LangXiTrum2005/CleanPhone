package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
class StartCompoundLayout extends LinearLayout {
    public final TextInputLayout e0;
    public final AppCompatTextView f0;
    public CharSequence g0;
    public final CheckableImageButton h0;
    public ColorStateList i0;
    public PorterDuff.Mode j0;
    public int k0;
    public ImageView.ScaleType l0;
    public View.OnLongClickListener m0;
    public boolean n0;

    public StartCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.e0 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.h0 = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f0 = appCompatTextView;
        if (MaterialResources.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.m0;
        checkableImageButton.setOnClickListener(null);
        IconHelper.d(checkableImageButton, onLongClickListener);
        this.m0 = null;
        checkableImageButton.setOnLongClickListener(null);
        IconHelper.d(checkableImageButton, null);
        TypedArray typedArray = tintTypedArray.f3646b;
        if (typedArray.hasValue(69)) {
            this.i0 = MaterialResources.b(getContext(), tintTypedArray, 69);
        }
        if (typedArray.hasValue(70)) {
            this.j0 = ViewUtils.f(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(tintTypedArray.b(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.k0) {
            this.k0 = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeB = IconHelper.b(typedArray.getInt(68, -1));
            this.l0 = scaleTypeB;
            checkableImageButton.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            appCompatTextView.setTextColor(tintTypedArray.a(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.g0 = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.h0;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        return this.f0.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.h0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.i0;
            PorterDuff.Mode mode = this.j0;
            TextInputLayout textInputLayout = this.e0;
            IconHelper.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            IconHelper.c(textInputLayout, checkableImageButton, this.i0);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.m0;
        checkableImageButton.setOnClickListener(null);
        IconHelper.d(checkableImageButton, onLongClickListener);
        this.m0 = null;
        checkableImageButton.setOnLongClickListener(null);
        IconHelper.d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z2) {
        CheckableImageButton checkableImageButton = this.h0;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.e0.h0;
        if (editText == null) {
            return;
        }
        if (this.h0.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = ViewCompat.f4466a;
        this.f0.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i2 = (this.g0 == null || this.n0) ? 8 : 0;
        setVisibility((this.h0.getVisibility() == 0 || i2 == 0) ? 0 : 8);
        this.f0.setVisibility(i2);
        this.e0.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        d();
    }
}
