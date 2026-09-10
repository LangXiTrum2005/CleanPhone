package com.google.android.material.dialog;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AlertDialog;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialAlertDialogBuilder extends AlertDialog.Builder {
    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder a() {
        this.f3317a.k = false;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder b(String str) {
        this.f3317a.f = str;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder c(String str, DialogInterface.OnClickListener onClickListener) {
        super.c(str, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog create() {
        super.create().getWindow().getDecorView();
        throw null;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder d(String str, DialogInterface.OnClickListener onClickListener) {
        super.d(str, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setNegativeButton(int i2, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setPositiveButton(int i2, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setTitle(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setView(View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }
}
