package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes4.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        Dialog dialog = getDialog();
        if (dialog instanceof BottomSheetDialog) {
            BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
            if (bottomSheetDialog.g0 == null) {
                bottomSheetDialog.e();
            }
            boolean z2 = bottomSheetDialog.g0.J0;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        Dialog dialog = getDialog();
        if (dialog instanceof BottomSheetDialog) {
            BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
            if (bottomSheetDialog.g0 == null) {
                bottomSheetDialog.e();
            }
            boolean z2 = bottomSheetDialog.g0.J0;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        int theme = getTheme();
        if (theme == 0) {
            TypedValue typedValue = new TypedValue();
            theme = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context, theme);
        bottomSheetDialog.k0 = true;
        bottomSheetDialog.l0 = true;
        bottomSheetDialog.q0 = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.5
            public AnonymousClass5() {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public final void c(int i2, View view) {
                if (i2 == 5) {
                    BottomSheetDialog.this.cancel();
                }
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public final void b(View view) {
            }
        };
        bottomSheetDialog.c().v(1);
        bottomSheetDialog.o0 = bottomSheetDialog.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        return bottomSheetDialog;
    }

    public class BottomSheetDismissCallback extends BottomSheetBehavior.BottomSheetCallback {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void c(int i2, View view) {
            if (i2 == 5) {
                throw null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void b(View view) {
        }
    }
}
