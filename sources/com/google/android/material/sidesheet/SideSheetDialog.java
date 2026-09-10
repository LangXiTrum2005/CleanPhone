package com.google.android.material.sidesheet;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public class SideSheetDialog extends SheetDialog<SideSheetCallback> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.sidesheet.SideSheetDialog$1] */
    @Override // com.google.android.material.sidesheet.SheetDialog
    public final void e(Sheet sheet) {
        sheet.a(new SideSheetCallback() { // from class: com.google.android.material.sidesheet.SideSheetDialog.1
            @Override // com.google.android.material.sidesheet.SheetCallback
            public final void a(int i2) {
                if (i2 == 5) {
                    SideSheetDialog.this.cancel();
                }
            }
        });
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public final Sheet g() {
        Sheet sheetG = super.g();
        if (sheetG instanceof SideSheetBehavior) {
            return (SideSheetBehavior) sheetG;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public final SideSheetBehavior h(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).f4146a;
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
    }
}
