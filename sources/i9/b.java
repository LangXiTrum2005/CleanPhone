package i9;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dialog f42918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f42919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AlertDialog f42920c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f42919b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f42918a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f42920c == null) {
            Activity activity = getActivity();
            c0.h(activity);
            this.f42920c = new AlertDialog.Builder(activity).create();
        }
        return this.f42920c;
    }
}
