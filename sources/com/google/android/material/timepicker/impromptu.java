package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: TimePickerTextInputKeyController.java */
/* JADX INFO: loaded from: classes3.dex */
public class impromptu implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final ChipTextInputComboView f21393arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final ChipTextInputComboView f21394kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final TimeModel f21395monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f21396polloi = false;

    public impromptu(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f21394kowloon = chipTextInputComboView;
        this.f21393arytenoidectomy = chipTextInputComboView2;
        this.f21395monoploid = timeModel;
    }

    public void attabal() {
        TextInputLayout textInputLayoutMarial = this.f21394kowloon.marial();
        TextInputLayout textInputLayoutMarial2 = this.f21393arytenoidectomy.marial();
        EditText editText = textInputLayoutMarial.getEditText();
        EditText editText2 = textInputLayoutMarial2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    public final void dern(int i) {
        this.f21393arytenoidectomy.setChecked(i == 12);
        this.f21394kowloon.setChecked(i == 10);
        this.f21395monoploid.f21340graveside = i;
    }

    public final boolean marial(int i, KeyEvent keyEvent, EditText editText) {
        if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            dern(10);
            return true;
        }
        if (i < 7 || i > 16) {
            return false;
        }
        saneness(editText);
        return false;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            dern(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f21396polloi) {
            return false;
        }
        this.f21396polloi = true;
        EditText editText = (EditText) view;
        boolean zMarial = this.f21395monoploid.f21340graveside == 12 ? marial(i, keyEvent, editText) : wireman(i, keyEvent, editText);
        this.f21396polloi = false;
        return zMarial;
    }

    public final void saneness(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }

    public final boolean wireman(int i, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            dern(12);
            return true;
        }
        if (i >= 7 && i <= 16) {
            saneness(editText);
        }
        return false;
    }
}
