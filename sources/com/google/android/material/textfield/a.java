package com.google.android.material.textfield;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f19533Y;

    public /* synthetic */ a(EndIconDelegate endIconDelegate, int i2) {
        this.X = i2;
        this.f19533Y = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.X) {
            case 0:
                ClearTextEndIconDelegate clearTextEndIconDelegate = (ClearTextEndIconDelegate) this.f19533Y;
                EditText editText = clearTextEndIconDelegate.f19499i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    clearTextEndIconDelegate.q();
                    break;
                }
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f19533Y).u();
                break;
            default:
                PasswordToggleEndIconDelegate passwordToggleEndIconDelegate = (PasswordToggleEndIconDelegate) this.f19533Y;
                EditText editText2 = passwordToggleEndIconDelegate.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = passwordToggleEndIconDelegate.f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        passwordToggleEndIconDelegate.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        passwordToggleEndIconDelegate.f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        passwordToggleEndIconDelegate.f.setSelection(selectionEnd);
                    }
                    passwordToggleEndIconDelegate.q();
                    break;
                }
                break;
        }
    }
}
