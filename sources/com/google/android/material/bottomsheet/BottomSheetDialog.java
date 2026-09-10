package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BottomSheetDialog extends AppCompatDialog {
    public BottomSheetBehavior g0;
    public FrameLayout h0;
    public CoordinatorLayout i0;
    public FrameLayout j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public EdgeToEdgeCallback n0;
    public boolean o0;
    public MaterialBackOrchestrator p0;
    public BottomSheetBehavior.BottomSheetCallback q0;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$4, reason: invalid class name */
    class AnonymousClass4 implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public static class EdgeToEdgeCallback extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f19136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WindowInsetsCompat f19137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Window f19138c;
        public boolean d;

        public EdgeToEdgeCallback(View view, WindowInsetsCompat windowInsetsCompat) {
            this.f19137b = windowInsetsCompat;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.E(view).j0;
            ColorStateList colorStateListI = materialShapeDrawable != null ? materialShapeDrawable.X.f19419c : ViewCompat.i(view);
            if (colorStateListI != null) {
                this.f19136a = Boolean.valueOf(MaterialColors.d(colorStateListI.getDefaultColor()));
                return;
            }
            ColorStateList colorStateListD = DrawableUtils.d(view.getBackground());
            Integer numValueOf = colorStateListD != null ? Integer.valueOf(colorStateListD.getDefaultColor()) : null;
            if (numValueOf != null) {
                this.f19136a = Boolean.valueOf(MaterialColors.d(numValueOf.intValue()));
            } else {
                this.f19136a = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void b(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void c(int i2, View view) {
            d(view);
        }

        public final void d(View view) {
            int top2 = view.getTop();
            WindowInsetsCompat windowInsetsCompat = this.f19137b;
            if (top2 < windowInsetsCompat.j()) {
                Window window = this.f19138c;
                if (window != null) {
                    Boolean bool = this.f19136a;
                    new WindowInsetsControllerCompat(window, window.getDecorView()).d(bool == null ? this.d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), windowInsetsCompat.j() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f19138c;
                if (window2 != null) {
                    new WindowInsetsControllerCompat(window2, window2.getDecorView()).d(this.d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void e(Window window) {
            if (this.f19138c == window) {
                return;
            }
            this.f19138c = window;
            if (window != null) {
                this.d = new WindowInsetsControllerCompat(window, window.getDecorView()).b();
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.g0 == null) {
            e();
        }
        super.cancel();
    }

    public final void e() {
        if (this.h0 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.h0 = frameLayout;
            this.i0 = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.h0.findViewById(R.id.design_bottom_sheet);
            this.j0 = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorE = BottomSheetBehavior.E(frameLayout2);
            this.g0 = bottomSheetBehaviorE;
            BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.q0;
            ArrayList arrayList = bottomSheetBehaviorE.Y0;
            if (!arrayList.contains(bottomSheetCallback)) {
                arrayList.add(bottomSheetCallback);
            }
            this.g0.K(this.k0);
            this.p0 = new MaterialBackOrchestrator(this.g0, this.j0);
        }
    }

    public final FrameLayout f(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.h0.findViewById(R.id.coordinator);
        if (i2 != 0 && view == null) {
            view = getLayoutInflater().inflate(i2, (ViewGroup) coordinatorLayout, false);
        }
        if (this.o0) {
            ViewCompat.G(this.j0, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.1
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat d(View view2, WindowInsetsCompat windowInsetsCompat) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    EdgeToEdgeCallback edgeToEdgeCallback = bottomSheetDialog.n0;
                    if (edgeToEdgeCallback != null) {
                        bottomSheetDialog.g0.Y0.remove(edgeToEdgeCallback);
                    }
                    EdgeToEdgeCallback edgeToEdgeCallback2 = new EdgeToEdgeCallback(bottomSheetDialog.j0, windowInsetsCompat);
                    bottomSheetDialog.n0 = edgeToEdgeCallback2;
                    edgeToEdgeCallback2.e(bottomSheetDialog.getWindow());
                    BottomSheetBehavior bottomSheetBehavior = bottomSheetDialog.g0;
                    EdgeToEdgeCallback edgeToEdgeCallback3 = bottomSheetDialog.n0;
                    ArrayList arrayList = bottomSheetBehavior.Y0;
                    if (!arrayList.contains(edgeToEdgeCallback3)) {
                        arrayList.add(edgeToEdgeCallback3);
                    }
                    return windowInsetsCompat;
                }
            });
        }
        this.j0.removeAllViews();
        if (layoutParams == null) {
            this.j0.addView(view);
        } else {
            this.j0.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.k0 && bottomSheetDialog.isShowing()) {
                    if (!bottomSheetDialog.m0) {
                        TypedArray typedArrayObtainStyledAttributes = bottomSheetDialog.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                        bottomSheetDialog.l0 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        bottomSheetDialog.m0 = true;
                    }
                    if (bottomSheetDialog.l0) {
                        bottomSheetDialog.cancel();
                    }
                }
            }
        });
        ViewCompat.z(this.j0, new AccessibilityDelegateCompat() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.3
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                View.AccessibilityDelegate accessibilityDelegate = this.f4417a;
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                if (!BottomSheetDialog.this.k0) {
                    accessibilityNodeInfo.setDismissable(false);
                } else {
                    accessibilityNodeInfoCompat.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final boolean g(View view2, int i3, Bundle bundle) {
                if (i3 == 1048576) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    if (bottomSheetDialog.k0) {
                        bottomSheetDialog.cancel();
                        return true;
                    }
                }
                return super.g(view2, i3, bundle);
            }
        });
        this.j0.setOnTouchListener(new AnonymousClass4());
        return this.h0;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z2 = this.o0 && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.h0;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z2);
            }
            CoordinatorLayout coordinatorLayout = this.i0;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z2);
            }
            WindowCompat.a(window, !z2);
            EdgeToEdgeCallback edgeToEdgeCallback = this.n0;
            if (edgeToEdgeCallback != null) {
                edgeToEdgeCallback.e(window);
            }
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.p0;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.k0) {
            materialBackOrchestrator.a(false);
        } else {
            materialBackOrchestrator.b();
        }
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
    public final void onDetachedFromWindow() {
        EdgeToEdgeCallback edgeToEdgeCallback = this.n0;
        if (edgeToEdgeCallback != null) {
            edgeToEdgeCallback.e(null);
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.p0;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.b();
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.g0;
        if (bottomSheetBehavior == null || bottomSheetBehavior.M0 != 5) {
            return;
        }
        bottomSheetBehavior.c(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z2) {
        MaterialBackOrchestrator materialBackOrchestrator;
        super.setCancelable(z2);
        if (this.k0 != z2) {
            this.k0 = z2;
            BottomSheetBehavior bottomSheetBehavior = this.g0;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.K(z2);
            }
            if (getWindow() == null || (materialBackOrchestrator = this.p0) == null) {
                return;
            }
            if (this.k0) {
                materialBackOrchestrator.a(false);
            } else {
                materialBackOrchestrator.b();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z2) {
        super.setCanceledOnTouchOutside(z2);
        if (z2 && !this.k0) {
            this.k0 = true;
        }
        this.l0 = z2;
        this.m0 = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(int i2) {
        super.setContentView(f(null, i2, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(f(view, 0, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(f(view, 0, layoutParams));
    }
}
