package pub.devrel.easypermissions;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import pub.devrel.easypermissions.helper.PermissionHelper;

/* JADX INFO: loaded from: classes7.dex */
class RationaleDialogClickListener implements DialogInterface.OnClickListener {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public RationaleDialogConfig f45308Y;
    public EasyPermissions.PermissionCallbacks Z;
    public EasyPermissions.RationaleCallbacks e0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        RationaleDialogConfig rationaleDialogConfig = this.f45308Y;
        int i3 = rationaleDialogConfig.d;
        EasyPermissions.RationaleCallbacks rationaleCallbacks = this.e0;
        if (i2 != -1) {
            if (rationaleCallbacks != null) {
                rationaleCallbacks.b();
            }
            EasyPermissions.PermissionCallbacks permissionCallbacks = this.Z;
            if (permissionCallbacks != null) {
                permissionCallbacks.b(Arrays.asList(rationaleDialogConfig.f));
                return;
            }
            return;
        }
        String[] strArr = rationaleDialogConfig.f;
        if (rationaleCallbacks != null) {
            rationaleCallbacks.a();
        }
        Object obj = this.X;
        if (obj instanceof Fragment) {
            PermissionHelper.d((Fragment) obj).a(i3, strArr);
        } else {
            if (!(obj instanceof Activity)) {
                throw new RuntimeException("Host must be an Activity or Fragment!");
            }
            PermissionHelper.c((Activity) obj).a(i3, strArr);
        }
    }
}
