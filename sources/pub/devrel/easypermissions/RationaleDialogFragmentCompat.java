package pub.devrel.easypermissions;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

/* JADX INFO: loaded from: classes7.dex */
public class RationaleDialogFragmentCompat extends AppCompatDialogFragment {
    public EasyPermissions.PermissionCallbacks X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public EasyPermissions.RationaleCallbacks f45314Y;

    public static RationaleDialogFragmentCompat c(String str, String str2, String str3, int i2, int i3, String[] strArr) {
        RationaleDialogFragmentCompat rationaleDialogFragmentCompat = new RationaleDialogFragmentCompat();
        rationaleDialogFragmentCompat.setArguments(new RationaleDialogConfig(str2, str3, str, i2, i3, strArr).a());
        return rationaleDialogFragmentCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof EasyPermissions.PermissionCallbacks) {
                this.X = (EasyPermissions.PermissionCallbacks) getParentFragment();
            }
            if (getParentFragment() instanceof EasyPermissions.RationaleCallbacks) {
                this.f45314Y = (EasyPermissions.RationaleCallbacks) getParentFragment();
            }
        }
        if (context instanceof EasyPermissions.PermissionCallbacks) {
            this.X = (EasyPermissions.PermissionCallbacks) context;
        }
        if (context instanceof EasyPermissions.RationaleCallbacks) {
            this.f45314Y = (EasyPermissions.RationaleCallbacks) context;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        RationaleDialogConfig rationaleDialogConfig = new RationaleDialogConfig(getArguments());
        EasyPermissions.PermissionCallbacks permissionCallbacks = this.X;
        EasyPermissions.RationaleCallbacks rationaleCallbacks = this.f45314Y;
        RationaleDialogClickListener rationaleDialogClickListener = new RationaleDialogClickListener();
        rationaleDialogClickListener.X = getParentFragment() != null ? getParentFragment() : getActivity();
        rationaleDialogClickListener.f45308Y = rationaleDialogConfig;
        rationaleDialogClickListener.Z = permissionCallbacks;
        rationaleDialogClickListener.e0 = rationaleCallbacks;
        Context context = getContext();
        int i2 = rationaleDialogConfig.f45311c;
        return (i2 > 0 ? new AlertDialog.Builder(context, i2) : new AlertDialog.Builder(context)).a().d(rationaleDialogConfig.f45309a, rationaleDialogClickListener).c(rationaleDialogConfig.f45310b, rationaleDialogClickListener).b(rationaleDialogConfig.f45312e).create();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.X = null;
        this.f45314Y = null;
    }
}
