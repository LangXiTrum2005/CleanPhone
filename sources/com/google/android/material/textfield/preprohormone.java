package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public class preprohormone extends graveside {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public EditText f21257beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final View.OnClickListener f21258competently;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f21259marial;

    public preprohormone(molybdenite molybdeniteVar, int i) {
        super(molybdeniteVar);
        this.f21259marial = bubbles.beachfront.design_password_eye;
        this.f21258competently = new View.OnClickListener() { // from class: com.google.android.material.textfield.rotuma
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                preprohormone.dovishness(this.f21260kowloon, view);
            }
        };
        if (i != 0) {
            this.f21259marial = i;
        }
    }

    public static /* synthetic */ void dovishness(preprohormone preprohormoneVar, View view) {
        EditText editText = preprohormoneVar.f21257beachfront;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (preprohormoneVar.gintrap()) {
            preprohormoneVar.f21257beachfront.setTransformationMethod(null);
        } else {
            preprohormoneVar.f21257beachfront.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            preprohormoneVar.f21257beachfront.setSelection(selectionEnd);
        }
        preprohormoneVar.polloi();
    }

    public static boolean rotuma(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.graveside
    public void adultoid() {
        EditText editText = this.f21257beachfront;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.graveside
    public View.OnClickListener beachfront() {
        return this.f21258competently;
    }

    @Override // com.google.android.material.textfield.graveside
    public int dern() {
        return bubbles.apical.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.graveside
    public boolean formularize() {
        return true;
    }

    public final boolean gintrap() {
        EditText editText = this.f21257beachfront;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // com.google.android.material.textfield.graveside
    public boolean impassible() {
        return !gintrap();
    }

    @Override // com.google.android.material.textfield.graveside
    public void molybdenite() {
        if (rotuma(this.f21257beachfront)) {
            this.f21257beachfront.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.graveside
    public void saneness(CharSequence charSequence, int i, int i2, int i3) {
        polloi();
    }

    @Override // com.google.android.material.textfield.graveside
    public void triweekly(EditText editText) {
        this.f21257beachfront = editText;
        polloi();
    }

    @Override // com.google.android.material.textfield.graveside
    public int wireman() {
        return this.f21259marial;
    }
}
