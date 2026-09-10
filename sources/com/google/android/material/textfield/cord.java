package com.google.android.material.textfield;

import android.content.res.ColorStateList;
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
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: StartCompoundLayout.java */
/* JADX INFO: loaded from: classes3.dex */
public class cord extends LinearLayout {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f21155adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final TextView f21156arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public ImageView.ScaleType f21157dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public View.OnLongClickListener f21158gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public PorterDuff.Mode f21159graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final TextInputLayout f21160kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public ColorStateList f21161molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public CharSequence f21162monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final CheckableImageButton f21163polloi;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public boolean f21164rotuma;

    public cord(TextInputLayout textInputLayout, androidx.appcompat.widget.restrictive restrictiveVar) {
        super(textInputLayout.getContext());
        this.f21160kowloon = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(bubbles.taiyuan.design_text_input_start_icon, (ViewGroup) this, false);
        this.f21163polloi = checkableImageButton;
        adultoid.marial(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f21156arytenoidectomy = appCompatTextView;
        cutely(restrictiveVar);
        taiyuan(restrictiveVar);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public void adultoid(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != this.f21155adultoid) {
            this.f21155adultoid = i;
            adultoid.competently(this.f21163polloi, i);
        }
    }

    public boolean apical() {
        return this.f21163polloi.isCheckable();
    }

    public void arytenoidectomy(int i) {
        androidx.core.widget.formularize.impassible(this.f21156arytenoidectomy, i);
    }

    public CharSequence attabal() {
        return this.f21162monoploid;
    }

    public Drawable beachfront() {
        return this.f21163polloi.getDrawable();
    }

    public int competently() {
        return this.f21155adultoid;
    }

    public void cord(PorterDuff.Mode mode) {
        if (this.f21159graveside != mode) {
            this.f21159graveside = mode;
            adultoid.attabal(this.f21160kowloon, this.f21163polloi, this.f21161molybdenite, mode);
        }
    }

    public void cuirassed(boolean z) {
        if (formularize() != z) {
            this.f21163polloi.setVisibility(z ? 0 : 8);
            trm();
            oilcan();
        }
    }

    public final void cutely(androidx.appcompat.widget.restrictive restrictiveVar) {
        if (mullein.dern.apical(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.f21163polloi.getLayoutParams()).setMarginEnd(0);
        }
        dovishness(null);
        gintrap(null);
        if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_startIconTint)) {
            this.f21161molybdenite = mullein.dern.saneness(getContext(), restrictiveVar, bubbles.impassible.TextInputLayout_startIconTint);
        }
        if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_startIconTintMode)) {
            this.f21159graveside = com.google.android.material.internal.cuirassed.triweekly(restrictiveVar.apical(bubbles.impassible.TextInputLayout_startIconTintMode, -1), null);
        }
        if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_startIconDrawable)) {
            graveside(restrictiveVar.competently(bubbles.impassible.TextInputLayout_startIconDrawable));
            if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_startIconContentDescription)) {
                molybdenite(restrictiveVar.arytenoidectomy(bubbles.impassible.TextInputLayout_startIconContentDescription));
            }
            polloi(restrictiveVar.attabal(bubbles.impassible.TextInputLayout_startIconCheckable, true));
        }
        adultoid(restrictiveVar.beachfront(bubbles.impassible.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(bubbles.marial.mtrl_min_touch_target_size)));
        if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_startIconScaleType)) {
            rotuma(adultoid.saneness(restrictiveVar.apical(bubbles.impassible.TextInputLayout_startIconScaleType, -1)));
        }
    }

    public int dern() {
        return getPaddingStart() + this.f21156arytenoidectomy.getPaddingStart() + (formularize() ? this.f21163polloi.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f21163polloi.getLayoutParams()).getMarginEnd() : 0);
    }

    public void dovishness(View.OnClickListener onClickListener) {
        adultoid.impromptu(this.f21163polloi, onClickListener, this.f21158gintrap);
    }

    public boolean formularize() {
        return this.f21163polloi.getVisibility() == 0;
    }

    public void gintrap(View.OnLongClickListener onLongClickListener) {
        this.f21158gintrap = onLongClickListener;
        adultoid.taiyuan(this.f21163polloi, onLongClickListener);
    }

    public void graveside(Drawable drawable) {
        this.f21163polloi.setImageDrawable(drawable);
        if (drawable != null) {
            adultoid.attabal(this.f21160kowloon, this.f21163polloi, this.f21161molybdenite, this.f21159graveside);
            cuirassed(true);
            triweekly();
        } else {
            cuirassed(false);
            dovishness(null);
            gintrap(null);
            molybdenite(null);
        }
    }

    public void impassible(boolean z) {
        this.f21164rotuma = z;
        oilcan();
    }

    public ImageView.ScaleType impromptu() {
        return this.f21157dovishness;
    }

    public void kowloon(CharSequence charSequence) {
        this.f21162monoploid = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f21156arytenoidectomy.setText(charSequence);
        oilcan();
    }

    public CharSequence marial() {
        return this.f21163polloi.getContentDescription();
    }

    public void molybdenite(CharSequence charSequence) {
        if (marial() != charSequence) {
            this.f21163polloi.setContentDescription(charSequence);
        }
    }

    public void monoploid(ColorStateList colorStateList) {
        this.f21156arytenoidectomy.setTextColor(colorStateList);
    }

    public final void oilcan() {
        int i = (this.f21162monoploid == null || this.f21164rotuma) ? 8 : 0;
        setVisibility((this.f21163polloi.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f21156arytenoidectomy.setVisibility(i);
        this.f21160kowloon.updateDummyDrawables();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        trm();
    }

    public void polloi(boolean z) {
        this.f21163polloi.setCheckable(z);
    }

    public void preprohormone(ColorStateList colorStateList) {
        if (this.f21161molybdenite != colorStateList) {
            this.f21161molybdenite = colorStateList;
            adultoid.attabal(this.f21160kowloon, this.f21163polloi, colorStateList, this.f21159graveside);
        }
    }

    public void rotuma(ImageView.ScaleType scaleType) {
        this.f21157dovishness = scaleType;
        adultoid.cutely(this.f21163polloi, scaleType);
    }

    public ColorStateList saneness() {
        return this.f21156arytenoidectomy.getTextColors();
    }

    public void stratoscope(outmarry.rotuma rotumaVar) {
        if (this.f21156arytenoidectomy.getVisibility() != 0) {
            rotumaVar.pruinose(this.f21163polloi);
        } else {
            rotumaVar.outmarry(this.f21156arytenoidectomy);
            rotumaVar.pruinose(this.f21156arytenoidectomy);
        }
    }

    public final void taiyuan(androidx.appcompat.widget.restrictive restrictiveVar) {
        this.f21156arytenoidectomy.setVisibility(8);
        this.f21156arytenoidectomy.setId(bubbles.competently.textinput_prefix_text);
        this.f21156arytenoidectomy.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f21156arytenoidectomy.setAccessibilityLiveRegion(1);
        arytenoidectomy(restrictiveVar.triweekly(bubbles.impassible.TextInputLayout_prefixTextAppearance, 0));
        if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_prefixTextColor)) {
            monoploid(restrictiveVar.dern(bubbles.impassible.TextInputLayout_prefixTextColor));
        }
        kowloon(restrictiveVar.arytenoidectomy(bubbles.impassible.TextInputLayout_prefixText));
    }

    public void triweekly() {
        adultoid.wireman(this.f21160kowloon, this.f21163polloi, this.f21161molybdenite);
    }

    public void trm() {
        EditText editText = this.f21160kowloon.editText;
        if (editText == null) {
            return;
        }
        this.f21156arytenoidectomy.setPaddingRelative(formularize() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(bubbles.marial.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public TextView wireman() {
        return this.f21156arytenoidectomy;
    }
}
