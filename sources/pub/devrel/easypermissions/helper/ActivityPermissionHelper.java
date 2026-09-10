package pub.devrel.easypermissions.helper;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import pub.devrel.easypermissions.RationaleDialogFragment;

/* JADX INFO: loaded from: classes7.dex */
class ActivityPermissionHelper extends PermissionHelper<Activity> {
    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final void a(int i2, String... strArr) {
        ActivityCompat.c((Activity) this.f45315a, strArr, i2);
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final Context b() {
        return (Context) this.f45315a;
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final boolean e(String str) {
        return ActivityCompat.f((Activity) this.f45315a, str);
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final void f(String str, String str2, String str3, int i2, int i3, String... strArr) {
        FragmentManager fragmentManager = ((Activity) this.f45315a).getFragmentManager();
        if (fragmentManager.findFragmentByTag("RationaleDialogFragment") instanceof RationaleDialogFragment) {
            Log.d("ActPermissionHelper", "Found existing fragment, not showing rationale.");
            return;
        }
        RationaleDialogFragment rationaleDialogFragmentA = RationaleDialogFragment.a(str2, str3, str, i2, i3, strArr);
        if ((Build.VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) && !rationaleDialogFragmentA.Z) {
            rationaleDialogFragmentA.show(fragmentManager, "RationaleDialogFragment");
        }
    }
}
