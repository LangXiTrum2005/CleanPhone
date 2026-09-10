package pub.devrel.easypermissions.helper;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes7.dex */
class LowApiPermissionsHelper<T> extends PermissionHelper<T> {
    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final void a(int i2, String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final Context b() {
        Object obj = this.f45315a;
        if (obj instanceof Activity) {
            return (Context) obj;
        }
        if (obj instanceof Fragment) {
            return ((Fragment) obj).getContext();
        }
        throw new IllegalStateException("Unknown host: " + obj);
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final boolean e(String str) {
        return false;
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final void f(String str, String str2, String str3, int i2, int i3, String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }
}
