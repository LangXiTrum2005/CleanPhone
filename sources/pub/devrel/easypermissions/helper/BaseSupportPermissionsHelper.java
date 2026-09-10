package pub.devrel.easypermissions.helper;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import pub.devrel.easypermissions.RationaleDialogFragmentCompat;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseSupportPermissionsHelper<T> extends PermissionHelper<T> {
    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final void f(String str, String str2, String str3, int i2, int i3, String... strArr) {
        FragmentManager fragmentManagerG = g();
        if (fragmentManagerG.C("RationaleDialogFragmentCompat") instanceof RationaleDialogFragmentCompat) {
            Log.d("BSPermissionsHelper", "Found existing fragment, not showing rationale.");
            return;
        }
        RationaleDialogFragmentCompat rationaleDialogFragmentCompatC = RationaleDialogFragmentCompat.c(str, str2, str3, i2, i3, strArr);
        if (fragmentManagerG.M()) {
            return;
        }
        rationaleDialogFragmentCompatC.show(fragmentManagerG, "RationaleDialogFragmentCompat");
    }

    public abstract FragmentManager g();
}
