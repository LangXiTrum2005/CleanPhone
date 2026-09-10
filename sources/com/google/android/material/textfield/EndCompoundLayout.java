package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
class EndCompoundLayout extends LinearLayout {
    public static final /* synthetic */ int B0 = 0;
    public final TextInputLayout.OnEditTextAttachedListener A0;
    public final TextInputLayout e0;
    public final FrameLayout f0;
    public final CheckableImageButton g0;
    public ColorStateList h0;
    public PorterDuff.Mode i0;
    public View.OnLongClickListener j0;
    public final CheckableImageButton k0;
    public final EndIconDelegates l0;
    public int m0;
    public final LinkedHashSet n0;
    public ColorStateList o0;
    public PorterDuff.Mode p0;
    public int q0;
    public ImageView.ScaleType r0;
    public View.OnLongClickListener s0;
    public CharSequence t0;
    public final AppCompatTextView u0;
    public boolean v0;
    public EditText w0;
    public final AccessibilityManager x0;
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener y0;
    public final TextWatcher z0;

    public static class EndIconDelegates {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray f19508a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EndCompoundLayout f19509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19510c;
        public final int d;

        public EndIconDelegates(EndCompoundLayout endCompoundLayout, TintTypedArray tintTypedArray) {
            this.f19509b = endCompoundLayout;
            TypedArray typedArray = tintTypedArray.f3646b;
            this.f19510c = typedArray.getResourceId(28, 0);
            this.d = typedArray.getResourceId(52, 0);
        }
    }

