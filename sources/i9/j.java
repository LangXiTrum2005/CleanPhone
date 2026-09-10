package i9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.w;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class j extends w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Dialog f42939q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DialogInterface.OnCancelListener f42940r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AlertDialog f42941s;

    @Override // androidx.fragment.app.w
    public final Dialog E(Bundle bundle) {
        Dialog dialog = this.f42939q;
        if (dialog != null) {
            return dialog;
        }
        this.f4494h = false;
        if (this.f42941s == null) {
            Context context = getContext();
            c0.h(context);
            this.f42941s = new AlertDialog.Builder(context).create();
        }
        return this.f42941s;
    }

    @Override // androidx.fragment.app.w, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f42940r;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
