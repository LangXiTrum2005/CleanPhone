package com.google.android.material.sidesheet;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.sidesheet.SheetCallback;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
abstract class SheetDialog<C extends SheetCallback> extends AppCompatDialog {
    public Sheet g0;
    public FrameLayout h0;
    public FrameLayout i0;
    public boolean j0;
    public boolean k0;
    public MaterialBackOrchestrator l0;

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        g();
        super.cancel();
    }

    public abstract void e(Sheet sheet);

    public final void f() {
        if (this.h0 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.m3_side_sheet_dialog, null);
            this.h0 = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.m3_side_sheet);
            this.i0 = frameLayout2;
            SideSheetBehavior sideSheetBehaviorH = h(frameLayout2);
            this.g0 = sideSheetBehaviorH;
            e(sideSheetBehaviorH);
            this.l0 = new MaterialBackOrchestrator(this.g0, this.i0);
        }
    }

    public Sheet g() {
        if (this.g0 == null) {
            f();
        }
        return this.g0;
    }

    public abstract SideSheetBehavior h(FrameLayout frameLayout);

    public final void i() {
        MaterialBackOrchestrator materialBackOrchestrator = this.l0;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.j0) {
            materialBackOrchestrator.a(false);
        } else {
            materialBackOrchestrator.b();
        }
    }

    public final FrameLayout j(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        f();
        if (this.h0 == null) {
            f();
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.h0.findViewById(R.id.coordinator);
        if (i2 != 0 && view == null) {
            view = getLayoutInflater().inflate(i2, (ViewGroup) coordinatorLayout, false);
        }
        if (this.i0 == null) {
            f();
        }
        FrameLayout frameLayout = this.i0;
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.sidesheet.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SheetDialog sheetDialog = this.X;
                if (sheetDialog.j0 && sheetDialog.isShowing() && sheetDialog.k0) {
                    sheetDialog.cancel();
                }
            }
        });
        if (this.i0 == null) {
            f();
        }
        ViewCompat.z(this.i0, new AccessibilityDelegateCompat() { // from class: com.google.android.material.sidesheet.SheetDialog.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                View.AccessibilityDelegate accessibilityDelegate = this.f4417a;
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                if (!SheetDialog.this.j0) {
                    accessibilityNodeInfo.setDismissable(false);
                } else {
                    accessibilityNodeInfoCompat.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final boolean g(View view2, int i3, Bundle bundle) {
                if (i3 == 1048576) {
                    SheetDialog sheetDialog = SheetDialog.this;
                    if (sheetDialog.j0) {
                        sheetDialog.cancel();
                        return true;
                    }
                }
                return super.g(view2, i3, bundle);
            }
        });
        return this.h0;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        FrameLayout frameLayout;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null && (frameLayout = this.i0) != null && (frameLayout.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            int i2 = ((CoordinatorLayout.LayoutParams) this.i0.getLayoutParams()).f4148c;
            FrameLayout frameLayout2 = this.i0;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            window.setWindowAnimations(Gravity.getAbsoluteGravity(i2, frameLayout2.getLayoutDirection()) == 3 ? R.style.Animation_Material3_SideSheetDialog_Left : R.style.Animation_Material3_SideSheetDialog_Right);
        }
        i();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
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
        super.onDetachedFromWindow();
        MaterialBackOrchestrator materialBackOrchestrator = this.l0;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.b();
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Sheet sheet = this.g0;
        if (sheet == null || sheet.getState() != 5) {
            return;
        }
        this.g0.c(3);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z2) {
        super.setCancelable(z2);
        if (this.j0 != z2) {
            this.j0 = z2;
        }
        if (getWindow() != null) {
            i();
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z2) {
        super.setCanceledOnTouchOutside(z2);
        if (z2 && !this.j0) {
            this.j0 = true;
        }
        this.k0 = z2;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i2) {
        super.setContentView(j(null, i2, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(j(view, 0, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(j(view, 0, layoutParams));
    }
}