    public EndCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.m0 = 0;
        this.n0 = new LinkedHashSet();
        this.z0 = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.b().a();
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                EndCompoundLayout.this.b().b();
            }
        };
        TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public final void a(TextInputLayout textInputLayout2) {
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                if (endCompoundLayout.w0 == textInputLayout2.getEditText()) {
                    return;
                }
                EditText editText = endCompoundLayout.w0;
                TextWatcher textWatcher = endCompoundLayout.z0;
                if (editText != null) {
                    editText.removeTextChangedListener(textWatcher);
                    if (endCompoundLayout.w0.getOnFocusChangeListener() == endCompoundLayout.b().e()) {
                        endCompoundLayout.w0.setOnFocusChangeListener(null);
                    }
                }
                EditText editText2 = textInputLayout2.getEditText();
                endCompoundLayout.w0 = editText2;
                if (editText2 != null) {
                    editText2.addTextChangedListener(textWatcher);
                }
                endCompoundLayout.b().m(endCompoundLayout.w0);
                endCompoundLayout.j(endCompoundLayout.b());
            }
        };
        this.A0 = onEditTextAttachedListener;
        this.x0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.e0 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f0 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.g0 = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.k0 = checkableImageButtonA2;
        this.l0 = new EndIconDelegates(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.u0 = appCompatTextView;
        TypedArray typedArray = tintTypedArray.f3646b;
        if (typedArray.hasValue(38)) {
            this.h0 = MaterialResources.b(getContext(), tintTypedArray, 38);
        }
        if (typedArray.hasValue(39)) {
            this.i0 = ViewUtils.f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(tintTypedArray.b(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.o0 = MaterialResources.b(getContext(), tintTypedArray, 32);
            }
            if (typedArray.hasValue(33)) {
                this.p0 = ViewUtils.f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.o0 = MaterialResources.b(getContext(), tintTypedArray, 54);
            }
            if (typedArray.hasValue(55)) {
                this.p0 = ViewUtils.f(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.q0) {
            this.q0 = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeB = IconHelper.b(typedArray.getInt(31, -1));
            this.r0 = scaleTypeB;
            checkableImageButtonA2.setScaleType(scaleTypeB);
            checkableImageButtonA.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            appCompatTextView.setTextColor(tintTypedArray.a(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.t0 = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f1.add(onEditTextAttachedListener);
        if (textInputLayout.h0 != null) {
            onEditTextAttachedListener.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                AccessibilityManager accessibilityManager;
                int i2 = EndCompoundLayout.B0;
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                if (endCompoundLayout.y0 == null || (accessibilityManager = endCompoundLayout.x0) == null) {
                    return;
                }
                WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                if (endCompoundLayout.isAttachedToWindow()) {
                    AccessibilityManagerCompat.a(accessibilityManager, endCompoundLayout.y0);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                AccessibilityManager accessibilityManager;
                int i2 = EndCompoundLayout.B0;
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = endCompoundLayout.y0;
                if (touchExplorationStateChangeListener == null || (accessibilityManager = endCompoundLayout.x0) == null) {
                    return;
                }
                AccessibilityManagerCompat.b(accessibilityManager, touchExplorationStateChangeListener);
            }
        });
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i2);
        if (MaterialResources.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final EndIconDelegate b() {
        EndIconDelegate customEndIconDelegate;
        int i2 = this.m0;
        EndIconDelegates endIconDelegates = this.l0;
        SparseArray sparseArray = endIconDelegates.f19508a;
        EndIconDelegate endIconDelegate = (EndIconDelegate) sparseArray.get(i2);
        if (endIconDelegate != null) {
            return endIconDelegate;
        }
        EndCompoundLayout endCompoundLayout = endIconDelegates.f19509b;
        if (i2 == -1) {
            customEndIconDelegate = new CustomEndIconDelegate(endCompoundLayout);
        } else if (i2 == 0) {
            customEndIconDelegate = new NoEndIconDelegate(endCompoundLayout);
        } else if (i2 == 1) {
            customEndIconDelegate = new PasswordToggleEndIconDelegate(endCompoundLayout, endIconDelegates.d);
        } else if (i2 == 2) {
            customEndIconDelegate = new ClearTextEndIconDelegate(endCompoundLayout);
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "Invalid end icon mode: "));
            }
            customEndIconDelegate = new DropdownMenuEndIconDelegate(endCompoundLayout);
        }
        sparseArray.append(i2, customEndIconDelegate);
        return customEndIconDelegate;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.k0;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        return this.u0.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f0.getVisibility() == 0 && this.k0.getVisibility() == 0;
    }

    public final boolean e() {
        return this.g0.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean zIsActivated;
        boolean z4;
        EndIconDelegate endIconDelegateB = b();
        boolean zK = endIconDelegateB.k();
        CheckableImageButton checkableImageButton = this.k0;
        boolean z5 = true;
        if (!zK || (z4 = checkableImageButton.h0) == endIconDelegateB.l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(endIconDelegateB instanceof DropdownMenuEndIconDelegate) || (zIsActivated = checkableImageButton.isActivated()) == endIconDelegateB.j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z2 || z5) {
            IconHelper.c(this.e0, checkableImageButton, this.o0);
        }
    }

    public final void g(int i2) {
        if (this.m0 == i2) {
            return;
        }
        EndIconDelegate endIconDelegateB = b();
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.y0;
        AccessibilityManager accessibilityManager = this.x0;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            AccessibilityManagerCompat.b(accessibilityManager, touchExplorationStateChangeListener);
        }
        this.y0 = null;
        endIconDelegateB.s();
        this.m0 = i2;
        Iterator it = this.n0.iterator();
        while (it.hasNext()) {
            ((TextInputLayout.OnEndIconChangedListener) it.next()).a();
        }
        h(i2 != 0);
        EndIconDelegate endIconDelegateB2 = b();
        int iD = this.l0.f19510c;
        if (iD == 0) {
            iD = endIconDelegateB2.d();
        }
        Drawable drawableA = iD != 0 ? AppCompatResources.a(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.k0;
        checkableImageButton.setImageDrawable(drawableA);
        TextInputLayout textInputLayout = this.e0;
        if (drawableA != null) {
            IconHelper.a(textInputLayout, checkableImageButton, this.o0, this.p0);
            IconHelper.c(textInputLayout, checkableImageButton, this.o0);
        }
        int iC = endIconDelegateB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(endIconDelegateB2.k());
        if (!endIconDelegateB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i2);
        }
        endIconDelegateB2.r();
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = endIconDelegateB2.h();
        this.y0 = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            if (isAttachedToWindow()) {
                AccessibilityManagerCompat.a(accessibilityManager, this.y0);
            }
        }
        View.OnClickListener onClickListenerF = endIconDelegateB2.f();
        View.OnLongClickListener onLongClickListener = this.s0;
        checkableImageButton.setOnClickListener(onClickListenerF);
        IconHelper.d(checkableImageButton, onLongClickListener);
        EditText editText = this.w0;
        if (editText != null) {
            endIconDelegateB2.m(editText);
            j(endIconDelegateB2);
        }
        IconHelper.a(textInputLayout, checkableImageButton, this.o0, this.p0);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.k0.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.e0.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.g0;
        checkableImageButton.setImageDrawable(drawable);
        l();
        IconHelper.a(this.e0, checkableImageButton, this.h0, this.i0);
    }

    public final void j(EndIconDelegate endIconDelegate) {
        if (this.w0 == null) {
            return;
        }
        if (endIconDelegate.e() != null) {
            this.w0.setOnFocusChangeListener(endIconDelegate.e());
        }
        if (endIconDelegate.g() != null) {
            this.k0.setOnFocusChangeListener(endIconDelegate.g());
        }
    }

    public final void k() {
        this.f0.setVisibility((this.k0.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.t0 == null || this.v0) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.g0;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.e0;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.n0.q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.m0 != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.e0;
        if (textInputLayout.h0 == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.h0;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.h0.getPaddingTop();
        int paddingBottom = textInputLayout.h0.getPaddingBottom();
        WeakHashMap weakHashMap2 = ViewCompat.f4466a;
        this.u0.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.u0;
        int visibility = appCompatTextView.getVisibility();
        int i2 = (this.t0 == null || this.v0) ? 8 : 0;
        if (visibility != i2) {
            b().p(i2 == 0);
        }
        k();
        appCompatTextView.setVisibility(i2);
        this.e0.q();
    }
}
