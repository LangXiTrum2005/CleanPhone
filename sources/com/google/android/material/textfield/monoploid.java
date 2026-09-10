package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public class monoploid extends graveside {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final AccessibilityManager.TouchExplorationStateChangeListener f21242apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public AccessibilityManager f21243arytenoidectomy;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f21244beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final TimeInterpolator f21245competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final View.OnFocusChangeListener f21246cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public boolean f21247formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public boolean f21248impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public AutoCompleteTextView f21249impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public long f21250kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f21251marial;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public ValueAnimator f21252monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public ValueAnimator f21253polloi;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final View.OnClickListener f21254taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public boolean f21255triweekly;

    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    public class attabal extends AnimatorListenerAdapter {
        public attabal() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            monoploid.this.polloi();
            monoploid.this.f21253polloi.start();
        }
    }

    public monoploid(molybdenite molybdeniteVar) {
        super(molybdeniteVar);
        this.f21254taiyuan = new View.OnClickListener() { // from class: com.google.android.material.textfield.impassible
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21206kowloon.merc();
            }
        };
        this.f21246cutely = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.triweekly
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                monoploid.preprohormone(this.f21263kowloon, view, z);
            }
        };
        this.f21242apical = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.kowloon
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                monoploid.gintrap(this.f21209attabal, z);
            }
        };
        this.f21250kowloon = Long.MAX_VALUE;
        this.f21244beachfront = gown.apical.beachfront(molybdeniteVar.getContext(), bubbles.dern.motionDurationShort3, 67);
        this.f21251marial = gown.apical.beachfront(molybdeniteVar.getContext(), bubbles.dern.motionDurationShort3, 50);
        this.f21245competently = gown.apical.competently(molybdeniteVar.getContext(), bubbles.dern.motionEasingLinearInterpolator, phrasemonger.saneness.f35307attabal);
    }

    public static /* synthetic */ boolean cord(monoploid monoploidVar, View view, MotionEvent motionEvent) {
        monoploidVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (monoploidVar.kattegat()) {
                monoploidVar.f21248impassible = false;
            }
            monoploidVar.merc();
            monoploidVar.polder();
        }
        return false;
    }

    public static /* synthetic */ void cuirassed(monoploid monoploidVar) {
        monoploidVar.polder();
        monoploidVar.supplicat(false);
    }

    public static /* synthetic */ void dovishness(monoploid monoploidVar) {
        boolean zIsPopupShowing = monoploidVar.f21249impromptu.isPopupShowing();
        monoploidVar.supplicat(zIsPopupShowing);
        monoploidVar.f21248impassible = zIsPopupShowing;
    }

    public static /* synthetic */ void gintrap(monoploid monoploidVar, boolean z) {
        AutoCompleteTextView autoCompleteTextView = monoploidVar.f21249impromptu;
        if (autoCompleteTextView == null || polloi.attabal(autoCompleteTextView)) {
            return;
        }
        monoploidVar.f21205wireman.setImportantForAccessibility(z ? 2 : 1);
    }

    public static AutoCompleteTextView oilcan(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static /* synthetic */ void preprohormone(monoploid monoploidVar, View view, boolean z) {
        monoploidVar.f21247formularize = z;
        monoploidVar.polloi();
        if (z) {
            return;
        }
        monoploidVar.supplicat(false);
        monoploidVar.f21248impassible = false;
    }

    public static /* synthetic */ void rotuma(monoploid monoploidVar, ValueAnimator valueAnimator) {
        monoploidVar.getClass();
        monoploidVar.f21205wireman.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void sealless() {
        this.f21253polloi = yemenite(this.f21244beachfront, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ValueAnimator valueAnimatorYemenite = yemenite(this.f21251marial, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f21252monoploid = valueAnimatorYemenite;
        valueAnimatorYemenite.addListener(new attabal());
    }

    @Override // com.google.android.material.textfield.graveside
    public void adultoid() {
        AutoCompleteTextView autoCompleteTextView = this.f21249impromptu;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f21249impromptu.setOnDismissListener(null);
        }
    }

    @Override // com.google.android.material.textfield.graveside
    public boolean apical() {
        return this.f21247formularize;
    }

    @Override // com.google.android.material.textfield.graveside
    public void arytenoidectomy(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f21243arytenoidectomy.isEnabled() || polloi.attabal(this.f21249impromptu)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f21255triweekly && !this.f21249impromptu.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            merc();
            polder();
        }
    }

    @Override // com.google.android.material.textfield.graveside
    public void attabal(Editable editable) {
        if (this.f21243arytenoidectomy.isTouchExplorationEnabled() && polloi.attabal(this.f21249impromptu) && !this.f21205wireman.hasFocus()) {
            this.f21249impromptu.dismissDropDown();
        }
        this.f21249impromptu.post(new Runnable() { // from class: com.google.android.material.textfield.arytenoidectomy
            @Override // java.lang.Runnable
            public final void run() {
                monoploid.dovishness(this.f21142kowloon);
            }
        });
    }

    @Override // com.google.android.material.textfield.graveside
    public View.OnClickListener beachfront() {
        return this.f21254taiyuan;
    }

    @Override // com.google.android.material.textfield.graveside
    public boolean cutely() {
        return true;
    }

    @Override // com.google.android.material.textfield.graveside
    public int dern() {
        return bubbles.apical.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.graveside
    public boolean formularize() {
        return true;
    }

    @Override // com.google.android.material.textfield.graveside
    public boolean graveside() {
        return true;
    }

    @Override // com.google.android.material.textfield.graveside
    public boolean impassible() {
        return this.f21255triweekly;
    }

    @Override // com.google.android.material.textfield.graveside
    public AccessibilityManager.TouchExplorationStateChangeListener impromptu() {
        return this.f21242apical;
    }

    public final boolean kattegat() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f21250kowloon;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    @Override // com.google.android.material.textfield.graveside
    public void kowloon(View view, outmarry.rotuma rotumaVar) {
        if (!polloi.attabal(this.f21249impromptu)) {
            rotumaVar.preterite(Spinner.class.getName());
        }
        if (rotumaVar.dent()) {
            rotumaVar.herdbook(null);
        }
    }

    @Override // com.google.android.material.textfield.graveside
    public View.OnFocusChangeListener marial() {
        return this.f21246cutely;
    }

    public final void merc() {
        if (this.f21249impromptu == null) {
            return;
        }
        if (kattegat()) {
            this.f21248impassible = false;
        }
        if (this.f21248impassible) {
            this.f21248impassible = false;
            return;
        }
        supplicat(!this.f21255triweekly);
        if (!this.f21255triweekly) {
            this.f21249impromptu.dismissDropDown();
        } else {
            this.f21249impromptu.requestFocus();
            this.f21249impromptu.showDropDown();
        }
    }

    @Override // com.google.android.material.textfield.graveside
    public void molybdenite() {
        sealless();
        this.f21243arytenoidectomy = (AccessibilityManager) this.f21203dern.getSystemService("accessibility");
    }

    public final void polder() {
        this.f21248impassible = true;
        this.f21250kowloon = SystemClock.uptimeMillis();
    }

    public final void restrictive() {
        this.f21249impromptu.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.apical
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return monoploid.cord(this.f21141kowloon, view, motionEvent);
            }
        });
        this.f21249impromptu.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.formularize
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                monoploid.cuirassed(this.f21201attabal);
            }
        });
        this.f21249impromptu.setThreshold(0);
    }

    public final void supplicat(boolean z) {
        if (this.f21255triweekly != z) {
            this.f21255triweekly = z;
            this.f21253polloi.cancel();
            this.f21252monoploid.start();
        }
    }

    @Override // com.google.android.material.textfield.graveside
    public boolean taiyuan(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.graveside
    public void triweekly(EditText editText) {
        this.f21249impromptu = oilcan(editText);
        restrictive();
        this.f21202attabal.setErrorIconDrawable((Drawable) null);
        if (!polloi.attabal(editText) && this.f21243arytenoidectomy.isTouchExplorationEnabled()) {
            this.f21205wireman.setImportantForAccessibility(2);
        }
        this.f21202attabal.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.graveside
    public int wireman() {
        return bubbles.beachfront.mtrl_dropdown_arrow;
    }

    public final ValueAnimator yemenite(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f21245competently);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.cutely
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                monoploid.rotuma(this.f21165attabal, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }
}
