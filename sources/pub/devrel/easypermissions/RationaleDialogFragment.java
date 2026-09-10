package pub.devrel.easypermissions;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes7.dex */
public class RationaleDialogFragment extends DialogFragment {
    public EasyPermissions.PermissionCallbacks X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public EasyPermissions.RationaleCallbacks f45313Y;
    public boolean Z = false;

    public static RationaleDialogFragment a(String str, String str2, String str3, int i2, int i3, String[] strArr) {
        RationaleDialogFragment rationaleDialogFragment = new RationaleDialogFragment();
        rationaleDialogFragment.setArguments(new RationaleDialogConfig(str, str2, str3, i2, i3, strArr).a());
        return rationaleDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof EasyPermissions.PermissionCallbacks) {
                this.X = (EasyPermissions.PermissionCallbacks) getParentFragment();
            }
            if (getParentFragment() instanceof EasyPermissions.RationaleCallbacks) {
                this.f45313Y = (EasyPermissions.RationaleCallbacks) getParentFragment();
            }
        }
        if (context instanceof EasyPermissions.PermissionCallbacks) {
            this.X = (EasyPermissions.PermissionCallbacks) context;
        }
        if (context instanceof EasyPermissions.RationaleCallbacks) {
            this.f45313Y = (EasyPermissions.RationaleCallbacks) context;
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        RationaleDialogConfig rationaleDialogConfig = new RationaleDialogConfig(getArguments());
        EasyPermissions.PermissionCallbacks permissionCallbacks = this.X;
        EasyPermissions.RationaleCallbacks rationaleCallbacks = this.f45313Y;
        RationaleDialogClickListener rationaleDialogClickListener = new RationaleDialogClickListener();
        rationaleDialogClickListener.X = getActivity();
        rationaleDialogClickListener.f45308Y = rationaleDialogConfig;
        rationaleDialogClickListener.Z = permissionCallbacks;
        rationaleDialogClickListener.e0 = rationaleCallbacks;
        Activity activity = getActivity();
        int i2 = rationaleDialogConfig.f45311c;
        return (i2 > 0 ? new AlertDialog.Builder(activity, i2) : new AlertDialog.Builder(activity)).setCancelable(false).setPositiveButton(rationaleDialogConfig.f45309a, rationaleDialogClickListener).setNegativeButton(rationaleDialogConfig.f45310b, rationaleDialogClickListener).setMessage(rationaleDialogConfig.f45312e).create();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.X = null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        this.Z = true;
        super.onSaveInstanceState(bundle);
    }
}
