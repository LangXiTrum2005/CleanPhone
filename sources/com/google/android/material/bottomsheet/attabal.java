package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.kowloon;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.czestochowa;
import androidx.core.view.hardpan;
import androidx.core.view.premeiotic;
import androidx.core.view.supplicat;
import bubbles.competently;
import bubbles.formularize;
import chinny.taiyuan;
import com.google.android.material.internal.cuirassed;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import outmarry.rotuma;

/* JADX INFO: compiled from: BottomSheetDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal extends kowloon {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public FrameLayout f19802adultoid;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public boolean f19803cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public boolean f19804cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public CoordinatorLayout f19805dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public FrameLayout f19806gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f19807graveside;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public gown.dern f19808oilcan;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public boolean f19809preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public boolean f19810rotuma;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public beachfront f19811stratoscope;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public boolean f19812trm;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public BottomSheetBehavior.competently f19813yemenite;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class C0296attabal implements supplicat {
        public C0296attabal() {
        }

        @Override // androidx.core.view.supplicat
        public hardpan attabal(View view, hardpan hardpanVar) {
            if (attabal.this.f19811stratoscope != null) {
                attabal.this.f19807graveside.herdbook(attabal.this.f19811stratoscope);
            }
            if (hardpanVar != null) {
                attabal attabalVar = attabal.this;
                attabalVar.f19811stratoscope = new beachfront(attabalVar.f19806gintrap, hardpanVar, null);
                attabal.this.f19811stratoscope.marial(attabal.this.getWindow());
                attabal.this.f19807graveside.dent(attabal.this.f19811stratoscope);
            }
            return hardpanVar;
        }
    }

    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public static class beachfront extends BottomSheetBehavior.competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Boolean f19815attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Window f19816dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final hardpan f19817saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public boolean f19818wireman;

        public /* synthetic */ beachfront(View view, hardpan hardpanVar, C0296attabal c0296attabal) {
            this(view, hardpanVar);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.competently
        public void attabal(View view) {
            wireman(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.competently
        public void dern(View view, int i) {
            wireman(view);
        }

        public void marial(Window window) {
            if (this.f19816dern == window) {
                return;
            }
            this.f19816dern = window;
            if (window != null) {
                this.f19818wireman = czestochowa.attabal(window, window.getDecorView()).saneness();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.competently
        public void saneness(View view, float f) {
            wireman(view);
        }

        public final void wireman(View view) {
            if (view.getTop() < this.f19817saneness.impassible()) {
                Window window = this.f19816dern;
                if (window != null) {
                    Boolean bool = this.f19815attabal;
                    com.google.android.material.internal.marial.beachfront(window, bool == null ? this.f19818wireman : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f19817saneness.impassible() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f19816dern;
                if (window2 != null) {
                    com.google.android.material.internal.marial.beachfront(window2, this.f19818wireman);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public beachfront(View view, hardpan hardpanVar) {
            this.f19817saneness = hardpanVar;
            taiyuan taiyuanVarUnderbelly = BottomSheetBehavior.coi(view).underbelly();
            ColorStateList colorStateListOilcan = taiyuanVarUnderbelly != null ? taiyuanVarUnderbelly.oilcan() : view.getBackgroundTintList();
            if (colorStateListOilcan != null) {
                this.f19815attabal = Boolean.valueOf(pyrope.attabal.impromptu(colorStateListOilcan.getDefaultColor()));
                return;
            }
            Integer numImpromptu = cuirassed.impromptu(view);
            if (numImpromptu != null) {
                this.f19815attabal = Boolean.valueOf(pyrope.attabal.impromptu(numImpromptu.intValue()));
            } else {
                this.f19815attabal = null;
            }
        }
    }

    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class dern extends androidx.core.view.attabal {
        public dern() {
        }

        @Override // androidx.core.view.attabal
        public void competently(View view, rotuma rotumaVar) {
            super.competently(view, rotumaVar);
            if (!attabal.this.f19809preprohormone) {
                rotumaVar.lightstruck(false);
            } else {
                rotumaVar.attabal(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                rotumaVar.lightstruck(true);
            }
        }

        @Override // androidx.core.view.attabal
        public boolean cutely(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                attabal attabalVar = attabal.this;
                if (attabalVar.f19809preprohormone) {
                    attabalVar.cancel();
                    return true;
                }
            }
            return super.cutely(view, i, bundle);
        }
    }

    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class saneness implements View.OnClickListener {
        public saneness() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            attabal attabalVar = attabal.this;
            if (attabalVar.f19809preprohormone && attabalVar.isShowing() && attabal.this.adultoid()) {
                attabal.this.cancel();
            }
        }
    }

    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class wireman implements View.OnTouchListener {
        public wireman() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public attabal(Context context) {
        this(context, 0);
        molybdenite();
    }

    private void molybdenite() {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{bubbles.dern.enableEdgeToEdge});
        this.f19812trm = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int taiyuan(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(bubbles.dern.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : formularize.Theme_Design_Light_BottomSheetDialog;
    }

    public boolean adultoid() {
        if (!this.f19804cuirassed) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f19803cord = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f19804cuirassed = true;
        }
        return this.f19803cord;
    }

    public final FrameLayout arytenoidectomy() {
        if (this.f19802adultoid == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), bubbles.taiyuan.design_bottom_sheet_dialog, null);
            this.f19802adultoid = frameLayout;
            this.f19805dovishness = (CoordinatorLayout) frameLayout.findViewById(competently.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f19802adultoid.findViewById(competently.design_bottom_sheet);
            this.f19806gintrap = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorCoi = BottomSheetBehavior.coi(frameLayout2);
            this.f19807graveside = bottomSheetBehaviorCoi;
            bottomSheetBehaviorCoi.dent(this.f19813yemenite);
            this.f19807graveside.sakeen(this.f19809preprohormone);
            this.f19808oilcan = new gown.dern(this.f19807graveside, this.f19806gintrap);
        }
        return this.f19802adultoid;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorMonoploid = monoploid();
        if (!this.f19810rotuma || bottomSheetBehaviorMonoploid.preterite() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorMonoploid.fastrack(5);
        }
    }

    public final void dovishness() {
        gown.dern dernVar = this.f19808oilcan;
        if (dernVar == null) {
            return;
        }
        if (this.f19809preprohormone) {
            dernVar.dern();
        } else {
            dernVar.beachfront();
        }
    }

    public final View gintrap(int i, View view, ViewGroup.LayoutParams layoutParams) {
        arytenoidectomy();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f19802adultoid.findViewById(competently.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f19812trm) {
            premeiotic.picketboat(this.f19802adultoid, new C0296attabal());
        }
        this.f19806gintrap.removeAllViews();
        if (layoutParams == null) {
            this.f19806gintrap.addView(view);
        } else {
            this.f19806gintrap.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(competently.touch_outside).setOnClickListener(new saneness());
        premeiotic.sayid(this.f19806gintrap, new dern());
        this.f19806gintrap.setOnTouchListener(new wireman());
        return this.f19802adultoid;
    }

    public void graveside() {
        this.f19807graveside.herdbook(this.f19813yemenite);
    }

    public BottomSheetBehavior<FrameLayout> monoploid() {
        if (this.f19807graveside == null) {
            arytenoidectomy();
        }
        return this.f19807graveside;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.f19812trm && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f19802adultoid;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f19805dovishness;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            czestochowa.saneness(window, !z);
            beachfront beachfrontVar = this.f19811stratoscope;
            if (beachfrontVar != null) {
                beachfrontVar.marial(window);
            }
        }
        dovishness();
    }

    @Override // androidx.appcompat.app.kowloon, androidx.p000activity.monoploid, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        beachfront beachfrontVar = this.f19811stratoscope;
        if (beachfrontVar != null) {
            beachfrontVar.marial(null);
        }
        gown.dern dernVar = this.f19808oilcan;
        if (dernVar != null) {
            dernVar.beachfront();
        }
    }

    @Override // androidx.p000activity.monoploid, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f19807graveside;
        if (bottomSheetBehavior == null || bottomSheetBehavior.preterite() != 5) {
            return;
        }
        this.f19807graveside.fastrack(4);
    }

    public boolean polloi() {
        return this.f19810rotuma;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f19809preprohormone != z) {
            this.f19809preprohormone = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f19807graveside;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.sakeen(z);
            }
            if (getWindow() != null) {
                dovishness();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f19809preprohormone) {
            this.f19809preprohormone = true;
        }
        this.f19803cord = z;
        this.f19804cuirassed = true;
    }

    @Override // androidx.appcompat.app.kowloon, androidx.p000activity.monoploid, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(gintrap(i, null, null));
    }

    @Override // androidx.appcompat.app.kowloon, androidx.p000activity.monoploid, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(gintrap(0, view, null));
    }

    public attabal(Context context, int i) {
        super(context, taiyuan(context, i));
        this.f19809preprohormone = true;
        this.f19803cord = true;
        this.f19813yemenite = new marial();
        apical(1);
        molybdenite();
    }

    @Override // androidx.appcompat.app.kowloon, androidx.p000activity.monoploid, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(gintrap(0, view, layoutParams));
    }

    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class marial extends BottomSheetBehavior.competently {
        public marial() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.competently
        public void dern(View view, int i) {
            if (i == 5) {
                attabal.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.competently
        public void saneness(View view, float f) {
        }
    }
}
