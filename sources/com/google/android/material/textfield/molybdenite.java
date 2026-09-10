package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: EndCompoundLayout.java */
/* JADX INFO: loaded from: classes3.dex */
public class molybdenite extends LinearLayout {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final CheckableImageButton f21212adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final FrameLayout f21213arytenoidectomy;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public PorterDuff.Mode f21214cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public int f21215cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final wireman f21216dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public int f21217gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public View.OnLongClickListener f21218graveside;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public EditText f21219kattegat;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final TextInputLayout f21220kowloon;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public final TextWatcher f21221merc;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public PorterDuff.Mode f21222molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final CheckableImageButton f21223monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public CharSequence f21224oilcan;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public final TextInputLayout.competently f21225polder;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public ColorStateList f21226polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public ColorStateList f21227preprohormone;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f21228restrictive;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.impromptu> f21229rotuma;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public boolean f21230sealless;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public ImageView.ScaleType f21231stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public final AccessibilityManager f21232supplicat;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public View.OnLongClickListener f21233trm;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public final TextView f21234yemenite;

    /* JADX INFO: compiled from: EndCompoundLayout.java */
    public class attabal extends com.google.android.material.internal.gintrap {
        public attabal() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            molybdenite.this.kowloon().attabal(editable);
        }

