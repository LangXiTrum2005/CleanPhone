package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
class TimePickerTextInputKeyController implements TextView.OnEditorActionListener, View.OnKeyListener {
    public final ChipTextInputComboView X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ChipTextInputComboView f19547Y;
    public final TimeModel Z;
    public boolean e0 = false;

    public TimePickerTextInputKeyController(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.X = chipTextInputComboView;
        this.f19547Y = chipTextInputComboView2;
        this.Z = timeModel;
    }

    public final void a(int i2) {
        this.f19547Y.setChecked(i2 == 12);
        this.X.setChecked(i2 == 10);
        this.Z.g0 = i2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        boolean z2 = i2 == 5;
        if (z2) {
            a(12);
        }
        return z2;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (this.e0) {
            return false;
        }
        boolean z2 = true;
        this.e0 = true;
        EditText editText = (EditText) view;
        if (this.Z.g0 != 12) {
            Editable text = editText.getText();
            if (text == null) {
                z2 = false;
            } else if (i2 >= 7 && i2 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                a(12);
            } else {
                if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                    editText.getText().clear();
                }
                z2 = false;
            }
        } else if (i2 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            a(10);
        } else {
            if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                editText.getText().clear();
            }
            z2 = false;
        }
        this.e0 = false;
        return z2;
    }
}
