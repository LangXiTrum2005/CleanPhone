package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.os.Bundle;
import com.google.android.material.dialog.InsetDialogOnTouchListener;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialStyledDatePickerDialog extends DatePickerDialog {
    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(null);
        getWindow().getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(this, null));
    }
}
