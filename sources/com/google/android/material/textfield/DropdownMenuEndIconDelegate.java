package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
class DropdownMenuEndIconDelegate extends EndIconDelegate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19501e;
    public final int f;
    public final TimeInterpolator g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f19502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f19503i;
    public final b j;
    public final g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19504l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f19505n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f19506p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.textfield.g] */
    public DropdownMenuEndIconDelegate(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f19503i = new a(this, 1);
        this.j = new b(this, 1);
        this.k = new AccessibilityManagerCompat.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.g
            @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z2) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = this.f19538a;
                AutoCompleteTextView autoCompleteTextView = dropdownMenuEndIconDelegate.f19502h;
                if (autoCompleteTextView == null || EditTextUtils.a(autoCompleteTextView)) {
                    return;
                }
                int i2 = z2 ? 2 : 1;
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                dropdownMenuEndIconDelegate.d.setImportantForAccessibility(i2);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = MotionUtils.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 67);
        this.f19501e = MotionUtils.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 50);
        this.g = MotionUtils.d(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.f19078a);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void a() {
        if (this.f19506p.isTouchExplorationEnabled() && EditTextUtils.a(this.f19502h) && !this.d.hasFocus()) {
            this.f19502h.dismissDropDown();
        }
        this.f19502h.post(new d(this, 1));
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnClickListener f() {
        return this.f19503i;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final AccessibilityManagerCompat.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean i(int i2) {
        return i2 != 0;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean j() {
        return this.f19504l;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean l() {
        return this.f19505n;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f19502h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = this.X;
                dropdownMenuEndIconDelegate.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - dropdownMenuEndIconDelegate.o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        dropdownMenuEndIconDelegate.m = false;
                    }
                    dropdownMenuEndIconDelegate.u();
                    dropdownMenuEndIconDelegate.m = true;
                    dropdownMenuEndIconDelegate.o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f19502h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.f
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = this.f19537a;
                dropdownMenuEndIconDelegate.m = true;
                dropdownMenuEndIconDelegate.o = System.currentTimeMillis();
                dropdownMenuEndIconDelegate.t(false);
            }
        });
        this.f19502h.setThreshold(0);
        TextInputLayout textInputLayout = this.f19511a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!EditTextUtils.a(editText) && this.f19506p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void n(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!EditTextUtils.a(this.f19502h)) {
            accessibilityNodeInfoCompat.j(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? accessibilityNodeInfoCompat.f4534a.isShowingHintText() : accessibilityNodeInfoCompat.e(4)) {
            accessibilityNodeInfoCompat.n(null);
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f19506p.isEnabled() || EditTextUtils.a(this.f19502h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f19505n && !this.f19502h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.m = true;
            this.o = System.currentTimeMillis();
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void r() {
        int i2 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new c(this, i2));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f19501e);
        valueAnimatorOfFloat2.addUpdateListener(new c(this, i2));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                dropdownMenuEndIconDelegate.q();
                dropdownMenuEndIconDelegate.r.start();
            }
        });
        this.f19506p = (AccessibilityManager) this.f19513c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f19502h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f19502h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f19505n != z2) {
            this.f19505n = z2;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.f19502h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        t(!this.f19505n);
        if (!this.f19505n) {
            this.f19502h.dismissDropDown();
        } else {
            this.f19502h.requestFocus();
            this.f19502h.showDropDown();
        }
    }
}
