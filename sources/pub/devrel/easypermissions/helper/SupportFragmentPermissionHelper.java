package pub.devrel.easypermissions.helper;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes7.dex */
class SupportFragmentPermissionHelper extends BaseSupportPermissionsHelper<Fragment> {
    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final void a(int i2, String... strArr) {
        ((Fragment) this.f45315a).requestPermissions(strArr, i2);
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final Context b() {
        return ((Fragment) this.f45315a).getActivity();
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final boolean e(String str) {
        return ((Fragment) this.f45315a).shouldShowRequestPermissionRationale(str);
    }

    @Override // pub.devrel.easypermissions.helper.BaseSupportPermissionsHelper
    public final FragmentManager g() {
        return ((Fragment) this.f45315a).getChildFragmentManager();
    }
}
