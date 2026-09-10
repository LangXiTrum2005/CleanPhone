package com.google.android.material.bottomsheet;

import A.C0880a0;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    public static final /* synthetic */ int i0 = 0;
    public BottomSheetBehavior e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$2, reason: invalid class name */
    class AnonymousClass2 extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() != 1) {
                return;
            }
            int i2 = BottomSheetDragHandleView.i0;
            throw null;
        }
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.e0;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.Y0.remove((Object) null);
            this.e0.J(null);
        }
        this.e0 = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.J(this);
            int i2 = this.e0.M0;
            if (i2 == 4) {
                this.h0 = true;
            } else if (i2 == 3) {
                this.h0 = false;
            }
            ViewCompat.w(this, AccessibilityNodeInfoCompat.AccessibilityActionCompat.g, new C0880a0(this, 14));
            ArrayList arrayList = this.e0.Y0;
            if (!arrayList.contains(null)) {
                arrayList.add(null);
            }
        }
        c();
    }

    public final void c() {
        this.g0 = this.f0 && this.e0 != null;
        int i2 = this.e0 == null ? 2 : 1;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        setImportantForAccessibility(i2);
        setClickable(this.g0);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        this.f0 = z2;
        c();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).f4146a;
                if (behavior instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$1, reason: invalid class name */
    public class AnonymousClass1 extends BottomSheetBehavior.BottomSheetCallback {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void c(int i2, View view) {
            int i3 = BottomSheetDragHandleView.i0;
            throw null;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void b(View view) {
        }
    }
}