        @Override // com.google.android.material.internal.gintrap, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            molybdenite.this.kowloon().saneness(charSequence, i, i2, i3);
        }
    }

    /* JADX INFO: compiled from: EndCompoundLayout.java */
    public class dern implements View.OnAttachStateChangeListener {
        public dern() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            molybdenite.this.impromptu();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            molybdenite.this.hydrovane();
        }
    }

    /* JADX INFO: compiled from: EndCompoundLayout.java */
    public class saneness implements TextInputLayout.competently {
        public saneness() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.competently
        public void attabal(TextInputLayout textInputLayout) {
            if (molybdenite.this.f21219kattegat == textInputLayout.getEditText()) {
                return;
            }
            if (molybdenite.this.f21219kattegat != null) {
                molybdenite.this.f21219kattegat.removeTextChangedListener(molybdenite.this.f21221merc);
                if (molybdenite.this.f21219kattegat.getOnFocusChangeListener() == molybdenite.this.kowloon().marial()) {
                    molybdenite.this.f21219kattegat.setOnFocusChangeListener(null);
                }
            }
            molybdenite.this.f21219kattegat = textInputLayout.getEditText();
            if (molybdenite.this.f21219kattegat != null) {
                molybdenite.this.f21219kattegat.addTextChangedListener(molybdenite.this.f21221merc);
            }
            molybdenite.this.kowloon().triweekly(molybdenite.this.f21219kattegat);
            molybdenite molybdeniteVar = molybdenite.this;
            molybdeniteVar.coi(molybdeniteVar.kowloon());
        }
    }

    /* JADX INFO: compiled from: EndCompoundLayout.java */
    public static class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final SparseArray<graveside> f21238attabal = new SparseArray<>();

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f21239dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final molybdenite f21240saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f21241wireman;

        public wireman(molybdenite molybdeniteVar, androidx.appcompat.widget.restrictive restrictiveVar) {
            this.f21240saneness = molybdeniteVar;
            this.f21239dern = restrictiveVar.triweekly(bubbles.impassible.TextInputLayout_endIconDrawable, 0);
            this.f21241wireman = restrictiveVar.triweekly(bubbles.impassible.TextInputLayout_passwordToggleDrawable, 0);
        }

        public graveside dern(int i) {
            graveside gravesideVar = this.f21238attabal.get(i);
            if (gravesideVar != null) {
                return gravesideVar;
            }
            graveside gravesideVarSaneness = saneness(i);
            this.f21238attabal.append(i, gravesideVarSaneness);
            return gravesideVarSaneness;
        }

        public final graveside saneness(int i) {
            if (i == -1) {
                return new competently(this.f21240saneness);
            }
            if (i == 0) {
                return new gintrap(this.f21240saneness);
            }
            if (i == 1) {
                return new preprohormone(this.f21240saneness, this.f21241wireman);
            }
            if (i == 2) {
                return new beachfront(this.f21240saneness);
            }
            if (i == 3) {
                return new monoploid(this.f21240saneness);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i);
        }
    }

    public molybdenite(TextInputLayout textInputLayout, androidx.appcompat.widget.restrictive restrictiveVar) {
        super(textInputLayout.getContext());
        this.f21217gintrap = 0;
        this.f21229rotuma = new LinkedHashSet<>();
        this.f21221merc = new attabal();
        saneness sanenessVar = new saneness();
        this.f21225polder = sanenessVar;
        this.f21232supplicat = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f21220kowloon = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f21213arytenoidectomy = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonApical = apical(this, layoutInflaterFrom, bubbles.competently.text_input_error_icon);
        this.f21223monoploid = checkableImageButtonApical;
        CheckableImageButton checkableImageButtonApical2 = apical(frameLayout, layoutInflaterFrom, bubbles.competently.text_input_end_icon);
        this.f21212adultoid = checkableImageButtonApical2;
        this.f21216dovishness = new wireman(this, restrictiveVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f21234yemenite = appCompatTextView;
        yemenite(restrictiveVar);
        oilcan(restrictiveVar);
        sealless(restrictiveVar);
        frameLayout.addView(checkableImageButtonApical2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonApical);
        textInputLayout.addOnEditTextAttachedListener(sanenessVar);
        addOnAttachStateChangeListener(new dern());
    }

    public final void achondroplasia(boolean z) {
        if (!z || arytenoidectomy() == null) {
            adultoid.attabal(this.f21220kowloon, this.f21212adultoid, this.f21227preprohormone, this.f21214cord);
            return;
        }
        Drawable drawableMutate = DrawableCompat.wrap(arytenoidectomy()).mutate();
        drawableMutate.setTint(this.f21220kowloon.getErrorCurrentTextColors());
        this.f21212adultoid.setImageDrawable(drawableMutate);
    }

    public Drawable adultoid() {
        return this.f21223monoploid.getDrawable();
    }

    public final CheckableImageButton apical(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(bubbles.taiyuan.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        adultoid.marial(checkableImageButton);
        if (mullein.dern.apical(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public Drawable arytenoidectomy() {
        return this.f21212adultoid.getDrawable();
    }

    public final void claque() {
        this.f21213arytenoidectomy.setVisibility((this.f21212adultoid.getVisibility() != 0 || merc()) ? 8 : 0);
        setVisibility((restrictive() || merc() || ((this.f21224oilcan == null || this.f21230sealless) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public void clubfoot(Drawable drawable) {
        this.f21212adultoid.setImageDrawable(drawable);
        if (drawable != null) {
            adultoid.attabal(this.f21220kowloon, this.f21212adultoid, this.f21227preprohormone, this.f21214cord);
            saran();
        }
    }

    public void coffeecake(int i) {
        lerp(i != 0 ? competently.attabal.saneness(getContext(), i) : null);
        privatdozent();
    }

    public final void coi(graveside gravesideVar) {
        if (this.f21219kattegat == null) {
            return;
        }
        if (gravesideVar.marial() != null) {
            this.f21219kattegat.setOnFocusChangeListener(gravesideVar.marial());
        }
        if (gravesideVar.competently() != null) {
            this.f21212adultoid.setOnFocusChangeListener(gravesideVar.competently());
        }
    }

    public void competently(TextInputLayout.impromptu impromptuVar) {
        this.f21229rotuma.add(impromptuVar);
    }

    public ColorStateList cord() {
        return this.f21234yemenite.getTextColors();
    }

    public void creditor(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean zIsChecked;
        graveside gravesideVarKowloon = kowloon();
        boolean z3 = true;
        if (!gravesideVarKowloon.formularize() || (zIsChecked = this.f21212adultoid.isChecked()) == gravesideVarKowloon.impassible()) {
            z2 = false;
        } else {
            this.f21212adultoid.setChecked(!zIsChecked);
            z2 = true;
        }
        if (!gravesideVarKowloon.cutely() || (zIsActivated = this.f21212adultoid.isActivated()) == gravesideVarKowloon.apical()) {
            z3 = z2;
        } else {
            walach(!zIsActivated);
        }
        if (z || z3) {
            saran();
        }
    }

    public int cuirassed() {
        return getPaddingEnd() + this.f21234yemenite.getPaddingEnd() + ((restrictive() || merc()) ? this.f21212adultoid.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f21212adultoid.getLayoutParams()).getMarginStart() : 0);
    }

    public void cultivated(View.OnClickListener onClickListener) {
        adultoid.impromptu(this.f21212adultoid, onClickListener, this.f21233trm);
    }

    public void cutely() {
        this.f21229rotuma.clear();
    }

    public void czestochowa(int i) {
        sensatory(i != 0 ? getResources().getText(i) : null);
    }

    public void dent(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != this.f21215cuirassed) {
            this.f21215cuirassed = i;
            adultoid.competently(this.f21212adultoid, i);
            adultoid.competently(this.f21223monoploid, i);
        }
    }

    public final int dovishness(graveside gravesideVar) {
        int i = this.f21216dovishness.f21239dern;
        return i == 0 ? gravesideVar.wireman() : i;
    }

    public void empress(PorterDuff.Mode mode) {
        if (this.f21222molybdenite != mode) {
            this.f21222molybdenite = mode;
            adultoid.attabal(this.f21220kowloon, this.f21223monoploid, this.f21226polloi, mode);
        }
    }

    public final void formularize(int i) {
        Iterator<TextInputLayout.impromptu> it = this.f21229rotuma.iterator();
        while (it.hasNext()) {
            it.next().attabal(this.f21220kowloon, i);
        }
    }

    public CharSequence gintrap() {
        return this.f21212adultoid.getContentDescription();
    }

    public CheckableImageButton graveside() {
        return this.f21212adultoid;
    }

    public void grimness() {
        hardpan();
        privatdozent();
        saran();
        if (kowloon().graveside()) {
            achondroplasia(this.f21220kowloon.shouldShowError());
        }
    }

    public void gusty(PorterDuff.Mode mode) {
        this.f21214cord = mode;
        adultoid.attabal(this.f21220kowloon, this.f21212adultoid, this.f21227preprohormone, mode);
    }

    public final void hardpan() {
        this.f21223monoploid.setVisibility(adultoid() != null && this.f21220kowloon.isErrorEnabled() && this.f21220kowloon.shouldShowError() ? 0 : 8);
        claque();
        herdbook();
        if (trm()) {
            return;
        }
        this.f21220kowloon.updateDummyDrawables();
    }

    public void herdbook() {
        if (this.f21220kowloon.editText == null) {
            return;
        }
        this.f21234yemenite.setPaddingRelative(getContext().getResources().getDimensionPixelSize(bubbles.marial.material_input_text_to_prefix_suffix_padding), this.f21220kowloon.editText.getPaddingTop(), (restrictive() || merc()) ? 0 : this.f21220kowloon.editText.getPaddingEnd(), this.f21220kowloon.editText.getPaddingBottom());
    }

    public final void hydrovane() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f21228restrictive;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.f21232supplicat) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    public void igbo(ColorStateList colorStateList) {
        this.f21227preprohormone = colorStateList;
        adultoid.attabal(this.f21220kowloon, this.f21212adultoid, colorStateList, this.f21214cord);
    }

    public CheckableImageButton impassible() {
        if (merc()) {
            return this.f21223monoploid;
        }
        if (trm() && restrictive()) {
            return this.f21212adultoid;
        }
        return null;
    }

    public final void impromptu() {
        if (this.f21228restrictive == null || this.f21232supplicat == null || !isAttachedToWindow()) {
            return;
        }
        this.f21232supplicat.addTouchExplorationStateChangeListener(this.f21228restrictive);
    }

    public void itchy(boolean z) {
        if (restrictive() != z) {
            this.f21212adultoid.setVisibility(z ? 0 : 8);
            claque();
            herdbook();
            this.f21220kowloon.updateDummyDrawables();
        }
    }

    public final void julian(graveside gravesideVar) {
        hydrovane();
        this.f21228restrictive = null;
        gravesideVar.adultoid();
    }

    public boolean kattegat() {
        return this.f21212adultoid.isCheckable();
    }

    public graveside kowloon() {
        return this.f21216dovishness.dern(this.f21217gintrap);
    }

    public void lerp(Drawable drawable) {
        this.f21223monoploid.setImageDrawable(drawable);
        hardpan();
        adultoid.attabal(this.f21220kowloon, this.f21223monoploid, this.f21226polloi, this.f21222molybdenite);
    }

    public void lightstruck(ColorStateList colorStateList) {
        this.f21234yemenite.setTextColor(colorStateList);
    }

    public void lotta(View.OnLongClickListener onLongClickListener) {
        this.f21218graveside = onLongClickListener;
        adultoid.taiyuan(this.f21223monoploid, onLongClickListener);
    }

    public void mathsort(int i) {
        splinterproof(i != 0 ? getResources().getText(i) : null);
    }

    public boolean merc() {
        return this.f21223monoploid.getVisibility() == 0;
    }

    public void milliradian(ColorStateList colorStateList) {
        if (this.f21227preprohormone != colorStateList) {
            this.f21227preprohormone = colorStateList;
            adultoid.attabal(this.f21220kowloon, this.f21212adultoid, colorStateList, this.f21214cord);
        }
    }

    public ImageView.ScaleType molybdenite() {
        return this.f21231stratoscope;
    }

    public int monoploid() {
        return this.f21215cuirassed;
    }

    public final void monroe(graveside gravesideVar) {
        gravesideVar.molybdenite();
        this.f21228restrictive = gravesideVar.impromptu();
        impromptu();
    }

    public void nosophobia(View.OnClickListener onClickListener) {
        adultoid.impromptu(this.f21223monoploid, onClickListener, this.f21218graveside);
    }

    public final void oilcan(androidx.appcompat.widget.restrictive restrictiveVar) {
        if (!restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_passwordToggleEnabled)) {
            if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_endIconTint)) {
                this.f21227preprohormone = mullein.dern.saneness(getContext(), restrictiveVar, bubbles.impassible.TextInputLayout_endIconTint);
            }
            if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_endIconTintMode)) {
                this.f21214cord = com.google.android.material.internal.cuirassed.triweekly(restrictiveVar.apical(bubbles.impassible.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_endIconMode)) {
            permissivist(restrictiveVar.apical(bubbles.impassible.TextInputLayout_endIconMode, 0));
            if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_endIconContentDescription)) {
                splinterproof(restrictiveVar.arytenoidectomy(bubbles.impassible.TextInputLayout_endIconContentDescription));
            }
            peridotite(restrictiveVar.attabal(bubbles.impassible.TextInputLayout_endIconCheckable, true));
        } else if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_passwordToggleEnabled)) {
            if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_passwordToggleTint)) {
                this.f21227preprohormone = mullein.dern.saneness(getContext(), restrictiveVar, bubbles.impassible.TextInputLayout_passwordToggleTint);
            }
            if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_passwordToggleTintMode)) {
                this.f21214cord = com.google.android.material.internal.cuirassed.triweekly(restrictiveVar.apical(bubbles.impassible.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            permissivist(restrictiveVar.attabal(bubbles.impassible.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            splinterproof(restrictiveVar.arytenoidectomy(bubbles.impassible.TextInputLayout_passwordToggleContentDescription));
        }
        dent(restrictiveVar.beachfront(bubbles.impassible.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(bubbles.marial.mtrl_min_touch_target_size)));
        if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_endIconScaleType)) {
            timberyard(adultoid.saneness(restrictiveVar.apical(bubbles.impassible.TextInputLayout_endIconScaleType, -1)));
        }
    }

    public void overspeculate(int i) {
        clubfoot(i != 0 ? competently.attabal.saneness(getContext(), i) : null);
    }

    public void palmyra(int i) {
        androidx.core.widget.formularize.impassible(this.f21234yemenite, i);
    }

    public void peridotite(boolean z) {
        this.f21212adultoid.setCheckable(z);
    }

    public void permissivist(int i) {
        if (this.f21217gintrap == i) {
            return;
        }
        julian(kowloon());
        int i2 = this.f21217gintrap;
        this.f21217gintrap = i;
        formularize(i2);
        itchy(i != 0);
        graveside gravesideVarKowloon = kowloon();
        overspeculate(dovishness(gravesideVarKowloon));
        mathsort(gravesideVarKowloon.dern());
        peridotite(gravesideVarKowloon.formularize());
        if (!gravesideVarKowloon.taiyuan(this.f21220kowloon.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f21220kowloon.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        monroe(gravesideVarKowloon);
        cultivated(gravesideVarKowloon.beachfront());
        EditText editText = this.f21219kattegat;
        if (editText != null) {
            gravesideVarKowloon.triweekly(editText);
            coi(gravesideVarKowloon);
        }
        adultoid.attabal(this.f21220kowloon, this.f21212adultoid, this.f21227preprohormone, this.f21214cord);
        creditor(true);
    }

    public void picketboat(CharSequence charSequence) {
        this.f21224oilcan = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f21234yemenite.setText(charSequence);
        technofreak();
    }

    public boolean polder() {
        return this.f21217gintrap == 1;
    }

    public int polloi() {
        return this.f21217gintrap;
    }

    public void premeiotic(View.OnLongClickListener onLongClickListener) {
        this.f21233trm = onLongClickListener;
        adultoid.taiyuan(this.f21212adultoid, onLongClickListener);
    }

    public CharSequence preprohormone() {
        return this.f21224oilcan;
    }

    public void preterite(Drawable drawable) {
        this.f21212adultoid.setImageDrawable(drawable);
    }

    public void privatdozent() {
        adultoid.wireman(this.f21220kowloon, this.f21223monoploid, this.f21226polloi);
    }

    public boolean restrictive() {
        return this.f21213arytenoidectomy.getVisibility() == 0 && this.f21212adultoid.getVisibility() == 0;
    }

    public Drawable rotuma() {
        return this.f21212adultoid.getDrawable();
    }

    public void saran() {
        adultoid.wireman(this.f21220kowloon, this.f21212adultoid, this.f21227preprohormone);
    }

    public void sayid(ColorStateList colorStateList) {
        if (this.f21226polloi != colorStateList) {
            this.f21226polloi = colorStateList;
            adultoid.attabal(this.f21220kowloon, this.f21223monoploid, colorStateList, this.f21222molybdenite);
        }
    }

    public final void sealless(androidx.appcompat.widget.restrictive restrictiveVar) {
        this.f21234yemenite.setVisibility(8);
        this.f21234yemenite.setId(bubbles.competently.textinput_suffix_text);
        this.f21234yemenite.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.f21234yemenite.setAccessibilityLiveRegion(1);
        palmyra(restrictiveVar.triweekly(bubbles.impassible.TextInputLayout_suffixTextAppearance, 0));
        if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_suffixTextColor)) {
            lightstruck(restrictiveVar.dern(bubbles.impassible.TextInputLayout_suffixTextColor));
        }
        picketboat(restrictiveVar.arytenoidectomy(bubbles.impassible.TextInputLayout_suffixText));
    }

    public void seminary(boolean z) {
        this.f21230sealless = z;
        technofreak();
    }

    public void sensatory(CharSequence charSequence) {
        this.f21212adultoid.setContentDescription(charSequence);
    }

    public void splinterproof(CharSequence charSequence) {
        if (triweekly() != charSequence) {
            this.f21212adultoid.setContentDescription(charSequence);
        }
    }

    public void starveling(TextInputLayout.impromptu impromptuVar) {
        this.f21229rotuma.remove(impromptuVar);
    }

    public TextView stratoscope() {
        return this.f21234yemenite;
    }

    public boolean supplicat() {
        return trm() && this.f21212adultoid.isChecked();
    }

    public void taiyuan() {
        this.f21212adultoid.performClick();
        this.f21212adultoid.jumpDrawablesToCurrentState();
    }

    public final void technofreak() {
        int visibility = this.f21234yemenite.getVisibility();
        int i = (this.f21224oilcan == null || this.f21230sealless) ? 8 : 0;
        if (visibility != i) {
            kowloon().monoploid(i == 0);
        }
        claque();
        this.f21234yemenite.setVisibility(i);
        this.f21220kowloon.updateDummyDrawables();
    }

    public void timberyard(ImageView.ScaleType scaleType) {
        this.f21231stratoscope = scaleType;
        adultoid.cutely(this.f21212adultoid, scaleType);
        adultoid.cutely(this.f21223monoploid, scaleType);
    }

    public void treadless(PorterDuff.Mode mode) {
        if (this.f21214cord != mode) {
            this.f21214cord = mode;
            adultoid.attabal(this.f21220kowloon, this.f21212adultoid, this.f21227preprohormone, mode);
        }
    }

    public CharSequence triweekly() {
        return this.f21212adultoid.getContentDescription();
    }

    public boolean trm() {
        return this.f21217gintrap != 0;
    }

    public void unconsolidated(boolean z) {
        if (this.f21217gintrap == 1) {
            this.f21212adultoid.performClick();
            if (z) {
                this.f21212adultoid.jumpDrawablesToCurrentState();
            }
        }
    }

    public void underbelly(int i) {
        preterite(i != 0 ? competently.attabal.saneness(getContext(), i) : null);
    }

    public void walach(boolean z) {
        this.f21212adultoid.setActivated(z);
    }

    public void wostteth(boolean z) {
        if (z && this.f21217gintrap != 1) {
            permissivist(1);
        } else {
            if (z) {
                return;
            }
            permissivist(0);
        }
    }

    public final void yemenite(androidx.appcompat.widget.restrictive restrictiveVar) {
        if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_errorIconTint)) {
            this.f21226polloi = mullein.dern.saneness(getContext(), restrictiveVar, bubbles.impassible.TextInputLayout_errorIconTint);
        }
        if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_errorIconTintMode)) {
            this.f21222molybdenite = com.google.android.material.internal.cuirassed.triweekly(restrictiveVar.apical(bubbles.impassible.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (restrictiveVar.molybdenite(bubbles.impassible.TextInputLayout_errorIconDrawable)) {
            lerp(restrictiveVar.competently(bubbles.impassible.TextInputLayout_errorIconDrawable));
        }
        this.f21223monoploid.setContentDescription(getResources().getText(bubbles.apical.error_icon_content_description));
        this.f21223monoploid.setImportantForAccessibility(2);
        this.f21223monoploid.setClickable(false);
        this.f21223monoploid.setPressable(false);
        this.f21223monoploid.setCheckable(false);
        this.f21223monoploid.setFocusable(false);
    }
}
